/*4.	Create an interface SAFE_DRIVING with an interface variable Safe_Speed and a member function speed_Of _the_vehicle().
Create a class called drive that implements this interface. Display the following messages
1. If vehicle speed greater than Safe_Speed then display “Drive slow” 
2. If vehicle speed is less than Safe_Speed then display “Safe Driving”*/


import java.util.*;

interface SAFE_DRIVING
{
	public int Safe_Speed=60;
	public void speed_Of_vehicle(int a);
}

class drive implements SAFE_DRIVING
{
  public void speed_Of_vehicle(int a)
  {
     int Speed=a;
     if(Speed<=Safe_Speed)
     	System.out.println("Safe Driving");
  
     else
     	System.out.println("Drive Slow!!");
  }
}

class Main
{
	public static void main(String args[])
	{
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the reading on speedometer in km : ");
       int a=s.nextInt();
       drive d=new drive();
       d.speed_Of_vehicle(a);
	}
}


