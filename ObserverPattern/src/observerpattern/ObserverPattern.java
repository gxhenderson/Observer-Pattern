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
public class ObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmailManager emailManager = new EmailManager();
        
        Subscriber subscriber1 = new Subscriber(emailManager);
        Subscriber subscriber2 = new Subscriber(emailManager);
        Subscriber subscriber3 = new Subscriber(emailManager);
        
        emailManager.setMessage("Welcome to the Email Manager!");
        emailManager.notifyObserver();
        
        emailManager.setMessage("Dear subscriber,\n\nTake this 20% off coupon!");
        emailManager.notifyObserver();
        
        emailManager.unregister(subscriber2);
        
        emailManager.setMessage("Dear subscriber,\n\nThanks for your continued support!");
        emailManager.notifyObserver();
    }
    
}
