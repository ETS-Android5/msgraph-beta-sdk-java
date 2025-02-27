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
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Continuous Access Evaluation Policy.
 */
public class ContinuousAccessEvaluationPolicy extends Entity implements IJsonBackedObject {


    /**
     * The Description.
     * Continuous access evaluation automatically blocks access to resources and applications in near real time when a user's access is removed or a client IP address changes. Read-only.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * The value is always Continuous Access Evaluation. Read-only.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Groups.
     * The collection of group identifiers in scope for evaluation. All groups are in scope when the collection is empty. Read-only.
     */
    @SerializedName(value = "groups", alternate = {"Groups"})
    @Expose
	@Nullable
    public java.util.List<String> groups;

    /**
     * The Is Enabled.
     * true to indicate whether continuous access evaluation should be performed; otherwise false. Read-only.
     */
    @SerializedName(value = "isEnabled", alternate = {"IsEnabled"})
    @Expose
	@Nullable
    public Boolean isEnabled;

    /**
     * The Migrate.
     * true to indicate that the continuous access evaluation policy settings should be or has been migrated to the conditional access policy.
     */
    @SerializedName(value = "migrate", alternate = {"Migrate"})
    @Expose
	@Nullable
    public Boolean migrate;

    /**
     * The Users.
     * The collection of user identifiers in scope for evaluation. All users are in scope when the collection is empty. Read-only.
     */
    @SerializedName(value = "users", alternate = {"Users"})
    @Expose
	@Nullable
    public java.util.List<String> users;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
