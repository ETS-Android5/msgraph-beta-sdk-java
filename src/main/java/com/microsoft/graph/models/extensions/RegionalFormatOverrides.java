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
 * The class for the Regional Format Overrides.
 */
public class RegionalFormatOverrides implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Calendar.
     * The calendar to use, e.g., Gregorian Calendar.Returned by default.
     */
    @SerializedName(value = "calendar", alternate = {"Calendar"})
    @Expose
    public String calendar;

    /**
     * The First Day Of Week.
     * The first day of the week to use, e.g., Sunday.Returned by default.
     */
    @SerializedName(value = "firstDayOfWeek", alternate = {"FirstDayOfWeek"})
    @Expose
    public String firstDayOfWeek;

    /**
     * The Long Date Format.
     * The long date time format to be used for displaying dates.Returned by default.
     */
    @SerializedName(value = "longDateFormat", alternate = {"LongDateFormat"})
    @Expose
    public String longDateFormat;

    /**
     * The Long Time Format.
     * The long time format to be used for displaying time.Returned by default.
     */
    @SerializedName(value = "longTimeFormat", alternate = {"LongTimeFormat"})
    @Expose
    public String longTimeFormat;

    /**
     * The Short Date Format.
     * The short date time format to be used for displaying dates.Returned by default.
     */
    @SerializedName(value = "shortDateFormat", alternate = {"ShortDateFormat"})
    @Expose
    public String shortDateFormat;

    /**
     * The Short Time Format.
     * The short time format to be used for displaying time.Returned by default.
     */
    @SerializedName(value = "shortTimeFormat", alternate = {"ShortTimeFormat"})
    @Expose
    public String shortTimeFormat;

    /**
     * The Time Zone.
     * The timezone to be used for displaying time.Returned by default.
     */
    @SerializedName(value = "timeZone", alternate = {"TimeZone"})
    @Expose
    public String timeZone;


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
