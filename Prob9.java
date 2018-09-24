
import javax.swing.JOptionPane;

public class Prob9 {
	public static void main(String args[]) {
	
	 int  i, total=0, over=0, under=0;
	 String weightAsString;		
	 double  lightest=0;
	 double[] weight;
	 
	 weight = new double[10];
	
	for(i = 0; i < weight.length; i++)
	{	
	 
	
	 
	 weightAsString = JOptionPane.showInputDialog("Please enter the weight in kilos of the animal: " );
     weight[i] = Integer.parseInt(weightAsString);
  
     total += weight[i];
     lightest = weight[0];

    if(weight[i] < lightest)
    {
    	lightest = weight[i];
    
    }

	
	else if(weight[i] < 250)
	{
		under++;
	}


    else if(weight[i] > 400)
    {
       over++;	
    }
    
	}
      JOptionPane.showMessageDialog(null,"Weights: " + weight[0] + "," +
                              weight[1] +  "," + weight[2] + "," + weight[3] + "," + weight[4] + "," +
                              weight[5] +  "," + weight[6] + "," + weight[7] + "," + weight[8] + "," + 
                              weight[9] + "\nNumber under 250 kg: " + under + 
                              "\nPercentage over 400 kg: " + String.format("%.2f",(over/10f)* 100) + "%" +
                              "\nLightest animal: " + lightest + "kg" +
                              "\nAverage weight: " +  String.format("%.2f",(total/10f)));  
	}
}