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
import com.microsoft.graph.models.AlertFeedback;
import com.microsoft.graph.models.AlertStatus;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Alert History State.
 */
public class AlertHistoryState implements IJsonBackedObject {

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
     * The App Id.
     * The Application ID of the calling application that submitted an update (PATCH) to the alert. The appId should be extracted from the auth token and not entered manually by the calling application.
     */
    @SerializedName(value = "appId", alternate = {"AppId"})
    @Expose
	@Nullable
    public String appId;

    /**
     * The Assigned To.
     * UPN of user the alert was assigned to (note: alert.assignedTo only stores the last value/UPN).
     */
    @SerializedName(value = "assignedTo", alternate = {"AssignedTo"})
    @Expose
	@Nullable
    public String assignedTo;

    /**
     * The Comments.
     * Comment entered by signed-in user.
     */
    @SerializedName(value = "comments", alternate = {"Comments"})
    @Expose
	@Nullable
    public java.util.List<String> comments;

    /**
     * The Feedback.
     * Analyst feedback on the alert in this update. Possible values are: unknown, truePositive, falsePositive, benignPositive.
     */
    @SerializedName(value = "feedback", alternate = {"Feedback"})
    @Expose
	@Nullable
    public AlertFeedback feedback;

    /**
     * The Status.
     * Alert status value (if updated). Possible values are: unknown, newAlert, inProgress, resolved, dismissed.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public AlertStatus status;

    /**
     * The Updated Date Time.
     * Date and time of the alert update. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    @SerializedName(value = "updatedDateTime", alternate = {"UpdatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime updatedDateTime;

    /**
     * The User.
     * UPN of the signed-in user that updated the alert (taken from the bearer token - if in user/delegated auth mode).
     */
    @SerializedName(value = "user", alternate = {"User"})
    @Expose
	@Nullable
    public String user;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
