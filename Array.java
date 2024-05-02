package practice ;
import javax.swing.JOptionPane;
class Arry
{
  public static void main (String arg [])
 {
   int v , d ,  m[];
 String  s ="   " ;
m = new int [7];
for(v= 0 ; v<7; v++)
{
  m[v]=Integer.parseInt(JOptionPane.showInputDialog(" Enter the number " ));
}
for(d=0;d<7;d++)
{
  s=s+" \n" +m[d];
}
JOptionPane.showMessageDialog(null,s);
}
}