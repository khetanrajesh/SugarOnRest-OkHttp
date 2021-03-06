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
* A class which represents the emails table.
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

@Module(name = "Emails", tablename = "emails")
@JsonRootName(value = "emails")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Emails {
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
    public String getAssignedUserId() {
        return assignedUserId;
    }

    public void setAssignedUserId(String value) {
        assignedUserId = value;
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
    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer value) {
        deleted = value;
    }
    public Date getDateSent() {
        return dateSent;
    }

    public void setDateSent(Date value) {
        dateSent = value;
    }
    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String value) {
        messageId = value;
    }
    public String getName() {
        return name;
    }

    public void setName(String value) {
        name = value;
    }
    public String getType() {
        return type;
    }

    public void setType(String value) {
        type = value;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String value) {
        status = value;
    }
    public Integer getFlagged() {
        return flagged;
    }

    public void setFlagged(Integer value) {
        flagged = value;
    }
    public Integer getReplyToStatus() {
        return replyToStatus;
    }

    public void setReplyToStatus(Integer value) {
        replyToStatus = value;
    }
    public String getIntent() {
        return intent;
    }

    public void setIntent(String value) {
        intent = value;
    }
    public String getMailboxId() {
        return mailboxId;
    }

    public void setMailboxId(String value) {
        mailboxId = value;
    }
    public String getParentType() {
        return parentType;
    }

    public void setParentType(String value) {
        parentType = value;
    }
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String value) {
        parentId = value;
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
  
    @JsonProperty("assigned_user_id")
    private String assignedUserId;
  
    @JsonProperty("modified_user_id")
    private String modifiedUserId;
  
    @JsonProperty("created_by")
    private String createdBy;
  
    @JsonProperty("deleted")
    private Integer deleted;
  
    @JsonProperty("date_sent")
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dateSent;
  
    @JsonProperty("message_id")
    private String messageId;
  
    @JsonProperty("name")
    private String name;
  
    @JsonProperty("type")
    private String type;
  
    @JsonProperty("status")
    private String status;
  
    @JsonProperty("flagged")
    private Integer flagged;
  
    @JsonProperty("reply_to_status")
    private Integer replyToStatus;
  
    @JsonProperty("intent")
    private String intent;
  
    @JsonProperty("mailbox_id")
    private String mailboxId;
  
    @JsonProperty("parent_type")
    private String parentType;
  
    @JsonProperty("parent_id")
    private String parentId;
  
}
