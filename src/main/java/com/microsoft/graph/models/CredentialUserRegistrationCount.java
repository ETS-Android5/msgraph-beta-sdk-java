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
import com.microsoft.graph.models.UserRegistrationCount;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Credential User Registration Count.
 */
public class CredentialUserRegistrationCount extends Entity implements IJsonBackedObject {


    /**
     * The Total User Count.
     * Provides the total user count in the tenant.
     */
    @SerializedName(value = "totalUserCount", alternate = {"TotalUserCount"})
    @Expose
	@Nullable
    public Long totalUserCount;

    /**
     * The User Registration Counts.
     * A collection of registration count and status information for users in your tenant.
     */
    @SerializedName(value = "userRegistrationCounts", alternate = {"UserRegistrationCounts"})
    @Expose
	@Nullable
    public java.util.List<UserRegistrationCount> userRegistrationCounts;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
