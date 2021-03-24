// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.callrecords.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Pstn Call Log Row.
 */
public class PstnCallLogRow implements IJsonBackedObject {

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
     * The Callee Number.
     * 
     */
    @SerializedName(value = "calleeNumber", alternate = {"CalleeNumber"})
    @Expose
	@Nullable
    public String calleeNumber;

    /**
     * The Caller Number.
     * 
     */
    @SerializedName(value = "callerNumber", alternate = {"CallerNumber"})
    @Expose
	@Nullable
    public String callerNumber;

    /**
     * The Call Id.
     * 
     */
    @SerializedName(value = "callId", alternate = {"CallId"})
    @Expose
	@Nullable
    public String callId;

    /**
     * The Call Type.
     * 
     */
    @SerializedName(value = "callType", alternate = {"CallType"})
    @Expose
	@Nullable
    public String callType;

    /**
     * The Charge.
     * 
     */
    @SerializedName(value = "charge", alternate = {"Charge"})
    @Expose
	@Nullable
    public java.math.BigDecimal charge;

    /**
     * The Conference Id.
     * 
     */
    @SerializedName(value = "conferenceId", alternate = {"ConferenceId"})
    @Expose
	@Nullable
    public String conferenceId;

    /**
     * The Connection Charge.
     * 
     */
    @SerializedName(value = "connectionCharge", alternate = {"ConnectionCharge"})
    @Expose
	@Nullable
    public java.math.BigDecimal connectionCharge;

    /**
     * The Currency.
     * 
     */
    @SerializedName(value = "currency", alternate = {"Currency"})
    @Expose
	@Nullable
    public String currency;

    /**
     * The Destination Context.
     * 
     */
    @SerializedName(value = "destinationContext", alternate = {"DestinationContext"})
    @Expose
	@Nullable
    public String destinationContext;

    /**
     * The Destination Name.
     * 
     */
    @SerializedName(value = "destinationName", alternate = {"DestinationName"})
    @Expose
	@Nullable
    public String destinationName;

    /**
     * The Duration.
     * 
     */
    @SerializedName(value = "duration", alternate = {"Duration"})
    @Expose
	@Nullable
    public Integer duration;

    /**
     * The End Date Time.
     * 
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime endDateTime;

    /**
     * The Id.
     * 
     */
    @SerializedName(value = "id", alternate = {"Id"})
    @Expose
	@Nullable
    public String id;

    /**
     * The Inventory Type.
     * 
     */
    @SerializedName(value = "inventoryType", alternate = {"InventoryType"})
    @Expose
	@Nullable
    public String inventoryType;

    /**
     * The License Capability.
     * 
     */
    @SerializedName(value = "licenseCapability", alternate = {"LicenseCapability"})
    @Expose
	@Nullable
    public String licenseCapability;

    /**
     * The Start Date Time.
     * 
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime startDateTime;

    /**
     * The Tenant Country Code.
     * 
     */
    @SerializedName(value = "tenantCountryCode", alternate = {"TenantCountryCode"})
    @Expose
	@Nullable
    public String tenantCountryCode;

    /**
     * The Usage Country Code.
     * 
     */
    @SerializedName(value = "usageCountryCode", alternate = {"UsageCountryCode"})
    @Expose
	@Nullable
    public String usageCountryCode;

    /**
     * The User Display Name.
     * 
     */
    @SerializedName(value = "userDisplayName", alternate = {"UserDisplayName"})
    @Expose
	@Nullable
    public String userDisplayName;

    /**
     * The User Id.
     * 
     */
    @SerializedName(value = "userId", alternate = {"UserId"})
    @Expose
	@Nullable
    public String userId;

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
