package kapitel10;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MeinErstesUI {

	
	public static void main(String[] args) {
	
		JFrame fenster = new JFrame("Mein Fenster");
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Hello World!");
		JButton button = new JButton("drück mich!");
		
		fenster.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		fenster.add(label);
		fenster.add(button);
		
		
		fenster.setVisible(true);
		fenster.pack();

	}

}
