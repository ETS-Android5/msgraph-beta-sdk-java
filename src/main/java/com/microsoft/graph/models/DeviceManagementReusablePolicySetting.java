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
import com.microsoft.graph.models.DeviceManagementConfigurationSettingInstance;
import com.microsoft.graph.models.DeviceManagementConfigurationPolicy;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.DeviceManagementConfigurationPolicyCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Reusable Policy Setting.
 */
public class DeviceManagementReusablePolicySetting extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * reusable setting creation date and time. This property is read-only.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Description.
     * reusable setting description supplied by user.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * reusable setting display name supplied by user.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Last Modified Date Time.
     * date and time when reusable setting was last modified. This property is read-only.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Referencing Configuration Policy Count.
     * count of configuration policies referencing the current reusable setting. Valid values 0 to 2147483647. This property is read-only.
     */
    @SerializedName(value = "referencingConfigurationPolicyCount", alternate = {"ReferencingConfigurationPolicyCount"})
    @Expose
	@Nullable
    public Integer referencingConfigurationPolicyCount;

    /**
     * The Setting Definition Id.
     * setting definition id associated with this reusable setting.
     */
    @SerializedName(value = "settingDefinitionId", alternate = {"SettingDefinitionId"})
    @Expose
	@Nullable
    public String settingDefinitionId;

    /**
     * The Setting Instance.
     * reusable setting configuration instance
     */
    @SerializedName(value = "settingInstance", alternate = {"SettingInstance"})
    @Expose
	@Nullable
    public DeviceManagementConfigurationSettingInstance settingInstance;

    /**
     * The Version.
     * version number for reusable setting. Valid values 0 to 2147483647. This property is read-only.
     */
    @SerializedName(value = "version", alternate = {"Version"})
    @Expose
	@Nullable
    public Integer version;

    /**
     * The Referencing Configuration Policies.
     * configuration policies referencing the current reusable setting. This property is read-only.
     */
    @SerializedName(value = "referencingConfigurationPolicies", alternate = {"ReferencingConfigurationPolicies"})
    @Expose
	@Nullable
    public DeviceManagementConfigurationPolicyCollectionPage referencingConfigurationPolicies;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("referencingConfigurationPolicies")) {
            referencingConfigurationPolicies = serializer.deserializeObject(json.get("referencingConfigurationPolicies"), DeviceManagementConfigurationPolicyCollectionPage.class);
        }
    }
}
