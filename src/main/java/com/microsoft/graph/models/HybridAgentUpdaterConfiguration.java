// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.UpdateWindow;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Hybrid Agent Updater Configuration.
 */
public class HybridAgentUpdaterConfiguration implements IJsonBackedObject {

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
     * The Allow Update Configuration Override.
     * Indicates if updater configuration will be skipped and the agent will receive an update when the next version of the agent is available.
     */
    @SerializedName(value = "allowUpdateConfigurationOverride", alternate = {"AllowUpdateConfigurationOverride"})
    @Expose
	@Nullable
    public Boolean allowUpdateConfigurationOverride;

    /**
     * The Defer Update Date Time.
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    @SerializedName(value = "deferUpdateDateTime", alternate = {"DeferUpdateDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime deferUpdateDateTime;

    /**
     * The Update Window.
     * 
     */
    @SerializedName(value = "updateWindow", alternate = {"UpdateWindow"})
    @Expose
	@Nullable
    public UpdateWindow updateWindow;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
