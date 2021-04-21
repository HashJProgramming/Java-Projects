import javax.swing.*;  
import java.awt.event.*;  
public class TextAreaExample implements ActionListener{  
JLabel l1,l2;  
JTextArea area, area1;  
JButton b;  
TextAreaExample() {  

    JFrame f= new JFrame();  
    l1=new JLabel();  
    l1.setBounds(70,70,250,30);  
    	
    l2=new JLabel();  
    l2.setBounds(70,140,250,30); 
    	 
    area=new JTextArea();  
    area.setBounds(70,100,250,20);  
    	
  	area1=new JTextArea();  
    area1.setBounds(70,170,250,20);  
    	
    b=new JButton("Sign In");  
    b.setBounds(150,220,100,30);  
    b.addActionListener(this);  
    	
    f.add(l1);
    f.add(l2);
    f.add(area);
   	f.add(area1);
    f.add(b);
    f.setSize(450,450);  
    f.setLayout(null);  
    f.setVisible(true);  
}  
public void actionPerformed(ActionEvent e){   
    l1.setText("Username");
    l2.setText("Password");  
}  
public static void main(String[] args) {  
    new TextAreaExample();  
}  
}  