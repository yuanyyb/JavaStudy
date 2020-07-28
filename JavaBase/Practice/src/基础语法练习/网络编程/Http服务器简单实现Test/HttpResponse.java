package 基础语法练习.网络编程.Http服务器简单实现Test;

import java.nio.channels.SelectionKey;
import java.util.HashMap;

public class HttpResponse {
    private String version;
    private String status;
    private String des;
    private HashMap<String,String> hm = new HashMap<>();
    private HttpRequest httpRequest;

    public void sendStaticResouce(SelectionKey selector) {
        this.version = "HTTP/1.1";
        this.status = "200";
        this.des ="ok";
        String requestURI = this.getHttpRequest().getRequestURI();
        if("/".equals(requestURI)){
            hm.put("Content-Type","text/html;chaset=UTF-8");
        }
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
