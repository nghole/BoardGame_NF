package GameMain;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

public class GUI_Waitingroom extends JPanel implements MouseListener{
	private static GUI_Waitingroom _instance;
	public static GUI_Waitingroom getInstace() {
		if(_instance==null) _instance = new GUI_Waitingroom();
		return _instance;
	}
	
	private GUI_Waitingroom() {
		this.addMouseListener(this);
	}
	@Override
	public void paint(Graphics g) {
		g.drawRect(30, 50, 300, 500);
	}
	@Override
	public void mouseClicked(MouseEvent arg0){
		// TODO Auto-generated method stub
		System.out.println("´ë±â½Ç");
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0){
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0){
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0){
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0){
		// TODO Auto-generated method stub
		
	}

}
