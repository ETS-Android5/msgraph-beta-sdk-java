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
import com.microsoft.graph.models.MimeContent;
import com.microsoft.graph.models.MobileAppPublishingState;
import com.microsoft.graph.models.MobileAppAssignment;
import com.microsoft.graph.models.MobileAppCategory;
import com.microsoft.graph.models.MobileAppInstallStatus;
import com.microsoft.graph.models.MobileAppInstallSummary;
import com.microsoft.graph.models.MobileAppRelationship;
import com.microsoft.graph.models.UserAppInstallStatus;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.MobileAppAssignmentCollectionPage;
import com.microsoft.graph.requests.MobileAppCategoryCollectionPage;
import com.microsoft.graph.requests.MobileAppInstallStatusCollectionPage;
import com.microsoft.graph.requests.MobileAppRelationshipCollectionPage;
import com.microsoft.graph.requests.UserAppInstallStatusCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App.
 */
public class MobileApp extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * The date and time the app was created.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Dependent App Count.
     * The total number of dependencies the child app has.
     */
    @SerializedName(value = "dependentAppCount", alternate = {"DependentAppCount"})
    @Expose
	@Nullable
    public Integer dependentAppCount;

    /**
     * The Description.
     * The description of the app.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Developer.
     * The developer of the app.
     */
    @SerializedName(value = "developer", alternate = {"Developer"})
    @Expose
	@Nullable
    public String developer;

    /**
     * The Display Name.
     * The admin provided or imported title of the app.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Information Url.
     * The more information Url.
     */
    @SerializedName(value = "informationUrl", alternate = {"InformationUrl"})
    @Expose
	@Nullable
    public String informationUrl;

    /**
     * The Is Assigned.
     * The value indicating whether the app is assigned to at least one group.
     */
    @SerializedName(value = "isAssigned", alternate = {"IsAssigned"})
    @Expose
	@Nullable
    public Boolean isAssigned;

    /**
     * The Is Featured.
     * The value indicating whether the app is marked as featured by the admin.
     */
    @SerializedName(value = "isFeatured", alternate = {"IsFeatured"})
    @Expose
	@Nullable
    public Boolean isFeatured;

    /**
     * The Large Icon.
     * The large icon, to be displayed in the app details and used for upload of the icon.
     */
    @SerializedName(value = "largeIcon", alternate = {"LargeIcon"})
    @Expose
	@Nullable
    public MimeContent largeIcon;

    /**
     * The Last Modified Date Time.
     * The date and time the app was last modified.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Notes.
     * Notes for the app.
     */
    @SerializedName(value = "notes", alternate = {"Notes"})
    @Expose
	@Nullable
    public String notes;

    /**
     * The Owner.
     * The owner of the app.
     */
    @SerializedName(value = "owner", alternate = {"Owner"})
    @Expose
	@Nullable
    public String owner;

    /**
     * The Privacy Information Url.
     * The privacy statement Url.
     */
    @SerializedName(value = "privacyInformationUrl", alternate = {"PrivacyInformationUrl"})
    @Expose
	@Nullable
    public String privacyInformationUrl;

    /**
     * The Publisher.
     * The publisher of the app.
     */
    @SerializedName(value = "publisher", alternate = {"Publisher"})
    @Expose
	@Nullable
    public String publisher;

    /**
     * The Publishing State.
     * The publishing state for the app. The app cannot be assigned unless the app is published. Possible values are: notPublished, processing, published.
     */
    @SerializedName(value = "publishingState", alternate = {"PublishingState"})
    @Expose
	@Nullable
    public MobileAppPublishingState publishingState;

    /**
     * The Role Scope Tag Ids.
     * List of scope tag ids for this mobile app.
     */
    @SerializedName(value = "roleScopeTagIds", alternate = {"RoleScopeTagIds"})
    @Expose
	@Nullable
    public java.util.List<String> roleScopeTagIds;

    /**
     * The Superseded App Count.
     * The total number of apps this app is directly or indirectly superseded by.
     */
    @SerializedName(value = "supersededAppCount", alternate = {"SupersededAppCount"})
    @Expose
	@Nullable
    public Integer supersededAppCount;

    /**
     * The Superseding App Count.
     * The total number of apps this app directly or indirectly supersedes.
     */
    @SerializedName(value = "supersedingAppCount", alternate = {"SupersedingAppCount"})
    @Expose
	@Nullable
    public Integer supersedingAppCount;

    /**
     * The Upload State.
     * The upload state.
     */
    @SerializedName(value = "uploadState", alternate = {"UploadState"})
    @Expose
	@Nullable
    public Integer uploadState;

    /**
     * The Assignments.
     * The list of group assignments for this mobile app.
     */
    @SerializedName(value = "assignments", alternate = {"Assignments"})
    @Expose
	@Nullable
    public MobileAppAssignmentCollectionPage assignments;

    /**
     * The Categories.
     * The list of categories for this app.
     */
	@Nullable
    public MobileAppCategoryCollectionPage categories;

    /**
     * The Device Statuses.
     * The list of installation states for this mobile app.
     */
    @SerializedName(value = "deviceStatuses", alternate = {"DeviceStatuses"})
    @Expose
	@Nullable
    public MobileAppInstallStatusCollectionPage deviceStatuses;

    /**
     * The Install Summary.
     * Mobile App Install Summary.
     */
    @SerializedName(value = "installSummary", alternate = {"InstallSummary"})
    @Expose
	@Nullable
    public MobileAppInstallSummary installSummary;

    /**
     * The Relationships.
     * List of relationships for this mobile app.
     */
    @SerializedName(value = "relationships", alternate = {"Relationships"})
    @Expose
	@Nullable
    public MobileAppRelationshipCollectionPage relationships;

    /**
     * The User Statuses.
     * The list of installation states for this mobile app.
     */
    @SerializedName(value = "userStatuses", alternate = {"UserStatuses"})
    @Expose
	@Nullable
    public UserAppInstallStatusCollectionPage userStatuses;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("assignments")) {
            assignments = serializer.deserializeObject(json.get("assignments"), MobileAppAssignmentCollectionPage.class);
        }

        if (json.has("categories")) {
            categories = serializer.deserializeObject(json.get("categories"), MobileAppCategoryCollectionPage.class);
        }

        if (json.has("deviceStatuses")) {
            deviceStatuses = serializer.deserializeObject(json.get("deviceStatuses"), MobileAppInstallStatusCollectionPage.class);
        }

        if (json.has("relationships")) {
            relationships = serializer.deserializeObject(json.get("relationships"), MobileAppRelationshipCollectionPage.class);
        }

        if (json.has("userStatuses")) {
            userStatuses = serializer.deserializeObject(json.get("userStatuses"), UserAppInstallStatusCollectionPage.class);
        }
    }
}
