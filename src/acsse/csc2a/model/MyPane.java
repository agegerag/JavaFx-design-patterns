/**
 * 
 */
package acsse.csc2a.model;

import java.io.File;
import java.util.ArrayList;

import acsse.csc2a.file.FileIO;
import javafx.geometry.Pos;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import acsse.csc2a.model.MyCanvas;
import javafx.scene.layout.StackPane;

/**
 * @author kgosi
 *
 */
public class MyPane extends StackPane{
	private ArrayList<Planet> listPlanet=new ArrayList<>();
	private ArrayList<SpaceShip> listSpaceShip=new ArrayList<>();
	private MyCanvas canvasDisplay;
	public MyPane() {
		//Create menu bar
				MenuBar menubar=new MenuBar();
				Menu theMenu=new Menu("File");
				
				//add the menu to the Menu bar
				menubar.getMenus().add(theMenu);
				setAlignment(menubar,Pos.TOP_LEFT);
				
				//menu Item for planets
				MenuItem m1=new MenuItem("Open Planets");
				//menu Item for spaceships
				MenuItem m2=new MenuItem("Open Space Ships");
				
				//make canvas
				this.canvasDisplay=new MyCanvas();
				setAlignment(this.canvasDisplay,Pos.BOTTOM_LEFT);
				
				//Add menu Items to the menu
				theMenu.getItems().add(m1);
				theMenu.getItems().add(m2);
				
				//adding an action listener for the "Open" menu items
				m1.setOnAction(e -> {
					this.listPlanet=FileIO.readPlanet(new File("data/planets.txt"));
					this.canvasDisplay.repaintCanvas(this.listSpaceShip,this.listPlanet);
				});
				m2.setOnAction(e -> {
					this.listSpaceShip=FileIO.readSpaceShip(new File("data/spaceships.txt"));
					this.canvasDisplay.repaintCanvas(this.listSpaceShip,this.listPlanet);
					});
				
				this.getChildren().addAll(this.canvasDisplay,menubar);
				this.setWidth(this.canvasDisplay.getWidth());
				this.setHeight(menubar.getHeight()+500);
	}
}
