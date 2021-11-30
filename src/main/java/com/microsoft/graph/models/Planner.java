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
import com.microsoft.graph.models.PlannerBucket;
import com.microsoft.graph.models.PlannerPlan;
import com.microsoft.graph.models.PlannerRoster;
import com.microsoft.graph.models.PlannerTask;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.PlannerBucketCollectionPage;
import com.microsoft.graph.requests.PlannerPlanCollectionPage;
import com.microsoft.graph.requests.PlannerRosterCollectionPage;
import com.microsoft.graph.requests.PlannerTaskCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner.
 */
public class Planner extends Entity implements IJsonBackedObject {


    /**
     * The Buckets.
     * Read-only. Nullable. Returns a collection of the specified buckets
     */
    @SerializedName(value = "buckets", alternate = {"Buckets"})
    @Expose
	@Nullable
    public PlannerBucketCollectionPage buckets;

    /**
     * The Plans.
     * Read-only. Nullable. Returns a collection of the specified plans
     */
    @SerializedName(value = "plans", alternate = {"Plans"})
    @Expose
	@Nullable
    public PlannerPlanCollectionPage plans;

    /**
     * The Rosters.
     * Read-only. Nullable. Returns a collection of the specified rosters
     */
    @SerializedName(value = "rosters", alternate = {"Rosters"})
    @Expose
	@Nullable
    public PlannerRosterCollectionPage rosters;

    /**
     * The Tasks.
     * Read-only. Nullable. Returns a collection of the specified tasks
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

        if (json.has("plans")) {
            plans = serializer.deserializeObject(json.get("plans"), PlannerPlanCollectionPage.class);
        }

        if (json.has("rosters")) {
            rosters = serializer.deserializeObject(json.get("rosters"), PlannerRosterCollectionPage.class);
        }

        if (json.has("tasks")) {
            tasks = serializer.deserializeObject(json.get("tasks"), PlannerTaskCollectionPage.class);
        }
    }
}
