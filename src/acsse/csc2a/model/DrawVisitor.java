/**
 * 
 */
package acsse.csc2a.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * @author kgosi
 *
 */
public class DrawVisitor implements IDrawVisitor{
	@Override
	public void draw(Planet planet, GraphicsContext g) {
		//draw planet
		g.setFill(planet.getColor());
		g.fillOval(planet.getPosition().getX(),planet.getPosition().getY(),
				   planet.getRadius(),planet.getRadius());
	}

	@Override
	public void draw(SpaceShip spaceship, GraphicsContext g) {
		//draw spaceship
		g.setFill(Color.GREEN);
		g.fillRect(spaceship.getPosition().getX(),spaceship.getPosition().getY(),
				   100,35);
		//write name of spaceship
		g.setFill(Color.ALICEBLUE);
		g.fillText(spaceship.getName(),spaceship.getPosition().getX()+9, 
				   spaceship.getPosition().getY()+18);
	}

}
