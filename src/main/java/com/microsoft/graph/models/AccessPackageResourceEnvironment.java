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
import com.microsoft.graph.models.ConnectionInfo;
import com.microsoft.graph.models.AccessPackageResource;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.AccessPackageResourceCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Resource Environment.
 */
public class AccessPackageResourceEnvironment extends Entity implements IJsonBackedObject {


    /**
     * The Connection Info.
     * Connection information of an environment used to connect to a resource.
     */
    @SerializedName(value = "connectionInfo", alternate = {"ConnectionInfo"})
    @Expose
	@Nullable
    public ConnectionInfo connectionInfo;

    /**
     * The Created By.
     * The display name of the user that created this object.
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
	@Nullable
    public String createdBy;

    /**
     * The Created Date Time.
     * The date and time that this object was created. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Description.
     * The description of this accessPackageResourceEnvironment object.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * The display name of this object.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Is Default Environment.
     * Determines whether this is default environment or not. It is set to true for all static origin systems, such as Azure AD groups and Azure AD Applications.
     */
    @SerializedName(value = "isDefaultEnvironment", alternate = {"IsDefaultEnvironment"})
    @Expose
	@Nullable
    public Boolean isDefaultEnvironment;

    /**
     * The Modified By.
     * The display name of the entity that last modified this object.
     */
    @SerializedName(value = "modifiedBy", alternate = {"ModifiedBy"})
    @Expose
	@Nullable
    public String modifiedBy;

    /**
     * The Modified Date Time.
     * The date and time that this object was last modified. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    @SerializedName(value = "modifiedDateTime", alternate = {"ModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime modifiedDateTime;

    /**
     * The Origin Id.
     * The unique identifier of this environment in the origin system.
     */
    @SerializedName(value = "originId", alternate = {"OriginId"})
    @Expose
	@Nullable
    public String originId;

    /**
     * The Origin System.
     * The type of the resource in the origin system such as SharePointOnline. Supports $filter.
     */
    @SerializedName(value = "originSystem", alternate = {"OriginSystem"})
    @Expose
	@Nullable
    public String originSystem;

    /**
     * The Access Package Resources.
     * Read-only. Required.
     */
	@Nullable
    public AccessPackageResourceCollectionPage accessPackageResources;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("accessPackageResources")) {
            accessPackageResources = serializer.deserializeObject(json.get("accessPackageResources"), AccessPackageResourceCollectionPage.class);
        }
    }
}
