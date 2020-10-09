// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.generated.ManagedDeviceRemoteAction;
import com.microsoft.graph.models.extensions.BulkManagedDeviceActionResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Execute Action Body.
 */
public class ManagedDeviceExecuteActionBody {

    /**
     * The action Name.
     * 
     */
    @SerializedName(value = "actionName", alternate = {"ActionName"})
    @Expose
    public ManagedDeviceRemoteAction actionName;

    /**
     * The keep Enrollment Data.
     * 
     */
    @SerializedName(value = "keepEnrollmentData", alternate = {"KeepEnrollmentData"})
    @Expose
    public Boolean keepEnrollmentData;

    /**
     * The keep User Data.
     * 
     */
    @SerializedName(value = "keepUserData", alternate = {"KeepUserData"})
    @Expose
    public Boolean keepUserData;

    /**
     * The device Ids.
     * 
     */
    @SerializedName(value = "deviceIds", alternate = {"DeviceIds"})
    @Expose
    public java.util.List<String> deviceIds;

    /**
     * The notification Title.
     * 
     */
    @SerializedName(value = "notificationTitle", alternate = {"NotificationTitle"})
    @Expose
    public String notificationTitle;

    /**
     * The notification Body.
     * 
     */
    @SerializedName(value = "notificationBody", alternate = {"NotificationBody"})
    @Expose
    public String notificationBody;

    /**
     * The device Name.
     * 
     */
    @SerializedName(value = "deviceName", alternate = {"DeviceName"})
    @Expose
    public String deviceName;


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
