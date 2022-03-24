package runner.controller;

import NDFA_GUI.controller.ControlAutomata;
import runner.MainMenu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Controller implements ActionListener {

    private MainMenu menu;
    private ControllerWindowAdapter adapter;

    public Controller() {
        adapter = new ControllerWindowAdapter();
        menu = new MainMenu(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Command action = Command.valueOf(e.getActionCommand());
        switch (action){
            case NDFA_AUTOMATON:
                new ControlAutomata(adapter);
                menu.setVisible(false);
                break;
            case PUSHDOWN_AUTOMATON:
                break;
        }
    }

    private class ControllerWindowAdapter extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            Object o = e.getSource();
            if (o instanceof JFrame){
                System.out.println("XFFFFFFFFFFFF");
                ((JFrame) o).dispose();
                ((JFrame) o).setVisible(false);
            }
            menu.setVisible(true);
        }
    }
}
