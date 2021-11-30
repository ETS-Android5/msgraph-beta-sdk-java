// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.ConfigurationManagerClientState;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Configuration Manager Client Health State.
 */
public class ConfigurationManagerClientHealthState implements IJsonBackedObject {

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
     * The Error Code.
     * Error code for failed state.
     */
    @SerializedName(value = "errorCode", alternate = {"ErrorCode"})
    @Expose
	@Nullable
    public Integer errorCode;

    /**
     * The Last Sync Date Time.
     * Datetime for last sync with configuration manager management point.
     */
    @SerializedName(value = "lastSyncDateTime", alternate = {"LastSyncDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastSyncDateTime;

    /**
     * The State.
     * Current configuration manager client state. Possible values are: unknown, installed, healthy, installFailed, updateFailed, communicationError.
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
	@Nullable
    public ConfigurationManagerClientState state;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
