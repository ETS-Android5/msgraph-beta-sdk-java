// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Minimum Operating System.
 */
public class WindowsMinimumOperatingSystem implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The V10_0.
     * Windows version 10.0 or later.
     */
    @SerializedName(value = "v10_0", alternate = {"V10_0"})
    @Expose
    public Boolean v10_0;

    /**
     * The V10_1607.
     * Windows 10 1607 or later.
     */
    @SerializedName(value = "v10_1607", alternate = {"V10_1607"})
    @Expose
    public Boolean v10_1607;

    /**
     * The V10_1703.
     * Windows 10 1703 or later.
     */
    @SerializedName(value = "v10_1703", alternate = {"V10_1703"})
    @Expose
    public Boolean v10_1703;

    /**
     * The V10_1709.
     * Windows 10 1709 or later.
     */
    @SerializedName(value = "v10_1709", alternate = {"V10_1709"})
    @Expose
    public Boolean v10_1709;

    /**
     * The V10_1803.
     * Windows 10 1803 or later.
     */
    @SerializedName(value = "v10_1803", alternate = {"V10_1803"})
    @Expose
    public Boolean v10_1803;

    /**
     * The V10_1809.
     * Windows 10 1809 or later.
     */
    @SerializedName(value = "v10_1809", alternate = {"V10_1809"})
    @Expose
    public Boolean v10_1809;

    /**
     * The V10_1903.
     * Windows 10 1903 or later.
     */
    @SerializedName(value = "v10_1903", alternate = {"V10_1903"})
    @Expose
    public Boolean v10_1903;

    /**
     * The V10_1909.
     * Windows 10 1909 or later.
     */
    @SerializedName(value = "v10_1909", alternate = {"V10_1909"})
    @Expose
    public Boolean v10_1909;

    /**
     * The V10_2004.
     * Windows 10 2004 or later.
     */
    @SerializedName(value = "v10_2004", alternate = {"V10_2004"})
    @Expose
    public Boolean v10_2004;

    /**
     * The V8_0.
     * Windows version 8.0 or later.
     */
    @SerializedName(value = "v8_0", alternate = {"V8_0"})
    @Expose
    public Boolean v8_0;

    /**
     * The V8_1.
     * Windows version 8.1 or later.
     */
    @SerializedName(value = "v8_1", alternate = {"V8_1"})
    @Expose
    public Boolean v8_1;


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
