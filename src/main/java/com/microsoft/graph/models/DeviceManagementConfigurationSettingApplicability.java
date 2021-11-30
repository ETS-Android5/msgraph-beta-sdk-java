// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.DeviceManagementConfigurationDeviceMode;
import com.microsoft.graph.models.DeviceManagementConfigurationPlatforms;
import com.microsoft.graph.models.DeviceManagementConfigurationTechnologies;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Configuration Setting Applicability.
 */
public class DeviceManagementConfigurationSettingApplicability implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Description.
     * description of the setting
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Device Mode.
     * Device Mode that setting can be applied on. Possible values are: none, kiosk.
     */
    @SerializedName(value = "deviceMode", alternate = {"DeviceMode"})
    @Expose
	@Nullable
    public DeviceManagementConfigurationDeviceMode deviceMode;

    /**
     * The Platform.
     * Platform setting can be applied on. Possible values are: none, android, iOS, macOS, windows10X, windows10.
     */
    @SerializedName(value = "platform", alternate = {"Platform"})
    @Expose
	@Nullable
    public EnumSet<DeviceManagementConfigurationPlatforms> platform;

    /**
     * The Technologies.
     * Which technology channels this setting can be deployed through. Possible values are: none, mdm, windows10XManagement, configManager, microsoftSense, exchangeOnline, linuxMdm, unknownFutureValue.
     */
    @SerializedName(value = "technologies", alternate = {"Technologies"})
    @Expose
	@Nullable
    public EnumSet<DeviceManagementConfigurationTechnologies> technologies;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
