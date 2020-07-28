package 基础语法练习.网络编程.NIO方式搭建http服务器;

import com.sun.source.tree.ReturnTree;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.HashMap;

public class HttpResponse {
    private String version;//协议版本
    private String status;//状态码
    private String desc;//描述
    private HashMap<String, String> hm = new HashMap<>();//响应头数据
    private HttpRequest httpRequest;//请求对象
    public static final String WEB_RESOUCE_PATH = "Practice\\src\\基础语法练习\\网络编程\\NIO方式搭建http服务器\\Resouce";

    //给浏览器相应数据的方法
    public void sendStaticResouce(SelectionKey key) {
        //1.给响应行赋值
        this.version = "HTTP/1.1";
        this.status = "200";
        this.desc = "ok";

        //3.给相应头赋值
        String uriStr = this.getHttpRequest().getRequestURI();
        if (uriStr != null) {
            File file = new File(WEB_RESOUCE_PATH + uriStr);
            if (!file.exists()) {
                this.status = "404";
                this.desc = "NOT FOUND";
            }
            if ("200".equals(this.status)) {
                if (uriStr != null) {
                    if ("/".equals(uriStr)) {
                        hm.put("Content-Type", "text/html;charset=UTF-8");
                    } else if ("/favicon.ico".equals(uriStr)) {
                        hm.put("Content-Type", "image/x-icon");
                    } else if ("/i.jpg".equals(uriStr)) {
                        hm.put("Content-Type", "image/jpeg");
                    } else if ("/1.png".equals(uriStr)) {
                        hm.put("Content-Type", "image/png");
                    }
                }
            } else {
                hm.put("Content-Type", "text/html;charset=UTF-8");
            }
        }
        //2.将响应行拼接成一个单独字符串
        String responseLine = this.version + " " + this.status + " " + this.desc + "\r\n";
        //4.将所有的相应头拼接成一个单独的字符串
        StringBuilder sb = new StringBuilder();
        hm.entrySet().stream().forEach((a) -> {
            sb.append(a.getKey()).append(": ").append(a.getValue()).append("\r\n");
        });
        //5.响应空行
        String emptyLine = "\r\n";
        try {
            //7.响应行，响应头，空行拼成一个大字符串
            String responseStr = responseLine + sb.toString() + emptyLine;
            SocketChannel sc = (SocketChannel) key.channel();
            ByteBuffer responseBb = ByteBuffer.wrap(responseStr.getBytes());
            sc.write(responseBb);
            //8.单独操作响应体（响应体可能是字符串或文件）
            byte[] bytes = getContent();
            ByteBuffer responseBodyBb = ByteBuffer.wrap(bytes);
            sc.write(responseBodyBb);
            //9.释放资源
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    //根据请求的uri获取数据字节数组
    private byte[] getContent() {
        byte[] res = null;
        try {
            String uriStr = this.getHttpRequest().getRequestURI();
            if (uriStr != null) {
                if ("200".equals(this.getStatus())) {
                    if ("/".equals(uriStr)) {
                        res = "此文字是服务器响应给客户端的文本内容".getBytes();
                    } else /*if ("/favicon.ico".equals(uriStr))*/ {
                        FileInputStream fis = new FileInputStream(WEB_RESOUCE_PATH + uriStr);
                        res = IOUtils.toByteArray(fis);
                    }
                }else{
                    res = "访问的资源不存在".getBytes();
                }
            }
        } catch (IOException e) {
            res = new byte[0];
            e.printStackTrace();
        }
        return res;
    }


    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public HashMap<String, String> getHm() {
        return hm;
    }

    public void setHm(HashMap<String, String> hm) {
        this.hm = hm;
    }

    public HttpRequest getHttpRequest() {
        return httpRequest;
    }

    public void setHttpRequest(HttpRequest httpRequest) {
        this.httpRequest = httpRequest;
    }

    @Override
    public String toString() {
        return "HttpResponse{" +
                "version='" + version + '\'' +
                ", status='" + status + '\'' +
                ", desc='" + desc + '\'' +
                ", hm=" + hm +
                ", httpRequest=" + httpRequest +
                '}';
    }
}
