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
* A class which represents the users_feeds table.
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

@Module(name = "", tablename = "users_feeds")
@JsonRootName(value = "users_feeds")
@JsonIgnoreProperties(ignoreUnknown = true)
public class UsersFeeds {
    public String getUserId() {
        return userId;
    }

    public void setUserId(String value) {
        userId = value;
    }
    public String getFeedId() {
        return feedId;
    }

    public void setFeedId(String value) {
        feedId = value;
    }
    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer value) {
        rank = value;
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

    @JsonProperty("user_id")
    private String userId;
  
    @JsonProperty("feed_id")
    private String feedId;
  
    @JsonProperty("rank")
    private Integer rank;
  
    @JsonProperty("date_modified")
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dateModified;
  
    @JsonProperty("deleted")
    private Integer deleted;
  
}
