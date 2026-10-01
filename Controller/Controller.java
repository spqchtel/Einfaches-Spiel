package gbittner.controller;
import gbittner.model.*;
import gbittner.view.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Controller implements ActionListener {
    private final GrafikFrame frame;
    private final GewinnModel model;
    public Controller() {
        this.frame = new GrafikFrame(this);
        this.model = new GewinnModel();
    }
 

    @Override
    public void actionPerformed(ActionEvent e) {
        GrafikPanel panel = frame.getPanel();
        if(e.getActionCommand().equals("eingabe")) {
            int i;
            
            try {
                i = Integer.parseInt(panel.getEingabeValue());
            }
            catch(NumberFormatException a) {
                return;
            }
            model.berechneErgebnis(i);
            panel.setEingabeEditable(false);
            panel.setNochmalEnabled(true);
            if(model.hatGewonnen()) {
                panel.setErgebnis("Gewonnen");
            }
            else if(model.hatVerloren()) {
                panel.setErgebnis("Verloren");
            }
            else {
                panel.setErgebnis(Integer.toString(model.getRundenErgebnis()));
            }
            panel.setcomputerPunkte(Integer.toString(model.getRundenErgebnis()));
            panel.setGesamtPunkte(Integer.toString(model.getGesamtPunkte()));
            
        
        }
        else if(e.getActionCommand().equals("btn")) {
            panel.setEingabeEditable(true);
            panel.setNochmalEnabled(false);
            panel.setcomputerPunkte("");
            panel.setErgebnis("");
            panel.setEingabeValue("");
        }
    }
    public static void main(String[] args) {
        new Controller();
    }
}