// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.EnrollmentNotificationBrandingOptions;
import com.microsoft.graph.models.EnrollmentRestrictionPlatformType;
import com.microsoft.graph.models.EnrollmentNotificationTemplateType;
import com.microsoft.graph.models.DeviceEnrollmentConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Enrollment Notification Configuration.
 */
public class DeviceEnrollmentNotificationConfiguration extends DeviceEnrollmentConfiguration implements IJsonBackedObject {


    /**
     * The Branding Options.
     * Branding Options for the Enrollment Notification. Possible values are: none, includeCompanyLogo, includeCompanyName, includeContactInformation, includeCompanyPortalLink, includeDeviceDetails.
     */
    @SerializedName(value = "brandingOptions", alternate = {"BrandingOptions"})
    @Expose
	@Nullable
    public EnumSet<EnrollmentNotificationBrandingOptions> brandingOptions;

    /**
     * The Default Locale.
     * DefaultLocale for the Enrollment Notification
     */
    @SerializedName(value = "defaultLocale", alternate = {"DefaultLocale"})
    @Expose
	@Nullable
    public String defaultLocale;

    /**
     * The Notification Message Template Id.
     * Notification Message Template Id
     */
    @SerializedName(value = "notificationMessageTemplateId", alternate = {"NotificationMessageTemplateId"})
    @Expose
	@Nullable
    public java.util.UUID notificationMessageTemplateId;

    /**
     * The Platform Type.
     * Platform type of the Enrollment Notification. Possible values are: allPlatforms, ios, windows, windowsPhone, android, androidForWork, mac.
     */
    @SerializedName(value = "platformType", alternate = {"PlatformType"})
    @Expose
	@Nullable
    public EnrollmentRestrictionPlatformType platformType;

    /**
     * The Template Type.
     * Template type of the Enrollment Notification. Possible values are: email, push, unknownFutureValue.
     */
    @SerializedName(value = "templateType", alternate = {"TemplateType"})
    @Expose
	@Nullable
    public EnrollmentNotificationTemplateType templateType;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
