// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.windowsupdates.models;
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
 * The class for the Rollout Settings.
 */
public class RolloutSettings implements IJsonBackedObject {

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
     * The Devices Per Offer.
     * Specifies the number of devices that are offered at the same time. Has no effect when endDateTime is set. When endDateTime and devicesPerOffer are both not set, all devices in the deployment are offered content at the same time.
     */
    @SerializedName(value = "devicesPerOffer", alternate = {"DevicesPerOffer"})
    @Expose
	@Nullable
    public Integer devicesPerOffer;

    /**
     * The Duration Between Offers.
     * Specifies duration between each set of devices being offered the update. Has an effect when endDateTime or devicesPerOffer are defined. Default value is P1D (1 day).
     */
    @SerializedName(value = "durationBetweenOffers", alternate = {"DurationBetweenOffers"})
    @Expose
	@Nullable
    public String durationBetweenOffers;

    /**
     * The End Date Time.
     * Specifies the date before which all devices currently in the deployment are offered the update. Devices added after this date are offered immediately. When endDateTime and devicesPerOffer are both not set, all devices in the deployment are offered content at the same time.
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime endDateTime;

    /**
     * The Start Date Time.
     * Date on which devices in the deployment start receiving the update. When not set, the deployment starts as soon as devices are assigned.
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime startDateTime;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
