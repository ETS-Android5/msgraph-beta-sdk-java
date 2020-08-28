// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Minimum Operating System.
 */
public class AndroidMinimumOperatingSystem implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The V4_0.
     * Version 4.0 or later.
     */
    @SerializedName("v4_0")
    @Expose
    public Boolean v4_0;

    /**
     * The V4_0_3.
     * Version 4.0.3 or later.
     */
    @SerializedName("v4_0_3")
    @Expose
    public Boolean v4_0_3;

    /**
     * The V4_1.
     * Version 4.1 or later.
     */
    @SerializedName("v4_1")
    @Expose
    public Boolean v4_1;

    /**
     * The V4_2.
     * Version 4.2 or later.
     */
    @SerializedName("v4_2")
    @Expose
    public Boolean v4_2;

    /**
     * The V4_3.
     * Version 4.3 or later.
     */
    @SerializedName("v4_3")
    @Expose
    public Boolean v4_3;

    /**
     * The V4_4.
     * Version 4.4 or later.
     */
    @SerializedName("v4_4")
    @Expose
    public Boolean v4_4;

    /**
     * The V5_0.
     * Version 5.0 or later.
     */
    @SerializedName("v5_0")
    @Expose
    public Boolean v5_0;

    /**
     * The V5_1.
     * Version 5.1 or later.
     */
    @SerializedName("v5_1")
    @Expose
    public Boolean v5_1;

    /**
     * The V6_0.
     * Version 6.0 or later.
     */
    @SerializedName("v6_0")
    @Expose
    public Boolean v6_0;

    /**
     * The V7_0.
     * Version 7.0 or later.
     */
    @SerializedName("v7_0")
    @Expose
    public Boolean v7_0;

    /**
     * The V7_1.
     * Version 7.1 or later.
     */
    @SerializedName("v7_1")
    @Expose
    public Boolean v7_1;

    /**
     * The V8_0.
     * Version 8.0 or later.
     */
    @SerializedName("v8_0")
    @Expose
    public Boolean v8_0;

    /**
     * The V8_1.
     * Version 8.1 or later.
     */
    @SerializedName("v8_1")
    @Expose
    public Boolean v8_1;

    /**
     * The V9_0.
     * Version 9.0 or later.
     */
    @SerializedName("v9_0")
    @Expose
    public Boolean v9_0;


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
