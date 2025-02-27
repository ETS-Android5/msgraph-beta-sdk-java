// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud Pc Device.
 */
public class CloudPcDevice extends Entity implements IJsonBackedObject {


    /**
     * The Cloud Pc Status.
     * The status of the cloud PC. Possible values are: notProvisioned, provisioning, provisioned, upgrading, inGracePeriod, deprovisioning, failed. Required. Read-only.
     */
    @SerializedName(value = "cloudPcStatus", alternate = {"CloudPcStatus"})
    @Expose
	@Nullable
    public String cloudPcStatus;

    /**
     * The Device Specification.
     * 
     */
    @SerializedName(value = "deviceSpecification", alternate = {"DeviceSpecification"})
    @Expose
	@Nullable
    public String deviceSpecification;

    /**
     * The Display Name.
     * The display name for the cloud PC. Required. Read-only.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Last Refreshed Date Time.
     * Date and time the entity was last updated in the multi-tenant management platform. Required. Read-only.
     */
    @SerializedName(value = "lastRefreshedDateTime", alternate = {"LastRefreshedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastRefreshedDateTime;

    /**
     * The Managed Device Id.
     * The managed device identifier for the cloud PC. Optional. Read-only.
     */
    @SerializedName(value = "managedDeviceId", alternate = {"ManagedDeviceId"})
    @Expose
	@Nullable
    public String managedDeviceId;

    /**
     * The Managed Device Name.
     * The managed device display name for the cloud PC. Optional. Read-only.
     */
    @SerializedName(value = "managedDeviceName", alternate = {"ManagedDeviceName"})
    @Expose
	@Nullable
    public String managedDeviceName;

    /**
     * The Provisioning Policy Id.
     * The provisioning policy identifier for the cloud PC. Required. Read-only.
     */
    @SerializedName(value = "provisioningPolicyId", alternate = {"ProvisioningPolicyId"})
    @Expose
	@Nullable
    public String provisioningPolicyId;

    /**
     * The Service Plan Name.
     * The service plan name for the cloud PC. Required. Read-only.
     */
    @SerializedName(value = "servicePlanName", alternate = {"ServicePlanName"})
    @Expose
	@Nullable
    public String servicePlanName;

    /**
     * The Service Plan Type.
     * 
     */
    @SerializedName(value = "servicePlanType", alternate = {"ServicePlanType"})
    @Expose
	@Nullable
    public String servicePlanType;

    /**
     * The Tenant Display Name.
     * The display name for the managed tenant. Required. Read-only.
     */
    @SerializedName(value = "tenantDisplayName", alternate = {"TenantDisplayName"})
    @Expose
	@Nullable
    public String tenantDisplayName;

    /**
     * The Tenant Id.
     * The Azure Active Directory tenant identifier for the managed tenant. Required. Read-only.
     */
    @SerializedName(value = "tenantId", alternate = {"TenantId"})
    @Expose
	@Nullable
    public String tenantId;

    /**
     * The User Principal Name.
     * The user principal name (UPN) of the user assigned to the cloud PC. Required. Read-only.
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
