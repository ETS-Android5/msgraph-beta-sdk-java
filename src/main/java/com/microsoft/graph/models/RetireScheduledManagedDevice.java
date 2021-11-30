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
import com.microsoft.graph.models.ComplianceStatus;
import com.microsoft.graph.models.DeviceType;
import com.microsoft.graph.models.ManagementAgentType;
import com.microsoft.graph.models.ManagedDeviceOwnerType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Retire Scheduled Managed Device.
 */
public class RetireScheduledManagedDevice implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Compliance State.
     * Managed Device ComplianceStatus. Possible values are: unknown, notApplicable, compliant, remediated, nonCompliant, error, conflict, notAssigned.
     */
    @SerializedName(value = "complianceState", alternate = {"ComplianceState"})
    @Expose
	@Nullable
    public ComplianceStatus complianceState;

    /**
     * The Device Compliance Policy Id.
     * Device Compliance PolicyId
     */
    @SerializedName(value = "deviceCompliancePolicyId", alternate = {"DeviceCompliancePolicyId"})
    @Expose
	@Nullable
    public String deviceCompliancePolicyId;

    /**
     * The Device Compliance Policy Name.
     * Device Compliance Policy Name
     */
    @SerializedName(value = "deviceCompliancePolicyName", alternate = {"DeviceCompliancePolicyName"})
    @Expose
	@Nullable
    public String deviceCompliancePolicyName;

    /**
     * The Device Type.
     * Managed Device Device Type. Possible values are: desktop, windowsRT, winMO6, nokia, windowsPhone, mac, winCE, winEmbedded, iPhone, iPad, iPod, android, iSocConsumer, unix, macMDM, holoLens, surfaceHub, androidForWork, androidEnterprise, windows10x, androidnGMS, cloudPC, blackberry, palm, unknown.
     */
    @SerializedName(value = "deviceType", alternate = {"DeviceType"})
    @Expose
	@Nullable
    public DeviceType deviceType;

    /**
     * The Id.
     * Key of the entity.
     */
    @SerializedName(value = "id", alternate = {"Id"})
    @Expose
	@Nullable
    public String id;

    /**
     * The Managed Device Id.
     * Managed DeviceId
     */
    @SerializedName(value = "managedDeviceId", alternate = {"ManagedDeviceId"})
    @Expose
	@Nullable
    public String managedDeviceId;

    /**
     * The Managed Device Name.
     * Managed Device Name
     */
    @SerializedName(value = "managedDeviceName", alternate = {"ManagedDeviceName"})
    @Expose
	@Nullable
    public String managedDeviceName;

    /**
     * The Management Agent.
     * Managed Device ManagementAgentType. Possible values are: eas, mdm, easMdm, intuneClient, easIntuneClient, configurationManagerClient, configurationManagerClientMdm, configurationManagerClientMdmEas, unknown, jamf, googleCloudDevicePolicyController, microsoft365ManagedMdm, windowsManagementCloudApi.
     */
    @SerializedName(value = "managementAgent", alternate = {"ManagementAgent"})
    @Expose
	@Nullable
    public ManagementAgentType managementAgent;

    /**
     * The Owner Type.
     * Managed Device ManagedDeviceOwnerType. Possible values are: unknown, company, personal.
     */
    @SerializedName(value = "ownerType", alternate = {"OwnerType"})
    @Expose
	@Nullable
    public ManagedDeviceOwnerType ownerType;

    /**
     * The Retire After Date Time.
     * Managed Device Retire After DateTime
     */
    @SerializedName(value = "retireAfterDateTime", alternate = {"RetireAfterDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime retireAfterDateTime;

    /**
     * The Role Scope Tag Ids.
     * List of Scope Tags for this Entity instance.
     */
    @SerializedName(value = "roleScopeTagIds", alternate = {"RoleScopeTagIds"})
    @Expose
	@Nullable
    public java.util.List<String> roleScopeTagIds;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
