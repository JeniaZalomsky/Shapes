import java.awt.Color;
import java.awt.Graphics;

public class TriUp extends Shape {
	public TriUp(int left,int top,int right,int bottom){
		this.left = left;
		this.top = top;
		this.right = right;
		this.bottom = bottom;
		
	}
	public TriUp(int left,int top,int right,int bottom,String name,Color c){
		super(left,top,right,bottom,name,c);
	}

	public TriUp(int left,int top,int right,int bottom,String name){
		super(left,top,right,bottom,name); // actually shape
	}
	
	public void drawMe(Graphics g){
		int [] x  = new int[3];
		int [] y  = new int[3];
		x[0] = left; y[0] = bottom;
		x[1] = (left+right)/2; y[1] = top;
		x[2] = right; y[2] = bottom;
		
		g.setColor(shapeColor);
		g.fillPolygon(x, y, 3);
		super.drawMe(g);// Shape.drawMe();
	}

}
