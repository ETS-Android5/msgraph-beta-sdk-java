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
import com.microsoft.graph.models.KeyValuePair;
import com.microsoft.graph.models.DeviceManagementTroubleshootingErrorDetails;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Troubleshooting Event.
 */
public class DeviceManagementTroubleshootingEvent extends Entity implements IJsonBackedObject {


    /**
     * The Additional Information.
     * A set of string key and string value pairs which provides additional information on the Troubleshooting event
     */
    @SerializedName(value = "additionalInformation", alternate = {"AdditionalInformation"})
    @Expose
	@Nullable
    public java.util.List<KeyValuePair> additionalInformation;

    /**
     * The Correlation Id.
     * Id used for tracing the failure in the service.
     */
    @SerializedName(value = "correlationId", alternate = {"CorrelationId"})
    @Expose
	@Nullable
    public String correlationId;

    /**
     * The Event Date Time.
     * Time when the event occurred .
     */
    @SerializedName(value = "eventDateTime", alternate = {"EventDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime eventDateTime;

    /**
     * The Event Name.
     * Event Name corresponding to the Troubleshooting Event. It is an Optional field
     */
    @SerializedName(value = "eventName", alternate = {"EventName"})
    @Expose
	@Nullable
    public String eventName;

    /**
     * The Troubleshooting Error Details.
     * Object containing detailed information about the error and its remediation.
     */
    @SerializedName(value = "troubleshootingErrorDetails", alternate = {"TroubleshootingErrorDetails"})
    @Expose
	@Nullable
    public DeviceManagementTroubleshootingErrorDetails troubleshootingErrorDetails;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
