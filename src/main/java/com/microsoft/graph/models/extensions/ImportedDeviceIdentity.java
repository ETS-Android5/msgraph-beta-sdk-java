// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ImportedDeviceIdentityType;
import com.microsoft.graph.models.generated.EnrollmentState;
import com.microsoft.graph.models.generated.Platform;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Imported Device Identity.
 */
public class ImportedDeviceIdentity extends Entity implements IJsonBackedObject {


    /**
     * The Imported Device Identifier.
     * Imported Device Identifier
     */
    @SerializedName("importedDeviceIdentifier")
    @Expose
    public String importedDeviceIdentifier;

    /**
     * The Imported Device Identity Type.
     * Type of Imported Device Identity
     */
    @SerializedName("importedDeviceIdentityType")
    @Expose
    public ImportedDeviceIdentityType importedDeviceIdentityType;

    /**
     * The Last Modified Date Time.
     * Last Modified DateTime of the description
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Created Date Time.
     * Created Date Time of the device
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Last Contacted Date Time.
     * Last Contacted Date Time of the device
     */
    @SerializedName("lastContactedDateTime")
    @Expose
    public java.util.Calendar lastContactedDateTime;

    /**
     * The Description.
     * The description of the device
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Enrollment State.
     * The state of the device in Intune
     */
    @SerializedName("enrollmentState")
    @Expose
    public EnrollmentState enrollmentState;

    /**
     * The Platform.
     * The platform of the Device.
     */
    @SerializedName("platform")
    @Expose
    public Platform platform;


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
