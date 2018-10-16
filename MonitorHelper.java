package app;

import java.util.*;

/**
 * Helper class for drone operations *** DO NOT MODIFY ***
 * @author m19com
 * @version 1.0 - 20/6/2018
 */
public class MonitorHelper 
{   
	// used in id generation
   private int droneID = 100;  
	
	    
    // Generate a drone with unique id, random altitude,  longitude and latitude
   public Drone genDrone()
   {   
		String id = genLetter() +""+ droneID++ + genLetter() + genLetter() + genLetter();
		double altitude = 180 * Math.random();
		double longitude = 180 * Math.random();
		double latitude = 180 * Math.random();
                  
      return new Drone(id, altitude, longitude, latitude);
	}
    
   private char genLetter()
   {
      return (char)('A' + (int)(26*Math.random()));
   }
}
