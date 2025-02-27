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
import com.microsoft.graph.models.DeviceManagementPartnerAssignment;
import com.microsoft.graph.models.DeviceManagementPartnerAppType;
import com.microsoft.graph.models.DeviceManagementPartnerTenantState;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Partner.
 */
public class DeviceManagementPartner extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * Partner display name
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Groups Requiring Partner Enrollment.
     * User groups that specifies whether enrollment is through partner.
     */
    @SerializedName(value = "groupsRequiringPartnerEnrollment", alternate = {"GroupsRequiringPartnerEnrollment"})
    @Expose
	@Nullable
    public java.util.List<DeviceManagementPartnerAssignment> groupsRequiringPartnerEnrollment;

    /**
     * The Is Configured.
     * Whether device management partner is configured or not
     */
    @SerializedName(value = "isConfigured", alternate = {"IsConfigured"})
    @Expose
	@Nullable
    public Boolean isConfigured;

    /**
     * The Last Heartbeat Date Time.
     * Timestamp of last heartbeat after admin enabled option Connect to Device management Partner
     */
    @SerializedName(value = "lastHeartbeatDateTime", alternate = {"LastHeartbeatDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastHeartbeatDateTime;

    /**
     * The Partner App Type.
     * Partner App type. Possible values are: unknown, singleTenantApp, multiTenantApp.
     */
    @SerializedName(value = "partnerAppType", alternate = {"PartnerAppType"})
    @Expose
	@Nullable
    public DeviceManagementPartnerAppType partnerAppType;

    /**
     * The Partner State.
     * Partner state of this tenant. Possible values are: unknown, unavailable, enabled, terminated, rejected, unresponsive.
     */
    @SerializedName(value = "partnerState", alternate = {"PartnerState"})
    @Expose
	@Nullable
    public DeviceManagementPartnerTenantState partnerState;

    /**
     * The Single Tenant App Id.
     * Partner Single tenant App id
     */
    @SerializedName(value = "singleTenantAppId", alternate = {"SingleTenantAppId"})
    @Expose
	@Nullable
    public String singleTenantAppId;

    /**
     * The When Partner Devices Will Be Marked As Non Compliant.
     * DateTime in UTC when PartnerDevices will be marked as NonCompliant. This will become obselete soon.
     */
    @SerializedName(value = "whenPartnerDevicesWillBeMarkedAsNonCompliant", alternate = {"WhenPartnerDevicesWillBeMarkedAsNonCompliant"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime whenPartnerDevicesWillBeMarkedAsNonCompliant;

    /**
     * The When Partner Devices Will Be Marked As Non Compliant Date Time.
     * DateTime in UTC when PartnerDevices will be marked as NonCompliant
     */
    @SerializedName(value = "whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime", alternate = {"WhenPartnerDevicesWillBeMarkedAsNonCompliantDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime;

    /**
     * The When Partner Devices Will Be Removed.
     * DateTime in UTC when PartnerDevices will be removed. This will become obselete soon.
     */
    @SerializedName(value = "whenPartnerDevicesWillBeRemoved", alternate = {"WhenPartnerDevicesWillBeRemoved"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime whenPartnerDevicesWillBeRemoved;

    /**
     * The When Partner Devices Will Be Removed Date Time.
     * DateTime in UTC when PartnerDevices will be removed
     */
    @SerializedName(value = "whenPartnerDevicesWillBeRemovedDateTime", alternate = {"WhenPartnerDevicesWillBeRemovedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime whenPartnerDevicesWillBeRemovedDateTime;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
