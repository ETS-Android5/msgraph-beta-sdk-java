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
import com.microsoft.graph.models.AppleOwnerTypeEnrollmentType;
import com.microsoft.graph.models.AppleUserInitiatedEnrollmentType;
import com.microsoft.graph.models.DevicePlatformType;
import com.microsoft.graph.models.AppleEnrollmentProfileAssignment;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.AppleEnrollmentProfileAssignmentCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Apple User Initiated Enrollment Profile.
 */
public class AppleUserInitiatedEnrollmentProfile extends Entity implements IJsonBackedObject {


    /**
     * The Available Enrollment Type Options.
     * List of available enrollment type options
     */
    @SerializedName(value = "availableEnrollmentTypeOptions", alternate = {"AvailableEnrollmentTypeOptions"})
    @Expose
	@Nullable
    public java.util.List<AppleOwnerTypeEnrollmentType> availableEnrollmentTypeOptions;

    /**
     * The Created Date Time.
     * Profile creation time
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Default Enrollment Type.
     * The default profile enrollment type. Possible values are: unknown, device, user.
     */
    @SerializedName(value = "defaultEnrollmentType", alternate = {"DefaultEnrollmentType"})
    @Expose
	@Nullable
    public AppleUserInitiatedEnrollmentType defaultEnrollmentType;

    /**
     * The Description.
     * Description of the profile
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * Name of the profile
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Last Modified Date Time.
     * Profile last modified time
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Platform.
     * The platform of the Device. Possible values are: android, androidForWork, iOS, macOS, windowsPhone81, windows81AndLater, windows10AndLater, androidWorkProfile, unknown.
     */
    @SerializedName(value = "platform", alternate = {"Platform"})
    @Expose
	@Nullable
    public DevicePlatformType platform;

    /**
     * The Priority.
     * Priority, 0 is highest
     */
    @SerializedName(value = "priority", alternate = {"Priority"})
    @Expose
	@Nullable
    public Integer priority;

    /**
     * The Assignments.
     * The list of assignments for this profile.
     */
    @SerializedName(value = "assignments", alternate = {"Assignments"})
    @Expose
	@Nullable
    public AppleEnrollmentProfileAssignmentCollectionPage assignments;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("assignments")) {
            assignments = serializer.deserializeObject(json.get("assignments"), AppleEnrollmentProfileAssignmentCollectionPage.class);
        }
    }
}
