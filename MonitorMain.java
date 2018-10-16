package app;

import java.util.*;

/**
 * This class is used to test all operations
 *
 * @author (Jagan)
 * @version (20/08/18)
 */
public class MonitorMain {

    public static void main(String[] args) {
        // number of monitored active drones
        int totalNumber = 10;

        // Print start-of-testing timestamp
        System.out.println("\n*** Begin testing on " + new Date());

        // Create and populate a list for testing
        MonitoredDroneList list = new MonitoredDroneList();

        MonitorHelper helper = new MonitorHelper();
        
         Scanner s = new Scanner(System.in);
        

        System.out.println("\nDrone list in default order:");
        System.out.println(list.toString().replace(',', '\n'));

      // Test implemented DroneList methods add()
        try {
            System.out.println("\n** Begin testing DroneList methods add");
            Drone d1 = helper.genDrone();
            Drone d2 = helper.genDrone();
            Drone d3 = helper.genDrone();
            Drone d4 = helper.genDrone();
            Drone d5 = helper.genDrone();
            Drone d6 = helper.genDrone();
            Drone d7 = helper.genDrone();
            Drone d8 = helper.genDrone();
            Drone d9 = helper.genDrone();
            Drone d10 = helper.genDrone();
            list.list.add(d1);
            list.list.add(d2);
            list.list.add(d3);
            list.list.add(d4);
            list.list.add(d5);
            list.list.add(d6);
            list.list.add(d7);
            list.list.add(d8);
            list.list.add(d9);
            list.list.add(d10);
            
            for(int i =0; i<list.list.size(); i++)  //display list
            {
                System.out.println(list.list.get(i));
            }
             
             System.out.println("New list Size after add():" + list.list.size());
            
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

//Testing remove();
        try {
            System.out.println("\n\t****Testing remove()***");
            System.out.println("Enter ID of the drone you wish to remove from the abovelist:");
            String droneID = s.next().trim();
            System.out.println();
            System.out.println(list.remove(droneID));
            System.out.println("New List after remove()");
            for (int i = 0; i < list.list.size(); i++) {
                System.out.println(list.list.get(i));
            }
            System.out.println("New List size after remove():" + "" + list.list.size());
        } 
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

// Testing get()
        try {
            System.out.println("\n\t***Testing get()***");
            System.out.println("Enter Drone ID that you wish to get from list above:");
            String droneID = s.next().trim();
            System.out.println(list.get(droneID));
        } 
        catch (NullPointerException e) {
            System.out.print(e.getMessage());
        }

      // testing goes here...
        System.out.println("\n** Finish testing DroneList methods");

        System.out.println("\n*** Finish testing on " + new Date());
    }
}
