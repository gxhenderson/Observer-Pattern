/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.util.ArrayList;

/**
 *
 * @author gxhen
 */
public class EmailManager implements Subject{

    ArrayList<Observer> observers;
    String message;
    public EmailManager(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        int observerIndex = observers.indexOf(observer);
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
    
        for (Observer observer : observers){
            observer.update(message);
        }
    }
    
    public void setMessage(String message){
        this.message = message;
    }
}
