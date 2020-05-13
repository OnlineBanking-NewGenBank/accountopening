
package com.crowdshiftdemo.quarkus.services.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class AcountOpenRequest {

    @JsonProperty("id")
    private String id;
    @JsonProperty("customerId")
    private String customerId;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("middleName")
    private String middleName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("mobileNumber")
    private String mobileNumber;
    @JsonProperty("emailId")
    private String emailId;
    @JsonProperty("panNo")
    private String panNo;
    @JsonProperty("aadharNo")
    private String aadharNo;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("customerId")
    public String getCustomerId() {
        return customerId;
    }

    @JsonProperty("customerId")
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("middleName")
    public String getMiddleName() {
        return middleName;
    }

    @JsonProperty("middleName")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("mobileNumber")
    public String getMobileNumber() {
        return mobileNumber;
    }

    @JsonProperty("mobileNumber")
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @JsonProperty("emailId")
    public String getEmailId() {
        return emailId;
    }

    @JsonProperty("emailId")
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @JsonProperty("panNo")
    public String getPanNo() {
        return panNo;
    }

    @JsonProperty("panNo")
    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }

    @JsonProperty("aadharNo")
    public String getAadharNo() {
        return aadharNo;
    }

    @JsonProperty("aadharNo")
    public void setAadharNo(String aadharNo) {
        this.aadharNo = aadharNo;
    }

}
