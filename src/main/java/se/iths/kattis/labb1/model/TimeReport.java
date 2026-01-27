package se.iths.kattis.labb1.model;

public class TimeReport {

    private int id;
    private String hours;
    private String date;
    private String employee;

    public TimeReport(int id, String hours, String date, String employee) {
        this.id = id;
        this.hours = hours;
        this.date = date;
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "TimeReport{" +
                "id=" + id +
                ", hours='" + hours + '\'' +
                ", date='" + date + '\'' +
                ", employee='" + employee + '\'' +
                '}';
    }
}
