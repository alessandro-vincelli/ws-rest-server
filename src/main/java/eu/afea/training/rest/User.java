package eu.afea.training.rest;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class User {

    private Integer id;
    private String firstName;
    private String lastName;
    private Set<PhoneNumber> phoneNumbers;
    
    public User(Integer id, String firstName, String lastName) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(Set<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void addPhoneNumbers(PhoneNumber number) {
        if (phoneNumbers == null) {
            phoneNumbers = new HashSet<PhoneNumber>();
        }
        phoneNumbers.add(number);
    }
}
