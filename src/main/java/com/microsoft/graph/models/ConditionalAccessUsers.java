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


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conditional Access Users.
 */
public class ConditionalAccessUsers implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Exclude Groups.
     * 
     */
    @SerializedName(value = "excludeGroups", alternate = {"ExcludeGroups"})
    @Expose
	@Nullable
    public java.util.List<String> excludeGroups;

    /**
     * The Exclude Roles.
     * 
     */
    @SerializedName(value = "excludeRoles", alternate = {"ExcludeRoles"})
    @Expose
	@Nullable
    public java.util.List<String> excludeRoles;

    /**
     * The Exclude Users.
     * 
     */
    @SerializedName(value = "excludeUsers", alternate = {"ExcludeUsers"})
    @Expose
	@Nullable
    public java.util.List<String> excludeUsers;

    /**
     * The Include Groups.
     * 
     */
    @SerializedName(value = "includeGroups", alternate = {"IncludeGroups"})
    @Expose
	@Nullable
    public java.util.List<String> includeGroups;

    /**
     * The Include Roles.
     * 
     */
    @SerializedName(value = "includeRoles", alternate = {"IncludeRoles"})
    @Expose
	@Nullable
    public java.util.List<String> includeRoles;

    /**
     * The Include Users.
     * 
     */
    @SerializedName(value = "includeUsers", alternate = {"IncludeUsers"})
    @Expose
	@Nullable
    public java.util.List<String> includeUsers;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
