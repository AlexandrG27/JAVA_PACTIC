package animatiom;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.WindowConstants;
public class GIF extends JFrame
{
    private JLabel imgLabel;
    private int imgNum = 1;

    private Animation()
    {
        this.setSize(1920, 1080);
        imgLabel = new JLabel("", new ImageIcon(getClass().getResource("1.jpeg")), SwingConstants.CENTER);

        getContentPane().add(imgLabel);

        Timer timer = new Timer(2000, e -> nextImg());
        timer.start();
    }
    private void nextImg(){
        imgLabel.setIcon(new ImageIcon(getClass().getResource((++imgNum)+".jpeg")));
        if(imgNum == 5) imgNum = 0;

    }
    public static void main(String[] args)
    {
        Animation mf = new Animation();
        mf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mf.setVisible(true);

    }
}