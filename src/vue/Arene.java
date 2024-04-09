package vue;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;

public class Arene extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Arene frame = new Arene();
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
	public Arene() {
		
		
		setForeground(new Color(238, 238, 238));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Arene.class.getResource("/fonds/fondarene.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1124, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(238, 238, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		/**
		 * Dimension de la fenêtre en fonction de la taille de l'arène 
		 */
		
		this.getContentPane().setPreferredSize(new Dimension(800, 600));
		this.pack();
		
		/**
		 * Ajouter une image 
		 */
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 1037, 591);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/fonds/fondarene.jpg"));
		contentPane.setLayout(null);
		label.setIcon(img);
		contentPane.add(label);
	}
}
