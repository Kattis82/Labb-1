package se.iths.kattis.labb1.model;

public class Role {

    private int id;
    private String rolename;
    private String description;

    public Role(int id, String rolename, String description) {
        this.id = id;
        this.rolename = rolename;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id='" + id + '\'' +
                ", rolename='" + rolename + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
