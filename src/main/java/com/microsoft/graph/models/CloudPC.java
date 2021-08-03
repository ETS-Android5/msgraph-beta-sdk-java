// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.CloudPcStatus;
import com.microsoft.graph.models.CloudPcStatusDetails;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud PC.
 */
public class CloudPC extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * The Cloud PC display name.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Grace Period End Date Time.
     * The date and time when the grace period ends and reprovisioning/deprovisioning happens. Required only if status is inGracePeriod. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    @SerializedName(value = "gracePeriodEndDateTime", alternate = {"GracePeriodEndDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime gracePeriodEndDateTime;

    /**
     * The Image Display Name.
     * Name of the OS image that's on the Cloud PC.
     */
    @SerializedName(value = "imageDisplayName", alternate = {"ImageDisplayName"})
    @Expose
	@Nullable
    public String imageDisplayName;

    /**
     * The Last Modified Date Time.
     * The Cloud PC's last modified date and time. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Managed Device Id.
     * The Cloud PC’s Intune device ID.
     */
    @SerializedName(value = "managedDeviceId", alternate = {"ManagedDeviceId"})
    @Expose
	@Nullable
    public String managedDeviceId;

    /**
     * The Managed Device Name.
     * The Cloud PC’s Intune device name.
     */
    @SerializedName(value = "managedDeviceName", alternate = {"ManagedDeviceName"})
    @Expose
	@Nullable
    public String managedDeviceName;

    /**
     * The On Premises Connection Name.
     * The on-premises connection that is applied during provisioning of Cloud PCs.
     */
    @SerializedName(value = "onPremisesConnectionName", alternate = {"OnPremisesConnectionName"})
    @Expose
	@Nullable
    public String onPremisesConnectionName;

    /**
     * The Provisioning Policy Id.
     * The Cloud PC's provisioning policy ID.
     */
    @SerializedName(value = "provisioningPolicyId", alternate = {"ProvisioningPolicyId"})
    @Expose
	@Nullable
    public String provisioningPolicyId;

    /**
     * The Provisioning Policy Name.
     * The provisioning policy that is applied during provisioning of Cloud PCs.
     */
    @SerializedName(value = "provisioningPolicyName", alternate = {"ProvisioningPolicyName"})
    @Expose
	@Nullable
    public String provisioningPolicyName;

    /**
     * The Service Plan Id.
     * The Cloud PC's service plan ID.
     */
    @SerializedName(value = "servicePlanId", alternate = {"ServicePlanId"})
    @Expose
	@Nullable
    public String servicePlanId;

    /**
     * The Service Plan Name.
     * The Cloud PC's service plan name.
     */
    @SerializedName(value = "servicePlanName", alternate = {"ServicePlanName"})
    @Expose
	@Nullable
    public String servicePlanName;

    /**
     * The Status.
     * Status of the Cloud PC. Possible values are: notProvisioned, provisioning, provisioned, upgrading, inGracePeriod, deprovisioning, failed.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public CloudPcStatus status;

    /**
     * The Status Details.
     * The details of the Cloud PC status.
     */
    @SerializedName(value = "statusDetails", alternate = {"StatusDetails"})
    @Expose
	@Nullable
    public CloudPcStatusDetails statusDetails;

    /**
     * The User Principal Name.
     * The user principal name (UPN) of the user assigned to the Cloud PC.
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
	@Nullable
    public String userPrincipalName;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
