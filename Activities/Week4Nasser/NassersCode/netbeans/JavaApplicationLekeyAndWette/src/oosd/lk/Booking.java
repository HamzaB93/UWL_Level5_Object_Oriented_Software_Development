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
public class Booking {
    
    private int bookingId;
    private Date date;
    private String type;

  
    public Booking(){
        
    }
    public Booking(int bookingId){
        this.bookingId=bookingId;
    }    
    
    public static Booking getDetails(int bookingId)throws Exception{
        
        Booking b = findBookingById(bookingId);
        
        if(b.getType().equals("PROVISIONAL")){
            return b;
        }else{
            throw new Exception("Booking with ID="+bookingId+" is not PROVISIONAL");
        }

    }

    
    private static Booking findBookingById(int bookingId) {
        // read from file or Database:
        Booking bookingDetails = new Booking(bookingId);
        return bookingDetails;
    }
    
   public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String save() {
        //save the booking details
        return "OK";
    }

    public String confirm() {
        return save();
    }
 
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }      
}
