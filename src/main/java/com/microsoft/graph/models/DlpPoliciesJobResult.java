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
import com.microsoft.graph.models.MatchingDlpRule;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Dlp Policies Job Result.
 */
public class DlpPoliciesJobResult implements IJsonBackedObject {

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
     * The Audit Correlation Id.
     * 
     */
    @SerializedName(value = "auditCorrelationId", alternate = {"AuditCorrelationId"})
    @Expose
	@Nullable
    public String auditCorrelationId;

    /**
     * The Evaluation Date Time.
     * 
     */
    @SerializedName(value = "evaluationDateTime", alternate = {"EvaluationDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime evaluationDateTime;

    /**
     * The Matching Rules.
     * 
     */
    @SerializedName(value = "matchingRules", alternate = {"MatchingRules"})
    @Expose
	@Nullable
    public java.util.List<MatchingDlpRule> matchingRules;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
