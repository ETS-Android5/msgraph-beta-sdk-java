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
 * The class for the Office365Groups Activity File Counts.
 */
public class Office365GroupsActivityFileCounts extends Entity implements IJsonBackedObject {


    /**
     * The Active.
     * The number of files that were viewed, edited, shared, or synced in the group's SharePoint document library.
     */
    @SerializedName(value = "active", alternate = {"Active"})
    @Expose
	@Nullable
    public Long active;

    /**
     * The Report Date.
     * The date on which a number of files were active in the group's SharePoint site.
     */
    @SerializedName(value = "reportDate", alternate = {"ReportDate"})
    @Expose
	@Nullable
    public com.microsoft.graph.core.DateOnly reportDate;

    /**
     * The Report Period.
     * The number of days the report covers.
     */
    @SerializedName(value = "reportPeriod", alternate = {"ReportPeriod"})
    @Expose
	@Nullable
    public String reportPeriod;

    /**
     * The Report Refresh Date.
     * The latest date of the content.
     */
    @SerializedName(value = "reportRefreshDate", alternate = {"ReportRefreshDate"})
    @Expose
	@Nullable
    public com.microsoft.graph.core.DateOnly reportRefreshDate;

    /**
     * The Total.
     * The total number of files in the group's SharePoint document library.
     */
    @SerializedName(value = "total", alternate = {"Total"})
    @Expose
	@Nullable
    public Long total;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
