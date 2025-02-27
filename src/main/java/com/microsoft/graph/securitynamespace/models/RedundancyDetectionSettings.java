// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Redundancy Detection Settings.
 */
public class RedundancyDetectionSettings implements IJsonBackedObject {

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
     * The Is Enabled.
     * 
     */
    @SerializedName(value = "isEnabled", alternate = {"IsEnabled"})
    @Expose
	@Nullable
    public Boolean isEnabled;

    /**
     * The Max Words.
     * 
     */
    @SerializedName(value = "maxWords", alternate = {"MaxWords"})
    @Expose
	@Nullable
    public Integer maxWords;

    /**
     * The Min Words.
     * 
     */
    @SerializedName(value = "minWords", alternate = {"MinWords"})
    @Expose
	@Nullable
    public Integer minWords;

    /**
     * The Similarity Threshold.
     * 
     */
    @SerializedName(value = "similarityThreshold", alternate = {"SimilarityThreshold"})
    @Expose
	@Nullable
    public Integer similarityThreshold;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
