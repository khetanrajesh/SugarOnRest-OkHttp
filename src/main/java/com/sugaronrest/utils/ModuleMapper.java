/**
 * <auto-generated />
 * This file was generated by a StringTemplate 4 template.
 * Don't change it directly as your change would get overwritten.  Instead, make changes
 * to the .stg file (i.e. the StringTemplate 4 template) and save it to regenerate this file.
 *
 * For more infor on StringTemplate 4 template please go to -
 * https://github.com/antlr/antlrcs
 *
 * @author  Kola Oyewumi
 * @version 1.0.0
 * @since   2017-01-03
 *
 * A class which represents the the mapping of SugarCRM table to SugarCRM module name.
 */

package com.sugaronrest.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class ModuleMapper {

    private static ModuleMapper singleton = new ModuleMapper( );
    private static Map<String, String> mapper;

    /**
     * Initializes a new instance of the Singleton JsonObjectMapper class.
     * A private Constructor prevents any other class from instantiating it.
     */
    private ModuleMapper() {
        mapper = new HashMap<String, String>();
        mapper.put("accounts", "Accounts");
        mapper.put("acl_actions", "ACLActions");
        mapper.put("acl_roles", "ACLRoles");
        mapper.put("bugs", "Bugs");
        mapper.put("calls", "Calls");
        mapper.put("campaign_log", "CampaignLog");
        mapper.put("campaign_trkrs", "CampaignTrackers");
        mapper.put("campaigns", "Campaigns");
        mapper.put("cases", "Cases");
        mapper.put("contacts", "Contacts");
        mapper.put("currencies", "Currencies");
        mapper.put("document_revisions", "DocumentRevisions");
        mapper.put("documents", "Documents");
        mapper.put("eapm", "EAPM");
        mapper.put("email_addresses", "EmailAddresses");
        mapper.put("email_marketing", "EmailMarketing");
        mapper.put("email_templates", "EmailTemplates");
        mapper.put("emailman", "EmailMan");
        mapper.put("emails", "Emails");
        mapper.put("inbound_email", "InboundEmail");
        mapper.put("job_queue", "SchedulersJobs");
        mapper.put("leads", "Leads");
        mapper.put("meetings", "Meetings");
        mapper.put("notes", "Notes");
        mapper.put("oauth_consumer", "OAuthKeys");
        mapper.put("oauth_tokens", "OAuthTokens");
        mapper.put("opportunities", "Opportunities");
        mapper.put("project", "Project");
        mapper.put("project_task", "ProjectTask");
        mapper.put("prospect_lists", "ProspectLists");
        mapper.put("prospects", "Prospects");
        mapper.put("releases", "Releases");
        mapper.put("roles", "Roles");
        mapper.put("saved_search", "SavedSearch");
        mapper.put("schedulers", "Schedulers");
        mapper.put("sugarfeed", "SugarFeed");
        mapper.put("tasks", "Tasks");
        mapper.put("users", "Users");
    }

    /**
     * Gets the static 'instance' of ModuleMapper.
     * @return ModuleMapper object
     */
    public static ModuleMapper getInstance() {
        return singleton;
    }

    /**
     * Gets the module name based on tablename.
     *
     * @param tableName The SugarCRM module table name.
     * @return SugarCRM module name.
     */
    public static String getModule(String tableName)
    {
        if (mapper.containsKey(tableName)) {
            return  mapper.get(tableName);
        }

        return StringUtils.EMPTY;
    }

    /**
     * Gets the table name based on module name.
     *
     * @param moduleName Module name.
     * @return SugarCRM module table name.
     */
    public static String getTablename(String moduleName)
    {
        if (mapper.containsValue(moduleName)) {
            for (Map.Entry<String, String> entry: mapper.entrySet()) {
                if (entry.getValue().equalsIgnoreCase(moduleName)) {
                    return entry.getKey();
                }
            }
        }

        return StringUtils.EMPTY;
    }

    /**
     * Gets the module names from mapper.
     *
     * @return List of module names.
     */
    public static List<String> getAllModules()
    {
        List<String> list = new ArrayList<String>();
        for (Map.Entry<String, String> listItem: mapper.entrySet()) {
            list.add(listItem.getValue());
        }
        return list;
    }
}