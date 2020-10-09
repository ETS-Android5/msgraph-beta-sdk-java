// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.ImportedDeviceIdentity;
import com.microsoft.graph.models.extensions.ImportedDeviceIdentityResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Imported Device Identity Import Device Identity List Body.
 */
public class ImportedDeviceIdentityImportDeviceIdentityListBody {

    /**
     * The imported Device Identities.
     * 
     */
    @SerializedName(value = "importedDeviceIdentities", alternate = {"ImportedDeviceIdentities"})
    @Expose
    public java.util.List<ImportedDeviceIdentity> importedDeviceIdentities;

    /**
     * The overwrite Imported Device Identities.
     * 
     */
    @SerializedName(value = "overwriteImportedDeviceIdentities", alternate = {"OverwriteImportedDeviceIdentities"})
    @Expose
    public Boolean overwriteImportedDeviceIdentities;


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
