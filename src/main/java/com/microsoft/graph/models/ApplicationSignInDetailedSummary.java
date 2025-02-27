// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.SignInStatus;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Application Sign In Detailed Summary.
 */
public class ApplicationSignInDetailedSummary extends Entity implements IJsonBackedObject {


    /**
     * The Aggregated Event Date Time.
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    @SerializedName(value = "aggregatedEventDateTime", alternate = {"AggregatedEventDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime aggregatedEventDateTime;

    /**
     * The App Display Name.
     * Name of the application that the user signed in to.
     */
    @SerializedName(value = "appDisplayName", alternate = {"AppDisplayName"})
    @Expose
	@Nullable
    public String appDisplayName;

    /**
     * The App Id.
     * ID of the application that the user signed in to.
     */
    @SerializedName(value = "appId", alternate = {"AppId"})
    @Expose
	@Nullable
    public String appId;

    /**
     * The Sign In Count.
     * Count of sign-ins made by the application.
     */
    @SerializedName(value = "signInCount", alternate = {"SignInCount"})
    @Expose
	@Nullable
    public Long signInCount;

    /**
     * The Status.
     * Details of the sign-in status.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public SignInStatus status;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
