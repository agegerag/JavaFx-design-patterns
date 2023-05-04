/**
 * 
 */
package acsse.csc2a.model;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;

/**
 * @author kgosi
 *
 */
public class SpaceShip extends Ship implements IDrawable{
	
private Point2D shipPosition;
	public SpaceShip(String iD, String name,double xpos,double ypos) {
		super(iD, name);
	this.shipPosition=new Point2D(xpos,ypos);
	}
	public Point2D getPosition() {
		return shipPosition;
	}
	@Override
	public void accept(IDrawVisitor visitor,GraphicsContext g) {
		visitor.draw(this, g);
	}

}
