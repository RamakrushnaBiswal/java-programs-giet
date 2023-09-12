class Rev {
    int num=12345;
    int displayRevNum(){
        int reversedNumber = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }
    return reversedNumber;
    }
    
}
class Reversenum {
    public static void main(String args[]){
    Rev obj1 = new Rev();
        System.out.println("REVERSE IS " + obj1.displayRevNum());
    }
    
}