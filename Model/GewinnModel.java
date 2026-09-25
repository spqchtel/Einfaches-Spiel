package gbittner.Model;
import java.util.Random;

public class GewinnModel {
    private int gesamtpunkte;
    private int spielerZahl;
    private int computerZahl;
    private int rundenErgebnis;
    private Random rand = new Random();
    

    public GewinnModel() {
        gesamtpunkte = 30;
    }
    public void berechneComputerZahl() {
        computerZahl = rand.nextInt(1,10);
    }
    public int getComputerZahl() {
        return computerZahl;
    
    }
    public int getGesamtPunkte() {
        return gesamtpunkte;
    }
    public boolean hatGewonnen() {
        if(gesamtpunkte >= 100) {
            return true;
        }
        return false;
    }
    public boolean hatVerloren() {
        if(gesamtpunkte <= 0) {
            return true;
        }
        return false;
    }
    public int getRundenErgebnis() {
        return rundenErgebnis;
    }
    public void berechneErgebnis(int spielerZahl) {
        if (spielerZahl == computerZahl) {
            gesamtpunkte += 20;
            
            return;
        }
        if(spielerZahl - 1 == computerZahl || spielerZahl + 1 == computerZahl) {
            gesamtpunkte += 10;
            return;
        }
        gesamtpunkte -= 10;
        
        
    }


}