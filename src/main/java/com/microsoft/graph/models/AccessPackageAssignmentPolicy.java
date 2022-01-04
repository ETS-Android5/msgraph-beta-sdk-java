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
import com.microsoft.graph.models.AssignmentReviewSettings;
import com.microsoft.graph.models.AccessPackageQuestion;
import com.microsoft.graph.models.ApprovalSettings;
import com.microsoft.graph.models.RequestorSettings;
import com.microsoft.graph.models.AccessPackage;
import com.microsoft.graph.models.AccessPackageCatalog;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment Policy.
 */
public class AccessPackageAssignmentPolicy extends Entity implements IJsonBackedObject {


    /**
     * The Access Package Id.
     * Identifier of the access package.
     */
    @SerializedName(value = "accessPackageId", alternate = {"AccessPackageId"})
    @Expose
	@Nullable
    public String accessPackageId;

    /**
     * The Access Review Settings.
     * Who must review, and how often, the assignments to the access package from this policy. This property is null if reviews are not required.
     */
    @SerializedName(value = "accessReviewSettings", alternate = {"AccessReviewSettings"})
    @Expose
	@Nullable
    public AssignmentReviewSettings accessReviewSettings;

    /**
     * The Can Extend.
     * Indicates whether a user can extend the access package assignment duration after approval.
     */
    @SerializedName(value = "canExtend", alternate = {"CanExtend"})
    @Expose
	@Nullable
    public Boolean canExtend;

    /**
     * The Created By.
     * Read-only.
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
	@Nullable
    public String createdBy;

    /**
     * The Created Date Time.
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Description.
     * The description of the policy.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * The display name of the policy. Supports $filter (eq).
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Duration In Days.
     * The number of days in which assignments from this policy last until they are expired.
     */
    @SerializedName(value = "durationInDays", alternate = {"DurationInDays"})
    @Expose
	@Nullable
    public Integer durationInDays;

    /**
     * The Expiration Date Time.
     * The expiration date for assignments created in this policy. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    @SerializedName(value = "expirationDateTime", alternate = {"ExpirationDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime expirationDateTime;

    /**
     * The Modified By.
     * Read-only.
     */
    @SerializedName(value = "modifiedBy", alternate = {"ModifiedBy"})
    @Expose
	@Nullable
    public String modifiedBy;

    /**
     * The Modified Date Time.
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    @SerializedName(value = "modifiedDateTime", alternate = {"ModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime modifiedDateTime;

    /**
     * The Questions.
     * Questions that are posed to the  requestor.
     */
    @SerializedName(value = "questions", alternate = {"Questions"})
    @Expose
	@Nullable
    public java.util.List<AccessPackageQuestion> questions;

    /**
     * The Request Approval Settings.
     * Who must approve requests for access package in this policy.
     */
    @SerializedName(value = "requestApprovalSettings", alternate = {"RequestApprovalSettings"})
    @Expose
	@Nullable
    public ApprovalSettings requestApprovalSettings;

    /**
     * The Requestor Settings.
     * Who can request this access package from this policy.
     */
    @SerializedName(value = "requestorSettings", alternate = {"RequestorSettings"})
    @Expose
	@Nullable
    public RequestorSettings requestorSettings;

    /**
     * The Access Package.
     * The access package with this policy. Read-only. Nullable. Supports $expand.
     */
    @SerializedName(value = "accessPackage", alternate = {"AccessPackage"})
    @Expose
	@Nullable
    public AccessPackage accessPackage;

    /**
     * The Access Package Catalog.
     * 
     */
    @SerializedName(value = "accessPackageCatalog", alternate = {"AccessPackageCatalog"})
    @Expose
	@Nullable
    public AccessPackageCatalog accessPackageCatalog;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
