package gbittner.controller;
import gbittner.model.*;
import gbittner.view.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Controller implements ActionListener {
    private final GrafikFrame frame;
    private GewinnModel model;
    public Controller() {
        this.frame = new GrafikFrame(this);
        this.model = new GewinnModel();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        boolean hatGewonnen = false;
        boolean hatVerloren = false;
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
                panel.setRundenErgebnis( new Color(0,255,0));
                panel.setGesamtPunkte(new Color(0,255,0));
                hatGewonnen = true;

            }
            else if(model.hatVerloren()) {
                panel.setErgebnis("Verloren");
                panel.setRundenErgebnis( new Color(255,0,0));
                panel.setGesamtPunkte(new Color(255,0,0));
                hatVerloren = true;

            }
            else {
                panel.setErgebnis(Integer.toString(model.getRundenErgebnis()));
                if( model.getRundenErgebnis() > 0) {
                    panel.setRundenErgebnis(new Color(0,255,0));
                    panel.setGesamtPunkte(new Color (0,255,0));;
                }
                if(model.getRundenErgebnis() < 0) {
                    panel.setRundenErgebnis(new Color(255,0,0));
                    panel.setGesamtPunkte(new Color (255,0,0));;

                }
            }
            panel.setcomputerPunkte(Integer.toString(model.getComputerZahl()));
            panel.setGesamtPunkte(Integer.toString(model.getGesamtPunkte()));


            
        
        }
        else if(e.getActionCommand().equals("btn")) {
            panel.setRundenErgebnis(new Color(255,255,255));
            panel.setEingabeEditable(true);
            panel.setNochmalEnabled(false);
            panel.setcomputerPunkte("");
            panel.setErgebnis("");
            panel.setEingabeValue("");
            if(hatGewonnen = true || hatVerloren == true)
            model = new GewinnModel();
            panel.setGesamtPunkte(new Color(255,255,255));
            panel.setRundenErgebnis(new Color(255,255,255));
        }
    }
    public static void main(String[] args) {
        new Controller();
    }
}