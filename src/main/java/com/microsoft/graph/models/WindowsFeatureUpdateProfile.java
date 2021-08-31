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
import com.microsoft.graph.models.WindowsFeatureUpdateProfileAssignment;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.WindowsFeatureUpdateProfileAssignmentCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Feature Update Profile.
 */
public class WindowsFeatureUpdateProfile extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * The date time that the profile was created.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Deployable Content Display Name.
     * Friendly display name of the quality update profile deployable content
     */
    @SerializedName(value = "deployableContentDisplayName", alternate = {"DeployableContentDisplayName"})
    @Expose
	@Nullable
    public String deployableContentDisplayName;

    /**
     * The Description.
     * The description of the profile which is specified by the user.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * The display name of the profile.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The End Of Support Date.
     * The last supported date for a feature update
     */
    @SerializedName(value = "endOfSupportDate", alternate = {"EndOfSupportDate"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime endOfSupportDate;

    /**
     * The Feature Update Version.
     * The feature update version that will be deployed to the devices targeted by this profile. The version could be any supported version for example 1709, 1803 or 1809 and so on.
     */
    @SerializedName(value = "featureUpdateVersion", alternate = {"FeatureUpdateVersion"})
    @Expose
	@Nullable
    public String featureUpdateVersion;

    /**
     * The Last Modified Date Time.
     * The date time that the profile was last modified.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Role Scope Tag Ids.
     * List of Scope Tags for this Feature Update entity.
     */
    @SerializedName(value = "roleScopeTagIds", alternate = {"RoleScopeTagIds"})
    @Expose
	@Nullable
    public java.util.List<String> roleScopeTagIds;

    /**
     * The Assignments.
     * The list of group assignments of the profile.
     */
    @SerializedName(value = "assignments", alternate = {"Assignments"})
    @Expose
	@Nullable
    public WindowsFeatureUpdateProfileAssignmentCollectionPage assignments;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("assignments")) {
            assignments = serializer.deserializeObject(json.get("assignments"), WindowsFeatureUpdateProfileAssignmentCollectionPage.class);
        }
    }
}
