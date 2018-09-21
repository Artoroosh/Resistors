/* Corbin Nash
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.*/
package resistors;
// @author conas1290
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Resistors {
    public static void main(String[] args) {
      String colourCodeInput; //we setup a string
  colourCodeInput = JOptionPane.showInputDialog("What is you resistors colour code?"+"\n"
                                                +"Seperate each colour by hyphens  "+"\n"
                                                +"Ex: RED-BROWN-ORANGE");
    String[] colour =new String[10]; 
    colour[1]="white";   
    
    colour1 = resistorColours.substring(0,resistorColours.indexOf("-"));
     
    
    // scans though colour array to assign colour value
     for(i = 0; i<10; i++){
     if (colour1.equalsIgnoreCase(colours[i])) {
     res1 = i
      }
     if (colour2.equalsIgnoreCase(colours[i])) {
     res2 = i
      }
     
     if (colour3.equalsIgnoreCase(colours[i])) {
     res3 = i
      }
     }
    resVal =(((res1*10)*res2)Math.pow(10 ,res3));
    System.out.println("You entered "+ resistorColours);
        System.out.println("The value of the resistor is "+ resVal +" ohms");

    }
    
}
