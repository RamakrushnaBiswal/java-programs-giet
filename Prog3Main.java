class Prog3{
    int i1=10;
    int i2=20;
    void Pro(){  
        System.out.println("i1 and i2="+(i1&i2));
        System.out.println("!true="+true);
        System.out.println("i1="+(i1++));
        System.out.println("i1="+(++i1));
        //System.out.println("i1="+(++(++i1)));
        System.out.println("i2="+(i2++));
    } 
}
 class Prog3Main{
    public static void main(String[] arg){
    Prog3 o1=new Prog3();
    o1.Pro();
    }
}