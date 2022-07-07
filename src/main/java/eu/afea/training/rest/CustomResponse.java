package eu.afea.training.rest;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class CustomResponse {

    private String response;

    public CustomResponse(String response) {
        this.response = response;
    }

    public CustomResponse() {
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

}
