// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.PrinterDocumentConfiguration;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Document.
 */
public class PrintDocument extends Entity implements IJsonBackedObject {


    /**
     * The Configuration.
     * 
     */
    @SerializedName(value = "configuration", alternate = {"Configuration"})
    @Expose
	@Nullable
    public PrinterDocumentConfiguration configuration;

    /**
     * The Content Type.
     * The document's content (MIME) type. Read-only.
     */
    @SerializedName(value = "contentType", alternate = {"ContentType"})
    @Expose
	@Nullable
    public String contentType;

    /**
     * The Display Name.
     * The document's name. Read-only.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Size.
     * The document's size in bytes. Read-only.
     */
    @SerializedName(value = "size", alternate = {"Size"})
    @Expose
	@Nullable
    public Long size;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
