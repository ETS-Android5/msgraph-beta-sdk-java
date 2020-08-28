// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Certificate Connector Setting.
 */
public class CertificateConnectorSetting implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Status.
     * Certificate connector status
     */
    @SerializedName("status")
    @Expose
    public Integer status;

    /**
     * The Cert Expiry Time.
     * Certificate expire time
     */
    @SerializedName("certExpiryTime")
    @Expose
    public java.util.Calendar certExpiryTime;

    /**
     * The Enrollment Error.
     * Certificate connector enrollment error
     */
    @SerializedName("enrollmentError")
    @Expose
    public String enrollmentError;

    /**
     * The Last Connector Connection Time.
     * Last time certificate connector connected
     */
    @SerializedName("lastConnectorConnectionTime")
    @Expose
    public java.util.Calendar lastConnectorConnectionTime;

    /**
     * The Connector Version.
     * Version of certificate connector
     */
    @SerializedName("connectorVersion")
    @Expose
    public String connectorVersion;

    /**
     * The Last Upload Version.
     * Version of last uploaded certificate connector
     */
    @SerializedName("lastUploadVersion")
    @Expose
    public Long lastUploadVersion;


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
