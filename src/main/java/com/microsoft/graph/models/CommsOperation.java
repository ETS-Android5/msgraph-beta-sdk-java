// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.ResultInfo;
import com.microsoft.graph.models.OperationStatus;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Comms Operation.
 */
public class CommsOperation extends Entity implements IJsonBackedObject {


    /**
     * The Client Context.
     * Unique Client Context string. Max limit is 256 chars.
     */
    @SerializedName(value = "clientContext", alternate = {"ClientContext"})
    @Expose
	@Nullable
    public String clientContext;

    /**
     * The Result Info.
     * The result information. Read-only.
     */
    @SerializedName(value = "resultInfo", alternate = {"ResultInfo"})
    @Expose
	@Nullable
    public ResultInfo resultInfo;

    /**
     * The Status.
     * Possible values are: notStarted, running, completed, failed. Read-only.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public OperationStatus status;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
