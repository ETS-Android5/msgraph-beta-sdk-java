// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
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
 * The class for the User Experience Analytics Remote Connection.
 */
public class UserExperienceAnalyticsRemoteConnection extends Entity implements IJsonBackedObject {


    /**
     * The Cloud Pc Failure Percentage.
     * The sign in failure percentage of Cloud PC Device. Valid values 0 to 100
     */
    @SerializedName(value = "cloudPcFailurePercentage", alternate = {"CloudPcFailurePercentage"})
    @Expose
	@Nullable
    public Double cloudPcFailurePercentage;

    /**
     * The Cloud Pc Round Trip Time.
     * The round tip time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308
     */
    @SerializedName(value = "cloudPcRoundTripTime", alternate = {"CloudPcRoundTripTime"})
    @Expose
	@Nullable
    public Double cloudPcRoundTripTime;

    /**
     * The Cloud Pc Sign In Time.
     * The sign in time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308
     */
    @SerializedName(value = "cloudPcSignInTime", alternate = {"CloudPcSignInTime"})
    @Expose
	@Nullable
    public Double cloudPcSignInTime;

    /**
     * The Core Boot Time.
     * The core boot time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308
     */
    @SerializedName(value = "coreBootTime", alternate = {"CoreBootTime"})
    @Expose
	@Nullable
    public Double coreBootTime;

    /**
     * The Core Sign In Time.
     * The core sign in time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308
     */
    @SerializedName(value = "coreSignInTime", alternate = {"CoreSignInTime"})
    @Expose
	@Nullable
    public Double coreSignInTime;

    /**
     * The Device Count.
     * The count of remote connection. Valid values 0 to 2147483647
     */
    @SerializedName(value = "deviceCount", alternate = {"DeviceCount"})
    @Expose
	@Nullable
    public Integer deviceCount;

    /**
     * The Device Id.
     * The id of the device.
     */
    @SerializedName(value = "deviceId", alternate = {"DeviceId"})
    @Expose
	@Nullable
    public String deviceId;

    /**
     * The Device Name.
     * The name of the device.
     */
    @SerializedName(value = "deviceName", alternate = {"DeviceName"})
    @Expose
	@Nullable
    public String deviceName;

    /**
     * The Model.
     * The user experience analytics device model.
     */
    @SerializedName(value = "model", alternate = {"Model"})
    @Expose
	@Nullable
    public String model;

    /**
     * The Remote Sign In Time.
     * The remote sign in time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308
     */
    @SerializedName(value = "remoteSignInTime", alternate = {"RemoteSignInTime"})
    @Expose
	@Nullable
    public Double remoteSignInTime;

    /**
     * The Virtual Network.
     * The user experience analytics virtual network.
     */
    @SerializedName(value = "virtualNetwork", alternate = {"VirtualNetwork"})
    @Expose
	@Nullable
    public String virtualNetwork;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
