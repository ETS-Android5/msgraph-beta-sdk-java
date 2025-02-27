// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.HealthState;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Management App Health State.
 */
public class WindowsManagementAppHealthState extends Entity implements IJsonBackedObject {


    /**
     * The Device Name.
     * Name of the device on which Windows management app is installed.
     */
    @SerializedName(value = "deviceName", alternate = {"DeviceName"})
    @Expose
	@Nullable
    public String deviceName;

    /**
     * The Device OSVersion.
     * Windows 10 OS version of the device on which Windows management app is installed.
     */
    @SerializedName(value = "deviceOSVersion", alternate = {"DeviceOSVersion"})
    @Expose
	@Nullable
    public String deviceOSVersion;

    /**
     * The Health State.
     * Windows management app health state. Possible values are: unknown, healthy, unhealthy.
     */
    @SerializedName(value = "healthState", alternate = {"HealthState"})
    @Expose
	@Nullable
    public HealthState healthState;

    /**
     * The Installed Version.
     * Windows management app installed version.
     */
    @SerializedName(value = "installedVersion", alternate = {"InstalledVersion"})
    @Expose
	@Nullable
    public String installedVersion;

    /**
     * The Last Check In Date Time.
     * Windows management app last check-in time.
     */
    @SerializedName(value = "lastCheckInDateTime", alternate = {"LastCheckInDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastCheckInDateTime;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
