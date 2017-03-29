package kapitel10;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FlowLayoutExample extends JFrame {

	private FlowLayoutExample(String title){
		super(title);
		
		
		JLabel halloLabel = new JLabel("Hallo Klau!");
		JButton sendenButton = new JButton("senden");
		
		JPanel hauptPanel = new JPanel(new FlowLayout());
		
		// hauptPanel.setLayout(new FlowLayout()); --> wird schon im Panel Konstruktor gesetzt
		
		hauptPanel.add(halloLabel);
		hauptPanel.add(sendenButton);
		
		
		this.add(hauptPanel);
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
	}
	
	public static void main(String[] args) {
		new FlowLayoutExample("Flow Layout Example UI");

	}

}
