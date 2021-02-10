// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.DeviceRegistrationState;
import com.microsoft.graph.models.generated.DeviceType;
import com.microsoft.graph.models.generated.ManagementAgentType;
import com.microsoft.graph.models.generated.ManagementState;
import com.microsoft.graph.models.generated.OwnerType;
import com.microsoft.graph.models.generated.ComanagementEligibleType;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Comanagement Eligible Device.
 */
public class ComanagementEligibleDevice extends Entity implements IJsonBackedObject {


    /**
     * The Client Registration Status.
     * ClientRegistrationStatus. Possible values are: notRegistered, registered, revoked, keyConflict, approvalPending, certificateReset, notRegisteredPendingEnrollment, unknown.
     */
    @SerializedName(value = "clientRegistrationStatus", alternate = {"ClientRegistrationStatus"})
    @Expose
    public DeviceRegistrationState clientRegistrationStatus;

    /**
     * The Device Name.
     * DeviceName
     */
    @SerializedName(value = "deviceName", alternate = {"DeviceName"})
    @Expose
    public String deviceName;

    /**
     * The Device Type.
     * DeviceType. Possible values are: desktop, windowsRT, winMO6, nokia, windowsPhone, mac, winCE, winEmbedded, iPhone, iPad, iPod, android, iSocConsumer, unix, macMDM, holoLens, surfaceHub, androidForWork, androidEnterprise, windows10x, androidnGMS, linux, blackberry, palm, unknown, cloudPC.
     */
    @SerializedName(value = "deviceType", alternate = {"DeviceType"})
    @Expose
    public DeviceType deviceType;

    /**
     * The Entity Source.
     * EntitySource
     */
    @SerializedName(value = "entitySource", alternate = {"EntitySource"})
    @Expose
    public Integer entitySource;

    /**
     * The Management Agents.
     * ManagementAgents. Possible values are: eas, mdm, easMdm, intuneClient, easIntuneClient, configurationManagerClient, configurationManagerClientMdm, configurationManagerClientMdmEas, unknown, jamf, googleCloudDevicePolicyController, microsoft365ManagedMdm.
     */
    @SerializedName(value = "managementAgents", alternate = {"ManagementAgents"})
    @Expose
    public ManagementAgentType managementAgents;

    /**
     * The Management State.
     * ManagementState. Possible values are: managed, retirePending, retireFailed, wipePending, wipeFailed, unhealthy, deletePending, retireIssued, wipeIssued, wipeCanceled, retireCanceled, discovered.
     */
    @SerializedName(value = "managementState", alternate = {"ManagementState"})
    @Expose
    public ManagementState managementState;

    /**
     * The Manufacturer.
     * Manufacturer
     */
    @SerializedName(value = "manufacturer", alternate = {"Manufacturer"})
    @Expose
    public String manufacturer;

    /**
     * The Mdm Status.
     * MDMStatus
     */
    @SerializedName(value = "mdmStatus", alternate = {"MdmStatus"})
    @Expose
    public String mdmStatus;

    /**
     * The Model.
     * Model
     */
    @SerializedName(value = "model", alternate = {"Model"})
    @Expose
    public String model;

    /**
     * The Os Description.
     * OSDescription
     */
    @SerializedName(value = "osDescription", alternate = {"OsDescription"})
    @Expose
    public String osDescription;

    /**
     * The Os Version.
     * OSVersion
     */
    @SerializedName(value = "osVersion", alternate = {"OsVersion"})
    @Expose
    public String osVersion;

    /**
     * The Owner Type.
     * OwnerType. Possible values are: unknown, company, personal.
     */
    @SerializedName(value = "ownerType", alternate = {"OwnerType"})
    @Expose
    public OwnerType ownerType;

    /**
     * The Reference Id.
     * ReferenceId
     */
    @SerializedName(value = "referenceId", alternate = {"ReferenceId"})
    @Expose
    public String referenceId;

    /**
     * The Serial Number.
     * SerialNumber
     */
    @SerializedName(value = "serialNumber", alternate = {"SerialNumber"})
    @Expose
    public String serialNumber;

    /**
     * The Status.
     * ComanagementEligibleStatus. Possible values are: comanaged, eligible, eligibleButNotAzureAdJoined, needsOsUpdate, ineligible.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
    public ComanagementEligibleType status;

    /**
     * The Upn.
     * UPN
     */
    @SerializedName(value = "upn", alternate = {"Upn"})
    @Expose
    public String upn;

    /**
     * The User Email.
     * UserEmail
     */
    @SerializedName(value = "userEmail", alternate = {"UserEmail"})
    @Expose
    public String userEmail;

    /**
     * The User Id.
     * UserId
     */
    @SerializedName(value = "userId", alternate = {"UserId"})
    @Expose
    public String userId;

    /**
     * The User Name.
     * UserName
     */
    @SerializedName(value = "userName", alternate = {"UserName"})
    @Expose
    public String userName;


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
