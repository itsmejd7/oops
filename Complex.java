package F;
import java.util.Scanner;

class Complex
{
private float real;
private float img;

Complex()
{
real=0;
img=0;
}

Complex(float real,float img)
{
this.real=real;
this.img=img;
}
public void Add(Complex c1,Complex c2)
{
float areal,aimg;
areal=(c1.real+c2.real);
aimg=(c1.img+c2.img);
System.out.println("Additon Is :"+areal+"+"+aimg+"i");
} 

public void Sub(Complex c1,Complex c2)
{
float sreal,simg;
sreal=(c1.real-c2.real);
simg=(c1.img-c2.img);
System.out.println("Substraction Is :"+sreal+"+("+simg+")si");
} 

public void Multiply(Complex c1,Complex c2)
{
float mreal,mimg;
mreal=(c1.real*c2.real-c1.img*c2.img);
mimg=(c1.real*c2.img+c2.real*c1.img);
System.out.println("Multiplication Is :"+mreal+"+"+mimg+"i");
} 


void Divide(Complex c1,Complex c2)
{
float dreal,dimg,deno;
deno=(c2.real*c2.real+c2.img*c2.img);
dreal=(c1.real*c2.real+c1.img*c2.img)/deno;
dimg=(c2.real*c1.img-c1.real*c2.img)/deno;
System.out.println("Division Is:"+real+ "/"+deno+ "+" +img+ "i"+"/"+deno);
}
}