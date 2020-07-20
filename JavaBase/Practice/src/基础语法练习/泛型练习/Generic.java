package 基础语法练习.泛型练习;

public class Generic<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public<T> void show(T t){
        System.out.println(this.getT());
    }

}
