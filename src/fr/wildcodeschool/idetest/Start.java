package fr.wildcodeschool.idetest;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.ImageIcon;
import java.net.URL;
public class Start {
    public static void main(String... args) throws IOException {
        System.out.println(ProcessHandle.current().pid());

        JFrame jf = new JFrame("Gotcha!");
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.add(new JLabel(new ImageIcon(new URL("https://www.jds.fr/medias/image/0-42179800-1496335948-64638-600-600-F.jpg"))));
        jf.pack();
        jf.setVisible(true);
    }
}
