// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.SynchronizationStatusCode;
import com.microsoft.graph.models.extensions.SynchronizationTaskExecution;
import com.microsoft.graph.models.extensions.SynchronizationProgress;
import com.microsoft.graph.models.extensions.SynchronizationQuarantine;
import com.microsoft.graph.models.extensions.StringKeyLongValuePair;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization Status.
 */
public class SynchronizationStatus implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Code.
     * 
     */
    @SerializedName(value = "code", alternate = {"Code"})
    @Expose
    public SynchronizationStatusCode code;

    /**
     * The Count Successive Complete Failures.
     * 
     */
    @SerializedName(value = "countSuccessiveCompleteFailures", alternate = {"CountSuccessiveCompleteFailures"})
    @Expose
    public Long countSuccessiveCompleteFailures;

    /**
     * The Escrows Pruned.
     * 
     */
    @SerializedName(value = "escrowsPruned", alternate = {"EscrowsPruned"})
    @Expose
    public Boolean escrowsPruned;

    /**
     * The Last Execution.
     * 
     */
    @SerializedName(value = "lastExecution", alternate = {"LastExecution"})
    @Expose
    public SynchronizationTaskExecution lastExecution;

    /**
     * The Last Successful Execution.
     * 
     */
    @SerializedName(value = "lastSuccessfulExecution", alternate = {"LastSuccessfulExecution"})
    @Expose
    public SynchronizationTaskExecution lastSuccessfulExecution;

    /**
     * The Last Successful Execution With Exports.
     * 
     */
    @SerializedName(value = "lastSuccessfulExecutionWithExports", alternate = {"LastSuccessfulExecutionWithExports"})
    @Expose
    public SynchronizationTaskExecution lastSuccessfulExecutionWithExports;

    /**
     * The Progress.
     * 
     */
    @SerializedName(value = "progress", alternate = {"Progress"})
    @Expose
    public java.util.List<SynchronizationProgress> progress;

    /**
     * The Quarantine.
     * 
     */
    @SerializedName(value = "quarantine", alternate = {"Quarantine"})
    @Expose
    public SynchronizationQuarantine quarantine;

    /**
     * The Steady State First Achieved Time.
     * 
     */
    @SerializedName(value = "steadyStateFirstAchievedTime", alternate = {"SteadyStateFirstAchievedTime"})
    @Expose
    public java.util.Calendar steadyStateFirstAchievedTime;

    /**
     * The Steady State Last Achieved Time.
     * 
     */
    @SerializedName(value = "steadyStateLastAchievedTime", alternate = {"SteadyStateLastAchievedTime"})
    @Expose
    public java.util.Calendar steadyStateLastAchievedTime;

    /**
     * The Synchronized Entry Count By Type.
     * 
     */
    @SerializedName(value = "synchronizedEntryCountByType", alternate = {"SynchronizedEntryCountByType"})
    @Expose
    public java.util.List<StringKeyLongValuePair> synchronizedEntryCountByType;

    /**
     * The Troubleshooting Url.
     * 
     */
    @SerializedName(value = "troubleshootingUrl", alternate = {"TroubleshootingUrl"})
    @Expose
    public String troubleshootingUrl;


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
