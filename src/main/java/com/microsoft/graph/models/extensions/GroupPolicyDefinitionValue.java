// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.GroupPolicyConfigurationType;
import com.microsoft.graph.models.extensions.GroupPolicyDefinition;
import com.microsoft.graph.models.extensions.GroupPolicyPresentationValue;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.GroupPolicyPresentationValueCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

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
    public GroupPolicyConfigurationType configurationType;

    /**
     * The Created Date Time.
     * The date and time the object was created.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Enabled.
     * Enables or disables the associated group policy definition.
     */
    @SerializedName(value = "enabled", alternate = {"Enabled"})
    @Expose
    public Boolean enabled;

    /**
     * The Last Modified Date Time.
     * The date and time the entity was last modified.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Definition.
     * The associated group policy definition with the value.
     */
    @SerializedName(value = "definition", alternate = {"Definition"})
    @Expose
    public GroupPolicyDefinition definition;

    /**
     * The Presentation Values.
     * The associated group policy presentation values with the definition value.
     */
    @SerializedName(value = "presentationValues", alternate = {"PresentationValues"})
    @Expose
    public GroupPolicyPresentationValueCollectionPage presentationValues;


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


        if (json.has("presentationValues")) {
            presentationValues = serializer.deserializeObject(json.get("presentationValues").toString(), GroupPolicyPresentationValueCollectionPage.class);
        }
    }
}
