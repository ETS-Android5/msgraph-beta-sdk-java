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
 * The class for the Skype For Business Device Usage User Counts.
 */
public class SkypeForBusinessDeviceUsageUserCounts extends Entity implements IJsonBackedObject {


    /**
     * The Android Phone.
     * 
     */
    @SerializedName(value = "androidPhone", alternate = {"AndroidPhone"})
    @Expose
    public Integer androidPhone;

    /**
     * The IPad.
     * 
     */
    @SerializedName(value = "iPad", alternate = {"IPad"})
    @Expose
    public Integer iPad;

    /**
     * The IPhone.
     * 
     */
    @SerializedName(value = "iPhone", alternate = {"IPhone"})
    @Expose
    public Integer iPhone;

    /**
     * The Report Date.
     * 
     */
    @SerializedName(value = "reportDate", alternate = {"ReportDate"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly reportDate;

    /**
     * The Report Period.
     * 
     */
    @SerializedName(value = "reportPeriod", alternate = {"ReportPeriod"})
    @Expose
    public String reportPeriod;

    /**
     * The Report Refresh Date.
     * 
     */
    @SerializedName(value = "reportRefreshDate", alternate = {"ReportRefreshDate"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly reportRefreshDate;

    /**
     * The Windows.
     * 
     */
    @SerializedName(value = "windows", alternate = {"Windows"})
    @Expose
    public Integer windows;

    /**
     * The Windows Phone.
     * 
     */
    @SerializedName(value = "windowsPhone", alternate = {"WindowsPhone"})
    @Expose
    public Integer windowsPhone;


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
