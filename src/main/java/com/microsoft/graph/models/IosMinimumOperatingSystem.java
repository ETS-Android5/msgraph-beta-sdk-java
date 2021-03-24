// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Minimum Operating System.
 */
public class IosMinimumOperatingSystem implements IJsonBackedObject {

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
     * The V10_0.
     * Version 10.0 or later.
     */
    @SerializedName(value = "v10_0", alternate = {"V10_0"})
    @Expose
	@Nullable
    public Boolean v10_0;

    /**
     * The V11_0.
     * Version 11.0 or later.
     */
    @SerializedName(value = "v11_0", alternate = {"V11_0"})
    @Expose
	@Nullable
    public Boolean v11_0;

    /**
     * The V12_0.
     * Version 12.0 or later.
     */
    @SerializedName(value = "v12_0", alternate = {"V12_0"})
    @Expose
	@Nullable
    public Boolean v12_0;

    /**
     * The V13_0.
     * Version 13.0 or later.
     */
    @SerializedName(value = "v13_0", alternate = {"V13_0"})
    @Expose
	@Nullable
    public Boolean v13_0;

    /**
     * The V14_0.
     * Version 14.0 or later.
     */
    @SerializedName(value = "v14_0", alternate = {"V14_0"})
    @Expose
	@Nullable
    public Boolean v14_0;

    /**
     * The V8_0.
     * Version 8.0 or later.
     */
    @SerializedName(value = "v8_0", alternate = {"V8_0"})
    @Expose
	@Nullable
    public Boolean v8_0;

    /**
     * The V9_0.
     * Version 9.0 or later.
     */
    @SerializedName(value = "v9_0", alternate = {"V9_0"})
    @Expose
	@Nullable
    public Boolean v9_0;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
