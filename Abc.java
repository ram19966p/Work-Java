//call by value
package practice ;
class Abc
{
  static int sum(int x , int y)
{
javax.swing.JOptionPane.showMessageDialog(null," Sum = "+ x+y);

   return x+y;
}
public static void main (String arg[])
{
int  a = 4 , b = 6;

Abc ob = new Abc( );
//ob.sum(a,b ); 
int c = sum(a, b);
javax.swing.JOptionPane.showMessageDialog(null," Sum = " +c);
}
}