package com.example.tapahtumamaster2000;

import java.net.URL;
import java.util.Date;

public class Event {
    int ID;
    String name;
    String description;
    Venue venue;
    Date openHoursStart;
    Date openHoursEnd;
    double price;
    URL url;

    public Date getDuration(Event e) {
        string duration = openHoursStart;
        duration = duration.concat(openHoursEnd);
        return duration;
    }

    public double getPrice(Event e) {
        return price;
    }

    public string getName(Event e) {
        return name;
    }

    public String getDescription(Event e) {
        return description;
    }

}
