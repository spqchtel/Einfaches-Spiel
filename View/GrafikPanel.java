package gbittner.View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.prefs.NodeChangeListener;
public class GrafikPanel extends JPanel {
    private final JButton nochmal;
    private final JLabel rundenErgebnis;
    private final JLabel gesamtPunkte;
    private final JTextField eingabe;
    private final JTextField computerPunkte;

    public GrafikPanel() {
        this.setLayout(new BorderLayout());
        JPanel northPanel = new JPanel();
        JPanel centerPanel = new JPanel();
        JPanel southPanel = new JPanel();

        northPanel.setLayout(new GridLayout(3,2,4,4));
        northPanel.add(new JLabel("Rundenergbnis:",JLabel.CENTER));
        northPanel.add(new JLabel("Gesamtpunkte:"),JLabel.CENTER);
        rundenErgebnis = new JLabel("Gib eine Zahl von 1-9 ein:",JLabel.CENTER);
        rundenErgebnis.setOpaque(true);
        rundenErgebnis.setBackground(new Color(255,255,255));
        gesamtPunkte = new JLabel("Gesamtpunkte:");
        gesamtPunkte.setOpaque(true);
        gesamtPunkte.setBackground(new Color(255,255,255));
        northPanel.add(rundenErgebnis);
        northPanel.add(gesamtPunkte);
        northPanel.add(new JLabel("Deine Zahl", JLabel.CENTER));
        northPanel.add(new JLabel("Computerzahl", JLabel.CENTER));

        centerPanel.setLayout(new GridLayout(1,2,4,4));
        eingabe = new JTextField();
        eingabe.setHorizontalAlignment(JTextField.CENTER);
        centerPanel.add(eingabe);
        computerPunkte = new JTextField(); 
        computerPunkte.setHorizontalAlignment(JTextField.CENTER);

        computerPunkte.setEditable(false);
        centerPanel.add(computerPunkte);

        nochmal = new JButton("nochmal");
        nochmal.setEnabled(false);
        southPanel.setLayout(new FlowLayout());
        southPanel.add(nochmal);

        this.nochmal.addActionListener();
        this.nochmal.setActionCommand("btn");
        this.eingabe.addActionListener(controller);
        this.nochmal.setActionCommand("eingabe");
        
        this.add(northPanel, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);
        this.add(southPanel, BorderLayout.SOUTH);
    }
    public void setEingabeEditable() {
        this.eingabe.setEditable(true);
    }
    public void setNochmalEnabled() {
        this.nochmal.setEnabled(true);
    }
    public String getEingabeValue() {
        return this.eingabe.getText().trim();
    }
    public void setEingabeValue(String eingabeValue) {
        this.eingabe.setText(eingabeValue);
    }
    
    public void setErgebnis(String rundenErgebnis) {
        this.rundenErgebnis.setText(rundenErgebnis);
    }   
    public void setErgebnis(Color color) {
        this.rundenErgebnis.setBackground(color);
    }
    public void setGesamtPunkte(String gesamtPunkte) {
        this.gesamtPunkte.setText(gesamtPunkte);
    }
    public void setcomputerPunkte(String ComputerPunkte) {
        
    }
    
}