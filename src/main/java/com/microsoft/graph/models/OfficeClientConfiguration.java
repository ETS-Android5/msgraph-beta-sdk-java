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
import com.microsoft.graph.models.OfficeClientCheckinStatus;
import com.microsoft.graph.models.OfficeUserCheckinSummary;
import com.microsoft.graph.models.OfficeClientConfigurationAssignment;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.OfficeClientConfigurationAssignmentCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Office Client Configuration.
 */
public class OfficeClientConfiguration extends Entity implements IJsonBackedObject {


    /**
     * The Checkin Statuses.
     * List of office Client check-in status.
     */
    @SerializedName(value = "checkinStatuses", alternate = {"CheckinStatuses"})
    @Expose
	@Nullable
    public java.util.List<OfficeClientCheckinStatus> checkinStatuses;

    /**
     * The Description.
     * Not yet documented
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * Admin provided description of the office client configuration policy.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Priority.
     * Priority value should be unique value for each policy under a tenant and will be used for conflict resolution, lower values mean priority is high.
     */
    @SerializedName(value = "priority", alternate = {"Priority"})
    @Expose
	@Nullable
    public Integer priority;

    /**
     * The User Checkin Summary.
     * User check-in summary for the policy.
     */
    @SerializedName(value = "userCheckinSummary", alternate = {"UserCheckinSummary"})
    @Expose
	@Nullable
    public OfficeUserCheckinSummary userCheckinSummary;

    /**
     * The Assignments.
     * The list of group assignments for the policy.
     */
    @SerializedName(value = "assignments", alternate = {"Assignments"})
    @Expose
	@Nullable
    public OfficeClientConfigurationAssignmentCollectionPage assignments;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("assignments")) {
            assignments = serializer.deserializeObject(json.get("assignments"), OfficeClientConfigurationAssignmentCollectionPage.class);
        }
    }
}
