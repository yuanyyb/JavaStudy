package 基础语法练习.异常处理;

public class ScoreException extends Exception {
    public ScoreException(String message) {
        super(message);//将异常内容传入父类，后面可以通过e.getMessage();获取错误原因
    }
    public ScoreException() {
    }
}
