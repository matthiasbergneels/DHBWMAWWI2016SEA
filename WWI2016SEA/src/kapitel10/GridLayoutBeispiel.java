package kapitel10;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLayoutBeispiel extends JFrame {
	
	private GridLayoutBeispiel(String title){
		super(title);
		
		JPanel hauptPanel = new JPanel(new GridLayout(0, 2));
		
		for(int i = 0; i < 10; i++){
			JPanel subPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
			JButton button = new JButton("Button " + i);
			subPanel.add(button);
			hauptPanel.add(subPanel);
		}
		
		
		
		this.add(hauptPanel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {
		
		new GridLayoutBeispiel("Grid Layout Beispiel");

	}

}
