// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Office365Activation Counts.
 */
public class Office365ActivationCounts extends Entity implements IJsonBackedObject {


    /**
     * The Android.
     * The activation count on an Android device.
     */
    @SerializedName(value = "android", alternate = {"Android"})
    @Expose
    public Long android;

    /**
     * The Ios.
     * The activation count on iOS.
     */
    @SerializedName(value = "ios", alternate = {"Ios"})
    @Expose
    public Long ios;

    /**
     * The Mac.
     * The activation count on Mac OS.
     */
    @SerializedName(value = "mac", alternate = {"Mac"})
    @Expose
    public Long mac;

    /**
     * The Product Type.
     * The product type, such as 'Microsoft 365 ProPlus' or 'Project Client'.
     */
    @SerializedName(value = "productType", alternate = {"ProductType"})
    @Expose
    public String productType;

    /**
     * The Report Refresh Date.
     * The latest date of the content.
     */
    @SerializedName(value = "reportRefreshDate", alternate = {"ReportRefreshDate"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly reportRefreshDate;

    /**
     * The Windows.
     * The activation count on Windows. This number includes every activation on any Windows computer.
     */
    @SerializedName(value = "windows", alternate = {"Windows"})
    @Expose
    public Long windows;

    /**
     * The Windows10Mobile.
     * The activation count on Windows 10 mobile.
     */
    @SerializedName(value = "windows10Mobile", alternate = {"Windows10Mobile"})
    @Expose
    public Long windows10Mobile;


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
