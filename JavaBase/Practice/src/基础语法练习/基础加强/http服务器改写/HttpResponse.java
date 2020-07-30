package 基础语法练习.基础加强.http服务器改写;

import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.HashMap;


public class HttpResponse {
    private String version;
    private String status;
    private String desc;
    private HttpRequest httpRequest;
    private HashMap<String, String> hm = new HashMap<>();
    private SelectionKey key;

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
        hm.put("Content-Type",contentType);
    }

    private String contentType;
    private static final String WEB_FILE_PATH = "Practice\\src\\基础语法练习\\基础加强\\http服务器改写\\FileDir";

    public HttpResponse(SelectionKey key) {
        this.key = key;
    }

    public void sendStaticData() {
        //获取响应头
        this.version = "HTTP/1.1";
        this.status = "200";
        this.desc = "ok";
        String requestURI = this.getHttpRequest().getRequestURI();
        File file = new File(WEB_FILE_PATH + requestURI);
        if (!file.exists()) {
            this.status = "404";
            this.desc = "NOT FOUND";
        }
        String responseLine = this.version + " " + this.status + " " + this.desc + "\r\n";
        if ("200".equals(this.status)) {
            if ("/".equals(requestURI)) {
                hm.put("Content-Type", "text/html;charset=UTF-8");
            } else if ("/favicon.ico".equals(requestURI)) {
                hm.put("Content-Type", "image/x-icon");
            } else if ("/1.jpg".equals(requestURI)) {
                hm.put("Content-Type", "image/jpeg");
            } else if ("/1.png".equals(requestURI)) {
                hm.put("Content-Type", "image/png");
            }
        } else {
            hm.put("Content-Type", "text/html;charset=UTF-8");
        }


        StringBuilder sb = new StringBuilder();
        hm.entrySet().stream().forEach(a -> {
            sb.append(a.getKey()).append(": ").append(a.getValue()).append("\r\n");
        });
        String responseHeadStr = sb.toString();
        String emptyLine = "\r\n";
        String responseStr = responseLine + responseHeadStr + emptyLine;
        SocketChannel sc = null;
        try {
            sc = (SocketChannel) key.channel();
            ByteBuffer bb = ByteBuffer.wrap(responseStr.getBytes());
            sc.write(bb);
            //响应体单独处理
            byte[] bytes = getContent();
            ByteBuffer bodyBb = ByteBuffer.wrap(bytes);
            sc.write(bodyBb);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sc != null) {
                try {
                    sc.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void write(String content){

    }
    private byte[] getContent() {
        byte[] res = new byte[0];
        String requestURI = this.getHttpRequest().getRequestURI();
        if ("200".equals(this.status)) {
            if ("/".equals(requestURI)) {
                res = "服务器默认返回的值".getBytes();
            } else {
                try {
                    FileInputStream fis = new FileInputStream(WEB_FILE_PATH + requestURI);
                    res = IOUtils.toByteArray(fis);
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            res = "请求的资源不存在".getBytes();
        }
        return res;
    }

    @Override
    public String toString() {
        return "HttpResponse{" +
                "version='" + version + '\'' +
                ", status='" + status + '\'' +
                ", desc='" + desc + '\'' +
                ", httpRequest=" + httpRequest +
                ", hm=" + hm +
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public HttpRequest getHttpRequest() {
        return httpRequest;
    }

    public void setHttpRequest(HttpRequest httpRequest) {
        this.httpRequest = httpRequest;
    }

    public HashMap<String, String> getHm() {
        return hm;
    }

    public void setHm(HashMap<String, String> hm) {
        this.hm = hm;
    }
}
