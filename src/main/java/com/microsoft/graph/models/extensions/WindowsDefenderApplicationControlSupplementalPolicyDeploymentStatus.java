// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.WindowsDefenderApplicationControlSupplementalPolicyStatuses;
import com.microsoft.graph.models.extensions.WindowsDefenderApplicationControlSupplementalPolicy;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Defender Application Control Supplemental Policy Deployment Status.
 */
public class WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus extends Entity implements IJsonBackedObject {


    /**
     * The Deployment Status.
     * The deployment state of the policy.
     */
    @SerializedName(value = "deploymentStatus", alternate = {"DeploymentStatus"})
    @Expose
    public WindowsDefenderApplicationControlSupplementalPolicyStatuses deploymentStatus;

    /**
     * The Device Id.
     * Device ID.
     */
    @SerializedName(value = "deviceId", alternate = {"DeviceId"})
    @Expose
    public String deviceId;

    /**
     * The Device Name.
     * Device name.
     */
    @SerializedName(value = "deviceName", alternate = {"DeviceName"})
    @Expose
    public String deviceName;

    /**
     * The Last Sync Date Time.
     * Last sync date time.
     */
    @SerializedName(value = "lastSyncDateTime", alternate = {"LastSyncDateTime"})
    @Expose
    public java.util.Calendar lastSyncDateTime;

    /**
     * The Os Description.
     * Windows OS Version Description.
     */
    @SerializedName(value = "osDescription", alternate = {"OsDescription"})
    @Expose
    public String osDescription;

    /**
     * The Os Version.
     * Windows OS Version.
     */
    @SerializedName(value = "osVersion", alternate = {"OsVersion"})
    @Expose
    public String osVersion;

    /**
     * The Policy Version.
     * Human readable version of the WindowsDefenderApplicationControl supplemental policy.
     */
    @SerializedName(value = "policyVersion", alternate = {"PolicyVersion"})
    @Expose
    public String policyVersion;

    /**
     * The User Name.
     * The name of the user of this device.
     */
    @SerializedName(value = "userName", alternate = {"UserName"})
    @Expose
    public String userName;

    /**
     * The User Principal Name.
     * User Principal Name.
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
    public String userPrincipalName;

    /**
     * The Policy.
     * The navigation link to the WindowsDefenderApplicationControl supplemental policy.
     */
    @SerializedName(value = "policy", alternate = {"Policy"})
    @Expose
    public WindowsDefenderApplicationControlSupplementalPolicy policy;


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

    }
}
