import javax.swing.*;
import java.lang.Math;

public class ShapeCalculator
{
	boolean quit = false;

	public static void main (String args[]) throws Exception
	{
		ShapeCalculator clas = new ShapeCalculator();

		//Do until user choice = quit
		do
		{
			clas.output(clas.optionAssign(clas.menu()));
		} while (clas.quit == false);
	} //End Main

	//Asks for input. Uses custome message for each shape.
	public double input(String value)
	{
		String ask = "Please Enter " + value;

		String input = JOptionPane.showInputDialog(null, ask, "1337er", JOptionPane.QUESTION_MESSAGE);
		double num  = Double.parseDouble(input);

		return num;
	}

	//Outputs shape formula answer.
	public void output(double i)
	{
		//If quit option output dialog pane is not shown.
		if (i != 0)
		{
			JOptionPane.showMessageDialog(null, i);
		}
	}

	//Displays menu and asks for user choice.
	public int menu()
	{
		String menu = "Welcome to teh Shape Calculator!\n";
		menu += "1. Square Area\n";
		menu += "2. Square Perimiter\n";
		menu += "3. Rectangle Area\n";
		menu += "4. Rectangle Perimiter\n";
		menu += "5. Circle Area\n";
		menu += "6. Circle Perimiter\n";
		menu += "7. Quit\n\n";

		String input = JOptionPane.showInputDialog(null, menu, "1337er", JOptionPane.QUESTION_MESSAGE);
		int ch  = Integer.parseInt(input);

		return ch;
	}

	//Assigns user choice to formula method.
	public double optionAssign(int ch)
	{
		double output = 0;

		switch(ch)
		{
			case 1: output = squareArea(input("Side Value")); break;
			case 2: output = squarePer(input("Side Value")); break;
			case 3: output = rectangleArea(input("Side 1"), input("Side 2")); break;
			case 4: output = rectanglePer(input("Side 1"), input("Side 2")); break;
			case 5: output = circleArea(input("Radius")); break;
			case 6: output = circlePer(input("Radius")); break;
			case 7: quit(); break;
			default: JOptionPane.showMessageDialog(null, "Invalid Input!"); break;
		}

		return output;
	}

	//Formulas
	public double squareArea(double side)
	{
		return side*4;
	}

	public double squarePer(double side)
	{
		return Math.pow(side,2);
	}

	public double rectangleArea(double side1, double side2)
	{
		return side1*side2;
	}

	public double rectanglePer(double side1, double side2)
	{
		return (side1*2)+(side2*2);
	}

	public double circleArea(double rad)
	{
		return Math.pow((Math.PI*rad),2);
	}

	public double circlePer(double rad)
	{
		return 2*Math.PI*rad;
	}

	public boolean quit()
	{
		return quit = true;
	}
}