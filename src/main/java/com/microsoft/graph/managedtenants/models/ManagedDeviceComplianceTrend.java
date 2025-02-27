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
 * The class for the Managed Device Compliance Trend.
 */
public class ManagedDeviceComplianceTrend extends Entity implements IJsonBackedObject {


    /**
     * The Compliant Device Count.
     * The number of devices with a compliant status. Required. Read-only.
     */
    @SerializedName(value = "compliantDeviceCount", alternate = {"CompliantDeviceCount"})
    @Expose
	@Nullable
    public Integer compliantDeviceCount;

    /**
     * The Config Manager Device Count.
     * The number of devices manged by Configuration Manager. Required. Read-only.
     */
    @SerializedName(value = "configManagerDeviceCount", alternate = {"ConfigManagerDeviceCount"})
    @Expose
	@Nullable
    public Integer configManagerDeviceCount;

    /**
     * The Count Date Time.
     * The date and time compliance snapshot was performed. Required. Read-only.
     */
    @SerializedName(value = "countDateTime", alternate = {"CountDateTime"})
    @Expose
	@Nullable
    public String countDateTime;

    /**
     * The Error Device Count.
     * The number of devices with an error status. Required. Read-only.
     */
    @SerializedName(value = "errorDeviceCount", alternate = {"ErrorDeviceCount"})
    @Expose
	@Nullable
    public Integer errorDeviceCount;

    /**
     * The In Grace Period Device Count.
     * The number of devices that are in a grace period status. Required. Read-only.
     */
    @SerializedName(value = "inGracePeriodDeviceCount", alternate = {"InGracePeriodDeviceCount"})
    @Expose
	@Nullable
    public Integer inGracePeriodDeviceCount;

    /**
     * The Noncompliant Device Count.
     * The number of devices that are in a non-compliant status. Required. Read-only.
     */
    @SerializedName(value = "noncompliantDeviceCount", alternate = {"NoncompliantDeviceCount"})
    @Expose
	@Nullable
    public Integer noncompliantDeviceCount;

    /**
     * The Tenant Display Name.
     * The display name for the managed tenant. Optional. Read-only.
     */
    @SerializedName(value = "tenantDisplayName", alternate = {"TenantDisplayName"})
    @Expose
	@Nullable
    public String tenantDisplayName;

    /**
     * The Tenant Id.
     * The Azure Active Directory tenant identifier for the managed tenant. Optional. Read-only.
     */
    @SerializedName(value = "tenantId", alternate = {"TenantId"})
    @Expose
	@Nullable
    public String tenantId;

    /**
     * The Unknown Device Count.
     * The number of devices in an unknown status. Required. Read-only.
     */
    @SerializedName(value = "unknownDeviceCount", alternate = {"UnknownDeviceCount"})
    @Expose
	@Nullable
    public Integer unknownDeviceCount;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
