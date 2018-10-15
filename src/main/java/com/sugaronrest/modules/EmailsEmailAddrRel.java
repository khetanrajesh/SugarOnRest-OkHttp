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
* A class which represents the emails_email_addr_rel table.
*/

package com.sugaronrest.modules;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.sugaronrest.restapicalls.Module;


@Module(name = "", tablename = "emails_email_addr_rel")
@JsonRootName(value = "emails_email_addr_rel")
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmailsEmailAddrRel {
    public String getId() {
        return id;
    }

    public void setId(String value) {
        id = value;
    }
    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String value) {
        emailId = value;
    }
    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String value) {
        addressType = value;
    }
    public String getEmailAddressId() {
        return emailAddressId;
    }

    public void setEmailAddressId(String value) {
        emailAddressId = value;
    }
    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer value) {
        deleted = value;
    }

    @JsonProperty("id")
    private String id;
  
    @JsonProperty("email_id")
    private String emailId;
  
    @JsonProperty("address_type")
    private String addressType;
  
    @JsonProperty("email_address_id")
    private String emailAddressId;
  
    @JsonProperty("deleted")
    private Integer deleted;
  
}
