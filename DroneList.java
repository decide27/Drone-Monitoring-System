package app;

/**
 * Interface for a class representing a list of monitored drones *** DO NOT MODIFY ***
 * @author Tutor_m19com
 * @version 1.0 - 20/6/2018
 */
public interface DroneList
{
	/**
    * Add a new drone to the list,
    * @param drone - the drone to add
    * @return true if successful, else false
    * throws NullPointerException if drone is null
    */
	public boolean add(Drone drone) throws NullPointerException;
   // POST: if drone is null the exception is thrown; else
   // the drone is added to our list and true is returned,
   // or false if the drone was not added for some reason
   
    
   /**
    * Remove a drone from the list
    * @param id - the ID of the drone to remove
    * @return  true if successful, else false
    * @throws NullPointerException if drone is null
    */
   public boolean remove(String id) throws NullPointerException;
   // POST: if string is null the exception is thrown; othewise
   // if the drone is not in our list false is returned, else
   // matching instance of the drone is removed and true is returned
   
   
   /**
    * Find a drone given the drone Id
    * @param id - the drone ID
    * @return  the drone if found, else null
    */
   public Drone get(String id) throws NullPointerException;
   // POST: if string is null the exception is thrown; otherwise
   // if a drone is found matching the specified id 
   // then that drone is returned, else null is returned
   
   
   /**
    * Get the size of the list (number of drone being monitored)
    * @return  the list size
    */
   public int size();
   // POST: the list size (= number of drone) is returned
   
   
   /**
    * Convert the list to a single string "[a0, a1, a2...]"
    * @return a printable string formatted as above
    */
   public String toString();
   // POST: a string is returned of the form [S0, S1, S2...]
   // where each Si is the string representation of ith drone
}