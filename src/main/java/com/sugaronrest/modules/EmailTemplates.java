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
* A class which represents the email_templates table.
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

@Module(name = "EmailTemplates", tablename = "email_templates")
@JsonRootName(value = "email_templates")
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmailTemplates {
    public String getId() {
        return id;
    }

    public void setId(String value) {
        id = value;
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
    public String getPublished() {
        return published;
    }

    public void setPublished(String value) {
        published = value;
    }
    public String getName() {
        return name;
    }

    public void setName(String value) {
        name = value;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        description = value;
    }
    public String getSubject() {
        return subject;
    }

    public void setSubject(String value) {
        subject = value;
    }
    public String getBody() {
        return body;
    }

    public void setBody(String value) {
        body = value;
    }
    public String getBodyHtml() {
        return bodyHtml;
    }

    public void setBodyHtml(String value) {
        bodyHtml = value;
    }
    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer value) {
        deleted = value;
    }
    public String getAssignedUserId() {
        return assignedUserId;
    }

    public void setAssignedUserId(String value) {
        assignedUserId = value;
    }
    public Integer getTextOnly() {
        return textOnly;
    }

    public void setTextOnly(Integer value) {
        textOnly = value;
    }
    public String getType() {
        return type;
    }

    public void setType(String value) {
        type = value;
    }

    @JsonProperty("id")
    private String id;
  
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
  
    @JsonProperty("published")
    private String published;
  
    @JsonProperty("name")
    private String name;
  
    @JsonProperty("description")
    private String description;
  
    @JsonProperty("subject")
    private String subject;
  
    @JsonProperty("body")
    private String body;
  
    @JsonProperty("body_html")
    private String bodyHtml;
  
    @JsonProperty("deleted")
    private Integer deleted;
  
    @JsonProperty("assigned_user_id")
    private String assignedUserId;
  
    @JsonProperty("text_only")
    private Integer textOnly;
  
    @JsonProperty("type")
    private String type;
  
}
