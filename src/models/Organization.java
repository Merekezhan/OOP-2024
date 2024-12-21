package models;

public class Organization {
	private int organizationId;
	private String name; 
	private Student head;
	public Organization() {
        super();
    }
	public Organization(String name, Student head) {
        super();
        this.name = name;
        this.head = head;
    }
	public int getOrganizationId() {
        return this.organizationId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getHead() {
        return this.head;
    }

    public void setHead(Student head) {
        this.head = head;
    }

}