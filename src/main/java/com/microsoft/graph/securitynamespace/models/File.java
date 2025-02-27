// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.security.models.StringValueDictionary;
import com.microsoft.graph.security.models.FileProcessingStatus;
import com.microsoft.graph.security.models.SourceType;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the File.
 */
public class File extends Entity implements IJsonBackedObject {


    /**
     * The Date Time.
     * 
     */
    @SerializedName(value = "dateTime", alternate = {"DateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime dateTime;

    /**
     * The Extension.
     * 
     */
    @SerializedName(value = "extension", alternate = {"Extension"})
    @Expose
	@Nullable
    public String extension;

    /**
     * The Media Type.
     * 
     */
    @SerializedName(value = "mediaType", alternate = {"MediaType"})
    @Expose
	@Nullable
    public String mediaType;

    /**
     * The Name.
     * 
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Other Properties.
     * 
     */
    @SerializedName(value = "otherProperties", alternate = {"OtherProperties"})
    @Expose
	@Nullable
    public StringValueDictionary otherProperties;

    /**
     * The Processing Status.
     * 
     */
    @SerializedName(value = "processingStatus", alternate = {"ProcessingStatus"})
    @Expose
	@Nullable
    public FileProcessingStatus processingStatus;

    /**
     * The Sender Or Authors.
     * 
     */
    @SerializedName(value = "senderOrAuthors", alternate = {"SenderOrAuthors"})
    @Expose
	@Nullable
    public java.util.List<String> senderOrAuthors;

    /**
     * The Size.
     * 
     */
    @SerializedName(value = "size", alternate = {"Size"})
    @Expose
	@Nullable
    public Long size;

    /**
     * The Source Type.
     * 
     */
    @SerializedName(value = "sourceType", alternate = {"SourceType"})
    @Expose
	@Nullable
    public EnumSet<SourceType> sourceType;

    /**
     * The Subject Title.
     * 
     */
    @SerializedName(value = "subjectTitle", alternate = {"SubjectTitle"})
    @Expose
	@Nullable
    public String subjectTitle;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
