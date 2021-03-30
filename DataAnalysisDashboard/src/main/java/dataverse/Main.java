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
        
        UserController controller = new UserController();
        
        //controller.register("Adelin", "test", "1");
        //controller.register("Isa", "test", "1");
        //controller.register("Sefa", "test", "1");
        //controller.register("Yasin", "test", "1");
        
        System.out.println(controller.login("Tomasz", "test"));
        
        
        
    }
    //works well :)
    //hey
}
