/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataverse;

/**
 *
 * @author Dawid
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //traffic database @Adelin
        TrafficController trafficController = new TrafficController();
        trafficController.createTables();             //function used to create the tables
        trafficController.insertDataIntoTables();     //function used to insert data into the created tables
        


        
        //UserController controller = new UserController();
        
        
        //controller.register("Tomasz", "tomasz@email.com", "test", true);
        //controller.register("Isa", "test", "1");
        //controller.register("Sefa", "test", "1");
        //controller.register("Yasin", "test", "1");
        
        //System.out.println(controller.login("Tomasz", "test"));
        
       
        /*GUI gui = new GUI();
        gui.homePage();*/
        

        
        GUI gui = new GUI();
        //gui.homePage.createHomePage();      //open home page window
        gui.loginPage.createLoginPage();    


    }

}
