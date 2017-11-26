import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;



public class LogIn extends JPanel {
	private JLabel lblNum1;
	private JLabel lblNum2;
	public JTextField txtFieldNum1;
	public JTextField txtFieldNum2;
	private JButton btnForward;
	private JButton btnForward1;
	
	private static LogIn ref;

	private LogIn() {
		System.out.println("Run");
		initilalizeComponents();
	}
	public static LogIn getRef(){
		if(ref==null){
			ref = new LogIn();
		}
		
		return ref;
	}
	
	private void initilalizeComponents() {
		this.setLayout(null);

		this.lblNum1 = new JLabel("User");
		this.lblNum1.setBounds(50, 25, 50, 25);
		this.add(this.lblNum1);
		
		this.lblNum2 = new JLabel("Password");
		this.lblNum2.setBounds(50, 60, 80, 25);
		this.add(this.lblNum2);

		this.txtFieldNum1 = new JTextField();
		this.txtFieldNum1.setBounds(150, 25, 100, 25);
		this.add(this.txtFieldNum1);
		
		this.txtFieldNum2 = new JTextField();
		this.txtFieldNum2.setBounds(150, 60, 100, 25);
		this.add(this.txtFieldNum2);

		this.btnForward= new JButton("Clear");
		Rectangle r = this.txtFieldNum1.getBounds();
		r.translate(0, 80);
		this.btnForward.setBounds(r);
		this.add(this.btnForward);
		
		this.btnForward1= new JButton("Submits");
		Rectangle r1 = this.txtFieldNum1.getBounds();
		r1.translate(110, 80);
		this.btnForward1.setBounds(r1);
		this.add(this.btnForward1);

        btnForward.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
		 txtFieldNum1.setText("");
         txtFieldNum2.setText("");

		 
        }  
    });
	  btnForward1.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
		 //txtFieldNum1.setText("");
         //txtFieldNum2.setText("");
		 if(txtFieldNum1.getText().equals("") && txtFieldNum2.getText().equals("")){
			JOptionPane.showMessageDialog(null,"No input");
		 }
		 else{
		Application ref = Application.getRef();
		ref.remove(LogIn.getRef());
		ref.add(Submit.getRef(), BorderLayout.CENTER);
		ref.paintAll(ref.getGraphics());

		 }
        }  
    });
	

	}

}