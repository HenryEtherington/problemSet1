import javax.swing.*;

public class Prob6 {

    public static void main(String[] args) {

        JTextArea output = new JTextArea();


         int subscript;

        subscript = cube(cubeNumber);


            output.append("Number         Cube" +
                    "\n-------       -------" +
                    "\n" + (i + 1) + "      " + cubeNumber +
                    "\n" + (i + 2) + "      " + cubeNumber +
                    "\n" + (i + 3) + "      " + cubeNumber +
                    "\n" + (i + 4) + "      " + cubeNumber +
                    "\n" + (i + 5) + "      " + cubeNumber +
                    "\n" + (i + 6) + "      " + cubeNumber +
                    "\n" + (i + 7) + "      " + cubeNumber +
                    "\n" + (i + 8) + "      " + cubeNumber +
                    "\n" + (i + 9) + "      " + cubeNumber +
                    "\n" + (i + 10) + "      " + cubeNumber +
                    "\n" + (i + 11) + "      " + cubeNumber +
                    "\n" + (i + 12) + "      " + cubeNumber +
                    "\n" + (i+  13) + "      " + cubeNumber +
                    "\n" + (i + 14) + "      " + cubeNumber +
                    "\n" + (i + 15) + "      " + cubeNumber);

            JOptionPane.showMessageDialog(null, output, "Square Cubed", JOptionPane.PLAIN_MESSAGE);



    }


    private static double cube(int cubeNumber, int number) {

        int i;
        for(i = 0; i <  15; i++)
         if(number<=15 && number >=1) {
             cubeNumber = (number * number * number);
             return cubeNumber;
         }


    }

    }




