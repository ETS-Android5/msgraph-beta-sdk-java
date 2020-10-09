// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.PrintCertificateSigningRequest;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Printer Create Body.
 */
public class PrinterCreateBody {

    /**
     * The display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The manufacturer.
     * 
     */
    @SerializedName(value = "manufacturer", alternate = {"Manufacturer"})
    @Expose
    public String manufacturer;

    /**
     * The model.
     * 
     */
    @SerializedName(value = "model", alternate = {"Model"})
    @Expose
    public String model;

    /**
     * The physical Device Id.
     * 
     */
    @SerializedName(value = "physicalDeviceId", alternate = {"PhysicalDeviceId"})
    @Expose
    public String physicalDeviceId;

    /**
     * The has Physical Device.
     * 
     */
    @SerializedName(value = "hasPhysicalDevice", alternate = {"HasPhysicalDevice"})
    @Expose
    public Boolean hasPhysicalDevice;

    /**
     * The certificate Signing Request.
     * 
     */
    @SerializedName(value = "certificateSigningRequest", alternate = {"CertificateSigningRequest"})
    @Expose
    public PrintCertificateSigningRequest certificateSigningRequest;

    /**
     * The connector Id.
     * 
     */
    @SerializedName(value = "connectorId", alternate = {"ConnectorId"})
    @Expose
    public String connectorId;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
