class PaintJob{
    public static void main(String [] args){

       System.out.println( getBucketCount(3.4, 2.1, 1.5, 2));;
    }

    public static int getBucketCount(double width , double height , double areaPerBucket, int extraBucket){

        if(width<1 || height <1 || areaPerBucket <1 || extraBucket<0){
            return -1;
        }

        double area = width*height;
        double totalAreaCovered = areaPerBucket*extraBucket;

        double remainingArea = area - totalAreaCovered;

        int bucketRequired = (int)Math.ceil(remainingArea/areaPerBucket);
    
        return bucketRequired;
    }

    
}