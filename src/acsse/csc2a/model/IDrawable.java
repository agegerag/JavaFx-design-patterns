/**
 * 
 */
package acsse.csc2a.model;

import javafx.scene.canvas.GraphicsContext;

/**
 * @author kgosi
 *
 */
public interface IDrawable {
	/**
	 * Accepts a concrete IDrawVisitor instance.
	 * 
	 * @param visitor The concrete IDrawVisitor instance.
	 */
	void accept(IDrawVisitor visitor,GraphicsContext g);
}
