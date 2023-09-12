/* 	Program1: Write a Java program that prints the following pattern
 
                          1 2 3 4 5
                          1 2 3 4
                          1 2 3
                          1 2
                          1
 */
class Pattern{
    void display(){
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
class Program6{
    public static void main(String[] args){
        Pattern p1 = new Pattern();
        p1.display();
    }
}
