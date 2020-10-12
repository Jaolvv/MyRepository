package Studying;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random r = new Random();
        int Number = r.nextInt(10) +1;

        Scanner s = new Scanner(System.in);

        int count=0;

        while (true){

            System.out.println("Enter your GUESS number:");
            int guessNumber = s.nextInt();
            count++;

            if(guessNumber > Number){
                System.out.println("大于目标");
            }else if(guessNumber < Number){
                System.out.println("小于目标");
            }else if(guessNumber == Number){
                System.out.println("恭喜你猜对了！");
                break;
            }else {
                System.out.println("请输入1-10之间的数字");
            }

        }//while
        System.out.println("你一共猜测了 "+count+" 次");
    }
}
