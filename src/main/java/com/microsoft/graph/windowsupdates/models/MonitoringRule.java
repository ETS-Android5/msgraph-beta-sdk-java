// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.windowsupdates.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.windowsupdates.models.MonitoringAction;
import com.microsoft.graph.windowsupdates.models.MonitoringSignal;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Monitoring Rule.
 */
public class MonitoringRule implements IJsonBackedObject {

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
     * The Action.
     * The action triggered when the threshold for the given signal is met. Possible values are: alertError, pauseDeployment, unknownFutureValue.
     */
    @SerializedName(value = "action", alternate = {"Action"})
    @Expose
	@Nullable
    public MonitoringAction action;

    /**
     * The Signal.
     * The signal to monitor. Possible values are: rollback, unknownFutureValue.
     */
    @SerializedName(value = "signal", alternate = {"Signal"})
    @Expose
	@Nullable
    public MonitoringSignal signal;

    /**
     * The Threshold.
     * The threshold for a signal at which to trigger action. An integer from 1 to 100 (inclusive).
     */
    @SerializedName(value = "threshold", alternate = {"Threshold"})
    @Expose
	@Nullable
    public Integer threshold;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
