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
* A class which represents the campaigns table.
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

@Module(name = "Campaigns", tablename = "campaigns")
@JsonRootName(value = "campaigns")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Campaigns {
    public String getId() {
        return id;
    }

    public void setId(String value) {
        id = value;
    }
    public String getName() {
        return name;
    }

    public void setName(String value) {
        name = value;
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
    public int getTrackerKey() {
        return trackerKey;
    }

    public void setTrackerKey(int value) {
        trackerKey = value;
    }
    public Integer getTrackerCount() {
        return trackerCount;
    }

    public void setTrackerCount(Integer value) {
        trackerCount = value;
    }
    public String getReferUrl() {
        return referUrl;
    }

    public void setReferUrl(String value) {
        referUrl = value;
    }
    public String getTrackerText() {
        return trackerText;
    }

    public void setTrackerText(String value) {
        trackerText = value;
    }
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date value) {
        startDate = value;
    }
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date value) {
        endDate = value;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String value) {
        status = value;
    }
    public Integer getImpressions() {
        return impressions;
    }

    public void setImpressions(Integer value) {
        impressions = value;
    }
    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String value) {
        currencyId = value;
    }
    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double value) {
        budget = value;
    }
    public Double getExpectedCost() {
        return expectedCost;
    }

    public void setExpectedCost(Double value) {
        expectedCost = value;
    }
    public Double getActualCost() {
        return actualCost;
    }

    public void setActualCost(Double value) {
        actualCost = value;
    }
    public Double getExpectedRevenue() {
        return expectedRevenue;
    }

    public void setExpectedRevenue(Double value) {
        expectedRevenue = value;
    }
    public String getCampaignType() {
        return campaignType;
    }

    public void setCampaignType(String value) {
        campaignType = value;
    }
    public String getObjective() {
        return objective;
    }

    public void setObjective(String value) {
        objective = value;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String value) {
        content = value;
    }
    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String value) {
        frequency = value;
    }

    @JsonProperty("id")
    private String id;
  
    @JsonProperty("name")
    private String name;
  
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
  
    @JsonProperty("deleted")
    private Integer deleted;
  
    @JsonProperty("assigned_user_id")
    private String assignedUserId;
  
    @JsonProperty("tracker_key")
    private int trackerKey;
  
    @JsonProperty("tracker_count")
    private Integer trackerCount;
  
    @JsonProperty("refer_url")
    private String referUrl;
  
    @JsonProperty("tracker_text")
    private String trackerText;
  
    @JsonProperty("start_date")
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date startDate;
  
    @JsonProperty("end_date")
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date endDate;
  
    @JsonProperty("status")
    private String status;
  
    @JsonProperty("impressions")
    private Integer impressions;
  
    @JsonProperty("currency_id")
    private String currencyId;
  
    @JsonProperty("budget")
    private Double budget;
  
    @JsonProperty("expected_cost")
    private Double expectedCost;
  
    @JsonProperty("actual_cost")
    private Double actualCost;
  
    @JsonProperty("expected_revenue")
    private Double expectedRevenue;
  
    @JsonProperty("campaign_type")
    private String campaignType;
  
    @JsonProperty("objective")
    private String objective;
  
    @JsonProperty("content")
    private String content;
  
    @JsonProperty("frequency")
    private String frequency;
  
}
