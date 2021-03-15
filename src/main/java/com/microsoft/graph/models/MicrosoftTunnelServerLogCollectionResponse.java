// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.MicrosoftTunnelLogCollectionStatus;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Microsoft Tunnel Server Log Collection Response.
 */
public class MicrosoftTunnelServerLogCollectionResponse extends Entity implements IJsonBackedObject {


    /**
     * The End Date Time.
     * The end time of the logs collected
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime endDateTime;

    /**
     * The Expiry Date Time.
     * The time when the log collection is expired
     */
    @SerializedName(value = "expiryDateTime", alternate = {"ExpiryDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime expiryDateTime;

    /**
     * The Request Date Time.
     * The time when the log collection was requested
     */
    @SerializedName(value = "requestDateTime", alternate = {"RequestDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime requestDateTime;

    /**
     * The Server Id.
     * ID of the server the log collection is requested upon
     */
    @SerializedName(value = "serverId", alternate = {"ServerId"})
    @Expose
	@Nullable
    public String serverId;

    /**
     * The Size In Bytes.
     * The size of the logs in bytes
     */
    @SerializedName(value = "sizeInBytes", alternate = {"SizeInBytes"})
    @Expose
	@Nullable
    public Long sizeInBytes;

    /**
     * The Start Date Time.
     * The start time of the logs collected
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime startDateTime;

    /**
     * The Status.
     * The status of log collection. Possible values are: pending, completed, failed.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public MicrosoftTunnelLogCollectionStatus status;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
