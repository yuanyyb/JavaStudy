package Test5_3.Test02;

public class Mouse implements UsbInterface {

    @Override
    public void open() {
        System.out.println("连接鼠标的USB");
    }

    @Override
    public void close() {
        System.out.println("断开鼠标的USB");
    }
}
