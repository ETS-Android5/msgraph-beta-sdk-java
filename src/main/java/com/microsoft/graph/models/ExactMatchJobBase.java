// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.ClassificationError;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Exact Match Job Base.
 */
public class ExactMatchJobBase extends Entity implements IJsonBackedObject {


    /**
     * The Completion Date Time.
     * 
     */
    @SerializedName(value = "completionDateTime", alternate = {"CompletionDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime completionDateTime;

    /**
     * The Creation Date Time.
     * 
     */
    @SerializedName(value = "creationDateTime", alternate = {"CreationDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime creationDateTime;

    /**
     * The Error.
     * 
     */
    @SerializedName(value = "error", alternate = {"Error"})
    @Expose
	@Nullable
    public ClassificationError error;

    /**
     * The Last Updated Date Time.
     * 
     */
    @SerializedName(value = "lastUpdatedDateTime", alternate = {"LastUpdatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastUpdatedDateTime;

    /**
     * The Start Date Time.
     * 
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
