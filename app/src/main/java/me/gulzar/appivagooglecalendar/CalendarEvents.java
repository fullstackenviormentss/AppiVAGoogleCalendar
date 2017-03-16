package me.gulzar.appivagooglecalendar;

/**
 * Created by Gulzar on 17-03-2017.
 */

public class CalendarEvents {
    private String name,description,date,type;

    public CalendarEvents(String name, String description, String date, String type) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
