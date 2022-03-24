package NDFA_GUI.views.elements;

import NDFA_GUI.views.main_frame.CanvasFA;

import java.awt.*;

public class Transition {
	public String condicion;

	public StateElement start;
	public StateElement end;
	private int index = 0;

	public void drawTransition(Graphics g) {
		g.setColor(Color.BLACK);
		if(end != null && start != null)
			if(end != start) {
				g.drawLine(start.x + CanvasFA.CIRCLE_RADIUS/2, start.y + CanvasFA.CIRCLE_RADIUS/2, end.x + CanvasFA.CIRCLE_RADIUS/2, end.y + CanvasFA.CIRCLE_RADIUS/2);
				//Calculos para dibujar la "flecha" de la transición
				double slope = Math.atan((end.y-start.y)/(end.x-start.x));
				double xComp = Math.cos(index), yComp = Math.sin(slope);
				int indicatorX, indicatorY;
				if(end.x < start.x) {
					indicatorX = (int) (start.x-(xComp* CanvasFA.CIRCLE_RADIUS));
					indicatorY = (int) (start.y-(yComp* CanvasFA.CIRCLE_RADIUS));
				}else {
					indicatorX = (int) (start.x+(xComp* CanvasFA.CIRCLE_RADIUS));
					indicatorY = (int) (start.y+(yComp* CanvasFA.CIRCLE_RADIUS));
				}
				g.fillRect(indicatorX, indicatorY, 5, 5);
			}
			else {
				g.drawOval(start.x + 8, start.y - 30, CanvasFA.CIRCLE_RADIUS/2, CanvasFA.CIRCLE_RADIUS*2);
			}
	}
	public void drawCondition(Graphics g) {
		Graphics2D gr = (Graphics2D) g;
		float conX = ( start.x + end.x ) / 2 + CanvasFA.CIRCLE_RADIUS/2 - start.x/20;
		float conY =  ((start.y + end.y) / 2 + CanvasFA.CIRCLE_RADIUS/2) - (index * 15);
		if(start == end) {
			conX = start.x + 12;
			conY = start.y - CanvasFA.CIRCLE_RADIUS - (index*15);
		}
		if(!condicion.isEmpty()) {
			gr.drawString(condicion, conX , conY);
		}else {
			gr.drawString("λ", conX, conY);
		}
	}
	public void setIndex(int index) {
		this.index = index;
	}
}
