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
import com.microsoft.graph.models.UserRegistrationFeatureCount;
import com.microsoft.graph.models.IncludedUserRoles;
import com.microsoft.graph.models.IncludedUserTypes;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Registration Feature Summary.
 */
public class UserRegistrationFeatureSummary implements IJsonBackedObject {

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
     * The Total User Count.
     * Total number of users accounts, excluding those that are blocked
     */
    @SerializedName(value = "totalUserCount", alternate = {"TotalUserCount"})
    @Expose
	@Nullable
    public Long totalUserCount;

    /**
     * The User Registration Feature Counts.
     * Number of users registered or capable for Multi-Factor Authentication, Self-Service Password Reset and Passwordless Authentication.
     */
    @SerializedName(value = "userRegistrationFeatureCounts", alternate = {"UserRegistrationFeatureCounts"})
    @Expose
	@Nullable
    public java.util.List<UserRegistrationFeatureCount> userRegistrationFeatureCounts;

    /**
     * The User Roles.
     * User role type. Possible values are: all, privilegedAdmin, admin, user.
     */
    @SerializedName(value = "userRoles", alternate = {"UserRoles"})
    @Expose
	@Nullable
    public IncludedUserRoles userRoles;

    /**
     * The User Types.
     * User type. Possible values are: all, member, guest.
     */
    @SerializedName(value = "userTypes", alternate = {"UserTypes"})
    @Expose
	@Nullable
    public IncludedUserTypes userTypes;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
