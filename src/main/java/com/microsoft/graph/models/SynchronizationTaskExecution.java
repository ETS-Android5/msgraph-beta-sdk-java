// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.SynchronizationError;
import com.microsoft.graph.models.SynchronizationTaskExecutionResult;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization Task Execution.
 */
public class SynchronizationTaskExecution implements IJsonBackedObject {

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
     * The Activity Identifier.
     * Identifier of the job run.
     */
    @SerializedName(value = "activityIdentifier", alternate = {"ActivityIdentifier"})
    @Expose
	@Nullable
    public String activityIdentifier;

    /**
     * The Count Entitled.
     * Count of processed entries that were assigned for this application.
     */
    @SerializedName(value = "countEntitled", alternate = {"CountEntitled"})
    @Expose
	@Nullable
    public Long countEntitled;

    /**
     * The Count Entitled For Provisioning.
     * Count of processed entries that were assigned for provisioning.
     */
    @SerializedName(value = "countEntitledForProvisioning", alternate = {"CountEntitledForProvisioning"})
    @Expose
	@Nullable
    public Long countEntitledForProvisioning;

    /**
     * The Count Escrowed.
     * Count of entries that were escrowed (errors).
     */
    @SerializedName(value = "countEscrowed", alternate = {"CountEscrowed"})
    @Expose
	@Nullable
    public Long countEscrowed;

    /**
     * The Count Escrowed Raw.
     * Count of entries that were escrowed, including system-generated escrows.
     */
    @SerializedName(value = "countEscrowedRaw", alternate = {"CountEscrowedRaw"})
    @Expose
	@Nullable
    public Long countEscrowedRaw;

    /**
     * The Count Exported.
     * Count of exported entries.
     */
    @SerializedName(value = "countExported", alternate = {"CountExported"})
    @Expose
	@Nullable
    public Long countExported;

    /**
     * The Count Exports.
     * Count of entries that were expected to be exported.
     */
    @SerializedName(value = "countExports", alternate = {"CountExports"})
    @Expose
	@Nullable
    public Long countExports;

    /**
     * The Count Imported.
     * Count of imported entries.
     */
    @SerializedName(value = "countImported", alternate = {"CountImported"})
    @Expose
	@Nullable
    public Long countImported;

    /**
     * The Count Imported Deltas.
     * Count of imported delta-changes.
     */
    @SerializedName(value = "countImportedDeltas", alternate = {"CountImportedDeltas"})
    @Expose
	@Nullable
    public Long countImportedDeltas;

    /**
     * The Count Imported Reference Deltas.
     * Count of imported delta-changes pertaining to reference changes.
     */
    @SerializedName(value = "countImportedReferenceDeltas", alternate = {"CountImportedReferenceDeltas"})
    @Expose
	@Nullable
    public Long countImportedReferenceDeltas;

    /**
     * The Error.
     * If an error was encountered, contains a synchronizationError object with details.
     */
    @SerializedName(value = "error", alternate = {"Error"})
    @Expose
	@Nullable
    public SynchronizationError error;

    /**
     * The State.
     * Code summarizing the result of this run. Possible values are: Succeeded, Failed, EntryLevelErrors.
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
	@Nullable
    public SynchronizationTaskExecutionResult state;

    /**
     * The Time Began.
     * Time when this job run began. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    @SerializedName(value = "timeBegan", alternate = {"TimeBegan"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime timeBegan;

    /**
     * The Time Ended.
     * Time when this job run ended. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    @SerializedName(value = "timeEnded", alternate = {"TimeEnded"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime timeEnded;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
