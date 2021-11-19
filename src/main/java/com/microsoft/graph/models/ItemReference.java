// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.SharepointIds;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Reference.
 */
public class ItemReference implements IJsonBackedObject {

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
     * The Drive Id.
     * 
     */
    @SerializedName(value = "driveId", alternate = {"DriveId"})
    @Expose
	@Nullable
    public String driveId;

    /**
     * The Drive Type.
     * 
     */
    @SerializedName(value = "driveType", alternate = {"DriveType"})
    @Expose
	@Nullable
    public String driveType;

    /**
     * The Id.
     * 
     */
    @SerializedName(value = "id", alternate = {"Id"})
    @Expose
	@Nullable
    public String id;

    /**
     * The Name.
     * 
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Path.
     * 
     */
    @SerializedName(value = "path", alternate = {"Path"})
    @Expose
	@Nullable
    public String path;

    /**
     * The Share Id.
     * 
     */
    @SerializedName(value = "shareId", alternate = {"ShareId"})
    @Expose
	@Nullable
    public String shareId;

    /**
     * The Sharepoint Ids.
     * 
     */
    @SerializedName(value = "sharepointIds", alternate = {"SharepointIds"})
    @Expose
	@Nullable
    public SharepointIds sharepointIds;

    /**
     * The Site Id.
     * 
     */
    @SerializedName(value = "siteId", alternate = {"SiteId"})
    @Expose
	@Nullable
    public String siteId;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
