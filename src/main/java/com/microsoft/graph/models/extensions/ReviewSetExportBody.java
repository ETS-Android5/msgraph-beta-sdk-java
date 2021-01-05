// Template Source: BaseMethodBody.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.generated.ExportOptions;
import com.microsoft.graph.models.generated.ExportFileStructure;
import java.util.EnumSet;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Review Set Export Body.
 */
public class ReviewSetExportBody {

    /**
     * The output Name.
     * 
     */
    @SerializedName(value = "outputName", alternate = {"OutputName"})
    @Expose
    public String outputName;

    /**
     * The description.
     * 
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The azure Blob Container.
     * 
     */
    @SerializedName(value = "azureBlobContainer", alternate = {"AzureBlobContainer"})
    @Expose
    public String azureBlobContainer;

    /**
     * The azure Blob Token.
     * 
     */
    @SerializedName(value = "azureBlobToken", alternate = {"AzureBlobToken"})
    @Expose
    public String azureBlobToken;

    /**
     * The export Options.
     * 
     */
    @SerializedName(value = "exportOptions", alternate = {"ExportOptions"})
    @Expose
    public EnumSet<ExportOptions> exportOptions;

    /**
     * The export Structure.
     * 
     */
    @SerializedName(value = "exportStructure", alternate = {"ExportStructure"})
    @Expose
    public ExportFileStructure exportStructure;


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
