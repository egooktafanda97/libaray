import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author BLANK
 */
 // kode ikon sudah ada di scrip lain
public class awasame {
    public static void icnLabel(JLabel lab,String icn){
        try {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
        }
        try (InputStream is = fonts.class.getResourceAsStream("../font/fontawesome-webfont.ttf")) {
            Font font = Font.createFont(Font.TRUETYPE_FONT, is);
            font = font.deriveFont(Font.PLAIN, 24f);
            lab.setText(icn);
            lab.setFont(font);
            }catch (IOException | FontFormatException exp) {
            exp.printStackTrace();
            } 
    }
    public static void aws(JLabel lab,String icn,String Colors){
        try {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
        }
        try (InputStream is = fonts.class.getResourceAsStream("../font/fontawesome-webfont.ttf")) {
            Font font = Font.createFont(Font.TRUETYPE_FONT, is);
            font = font.deriveFont(Font.PLAIN, 24f);
            lab.setText(icn);
            lab.setFont(font);
            lab.setForeground(Color.decode(Colors));
            }catch (IOException | FontFormatException exp) {
            exp.printStackTrace();
            } 
    }
}
