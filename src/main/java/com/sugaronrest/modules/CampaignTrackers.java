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
* A class which represents the campaign_trkrs table.
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

@Module(name = "CampaignTrackers", tablename = "campaign_trkrs")
@JsonRootName(value = "campaign_trkrs")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CampaignTrackers {
    public String getId() {
        return id;
    }

    public void setId(String value) {
        id = value;
    }
    public String getTrackerName() {
        return trackerName;
    }

    public void setTrackerName(String value) {
        trackerName = value;
    }
    public String getTrackerUrl() {
        return trackerUrl;
    }

    public void setTrackerUrl(String value) {
        trackerUrl = value;
    }
    public int getTrackerKey() {
        return trackerKey;
    }

    public void setTrackerKey(int value) {
        trackerKey = value;
    }
    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(String value) {
        campaignId = value;
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
    public Integer getIsOptout() {
        return isOptout;
    }

    public void setIsOptout(Integer value) {
        isOptout = value;
    }
    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer value) {
        deleted = value;
    }

    @JsonProperty("id")
    private String id;
  
    @JsonProperty("tracker_name")
    private String trackerName;
  
    @JsonProperty("tracker_url")
    private String trackerUrl;
  
    @JsonProperty("tracker_key")
    private int trackerKey;
  
    @JsonProperty("campaign_id")
    private String campaignId;
  
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
  
    @JsonProperty("is_optout")
    private Integer isOptout;
  
    @JsonProperty("deleted")
    private Integer deleted;
  
}
