package se.iths.kattis.labb1.model;

public class Fake {

    private String attribute;
    private String attribute2;
    private String attribute3;

    public Fake(String attribute, String attribute2, String attribute3) {
        this.attribute = attribute;
        this.attribute2 = attribute2;
        this.attribute3 = attribute3;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    @Override
    public String toString() {
        return "Fake{" +
                "attribute='" + attribute + '\'' +
                ", attribute2='" + attribute2 + '\'' +
                ", attribute3='" + attribute3 + '\'' +
                '}';
    }
}
