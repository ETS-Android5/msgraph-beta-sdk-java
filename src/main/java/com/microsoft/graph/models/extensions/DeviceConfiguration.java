// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DeviceManagementApplicabilityRuleDeviceMode;
import com.microsoft.graph.models.extensions.DeviceManagementApplicabilityRuleOsEdition;
import com.microsoft.graph.models.extensions.DeviceManagementApplicabilityRuleOsVersion;
import com.microsoft.graph.models.extensions.DeviceConfigurationAssignment;
import com.microsoft.graph.models.extensions.SettingStateDeviceSummary;
import com.microsoft.graph.models.extensions.DeviceConfigurationDeviceStatus;
import com.microsoft.graph.models.extensions.DeviceConfigurationDeviceOverview;
import com.microsoft.graph.models.extensions.DeviceConfigurationGroupAssignment;
import com.microsoft.graph.models.extensions.DeviceConfigurationUserStatus;
import com.microsoft.graph.models.extensions.DeviceConfigurationUserOverview;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.DeviceConfigurationAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.SettingStateDeviceSummaryCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceConfigurationDeviceStatusCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceConfigurationGroupAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceConfigurationUserStatusCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration.
 */
public class DeviceConfiguration extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * DateTime the object was created.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Description.
     * Admin provided description of the Device Configuration.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Device Management Applicability Rule Device Mode.
     * The device mode applicability rule for this Policy.
     */
    @SerializedName(value = "deviceManagementApplicabilityRuleDeviceMode", alternate = {"DeviceManagementApplicabilityRuleDeviceMode"})
    @Expose
    public DeviceManagementApplicabilityRuleDeviceMode deviceManagementApplicabilityRuleDeviceMode;

    /**
     * The Device Management Applicability Rule Os Edition.
     * The OS edition applicability for this Policy.
     */
    @SerializedName(value = "deviceManagementApplicabilityRuleOsEdition", alternate = {"DeviceManagementApplicabilityRuleOsEdition"})
    @Expose
    public DeviceManagementApplicabilityRuleOsEdition deviceManagementApplicabilityRuleOsEdition;

    /**
     * The Device Management Applicability Rule Os Version.
     * The OS version applicability rule for this Policy.
     */
    @SerializedName(value = "deviceManagementApplicabilityRuleOsVersion", alternate = {"DeviceManagementApplicabilityRuleOsVersion"})
    @Expose
    public DeviceManagementApplicabilityRuleOsVersion deviceManagementApplicabilityRuleOsVersion;

    /**
     * The Display Name.
     * Admin provided name of the device configuration.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Last Modified Date Time.
     * DateTime the object was last modified.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Role Scope Tag Ids.
     * List of Scope Tags for this Entity instance.
     */
    @SerializedName(value = "roleScopeTagIds", alternate = {"RoleScopeTagIds"})
    @Expose
    public java.util.List<String> roleScopeTagIds;

    /**
     * The Supports Scope Tags.
     * Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only.
     */
    @SerializedName(value = "supportsScopeTags", alternate = {"SupportsScopeTags"})
    @Expose
    public Boolean supportsScopeTags;

    /**
     * The Version.
     * Version of the device configuration.
     */
    @SerializedName(value = "version", alternate = {"Version"})
    @Expose
    public Integer version;

    /**
     * The Assignments.
     * The list of assignments for the device configuration profile.
     */
    @SerializedName(value = "assignments", alternate = {"Assignments"})
    @Expose
    public DeviceConfigurationAssignmentCollectionPage assignments;

    /**
     * The Device Setting State Summaries.
     * Device Configuration Setting State Device Summary
     */
    @SerializedName(value = "deviceSettingStateSummaries", alternate = {"DeviceSettingStateSummaries"})
    @Expose
    public SettingStateDeviceSummaryCollectionPage deviceSettingStateSummaries;

    /**
     * The Device Statuses.
     * Device configuration installation status by device.
     */
    @SerializedName(value = "deviceStatuses", alternate = {"DeviceStatuses"})
    @Expose
    public DeviceConfigurationDeviceStatusCollectionPage deviceStatuses;

    /**
     * The Device Status Overview.
     * Device Configuration devices status overview
     */
    @SerializedName(value = "deviceStatusOverview", alternate = {"DeviceStatusOverview"})
    @Expose
    public DeviceConfigurationDeviceOverview deviceStatusOverview;

    /**
     * The Group Assignments.
     * The list of group assignments for the device configuration profile.
     */
    @SerializedName(value = "groupAssignments", alternate = {"GroupAssignments"})
    @Expose
    public DeviceConfigurationGroupAssignmentCollectionPage groupAssignments;

    /**
     * The User Statuses.
     * Device configuration installation status by user.
     */
    @SerializedName(value = "userStatuses", alternate = {"UserStatuses"})
    @Expose
    public DeviceConfigurationUserStatusCollectionPage userStatuses;

    /**
     * The User Status Overview.
     * Device Configuration users status overview
     */
    @SerializedName(value = "userStatusOverview", alternate = {"UserStatusOverview"})
    @Expose
    public DeviceConfigurationUserOverview userStatusOverview;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("assignments")) {
            assignments = serializer.deserializeObject(json.get("assignments").toString(), DeviceConfigurationAssignmentCollectionPage.class);
        }

        if (json.has("deviceSettingStateSummaries")) {
            deviceSettingStateSummaries = serializer.deserializeObject(json.get("deviceSettingStateSummaries").toString(), SettingStateDeviceSummaryCollectionPage.class);
        }

        if (json.has("deviceStatuses")) {
            deviceStatuses = serializer.deserializeObject(json.get("deviceStatuses").toString(), DeviceConfigurationDeviceStatusCollectionPage.class);
        }

        if (json.has("groupAssignments")) {
            groupAssignments = serializer.deserializeObject(json.get("groupAssignments").toString(), DeviceConfigurationGroupAssignmentCollectionPage.class);
        }

        if (json.has("userStatuses")) {
            userStatuses = serializer.deserializeObject(json.get("userStatuses").toString(), DeviceConfigurationUserStatusCollectionPage.class);
        }
    }
}
