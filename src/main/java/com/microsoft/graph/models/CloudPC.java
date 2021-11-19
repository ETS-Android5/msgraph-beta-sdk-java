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
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Grace Period End Date Time.
     * 
     */
    @SerializedName(value = "gracePeriodEndDateTime", alternate = {"GracePeriodEndDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime gracePeriodEndDateTime;

    /**
     * The Image Display Name.
     * 
     */
    @SerializedName(value = "imageDisplayName", alternate = {"ImageDisplayName"})
    @Expose
	@Nullable
    public String imageDisplayName;

    /**
     * The Last Modified Date Time.
     * 
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Managed Device Id.
     * 
     */
    @SerializedName(value = "managedDeviceId", alternate = {"ManagedDeviceId"})
    @Expose
	@Nullable
    public String managedDeviceId;

    /**
     * The Managed Device Name.
     * 
     */
    @SerializedName(value = "managedDeviceName", alternate = {"ManagedDeviceName"})
    @Expose
	@Nullable
    public String managedDeviceName;

    /**
     * The On Premises Connection Name.
     * 
     */
    @SerializedName(value = "onPremisesConnectionName", alternate = {"OnPremisesConnectionName"})
    @Expose
	@Nullable
    public String onPremisesConnectionName;

    /**
     * The Provisioning Policy Id.
     * 
     */
    @SerializedName(value = "provisioningPolicyId", alternate = {"ProvisioningPolicyId"})
    @Expose
	@Nullable
    public String provisioningPolicyId;

    /**
     * The Provisioning Policy Name.
     * 
     */
    @SerializedName(value = "provisioningPolicyName", alternate = {"ProvisioningPolicyName"})
    @Expose
	@Nullable
    public String provisioningPolicyName;

    /**
     * The Service Plan Id.
     * 
     */
    @SerializedName(value = "servicePlanId", alternate = {"ServicePlanId"})
    @Expose
	@Nullable
    public String servicePlanId;

    /**
     * The Service Plan Name.
     * 
     */
    @SerializedName(value = "servicePlanName", alternate = {"ServicePlanName"})
    @Expose
	@Nullable
    public String servicePlanName;

    /**
     * The Status.
     * 
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public CloudPcStatus status;

    /**
     * The Status Details.
     * 
     */
    @SerializedName(value = "statusDetails", alternate = {"StatusDetails"})
    @Expose
	@Nullable
    public CloudPcStatusDetails statusDetails;

    /**
     * The User Principal Name.
     * 
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
