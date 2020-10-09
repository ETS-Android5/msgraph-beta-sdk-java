// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.DevicePlatformType;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device And App Management Assignment Filter.
 */
public class DeviceAndAppManagementAssignmentFilter extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * Creation time of the Assignment Filter.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Description.
     * Description of the Assignment Filter.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Display Name.
     * DisplayName of the Assignment Filter.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Last Modified Date Time.
     * Last modified time of the Assignment Filter.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Platform.
     * Platform type of the devices on which the Assignment Filter will be applicable.
     */
    @SerializedName(value = "platform", alternate = {"Platform"})
    @Expose
    public DevicePlatformType platform;

    /**
     * The Role Scope Tags.
     * RoleScopeTags of the Assignment Filter.
     */
    @SerializedName(value = "roleScopeTags", alternate = {"RoleScopeTags"})
    @Expose
    public java.util.List<String> roleScopeTags;

    /**
     * The Rule.
     * Rule definition of the Assignment Filter.
     */
    @SerializedName(value = "rule", alternate = {"Rule"})
    @Expose
    public String rule;


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
