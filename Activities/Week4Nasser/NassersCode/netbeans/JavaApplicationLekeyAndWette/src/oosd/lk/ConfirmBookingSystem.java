/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oosd.lk;

/**
 *
 * @author matoorn
 */
public class ConfirmBookingSystem {
    
    Booking b;
    
    public Booking setBookingNumber(int bookingId){
        try{
            b =  Booking.getDetails(bookingId);
            return b;
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
    
    public String makePayment(CreditCheckDetails  creditDetails ){
        String confirmation  = new Payment().makePayment(creditDetails);
        if(confirmation.equals("PAYMENT_CONFIRMED")){
            return b.confirm();
        }
        return "ERROR";
    }
    
}
