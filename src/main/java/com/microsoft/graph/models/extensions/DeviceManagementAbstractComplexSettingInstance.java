// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DeviceManagementSettingInstance;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingInstanceCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Abstract Complex Setting Instance.
 */
public class DeviceManagementAbstractComplexSettingInstance extends DeviceManagementSettingInstance implements IJsonBackedObject {


    /**
     * The Implementation Id.
     * The definition ID for the chosen implementation of this complex setting
     */
    @SerializedName(value = "implementationId", alternate = {"ImplementationId"})
    @Expose
    public String implementationId;

    /**
     * The Value.
     * The values that make up the complex setting
     */
    @SerializedName(value = "value", alternate = {"Value"})
    @Expose
    public DeviceManagementSettingInstanceCollectionPage value;


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


        if (json.has("value")) {
            value = serializer.deserializeObject(json.get("value").toString(), DeviceManagementSettingInstanceCollectionPage.class);
        }
    }
}
