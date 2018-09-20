
import javax.swing.*;

public class prob2 {

    public static void main (String args []) {



        JTextArea output = new JTextArea ();


        final double CONVERSION_INCHES = 36;

        int maxYards = 10, num, yards;

        double conversion;



        conversion = 12*3;



        output.setText("           Yards      Inches");



        for (num = 0; num < maxYards; num++){

            conversion = num * 36;

            output.append("               " + num + "            " + conversion + "\n");

        }

        JOptionPane.showMessageDialog(null,output,"Inches" + CONVERSION_INCHES,

                JOptionPane.PLAIN_MESSAGE);
    }

}


