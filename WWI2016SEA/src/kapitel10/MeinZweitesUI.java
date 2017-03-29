package kapitel10;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MeinZweitesUI extends JFrame {

	private MeinZweitesUI (String title){
		super(title);
		
		JPanel hauptPanel = new JPanel();
		hauptPanel.setLayout(new FlowLayout());
		
		JLabel halloLabel = new JLabel("Hello World");
		JButton sendenButton = new JButton("abschicken");
		
		hauptPanel.add(halloLabel);
		hauptPanel.add(sendenButton);
		
		this.add(hauptPanel);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 250, 100);
		
		//this.pack();
		
		
	}
	
	public static void main(String[] args) {
		
		new MeinZweitesUI("Hallo Klaus");

	}

}
