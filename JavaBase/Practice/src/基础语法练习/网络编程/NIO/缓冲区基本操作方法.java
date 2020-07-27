package 基础语法练习.网络编程.NIO;

import java.nio.ByteBuffer;

public class 缓冲区基本操作方法 {
    public static void main(String[] args) {
        //创建缓冲区对象 ByteBuffer
        //获取对象两个方法allocate()  wrap()
        ByteBuffer bb = ByteBuffer.allocate(10);//创建长度为10的字节缓冲区
        //ByteBuffer bb = ByteBuffer.wrap(new byte[]{1,10,22,4,101,99,90});
        byte bData = 2;
        byte[] bDatas = new byte[]{1,99,11,10};
        //
        System.out.println("capacity:"+bb.capacity());
        System.out.println("position:"+bb.position());
        System.out.println("limit:"+bb.limit());
        System.out.println("remaining:"+bb.remaining());
        System.out.println("-----------");
        //bb.position(4);
        bb.put(bDatas);//向缓冲区添加数组
        System.out.println("capacity:"+bb.capacity());
        System.out.println("position:"+bb.position());
        System.out.println("limit:"+bb.limit());
        System.out.println("remaining:"+bb.remaining());
        System.out.println("----------");
        bb.flip();
        for (int i = 0; i < bb.limit(); i++) {
            System.out.println(bb.get());
        }
        System.out.println("----------");
        bb.rewind();
        System.out.println("capacity:"+bb.capacity());
        System.out.println("position:"+bb.position());
        System.out.println("limit:"+bb.limit());
        System.out.println("remaining:"+bb.remaining());
        for (int i = 0; i < bb.limit(); i++) {
            System.out.println(bb.get());
        }
//        bb.put(bData);//向缓冲区添加数据
//        bb.remaining();//获取还可以操作的索引数
//        bb.hasRemaining();//判断是否还有可操作的索引
//        bb.flip();//将缓冲区变换为读模式（position设置为0，limit设置为原来position的位置,也就是具体数据长度-1位置）
//        bb.get();//获取一个字节数据
//        bb.get(bDatas);//将缓冲区中的数据读取到自定义字节数组中
//        bb.get(1);//根据索引位置获取缓冲区数据
        //bb.rewind();//通常用于在读取结束后再次将索引position设置为0和limit设置为数据长度减1,用于再次读取
//        bb.clear();//将缓冲区置为写模式，position设置为0，limit设置为capacity
        //bb.array();//获取数据数组

    }
}
