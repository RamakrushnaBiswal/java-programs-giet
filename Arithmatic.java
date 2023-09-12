class Addition {
  int a = 20, b = 30;
  int c = a + b;

  int displayAdd() {
    return c;
  }
}
class Substraction{
	  int p = 50, q = 30,s=10;
          int r = p - q -s;
	  
	  int displaySubs(){
		return r;
	}
}
class Multiplication{
    int a1=2,a2=3;
    int a3=a1*a2;
    int displayMult(){
        return a3;
    }
}
class Division{
    int d1=20;
    int d2=d1/2;

    int displayDiv() {
        return d2;  
    }
}
class Module{
    int m1=31;
    int m2=m1%2;
    int displayMod(){
        return m2;
    }
}

class Arithmatic {
  public static void main(String args[]) {
    Addition obj1 = new Addition();
    System.out.println("a+b="+obj1.displayAdd());
    Substraction obj2 = new Substraction();
    System.out.println("p-q-s="+obj2.displaySubs());
    Multiplication obj3 = new Multiplication();
    System.out.println("a1*a2="+obj3.displayMult());
    Division obj4 = new Division();
    System.out.println("d1/2="+obj4.displayDiv());
    Module obj5 = new Module();
    System.out.println("m1%2="+obj5.displayMod());
  }
}