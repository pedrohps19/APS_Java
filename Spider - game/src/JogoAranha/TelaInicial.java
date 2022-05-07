package JogoAranha;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class TelaInicial {

	private JFrame frmColetaDeLixo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial window = new TelaInicial();
					window.frmColetaDeLixo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaInicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmColetaDeLixo = new JFrame();
		frmColetaDeLixo.getContentPane().setForeground(Color.BLACK);
		frmColetaDeLixo.getContentPane().setBackground(Color.GRAY);
		frmColetaDeLixo.setBackground(Color.WHITE);
		frmColetaDeLixo.setTitle("Coleta de lixo");
		frmColetaDeLixo.setBounds(100, 100, 684, 463);
		frmColetaDeLixo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmColetaDeLixo.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Garbage collection");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.ITALIC, 35));
		lblNewLabel.setBounds(200, 107, 286, 46);
		frmColetaDeLixo.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Jogar");
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 29));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(254, 204, 157, 46);
		frmColetaDeLixo.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Créditos");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(254, 260, 157, 37);
		frmColetaDeLixo.getContentPane().add(btnNewButton_1);
	}
}
