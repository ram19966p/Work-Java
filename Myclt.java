class Myclt  extends Thread
 {
    public Myclt()
 {
 }
  public void run()
{
   mywork();
}
public void mywork()
{
   for(int r =1;r>=10;r=r+1)
    {
      javax.swing.JOptionPane.showMessageDialog(null," Hellow");
   }
}
}
