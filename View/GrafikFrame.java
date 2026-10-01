package gbittner.View;
import java.awt.event.ActionListener;
import javax.swing.*;
public class GrafikFrame extends JFrame {
    private final GrafikPanel panel;
    public GrafikFrame(ActionListener controller) {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new GrafikPanel();
        this.add(panel);
        this.setVisible(true);
        this.setSize(400,400);
    }
    public GrafikPanel getPanel() {
        return panel;
    }

}