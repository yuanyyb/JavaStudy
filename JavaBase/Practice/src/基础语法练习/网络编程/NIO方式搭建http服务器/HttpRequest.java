package 基础语法练习.网络编程.NIO方式搭建http服务器;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.HashMap;

/*用于封装请求数据*/
public class HttpRequest {
    private String method;//请求方式
    private String requestURI;//请求uri
    private String version;//http协议版本
    private HashMap<String,String> hm = new HashMap<>();//所有请求头

    //获取请求数据
    public void parse(SelectionKey key){
        try {
            SocketChannel readSc = (SocketChannel) key.channel();
            ByteBuffer bb = ByteBuffer.allocate(1024);
            int len;
            StringBuilder sb=new StringBuilder();
            while((len=readSc.read(bb))>0){
                bb.flip();
                sb.append(new String(bb.array(),0,len));
                bb.clear();
            }
            parseHttpRequest(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //解析获取到的数据
    private void parseHttpRequest(StringBuilder sb) {
        String httpRequestStr = sb.toString();
        if(!(httpRequestStr==null||"".equals(httpRequestStr))) {
            String[] split = httpRequestStr.split("\r\n");
            //获取请求行
            String httpRequestLine = split[0];// GET / HTTP/1.0
            //按空格拆分获取请求行的3部分
            String[] httpRequestInfo = httpRequestLine.split(" ");
            this.method = httpRequestInfo[0];
            this.requestURI = httpRequestInfo[1];
            this.version = httpRequestInfo[2];
            //获取所有请求头
            for (int i = 1; i < split.length; i++) {//从1开始，0索引是请求行
                String httpRequestHeaderInfo = split[i];
                String[] httpRequestHeaderInfoArr = httpRequestHeaderInfo.split(": ");//用: 拆分
                this.hm.put(httpRequestHeaderInfoArr[0], httpRequestHeaderInfoArr[1]);
            }
        }
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

    @Override
    public String toString() {
        return "HttpRequest{" +
                "method='" + method + '\'' +
                ", requestURI='" + requestURI + '\'' +
                ", version='" + version + '\'' +
                ", hm=" + hm +
                '}';
    }
}
