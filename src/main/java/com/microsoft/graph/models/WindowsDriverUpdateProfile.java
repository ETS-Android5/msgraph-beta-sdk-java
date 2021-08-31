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
import com.microsoft.graph.models.DriverUpdateProfileApprovalType;
import com.microsoft.graph.models.WindowsDriverUpdateProfileAssignment;
import com.microsoft.graph.models.WindowsDriverUpdateInventory;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.WindowsDriverUpdateProfileAssignmentCollectionPage;
import com.microsoft.graph.requests.WindowsDriverUpdateInventoryCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Driver Update Profile.
 */
public class WindowsDriverUpdateProfile extends Entity implements IJsonBackedObject {


    /**
     * The Approval Type.
     * Driver update profile approval type. For example, manual or automatic approval. Possible values are: manual, automatic.
     */
    @SerializedName(value = "approvalType", alternate = {"ApprovalType"})
    @Expose
	@Nullable
    public DriverUpdateProfileApprovalType approvalType;

    /**
     * The Created Date Time.
     * The date time that the profile was created.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Deployment Deferral In Days.
     * Deployment deferral settings in days, only applicable when ApprovalType is set to automatic approval.
     */
    @SerializedName(value = "deploymentDeferralInDays", alternate = {"DeploymentDeferralInDays"})
    @Expose
	@Nullable
    public Integer deploymentDeferralInDays;

    /**
     * The Description.
     * The description of the profile which is specified by the user.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Device Reporting.
     * Number of devices reporting for this profile
     */
    @SerializedName(value = "deviceReporting", alternate = {"DeviceReporting"})
    @Expose
	@Nullable
    public Integer deviceReporting;

    /**
     * The Display Name.
     * The display name for the profile.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Last Modified Date Time.
     * The date time that the profile was last modified.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The New Updates.
     * Number of new driver updates available for this profile.
     */
    @SerializedName(value = "newUpdates", alternate = {"NewUpdates"})
    @Expose
	@Nullable
    public Integer newUpdates;

    /**
     * The Role Scope Tag Ids.
     * List of Scope Tags for this Driver Update entity.
     */
    @SerializedName(value = "roleScopeTagIds", alternate = {"RoleScopeTagIds"})
    @Expose
	@Nullable
    public java.util.List<String> roleScopeTagIds;

    /**
     * The Assignments.
     * The list of group assignments of the profile.
     */
    @SerializedName(value = "assignments", alternate = {"Assignments"})
    @Expose
	@Nullable
    public WindowsDriverUpdateProfileAssignmentCollectionPage assignments;

    /**
     * The Driver Inventories.
     * Driver inventories for this profile.
     */
    @SerializedName(value = "driverInventories", alternate = {"DriverInventories"})
    @Expose
	@Nullable
    public WindowsDriverUpdateInventoryCollectionPage driverInventories;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("assignments")) {
            assignments = serializer.deserializeObject(json.get("assignments"), WindowsDriverUpdateProfileAssignmentCollectionPage.class);
        }

        if (json.has("driverInventories")) {
            driverInventories = serializer.deserializeObject(json.get("driverInventories"), WindowsDriverUpdateInventoryCollectionPage.class);
        }
    }
}
