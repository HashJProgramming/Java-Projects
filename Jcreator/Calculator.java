 import javax.swing.JOptionPane;
   import java.util.*;
   public class Calculator
   {
      int Number1;
      int Number2;

public void Calculator()
      {
      
      
         String t = JOptionPane.showInputDialog(null, "Enter the first number","Calculator", JOptionPane.INFORMATION_MESSAGE);
         Number1 = Integer.parseInt(t);
      
         String[] options = new String[] {"+", "-", "*", "/"};
         JOptionPane.showOptionDialog(null, "Calculator", "Choose an operation", 
            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
            null, options, options[0]);
      
      
         String y = JOptionPane.showInputDialog(null, "Enter the second number","Calculator", JOptionPane.INFORMATION_MESSAGE);
         Number2 = Integer.parseInt(y);
      	
int totalAdd = Number1 + Number2;
      	
         String add = Integer.toString(totalAdd);  
      	
         int totalSubtract = Number1 + Number2;
      	
         String subtract = Integer.toString(totalSubtract);

if(options.equals("+"))
         {
            JOptionPane.showMessageDialog(null, "The result is " + totalAdd, "Calculator", JOptionPane.INFORMATION_MESSAGE);
         }
         else if(options.equals("-"))
         {
            JOptionPane.showMessageDialog(null, "The result is " + totalSubtract, "Calculator", JOptionPane.INFORMATION_MESSAGE);
         }
 }
   }
   class MyCalculator
   {
      public static void main(String[] args)
      {
         Calculator calc = new Calculator();
         calc.Calculator();
      }
   }

