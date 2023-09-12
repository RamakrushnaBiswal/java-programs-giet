class Divint{
	int i;
	void display(){
	for(i=1;i<=100;i++){
		if(i%2==0 && i%5==0)
			System.out.println(i);
		}	
	}
}
class Printdiv{
	public static void main(String arg[]){
	Divint ob1=new Divint();
	ob1.display();	
    }
}

