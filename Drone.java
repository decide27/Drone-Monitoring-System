public class Drone implements Comparable<Drone>
{
	private String ID;   			// unique drone ID
	private double altitude ;     
	private double longitude;
	private double latitude; 

    
   /**
    * Constructor
    */
   public Drone(String id, double altitudeIn, double longIn, double latIn)
   {
		ID = id;
		altitude = altitudeIn;
	  	longitude = 180 * longIn;
		latitude = 180 * latIn;
   }
    
    
   /**
    * Get the drone ID
    * @return  the ID
    */
   public String getID()
   {
      return ID;
   }  
    
	
   /**
    * Get the altitude
    * @return  the altitude
    */
   public double getAltitude()
   {
      return altitude;
   }
    
    
   /**
    * Get the inclination
    * @return  the inclination
    */
   public double getLongitude()
   {
      return longitude;
   }


   /**
    * Get the inclination
    * @return  the inclination
    */
   public double getLatitude()
   {
      return latitude;
   }
    

   /**
    * Implement Comparable based on drone ID comparisons
    * @param other - the other drone
    * @return  the result of the ID comparison
    */
   public int compareTo(Drone other)
   {
      return getID().compareTo(other.getID());
   }
    
	
  	/**
    * Override the default equals(), based on ID
    * @param obj - the other Object
    * @return  true if obj has same ID, else false
    */
   public boolean equals(Object obj)
   {
		if(!(obj instanceof Drone)) 
			return false;
      
		return getID().equals(((Drone)obj).getID());
   }
    
    
   /**
    * Create a string with the drone ID, current altitude, longitude and latitude position
    * concatenated in that order, separated by colons ':'
    * @return  a printable string as above 
    */
   public String toString()
   {
      return ID + ":" + altitude + ":" + longitude + ":" + latitude;
   }
}

