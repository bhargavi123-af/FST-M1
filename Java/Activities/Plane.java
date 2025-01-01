package oops;

import java.sql.Date;

public class Plane {

	    
	    private Date takeoffDate;
	    private Date landingDate;

	    public Plane() {
	        this.takeoffDate = null;
	        this.landingDate = null;
	    }

	    
	    public Date getTakeoffDate() {
	        return takeoffDate;
	    }

	   
	    public Date getLandingDate() {
	        return landingDate;
	    }

	    
	    public void takeOff() {
	        if (takeoffDate != null) {
	            System.out.println("The plane has already taken off.");
	            return;
	        }
	        takeoffDate = new Date(0);  
	        System.out.println("Plane took off at: " + takeoffDate);
	    }

	   
	    public void land() {
	        if (takeoffDate == null) {
	            System.out.println("The plane cannot land without taking off first.");
	            return;
	        }
	        if (landingDate != null) {
	            System.out.println("The plane has already landed.");
	            return;
	        }
	        landingDate = new Date(0);  
	        System.out.println("Plane landed at: " + landingDate);
	    }

	    
	    public static void main(String[] args) {
	        Plane plane = new Plane();  
	        plane.takeOff();            
	        plane.land();              
	    }
	}

