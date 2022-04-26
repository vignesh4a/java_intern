import java.util.Scanner;

class Reading{
    public static void main(String [] args){

        Scanner read = new Scanner(System.in);

        
        int sum = 0;

        for(int i=0;i<5;i++){
            if(read.hasNextInt()){
                sum += read.nextInt();
            }
            else{
                System.out.println("Invalid Number");
                
            }
            read.nextLine();
        }
        System.out.println("Sum = "+sum);
        
        read.close();
    }

}