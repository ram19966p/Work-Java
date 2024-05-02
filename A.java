package practice ;
class A
{
   static void abc(int [] a)
{
   int t = a[0] ;
  a[0] = a[1] ;
a[1] = t ;
}
  public static void main(String arg [])
{
    int  a [] ={ 10 , 20 } ;
String    s =" "  ;

javax.swing.JOptionPane.showMessageDialog(null,a[0]);
javax.swing.JOptionPane.showMessageDialog(null,a[1]);
       abc(a);
for(int i = 0 ; i<= 1 ; i++)

 s=  s+"  \n "+a[i];
javax.swing.JOptionPane.showMessageDialog(null,s);
}
 }