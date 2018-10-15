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
* A class which represents the meetings_leads table.
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

@Module(name = "", tablename = "meetings_leads")
@JsonRootName(value = "meetings_leads")
@JsonIgnoreProperties(ignoreUnknown = true)
public class MeetingsLeads {
    public String getId() {
        return id;
    }

    public void setId(String value) {
        id = value;
    }
    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String value) {
        meetingId = value;
    }
    public String getLeadId() {
        return leadId;
    }

    public void setLeadId(String value) {
        leadId = value;
    }
    public String getRequired() {
        return required;
    }

    public void setRequired(String value) {
        required = value;
    }
    public String getAcceptStatus() {
        return acceptStatus;
    }

    public void setAcceptStatus(String value) {
        acceptStatus = value;
    }
    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date value) {
        dateModified = value;
    }
    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer value) {
        deleted = value;
    }

    @JsonProperty("id")
    private String id;
  
    @JsonProperty("meeting_id")
    private String meetingId;
  
    @JsonProperty("lead_id")
    private String leadId;
  
    @JsonProperty("required")
    private String required;
  
    @JsonProperty("accept_status")
    private String acceptStatus;
  
    @JsonProperty("date_modified")
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dateModified;
  
    @JsonProperty("deleted")
    private Integer deleted;
  
}
