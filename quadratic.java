import java.util.*;
import java.lang.Math.*;
class quadratic
{
 public static void main(String arg[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter the co efficients of quadratic equation\n");
    int a=s.nextInt();
    int b=s.nextInt();
    int c=s.nextInt();
    int n=(b*b)-(4*a*c);
    double d=Math.sqrt(n);
    double e=(2*a); 
    double r1=((-b)+d)/e;
    double r2=((-b)-d)/e;
      if(n==0)
        {
          System.out.println("The roots are equal\nthe roots are : "+r1","+r2);
        }
      if(n<0)
        System.out.println("The roots are imaginary\n");
      if(n>0)
       {
        System.out.println("The roots are real and distinct\nthe roots are : "+r1","+r2);
       }
   }
 }
