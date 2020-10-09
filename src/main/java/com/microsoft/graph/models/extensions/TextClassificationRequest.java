// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.SensitiveTypeScope;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Text Classification Request.
 */
public class TextClassificationRequest extends Entity implements IJsonBackedObject {


    /**
     * The File Extension.
     * 
     */
    @SerializedName(value = "fileExtension", alternate = {"FileExtension"})
    @Expose
    public String fileExtension;

    /**
     * The Scopes To Run.
     * 
     */
    @SerializedName(value = "scopesToRun", alternate = {"ScopesToRun"})
    @Expose
    public EnumSet<SensitiveTypeScope> scopesToRun;

    /**
     * The Sensitive Type Ids.
     * 
     */
    @SerializedName(value = "sensitiveTypeIds", alternate = {"SensitiveTypeIds"})
    @Expose
    public java.util.List<String> sensitiveTypeIds;

    /**
     * The Text.
     * 
     */
    @SerializedName(value = "text", alternate = {"Text"})
    @Expose
    public String text;


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
