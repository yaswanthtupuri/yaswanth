import java.io.*;
import java.util.*;
import java.lang.*;
class areaa
{
 public static void main(String args[])
 { 
  double r=15,h=15;
  a1 o=new a1();
  o.displayar();
  ac o1=new ac();
  o1.displayar1();
  ao o2=new ao();
  o2.displayhr(); 
 }
}
class a1
{
 double p=3.14;
 void displayar()
 {
  System.out.println("pi"+p);
 }
}
class ac extends a1
{
 double a,r=15;
 a=p*r*r;
 void displayar1()
 {
  System.out.println("pi"+p);
  System.out.println("area of circle"+a);
 }
}
class ao extends ac
{
 double c,h=15;
 c=a*h/3;
 void displayhr()
 {
  System.out.println("area"+a);
  System.out.println("area of cone"+c);
 }
}
  

