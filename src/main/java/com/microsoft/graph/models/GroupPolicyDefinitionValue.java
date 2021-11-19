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
import com.microsoft.graph.models.GroupPolicyConfigurationType;
import com.microsoft.graph.models.GroupPolicyDefinition;
import com.microsoft.graph.models.GroupPolicyPresentationValue;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.GroupPolicyPresentationValueCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Definition Value.
 */
public class GroupPolicyDefinitionValue extends Entity implements IJsonBackedObject {


    /**
     * The Configuration Type.
     * Specifies how the value should be configured. This can be either as a Policy or as a Preference.
     */
    @SerializedName(value = "configurationType", alternate = {"ConfigurationType"})
    @Expose
	@Nullable
    public GroupPolicyConfigurationType configurationType;

    /**
     * The Created Date Time.
     * The date and time the object was created.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Enabled.
     * Enables or disables the associated group policy definition.
     */
    @SerializedName(value = "enabled", alternate = {"Enabled"})
    @Expose
	@Nullable
    public Boolean enabled;

    /**
     * The Last Modified Date Time.
     * The date and time the entity was last modified.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Definition.
     * The associated group policy definition with the value.
     */
    @SerializedName(value = "definition", alternate = {"Definition"})
    @Expose
	@Nullable
    public GroupPolicyDefinition definition;

    /**
     * The Presentation Values.
     * The associated group policy presentation values with the definition value.
     */
    @SerializedName(value = "presentationValues", alternate = {"PresentationValues"})
    @Expose
	@Nullable
    public GroupPolicyPresentationValueCollectionPage presentationValues;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("presentationValues")) {
            presentationValues = serializer.deserializeObject(json.get("presentationValues"), GroupPolicyPresentationValueCollectionPage.class);
        }
    }
}
