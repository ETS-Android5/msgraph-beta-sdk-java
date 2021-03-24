// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.ServiceInformation;
import com.microsoft.graph.models.ItemFacet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Web Account.
 */
public class WebAccount extends ItemFacet implements IJsonBackedObject {


    /**
     * The Description.
     * Contains the description the user has provided for the account on the service being referenced.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Service.
     * Contains basic detail about the service that is being associated.
     */
    @SerializedName(value = "service", alternate = {"Service"})
    @Expose
	@Nullable
    public ServiceInformation service;

    /**
     * The Status Message.
     * Contains a status message from the cloud service if provided or synchronized.
     */
    @SerializedName(value = "statusMessage", alternate = {"StatusMessage"})
    @Expose
	@Nullable
    public String statusMessage;

    /**
     * The Thumbnail Url.
     * 
     */
    @SerializedName(value = "thumbnailUrl", alternate = {"ThumbnailUrl"})
    @Expose
	@Nullable
    public String thumbnailUrl;

    /**
     * The User Id.
     * The user name  displayed for the webaccount.
     */
    @SerializedName(value = "userId", alternate = {"UserId"})
    @Expose
	@Nullable
    public String userId;

    /**
     * The Web Url.
     * Contains a link to the user's profile on the cloud service if one exists.
     */
    @SerializedName(value = "webUrl", alternate = {"WebUrl"})
    @Expose
	@Nullable
    public String webUrl;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
