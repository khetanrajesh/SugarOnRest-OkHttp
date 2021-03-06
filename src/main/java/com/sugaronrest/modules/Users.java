/**
* <auto-generated />
* This file was generated by a StringTemplate 4 template.
* Don't change it directly as your change would get overwritten. Instead, make changes
* to the .stg file (i.e. the StringTemplate 4 template file) and save it to regenerate this file.
*
* For more infor on StringTemplate 4 template please go to -
* https://github.com/antlr/antlrcs
*
* @author  Kola Oyewumi
* @version 1.0.0
* @since   2017-01-03
*
* A class which represents the users table.
*/

package com.sugaronrest.modules;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sugaronrest.restapicalls.CustomDateDeserializer;
import com.sugaronrest.restapicalls.CustomDateSerializer;
import com.sugaronrest.restapicalls.Module;

@Module(name = "Users", tablename = "users")
@JsonRootName(value = "users")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Users {
    public String getId() {
        return id;
    }

    public void setId(String value) {
        id = value;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String value) {
        userName = value;
    }
    public String getUserHash() {
        return userHash;
    }

    public void setUserHash(String value) {
        userHash = value;
    }
    public Integer getSystemGeneratedPassword() {
        return systemGeneratedPassword;
    }

    public void setSystemGeneratedPassword(Integer value) {
        systemGeneratedPassword = value;
    }
    public Date getPwdLastChanged() {
        return pwdLastChanged;
    }

    public void setPwdLastChanged(Date value) {
        pwdLastChanged = value;
    }
    public String getAuthenticateId() {
        return authenticateId;
    }

    public void setAuthenticateId(String value) {
        authenticateId = value;
    }
    public Integer getSugarLogin() {
        return sugarLogin;
    }

    public void setSugarLogin(Integer value) {
        sugarLogin = value;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String value) {
        firstName = value;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String value) {
        lastName = value;
    }
    public Integer getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Integer value) {
        isAdmin = value;
    }
    public Integer getExternalAuthOnly() {
        return externalAuthOnly;
    }

    public void setExternalAuthOnly(Integer value) {
        externalAuthOnly = value;
    }
    public Integer getReceiveNotifications() {
        return receiveNotifications;
    }

    public void setReceiveNotifications(Integer value) {
        receiveNotifications = value;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        description = value;
    }
    public Date getDateEntered() {
        return dateEntered;
    }

    public void setDateEntered(Date value) {
        dateEntered = value;
    }
    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date value) {
        dateModified = value;
    }
    public String getModifiedUserId() {
        return modifiedUserId;
    }

    public void setModifiedUserId(String value) {
        modifiedUserId = value;
    }
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String value) {
        createdBy = value;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        title = value;
    }
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String value) {
        department = value;
    }
    public String getPhoneHome() {
        return phoneHome;
    }

    public void setPhoneHome(String value) {
        phoneHome = value;
    }
    public String getPhoneMobile() {
        return phoneMobile;
    }

    public void setPhoneMobile(String value) {
        phoneMobile = value;
    }
    public String getPhoneWork() {
        return phoneWork;
    }

    public void setPhoneWork(String value) {
        phoneWork = value;
    }
    public String getPhoneOther() {
        return phoneOther;
    }

    public void setPhoneOther(String value) {
        phoneOther = value;
    }
    public String getPhoneFax() {
        return phoneFax;
    }

    public void setPhoneFax(String value) {
        phoneFax = value;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String value) {
        status = value;
    }
    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String value) {
        addressStreet = value;
    }
    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String value) {
        addressCity = value;
    }
    public String getAddressState() {
        return addressState;
    }

    public void setAddressState(String value) {
        addressState = value;
    }
    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String value) {
        addressCountry = value;
    }
    public String getAddressPostalcode() {
        return addressPostalcode;
    }

    public void setAddressPostalcode(String value) {
        addressPostalcode = value;
    }
    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer value) {
        deleted = value;
    }
    public Integer getPortalOnly() {
        return portalOnly;
    }

    public void setPortalOnly(Integer value) {
        portalOnly = value;
    }
    public Integer getShowOnEmployees() {
        return showOnEmployees;
    }

    public void setShowOnEmployees(Integer value) {
        showOnEmployees = value;
    }
    public String getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(String value) {
        employeeStatus = value;
    }
    public String getMessengerId() {
        return messengerId;
    }

    public void setMessengerId(String value) {
        messengerId = value;
    }
    public String getMessengerType() {
        return messengerType;
    }

    public void setMessengerType(String value) {
        messengerType = value;
    }
    public String getReportsToId() {
        return reportsToId;
    }

    public void setReportsToId(String value) {
        reportsToId = value;
    }
    public Integer getIsGroup() {
        return isGroup;
    }

    public void setIsGroup(Integer value) {
        isGroup = value;
    }

    @JsonProperty("id")
    private String id;
  
    @JsonProperty("user_name")
    private String userName;
  
    @JsonProperty("user_hash")
    private String userHash;
  
    @JsonProperty("system_generated_password")
    private Integer systemGeneratedPassword;
  
    @JsonProperty("pwd_last_changed")
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date pwdLastChanged;
  
    @JsonProperty("authenticate_id")
    private String authenticateId;
  
    @JsonProperty("sugar_login")
    private Integer sugarLogin;
  
    @JsonProperty("first_name")
    private String firstName;
  
    @JsonProperty("last_name")
    private String lastName;
  
    @JsonProperty("is_admin")
    private Integer isAdmin;
  
    @JsonProperty("external_auth_only")
    private Integer externalAuthOnly;
  
    @JsonProperty("receive_notifications")
    private Integer receiveNotifications;
  
    @JsonProperty("description")
    private String description;
  
    @JsonProperty("date_entered")
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dateEntered;
  
    @JsonProperty("date_modified")
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dateModified;
  
    @JsonProperty("modified_user_id")
    private String modifiedUserId;
  
    @JsonProperty("created_by")
    private String createdBy;
  
    @JsonProperty("title")
    private String title;
  
    @JsonProperty("department")
    private String department;
  
    @JsonProperty("phone_home")
    private String phoneHome;
  
    @JsonProperty("phone_mobile")
    private String phoneMobile;
  
    @JsonProperty("phone_work")
    private String phoneWork;
  
    @JsonProperty("phone_other")
    private String phoneOther;
  
    @JsonProperty("phone_fax")
    private String phoneFax;
  
    @JsonProperty("status")
    private String status;
  
    @JsonProperty("address_street")
    private String addressStreet;
  
    @JsonProperty("address_city")
    private String addressCity;
  
    @JsonProperty("address_state")
    private String addressState;
  
    @JsonProperty("address_country")
    private String addressCountry;
  
    @JsonProperty("address_postalcode")
    private String addressPostalcode;
  
    @JsonProperty("deleted")
    private Integer deleted;
  
    @JsonProperty("portal_only")
    private Integer portalOnly;
  
    @JsonProperty("show_on_employees")
    private Integer showOnEmployees;
  
    @JsonProperty("employee_status")
    private String employeeStatus;
  
    @JsonProperty("messenger_id")
    private String messengerId;
  
    @JsonProperty("messenger_type")
    private String messengerType;
  
    @JsonProperty("reports_to_id")
    private String reportsToId;
  
    @JsonProperty("is_group")
    private Integer isGroup;
  
}
