package jaxb;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import java.util.ArrayList;

public class TimelineModel {

    //TimelineController tc;

	@XmlElement(name = "eml")
    private List <EventModel> eml;
    public Date startDate;
    public Date endDate;
    public String name;


    public TimelineModel(){}
    public TimelineModel( Date start , Date end ,String getname){

        if(start.before(end)){
            startDate = start;
            endDate = end;
            name = getname;
            eml = new ArrayList<EventModel>();
        }
    }


    public Date getStartDate(){
        return startDate;
    }


    public Date getEndDate(){
        return endDate;
    }


    public List<EventModel> getTimeLine(){
        return eml;
    }


    public void add(EventModel e){
        eml.add(e);
    }


    public void remove(EventModel e){
        eml.remove(e);
    }

    /*public void setController(TimelineController a){
        tc=a;
    }

    public TimelineController getController(){
        return tc;
    }*/

}