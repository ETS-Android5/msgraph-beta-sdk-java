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
 * The class for the Skype For Business Organizer Activity User Counts.
 */
public class SkypeForBusinessOrganizerActivityUserCounts extends Entity implements IJsonBackedObject {


    /**
     * The App Sharing.
     * 
     */
    @SerializedName(value = "appSharing", alternate = {"AppSharing"})
    @Expose
	@Nullable
    public Long appSharing;

    /**
     * The Audio Video.
     * 
     */
    @SerializedName(value = "audioVideo", alternate = {"AudioVideo"})
    @Expose
	@Nullable
    public Long audioVideo;

    /**
     * The Dial In Out3rd Party.
     * 
     */
    @SerializedName(value = "dialInOut3rdParty", alternate = {"DialInOut3rdParty"})
    @Expose
	@Nullable
    public Long dialInOut3rdParty;

    /**
     * The Dial In Out Microsoft.
     * 
     */
    @SerializedName(value = "dialInOutMicrosoft", alternate = {"DialInOutMicrosoft"})
    @Expose
	@Nullable
    public Long dialInOutMicrosoft;

    /**
     * The Im.
     * 
     */
    @SerializedName(value = "im", alternate = {"Im"})
    @Expose
	@Nullable
    public Long im;

    /**
     * The Report Date.
     * 
     */
    @SerializedName(value = "reportDate", alternate = {"ReportDate"})
    @Expose
	@Nullable
    public com.microsoft.graph.core.DateOnly reportDate;

    /**
     * The Report Period.
     * 
     */
    @SerializedName(value = "reportPeriod", alternate = {"ReportPeriod"})
    @Expose
	@Nullable
    public String reportPeriod;

    /**
     * The Report Refresh Date.
     * 
     */
    @SerializedName(value = "reportRefreshDate", alternate = {"ReportRefreshDate"})
    @Expose
	@Nullable
    public com.microsoft.graph.core.DateOnly reportRefreshDate;

    /**
     * The Web.
     * 
     */
    @SerializedName(value = "web", alternate = {"Web"})
    @Expose
	@Nullable
    public Long web;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
