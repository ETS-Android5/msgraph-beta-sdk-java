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
import com.microsoft.graph.models.PermissionType;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Permission Grant Condition Set.
 */
public class PermissionGrantConditionSet extends Entity implements IJsonBackedObject {


    /**
     * The Client Application Ids.
     * A list of appId values for the client applications to match with, or a list with the single value all to match any client application. Default is the single value all.
     */
    @SerializedName(value = "clientApplicationIds", alternate = {"ClientApplicationIds"})
    @Expose
	@Nullable
    public java.util.List<String> clientApplicationIds;

    /**
     * The Client Application Publisher Ids.
     * A list of Microsoft Partner Network (MPN) IDs for verified publishers of the client application, or a list with the single value all to match with client apps from any publisher. Default is the single value all.
     */
    @SerializedName(value = "clientApplicationPublisherIds", alternate = {"ClientApplicationPublisherIds"})
    @Expose
	@Nullable
    public java.util.List<String> clientApplicationPublisherIds;

    /**
     * The Client Applications From Verified Publisher Only.
     * Set to true to only match on client applications with a verified publisher. Set to false to match on any client app, even if it does not have a verified publisher. Default is false.
     */
    @SerializedName(value = "clientApplicationsFromVerifiedPublisherOnly", alternate = {"ClientApplicationsFromVerifiedPublisherOnly"})
    @Expose
	@Nullable
    public Boolean clientApplicationsFromVerifiedPublisherOnly;

    /**
     * The Client Application Tenant Ids.
     * A list of Azure Active Directory tenant IDs in which the client application is registered, or a list with the single value all to match with client apps registered in any tenant. Default is the single value all.
     */
    @SerializedName(value = "clientApplicationTenantIds", alternate = {"ClientApplicationTenantIds"})
    @Expose
	@Nullable
    public java.util.List<String> clientApplicationTenantIds;

    /**
     * The Permission Classification.
     * The permission classification for the permission being granted, or all to match with any permission classification (including permissions which are not classified). Default is all.
     */
    @SerializedName(value = "permissionClassification", alternate = {"PermissionClassification"})
    @Expose
	@Nullable
    public String permissionClassification;

    /**
     * The Permissions.
     * The list of id values for the specific permissions to match with, or a list with the single value all to match with any permission. The id of delegated permissions can be found in the publishedPermissionScopes property of the API's **servicePrincipal** object. The id of application permissions can be found in the appRoles property of the API's **servicePrincipal** object. The id of resource-specific application permissions can be found in the resourceSpecificApplicationPermissions property of the API's **servicePrincipal** object. Default is the single value all.
     */
    @SerializedName(value = "permissions", alternate = {"Permissions"})
    @Expose
	@Nullable
    public java.util.List<String> permissions;

    /**
     * The Permission Type.
     * The permission type of the permission being granted. Possible values: application for application permissions (e.g. app roles), or delegated for delegated permissions. The value delegatedUserConsentable indicates delegated permissions which have not been configured by the API publisher to require admin consent—this value may be used in built-in permission grant policies, but cannot be used in custom permission grant policies. Required.
     */
    @SerializedName(value = "permissionType", alternate = {"PermissionType"})
    @Expose
	@Nullable
    public PermissionType permissionType;

    /**
     * The Resource Application.
     * The appId of the resource application (e.g. the API) for which a permission is being granted, or any to match with any resource application or API. Default is any.
     */
    @SerializedName(value = "resourceApplication", alternate = {"ResourceApplication"})
    @Expose
	@Nullable
    public String resourceApplication;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
