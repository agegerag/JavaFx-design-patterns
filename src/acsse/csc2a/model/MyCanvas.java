/**
 * 
 */
package acsse.csc2a.model;

import java.util.ArrayList;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * @author kgosi
 *
 */
public class MyCanvas extends Canvas{
private GraphicsContext g;

public MyCanvas() {
	this.g=this.getGraphicsContext2D();
	
	//set dimensions
	this.setWidth(1500);
	this.setHeight(500);
	// space background
	g.setFill(Color.WHITE);
	g.fillRect(0,0, this.getWidth(), this.getHeight());
}

/**
 * Create repaintCanvas method
 * @param listSpaceShip
 * @param listPlanet
 */
void repaintCanvas(ArrayList<SpaceShip> listSpaceShip, ArrayList<Planet> listPlanet) {
	DrawVisitor drawer=new DrawVisitor();
	for(Planet p:listPlanet) {
		p.accept(drawer, g);
	}
	for(SpaceShip s:listSpaceShip) {
		s.accept(drawer, g);
	}
}
}
