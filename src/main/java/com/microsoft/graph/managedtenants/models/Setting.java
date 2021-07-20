// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.managedtenants.models.ManagementParameterValueType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Setting.
 */
public class Setting implements IJsonBackedObject {

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
     * The Display Name.
     * The display name for the setting. Required. Read-only.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Json Value.
     * The value for the setting serialized as string of JSON. Required. Read-only.
     */
    @SerializedName(value = "jsonValue", alternate = {"JsonValue"})
    @Expose
	@Nullable
    public String jsonValue;

    /**
     * The Overwrite Allowed.
     * A flag indicating whether the setting can be override existing configurations when applied. Required. Read-only.
     */
    @SerializedName(value = "overwriteAllowed", alternate = {"OverwriteAllowed"})
    @Expose
	@Nullable
    public Boolean overwriteAllowed;

    /**
     * The Value Type.
     * The data type for the setting. Possible values are: string, integer, boolean, guid, stringCollection, integerCollection, booleanCollection, guidCollection, unknownFutureValue. Required. Read-only.
     */
    @SerializedName(value = "valueType", alternate = {"ValueType"})
    @Expose
	@Nullable
    public ManagementParameterValueType valueType;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
