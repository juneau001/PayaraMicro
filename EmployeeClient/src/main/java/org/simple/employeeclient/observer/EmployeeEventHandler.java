/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.simple.employeeclient.observer;

import javax.enterprise.event.ObservesAsync;
import org.simple.employeeclient.EmployeeEvent;

/**
 *
 * @author Juneau
 */
public class EmployeeEventHandler {

    
    public EmployeeEventHandler(){
        
    }
    
    public void notifyManager (@ObservesAsync @NewHire EmployeeEvent event) {
       
            System.out.println("Sending Notification to Manager: New Hire " + event.getFirstName() + " " + event.getLastName()) ;
        
    }
    
   
}
