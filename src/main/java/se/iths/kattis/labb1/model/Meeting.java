package se.iths.kattis.labb1.model;

public class Meeting {

    private int id;
    private String title;
    private String when;
    private String room;

    public Meeting(int id, String title, String when, String room) {
        this.id = id;
        this.title = title;
        this.when = when;
        this.room = room;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWhen() {
        return when;
    }

    public void setWhen(String when) {
        this.when = when;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", when='" + when + '\'' +
                ", room='" + room + '\'' +
                '}';
    }
}