import javax.swing.*;
import java.util.Date;
import java.awt.BorderLayout;
import java.awt.Color;


public class DateTimeApp extends JFrame implements Runnable {
    Thread th; 
    Date d= new Date();
    JLabel timeLabel = new JLabel();

    public DateTimeApp() {
        // timeLabel.setBackground(Color.green);
        this.setTitle("Date & Time Frame Application");
        timeLabel.setHorizontalAlignment(JLabel.CENTER);
        timeLabel.setText(d.toString());
        this.add(timeLabel, BorderLayout.CENTER);
        th = new Thread(this);
        th.start();
    }

    public static void main(String[] args) {
        DateTimeApp app = new DateTimeApp();
        app.setBounds(50, 50, 600, 400);
        app.setVisible(true);
    }

    public void run() {
        while (true) {
            timeLabel.setText(d.toString());
            try {
                Thread.sleep(1000); // Update every second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
