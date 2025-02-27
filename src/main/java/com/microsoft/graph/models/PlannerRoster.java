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
import com.microsoft.graph.models.PlannerRosterMember;
import com.microsoft.graph.models.PlannerPlan;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.PlannerRosterMemberCollectionPage;
import com.microsoft.graph.requests.PlannerPlanCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Roster.
 */
public class PlannerRoster extends Entity implements IJsonBackedObject {


    /**
     * The Members.
     * Retrieves the members of the plannerRoster.
     */
    @SerializedName(value = "members", alternate = {"Members"})
    @Expose
	@Nullable
    public PlannerRosterMemberCollectionPage members;

    /**
     * The Plans.
     * Retrieves the plans contained by the plannerRoster.
     */
	@Nullable
    public PlannerPlanCollectionPage plans;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("members")) {
            members = serializer.deserializeObject(json.get("members"), PlannerRosterMemberCollectionPage.class);
        }

        if (json.has("plans")) {
            plans = serializer.deserializeObject(json.get("plans"), PlannerPlanCollectionPage.class);
        }
    }
}
