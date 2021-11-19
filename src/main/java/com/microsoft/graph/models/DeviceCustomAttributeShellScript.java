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
import com.microsoft.graph.models.DeviceCustomAttributeValueType;
import com.microsoft.graph.models.RunAsAccountType;
import com.microsoft.graph.models.DeviceManagementScriptAssignment;
import com.microsoft.graph.models.DeviceManagementScriptDeviceState;
import com.microsoft.graph.models.DeviceManagementScriptGroupAssignment;
import com.microsoft.graph.models.DeviceManagementScriptRunSummary;
import com.microsoft.graph.models.DeviceManagementScriptUserState;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.DeviceManagementScriptAssignmentCollectionPage;
import com.microsoft.graph.requests.DeviceManagementScriptDeviceStateCollectionPage;
import com.microsoft.graph.requests.DeviceManagementScriptGroupAssignmentCollectionPage;
import com.microsoft.graph.requests.DeviceManagementScriptUserStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Custom Attribute Shell Script.
 */
public class DeviceCustomAttributeShellScript extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * The date and time the device management script was created. This property is read-only.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Custom Attribute Name.
     * The name of the custom attribute.
     */
    @SerializedName(value = "customAttributeName", alternate = {"CustomAttributeName"})
    @Expose
	@Nullable
    public String customAttributeName;

    /**
     * The Custom Attribute Type.
     * The expected type of the custom attribute's value.
     */
    @SerializedName(value = "customAttributeType", alternate = {"CustomAttributeType"})
    @Expose
	@Nullable
    public DeviceCustomAttributeValueType customAttributeType;

    /**
     * The Description.
     * Optional description for the device management script.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * Name of the device management script.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The File Name.
     * Script file name.
     */
    @SerializedName(value = "fileName", alternate = {"FileName"})
    @Expose
	@Nullable
    public String fileName;

    /**
     * The Last Modified Date Time.
     * The date and time the device management script was last modified. This property is read-only.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Role Scope Tag Ids.
     * List of Scope Tag IDs for this PowerShellScript instance.
     */
    @SerializedName(value = "roleScopeTagIds", alternate = {"RoleScopeTagIds"})
    @Expose
	@Nullable
    public java.util.List<String> roleScopeTagIds;

    /**
     * The Run As Account.
     * Indicates the type of execution context.
     */
    @SerializedName(value = "runAsAccount", alternate = {"RunAsAccount"})
    @Expose
	@Nullable
    public RunAsAccountType runAsAccount;

    /**
     * The Script Content.
     * The script content.
     */
    @SerializedName(value = "scriptContent", alternate = {"ScriptContent"})
    @Expose
	@Nullable
    public byte[] scriptContent;

    /**
     * The Assignments.
     * The list of group assignments for the device management script.
     */
    @SerializedName(value = "assignments", alternate = {"Assignments"})
    @Expose
	@Nullable
    public DeviceManagementScriptAssignmentCollectionPage assignments;

    /**
     * The Device Run States.
     * List of run states for this script across all devices.
     */
    @SerializedName(value = "deviceRunStates", alternate = {"DeviceRunStates"})
    @Expose
	@Nullable
    public DeviceManagementScriptDeviceStateCollectionPage deviceRunStates;

    /**
     * The Group Assignments.
     * The list of group assignments for the device management script.
     */
    @SerializedName(value = "groupAssignments", alternate = {"GroupAssignments"})
    @Expose
	@Nullable
    public DeviceManagementScriptGroupAssignmentCollectionPage groupAssignments;

    /**
     * The Run Summary.
     * Run summary for device management script.
     */
    @SerializedName(value = "runSummary", alternate = {"RunSummary"})
    @Expose
	@Nullable
    public DeviceManagementScriptRunSummary runSummary;

    /**
     * The User Run States.
     * List of run states for this script across all users.
     */
    @SerializedName(value = "userRunStates", alternate = {"UserRunStates"})
    @Expose
	@Nullable
    public DeviceManagementScriptUserStateCollectionPage userRunStates;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("assignments")) {
            assignments = serializer.deserializeObject(json.get("assignments"), DeviceManagementScriptAssignmentCollectionPage.class);
        }

        if (json.has("deviceRunStates")) {
            deviceRunStates = serializer.deserializeObject(json.get("deviceRunStates"), DeviceManagementScriptDeviceStateCollectionPage.class);
        }

        if (json.has("groupAssignments")) {
            groupAssignments = serializer.deserializeObject(json.get("groupAssignments"), DeviceManagementScriptGroupAssignmentCollectionPage.class);
        }

        if (json.has("userRunStates")) {
            userRunStates = serializer.deserializeObject(json.get("userRunStates"), DeviceManagementScriptUserStateCollectionPage.class);
        }
    }
}
