import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;


public class MyGUI{
	public static void main(String[] args){
		JFrame f= new JFrame("My Contact");
		
		f.setBounds(200,100,500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setLayout(null);
		 System.out.println("My Gui running......");
		 //to add a textfield component
		 JTextField tf1=new JTextField();
		 tf1.setBounds(150,15,100,30);
		 f.add(tf1);
		 
		 JButton button= new JButton("Delete");
		 button.setBounds(50,200,100,25);
		 f.add(button);
		 
		 JButton button1= new JButton("Save");
		 button1.setBounds(180,200,100,25);
		 f.add(button1);
		 
		 JLabel jlb=new JLabel("Name");
		 jlb.setBounds(50,15,80,30);
		 f.add(jlb);
		 
		 JTextField tf2=new JTextField();
		 tf2.setBounds(150,65,100,30);
		 f.add(tf2);
		 
		 JLabel jlb1=new JLabel("Phone");
		 jlb1.setBounds(50,65,80,30);
		 f.add(jlb1);
		 
		 JTextField tf3=new JTextField();
		 tf3.setBounds(150,115,100,30);
		 f.add(tf3);
		 
		 JLabel jlb2=new JLabel("E-mail");
		 jlb2.setBounds(50,115,80,30);
		 f.add(jlb2);
		 
		 
		 
		 
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