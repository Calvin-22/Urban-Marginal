package vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EntreeJeu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EntreeJeu frame = new EntreeJeu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EntreeJeu() 
	
	{
		setTitle("Urban Marginal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 374, 195);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStart = new JLabel("Start a new server :");
		lblStart.setBounds(31, 25, 155, 16);
		contentPane.add(lblStart);
		
		JLabel lblConnect = new JLabel("Connect an existing server : ");
		lblConnect.setBounds(31, 53, 194, 16);
		contentPane.add(lblConnect);
		
		JLabel lblip = new JLabel("IP Server :");
		lblip.setBounds(31, 83, 80, 16);
		contentPane.add(lblip);
		
		
		/**
		 * bouton start
		 */
		JButton btnStart = new JButton("Start");
		btnStart.setBounds(230, 20, 117, 29);
		btnStart.addActionListener(new ActionListener() 
		{
			/**
			 * action du bouton start (vide) 
			 */
			public void actionPerformed(ActionEvent arg0) 
			{
				
			}
		});
		contentPane.add(btnStart);
		
		/**
		 * bouton connect
		 */
		JButton btnConnect = new JButton("Connect");
		btnConnect.setBounds(230, 78, 117, 29);
		btnConnect.addActionListener(new ActionListener() 
		{
			/**
			 * action du bouton connect (vide) 
			 */
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		contentPane.add(btnConnect);
		
		/**
		 * bouton exit
		 */
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(230, 119, 117, 29);
		btnExit.addActionListener(new ActionListener() 
		{
			/**
			 * action du bouton exit qui ferme la fenêtre mais ne quitte pas l'app'
			 */
			public void actionPerformed(ActionEvent e) 
			{
				dispose(); 
				
			}
		});
		contentPane.add(btnExit);
		
		txtIP = new JTextField();
		txtIP.setBounds(95, 78, 130, 26);
		contentPane.add(txtIP);
		txtIP.setColumns(10);
		
		
	}
}
