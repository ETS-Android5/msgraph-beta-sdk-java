// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.MobileAppAssignmentSettings;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Store App Assignment Settings.
 */
public class IosStoreAppAssignmentSettings extends MobileAppAssignmentSettings implements IJsonBackedObject {


    /**
     * The Is Removable.
     * Whether or not the app can be removed by the user.
     */
    @SerializedName(value = "isRemovable", alternate = {"IsRemovable"})
    @Expose
	@Nullable
    public Boolean isRemovable;

    /**
     * The Uninstall On Device Removal.
     * Whether or not to uninstall the app when device is removed from Intune.
     */
    @SerializedName(value = "uninstallOnDeviceRemoval", alternate = {"UninstallOnDeviceRemoval"})
    @Expose
	@Nullable
    public Boolean uninstallOnDeviceRemoval;

    /**
     * The Vpn Configuration Id.
     * The VPN Configuration Id to apply for this app.
     */
    @SerializedName(value = "vpnConfigurationId", alternate = {"VpnConfigurationId"})
    @Expose
	@Nullable
    public String vpnConfigurationId;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
