
import javax.swing.JOptionPane;

public class Prob8 {
	public static void main(String args[]) {
	
	int i;
	String numberAsString;	
	int[] 	number;
	number = new int[10];
	
	for(i = 0; i < number.length; i++)
	{	
	 numberAsString = JOptionPane.showInputDialog("Please enter an integer: " );
     number[i] = Integer.parseInt(numberAsString);
	}
	
JOptionPane.showMessageDialog(null,"The first value in the array is " + number[0] +
                             "\nThe 5th number in the array is " + number[4]);

	}
}