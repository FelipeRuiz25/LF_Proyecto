package NDFA_GUI.views.main_frame;

import NDFA_GUI.controller.ControlAutomata;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CanvasFA canvas;
	private NorthPanel menuBarr;

	public MainFrame(ActionListener actionListener) {
		this.canvas = new CanvasFA(300, 300, (ControlAutomata) actionListener);
		this.menuBarr = new NorthPanel(actionListener);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setSize(800, 800);
		this.initComponents();
		this.setVisible(true);
	}

	private void initComponents() {
		this.add(canvas, BorderLayout.CENTER);
		this.add(menuBarr, BorderLayout.NORTH);
	}

	public void restartAutomaton() {
		canvas.restartAutomaton();
	}

	public void showMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
}