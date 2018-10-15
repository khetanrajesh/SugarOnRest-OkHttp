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
* A class which represents the user_preferences table.
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

@Module(name = "", tablename = "user_preferences")
@JsonRootName(value = "user_preferences")
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserPreferences {
    public String getId() {
        return id;
    }

    public void setId(String value) {
        id = value;
    }
    public String getCategory() {
        return category;
    }

    public void setCategory(String value) {
        category = value;
    }
    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer value) {
        deleted = value;
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
    public String getAssignedUserId() {
        return assignedUserId;
    }

    public void setAssignedUserId(String value) {
        assignedUserId = value;
    }
    public String getContents() {
        return contents;
    }

    public void setContents(String value) {
        contents = value;
    }

    @JsonProperty("id")
    private String id;
  
    @JsonProperty("category")
    private String category;
  
    @JsonProperty("deleted")
    private Integer deleted;
  
    @JsonProperty("date_entered")
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dateEntered;
  
    @JsonProperty("date_modified")
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dateModified;
  
    @JsonProperty("assigned_user_id")
    private String assignedUserId;
  
    @JsonProperty("contents")
    private String contents;
  
}
