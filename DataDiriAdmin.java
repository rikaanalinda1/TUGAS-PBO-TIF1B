import javax.swing.JOptionPane;
public class DataDiriAdmin{
public static void main ( String[] args ){
String username = "";
String password = "";
int number1;
int number2;
int number3;
double hasilA;
double hasilB;
double hasilC;
username = JOptionPane.showInputDialog("Please enter your usernsme! !");
password = JOptionPane.showInputDialog("Please enter your password! !");
number1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter your Date! !"));
number2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter your Month! !"));
number3 = Integer.parseInt(JOptionPane.showInputDialog("Please enter your Year! !"));
hasilA = (2016-number3);
hasilB = (number2-1);
hasilC = (14-number1);
String msg = ("You'r Data ADMIN" + "\nUSER      : " + username + "\nPASS        : ");
JOptionPane.showMessageDialog(null, msg);
}
}