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
 * The class for the Office365Active User Counts.
 */
public class Office365ActiveUserCounts extends Entity implements IJsonBackedObject {


    /**
     * The Exchange.
     * 
     */
    @SerializedName(value = "exchange", alternate = {"Exchange"})
    @Expose
    public Long exchange;

    /**
     * The Office365.
     * 
     */
    @SerializedName(value = "office365", alternate = {"Office365"})
    @Expose
    public Long office365;

    /**
     * The One Drive.
     * 
     */
    @SerializedName(value = "oneDrive", alternate = {"OneDrive"})
    @Expose
    public Long oneDrive;

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
     * The Share Point.
     * 
     */
    @SerializedName(value = "sharePoint", alternate = {"SharePoint"})
    @Expose
    public Long sharePoint;

    /**
     * The Skype For Business.
     * 
     */
    @SerializedName(value = "skypeForBusiness", alternate = {"SkypeForBusiness"})
    @Expose
    public Long skypeForBusiness;

    /**
     * The Teams.
     * 
     */
    @SerializedName(value = "teams", alternate = {"Teams"})
    @Expose
    public Long teams;

    /**
     * The Yammer.
     * 
     */
    @SerializedName(value = "yammer", alternate = {"Yammer"})
    @Expose
    public Long yammer;


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
