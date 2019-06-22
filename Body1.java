package term_proj;

//Body1.java

import java.awt.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.*;

public class Body1 extends JPanel {
	private JButton button;
	private PictureChange ch;
	private ImageIcon img,img2;
	private JLabel la1, la2;
	private JTextField tf;
	private JPasswordField pf;

	public Body1(PictureChange temp) {
		setLayout(null);
		ch = temp;

		la1 = new JLabel("ID");
		la2 = new JLabel("PW");
		tf = new JTextField();
		pf = new JPasswordField();

		setPreferredSize(new Dimension(500, 300));
		img = new ImageIcon("C:/Users/Gram11/eclipse-workspace/Termproject/src/Background1.gif");
		ImageIcon normalIcon = new ImageIcon("C:/Users/Gram11/eclipse-workspace/Termproject/src/login1.png"); 
		ImageIcon rolloverIcon = new ImageIcon("C:/Users/Gram11/eclipse-workspace/Termproject/src/login2.png"); 
		ImageIcon pressedIcon = new ImageIcon("C:/Users/Gram11/eclipse-workspace/Termproject/src/login2.png");
		la1.setBounds(120, 40, 50, 20);
		la1.setForeground(Color.pink);
		la1.setFont(new Font("Serif", Font.BOLD, 15));
		tf.setBounds(150, 40, 200, 35);
		add(la1);
		add(tf);

		la2.setBounds(120, 120, 50, 20);
		la2.setForeground(Color.pink);
		la2.setFont(new Font("Serif", Font.BOLD, 15));
		pf.setBounds(150, 120, 200, 35);
		add(la2);
		add(pf);

		button = new JButton("sign in", normalIcon);
		button.setSize(130, 50); 
		button.setLocation(180, 200); 
		button.setPressedIcon(pressedIcon);
		button.setRolloverIcon(rolloverIcon);
		button.addActionListener(new ChangeListener());
		add(button);
	}

	public void paintComponent(Graphics g)
    {
		super.paintComponent(g);
        g.drawImage(img.getImage(), 0, 0, this);
       
    }

	private class ChangeListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			ch.change("picture2");
		}
	}
}
