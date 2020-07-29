package 基础语法练习.网络编程.Http服务器简单实现Test;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.HashMap;
import java.util.stream.Stream;

//用于封装请求内容
public class HttpRequest {
    private String method;
    private String requestURI;
    private String version;
    private HashMap<String, String> hm = new HashMap<>();

    //获取请求数据
    public void parse(SelectionKey key) {
        try {
            SocketChannel sc = (SocketChannel) key.channel();
            ByteBuffer bb = ByteBuffer.allocate(1024);
            int len;
            StringBuilder sb = new StringBuilder();
            while ((len = sc.read(bb)) > 0) {
                bb.flip();
                sb.append(new String(bb.array(), 0, len));
                bb.clear();
            }
            parseHttpRequest(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //解析请求数据
    public void parseHttpRequest(StringBuilder sb) {
        String httpRequestStr = sb.toString();
        if (!(httpRequestStr == null || "".equals(httpRequestStr))) {
            String[] splits = httpRequestStr.split("\r\n");
            //解析请求行
            String httpRequestLineStr = splits[0];
            String[] lineSplits = httpRequestLineStr.split(" ");
            this.method = lineSplits[0];
            this.requestURI = lineSplits[1];
            this.version = lineSplits[2];
            //解析请求头
            for (int i = 1; i < splits.length; i++) {
                String headStr = splits[i];
                String[] headSplits = headStr.split(": ");
                this.hm.put(headSplits[0],headSplits[1]);
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
