/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

/**
 *
 * @author gxhen
 */
public class Subscriber implements Observer{

    private static int newID = 0;
    
    private int subscriberID;
    private Subject emailManager;
    
    public Subscriber(Subject emailManager){
        this.emailManager = emailManager;
        subscriberID = ++newID;
        System.out.println("Subscriber number " + subscriberID + " subscribed.");
        emailManager.register(this);
    }
    
    @Override
    public void update(String message) {
        System.out.println("\n\n\nSending subscriber " + subscriberID + " the email: ");
        System.out.println(message);
    }
    
}
