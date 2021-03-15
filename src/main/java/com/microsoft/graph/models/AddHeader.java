// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.Alignment;
import com.microsoft.graph.models.MarkContent;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Add Header.
 */
public class AddHeader extends MarkContent implements IJsonBackedObject {


    /**
     * The Alignment.
     * 
     */
    @SerializedName(value = "alignment", alternate = {"Alignment"})
    @Expose
	@Nullable
    public Alignment alignment;

    /**
     * The Margin.
     * 
     */
    @SerializedName(value = "margin", alternate = {"Margin"})
    @Expose
	@Nullable
    public Integer margin;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
