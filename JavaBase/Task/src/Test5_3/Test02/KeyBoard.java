package Test5_3.Test02;

public class KeyBoard implements UsbInterface {

    @Override
    public void open() {
        System.out.println("连接键盘的USB");
    }

    @Override
    public void close() {
        System.out.println("断开键盘的USB");
    }
}
