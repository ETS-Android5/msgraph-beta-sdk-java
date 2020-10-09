// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AccessPackageResourceAttribute;
import com.microsoft.graph.models.extensions.AccessPackageResourceRole;
import com.microsoft.graph.models.extensions.AccessPackageResourceScope;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRoleCollectionPage;
import com.microsoft.graph.requests.extensions.AccessPackageResourceScopeCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Resource.
 */
public class AccessPackageResource extends Entity implements IJsonBackedObject {


    /**
     * The Added By.
     * 
     */
    @SerializedName(value = "addedBy", alternate = {"AddedBy"})
    @Expose
    public String addedBy;

    /**
     * The Added On.
     * 
     */
    @SerializedName(value = "addedOn", alternate = {"AddedOn"})
    @Expose
    public java.util.Calendar addedOn;

    /**
     * The Attributes.
     * 
     */
    @SerializedName(value = "attributes", alternate = {"Attributes"})
    @Expose
    public java.util.List<AccessPackageResourceAttribute> attributes;

    /**
     * The Description.
     * 
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Is Pending Onboarding.
     * 
     */
    @SerializedName(value = "isPendingOnboarding", alternate = {"IsPendingOnboarding"})
    @Expose
    public Boolean isPendingOnboarding;

    /**
     * The Origin Id.
     * 
     */
    @SerializedName(value = "originId", alternate = {"OriginId"})
    @Expose
    public String originId;

    /**
     * The Origin System.
     * 
     */
    @SerializedName(value = "originSystem", alternate = {"OriginSystem"})
    @Expose
    public String originSystem;

    /**
     * The Resource Type.
     * 
     */
    @SerializedName(value = "resourceType", alternate = {"ResourceType"})
    @Expose
    public String resourceType;

    /**
     * The Url.
     * 
     */
    @SerializedName(value = "url", alternate = {"Url"})
    @Expose
    public String url;

    /**
     * The Access Package Resource Roles.
     * 
     */
    @SerializedName(value = "accessPackageResourceRoles", alternate = {"AccessPackageResourceRoles"})
    @Expose
    public AccessPackageResourceRoleCollectionPage accessPackageResourceRoles;

    /**
     * The Access Package Resource Scopes.
     * 
     */
    @SerializedName(value = "accessPackageResourceScopes", alternate = {"AccessPackageResourceScopes"})
    @Expose
    public AccessPackageResourceScopeCollectionPage accessPackageResourceScopes;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("accessPackageResourceRoles")) {
            accessPackageResourceRoles = serializer.deserializeObject(json.get("accessPackageResourceRoles").toString(), AccessPackageResourceRoleCollectionPage.class);
        }

        if (json.has("accessPackageResourceScopes")) {
            accessPackageResourceScopes = serializer.deserializeObject(json.get("accessPackageResourceScopes").toString(), AccessPackageResourceScopeCollectionPage.class);
        }
    }
}
