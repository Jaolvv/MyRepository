package Studying;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        //创建对象
        Random r = new Random();

        //for循环获取10个数
        for(int i=0;i<10;i++){
            int number = r.nextInt(10);
            System.out.println("Number:"+number);
        }
    }
}
