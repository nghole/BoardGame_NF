package GameMain;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

public class GUI_Ingame extends JPanel implements MouseListener{
	private static GUI_Ingame _instance;
	public static GUI_Ingame getInstace() {
		if(_instance==null) _instance = new GUI_Ingame();
		return _instance;
	}
	
	private GUI_Ingame() {
		this.addMouseListener(this);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawRect(0, 0, 300, 500);
	}

	@Override
	public void mouseClicked(MouseEvent e){
		// TODO Auto-generated method stub
		System.out.println("¿Œ∞‘¿”");
		
	}

	@Override
	public void mouseEntered(MouseEvent e){
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e){
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e){
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e){
		// TODO Auto-generated method stub
		
	}
}
