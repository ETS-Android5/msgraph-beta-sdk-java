// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.Attachment;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the File Attachment.
 */
public class FileAttachment extends Attachment implements IJsonBackedObject {


    /**
     * The Content Bytes.
     * The base64-encoded contents of the file.
     */
    @SerializedName(value = "contentBytes", alternate = {"ContentBytes"})
    @Expose
	@Nullable
    public byte[] contentBytes;

    /**
     * The Content Id.
     * The ID of the attachment in the Exchange store.
     */
    @SerializedName(value = "contentId", alternate = {"ContentId"})
    @Expose
	@Nullable
    public String contentId;

    /**
     * The Content Location.
     * Do not use this property as it is not supported.
     */
    @SerializedName(value = "contentLocation", alternate = {"ContentLocation"})
    @Expose
	@Nullable
    public String contentLocation;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
