class Mycl4
{
  public static void main(String arg[])
  {
      System.out.println("Program start ");
       
        Myclt ob=new Myclt();
       for(int t=0;t<=10; t=t+1)
    {
 System.out.println("++++++++++"+t);
       try
        {
         
        Thread.sleep(1000);
      }catch(InterruptedException  e)
        {
               System.out.println(" Some problem" );
         }
     }
                System.out.println("Main Thread stop");
 }
 }