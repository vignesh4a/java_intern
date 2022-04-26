import java.util.Scanner;

class MinMax{

    public static void main(String [] args){
        int Min = Integer.MAX_VALUE;
        int Max = Integer.MIN_VALUE;
        int val;

        Scanner read = new Scanner(System.in);

        while(true){
            if(read.hasNextInt()){
                val = read.nextInt();
                if(val<Min){
                    Min = val;
                }else if(val>Max){
                    Max= val;
                }        
            }else{
                break;
            }
            
            read.nextLine();
        }
        read.close();

        System.out.println("Min = "+Min+" Max = "+Max);


    }

}