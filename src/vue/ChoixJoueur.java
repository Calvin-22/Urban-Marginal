package vue;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ChoixJoueur extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPseudo;
	private JLabel lblGauche;
	private JLabel lblGo;
	private JLabel lblDroite;
	private JLabel label_1;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChoixJoueur frame = new ChoixJoueur();
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
	public ChoixJoueur() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		/**
		 * Dimension de la fenêtre en fonction de la taille de l'arène 
		 */
		
		this.getContentPane().setPreferredSize(new Dimension(400, 275));
		this.pack();
		
		
		
		txtPseudo = new JTextField();
		txtPseudo.setBounds(143, 243, 124, 26);
		contentPane.add(txtPseudo);
		txtPseudo.setColumns(10);
		
		lblGauche = new JLabel("");
		lblGauche.setBounds(61, 139, 36, 47);
		contentPane.add(lblGauche);
		
		lblGo = new JLabel("");
		lblGo.setBounds(312, 193, 61, 76);
		contentPane.add(lblGo);
		
		label_1 = new JLabel("New label");
		label_1.setBounds(0, 0, 61, 16);
		contentPane.add(label_1);
		
		lblDroite = new JLabel("");
		lblDroite.setBounds(299, 148, 31, 38);
		contentPane.add(lblDroite);
		
		btnNewButton = new JButton("New button");
		btnNewButton.setBounds(139, 142, 117, 29);
		contentPane.add(btnNewButton);
		
		/**
		 * Ajouter une image (fond d'écran)
		 */
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 400, 275);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/fonds/fondchoix.jpg"));
		label.setIcon(img);
		contentPane.add(label);
		
		
		
		
	}
}
