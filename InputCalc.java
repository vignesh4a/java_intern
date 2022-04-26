import java.util.Scanner;

class InputCalc{
    public static void main(String [] args){
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner read = new Scanner(System.in);

        int sum = 0;
        long avg = 0;
        int count = 0;

        while(true){
            if(read.hasNextInt()){
                count++;
                sum += read.nextInt();
            }else{
                break;
            }
        }

        read.close();
        System.out.println("SUM = "+sum+" Avg = "+(double)sum/count+" "+count);
    }
}