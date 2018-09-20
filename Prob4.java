import javax.swing.*;

public class Prob4 {

    public static void main(String args[]) {

        JTextArea output = new JTextArea ();

        String name, upperCase, lastName;
        char initial;

        name = JOptionPane.showInputDialog("Please enter your full name");

        initial= name.charAt(0);
        upperCase = name.toUpperCase();
        lastName = name.lastIndexOf();


        output.append("The number of characters in the name is: " + name.length() +
                      "\n\nThe initial of the first name is : " +  initial +
                      "\nThe name as entered in capital letters is: " + upperCase +
                      "\nThe surname on its own: " + lastName);




        JOptionPane.showMessageDialog(null,output,"Stats for Name" ,JOptionPane.PLAIN_MESSAGE);


        System.exit(0);  }
}
