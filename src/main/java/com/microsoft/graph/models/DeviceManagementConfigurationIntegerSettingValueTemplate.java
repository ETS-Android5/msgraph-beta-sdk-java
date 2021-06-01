// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.DeviceManagementConfigurationIntegerSettingValueDefaultTemplate;
import com.microsoft.graph.models.DeviceManagementConfigurationIntegerSettingValueDefinitionTemplate;
import com.microsoft.graph.models.DeviceManagementConfigurationSimpleSettingValueTemplate;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Configuration Integer Setting Value Template.
 */
public class DeviceManagementConfigurationIntegerSettingValueTemplate extends DeviceManagementConfigurationSimpleSettingValueTemplate implements IJsonBackedObject {


    /**
     * The Default Value.
     * Integer Setting Value Default Template.
     */
    @SerializedName(value = "defaultValue", alternate = {"DefaultValue"})
    @Expose
	@Nullable
    public DeviceManagementConfigurationIntegerSettingValueDefaultTemplate defaultValue;

    /**
     * The Recommended Value Definition.
     * Recommended value definition.
     */
    @SerializedName(value = "recommendedValueDefinition", alternate = {"RecommendedValueDefinition"})
    @Expose
	@Nullable
    public DeviceManagementConfigurationIntegerSettingValueDefinitionTemplate recommendedValueDefinition;

    /**
     * The Required Value Definition.
     * Required value definition.
     */
    @SerializedName(value = "requiredValueDefinition", alternate = {"RequiredValueDefinition"})
    @Expose
	@Nullable
    public DeviceManagementConfigurationIntegerSettingValueDefinitionTemplate requiredValueDefinition;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
