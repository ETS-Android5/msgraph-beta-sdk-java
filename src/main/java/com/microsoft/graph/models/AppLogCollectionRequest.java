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
import com.microsoft.graph.models.AppLogUploadState;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the App Log Collection Request.
 */
public class AppLogCollectionRequest extends Entity implements IJsonBackedObject {


    /**
     * The Completed Date Time.
     * Time at which the upload log request reached a terminal state
     */
    @SerializedName(value = "completedDateTime", alternate = {"CompletedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime completedDateTime;

    /**
     * The Custom Log Folders.
     * List of log folders.
     */
    @SerializedName(value = "customLogFolders", alternate = {"CustomLogFolders"})
    @Expose
	@Nullable
    public java.util.List<String> customLogFolders;

    /**
     * The Error Message.
     * Error message if any during the upload process
     */
    @SerializedName(value = "errorMessage", alternate = {"ErrorMessage"})
    @Expose
	@Nullable
    public String errorMessage;

    /**
     * The Status.
     * Log upload status. Possible values are: pending, completed, failed.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public AppLogUploadState status;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
