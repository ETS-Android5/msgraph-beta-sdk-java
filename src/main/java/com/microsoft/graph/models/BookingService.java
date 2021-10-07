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
import com.microsoft.graph.models.Location;
import com.microsoft.graph.models.BookingPriceType;
import com.microsoft.graph.models.BookingReminder;
import com.microsoft.graph.models.BookingSchedulingPolicy;
import com.microsoft.graph.models.BookingNamedEntity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

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
	@Nullable
    public String additionalInformation;

    /**
     * The Default Duration.
     * The default length of the service, represented in numbers of days, hours, minutes, and seconds. For example, P11D23H59M59.999999999999S.
     */
    @SerializedName(value = "defaultDuration", alternate = {"DefaultDuration"})
    @Expose
	@Nullable
    public javax.xml.datatype.Duration defaultDuration;

    /**
     * The Default Location.
     * The default physical location for the service.
     */
    @SerializedName(value = "defaultLocation", alternate = {"DefaultLocation"})
    @Expose
	@Nullable
    public Location defaultLocation;

    /**
     * The Default Price.
     * The default monetary price for the service.
     */
    @SerializedName(value = "defaultPrice", alternate = {"DefaultPrice"})
    @Expose
	@Nullable
    public Double defaultPrice;

    /**
     * The Default Price Type.
     * The default way the service is charged. Possible values are: undefined, fixedPrice, startingAt, hourly, free, priceVaries, callUs, notSet.
     */
    @SerializedName(value = "defaultPriceType", alternate = {"DefaultPriceType"})
    @Expose
	@Nullable
    public BookingPriceType defaultPriceType;

    /**
     * The Default Reminders.
     * The value of this property is only available when reading an individual booking service by id.
     */
    @SerializedName(value = "defaultReminders", alternate = {"DefaultReminders"})
    @Expose
	@Nullable
    public java.util.List<BookingReminder> defaultReminders;

    /**
     * The Description.
     * A text description for the service.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Is Hidden From Customers.
     * True means this service is not available to customers for booking.
     */
    @SerializedName(value = "isHiddenFromCustomers", alternate = {"IsHiddenFromCustomers"})
    @Expose
	@Nullable
    public Boolean isHiddenFromCustomers;

    /**
     * The Is Location Online.
     * 
     */
    @SerializedName(value = "isLocationOnline", alternate = {"IsLocationOnline"})
    @Expose
	@Nullable
    public Boolean isLocationOnline;

    /**
     * The Notes.
     * Additional information about this service.
     */
    @SerializedName(value = "notes", alternate = {"Notes"})
    @Expose
	@Nullable
    public String notes;

    /**
     * The Post Buffer.
     * The time to buffer after an appointment for this service ends, and before the next customer appointment can be booked.
     */
    @SerializedName(value = "postBuffer", alternate = {"PostBuffer"})
    @Expose
	@Nullable
    public javax.xml.datatype.Duration postBuffer;

    /**
     * The Pre Buffer.
     * The time to buffer before an appointment for this service can start.
     */
    @SerializedName(value = "preBuffer", alternate = {"PreBuffer"})
    @Expose
	@Nullable
    public javax.xml.datatype.Duration preBuffer;

    /**
     * The Scheduling Policy.
     * The set of policies that determine how appointments for this type of service should be created and managed.
     */
    @SerializedName(value = "schedulingPolicy", alternate = {"SchedulingPolicy"})
    @Expose
	@Nullable
    public BookingSchedulingPolicy schedulingPolicy;

    /**
     * The Sms Notifications Enabled.
     * 
     */
    @SerializedName(value = "smsNotificationsEnabled", alternate = {"SmsNotificationsEnabled"})
    @Expose
	@Nullable
    public Boolean smsNotificationsEnabled;

    /**
     * The Staff Member Ids.
     * Represents those staff members who provide this service.
     */
    @SerializedName(value = "staffMemberIds", alternate = {"StaffMemberIds"})
    @Expose
	@Nullable
    public java.util.List<String> staffMemberIds;

    /**
     * The Web Url.
     * The URL of the booking service.
     */
    @SerializedName(value = "webUrl", alternate = {"WebUrl"})
    @Expose
	@Nullable
    public String webUrl;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
