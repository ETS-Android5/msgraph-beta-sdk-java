// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.TermsAndConditions;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Terms And Conditions Acceptance Status.
 */
public class TermsAndConditionsAcceptanceStatus extends Entity implements IJsonBackedObject {


    /**
     * The Accepted Date Time.
     * DateTime when the terms were last accepted by the user.
     */
    @SerializedName(value = "acceptedDateTime", alternate = {"AcceptedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime acceptedDateTime;

    /**
     * The Accepted Version.
     * Most recent version number of the T&amp;C accepted by the user.
     */
    @SerializedName(value = "acceptedVersion", alternate = {"AcceptedVersion"})
    @Expose
	@Nullable
    public Integer acceptedVersion;

    /**
     * The User Display Name.
     * Display name of the user whose acceptance the entity represents.
     */
    @SerializedName(value = "userDisplayName", alternate = {"UserDisplayName"})
    @Expose
	@Nullable
    public String userDisplayName;

    /**
     * The User Principal Name.
     * The userPrincipalName of the User that accepted the term.
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
	@Nullable
    public String userPrincipalName;

    /**
     * The Terms And Conditions.
     * Navigation link to the terms and conditions that are assigned.
     */
    @SerializedName(value = "termsAndConditions", alternate = {"TermsAndConditions"})
    @Expose
	@Nullable
    public TermsAndConditions termsAndConditions;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
