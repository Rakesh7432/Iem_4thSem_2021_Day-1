import javax.swing.JOptionPane;
class Deposit
{
	static int depo()
	{
		String u1=JOptionPane.showInputDialog("Enter the value that you want to deposit","type here");
		int a=Integer.parseInt(u1);
		return a;
	}
}
class Withdraw
{
	static int with()
	{
		String u2=JOptionPane.showInputDialog("Enter the value that you want to withdraw","type here");
		int b=Integer.parseInt(u2);
		return b;
	}
}
class Balance
{
	static int bal(int k)
	{
		return k;
	}
}
public class DepositMc
{
	public static void main(String args[])
	{
		int balance=0;
		while(true)
		{
			String m=JOptionPane.showInputDialog("1.Deposit\n2.Withdraw\n3.Check Balance\n4.Exit\nEnter your choice..","type here");
			int n=Integer.parseInt(m);
			switch(n)
			{
				case 1: int i=Deposit.depo();
						balance= balance+i;
						JOptionPane.showMessageDialog(null,"Your money has been deposited");
						break;
				case 2: int j=Withdraw.with();
						if(j<=balance)
						{
							balance=balance-j;
							JOptionPane.showMessageDialog(null,"Your money has been withdrawn");
						}
						else 
							JOptionPane.showMessageDialog(null,"Insufficient Balance");
						break;
				case 3: JOptionPane.showMessageDialog(null,"Your current balance is "+Balance.bal(balance));
						break;
				case 4:System.exit(0);
				default: JOptionPane.showMessageDialog(null,"Wrong Choice");
			}
		}
	}
}
