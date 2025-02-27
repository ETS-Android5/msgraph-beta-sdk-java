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
import com.microsoft.graph.models.MigrationStatus;
import com.microsoft.graph.models.KeyValuePair;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Relying Party Detailed Summary.
 */
public class RelyingPartyDetailedSummary extends Entity implements IJsonBackedObject {


    /**
     * The Failed Sign In Count.
     * Number of failed sign in on Active Directory Federation Service in the period specified.
     */
    @SerializedName(value = "failedSignInCount", alternate = {"FailedSignInCount"})
    @Expose
	@Nullable
    public Long failedSignInCount;

    /**
     * The Migration Status.
     * Indication of whether the application can be moved to Azure AD or require more investigation. Possible values are: ready, needsReview, additionalStepsRequired, unknownFutureValue.
     */
    @SerializedName(value = "migrationStatus", alternate = {"MigrationStatus"})
    @Expose
	@Nullable
    public MigrationStatus migrationStatus;

    /**
     * The Migration Validation Details.
     * Specifies all the validations check done on applications configuration details to evaluate if the application is ready to be moved to Azure AD.
     */
    @SerializedName(value = "migrationValidationDetails", alternate = {"MigrationValidationDetails"})
    @Expose
	@Nullable
    public java.util.List<KeyValuePair> migrationValidationDetails;

    /**
     * The Relying Party Id.
     * This identifier is used to identify the relying party to this Federation Service. It is used when issuing claims to the relying party.
     */
    @SerializedName(value = "relyingPartyId", alternate = {"RelyingPartyId"})
    @Expose
	@Nullable
    public String relyingPartyId;

    /**
     * The Relying Party Name.
     * Name of application or other entity on the internet that uses an identity provider to authenticate a user who wants to log in.
     */
    @SerializedName(value = "relyingPartyName", alternate = {"RelyingPartyName"})
    @Expose
	@Nullable
    public String relyingPartyName;

    /**
     * The Reply Urls.
     * Specifies where the relying party expects to receive the token.
     */
    @SerializedName(value = "replyUrls", alternate = {"ReplyUrls"})
    @Expose
	@Nullable
    public java.util.List<String> replyUrls;

    /**
     * The Service Id.
     * Uniquely identifies the Active Directory forest.
     */
    @SerializedName(value = "serviceId", alternate = {"ServiceId"})
    @Expose
	@Nullable
    public String serviceId;

    /**
     * The Sign In Success Rate.
     * Number of successful / (number of successful + number of failed sign ins) on Active Directory Federation Service in the period specified.
     */
    @SerializedName(value = "signInSuccessRate", alternate = {"SignInSuccessRate"})
    @Expose
	@Nullable
    public Double signInSuccessRate;

    /**
     * The Successful Sign In Count.
     * Number of successful sign ins on Active Directory Federation Service.
     */
    @SerializedName(value = "successfulSignInCount", alternate = {"SuccessfulSignInCount"})
    @Expose
	@Nullable
    public Long successfulSignInCount;

    /**
     * The Total Sign In Count.
     * Number of successful + failed sign ins failed sign ins on Active Directory Federation Service in the period specified.
     */
    @SerializedName(value = "totalSignInCount", alternate = {"TotalSignInCount"})
    @Expose
	@Nullable
    public Long totalSignInCount;

    /**
     * The Unique User Count.
     * Number of unique users that have signed into the application.
     */
    @SerializedName(value = "uniqueUserCount", alternate = {"UniqueUserCount"})
    @Expose
	@Nullable
    public Long uniqueUserCount;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
