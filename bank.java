/*Develop a Java program to create a class Bank that maintains two
kinds of account for its customers, one called savings account and
the other current account.

The savings account provides compound interest and withdrawal facilities but no cheque book facility.
The current account provides cheque book facility but no interest.

Current account holders should also maintain a minimum balance and if the balance falls below this level, a service charge is
imposed.*/

import java.util.*;
import java.lang.Math;
class bank
{
 public double p;
 public int t;
 public double r;
}

class savings extends bank
{
 public void info(double a,int b,double c)
 {/*Develop a Java program to create a class Bank that maintains two
kinds of account for its customers, one called savings account and
the other current account.

The savings account provides compound interest and withdrawal facilities but no cheque book facility.
The current account provides cheque book facility but no interest.

Current account holders should also maintain a minimum balance and if the balance falls below this level, a service charge is
imposed.*/

import java.util.*;
import java.lang.Math;
class bank
{
 public double p;
 public int t;
 public double r;
}

class savings extends bank
{
 public void info(double a,int b,double c)
 {
  Scanner s=new Scanner(System.in);
  p=a;
  t=b;
  r=c;
  double w;
  System.out.println("Enter the amount u wish to withdraw");
  w=s.nextDouble();
  double CI=(p-w)*Math.pow((1+r),t);
  System.out.println("Compound interst of ur principle amount ="+CI);
 }
  
 
}

class current extends bank
{
 public void info(double a,int b,double c)
 {
  p=a;
  t=b;
  r=c;
  if(p<=1000)
    System.out.println("Your account balance is running below the minimum balance ,hence you will be charged penalty");
  else
   System.out.println("U are eligible to receive and use check book");
 /*Develop a Java program to create a class Bank that maintains two
kinds of account for its customers, one called savings account and
the other current account.

The savings account provides compound interest and withdrawal facilities but no cheque book facility.
The current account provides cheque book facility but no interest.

Current account holders should also maintain a minimum balance and if the balance falls below this level, a service charge is
imposed.*/

import java.util.*;
import java.lang.Math;
class bank
{
 public double p;
 public int t;
 public double r;
}

class savings extends bank
{
 public void info(double a,int b,double c)
 {
  Scanner s=new Scanner(System.in);
  p=a;
  t=b;
  r=c;
  double w;
  System.out.println("Enter the amount u wish to withdraw");
  w=s.nextDouble();
  double CI=(p-w)*Math.pow((1+r),t);
  System.out.println("Compound interst of ur principle amount ="+CI);
 }
  
 
}

class current extends bank
{
 public void info(double a,int b,double c)
 {
  p=a;
  t=b;
  r=c;
  if(p<=1000)
    System.out.println("Your account balance is running below the minimum balance ,hence you will be charged penalty");
  else
   System.out.println("U are eligible to receive and use check book");
 }
}
class main1
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  savings a1=new savings();
  current a2=new current();
  System.out.println("Enter the value of principle amount");
  double a=s.nextDouble();
  System.out.println("Enter the value of time in years");
  int b=s.nextInt();
  System.out.println("Enter the value of rate of interest in percentage");
  double c=s.nextDouble();
  System.out.println("If ur account is savings : press 1\nif ur account is current account : press 2");
  int n=s.nextInt();
  if(n==1)
   a1.info(a,b,c);
  else
   a2.info(a,b,c);
 }
}}
}
class main1
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  savings a1=new savings();
  current a2=new current();
  System.out.println("Enter the value of principle amount");
  double a=s.nextDouble();
  System.out.println("Enter the value of time in years");
  int b=s.nextInt();
  System.out.println("Enter the value of rate of interest in percentage");
  double c=s.nextDouble();
  System.out.println("If ur account is savings : press 1\nif ur account is current account : press 2");
  int n=s.nextInt();
  if(n==1)
   a1.info(a,b,c);
  else
   a2.info(a,b,c);
 }
}
  Scanner s=new Scanner(System.in);
  p=a;
  t=b;
  r=c;
  double w;
  System.out.println("Enter the amount u wish to withdraw");
  w=s.nextDouble();
  double CI=(p-w)*Math.pow((1+r),t);
  System.out.println("Compound interst of ur principle amount ="+CI);
 }
  
 
}

class current extends bank
{
 public void info(double a,int b,double c)
 {
  p=a;
  t=b;
  r=c;
  if(p<=1000)
    System.out.println("Your account balance is running below the minimum balance ,hence you will be charged penalty");
  else
   System.out.println("U are eligible to receive and use check book");
 }
}
class main1
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  savings a1=new savings();
  current a2=new current();
  System.out.println("Enter the value of principle amount");
  double a=s.nextDouble();
  System.out.println("Enter the value of time in years");
  int b=s.nextInt();
  System.out.println("Enter the value of rate of interest in percentage");
  double c=s.nextDouble();
  System.out.println("If ur account is savings : press 1\nif ur account is current account : press 2");
  int n=s.nextInt();
  if(n==1)
   a1.info(a,b,c);
  else
   a2.info(a,b,c);
 }
}
