package gbittner.Controller;
import gbittner.View.*;
import gbittner.Model.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
public class Controller implements ActionListener {
    private final GrafikFrame frame;
    private final GewinnModel model;
    public controller() {
        this.frame = new GrafikFrame(this);
        this.model = new GewinnModel();
    }
}