// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.ItemBody;
import com.microsoft.graph.models.ItemFacet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Person Annotation.
 */
public class PersonAnnotation extends ItemFacet implements IJsonBackedObject {


    /**
     * The Detail.
     * Contains the detail of the note itself.
     */
    @SerializedName(value = "detail", alternate = {"Detail"})
    @Expose
	@Nullable
    public ItemBody detail;

    /**
     * The Display Name.
     * Contains a friendly name for the note.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Thumbnail Url.
     * 
     */
    @SerializedName(value = "thumbnailUrl", alternate = {"ThumbnailUrl"})
    @Expose
	@Nullable
    public String thumbnailUrl;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
