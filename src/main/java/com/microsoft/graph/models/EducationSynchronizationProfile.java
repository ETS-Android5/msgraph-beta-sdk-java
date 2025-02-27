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
import com.microsoft.graph.models.EducationSynchronizationDataProvider;
import com.microsoft.graph.models.EducationIdentitySynchronizationConfiguration;
import com.microsoft.graph.models.EducationSynchronizationLicenseAssignment;
import com.microsoft.graph.models.EducationSynchronizationProfileState;
import com.microsoft.graph.models.EducationSynchronizationError;
import com.microsoft.graph.models.EducationSynchronizationProfileStatus;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.EducationSynchronizationErrorCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Synchronization Profile.
 */
public class EducationSynchronizationProfile extends Entity implements IJsonBackedObject {


    /**
     * The Data Provider.
     * The data provider used for the profile.
     */
    @SerializedName(value = "dataProvider", alternate = {"DataProvider"})
    @Expose
	@Nullable
    public EducationSynchronizationDataProvider dataProvider;

    /**
     * The Display Name.
     * Name of the configuration profile for syncing identities.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Expiration Date.
     * The date the profile should be considered expired and cease syncing. Provide the date in YYYY-MM-DD format, following ISO 8601. Maximum value is 18 months from profile creation.  (optional)
     */
    @SerializedName(value = "expirationDate", alternate = {"ExpirationDate"})
    @Expose
	@Nullable
    public com.microsoft.graph.core.DateOnly expirationDate;

    /**
     * The Handle Special Character Constraint.
     * Determines if School Data Sync should automatically replace unsupported special characters while syncing from source.
     */
    @SerializedName(value = "handleSpecialCharacterConstraint", alternate = {"HandleSpecialCharacterConstraint"})
    @Expose
	@Nullable
    public Boolean handleSpecialCharacterConstraint;

    /**
     * The Identity Synchronization Configuration.
     * Determines how the Profile should [create new][fullsync] or [match existing][dirsync] AAD Users.
     */
    @SerializedName(value = "identitySynchronizationConfiguration", alternate = {"IdentitySynchronizationConfiguration"})
    @Expose
	@Nullable
    public EducationIdentitySynchronizationConfiguration identitySynchronizationConfiguration;

    /**
     * The Licenses To Assign.
     * License setup configuration.
     */
    @SerializedName(value = "licensesToAssign", alternate = {"LicensesToAssign"})
    @Expose
	@Nullable
    public java.util.List<EducationSynchronizationLicenseAssignment> licensesToAssign;

    /**
     * The State.
     * The state of the profile. Possible values are: provisioning, provisioned, provisioningFailed, deleting, deletionFailed.
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
	@Nullable
    public EducationSynchronizationProfileState state;

    /**
     * The Errors.
     * All errors associated with this synchronization profile.
     */
    @SerializedName(value = "errors", alternate = {"Errors"})
    @Expose
	@Nullable
    public EducationSynchronizationErrorCollectionPage errors;

    /**
     * The Profile Status.
     * The synchronization status.
     */
    @SerializedName(value = "profileStatus", alternate = {"ProfileStatus"})
    @Expose
	@Nullable
    public EducationSynchronizationProfileStatus profileStatus;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("errors")) {
            errors = serializer.deserializeObject(json.get("errors"), EducationSynchronizationErrorCollectionPage.class);
        }
    }
}
