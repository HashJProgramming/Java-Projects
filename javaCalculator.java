import javax.swing.JOptionPane;

public class javaCalculator {

    private static boolean flag;

    public static void main(String[] args) {
        do {
            String[] expression = getTask();
            double result = calculate(expression);
            display(expression, result);
            repeat();
        } while (flag);
    }

    public static String[] getTask()
    {
        String bleh = JOptionPane.showInputDialog(null, "Ma'am ibutang imong gusto e solve like ( 1 + 1 )");
        String[] tokens = bleh.split(" ");
        return tokens;
    }

    public static double calculate(String[] data)
    {
        double num1 = Double.parseDouble(data[0]);
        double num2 = Double.parseDouble(data[2]);
        double result = 0;
        if(data[1].equals("+"))
        {
            result = add(num1, num2);
            return result;
        }
        else if(data[1].equals("-"))
        {
            result = subtract(num1, num2);
            return result;
        }
        else if(data[1].equals("*"))
        {
            result = multiply(num1, num2);
            return result;
        }
        else 
        {
            if(num2 == 0)
            {
                JOptionPane.showMessageDialog(null, "Sytax error, divide by zero");
            }
            result = divide(num1, num2);
            return result;
        }


    }

    public static double add(double num1, double num2)
    {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2)
    {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2)
    {
        return num1 * num2;
    }

    public static double divide(double num1, double num2)
    {
        return num1 / num2;
    }

    public static void display(String[] data, double result)
    {
        if(data[1].equals("/") && data[2].equals("0"))
        {

        }
        else
        {
            JOptionPane.showMessageDialog(null, data[0] + " " + data[1] + " " + data[2] + " = " + result);
        }
    }

    public static void repeat()
    {
        int bleh = JOptionPane.showConfirmDialog(null, "Usab?",null, JOptionPane.YES_NO_OPTION);
        if(bleh == JOptionPane.NO_OPTION)
        {
            flag = false;
            JOptionPane.showMessageDialog(null, "Salamat sa paggamit! tawon pasar unta karong Year");
        }
        else
            flag = true;

    }

}