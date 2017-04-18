package JavaFXDatabase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Date;



public class EventModel {
	
	private   Date  startDate;
	private  Date endDate;
	private  String  description;
	private String name;

	
	public EventModel(Date startDate, Date endDate, String name, String description) throws ParseException{
		
          SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
          Date StartDate = sdf.parse("04/04/2017");
          Date EndDate = sdf.parse("04/05/2017");
          
          if(startDate.after(EndDate)){
        	  throw new IllegalArgumentException();
          }else if(StartDate.after(EndDate)){
        	  System.out.println("correct");
          }
        	  
		this.name = name;
		  this.description = description;
		  this.startDate = startDate;
		  this.endDate =  endDate;
		  
		  
	}
	
	public String getName(){
		return name;
	}
	public String getDescription(){
		return description;
	}
	public Date getStartDate(){
		return startDate;
	}
	public Date getEndDate(){
		return endDate;
	}
	public void setName(String n){
		this.name = n;
	}
	public void setDescription(String d){
	    this.description= d;
	}
	public void setStartDate(Date sd){
		this.startDate = sd;
	}
	public void setEndDate(Date ed){
		this.endDate  = ed;
	}

     
	
	public static void main(String[]arg) throws ParseException{
		
		SimpleDateFormat  sdf =  new SimpleDateFormat("dd/mm/yyyy");
	//	Date startDate = sdf.parse("04/04/2017");
	//	String s = "day";
		int sday = 5;
	Date EndDate = new Date(sday/5/6);
		if ( sday >5  ){
		
		System.out.println(EndDate);
		
		
		}
		
	}
	
}
