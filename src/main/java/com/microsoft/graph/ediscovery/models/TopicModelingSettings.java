// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.models;
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
 * The class for the Topic Modeling Settings.
 */
public class TopicModelingSettings implements IJsonBackedObject {

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
     * The Dynamically Adjust Topic Count.
     * 
     */
    @SerializedName(value = "dynamicallyAdjustTopicCount", alternate = {"DynamicallyAdjustTopicCount"})
    @Expose
	@Nullable
    public Boolean dynamicallyAdjustTopicCount;

    /**
     * The Ignore Numbers.
     * 
     */
    @SerializedName(value = "ignoreNumbers", alternate = {"IgnoreNumbers"})
    @Expose
	@Nullable
    public Boolean ignoreNumbers;

    /**
     * The Is Enabled.
     * 
     */
    @SerializedName(value = "isEnabled", alternate = {"IsEnabled"})
    @Expose
	@Nullable
    public Boolean isEnabled;

    /**
     * The Topic Count.
     * 
     */
    @SerializedName(value = "topicCount", alternate = {"TopicCount"})
    @Expose
	@Nullable
    public Integer topicCount;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
