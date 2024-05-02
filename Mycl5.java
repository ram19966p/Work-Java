//jo ob dikhta nahi hai uska name Thish hota hai  
class Mycl5
{
public static void main(String arg[])
 {
    System.out.println("main thread start ");
           MyTh  ob1, ob2;
 MyTh ob1= new Myth("My first thread" );

 MyTh ob2=new Myth("my second thread");

for(int v=1; v<= 10 ; v=v+1)
   {

 System.out.println("=========>"+v);
       try
    { 
       Thread.sleep(1000);
    }catch(InterruptedException e)
        {
            System.out.println("Some problem");
         }
    }
    System.out.println("Main Thread stop ");
}
}