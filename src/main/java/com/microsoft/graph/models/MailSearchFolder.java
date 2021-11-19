// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.MailFolder;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mail Search Folder.
 */
public class MailSearchFolder extends MailFolder implements IJsonBackedObject {


    /**
     * The Filter Query.
     * 
     */
    @SerializedName(value = "filterQuery", alternate = {"FilterQuery"})
    @Expose
	@Nullable
    public String filterQuery;

    /**
     * The Include Nested Folders.
     * 
     */
    @SerializedName(value = "includeNestedFolders", alternate = {"IncludeNestedFolders"})
    @Expose
	@Nullable
    public Boolean includeNestedFolders;

    /**
     * The Is Supported.
     * 
     */
    @SerializedName(value = "isSupported", alternate = {"IsSupported"})
    @Expose
	@Nullable
    public Boolean isSupported;

    /**
     * The Source Folder Ids.
     * 
     */
    @SerializedName(value = "sourceFolderIds", alternate = {"SourceFolderIds"})
    @Expose
	@Nullable
    public java.util.List<String> sourceFolderIds;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
