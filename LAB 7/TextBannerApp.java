import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;

class TextBanner extends JFrame implements Runnable {
Thread th;
JLabel javaLabel = new JLabel();

public TextBanner(){
        javaLabel.setText("Java World!");
        javaLabel.setFont(new Font("Serif", Font.BOLD, 100));
        javaLabel.setBounds(0, 0, 600, 30);
        this.setLayout(null); 
        this.add(javaLabel);
        th = new Thread(this);
        th.start();
}
    public static void main(String[] args) {
        TextBanner app = new TextBanner();
        app.setBounds(0, 0, 600, 400);
        app.setVisible(true);
    }

    public void run() {
        int w = this.getWidth();
        int x = 0;
        javaLabel.setBounds(x,0,600,30);
        while (true) {
            x += 60;
            if (x >= w) x = 0 ;
            javaLabel.setBounds(x, 0, 600, 30);
            try {
                Thread.sleep(200); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
}
}