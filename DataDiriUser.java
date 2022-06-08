import javax.swing.JOptionPane;
public class DataDiriUser{
public static void main( String[] args ){
String username = "";
String password = "";

username = JOptionPane.showInputDialog("Please enter your username! !");
password = JOptionPane.showInputDialog("Please enter your password! !");

String msg = ("You'r Data USER" + "\nUSER      : " + username + "\nPASS        : ");
JOptionPane.showMessageDialog(null, msg);
}
}