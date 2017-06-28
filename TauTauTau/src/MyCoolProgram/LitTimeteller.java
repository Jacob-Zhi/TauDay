package MyCoolProgram;


import java.util.Calendar;
import java.util.Date;

import javax.swing.*;

//This timeteller is thoroughly lit!
public class LitTimeteller {
	public static void main(String [] args) throws InterruptedException {
		Calendar litCal = Calendar.getInstance();
		Date stringTime = litCal.getTime();


		JFrame frame = new JFrame("Lit Timeteller");

		JPanel panel = new JPanel();

		JLabel label = new JLabel();



		panel.add(label);

		frame.add(panel);
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		label.setText(String.valueOf(stringTime));
	}
}
