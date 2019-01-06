import java.awt.Color;
import java.awt.Graphics;

public class RoundShape extends Shape {
	public RoundShape(int left,int top,int right,int bottom){
		this.left = left;
		this.top = top;
		this.right = right;
		this.bottom = bottom;
		// what about color and name?
	}
	public RoundShape(int left,int top,int right,int bottom,String name,Color c){
		super(left,top,right,bottom,name,c);
	}

	public RoundShape(int left,int top,int right,int bottom,String name){
		super(left,top,right,bottom,name); // actually shape
	}
	
	public void drawMe(Graphics g){
		g.setColor(shapeColor);
		g.fillOval(left, top, right-left, bottom-top);
		super.drawMe(g);// Shape.drawMe();
	}
	
}
