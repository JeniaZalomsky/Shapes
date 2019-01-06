import java.awt.Color;
import java.awt.Graphics;

public class Shape {
	protected Color shapeColor;
	protected int left,top,right,bottom;
	protected String name;
	protected boolean captured;
	protected Eye left_eye, right_eye;
	
	public Shape(){
		this(0, 20, 200, 120, "***");
	}
	public Shape( int l, int t,int r, int b, String name){
		this(l,t,r,b,name,new Color(150,150,150));
	}
	
	public Shape(int l, int t,int r, int b, String name,Color c){
		shapeColor = c;
		left=l;
		top = t; 
		right = r;
		bottom =b;
		this.name = name;
		captured = false;
		// eyes
		int radx = (right-left)/2;
		int rady = (bottom-top)/2;
		left_eye = new Eye(left+radx-5-2*radx/3,
								top+rady-rady/3,radx/3,500,500);
		right_eye = new Eye(left+radx+5,
				top+rady-rady/3,radx/3,500,500);
	}
	
	public void drawMe(Graphics g){
		g.setColor(shapeColor);
		g.drawString(name, (left+right)/2-10, top-10);
		left_eye.drawMe(g);
		right_eye.drawMe(g);
	}
	
	public void updateEyes(int mx, int my){
		left_eye.updateMouse(mx, my);
		right_eye.updateMouse(mx, my);
	}

	
}
