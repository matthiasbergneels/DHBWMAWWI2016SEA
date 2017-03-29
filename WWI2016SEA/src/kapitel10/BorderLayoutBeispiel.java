package kapitel10;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutBeispiel extends JFrame {

	private BorderLayoutBeispiel(String title){
		super(title);
		
		JPanel hauptPanel = new JPanel(new BorderLayout());
		
		
		JButton nordButton = new JButton("Norden");
		JButton suedButton = new JButton("Süden");
		JButton westButton = new JButton("Westen");
		JButton ostButton = new JButton("Osten");
		JButton mitteButton = new JButton("Mitte");
		
		JPanel nordPanel = new JPanel(new FlowLayout());
		nordPanel.add(nordButton);
		JPanel suedPanel = new JPanel(new FlowLayout());
		suedPanel.add(suedButton);
		JPanel ostPanel = new JPanel(new FlowLayout());
		ostPanel.add(ostButton);
		JPanel westPanel = new JPanel(new FlowLayout());
		westPanel.add(westButton);
		JPanel mittePanel = new JPanel(new FlowLayout());
		mittePanel.add(mitteButton);
		
		hauptPanel.add(suedPanel, BorderLayout.SOUTH);
		hauptPanel.add(nordPanel, BorderLayout.NORTH);
		hauptPanel.add(westPanel, BorderLayout.WEST);
		hauptPanel.add(ostPanel, BorderLayout.EAST);
		hauptPanel.add(mittePanel, BorderLayout.CENTER);
		
		
		
		this.add(hauptPanel);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
		new BorderLayoutBeispiel("Border Layout Beispiel");

	}

}
