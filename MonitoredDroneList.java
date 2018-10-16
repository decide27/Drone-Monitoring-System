package app;



import java.util.ArrayList;

/**
 * Class representing a list of actively monitored drones, ordered by their unique ID
 * @author (Jagan)
 * @version (20/08/18)
 */
public class MonitoredDroneList implements DroneList
{
    // Declare here your unsorted data structure (eg ArrayList)
    // Add representation invariant here 
	
        
    /*
     
    * Add a new drone to the list,
    * @param drone - the drone to add
    * @return true if successful, else false
    * throws NullPointerException if drone is null
    */
    
    ArrayList<Drone> list;

  
    public MonitoredDroneList()
    {
        list=new ArrayList<Drone>();
    }

    
    /**
    * Add a new drone to the list,
    * @param drone - the drone to add
    * @return true if successful, else false
    * throws NullPointerException if drone is null
     */
    public boolean add(Drone drone) throws NullPointerException
    {
    	if(drone == null)
        {
            throw new NullPointerException("Drone cannot be empty");
        }
        
        return list.add(drone);
    }
    
    
    /**
     Remove a drone from the list
    * @param id - the ID of the drone to remove
    * @return  true if successful, else false
    * @throws NullPointerException if drone is null

     */
    public boolean remove(String id) throws NullPointerException
    {
        boolean isFound = false; //stores state of object if exist
        if (id.isEmpty())// check if id is empty
        {
            throw new NullPointerException("ID cannot be empty");            
        }
        for (int i = 0; i < list.size(); i++) {
            Drone d = list.get(i);
            if (id.equalsIgnoreCase(d.getID())) {
                isFound = true;
                list.remove(d);//remove event from list
            }
        }
        return isFound; 
    }

    
    
    /**
* Find a drone given the drone Id
    * @param id - the drone ID
    * @return  the drone if found, else null     */
   
    public Drone get(String id) throws NullPointerException
    {
        Drone result = null;// event variable to tore event if found
        if (id.isEmpty()) {
            throw new NullPointerException("ID cannot be empty");
        }
        for (int i = 0; i < list.size(); i++) {
           Drone e = list.get(i);
            if (id.equalsIgnoreCase(e.getID())) {
                result = list.get(i);// gets event
            }
        }
        return result;
    }
    
    
    /**
     * Add Javadoc here
     */
    public int size()
    {
        return list.size();
    }
    
    
    /**
     * Add Javadoc here
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (Drone d : list)
        {
            sb = sb.append(d + "\\");  //append "\" after each drone
        }
         return sb.toString();
    }
    
}
    
     
        
       
    
        
    
    
