import javax.swing.*;  
import java.awt.event.*;  
public class PasswordField implements ActionListener{  
JLabel l1,l2;  
JTextArea area;  
JButton b;  
PasswordField() {  

    JFrame f= new JFrame();  
    l1=new JLabel();  
    l1.setBounds(50,25,100,30);  
    	
    l2=new JLabel();  
    l2.setBounds(160,25,100,30); 
    	 
    area=new JTextArea();  
    area.setBounds(20,75,250,20);  
    	  	
    JPasswordField pass=new JPasswordField();     
    pass.setBounds(10,30, 250,20);  	
    	
    b=new JButton("Sign In");  
    b.setBounds(100,300,300,30);  
    b.addActionListener(this);  
    	
    f.add(area);
    f.add(pass);
    f.add(b);  
   	f.add(l1);
    f.add(l2);
    f.setSize(450,450);  
    f.setLayout(null);  
    f.setVisible(true);  
}  
public void actionPerformed(ActionEvent e){  
    String text=area.getText();  
    String words[]=text.split("\\s");  
    l1.setText("Words: "+words.length);  
    l2.setText("Characters: "+text.length());  
}  
public static void main(String[] args) {  
    new TextAreaExample();  
}  
}  



