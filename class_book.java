class book
{
  public String name;
  public String author;
  public double price;
  public int no_pages;

  book()
   {
  
    }
  book(String a,String b,double c,int d)
   {
    name=a;
    author=b;
    price=c;
    no_pages=d;
   }
 public void book_display()
  {
    System.out.println("\nInformation Of The Book : \nName : "+name+"\nAuthor : "+author+"\nPrice : "+price+"$\nno of pages : "+no_pages);
  }
}
class info
 {
  public static void main(String args[])
   {
     book a[] =new book[4];
     a[0]=new book("FARMER","NIKHIL",500.0,800);
     a[1]=new book("tourism","MADHUKESH",100.0,1000);
     a[2]=new book("animal","NIKHIL",50.0,100);
     a[3]=new book("aquarium","PRANAV",0.0,550);
    for(int i=0;i<4;i++)
     a[i].book_display();
   }
}
