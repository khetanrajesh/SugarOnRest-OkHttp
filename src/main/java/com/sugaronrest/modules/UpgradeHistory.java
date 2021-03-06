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
* A class which represents the upgrade_history table.
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

@Module(name = "", tablename = "upgrade_history")
@JsonRootName(value = "upgrade_history")
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpgradeHistory {
    public String getId() {
        return id;
    }

    public void setId(String value) {
        id = value;
    }
    public String getFilename() {
        return filename;
    }

    public void setFilename(String value) {
        filename = value;
    }
    public String getMd5sum() {
        return md5sum;
    }

    public void setMd5sum(String value) {
        md5sum = value;
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
    public String getVersion() {
        return version;
    }

    public void setVersion(String value) {
        version = value;
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
    public String getIdName() {
        return idName;
    }

    public void setIdName(String value) {
        idName = value;
    }
    public String getManifest() {
        return manifest;
    }

    public void setManifest(String value) {
        manifest = value;
    }
    public Date getDateEntered() {
        return dateEntered;
    }

    public void setDateEntered(Date value) {
        dateEntered = value;
    }
    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer value) {
        enabled = value;
    }

    @JsonProperty("id")
    private String id;
  
    @JsonProperty("filename")
    private String filename;
  
    @JsonProperty("md5sum")
    private String md5sum;
  
    @JsonProperty("type")
    private String type;
  
    @JsonProperty("status")
    private String status;
  
    @JsonProperty("version")
    private String version;
  
    @JsonProperty("name")
    private String name;
  
    @JsonProperty("description")
    private String description;
  
    @JsonProperty("id_name")
    private String idName;
  
    @JsonProperty("manifest")
    private String manifest;
  
    @JsonProperty("date_entered")
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dateEntered;
  
    @JsonProperty("enabled")
    private Integer enabled;
  
}
