import java.util.*;
class gen<N,M>
{
 N ob1;
 M ob2;
 public void add(N a,M b)
 {
  this.ob1=a;
  this.ob2=b;
  System.out.println("NAME OF THE SENT PERSON IS : "+ob1+"\nAGE OF THE SENT PERSON IS : "+ob2+"\n\n");
 }
}

class gendemo
{
 public static void main(String args[])
 {
  gen<String,Integer> a1=new gen<String,Integer>();
  gen<String,Double> a2=new gen<String,Double>();
  a1.add("NIKHIL",19);
  a2.add("REVU",19.33);
 }
}
  
  
  

  
  
