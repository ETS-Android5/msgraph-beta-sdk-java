// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Regional Format Overrides.
 */
public class RegionalFormatOverrides implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Calendar.
     * 
     */
    @SerializedName(value = "calendar", alternate = {"Calendar"})
    @Expose
	@Nullable
    public String calendar;

    /**
     * The First Day Of Week.
     * 
     */
    @SerializedName(value = "firstDayOfWeek", alternate = {"FirstDayOfWeek"})
    @Expose
	@Nullable
    public String firstDayOfWeek;

    /**
     * The Long Date Format.
     * 
     */
    @SerializedName(value = "longDateFormat", alternate = {"LongDateFormat"})
    @Expose
	@Nullable
    public String longDateFormat;

    /**
     * The Long Time Format.
     * 
     */
    @SerializedName(value = "longTimeFormat", alternate = {"LongTimeFormat"})
    @Expose
	@Nullable
    public String longTimeFormat;

    /**
     * The Short Date Format.
     * 
     */
    @SerializedName(value = "shortDateFormat", alternate = {"ShortDateFormat"})
    @Expose
	@Nullable
    public String shortDateFormat;

    /**
     * The Short Time Format.
     * 
     */
    @SerializedName(value = "shortTimeFormat", alternate = {"ShortTimeFormat"})
    @Expose
	@Nullable
    public String shortTimeFormat;

    /**
     * The Time Zone.
     * 
     */
    @SerializedName(value = "timeZone", alternate = {"TimeZone"})
    @Expose
	@Nullable
    public String timeZone;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
