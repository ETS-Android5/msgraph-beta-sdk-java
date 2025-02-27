// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.DeviceManagementConfigurationStringFormat;
import com.microsoft.graph.models.DeviceManagementConfigurationSettingValueDefinition;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Configuration String Setting Value Definition.
 */
public class DeviceManagementConfigurationStringSettingValueDefinition extends DeviceManagementConfigurationSettingValueDefinition implements IJsonBackedObject {


    /**
     * The Format.
     * Pre-defined format of the string. Possible values are: none, email, guid, ip, base64, url, version, xml, date, time, binary, regEx, json, dateTime, surfaceHub.
     */
    @SerializedName(value = "format", alternate = {"Format"})
    @Expose
	@Nullable
    public DeviceManagementConfigurationStringFormat format;

    /**
     * The Input Validation Schema.
     * Regular expression or any xml or json schema that the input string should match
     */
    @SerializedName(value = "inputValidationSchema", alternate = {"InputValidationSchema"})
    @Expose
	@Nullable
    public String inputValidationSchema;

    /**
     * The Is Secret.
     * Specifies whether the setting needs to be treated as a secret. Settings marked as yes will be encrypted in transit and at rest and will be displayed as asterisks when represented in the UX.
     */
    @SerializedName(value = "isSecret", alternate = {"IsSecret"})
    @Expose
	@Nullable
    public Boolean isSecret;

    /**
     * The Maximum Length.
     * Maximum length of string. Valid values 0 to 87516
     */
    @SerializedName(value = "maximumLength", alternate = {"MaximumLength"})
    @Expose
	@Nullable
    public Long maximumLength;

    /**
     * The Minimum Length.
     * Minimum length of string. Valid values 0 to 87516
     */
    @SerializedName(value = "minimumLength", alternate = {"MinimumLength"})
    @Expose
	@Nullable
    public Long minimumLength;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
