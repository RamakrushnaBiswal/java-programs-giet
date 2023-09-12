class Prog2{
    int a=100;
    float b=200.56f;
    String s1="GVSM";
    void Pro(){
        System.out.println(a+b+s1);
        System.out.println(a+s1+b);
        System.out.println(a+b);
        System.out.println(s1+a+b);
        System.out.println(b+s1);
        System.out.println(s1+b);
    }
}
class Prog2Main {
    public static void main(String[] args){
        Prog2 p1 = new Prog2();
            p1.Pro();
    }    
}
