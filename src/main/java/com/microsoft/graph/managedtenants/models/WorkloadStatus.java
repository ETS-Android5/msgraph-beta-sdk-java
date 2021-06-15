// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.managedtenants.models.WorkloadOnboardingStatus;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workload Status.
 */
public class WorkloadStatus implements IJsonBackedObject {

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
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Offboarded Date Time.
     * 
     */
    @SerializedName(value = "offboardedDateTime", alternate = {"OffboardedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime offboardedDateTime;

    /**
     * The Onboarded Date Time.
     * 
     */
    @SerializedName(value = "onboardedDateTime", alternate = {"OnboardedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime onboardedDateTime;

    /**
     * The Onboarding Status.
     * 
     */
    @SerializedName(value = "onboardingStatus", alternate = {"OnboardingStatus"})
    @Expose
	@Nullable
    public WorkloadOnboardingStatus onboardingStatus;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
