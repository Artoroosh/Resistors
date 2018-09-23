
/* Corbin Nash
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*green-blue-yellow
*/

package resistors;
// @author conas1290
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Resistors {
    public static void main(String[] args) {
  String colourCodeInput; //we setup a string
  int res1=0, res2=0, res3 = 0;
  String colour1,colour2,colour3;

  colourCodeInput = JOptionPane.showInputDialog("What is you resistors colour code?"+"\n"
                                                +"Seperate each colour by hyphens  "+"\n"
                                                +"Ex: RED-BROWN-ORANGE");
    String[] resistorColours =new String[10]; 
    resistorColours[0]="black";   
    resistorColours[1]="brown";  
    resistorColours[2]="red"; 
    resistorColours[3]="orange";   
    resistorColours[4]="yellow";   
    resistorColours[5]="green";   
    resistorColours[6]="blue";   
    resistorColours[7]="violet";   
    resistorColours[8]="grey";   
    resistorColours[9]="white";   

        colour1 = colourCodeInput.substring(0,colourCodeInput.indexOf("-"));
        colour2 = colourCodeInput.substring(colourCodeInput.indexOf("-",colourCodeInput.indexOf("-")+1));
        colour3 = colourCodeInput.substring(colourCodeInput.lastIndexOf("-"));

    int i;
    // scans though colour array to assign colour value
     for(i = 0; i<10; i++){
     if (colour1.equalsIgnoreCase(resistorColours[i])) {
     
         res1 = i;
      }
     if (colour2.equalsIgnoreCase(resistorColours[i])) {
    
         res2 = i;
      }
     
     if (colour3.equalsIgnoreCase(resistorColours[i])) {
   
         res3 = i;
      }
     }
   double resVal; 
   resVal = (((res1*10)+res2)+(Math.pow(10,res3)));
   
   System.out.println(res1 +" "+ res2 +" "+ res3);
   System.out.println("You entered "+ colourCodeInput);
        System.out.println("The value of the resistor is "+ resVal +" ohms");
    }   
}