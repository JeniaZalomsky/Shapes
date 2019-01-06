import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JPanel;

public class DrawPanel extends JPanel {
//	private Shape s;
//	private Eye el, er;
	private RoundShape rs;
	private TriUp tu;
	private TriDown td;
	
	public DrawPanel(){
/*		s = new Shape();
		el = new Eye(20,20,30,500,500);
		er = new Eye(90,20,30,500,500);
*/
		rs = new RoundShape(100,100,200,200,"Lulu",Color.BLUE);
		tu = new TriUp(300,200,400,300,"Tsipi",Color.MAGENTA);
		td = new TriDown(200,350,300,450,"Kuku",new Color(0,160,0));
		
		addMouseListener(new MyMouse());
		addMouseMotionListener(new MyMouse());
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		rs.drawMe(g);
		tu.drawMe(g);
		td.drawMe(g);
//		el.drawMe(g);
//		er.drawMe(g);
	}
	
	private class MyMouse extends MouseAdapter{
		public void mouseClicked(MouseEvent ev){
			int x = ev.getX();
			int y = ev.getY();
			repaint();
		}
		
		public void mouseMoved(MouseEvent ev){
			int x = ev.getX();
			int y = ev.getY();
			
			rs.updateEyes(x, y);
			tu.updateEyes(x, y);
			td.updateEyes(x, y);
//			el.updateMouse(x, y);
//			er.updateMouse(x, y);
			repaint();
		}
	
	}// MyMouse

}// DrawPanel
