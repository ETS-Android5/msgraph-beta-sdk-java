// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.GovernanceRuleSetting;
import com.microsoft.graph.models.GovernanceResource;
import com.microsoft.graph.models.GovernanceRoleDefinition;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Governance Role Setting.
 */
public class GovernanceRoleSetting extends Entity implements IJsonBackedObject {


    /**
     * The Admin Eligible Settings.
     * 
     */
    @SerializedName(value = "adminEligibleSettings", alternate = {"AdminEligibleSettings"})
    @Expose
	@Nullable
    public java.util.List<GovernanceRuleSetting> adminEligibleSettings;

    /**
     * The Admin Member Settings.
     * 
     */
    @SerializedName(value = "adminMemberSettings", alternate = {"AdminMemberSettings"})
    @Expose
	@Nullable
    public java.util.List<GovernanceRuleSetting> adminMemberSettings;

    /**
     * The Is Default.
     * 
     */
    @SerializedName(value = "isDefault", alternate = {"IsDefault"})
    @Expose
	@Nullable
    public Boolean isDefault;

    /**
     * The Last Updated By.
     * 
     */
    @SerializedName(value = "lastUpdatedBy", alternate = {"LastUpdatedBy"})
    @Expose
	@Nullable
    public String lastUpdatedBy;

    /**
     * The Last Updated Date Time.
     * 
     */
    @SerializedName(value = "lastUpdatedDateTime", alternate = {"LastUpdatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastUpdatedDateTime;

    /**
     * The Resource Id.
     * 
     */
    @SerializedName(value = "resourceId", alternate = {"ResourceId"})
    @Expose
	@Nullable
    public String resourceId;

    /**
     * The Role Definition Id.
     * 
     */
    @SerializedName(value = "roleDefinitionId", alternate = {"RoleDefinitionId"})
    @Expose
	@Nullable
    public String roleDefinitionId;

    /**
     * The User Eligible Settings.
     * 
     */
    @SerializedName(value = "userEligibleSettings", alternate = {"UserEligibleSettings"})
    @Expose
	@Nullable
    public java.util.List<GovernanceRuleSetting> userEligibleSettings;

    /**
     * The User Member Settings.
     * 
     */
    @SerializedName(value = "userMemberSettings", alternate = {"UserMemberSettings"})
    @Expose
	@Nullable
    public java.util.List<GovernanceRuleSetting> userMemberSettings;

    /**
     * The Resource.
     * 
     */
    @SerializedName(value = "resource", alternate = {"Resource"})
    @Expose
	@Nullable
    public GovernanceResource resource;

    /**
     * The Role Definition.
     * 
     */
    @SerializedName(value = "roleDefinition", alternate = {"RoleDefinition"})
    @Expose
	@Nullable
    public GovernanceRoleDefinition roleDefinition;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
