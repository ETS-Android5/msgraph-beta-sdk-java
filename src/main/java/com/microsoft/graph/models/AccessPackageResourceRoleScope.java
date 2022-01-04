// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.AccessPackageResourceRole;
import com.microsoft.graph.models.AccessPackageResourceScope;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Resource Role Scope.
 */
public class AccessPackageResourceRoleScope extends Entity implements IJsonBackedObject {


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
     * The Access Package Resource Role.
     * Read-only. Nullable. Supports $expand.
     */
    @SerializedName(value = "accessPackageResourceRole", alternate = {"AccessPackageResourceRole"})
    @Expose
	@Nullable
    public AccessPackageResourceRole accessPackageResourceRole;

    /**
     * The Access Package Resource Scope.
     * Read-only. Nullable.
     */
    @SerializedName(value = "accessPackageResourceScope", alternate = {"AccessPackageResourceScope"})
    @Expose
	@Nullable
    public AccessPackageResourceScope accessPackageResourceScope;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
