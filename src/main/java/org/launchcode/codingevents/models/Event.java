package org.launchcode.codingevents.models;

import javax.validation.constraints.*;
import java.util.Objects;

/**
 * Created by Chris Bay
 */
public class Event {

    private int id;
    private static int nextId = 1;

    @NotBlank(message = "Name is Required")
    @Size(min=3,max=50, message="Name must be between 3 and 50 different characters.")
    private String name;

    @Size(max=500, message="Description too long!")
    private String description;

    @NotBlank(message="Location is Required")
    @NotNull(message="Location is Required")
    @Size(min=1)
    private String location;

    @NotBlank(message = "Invalid email. Try again.")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

    @NotBlank
    @NotNull
    private boolean register;

    @DecimalMin("0")
    @NotBlank(message="Please enter a number > 0")
    @NotNull(message="Please enter a number > 0")
    private int numberOfAttendees;

    public Event(String name, String description, String location, String contactEmail, boolean register) {
        this.name = name;
        this.description = description;
        this.location = location;
        this.contactEmail = contactEmail;
        this.register = true;
        this.numberOfAttendees= numberOfAttendees;
        this.id = nextId;
        nextId++;
    }
    public Event(){}

    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isRegister() {
        return register;
    }

    public void setRegister(boolean register) {
        this.register = register;
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

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
