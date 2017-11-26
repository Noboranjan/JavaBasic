import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Submit extends JPanel {
	private JLabel lblNum1;
	public JTextField txtFieldNum1;
	private JButton btnForward;
	private JButton btnBackward;
	
	private static Submit ref;

	private Submit() {
		initilalizeComponents();
	}
	public static Submit getRef(){
		if(ref == null)
			ref = new Submit();
		return ref;
	}
	private void initilalizeComponents() {
		this.setLayout(null);

		/*this.lblNum1 = new JLabel("Num1:");
		this.lblNum1.setBounds(50, 25, 50, 25);
		this.add(this.lblNum1);*/

		this.txtFieldNum1 = new JTextField();
		this.txtFieldNum1.setBounds(50 + 50 + 15, 25, 100, 25);
		this.add(this.txtFieldNum1);

		this.btnForward= new JButton("Next");
		Rectangle r = this.txtFieldNum1.getBounds();
		this.btnForward.setBounds((int) r.getX(), (int) r.getY() + 30, 100, 25);
		this.add(this.btnForward);
		
		this.btnBackward= new JButton("Back");
		r.translate(0, 60);
		this.btnBackward.setBounds(r);
		this.add(this.btnBackward);

		btnBackward.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
		 //String s1= txtFieldNum1.setText("");
         //txtFieldNum2.setText("");

		 Application ref = Application.getRef();
		ref.remove(Submit.getRef());
		ref.add(LogIn.getRef(), BorderLayout.CENTER);
		ref.paintAll(ref.getGraphics());
        }  
    });

	}
}