import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test extends JFrame 

{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTest;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	
	{
		EventQueue.invokeLater(new Runnable()
		
		{
			public void run() 
			
			{
				try 
				
				{
					Test frame = new Test();
					frame.setVisible(true);
				} catch (Exception e)
				
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Test() 
	
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setForeground(new Color(0, 0, 0));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnTest = new JButton("Test");
		btnTest.addActionListener(new ActionListener() 
		
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				btnTest_clic() ;
			}
		});
		
		btnTest.setBounds(313, 219, 117, 29);
		contentPane.add(btnTest);
		
		txtTest = new JTextField();
		txtTest.setBounds(171, 219, 130, 26);
		contentPane.add(txtTest);
		txtTest.setColumns(10);
	}
	
	/**
	 * Clic sur le bouton btnTest (extérieur au constructeur) 
	 */
	private void btnTest_clic() 
	{
		txtTest.setText("Hello world !");
	}
	
}
