// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.security.models.OcrSettings;
import com.microsoft.graph.security.models.RedundancyDetectionSettings;
import com.microsoft.graph.security.models.TopicModelingSettings;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ediscovery Case Settings.
 */
public class EdiscoveryCaseSettings extends Entity implements IJsonBackedObject {


    /**
     * The Ocr.
     * 
     */
    @SerializedName(value = "ocr", alternate = {"Ocr"})
    @Expose
	@Nullable
    public OcrSettings ocr;

    /**
     * The Redundancy Detection.
     * 
     */
    @SerializedName(value = "redundancyDetection", alternate = {"RedundancyDetection"})
    @Expose
	@Nullable
    public RedundancyDetectionSettings redundancyDetection;

    /**
     * The Topic Modeling.
     * 
     */
    @SerializedName(value = "topicModeling", alternate = {"TopicModeling"})
    @Expose
	@Nullable
    public TopicModelingSettings topicModeling;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
