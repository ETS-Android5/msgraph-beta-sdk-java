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
import com.microsoft.graph.models.BookingCustomerInformationBase;
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
     * Additional information that is sent to the customer when an appointment is confirmed.
     */
    @SerializedName(value = "additionalInformation", alternate = {"AdditionalInformation"})
    @Expose
	@Nullable
    public String additionalInformation;

    /**
     * The Customer Email Address.
     * The SMTP address of the bookingCustomer who is booking the appointment.
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
     * Represents location information for the bookingCustomer who is booking the appointment.
     */
    @SerializedName(value = "customerLocation", alternate = {"CustomerLocation"})
    @Expose
	@Nullable
    public Location customerLocation;

    /**
     * The Customer Name.
     * The customer's name.
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
     * The customer's phone number.
     */
    @SerializedName(value = "customerPhone", alternate = {"CustomerPhone"})
    @Expose
	@Nullable
    public String customerPhone;

    /**
     * The Customers.
     * It lists down the customer properties for an appointment. An appointment will contain a list of customer information and each unit will indicate the properties of a customer who is part of that appointment. Optional.
     */
    @SerializedName(value = "customers", alternate = {"Customers"})
    @Expose
	@Nullable
    public java.util.List<BookingCustomerInformationBase> customers;

    /**
     * The Customer Time Zone.
     * The time zone of the customer. For a list of possible values, see dateTimeTimeZone.
     */
    @SerializedName(value = "customerTimeZone", alternate = {"CustomerTimeZone"})
    @Expose
	@Nullable
    public String customerTimeZone;

    /**
     * The Duration.
     * The length of the appointment, denoted in ISO8601 format.
     */
    @SerializedName(value = "duration", alternate = {"Duration"})
    @Expose
	@Nullable
    public javax.xml.datatype.Duration duration;

    /**
     * The End.
     * The date, time, and time zone that the appointment ends.
     */
    @SerializedName(value = "end", alternate = {"End"})
    @Expose
	@Nullable
    public DateTimeTimeZone end;

    /**
     * The Filled Attendees Count.
     * The current number of customers in the appointment.
     */
    @SerializedName(value = "filledAttendeesCount", alternate = {"FilledAttendeesCount"})
    @Expose
	@Nullable
    public Integer filledAttendeesCount;

    /**
     * The Invoice Amount.
     * The billed amount on the invoice.
     */
    @SerializedName(value = "invoiceAmount", alternate = {"InvoiceAmount"})
    @Expose
	@Nullable
    public Double invoiceAmount;

    /**
     * The Invoice Date.
     * The date, time, and time zone of the invoice for this appointment.
     */
    @SerializedName(value = "invoiceDate", alternate = {"InvoiceDate"})
    @Expose
	@Nullable
    public DateTimeTimeZone invoiceDate;

    /**
     * The Invoice Id.
     * The ID of the invoice.
     */
    @SerializedName(value = "invoiceId", alternate = {"InvoiceId"})
    @Expose
	@Nullable
    public String invoiceId;

    /**
     * The Invoice Status.
     * The status of the invoice. Possible values are: draft, reviewing, open, canceled, paid, corrective.
     */
    @SerializedName(value = "invoiceStatus", alternate = {"InvoiceStatus"})
    @Expose
	@Nullable
    public BookingInvoiceStatus invoiceStatus;

    /**
     * The Invoice Url.
     * The URL of the invoice in Microsoft Bookings.
     */
    @SerializedName(value = "invoiceUrl", alternate = {"InvoiceUrl"})
    @Expose
	@Nullable
    public String invoiceUrl;

    /**
     * The Is Location Online.
     * True indicates that the appointment will be held online. Default value is false.
     */
    @SerializedName(value = "isLocationOnline", alternate = {"IsLocationOnline"})
    @Expose
	@Nullable
    public Boolean isLocationOnline;

    /**
     * The Join Web Url.
     * The URL of the online meeting for the appointment.
     */
    @SerializedName(value = "joinWebUrl", alternate = {"JoinWebUrl"})
    @Expose
	@Nullable
    public String joinWebUrl;

    /**
     * The Maximum Attendees Count.
     * The maximum number of customers allowed in an appointment. If maximumAttendeesCount of the service is greater than 1, pass valid customer IDs while creating or updating an appointment. To create a customer, use the Create bookingCustomer operation.
     */
    @SerializedName(value = "maximumAttendeesCount", alternate = {"MaximumAttendeesCount"})
    @Expose
	@Nullable
    public Integer maximumAttendeesCount;

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
     * True indicates that the bookingCustomer for this appointment does not wish to receive a confirmation for this appointment.
     */
    @SerializedName(value = "optOutOfCustomerEmail", alternate = {"OptOutOfCustomerEmail"})
    @Expose
	@Nullable
    public Boolean optOutOfCustomerEmail;

    /**
     * The Post Buffer.
     * The amount of time to reserve after the appointment ends, for cleaning up, as an example. The value is expressed in ISO8601 format.
     */
    @SerializedName(value = "postBuffer", alternate = {"PostBuffer"})
    @Expose
	@Nullable
    public javax.xml.datatype.Duration postBuffer;

    /**
     * The Pre Buffer.
     * The amount of time to reserve before the appointment begins, for preparation, as an example. The value is expressed in ISO8601 format.
     */
    @SerializedName(value = "preBuffer", alternate = {"PreBuffer"})
    @Expose
	@Nullable
    public javax.xml.datatype.Duration preBuffer;

    /**
     * The Price.
     * The regular price for an appointment for the specified bookingService.
     */
    @SerializedName(value = "price", alternate = {"Price"})
    @Expose
	@Nullable
    public Double price;

    /**
     * The Price Type.
     * A setting to provide flexibility for the pricing structure of services. Possible values are: undefined, fixedPrice, startingAt, hourly, free, priceVaries, callUs, notSet, unknownFutureValue.
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
     * An additional tracking ID for the appointment, if the appointment has been created directly by the customer on the scheduling page, as opposed to by a staff member on the behalf of the customer.
     */
    @SerializedName(value = "selfServiceAppointmentId", alternate = {"SelfServiceAppointmentId"})
    @Expose
	@Nullable
    public String selfServiceAppointmentId;

    /**
     * The Service Id.
     * The ID of the bookingService associated with this appointment.
     */
    @SerializedName(value = "serviceId", alternate = {"ServiceId"})
    @Expose
	@Nullable
    public String serviceId;

    /**
     * The Service Location.
     * The location where the service is delivered.
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
     * True indicates SMS notifications will be sent to the customers for the appointment. Default value is false.
     */
    @SerializedName(value = "smsNotificationsEnabled", alternate = {"SmsNotificationsEnabled"})
    @Expose
	@Nullable
    public Boolean smsNotificationsEnabled;

    /**
     * The Staff Member Ids.
     * The ID of each bookingStaffMember who is scheduled in this appointment.
     */
    @SerializedName(value = "staffMemberIds", alternate = {"StaffMemberIds"})
    @Expose
	@Nullable
    public java.util.List<String> staffMemberIds;

    /**
     * The Start.
     * The date, time, and time zone that the appointment begins.
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
