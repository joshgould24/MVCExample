package mvcexample;

/**
 *
 * @author savi
 */
// Launcher for application
// NEW COMMENT!!!
public class Main {
   
    public static void main(String args[]) {
     
        Model model = new Model();               // Create shared database
        Controller1 c1 = new Controller1(model, 40, 40); // Create first controller
        Controller2 c2 = new Controller2(model, "v1", 40,200); // Create second controller
        Controller2 c22 = new Controller2(model, "v2", 405,200); // Create second controller
        Controller2 c23 = new Controller2(model, "v3", 40,350); // Create second controller
        Controller2 c24 = new Controller2(model, "v4", 405,350); // Create second controller
        
    } // main
  
} // Main
