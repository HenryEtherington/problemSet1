import javax.swing.*;

public class Prob5 {
    public static void main(String[] args) {

        JTextArea output = new JTextArea ();

        float x, a=1, b=6, c=-16, d, y;

        d = (float) Math.sqrt((b * b) - (4 * a * c));

        x  = -b + d / 2 * a;
        y = -b - d / 2 * a;

        output.append("The first square root is: "  + x +
                      "The second square root is: " + y );

        JOptionPane.showMessageDialog(null,output,"Square Roots" ,JOptionPane.PLAIN_MESSAGE);



    }
}
