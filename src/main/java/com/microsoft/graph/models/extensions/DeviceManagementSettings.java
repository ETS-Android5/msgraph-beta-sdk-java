// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.DerivedCredentialProviderType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Settings.
 */
public class DeviceManagementSettings implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Android Device Administrator Enrollment Enabled.
     * The property to determine if Android device administrator enrollment is enabled for this account.
     */
    @SerializedName(value = "androidDeviceAdministratorEnrollmentEnabled", alternate = {"AndroidDeviceAdministratorEnrollmentEnabled"})
    @Expose
    public Boolean androidDeviceAdministratorEnrollmentEnabled;

    /**
     * The Derived Credential Provider.
     * The Derived Credential Provider to use for this account. Possible values are: notConfigured, entrustDataCard, purebred, xTec, intercede.
     */
    @SerializedName(value = "derivedCredentialProvider", alternate = {"DerivedCredentialProvider"})
    @Expose
    public DerivedCredentialProviderType derivedCredentialProvider;

    /**
     * The Derived Credential Url.
     * The Derived Credential Provider self-service URI.
     */
    @SerializedName(value = "derivedCredentialUrl", alternate = {"DerivedCredentialUrl"})
    @Expose
    public String derivedCredentialUrl;

    /**
     * The Device Compliance Checkin Threshold Days.
     * The number of days a device is allowed to go without checking in to remain compliant.
     */
    @SerializedName(value = "deviceComplianceCheckinThresholdDays", alternate = {"DeviceComplianceCheckinThresholdDays"})
    @Expose
    public Integer deviceComplianceCheckinThresholdDays;

    /**
     * The Device Inactivity Before Retirement In Day.
     * When the device does not check in for specified number of days, the company data might be removed and the device will not be under management. Valid values 30 to 270
     */
    @SerializedName(value = "deviceInactivityBeforeRetirementInDay", alternate = {"DeviceInactivityBeforeRetirementInDay"})
    @Expose
    public Integer deviceInactivityBeforeRetirementInDay;

    /**
     * The Enable Log Collection.
     * Determines whether the log collection feature should be available for use.
     */
    @SerializedName(value = "enableLogCollection", alternate = {"EnableLogCollection"})
    @Expose
    public Boolean enableLogCollection;

    /**
     * The Enhanced Jail Break.
     * Is feature enabled or not for enhanced jailbreak detection.
     */
    @SerializedName(value = "enhancedJailBreak", alternate = {"EnhancedJailBreak"})
    @Expose
    public Boolean enhancedJailBreak;

    /**
     * The Ignore Devices For Unsupported Settings Enabled.
     * The property to determine whether to ignore unsupported compliance settings on certian models of devices.
     */
    @SerializedName(value = "ignoreDevicesForUnsupportedSettingsEnabled", alternate = {"IgnoreDevicesForUnsupportedSettingsEnabled"})
    @Expose
    public Boolean ignoreDevicesForUnsupportedSettingsEnabled;

    /**
     * The Is Scheduled Action Enabled.
     * Is feature enabled or not for scheduled action for rule.
     */
    @SerializedName(value = "isScheduledActionEnabled", alternate = {"IsScheduledActionEnabled"})
    @Expose
    public Boolean isScheduledActionEnabled;

    /**
     * The Secure By Default.
     * Device should be noncompliant when there is no compliance policy targeted when this is true
     */
    @SerializedName(value = "secureByDefault", alternate = {"SecureByDefault"})
    @Expose
    public Boolean secureByDefault;


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
