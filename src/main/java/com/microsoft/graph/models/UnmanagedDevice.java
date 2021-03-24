// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
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
 * The class for the Unmanaged Device.
 */
public class UnmanagedDevice implements IJsonBackedObject {

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
     * The Device Name.
     * Device name.
     */
    @SerializedName(value = "deviceName", alternate = {"DeviceName"})
    @Expose
	@Nullable
    public String deviceName;

    /**
     * The Domain.
     * Domain.
     */
    @SerializedName(value = "domain", alternate = {"Domain"})
    @Expose
	@Nullable
    public String domain;

    /**
     * The Ip Address.
     * IP address.
     */
    @SerializedName(value = "ipAddress", alternate = {"IpAddress"})
    @Expose
	@Nullable
    public String ipAddress;

    /**
     * The Last Logged On User.
     * Last logged on user.
     */
    @SerializedName(value = "lastLoggedOnUser", alternate = {"LastLoggedOnUser"})
    @Expose
	@Nullable
    public String lastLoggedOnUser;

    /**
     * The Last Seen Date Time.
     * Last seen date and time.
     */
    @SerializedName(value = "lastSeenDateTime", alternate = {"LastSeenDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastSeenDateTime;

    /**
     * The Location.
     * Location.
     */
    @SerializedName(value = "location", alternate = {"Location"})
    @Expose
	@Nullable
    public String location;

    /**
     * The Mac Address.
     * MAC address.
     */
    @SerializedName(value = "macAddress", alternate = {"MacAddress"})
    @Expose
	@Nullable
    public String macAddress;

    /**
     * The Manufacturer.
     * Manufacturer.
     */
    @SerializedName(value = "manufacturer", alternate = {"Manufacturer"})
    @Expose
	@Nullable
    public String manufacturer;

    /**
     * The Model.
     * Model.
     */
    @SerializedName(value = "model", alternate = {"Model"})
    @Expose
	@Nullable
    public String model;

    /**
     * The Os.
     * Operating system.
     */
    @SerializedName(value = "os", alternate = {"Os"})
    @Expose
	@Nullable
    public String os;

    /**
     * The Os Version.
     * Operating system version.
     */
    @SerializedName(value = "osVersion", alternate = {"OsVersion"})
    @Expose
	@Nullable
    public String osVersion;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
