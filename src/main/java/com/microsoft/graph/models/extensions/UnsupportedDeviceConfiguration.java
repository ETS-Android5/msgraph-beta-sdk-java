// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.UnsupportedDeviceConfigurationDetail;
import com.microsoft.graph.models.extensions.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unsupported Device Configuration.
 */
public class UnsupportedDeviceConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Details.
     * Details describing why the entity is unsupported. This collection can contain a maximum of 1000 elements.
     */
    @SerializedName(value = "details", alternate = {"Details"})
    @Expose
    public java.util.List<UnsupportedDeviceConfigurationDetail> details;

    /**
     * The Original Entity Type Name.
     * The type of entity that would be returned otherwise.
     */
    @SerializedName(value = "originalEntityTypeName", alternate = {"OriginalEntityTypeName"})
    @Expose
    public String originalEntityTypeName;


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

    }
}
