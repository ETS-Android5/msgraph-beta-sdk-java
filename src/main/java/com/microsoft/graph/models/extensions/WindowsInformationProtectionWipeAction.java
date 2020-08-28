// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ActionState;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Information Protection Wipe Action.
 */
public class WindowsInformationProtectionWipeAction extends Entity implements IJsonBackedObject {


    /**
     * The Status.
     * Wipe action status.
     */
    @SerializedName("status")
    @Expose
    public ActionState status;

    /**
     * The Targeted User Id.
     * The UserId being targeted by this wipe action.
     */
    @SerializedName("targetedUserId")
    @Expose
    public String targetedUserId;

    /**
     * The Targeted Device Registration Id.
     * The DeviceRegistrationId being targeted by this wipe action.
     */
    @SerializedName("targetedDeviceRegistrationId")
    @Expose
    public String targetedDeviceRegistrationId;

    /**
     * The Targeted Device Name.
     * Targeted device name.
     */
    @SerializedName("targetedDeviceName")
    @Expose
    public String targetedDeviceName;

    /**
     * The Targeted Device Mac Address.
     * Targeted device Mac address.
     */
    @SerializedName("targetedDeviceMacAddress")
    @Expose
    public String targetedDeviceMacAddress;

    /**
     * The Last Check In Date Time.
     * Last checkin time of the device that was targeted by this wipe action.
     */
    @SerializedName("lastCheckInDateTime")
    @Expose
    public java.util.Calendar lastCheckInDateTime;


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
