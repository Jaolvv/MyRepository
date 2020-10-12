package Studying;

public class BreakContinueExample {
    public static void main(String[] args) {
        int i,j;
        //outerLoop
        for(i=0;i < 100;i++){
            //innerLoop
            for(j=0;j < 100;j++){
                if(j==50 && i==50){
                    break;
                }
            }
        }
        System.out.println("Loop have been terminated");
    }
}
