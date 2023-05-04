/**
 * 
 */
package acsse.csc2a.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import acsse.csc2a.model.Planet;
import acsse.csc2a.model.SpaceShip;
import javafx.scene.paint.Color;

/**
 * @author kgosi
 *
 */
public class FileIO {

	/**
	 * Create readPlanet Method
	 * @param handle
	 * @return list of planets
	 */
	public static ArrayList<Planet> readPlanet(File handle) {
		    ArrayList<Planet>listPlanet=new ArrayList<>();
		    try(Scanner txtIn=new Scanner(handle)){
		    	while(txtIn.hasNext()) {
		    	    String[] PlanetProperties = txtIn.nextLine().split(" ");
	                String PlanetName = PlanetProperties[0];
	                Color Col = stringToColor(PlanetProperties[1]);
	                double x_position = Double.parseDouble(PlanetProperties[2]);
	                double y_position = Double.parseDouble(PlanetProperties[3]);
	                int radius = Integer.parseInt(PlanetProperties[4]);

	                //Adding the Planet to the array
	                listPlanet.add(new Planet(PlanetName,Col, x_position, y_position, radius));
		    	}
		    } catch (FileNotFoundException fnfex) {
		      System.err.println("Could not find file "+handle);
			}
		    catch(Exception e) {
		    	e.printStackTrace();
		    }
				return listPlanet;
	}
	/**
	 * Create readShip method
	 * @param handle
	 * @return list of Spaceships
	 */
	public static ArrayList<SpaceShip> readSpaceShip(File handle) {
    ArrayList<SpaceShip>listSpaceShip=new ArrayList<>();
    try(Scanner txtIn=new Scanner(handle)){
    	while(txtIn.hasNext()) {
    		String line=txtIn.nextLine();
    		
    		StringTokenizer tokens=new StringTokenizer(line," ");
    		double xpos=Double.parseDouble(tokens.nextToken());
    		double ypos=Double.parseDouble(tokens.nextToken());
    		String ID=tokens.nextToken();
    		StringBuilder builder = new StringBuilder();
    		while (tokens.hasMoreElements()) {
    		    builder.append(" ").append(tokens.nextToken());
    		}
    		String name = builder.toString();
    		
    		//Add spaceship to the array
    		listSpaceShip.add(new SpaceShip(ID,name,xpos,ypos));
    		
    	}
    } catch (FileNotFoundException fnfex) {
      System.err.println("Could not find file "+handle);
	}
    catch(Exception e) {
    	e.printStackTrace();
    }
		return listSpaceShip;
	}
	/**
	 * Create method to convert StringtoColor
	 * @param nextToken
	 * @return
	 */
	private static Color stringToColor(String strColor) {
		return switch(strColor) {
		case "Gray" -> Color.GREY;
		case "Green" -> Color.GREEN;
		case "Yellow" ->Color.YELLOW;
		case "Blue" ->Color.BLUE;
		case "Brown" ->Color.BROWN;
		case "Pink" ->Color.PINK;
		case "Red" ->Color.RED;
		default->Color.GREY;
		};
		
	}

}
