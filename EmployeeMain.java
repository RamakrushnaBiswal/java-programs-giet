class Employee{
static String org ="GIETU";
int empid=100;
String empName;
double salary;
void Employee()
{
this.empid=101;
this.empName="Bunty";
this.salary=40000.00;
}
void Employee(String empName,double salary)
{
this.empName=empName;
this.salary=salary;
}
int Employee(int empid,double salary)
{
this.empid=empid;
this.salary=salary;
}
{
int Employee(int empid, String empName,double salary)
{
this.empid=empid;
this.empName=empName;
this.salary=salary;
}
void display()
{
System.out.println("Employee id="+empid);
System.out.println("Employee name="+empName);
System.out.println("Employee salary="+salary);
}
}
class Employeemain{
public static void main(String args[])
{
Employee e1=new Employee();
Employee e2=new Employee("uma",40000.00);
Employee e3=new Employee( 201,"sankar",50000.00);
e1.display();
e2.display();
e3.display();


}
}