package 基础语法练习.基础加强.http服务器改写;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.HashMap;

public class HttpRequest {
    private String method;
    private String requestURI;
    private String version;
    private HashMap<String,String> hm = new HashMap<>();
    private SelectionKey key;

    public HttpRequest(SelectionKey key) {
        this.key = key;
    }

    //获取响应数据
    public void parse(){
        try {
            SocketChannel sc = (SocketChannel) key.channel();
            ByteBuffer bb = ByteBuffer.allocate(1024);
            int len;
            StringBuilder sb = new StringBuilder();
            while((len = sc.read(bb))>0){
                bb.flip();
                sb.append(new String(bb.array(),0,len));
                bb.clear();
            }
            parseHttpRequest(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //解析响应数据(给当前对象成员变量赋值)
    private void parseHttpRequest(StringBuilder sb){
        String requestStr = sb.toString();
        if(requestStr!=null&&!"".equals(requestStr)) {
            String[] requestStrArr = requestStr.split("\r\n");
            String requestLine = requestStrArr[0];
            String[] requestLineArr = requestLine.split(" ");
            this.method = requestLineArr[0];
            this.requestURI = requestLineArr[1];
            this.version = requestLineArr[2];
            for (int i = 1; i < requestStrArr.length; i++) {
                String headLine = requestStrArr[i];
                String[] headLineArr = headLine.split(": ");
                hm.put(headLineArr[0], headLineArr[1]);
            }
        }
    }

    @Override
    public String toString() {
        return "HttpRequest{" +
                "method='" + method + '\'' +
                ", requestURI='" + requestURI + '\'' +
                ", version='" + version + '\'' +
                ", hm=" + hm +
                '}';
    }

    public HttpRequest() {
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getRequestURI() {
        return requestURI;
    }

    public void setRequestURI(String requestURI) {
        this.requestURI = requestURI;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public HashMap<String, String> getHm() {
        return hm;
    }

    public void setHm(HashMap<String, String> hm) {
        this.hm = hm;
    }
}
