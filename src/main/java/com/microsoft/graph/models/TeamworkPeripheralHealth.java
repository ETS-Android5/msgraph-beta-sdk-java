// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.TeamworkConnection;
import com.microsoft.graph.models.TeamworkPeripheral;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teamwork Peripheral Health.
 */
public class TeamworkPeripheralHealth implements IJsonBackedObject {

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
     * The Connection.
     * The connected state and time since the peripheral device was connected.
     */
    @SerializedName(value = "connection", alternate = {"Connection"})
    @Expose
	@Nullable
    public TeamworkConnection connection;

    /**
     * The Is Optional.
     * True if the peripheral is optional. Used for health computation.
     */
    @SerializedName(value = "isOptional", alternate = {"IsOptional"})
    @Expose
	@Nullable
    public Boolean isOptional;

    /**
     * The Peripheral.
     * 
     */
    @SerializedName(value = "peripheral", alternate = {"Peripheral"})
    @Expose
	@Nullable
    public TeamworkPeripheral peripheral;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
