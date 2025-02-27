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
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.models.ScopedRoleMembership;
import com.microsoft.graph.models.Extension;
import com.microsoft.graph.requests.DirectoryObjectCollectionPage;
import com.microsoft.graph.requests.ScopedRoleMembershipCollectionPage;
import com.microsoft.graph.requests.ExtensionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Administrative Unit.
 */
public class AdministrativeUnit extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Description.
     * An optional description for the administrative unit. Supports $filter (eq, ne, in, startsWith), $search.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * Display name for the administrative unit. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderBy.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Is Member Management Restricted.
     * 
     */
    @SerializedName(value = "isMemberManagementRestricted", alternate = {"IsMemberManagementRestricted"})
    @Expose
	@Nullable
    public Boolean isMemberManagementRestricted;

    /**
     * The Visibility.
     * Controls whether the administrative unit and its members are hidden or public. Can be set to HiddenMembership. If not set (value is null), the default behavior is public. When set to HiddenMembership, only members of the administrative unit can list other members of the administrative unit.
     */
    @SerializedName(value = "visibility", alternate = {"Visibility"})
    @Expose
	@Nullable
    public String visibility;

    /**
     * The Members.
     * Users and groups that are members of this administrative unit. Supports $expand.
     */
	@Nullable
    public DirectoryObjectCollectionPage members;

    /**
     * The Scoped Role Members.
     * Scoped-role members of this administrative unit.
     */
    @SerializedName(value = "scopedRoleMembers", alternate = {"ScopedRoleMembers"})
    @Expose
	@Nullable
    public ScopedRoleMembershipCollectionPage scopedRoleMembers;

    /**
     * The Extensions.
     * The collection of open extensions defined for this administrative unit. Nullable.
     */
    @SerializedName(value = "extensions", alternate = {"Extensions"})
    @Expose
	@Nullable
    public ExtensionCollectionPage extensions;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("members")) {
            members = serializer.deserializeObject(json.get("members"), DirectoryObjectCollectionPage.class);
        }

        if (json.has("scopedRoleMembers")) {
            scopedRoleMembers = serializer.deserializeObject(json.get("scopedRoleMembers"), ScopedRoleMembershipCollectionPage.class);
        }

        if (json.has("extensions")) {
            extensions = serializer.deserializeObject(json.get("extensions"), ExtensionCollectionPage.class);
        }
    }
}
