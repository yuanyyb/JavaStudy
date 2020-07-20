package Test5_3.Test02;

public class NoteBook  {
    public void start(){
        System.out.println("笔记本开机");
    }

    public void end(){
        System.out.println("笔记本关机");
    }

    public void controlDevice(UsbInterface d){
        d.open();
        d.close();
    }
}
