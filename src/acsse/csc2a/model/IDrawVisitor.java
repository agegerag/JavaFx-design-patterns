/**
 * 
 */
package acsse.csc2a.model;

import javafx.scene.canvas.GraphicsContext;

/**
 * @author kgosi
 *
 */
public interface IDrawVisitor{
	/**
	 * Draws an Oval shape with dimensions and style for Planet
	 * 
	 * @param planet and g instances
	 */
	void draw(Planet planet,GraphicsContext g);
	/**
	 * Draws a Rectangle shape with dimensions and style for SpaceShip
	 * 
	 * @param spaceship and g instances
	 */
	void draw(SpaceShip spaceship,GraphicsContext g);
}
