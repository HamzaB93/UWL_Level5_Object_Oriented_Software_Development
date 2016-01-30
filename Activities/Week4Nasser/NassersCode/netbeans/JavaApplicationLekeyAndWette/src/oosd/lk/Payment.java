/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oosd.lk;

import java.util.Date;

/**
 *
 * @author matoorn
 */
public class Payment {
    
    
    private Date payemntDate;
    private double amount; 



    public String makePayment(CreditCheckDetails  creditDetails ){
          
        save();
        return "PAYMENT_CONFIRMED";
    }
    
    private void save(){
        // TODO 
    }
        
    
    
    
    
    
    
    public Date getPayemntDate() {
        return payemntDate;
    }

    public void setPayemntDate(Date payemntDate) {
        this.payemntDate = payemntDate;
    }
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }           
    
}
