// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.DeviceEnrollmentPlatformRestriction;
import com.microsoft.graph.models.EnrollmentRestrictionPlatformType;
import com.microsoft.graph.models.DeviceEnrollmentConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Enrollment Platform Restriction Configuration.
 */
public class DeviceEnrollmentPlatformRestrictionConfiguration extends DeviceEnrollmentConfiguration implements IJsonBackedObject {


    /**
     * The Platform Restriction.
     * Restrictions based on platform, platform operating system version, and device ownership
     */
    @SerializedName(value = "platformRestriction", alternate = {"PlatformRestriction"})
    @Expose
	@Nullable
    public DeviceEnrollmentPlatformRestriction platformRestriction;

    /**
     * The Platform Type.
     * Type of platform for which this restriction applies. Possible values are: allPlatforms, ios, windows, windowsPhone, android, androidForWork, mac.
     */
    @SerializedName(value = "platformType", alternate = {"PlatformType"})
    @Expose
	@Nullable
    public EnrollmentRestrictionPlatformType platformType;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
