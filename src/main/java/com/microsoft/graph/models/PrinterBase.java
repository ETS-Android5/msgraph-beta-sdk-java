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
import com.microsoft.graph.models.PrinterCapabilities;
import com.microsoft.graph.models.PrinterDefaults;
import com.microsoft.graph.models.PrinterLocation;
import com.microsoft.graph.models.PrinterStatus;
import com.microsoft.graph.models.PrintJob;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.PrintJobCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Printer Base.
 */
public class PrinterBase extends Entity implements IJsonBackedObject {


    /**
     * The Capabilities.
     * The capabilities of the printer/printerShare.
     */
    @SerializedName(value = "capabilities", alternate = {"Capabilities"})
    @Expose
	@Nullable
    public PrinterCapabilities capabilities;

    /**
     * The Defaults.
     * The default print settings of printer/printerShare.
     */
    @SerializedName(value = "defaults", alternate = {"Defaults"})
    @Expose
	@Nullable
    public PrinterDefaults defaults;

    /**
     * The Display Name.
     * The name of the printer/printerShare.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Is Accepting Jobs.
     * Whether the printer/printerShare is currently accepting new print jobs.
     */
    @SerializedName(value = "isAcceptingJobs", alternate = {"IsAcceptingJobs"})
    @Expose
	@Nullable
    public Boolean isAcceptingJobs;

    /**
     * The Location.
     * The physical and/or organizational location of the printer/printerShare.
     */
    @SerializedName(value = "location", alternate = {"Location"})
    @Expose
	@Nullable
    public PrinterLocation location;

    /**
     * The Manufacturer.
     * The manufacturer of the printer/printerShare.
     */
    @SerializedName(value = "manufacturer", alternate = {"Manufacturer"})
    @Expose
	@Nullable
    public String manufacturer;

    /**
     * The Model.
     * The model name of the printer/printerShare.
     */
    @SerializedName(value = "model", alternate = {"Model"})
    @Expose
	@Nullable
    public String model;

    /**
     * The Name.
     * 
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Status.
     * The processing status of the printer/printerShare, including any errors.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public PrinterStatus status;

    /**
     * The Jobs.
     * The list of jobs that are queued for printing by the printer/printerShare.
     */
    @SerializedName(value = "jobs", alternate = {"Jobs"})
    @Expose
	@Nullable
    public PrintJobCollectionPage jobs;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("jobs")) {
            jobs = serializer.deserializeObject(json.get("jobs"), PrintJobCollectionPage.class);
        }
    }
}
