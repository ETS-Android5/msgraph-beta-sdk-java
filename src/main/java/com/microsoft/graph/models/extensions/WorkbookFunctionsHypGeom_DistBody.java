// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Hyp Geom_Dist Body.
 */
public class WorkbookFunctionsHypGeom_DistBody {

    /**
     * The sample S.
     * 
     */
    @SerializedName(value = "sampleS", alternate = {"SampleS"})
    @Expose
    public com.google.gson.JsonElement sampleS;

    /**
     * The number Sample.
     * 
     */
    @SerializedName(value = "numberSample", alternate = {"NumberSample"})
    @Expose
    public com.google.gson.JsonElement numberSample;

    /**
     * The population S.
     * 
     */
    @SerializedName(value = "populationS", alternate = {"PopulationS"})
    @Expose
    public com.google.gson.JsonElement populationS;

    /**
     * The number Pop.
     * 
     */
    @SerializedName(value = "numberPop", alternate = {"NumberPop"})
    @Expose
    public com.google.gson.JsonElement numberPop;

    /**
     * The cumulative.
     * 
     */
    @SerializedName(value = "cumulative", alternate = {"Cumulative"})
    @Expose
    public com.google.gson.JsonElement cumulative;


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
