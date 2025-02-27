// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.WindowsDefenderApplicationControlSupplementalPolicyStatuses;
import com.microsoft.graph.models.WindowsDefenderApplicationControlSupplementalPolicy;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Defender Application Control Supplemental Policy Deployment Status.
 */
public class WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus extends Entity implements IJsonBackedObject {


    /**
     * The Deployment Status.
     * The deployment state of the policy. Possible values are: unknown, success, tokenError, notAuthorizedByToken, policyNotFound.
     */
    @SerializedName(value = "deploymentStatus", alternate = {"DeploymentStatus"})
    @Expose
	@Nullable
    public WindowsDefenderApplicationControlSupplementalPolicyStatuses deploymentStatus;

    /**
     * The Device Id.
     * Device ID.
     */
    @SerializedName(value = "deviceId", alternate = {"DeviceId"})
    @Expose
	@Nullable
    public String deviceId;

    /**
     * The Device Name.
     * Device name.
     */
    @SerializedName(value = "deviceName", alternate = {"DeviceName"})
    @Expose
	@Nullable
    public String deviceName;

    /**
     * The Last Sync Date Time.
     * Last sync date time.
     */
    @SerializedName(value = "lastSyncDateTime", alternate = {"LastSyncDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastSyncDateTime;

    /**
     * The Os Description.
     * Windows OS Version Description.
     */
    @SerializedName(value = "osDescription", alternate = {"OsDescription"})
    @Expose
	@Nullable
    public String osDescription;

    /**
     * The Os Version.
     * Windows OS Version.
     */
    @SerializedName(value = "osVersion", alternate = {"OsVersion"})
    @Expose
	@Nullable
    public String osVersion;

    /**
     * The Policy Version.
     * Human readable version of the WindowsDefenderApplicationControl supplemental policy.
     */
    @SerializedName(value = "policyVersion", alternate = {"PolicyVersion"})
    @Expose
	@Nullable
    public String policyVersion;

    /**
     * The User Name.
     * The name of the user of this device.
     */
    @SerializedName(value = "userName", alternate = {"UserName"})
    @Expose
	@Nullable
    public String userName;

    /**
     * The User Principal Name.
     * User Principal Name.
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
	@Nullable
    public String userPrincipalName;

    /**
     * The Policy.
     * The navigation link to the WindowsDefenderApplicationControl supplemental policy.
     */
    @SerializedName(value = "policy", alternate = {"Policy"})
    @Expose
	@Nullable
    public WindowsDefenderApplicationControlSupplementalPolicy policy;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
