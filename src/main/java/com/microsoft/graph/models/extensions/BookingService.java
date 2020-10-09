// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Location;
import com.microsoft.graph.models.generated.BookingPriceType;
import com.microsoft.graph.models.extensions.BookingReminder;
import com.microsoft.graph.models.extensions.BookingSchedulingPolicy;
import com.microsoft.graph.models.extensions.BookingNamedEntity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Booking Service.
 */
public class BookingService extends BookingNamedEntity implements IJsonBackedObject {


    /**
     * The Additional Information.
     * 
     */
    @SerializedName(value = "additionalInformation", alternate = {"AdditionalInformation"})
    @Expose
    public String additionalInformation;

    /**
     * The Default Duration.
     * 
     */
    @SerializedName(value = "defaultDuration", alternate = {"DefaultDuration"})
    @Expose
    public javax.xml.datatype.Duration defaultDuration;

    /**
     * The Default Location.
     * 
     */
    @SerializedName(value = "defaultLocation", alternate = {"DefaultLocation"})
    @Expose
    public Location defaultLocation;

    /**
     * The Default Price.
     * 
     */
    @SerializedName(value = "defaultPrice", alternate = {"DefaultPrice"})
    @Expose
    public Double defaultPrice;

    /**
     * The Default Price Type.
     * 
     */
    @SerializedName(value = "defaultPriceType", alternate = {"DefaultPriceType"})
    @Expose
    public BookingPriceType defaultPriceType;

    /**
     * The Default Reminders.
     * The value of this property is only available when reading an individual booking service by id.
     */
    @SerializedName(value = "defaultReminders", alternate = {"DefaultReminders"})
    @Expose
    public java.util.List<BookingReminder> defaultReminders;

    /**
     * The Description.
     * 
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Is Hidden From Customers.
     * 
     */
    @SerializedName(value = "isHiddenFromCustomers", alternate = {"IsHiddenFromCustomers"})
    @Expose
    public Boolean isHiddenFromCustomers;

    /**
     * The Is Location Online.
     * 
     */
    @SerializedName(value = "isLocationOnline", alternate = {"IsLocationOnline"})
    @Expose
    public Boolean isLocationOnline;

    /**
     * The Notes.
     * 
     */
    @SerializedName(value = "notes", alternate = {"Notes"})
    @Expose
    public String notes;

    /**
     * The Post Buffer.
     * 
     */
    @SerializedName(value = "postBuffer", alternate = {"PostBuffer"})
    @Expose
    public javax.xml.datatype.Duration postBuffer;

    /**
     * The Pre Buffer.
     * 
     */
    @SerializedName(value = "preBuffer", alternate = {"PreBuffer"})
    @Expose
    public javax.xml.datatype.Duration preBuffer;

    /**
     * The Scheduling Policy.
     * 
     */
    @SerializedName(value = "schedulingPolicy", alternate = {"SchedulingPolicy"})
    @Expose
    public BookingSchedulingPolicy schedulingPolicy;

    /**
     * The Staff Member Ids.
     * 
     */
    @SerializedName(value = "staffMemberIds", alternate = {"StaffMemberIds"})
    @Expose
    public java.util.List<String> staffMemberIds;


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
