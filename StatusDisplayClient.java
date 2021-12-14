import java.rmi.*;
import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject;
// import java.rmi.RMISecurityManager;
/**
 * Write a description of class StatusDisplayClient here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
   public class StatusDisplayClient
   {
     public static void main(String[] args) throws Exception
    { 
      IRobotStatus server = (IRobotStatus)
              Naming.lookup("rmi://127.0.0.1/IRobotStatus");
      IRobotStatus robot = server;
      System.out.println("Client side RobotStatus:" + robot);
    }
    
    public void getBatteryLevel(){
        try
        {
            String objName;
            IRobotStatus robotStatus;
            objName = "rmi://localhost:1099/Robot";
            robotStatus = (IRobotStatus) Naming.lookup(objName);
            System.out.println("response from server: " + robotStatus.findBatteryLevel() + "\n\n");
      
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong in the gotoHome method of RMIClient");
        }
    }
    
    public void getJobCompleted(){
        try
        {
            String objName;
            IRobotStatus robotStatus;
            objName = "rmi://localhost:1099/Robot";
            robotStatus = (IRobotStatus) Naming.lookup(objName);
            System.out.println("response from server: " + robotStatus.findJobCompleted() + "\n\n");
      
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong in the findJobCompleted method of RMIClient");
        }
    }
    
    public void getLocation(){
        try
        {
            String objName;
            IRobotStatus robotStatus;
            objName = "rmi://localhost:1099/Robot";
            robotStatus = (IRobotStatus) Naming.lookup(objName);
            System.out.println("response from server: " + robotStatus.findLocation() + "\n\n");
      
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong in the findLocation method of RMIClient");
        }
    }
    
}
