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
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.AccessPackageResourceRoleCollectionPage;
import com.microsoft.graph.requests.AccessPackageResourceCollectionPage;
import com.microsoft.graph.requests.AccessPackageResourceScopeCollectionPage;
import com.microsoft.graph.requests.AccessPackageCollectionPage;


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
     * 
     */
    @SerializedName(value = "catalogStatus", alternate = {"CatalogStatus"})
    @Expose
	@Nullable
    public String catalogStatus;

    /**
     * The Catalog Type.
     * 
     */
    @SerializedName(value = "catalogType", alternate = {"CatalogType"})
    @Expose
	@Nullable
    public String catalogType;

    /**
     * The Created By.
     * 
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
	@Nullable
    public String createdBy;

    /**
     * The Created Date Time.
     * 
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Description.
     * 
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Is Externally Visible.
     * 
     */
    @SerializedName(value = "isExternallyVisible", alternate = {"IsExternallyVisible"})
    @Expose
	@Nullable
    public Boolean isExternallyVisible;

    /**
     * The Modified By.
     * 
     */
    @SerializedName(value = "modifiedBy", alternate = {"ModifiedBy"})
    @Expose
	@Nullable
    public String modifiedBy;

    /**
     * The Modified Date Time.
     * 
     */
    @SerializedName(value = "modifiedDateTime", alternate = {"ModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime modifiedDateTime;

    /**
     * The Access Package Resource Roles.
     * 
     */
    @SerializedName(value = "accessPackageResourceRoles", alternate = {"AccessPackageResourceRoles"})
    @Expose
	@Nullable
    public AccessPackageResourceRoleCollectionPage accessPackageResourceRoles;

    /**
     * The Access Package Resources.
     * 
     */
    @SerializedName(value = "accessPackageResources", alternate = {"AccessPackageResources"})
    @Expose
	@Nullable
    public AccessPackageResourceCollectionPage accessPackageResources;

    /**
     * The Access Package Resource Scopes.
     * 
     */
    @SerializedName(value = "accessPackageResourceScopes", alternate = {"AccessPackageResourceScopes"})
    @Expose
	@Nullable
    public AccessPackageResourceScopeCollectionPage accessPackageResourceScopes;

    /**
     * The Access Packages.
     * 
     */
    @SerializedName(value = "accessPackages", alternate = {"AccessPackages"})
    @Expose
	@Nullable
    public AccessPackageCollectionPage accessPackages;


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
    }
}
