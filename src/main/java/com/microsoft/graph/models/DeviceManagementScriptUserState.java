// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.DeviceManagementScriptDeviceState;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.DeviceManagementScriptDeviceStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Script User State.
 */
public class DeviceManagementScriptUserState extends Entity implements IJsonBackedObject {


    /**
     * The Error Device Count.
     * Error device count for specific user.
     */
    @SerializedName(value = "errorDeviceCount", alternate = {"ErrorDeviceCount"})
    @Expose
	@Nullable
    public Integer errorDeviceCount;

    /**
     * The Success Device Count.
     * Success device count for specific user.
     */
    @SerializedName(value = "successDeviceCount", alternate = {"SuccessDeviceCount"})
    @Expose
	@Nullable
    public Integer successDeviceCount;

    /**
     * The User Principal Name.
     * User principle name of specific user.
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
	@Nullable
    public String userPrincipalName;

    /**
     * The Device Run States.
     * List of run states for this script across all devices of specific user.
     */
    @SerializedName(value = "deviceRunStates", alternate = {"DeviceRunStates"})
    @Expose
	@Nullable
    public DeviceManagementScriptDeviceStateCollectionPage deviceRunStates;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("deviceRunStates")) {
            deviceRunStates = serializer.deserializeObject(json.get("deviceRunStates"), DeviceManagementScriptDeviceStateCollectionPage.class);
        }
    }
}
