import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
public class MyGUI{
	public static void main(String[] args){
		JFrame f= new JFrame();
		
		f.setBounds(200,100,500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setLayout(null);
		 System.out.println("My Gui running......");
		 //to add a textfield component
		 JTextField tf1=new JTextField();
		 tf1.setBounds(100,15,100,30);
		 f.add(tf1);
		 
		 JButton button= new JButton("button");
		 button.setBounds(150,50,100,25);
		 f.add(button);
		 
		 f.setVisible(true);
		 
		 /*
		 f = new JFrame();
		 f.setTitle("GUI-2");
		 f.setBounds(750,100,500,500);
		 f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 f.setVisible(true);
		 System.out.println("My Gui running......");
		 */
	}
	
}