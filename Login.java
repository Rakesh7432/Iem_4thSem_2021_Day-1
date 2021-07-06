import javax.swing.JOptionPane;
class Login
{
	public static void main(String args[])
	{
		String u1=JOptionPane.showInputDialog("Enter name","type here");
		String u2=JOptionPane.showInputDialog("Enter password","type here");
		if(checkUser(u1,u2))
			JOptionPane.showMessageDialog(null,"The user is "+u1+"\nWelcome");
		else
			JOptionPane.showMessageDialog(null,"Try again");
	}
	static boolean  checkUser(String user,String pwd)
	{
		if((user.length()>3) && (pwd.length()>4))
			return true;
		else 
			return false;
	}
}
