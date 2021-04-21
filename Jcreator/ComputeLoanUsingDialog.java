import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class ComputeLoanUsingDialog {
public static void main(String[] args)
{
double monthlyPayment ;
double totalPayment;
String loanString = JOptionPane.showInputDialog("Enter the LoanAmount: ");
double loanAmt = Double.parseDouble(loanString);
String periodString = JOptionPane.showInputDialog("Please enter the Loan Period : ");
double years = Double.parseDouble(periodString);

double i = 5.0;
String output = "Interest Rate \t MonthlyPayment \t TotalPayment";
JOptionPane.showMessageDialog(null, output);

while(i<=8.0)
{
double monthlyInterestRate = i / 1200;

monthlyPayment = loanAmt * monthlyInterestRate /
(1-1 / Math.pow(1 + monthlyInterestRate, years * 12));
totalPayment = monthlyPayment * 12 * years;

monthlyPayment = (int) (monthlyPayment * 100) / 100.0;
totalPayment = (int) (totalPayment * 100) / 100.0;
//Display results
// String output = "Interest Rate \t MonthlyPayment \t TotalPayment";
//JOptionPane.showMessageDialog(null, output);
String result = "\t"+i+" \t"+monthlyPayment+ " \t " +totalPayment;
JOptionPane.showMessageDialog(null, result);
i = i + 1.0 / 8;

}


//String op = result;

// JOptionPane.showMessageDialog(null,"Lab" + op);

}
}