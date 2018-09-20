import javax.swing.*;

public class prob1 {

    public static void main(String[] args) {


        String exchangeRateAsString, poundsAsString;
        float exchangeRate, pounds;

        exchangeRateAsString = JOptionPane.showInputDialog("Please enter the exchange rate");
        exchangeRate = Float.parseFloat(exchangeRateAsString);

        poundsAsString = JOptionPane.showInputDialog("Please enter the amount in pounds");
        pounds = Float.parseFloat(poundsAsString);


        while(pounds !=0 )
        {

           float  euros=1;


           euros =  exchangeRate * pounds ;


            JOptionPane.showMessageDialog(null,"The amount of " + pounds + "£"  +
                                          "\nis equal to" + euros );

            System.exit(0);
        }
    }

}
