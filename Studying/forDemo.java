package Studying;

//求1-100之间的偶数的和
public class forDemo {
    public static void main(String[] args) {
        //while
//        int i =0;
//        int sum = 0;
//        while(i<=100){
//            i++;
//            if(i%2==0){
//                sum=sum+i;
//            }
//        }

        //do..while
//        int sum = 0;
//        int i =0;
//        do {
//            i++;
//            if(i%2==0){
//                sum = sum+i;
//            }
//        }while (i<=100);{
//            System.out.println(sum);
//        }

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }


        System.out.println(sum);
    }
}
