package JogoAranha;



import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class JogoAranha extends JFrame  {
	
	

	JLabel lParede = new JLabel(new ImageIcon(getClass().getResource("Parede.jpg")));
	JLabel lLatadeLixo = new JLabel(new ImageIcon(getClass().getResource("LataDeLixo.png")));
	JLabel lLataAmassada = new JLabel(new ImageIcon(getClass().getResource("LataAmassada.jpg")));
	JLabel lGarrafaPlastica = new JLabel(new ImageIcon(getClass().getResource("GarrafaPlastica.jpg")));
	

	
	int posLataDeLixoX = 20;
	int posLataDeLixoY = 360;
	
	int posLataAmassadaX = 100;
	int posLataAmassadaY = 200;
	
	int posGarrafaPlasticaX = 400;
	int posGarrafaPlasticaY = 100;
	
	
	public JogoAranha() {
		editarJanela();
		editarComponentes();
		addMovimento();
		new Movimento().start();
		}

	public void addMovimento() {
		addKeyListener(new KeyListener() {

			
			public void keyTyped(KeyEvent e) {
				
				
			}

			
			public void keyReleased(KeyEvent e) {

			}

			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==38) {
					posLataDeLixoY -=0;
				}
				if(e.getKeyCode()==40) {
					posLataDeLixoY +=0;
				}
				if(e.getKeyCode()==37) {
					posLataDeLixoX -=15;
				}
				if(e.getKeyCode()==39) {
					posLataDeLixoX +=15;
				}
				lLatadeLixo.setBounds(posLataDeLixoX, posLataDeLixoY,750,525
						
						);
			
			
			}
			
		});
	}
	
		
	
	public void editarComponentes() {
		lParede.setBounds(0,0,1000, 1960);
		lLatadeLixo.setBounds(posLataDeLixoX, posLataDeLixoY, 920, 512);
		lLataAmassada.setBounds(posLataAmassadaX, posLataAmassadaY, 300, 166);
		lGarrafaPlastica.setBounds(posGarrafaPlasticaX, posGarrafaPlasticaY, 300, 186);
		
	}
	
	
		
	
public void editarJanela() {
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(800, 700);
	setLocationRelativeTo(null);
	setVisible(true);
	setLayout(null);
	add(lLatadeLixo);
	add(lGarrafaPlastica);
	add(lLataAmassada);
	add(lParede); 

}


public class Movimento extends Thread{
		public void run() {
			while(true) {
				try {sleep(20);}catch(Exception erro) {}
				lLataAmassada.setBounds(0, lLataAmassada.getY()+3, 300, 166);
				lGarrafaPlastica.setBounds(0, lGarrafaPlastica.getY()+3, 600, 186);
				
			}
			
		}
	
	
}
public static void main(String[]args) {
 new JogoAranha();
 
}
}
