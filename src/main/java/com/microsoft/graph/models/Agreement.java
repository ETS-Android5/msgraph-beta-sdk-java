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
import com.microsoft.graph.models.TermsExpiration;
import com.microsoft.graph.models.AgreementAcceptance;
import com.microsoft.graph.models.AgreementFile;
import com.microsoft.graph.models.AgreementFileLocalization;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.AgreementAcceptanceCollectionPage;
import com.microsoft.graph.requests.AgreementFileLocalizationCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Agreement.
 */
public class Agreement extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * Display name of the agreement. The display name is used for internal tracking of the agreement but is not shown to end users who view the agreement.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Is Per Device Acceptance Required.
     * This setting enables you to require end users to accept this agreement on every device that they are accessing it from. The end user will be required to register their device in Azure AD, if they haven't already done so.
     */
    @SerializedName(value = "isPerDeviceAcceptanceRequired", alternate = {"IsPerDeviceAcceptanceRequired"})
    @Expose
	@Nullable
    public Boolean isPerDeviceAcceptanceRequired;

    /**
     * The Is Viewing Before Acceptance Required.
     * Indicates whether the user has to expand the agreement before accepting.
     */
    @SerializedName(value = "isViewingBeforeAcceptanceRequired", alternate = {"IsViewingBeforeAcceptanceRequired"})
    @Expose
	@Nullable
    public Boolean isViewingBeforeAcceptanceRequired;

    /**
     * The Terms Expiration.
     * Expiration schedule and frequency of agreement for all users.
     */
    @SerializedName(value = "termsExpiration", alternate = {"TermsExpiration"})
    @Expose
	@Nullable
    public TermsExpiration termsExpiration;

    /**
     * The User Reaccept Required Frequency.
     * The duration after which the user must re-accept the terms of use. The value is represented in ISO 8601 format for durations.
     */
    @SerializedName(value = "userReacceptRequiredFrequency", alternate = {"UserReacceptRequiredFrequency"})
    @Expose
	@Nullable
    public javax.xml.datatype.Duration userReacceptRequiredFrequency;

    /**
     * The Acceptances.
     * Read-only. Information about acceptances of this agreement.
     */
    @SerializedName(value = "acceptances", alternate = {"Acceptances"})
    @Expose
	@Nullable
    public AgreementAcceptanceCollectionPage acceptances;

    /**
     * The File.
     * Default PDF linked to this agreement.
     */
    @SerializedName(value = "file", alternate = {"File"})
    @Expose
	@Nullable
    public AgreementFile file;

    /**
     * The Files.
     * PDFs linked to this agreement. Note: This property is in the process of being deprecated. Use the  file property instead.
     */
    @SerializedName(value = "files", alternate = {"Files"})
    @Expose
	@Nullable
    public AgreementFileLocalizationCollectionPage files;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("acceptances")) {
            acceptances = serializer.deserializeObject(json.get("acceptances"), AgreementAcceptanceCollectionPage.class);
        }

        if (json.has("files")) {
            files = serializer.deserializeObject(json.get("files"), AgreementFileLocalizationCollectionPage.class);
        }
    }
}
