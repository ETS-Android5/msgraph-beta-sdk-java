// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Image Info.
 */
public class ImageInfo implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Add Image Query.
     * Optional; parameter used to indicate the server is able to render image dynamically in response to parameterization. For example – a high contrast image
     */
    @SerializedName(value = "addImageQuery", alternate = {"AddImageQuery"})
    @Expose
    public Boolean addImageQuery;

    /**
     * The Alternate Text.
     * Optional; alt-text accessible content for the image
     */
    @SerializedName(value = "alternateText", alternate = {"AlternateText"})
    @Expose
    public String alternateText;

    /**
     * The Alternative Text.
     * 
     */
    @SerializedName(value = "alternativeText", alternate = {"AlternativeText"})
    @Expose
    public String alternativeText;

    /**
     * The Icon Url.
     * Optional; URI that points to an icon which represents the application used to generate the activity
     */
    @SerializedName(value = "iconUrl", alternate = {"IconUrl"})
    @Expose
    public String iconUrl;


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
