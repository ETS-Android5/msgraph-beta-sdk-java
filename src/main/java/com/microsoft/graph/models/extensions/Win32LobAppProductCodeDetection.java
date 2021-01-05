// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.Win32LobAppDetectionOperator;
import com.microsoft.graph.models.extensions.Win32LobAppDetection;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Win32Lob App Product Code Detection.
 */
public class Win32LobAppProductCodeDetection extends Win32LobAppDetection implements IJsonBackedObject {


    /**
     * The Product Code.
     * The product code of Win32 Line of Business (LoB) app.
     */
    @SerializedName(value = "productCode", alternate = {"ProductCode"})
    @Expose
    public String productCode;

    /**
     * The Product Version.
     * The product version of Win32 Line of Business (LoB) app.
     */
    @SerializedName(value = "productVersion", alternate = {"ProductVersion"})
    @Expose
    public String productVersion;

    /**
     * The Product Version Operator.
     * The operator to detect product version.
     */
    @SerializedName(value = "productVersionOperator", alternate = {"ProductVersionOperator"})
    @Expose
    public EnumSet<Win32LobAppDetectionOperator> productVersionOperator;


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
