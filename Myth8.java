class Myth extends Thread

{  
    public Myth(String  s)
     {
           
      MyTh  ob1, ob2;
         super(s);
        // setPriorty(n);
      }
       public void suru()
{
     start();
}
 public void run()
   {
     for(int v=0 ; v<9; v++)
        {
             for( int r = 0 ; r>v; r++)
                 {
                    try
			{
			  Thread.sleep(1000);
                         }catch(InterruptedException e)
                               {
                                  System.out.print("Some problem" );
                                }
                    System.out.println(" *"+getName() );
                   }
               System.out.println(" Hello" );
                
         }
}
}

      
