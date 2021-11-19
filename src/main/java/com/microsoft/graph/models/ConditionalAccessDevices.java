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
import com.microsoft.graph.models.ConditionalAccessFilter;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conditional Access Devices.
 */
public class ConditionalAccessDevices implements IJsonBackedObject {

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
     * The Device Filter.
     * 
     */
    @SerializedName(value = "deviceFilter", alternate = {"DeviceFilter"})
    @Expose
	@Nullable
    public ConditionalAccessFilter deviceFilter;

    /**
     * The Exclude Devices.
     * 
     */
    @SerializedName(value = "excludeDevices", alternate = {"ExcludeDevices"})
    @Expose
	@Nullable
    public java.util.List<String> excludeDevices;

    /**
     * The Exclude Device States.
     * 
     */
    @SerializedName(value = "excludeDeviceStates", alternate = {"ExcludeDeviceStates"})
    @Expose
	@Nullable
    public java.util.List<String> excludeDeviceStates;

    /**
     * The Include Devices.
     * 
     */
    @SerializedName(value = "includeDevices", alternate = {"IncludeDevices"})
    @Expose
	@Nullable
    public java.util.List<String> includeDevices;

    /**
     * The Include Device States.
     * 
     */
    @SerializedName(value = "includeDeviceStates", alternate = {"IncludeDeviceStates"})
    @Expose
	@Nullable
    public java.util.List<String> includeDeviceStates;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
