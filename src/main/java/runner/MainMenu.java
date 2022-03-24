package runner;

import runner.controller.Command;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {

    public MainMenu(ActionListener listener) {
        super("PROYECTO LF");
        setSize(520, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        fill(listener);
        setVisible(true);
    }

    private void fill(ActionListener listener){
        JPanel panel = new JPanel(new GridLayout(4,1));
        JButton btnNDFA = new JButton("Autómatas deterministas y no deterministas");
        btnNDFA.setActionCommand(Command.NDFA_AUTOMATON.name());
        btnNDFA.addActionListener(listener);
        panel.add(btnNDFA);

        JButton btnPushdown = new JButton("Autómatas de pila");
        btnPushdown.setActionCommand(Command.PUSHDOWN_AUTOMATON.name());
        btnNDFA.addActionListener(listener);
        panel.add(btnPushdown);

        this.add(panel);
    }
}
