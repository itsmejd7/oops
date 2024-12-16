package F;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
int ch=0;
float num1,num2,num3,num4; 
Scanner input=new Scanner(System.in);

System.out.println("Enter First Number :");
num1=input.nextFloat();
num2=input.nextFloat(); 
Complex CO1=new Complex(num1,num2);

System.out.println("Enter Second Number:");
num3=input.nextFloat();
num4=input.nextFloat(); 
Complex CO2=new Complex(num3,num4);

Complex CO3=new Complex();

do
{
System.out.println("\n----------MENU----------");
System.out.println(" 1.Add");
System.out.println(" 2.Subtract");
System.out.println(" 3.Multiply");
System.out.println(" 4.Divide");
System.out.println(" 5.Exit");
System.out.println(" Enter Your Choice");
ch=input.nextInt();
switch(ch)
{
case 1:
CO3.Add(CO1,CO2);
break;
case 2:
CO3.Sub(CO1,CO2);
break;
case 3:
CO3.Multiply(CO1,CO2);
break;
case 4:
CO3.Divide(CO1,CO2);
break;
case 5:
System.out.println("\n Wrong Choice!!!");
return;
} //switch end
}while(ch!=5); //do-while end
}
} //main end

