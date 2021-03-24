// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.UserInsightsSettings;
import com.microsoft.graph.models.RegionalAndLanguageSettings;
import com.microsoft.graph.models.ShiftPreferences;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Settings.
 */
public class UserSettings extends Entity implements IJsonBackedObject {


    /**
     * The Contribution To Content Discovery As Organization Disabled.
     * Reflects the organization level setting controlling delegate access to the trending API. When set to true, the organization doesn't have access to Office Delve. The relevancy of the content displayed in Microsoft 365, for example in Suggested sites in SharePoint Home and the Discover view in OneDrive for Business is affected for the whole organization. This setting is read-only and can only be changed by administrators in the SharePoint admin center.
     */
    @SerializedName(value = "contributionToContentDiscoveryAsOrganizationDisabled", alternate = {"ContributionToContentDiscoveryAsOrganizationDisabled"})
    @Expose
	@Nullable
    public Boolean contributionToContentDiscoveryAsOrganizationDisabled;

    /**
     * The Contribution To Content Discovery Disabled.
     * When set to true, the delegate access to the user's trending API is disabled. When set to true, documents in the user's Office Delve are disabled. When set to true, the relevancy of the content displayed in Microsoft 365, for example in Suggested sites in SharePoint Home and the Discover view in OneDrive for Business is affected. Users can control this setting in Office Delve.
     */
    @SerializedName(value = "contributionToContentDiscoveryDisabled", alternate = {"ContributionToContentDiscoveryDisabled"})
    @Expose
	@Nullable
    public Boolean contributionToContentDiscoveryDisabled;

    /**
     * The Item Insights.
     * 
     */
    @SerializedName(value = "itemInsights", alternate = {"ItemInsights"})
    @Expose
	@Nullable
    public UserInsightsSettings itemInsights;

    /**
     * The Regional And Language Settings.
     * The user's preferences for languages, regional locale and date/time formatting.
     */
    @SerializedName(value = "regionalAndLanguageSettings", alternate = {"RegionalAndLanguageSettings"})
    @Expose
	@Nullable
    public RegionalAndLanguageSettings regionalAndLanguageSettings;

    /**
     * The Shift Preferences.
     * The shift preferences for the user.
     */
    @SerializedName(value = "shiftPreferences", alternate = {"ShiftPreferences"})
    @Expose
	@Nullable
    public ShiftPreferences shiftPreferences;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
