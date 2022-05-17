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
import com.microsoft.graph.models.PlannerPlanContainer;
import com.microsoft.graph.models.PlannerPlanContextCollection;
import com.microsoft.graph.models.IdentitySet;
import com.microsoft.graph.models.PlannerBucket;
import com.microsoft.graph.models.PlannerPlanDetails;
import com.microsoft.graph.models.PlannerTask;
import com.microsoft.graph.models.PlannerDelta;
import com.microsoft.graph.requests.PlannerBucketCollectionPage;
import com.microsoft.graph.requests.PlannerTaskCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Plan.
 */
public class PlannerPlan extends PlannerDelta implements IJsonBackedObject {


    /**
     * The Container.
     * Identifies the container of the plan. After it is set, this property can’t be updated. Required.
     */
    @SerializedName(value = "container", alternate = {"Container"})
    @Expose
	@Nullable
    public PlannerPlanContainer container;

    /**
     * The Contexts.
     * Read-only. Additional user experiences in which this plan is used, represented as plannerPlanContext entries.
     */
    @SerializedName(value = "contexts", alternate = {"Contexts"})
    @Expose
	@Nullable
    public PlannerPlanContextCollection contexts;

    /**
     * The Created By.
     * Read-only. The user who created the plan.
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
	@Nullable
    public IdentitySet createdBy;

    /**
     * The Created Date Time.
     * Read-only. Date and time at which the plan is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Owner.
     * 
     * @deprecated Owner property is deprecated and will be removed in January 2023. Please use the container property instead.
     */
    @Deprecated
    @SerializedName(value = "owner", alternate = {"Owner"})
    @Expose
	@Nullable
    public String owner;

    /**
     * The Title.
     * Required. Title of the plan.
     */
    @SerializedName(value = "title", alternate = {"Title"})
    @Expose
	@Nullable
    public String title;

    /**
     * The Buckets.
     * Collection of buckets in the plan. Read-only. Nullable.
     */
    @SerializedName(value = "buckets", alternate = {"Buckets"})
    @Expose
	@Nullable
    public PlannerBucketCollectionPage buckets;

    /**
     * The Details.
     * Additional details about the plan. Read-only. Nullable.
     */
    @SerializedName(value = "details", alternate = {"Details"})
    @Expose
	@Nullable
    public PlannerPlanDetails details;

    /**
     * The Tasks.
     * Collection of tasks in the plan. Read-only. Nullable.
     */
    @SerializedName(value = "tasks", alternate = {"Tasks"})
    @Expose
	@Nullable
    public PlannerTaskCollectionPage tasks;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("buckets")) {
            buckets = serializer.deserializeObject(json.get("buckets"), PlannerBucketCollectionPage.class);
        }

        if (json.has("tasks")) {
            tasks = serializer.deserializeObject(json.get("tasks"), PlannerTaskCollectionPage.class);
        }
    }
}
