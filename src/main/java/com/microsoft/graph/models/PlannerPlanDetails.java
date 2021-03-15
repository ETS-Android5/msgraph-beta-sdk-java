// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.PlannerCategoryDescriptions;
import com.microsoft.graph.models.PlannerPlanContextDetailsCollection;
import com.microsoft.graph.models.PlannerUserIds;
import com.microsoft.graph.models.PlannerDelta;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Plan Details.
 */
public class PlannerPlanDetails extends PlannerDelta implements IJsonBackedObject {


    /**
     * The Category Descriptions.
     * An object that specifies the descriptions of the 25 categories that can be associated with tasks in the plan
     */
    @SerializedName(value = "categoryDescriptions", alternate = {"CategoryDescriptions"})
    @Expose
	@Nullable
    public PlannerCategoryDescriptions categoryDescriptions;

    /**
     * The Context Details.
     * Read-only. A collection of additional information associated with plannerPlanContext entries that are defined for the plannerPlan container.
     */
    @SerializedName(value = "contextDetails", alternate = {"ContextDetails"})
    @Expose
	@Nullable
    public PlannerPlanContextDetailsCollection contextDetails;

    /**
     * The Shared With.
     * The set of user IDs that this plan is shared with. If you are using Microsoft 365 groups, use the groups API to manage group membership to share the group's plan. You can also add existing members of the group to this collection, although it is not required in order for them to access the plan owned by the group.
     */
    @SerializedName(value = "sharedWith", alternate = {"SharedWith"})
    @Expose
	@Nullable
    public PlannerUserIds sharedWith;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
