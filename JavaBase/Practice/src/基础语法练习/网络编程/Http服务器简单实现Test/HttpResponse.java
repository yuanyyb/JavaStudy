package 基础语法练习.网络编程.Http服务器简单实现Test;

import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.HashMap;

public class HttpResponse {
    private String version;
    private String status;
    private String des;
    private HashMap<String, String> hm = new HashMap<>();
    private HttpRequest httpRequest;
    private static final String WEB_FILE_PATH = "Practice\\src\\基础语法练习\\网络编程\\Http服务器简单实现Test\\FileDir";

    public void sendStaticResouce(SelectionKey key) {
        this.version = "HTTP/1.1";
        this.status = "200";
        this.des = "ok";
        String requestURI = this.getHttpRequest().getRequestURI();
        File file = new File(WEB_FILE_PATH + requestURI);
        if (!file.exists()) {
            this.status = "404";
            this.des = "NOT FOUND";
        }
        if("200".equals(this.status)) {
            if ("/".equals(requestURI)) {
                hm.put("Content-Type", "text/html;charset=UTF-8");
            } else if ("/1.jpg".equals(requestURI)) {
                hm.put("Content-Type", "image/jpeg");
            } else if ("/1.png".equals(requestURI)) {
                hm.put("Content-Type", "image/png");
            } else if ("/favicon.ico".equals(requestURI)) {
                hm.put("Content-Type", "image/x-icon");
            }
        }else{
            hm.put("Content-Type", "text/html;charset=UTF-8");
        }
        String responseLineStr = this.version + " " + this.status + " " + this.des + "\r\n";
        StringBuilder sb = new StringBuilder();
        hm.entrySet().stream().forEach(a -> {
            sb.append(a.getKey()).append(": ").append(a.getValue()).append("\r\n");
        });
        String emptyLineStr = "\r\n";
        String responseHeadStr = sb.toString();
        //拼接响应行 响应头 响应空行字符串
        String responseStr = responseLineStr + responseHeadStr + emptyLineStr;
        //System.out.println(responseStr);
        try {
            SocketChannel sc = (SocketChannel) key.channel();
            ByteBuffer bb = ByteBuffer.wrap(responseStr.getBytes());
            sc.write(bb);
            //额外处理响应体(文本字符串/图片/文件)
            byte[] responseBodyArr = getContent();
            ByteBuffer responseBodyBb = ByteBuffer.wrap(responseBodyArr);
            sc.write(responseBodyBb);
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private byte[] getContent() {
        byte[] bytes = new byte[0];
        String requestURI = this.getHttpRequest().getRequestURI();
        if (requestURI != null) {
            try {
                if("200".equals(this.status)) {
                    if ("/".equals(requestURI)) {
                        bytes = "这是服务器默认返回文字内容！".getBytes();
                    } else {
                        FileInputStream fis = new FileInputStream(WEB_FILE_PATH + requestURI);
                        bytes = IOUtils.toByteArray(fis);
                    }
                }else{
                    bytes = "请求的资源不存在！".getBytes();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return bytes;
    }


    @Override
    public String toString() {
        return "HttpResponse{" +
                "version='" + version + '\'' +
                ", status='" + status + '\'' +
                ", des='" + des + '\'' +
                ", hm=" + hm +
                ", httpRequest=" + httpRequest +
                '}';
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

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
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


}
