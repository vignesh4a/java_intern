import java.util.Scanner;

class UdemyReader{

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        if(scanner.hasNextInt()){
        System.out.println("Enter Your Year of Birth : ");
        int YOB = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your Name : ");
        String name = scanner.nextLine();
        
        System.out.println("Hello "+name+" you are "+(2021-YOB)+" year old.");
    }
    else{
        
    }

        scanner.close();

        
    }
}