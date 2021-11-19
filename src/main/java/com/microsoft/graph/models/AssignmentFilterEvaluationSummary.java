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
import com.microsoft.graph.models.DevicePlatformType;
import com.microsoft.graph.models.DeviceAndAppManagementAssignmentFilterType;
import com.microsoft.graph.models.AssignmentFilterTypeAndEvaluationResult;
import com.microsoft.graph.models.AssignmentFilterEvaluationResult;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Assignment Filter Evaluation Summary.
 */
public class AssignmentFilterEvaluationSummary implements IJsonBackedObject {

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
     * The Assignment Filter Display Name.
     * The admin defined name for assignment filter.
     */
    @SerializedName(value = "assignmentFilterDisplayName", alternate = {"AssignmentFilterDisplayName"})
    @Expose
	@Nullable
    public String assignmentFilterDisplayName;

    /**
     * The Assignment Filter Id.
     * Unique identifier for the assignment filter object
     */
    @SerializedName(value = "assignmentFilterId", alternate = {"AssignmentFilterId"})
    @Expose
	@Nullable
    public String assignmentFilterId;

    /**
     * The Assignment Filter Last Modified Date Time.
     * The time the assignment filter was last modified.
     */
    @SerializedName(value = "assignmentFilterLastModifiedDateTime", alternate = {"AssignmentFilterLastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime assignmentFilterLastModifiedDateTime;

    /**
     * The Assignment Filter Platform.
     * The platform for which this assignment filter is created.
     */
    @SerializedName(value = "assignmentFilterPlatform", alternate = {"AssignmentFilterPlatform"})
    @Expose
	@Nullable
    public DevicePlatformType assignmentFilterPlatform;

    /**
     * The Assignment Filter Type.
     * Indicate filter type either include or exclude.
     */
    @SerializedName(value = "assignmentFilterType", alternate = {"AssignmentFilterType"})
    @Expose
	@Nullable
    public DeviceAndAppManagementAssignmentFilterType assignmentFilterType;

    /**
     * The Assignment Filter Type And Evaluation Results.
     * A collection of filter types and their corresponding evaluation results.
     */
    @SerializedName(value = "assignmentFilterTypeAndEvaluationResults", alternate = {"AssignmentFilterTypeAndEvaluationResults"})
    @Expose
	@Nullable
    public java.util.List<AssignmentFilterTypeAndEvaluationResult> assignmentFilterTypeAndEvaluationResults;

    /**
     * The Evaluation Date Time.
     * The time assignment filter was evaluated.
     */
    @SerializedName(value = "evaluationDateTime", alternate = {"EvaluationDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime evaluationDateTime;

    /**
     * The Evaluation Result.
     * Assignment filter evaluation result.
     */
    @SerializedName(value = "evaluationResult", alternate = {"EvaluationResult"})
    @Expose
	@Nullable
    public AssignmentFilterEvaluationResult evaluationResult;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
