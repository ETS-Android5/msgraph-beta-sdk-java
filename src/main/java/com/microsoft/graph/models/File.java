// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.Hashes;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the File.
 */
public class File implements IJsonBackedObject {

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
     * The Hashes.
     * Hashes of the file's binary content, if available. Read-only.
     */
    @SerializedName(value = "hashes", alternate = {"Hashes"})
    @Expose
	@Nullable
    public Hashes hashes;

    /**
     * The Mime Type.
     * The MIME type for the file. This is determined by logic on the server and might not be the value provided when the file was uploaded. Read-only.
     */
    @SerializedName(value = "mimeType", alternate = {"MimeType"})
    @Expose
	@Nullable
    public String mimeType;

    /**
     * The Processing Metadata.
     * 
     */
    @SerializedName(value = "processingMetadata", alternate = {"ProcessingMetadata"})
    @Expose
	@Nullable
    public Boolean processingMetadata;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
