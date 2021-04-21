import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Calculatorv2{
	public static void main (String[] args) {
		Mycalculator obj = new Mycalculator();
}
}
class Mycalculator{
	
	  String s0, s1, s2; 
JTextField Display = new JTextField();
JButton Enter = new JButton("Enter");	
JButton num0 = new JButton("0");
JButton num1 = new JButton("1");
JButton num2 = new JButton("2");
JButton num3 = new JButton("3");
JButton num4 = new JButton("4");
JButton num5 = new JButton("5");
JButton num6 = new JButton("6");
JButton num7 = new JButton("7");
JButton num8 = new JButton("8");
JButton num9 = new JButton("9");
JButton Div = new JButton("/");
JButton Mul = new JButton("*");
JButton Sub = new JButton("-");
JButton Add = new JButton("+");
JButton BackSpc = new JButton("BackSpace");
JButton offs = new JButton("C");
JButton Clear = new JButton("CE");
JButton AM = new JButton("+/-");
JButton Dot = new JButton(".");
JButton Root = new JButton("Root");

	command ComA = new command();
		Mycalculator(){
			Display.setEditable(false);
		
			  s0 = s1 = s2 = "";
			JFrame F = new JFrame("Joshua M. Ambalong Calc");
			
		Display.setBounds(75,5,300,35);
		Enter.setBounds(155,225,145,40);
		num0.setBounds(80,225,70,40);
		num1.setBounds(80,180,70,40);
		num2.setBounds(155,180,70,40);
		num3.setBounds(230,180,70,40);
		num4.setBounds(80,135,70,40);
		num5.setBounds(155,135,70,40);
		num6.setBounds(230,135,70,40);
		num7.setBounds(80,90,70,40);
		num8.setBounds(155,90,70,40);
		num9.setBounds(230,90,70,40);
		Div.setBounds(305,90,70,40);
		Mul.setBounds(305,135,70,40);
		Sub.setBounds(305,180,70,40);
		Add.setBounds(305,225,70,40);
		BackSpc.setBounds(80,45,145,40);
		offs.setBounds(230,45,70,40);
		Clear.setBounds(305,45,70,40);
		AM.setBounds(5,45,70,70);
		Dot.setBounds(5,120,70,70);
		Root.setBounds(5,195,70,70);
		
		
		Enter.addActionListener(ComA);
		num0.addActionListener(ComA);
		num1.addActionListener(ComA);
		num2.addActionListener(ComA);
		num3.addActionListener(ComA);
		num4.addActionListener(ComA);
		num5.addActionListener(ComA);
		num6.addActionListener(ComA);
		num7.addActionListener(ComA);
		num8.addActionListener(ComA);
		num9.addActionListener(ComA);
		Div.addActionListener(ComA);
		Mul.addActionListener(ComA);
		Sub.addActionListener(ComA);
		Add.addActionListener(ComA);
		BackSpc.addActionListener(ComA);
		offs.addActionListener(ComA);
		Clear.addActionListener(ComA);
		AM.addActionListener(ComA);
		Dot.addActionListener(ComA);
		Root.addActionListener(ComA);
		
			 
					
		
		F.add(Display);	F.add(num0);F.add(num1);F.add(num2);
		F.add(num3);F.add(num4);F.add(num5);F.add(num6);
		F.add(num7);F.add(num8);F.add(num9);F.add(Enter);		
		F.add(Div);F.add(Mul);F.add(Sub);F.add(Add);
		F.add(BackSpc);F.add(offs);F.add(Clear);
		F.add(AM);F.add(Dot);F.add(Root);	
		F.setSize(400,315);
		F.setLayout(null);
		F.setVisible(true);
				}
			
	class command implements ActionListener{
		public void actionPerformed(ActionEvent e){
		{ 
			try {	
        String s = e.getActionCommand(); 
  
        if((s.charAt(0) >= '0'&&s.charAt(0) <= '9') || s.charAt(0) == '.') { 
            if(!s1.equals("")) 
                s2 = s2 + s; 
            else
                s0 = s0 + s; 
  
            Display.setText(s0 + s1 + s2); 
        }
         
        else if(s.charAt(0) == 'C') { 
            s0 = s1 = s2 = ""; 
            Display.setText(s0 + s1 + s2); 
        }
         else if(s.charAt(0) == 'B') { 
            s0 = s1 = s2 = ""; 
            Display.setText(s0 + s1 + s2); 
        }
         
        
        
        		else if(s.charAt(0) == 'E') { 
     double te; 
  
            if(s1.equals("+")) 
                te = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
            else if(s1.equals("-")) 
                te = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
            else if(s1.equals("/")) 
                te = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
            else
                te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 
  
           Display.setText(s0 + s1 + s2 + " = "+ te); 
  
            s0 = Double.toString(te); 
  
            s1 = s2 = ""; 
        }
         
        else{ 
            if(s1.equals("") || s2.equals("")) 
                s1 = s; 
            else{ 
                double te; 
  
                if(s1.equals("+")) 
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
                else if(s1.equals("-")) 
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
                else if(s1.equals("/")) 
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 
  
                s0 = Double.toString(te); 
  
                s1 = s; 
  
                s2 = ""; 
            } 
  
          Display.setText(s0 + s1 + s2); 
        } 
}
catch (Exception ex) {
	JOptionPane.showMessageDialog(null,ex);
}   } 	}	} } 	
	
	