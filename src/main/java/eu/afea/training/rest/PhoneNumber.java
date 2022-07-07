package eu.afea.training.rest;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class PhoneNumber {

    private String number;
    private String type;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PhoneNumber() {
        super();
    }

    public PhoneNumber(String number, String type) {
        super();
        this.number = number;
        this.type = type;
    }

}
