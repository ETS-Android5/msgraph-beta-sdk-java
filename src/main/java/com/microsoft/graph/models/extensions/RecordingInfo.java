// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ParticipantInfo;
import com.microsoft.graph.models.extensions.IdentitySet;
import com.microsoft.graph.models.generated.RecordingStatus;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Recording Info.
 */
public class RecordingInfo implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Initiated By.
     * The participant who initiated the recording.
     */
    @SerializedName(value = "initiatedBy", alternate = {"InitiatedBy"})
    @Expose
    public ParticipantInfo initiatedBy;

    /**
     * The Initiator.
     * The identities of recording initiator.
     */
    @SerializedName(value = "initiator", alternate = {"Initiator"})
    @Expose
    public IdentitySet initiator;

    /**
     * The Recording Status.
     * Possible values are: unknown, notRecording, recording, or failed.
     */
    @SerializedName(value = "recordingStatus", alternate = {"RecordingStatus"})
    @Expose
    public RecordingStatus recordingStatus;


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
