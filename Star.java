class Star{
    public static void main(String [] args){
        printSquareStar(5);
    }

    public static void printSquareStar(int val){
        if(val<5){
            System.out.println("Invalid");
        }

        else{
            for(int i = 0; i<val ; i++){
                for(int j = 0; j<val ;j++){
                    if((j==i)||(j==0)||(i==0)||(j==val-1)||(i==val-1)||(i+j==val-1)){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");
            }
        }
    }
}