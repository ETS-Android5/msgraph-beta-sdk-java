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
 * The class for the Skype For Business Organizer Activity Counts.
 */
public class SkypeForBusinessOrganizerActivityCounts extends Entity implements IJsonBackedObject {


    /**
     * The App Sharing.
     * 
     */
    @SerializedName(value = "appSharing", alternate = {"AppSharing"})
    @Expose
    public Long appSharing;

    /**
     * The Audio Video.
     * 
     */
    @SerializedName(value = "audioVideo", alternate = {"AudioVideo"})
    @Expose
    public Long audioVideo;

    /**
     * The Dial In Out3rd Party.
     * 
     */
    @SerializedName(value = "dialInOut3rdParty", alternate = {"DialInOut3rdParty"})
    @Expose
    public Long dialInOut3rdParty;

    /**
     * The Dial In Out Microsoft.
     * 
     */
    @SerializedName(value = "dialInOutMicrosoft", alternate = {"DialInOutMicrosoft"})
    @Expose
    public Long dialInOutMicrosoft;

    /**
     * The Im.
     * 
     */
    @SerializedName(value = "im", alternate = {"Im"})
    @Expose
    public Long im;

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
     * The Web.
     * 
     */
    @SerializedName(value = "web", alternate = {"Web"})
    @Expose
    public Long web;


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
