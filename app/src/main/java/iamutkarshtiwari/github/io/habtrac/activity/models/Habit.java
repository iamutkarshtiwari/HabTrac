package iamutkarshtiwari.github.io.habtrac.activity.models;

/**
 * Created by utkarshtiwari on 17/10/17.
 */

public class Habit {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    String id, name, date, frequency;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public Habit(String id, String name, String date, String frequency) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.frequency = frequency;
    }
}
