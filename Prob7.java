import javax.swing.JOptionPane;

public class Prob7 {
public static void main(String args[]){


String numberAsString;
int number;
boolean check = false;

numberAsString = JOptionPane.showInputDialog("Please enter an integer");
number = Integer.parseInt(numberAsString);

whlie(!numberAsString.equals(-1))
{

if(isEven())
{
 JOptionPane.showMessageDialog(null,number + "is odd" ); 
}

else
 JOptionPane.showMessageDialog(null,number +  "is even" );    
  
 }
}

public static int isEven()
{
   int  number =5;
   
   if(number%2==0)
   {
    check = true;    
   }

   else
   {
   check = false;
   }
   
   return check;
}


}

        
