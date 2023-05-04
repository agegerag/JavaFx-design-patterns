/**
 * 
 */
package acsse.csc2a.model;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * @author kgosi
 *
 */
public class Planet implements IDrawable{
private final String name;
private final Color color;
private final int radius;
private final Point2D planetPosition;
public Planet(String name,Color color,double xpos,double ypos,int radius) {
	this.name=name;
	this.color=color;
	this.radius=radius;
	this.planetPosition=new Point2D(xpos,ypos);
}
public String getName() {
	return name;
}
public Color getColor() {
	return color;
}
public int getRadius() {
	return radius;
}
public Point2D getPosition() {
	return planetPosition;
}
@Override
public void accept(IDrawVisitor visitor,GraphicsContext g) {
	visitor.draw(this, g);
}
}
