class UdemyLoops{

    public static void main(String [] args){
        numberToWords(1235);
    }
    public static int getDigitCount(int num){
        
        if(num<1){
            return -1;
        }

        int count;

        for(count = 0; num!=0; count++, num/=10);

        return count;
    }

    public static int reverse(int num){
        if(num<1){
            return -1;
        }

        int temp = 0;

        while(num>0){
            temp += num%10;
            temp *= 10;
            num /= 10;
        }

        return temp/10;
    }

    public static void numberToWords(int num){
        if(num<1){
            System.out.println("Invalid Value");
        }
        else{

            int rev = reverse(num);

            String [] words = new String[] {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
            
            while(rev>0){
                System.out.print(words[rev%10]+" ");
                rev/=10;
            }
        }
    }

   
}