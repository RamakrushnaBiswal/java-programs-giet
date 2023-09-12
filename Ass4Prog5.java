import java.util.*;
class University
{
    String uname;
    int  uid;
    float fees;
    void University(String uname , int uid ,float fees)
 {
   this.uname=uname;
   this.uid=uid;
   this.fees=fees;
 }
    void University(int uid,String uname)
{
   this.uid=uid;
   this.uname=uname;
}

   void d1(String uname,int uid,float fees)
{
  System.out.println("university name:"+uname);
   System.out.println("university id:"+uid);
   System.out.println("university fees:"+fees);
}

void d1(String uname,int uid,float fees)
{
System.out.println("university name:"+uname);
   System.out.println("university id:"+uid);
   System.out.println("university fees:"+fees);
}
   void d1(String uname,int uid,float fees)
{
    System.out.println("university name:"+uname);
    System.out.println("university id:"+uid);
    System.out.println("university fees:"+fees);
}
}

class Ass4Prog5
{
   public static void main(String ue[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the uname");
    String s1 = sc.next();
     System.out.println("enter the uid");
    int i1 =sc.nextInt();
    System.out.println("enter the ufees");
    float f1 = sc.nextFloat(); 
    System.out.println("enter the unmae");
    String s2 = sc.next();
    System.out.println("enter the uid");
   int i2=sc.nextInt();
    System.out.println("enter the ufees");
     float f2= sc.nextFloat();

System.out.println("enter the unmae");
    String s3= sc.next();
     System.out.println("enter the uid");
   int i3=sc.nextInt();
    
    University ob = new University();
    ob.d1();
       University ob1= new University();
       ob1.d1(s1,i1,f1);
          University ob2 = new University();
        ob2.d1(s2,i2,f2);
       University ob3= new University();
        ob3.d1(s3,i2,f2);
   }
}

