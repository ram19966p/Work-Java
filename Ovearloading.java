package practice ;
class Ovearloading
{

  public static int  sum ( int a , int  b )
{

  return a+b;
}
public static int sum(int a ,int  b ,int c)
{
  return a+b+c;
}
 public static int sum (int a, int b ,int c ,int d )
{
   return a+b+c+d;
}
   public static void main(String arg[])
{
String s = "  " ;
int a  = 586 , b  = 867 ;

  int  c = sum(50 , 50);
  c =  sum (345 , 78  );
c=sum( 2 , 3, 4, 5);
s = s+" \n"+  c;
javax.swing.JOptionPane.showMessageDialog(null," Sum of number ==>" +s); 
}
}