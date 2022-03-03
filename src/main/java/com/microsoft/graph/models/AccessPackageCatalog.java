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
import com.microsoft.graph.models.AccessPackageResourceRole;
import com.microsoft.graph.models.AccessPackageResource;
import com.microsoft.graph.models.AccessPackageResourceScope;
import com.microsoft.graph.models.AccessPackage;
import com.microsoft.graph.models.CustomAccessPackageWorkflowExtension;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.AccessPackageResourceRoleCollectionPage;
import com.microsoft.graph.requests.AccessPackageResourceCollectionPage;
import com.microsoft.graph.requests.AccessPackageResourceScopeCollectionPage;
import com.microsoft.graph.requests.AccessPackageCollectionPage;
import com.microsoft.graph.requests.CustomAccessPackageWorkflowExtensionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Catalog.
 */
public class AccessPackageCatalog extends Entity implements IJsonBackedObject {


    /**
     * The Catalog Status.
     * Has the value Published if the access packages are available for management.
     */
    @SerializedName(value = "catalogStatus", alternate = {"CatalogStatus"})
    @Expose
	@Nullable
    public String catalogStatus;

    /**
     * The Catalog Type.
     * Whether the catalog is created by a user or entitlement management. The possible values are: userManaged, serviceDefault, serviceManaged, unknownFutureValue.
     */
    @SerializedName(value = "catalogType", alternate = {"CatalogType"})
    @Expose
	@Nullable
    public String catalogType;

    /**
     * The Created By.
     * UPN of the user who created this resource. Read-only.
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
	@Nullable
    public String createdBy;

    /**
     * The Created Date Time.
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Description.
     * The description of the access package catalog.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * The display name of the access package catalog.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Is Externally Visible.
     * Whether the access packages in this catalog can be requested by users outside of the tenant.
     */
    @SerializedName(value = "isExternallyVisible", alternate = {"IsExternallyVisible"})
    @Expose
	@Nullable
    public Boolean isExternallyVisible;

    /**
     * The Modified By.
     * The UPN of the user who last modified this resource. Read-only.
     */
    @SerializedName(value = "modifiedBy", alternate = {"ModifiedBy"})
    @Expose
	@Nullable
    public String modifiedBy;

    /**
     * The Modified Date Time.
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    @SerializedName(value = "modifiedDateTime", alternate = {"ModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime modifiedDateTime;

    /**
     * The Access Package Resource Roles.
     * The roles in each resource in a catalog. Read-only.
     */
    @SerializedName(value = "accessPackageResourceRoles", alternate = {"AccessPackageResourceRoles"})
    @Expose
	@Nullable
    public AccessPackageResourceRoleCollectionPage accessPackageResourceRoles;

    /**
     * The Access Package Resources.
     * Read-only. Nullable.
     */
    @SerializedName(value = "accessPackageResources", alternate = {"AccessPackageResources"})
    @Expose
	@Nullable
    public AccessPackageResourceCollectionPage accessPackageResources;

    /**
     * The Access Package Resource Scopes.
     * Read-only.
     */
    @SerializedName(value = "accessPackageResourceScopes", alternate = {"AccessPackageResourceScopes"})
    @Expose
	@Nullable
    public AccessPackageResourceScopeCollectionPage accessPackageResourceScopes;

    /**
     * The Access Packages.
     * The access packages in this catalog. Read-only. Nullable.
     */
    @SerializedName(value = "accessPackages", alternate = {"AccessPackages"})
    @Expose
	@Nullable
    public AccessPackageCollectionPage accessPackages;

    /**
     * The Custom Access Package Workflow Extensions.
     * 
     */
    @SerializedName(value = "customAccessPackageWorkflowExtensions", alternate = {"CustomAccessPackageWorkflowExtensions"})
    @Expose
	@Nullable
    public CustomAccessPackageWorkflowExtensionCollectionPage customAccessPackageWorkflowExtensions;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("accessPackageResourceRoles")) {
            accessPackageResourceRoles = serializer.deserializeObject(json.get("accessPackageResourceRoles"), AccessPackageResourceRoleCollectionPage.class);
        }

        if (json.has("accessPackageResources")) {
            accessPackageResources = serializer.deserializeObject(json.get("accessPackageResources"), AccessPackageResourceCollectionPage.class);
        }

        if (json.has("accessPackageResourceScopes")) {
            accessPackageResourceScopes = serializer.deserializeObject(json.get("accessPackageResourceScopes"), AccessPackageResourceScopeCollectionPage.class);
        }

        if (json.has("accessPackages")) {
            accessPackages = serializer.deserializeObject(json.get("accessPackages"), AccessPackageCollectionPage.class);
        }

        if (json.has("customAccessPackageWorkflowExtensions")) {
            customAccessPackageWorkflowExtensions = serializer.deserializeObject(json.get("customAccessPackageWorkflowExtensions"), CustomAccessPackageWorkflowExtensionCollectionPage.class);
        }
    }
}
