import javax.swing.*;
import java.awt.*;


public class prob3 {

    public static void main (String[] args) {


        JTextArea output = new JTextArea ();
        Font font = new Font("monospaced",Font.PLAIN,13);
        output.setFont(font);


     String name, lengthAsString, breadthAsString, costPerSquareMetreAsString;

     name = JOptionPane.showInputDialog("Please enter your name");
     lengthAsString = JOptionPane.showInputDialog("Please enter the length of the room");
     breadthAsString = JOptionPane.showInputDialog("Please enter the breadth of the room");
     costPerSquareMetreAsString = JOptionPane.showInputDialog("Please enter the cost per square metre of the room");

     float length = Float.parseFloat(lengthAsString);
     float breadth = Float.parseFloat(breadthAsString);
     float costPerSquareMetre = Float.parseFloat(costPerSquareMetreAsString);

     float area = length * breadth;
     float cost = area * costPerSquareMetre;
     costPerSquareMetre = (cost/area);



        output.append("Quotation for " + name +
                      "\n\nLength of room: " + length + " m." +
                      "\nBreadth of room: " + breadth + " m." +
                      "\nTotal area of the room: " + area + " sq. m. " +
                      "\nCost per square metre of carpet: " + costPerSquareMetre + " euro" +
                      "\nTotal cost of carpet: " + cost + " euro");

        JOptionPane.showMessageDialog(null,output);


    System.exit(0);

    }
}
