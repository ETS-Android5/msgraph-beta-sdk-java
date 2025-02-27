// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.ediscovery.models.OcrSettings;
import com.microsoft.graph.ediscovery.models.RedundancyDetectionSettings;
import com.microsoft.graph.ediscovery.models.TopicModelingSettings;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Case Settings.
 */
public class CaseSettings extends Entity implements IJsonBackedObject {


    /**
     * The Ocr.
     * The OCR (Optical Character Recognition) settings for the case.
     */
    @SerializedName(value = "ocr", alternate = {"Ocr"})
    @Expose
	@Nullable
    public OcrSettings ocr;

    /**
     * The Redundancy Detection.
     * The redundancy (near duplicate and email threading) detection settings for the case.
     */
    @SerializedName(value = "redundancyDetection", alternate = {"RedundancyDetection"})
    @Expose
	@Nullable
    public RedundancyDetectionSettings redundancyDetection;

    /**
     * The Topic Modeling.
     * The Topic Modeling (Themes) settings for the case.
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
