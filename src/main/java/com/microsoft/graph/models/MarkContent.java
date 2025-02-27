// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.LabelActionBase;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mark Content.
 */
public class MarkContent extends LabelActionBase implements IJsonBackedObject {


    /**
     * The Font Color.
     * 
     */
    @SerializedName(value = "fontColor", alternate = {"FontColor"})
    @Expose
	@Nullable
    public String fontColor;

    /**
     * The Font Size.
     * 
     */
    @SerializedName(value = "fontSize", alternate = {"FontSize"})
    @Expose
	@Nullable
    public Long fontSize;

    /**
     * The Text.
     * 
     */
    @SerializedName(value = "text", alternate = {"Text"})
    @Expose
	@Nullable
    public String text;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
