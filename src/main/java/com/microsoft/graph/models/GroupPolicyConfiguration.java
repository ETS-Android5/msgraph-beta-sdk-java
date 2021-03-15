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
import com.microsoft.graph.models.GroupPolicyConfigurationAssignment;
import com.microsoft.graph.models.GroupPolicyDefinitionValue;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.GroupPolicyConfigurationAssignmentCollectionPage;
import com.microsoft.graph.requests.GroupPolicyDefinitionValueCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Configuration.
 */
public class GroupPolicyConfiguration extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * The date and time the object was created.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Description.
     * User provided description for the resource object.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * User provided name for the resource object.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Last Modified Date Time.
     * The date and time the entity was last modified.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Role Scope Tag Ids.
     * The list of scope tags for the configuration.
     */
    @SerializedName(value = "roleScopeTagIds", alternate = {"RoleScopeTagIds"})
    @Expose
	@Nullable
    public java.util.List<String> roleScopeTagIds;

    /**
     * The Assignments.
     * The list of group assignments for the configuration.
     */
    @SerializedName(value = "assignments", alternate = {"Assignments"})
    @Expose
	@Nullable
    public GroupPolicyConfigurationAssignmentCollectionPage assignments;

    /**
     * The Definition Values.
     * The list of enabled or disabled group policy definition values for the configuration.
     */
    @SerializedName(value = "definitionValues", alternate = {"DefinitionValues"})
    @Expose
	@Nullable
    public GroupPolicyDefinitionValueCollectionPage definitionValues;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("assignments")) {
            assignments = serializer.deserializeObject(json.get("assignments"), GroupPolicyConfigurationAssignmentCollectionPage.class);
        }

        if (json.has("definitionValues")) {
            definitionValues = serializer.deserializeObject(json.get("definitionValues"), GroupPolicyDefinitionValueCollectionPage.class);
        }
    }
}
