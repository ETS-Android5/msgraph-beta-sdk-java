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
import com.microsoft.graph.models.DateTimeTimeZone;
import com.microsoft.graph.models.BookingInvoiceStatus;
import com.microsoft.graph.models.BookingPriceType;
import com.microsoft.graph.models.BookingReminder;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Booking Appointment.
 */
public class BookingAppointment extends Entity implements IJsonBackedObject {


    /**
     * The Additional Information.
     * 
     */
    @SerializedName(value = "additionalInformation", alternate = {"AdditionalInformation"})
    @Expose
	@Nullable
    public String additionalInformation;

    /**
     * The Customer Email Address.
     * 
     */
    @SerializedName(value = "customerEmailAddress", alternate = {"CustomerEmailAddress"})
    @Expose
	@Nullable
    public String customerEmailAddress;

    /**
     * The Customer Id.
     * If CustomerId is not specified when an appointment is created then a new customer is created based on the appointment customer information. Once set, the customerId should be considered immutable.
     */
    @SerializedName(value = "customerId", alternate = {"CustomerId"})
    @Expose
	@Nullable
    public String customerId;

    /**
     * The Customer Location.
     * 
     */
    @SerializedName(value = "customerLocation", alternate = {"CustomerLocation"})
    @Expose
	@Nullable
    public Location customerLocation;

    /**
     * The Customer Name.
     * 
     */
    @SerializedName(value = "customerName", alternate = {"CustomerName"})
    @Expose
	@Nullable
    public String customerName;

    /**
     * The Customer Notes.
     * The value of this property is only available when reading an individual booking appointment by id. Its value can only be set when creating a new appointment with a new customer, ie, without specifying a CustomerId. After that, the property is computed from the customer represented by CustomerId.
     */
    @SerializedName(value = "customerNotes", alternate = {"CustomerNotes"})
    @Expose
	@Nullable
    public String customerNotes;

    /**
     * The Customer Phone.
     * 
     */
    @SerializedName(value = "customerPhone", alternate = {"CustomerPhone"})
    @Expose
	@Nullable
    public String customerPhone;

    /**
     * The Customer Time Zone.
     * 
     */
    @SerializedName(value = "customerTimeZone", alternate = {"CustomerTimeZone"})
    @Expose
	@Nullable
    public String customerTimeZone;

    /**
     * The Duration.
     * 
     */
    @SerializedName(value = "duration", alternate = {"Duration"})
    @Expose
	@Nullable
    public javax.xml.datatype.Duration duration;

    /**
     * The End.
     * 
     */
    @SerializedName(value = "end", alternate = {"End"})
    @Expose
	@Nullable
    public DateTimeTimeZone end;

    /**
     * The Invoice Amount.
     * 
     */
    @SerializedName(value = "invoiceAmount", alternate = {"InvoiceAmount"})
    @Expose
	@Nullable
    public Double invoiceAmount;

    /**
     * The Invoice Date.
     * 
     */
    @SerializedName(value = "invoiceDate", alternate = {"InvoiceDate"})
    @Expose
	@Nullable
    public DateTimeTimeZone invoiceDate;

    /**
     * The Invoice Id.
     * 
     */
    @SerializedName(value = "invoiceId", alternate = {"InvoiceId"})
    @Expose
	@Nullable
    public String invoiceId;

    /**
     * The Invoice Status.
     * 
     */
    @SerializedName(value = "invoiceStatus", alternate = {"InvoiceStatus"})
    @Expose
	@Nullable
    public BookingInvoiceStatus invoiceStatus;

    /**
     * The Invoice Url.
     * 
     */
    @SerializedName(value = "invoiceUrl", alternate = {"InvoiceUrl"})
    @Expose
	@Nullable
    public String invoiceUrl;

    /**
     * The Is Location Online.
     * 
     */
    @SerializedName(value = "isLocationOnline", alternate = {"IsLocationOnline"})
    @Expose
	@Nullable
    public Boolean isLocationOnline;

    /**
     * The Join Web Url.
     * 
     */
    @SerializedName(value = "joinWebUrl", alternate = {"JoinWebUrl"})
    @Expose
	@Nullable
    public String joinWebUrl;

    /**
     * The Online Meeting Url.
     * 
     */
    @SerializedName(value = "onlineMeetingUrl", alternate = {"OnlineMeetingUrl"})
    @Expose
	@Nullable
    public String onlineMeetingUrl;

    /**
     * The Opt Out Of Customer Email.
     * 
     */
    @SerializedName(value = "optOutOfCustomerEmail", alternate = {"OptOutOfCustomerEmail"})
    @Expose
	@Nullable
    public Boolean optOutOfCustomerEmail;

    /**
     * The Post Buffer.
     * 
     */
    @SerializedName(value = "postBuffer", alternate = {"PostBuffer"})
    @Expose
	@Nullable
    public javax.xml.datatype.Duration postBuffer;

    /**
     * The Pre Buffer.
     * 
     */
    @SerializedName(value = "preBuffer", alternate = {"PreBuffer"})
    @Expose
	@Nullable
    public javax.xml.datatype.Duration preBuffer;

    /**
     * The Price.
     * 
     */
    @SerializedName(value = "price", alternate = {"Price"})
    @Expose
	@Nullable
    public Double price;

    /**
     * The Price Type.
     * 
     */
    @SerializedName(value = "priceType", alternate = {"PriceType"})
    @Expose
	@Nullable
    public BookingPriceType priceType;

    /**
     * The Reminders.
     * The value of this property is only available when reading an individual booking appointment by id.
     */
    @SerializedName(value = "reminders", alternate = {"Reminders"})
    @Expose
	@Nullable
    public java.util.List<BookingReminder> reminders;

    /**
     * The Self Service Appointment Id.
     * 
     */
    @SerializedName(value = "selfServiceAppointmentId", alternate = {"SelfServiceAppointmentId"})
    @Expose
	@Nullable
    public String selfServiceAppointmentId;

    /**
     * The Service Id.
     * The id of the booking service associated with this appointment.
     */
    @SerializedName(value = "serviceId", alternate = {"ServiceId"})
    @Expose
	@Nullable
    public String serviceId;

    /**
     * The Service Location.
     * 
     */
    @SerializedName(value = "serviceLocation", alternate = {"ServiceLocation"})
    @Expose
	@Nullable
    public Location serviceLocation;

    /**
     * The Service Name.
     * This property is optional when creating a new appointment. If not specified, it is computed from the service associated with the appointment by the service id.
     */
    @SerializedName(value = "serviceName", alternate = {"ServiceName"})
    @Expose
	@Nullable
    public String serviceName;

    /**
     * The Service Notes.
     * The value of this property is only available when reading an individual booking appointment by id.
     */
    @SerializedName(value = "serviceNotes", alternate = {"ServiceNotes"})
    @Expose
	@Nullable
    public String serviceNotes;

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
     * 
     */
    @SerializedName(value = "staffMemberIds", alternate = {"StaffMemberIds"})
    @Expose
	@Nullable
    public java.util.List<String> staffMemberIds;

    /**
     * The Start.
     * 
     */
    @SerializedName(value = "start", alternate = {"Start"})
    @Expose
	@Nullable
    public DateTimeTimeZone start;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
