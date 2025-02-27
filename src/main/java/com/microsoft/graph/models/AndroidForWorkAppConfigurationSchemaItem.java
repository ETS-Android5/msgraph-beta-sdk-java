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
import com.microsoft.graph.models.AndroidForWorkAppConfigurationSchemaItemDataType;
import com.microsoft.graph.models.KeyValuePair;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work App Configuration Schema Item.
 */
public class AndroidForWorkAppConfigurationSchemaItem implements IJsonBackedObject {

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
     * The Data Type.
     * The type of value this item describes. Possible values are: bool, integer, string, choice, multiselect, bundle, bundleArray, hidden.
     */
    @SerializedName(value = "dataType", alternate = {"DataType"})
    @Expose
	@Nullable
    public AndroidForWorkAppConfigurationSchemaItemDataType dataType;

    /**
     * The Default Bool Value.
     * Default value for boolean type items, if specified by the app developer
     */
    @SerializedName(value = "defaultBoolValue", alternate = {"DefaultBoolValue"})
    @Expose
	@Nullable
    public Boolean defaultBoolValue;

    /**
     * The Default Int Value.
     * Default value for integer type items, if specified by the app developer
     */
    @SerializedName(value = "defaultIntValue", alternate = {"DefaultIntValue"})
    @Expose
	@Nullable
    public Integer defaultIntValue;

    /**
     * The Default String Array Value.
     * Default value for string array type items, if specified by the app developer
     */
    @SerializedName(value = "defaultStringArrayValue", alternate = {"DefaultStringArrayValue"})
    @Expose
	@Nullable
    public java.util.List<String> defaultStringArrayValue;

    /**
     * The Default String Value.
     * Default value for string type items, if specified by the app developer
     */
    @SerializedName(value = "defaultStringValue", alternate = {"DefaultStringValue"})
    @Expose
	@Nullable
    public String defaultStringValue;

    /**
     * The Description.
     * Description of what the item controls within the application
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * Human readable name
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Schema Item Key.
     * Unique key the application uses to identify the item
     */
    @SerializedName(value = "schemaItemKey", alternate = {"SchemaItemKey"})
    @Expose
	@Nullable
    public String schemaItemKey;

    /**
     * The Selections.
     * List of human readable name/value pairs for the valid values that can be set for this item (Choice and Multiselect items only)
     */
    @SerializedName(value = "selections", alternate = {"Selections"})
    @Expose
	@Nullable
    public java.util.List<KeyValuePair> selections;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
