// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.RequiredPasswordType;
import com.microsoft.graph.models.extensions.OperatingSystemVersionRange;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicy;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Mobile Compliance Policy.
 */
public class Windows10MobileCompliancePolicy extends DeviceCompliancePolicy implements IJsonBackedObject {


    /**
     * The Active Firewall Required.
     * Require active firewall on Windows devices.
     */
    @SerializedName(value = "activeFirewallRequired", alternate = {"ActiveFirewallRequired"})
    @Expose
    public Boolean activeFirewallRequired;

    /**
     * The Bit Locker Enabled.
     * Require devices to be reported healthy by Windows Device Health Attestation - bit locker is enabled
     */
    @SerializedName(value = "bitLockerEnabled", alternate = {"BitLockerEnabled"})
    @Expose
    public Boolean bitLockerEnabled;

    /**
     * The Code Integrity Enabled.
     * Require devices to be reported as healthy by Windows Device Health Attestation.
     */
    @SerializedName(value = "codeIntegrityEnabled", alternate = {"CodeIntegrityEnabled"})
    @Expose
    public Boolean codeIntegrityEnabled;

    /**
     * The Early Launch Anti Malware Driver Enabled.
     * Require devices to be reported as healthy by Windows Device Health Attestation - early launch antimalware driver is enabled.
     */
    @SerializedName(value = "earlyLaunchAntiMalwareDriverEnabled", alternate = {"EarlyLaunchAntiMalwareDriverEnabled"})
    @Expose
    public Boolean earlyLaunchAntiMalwareDriverEnabled;

    /**
     * The Os Maximum Version.
     * Maximum Windows Phone version.
     */
    @SerializedName(value = "osMaximumVersion", alternate = {"OsMaximumVersion"})
    @Expose
    public String osMaximumVersion;

    /**
     * The Os Minimum Version.
     * Minimum Windows Phone version.
     */
    @SerializedName(value = "osMinimumVersion", alternate = {"OsMinimumVersion"})
    @Expose
    public String osMinimumVersion;

    /**
     * The Password Block Simple.
     * Whether or not to block syncing the calendar.
     */
    @SerializedName(value = "passwordBlockSimple", alternate = {"PasswordBlockSimple"})
    @Expose
    public Boolean passwordBlockSimple;

    /**
     * The Password Expiration Days.
     * Number of days before password expiration. Valid values 1 to 255
     */
    @SerializedName(value = "passwordExpirationDays", alternate = {"PasswordExpirationDays"})
    @Expose
    public Integer passwordExpirationDays;

    /**
     * The Password Minimum Character Set Count.
     * The number of character sets required in the password.
     */
    @SerializedName(value = "passwordMinimumCharacterSetCount", alternate = {"PasswordMinimumCharacterSetCount"})
    @Expose
    public Integer passwordMinimumCharacterSetCount;

    /**
     * The Password Minimum Length.
     * Minimum password length. Valid values 4 to 16
     */
    @SerializedName(value = "passwordMinimumLength", alternate = {"PasswordMinimumLength"})
    @Expose
    public Integer passwordMinimumLength;

    /**
     * The Password Minutes Of Inactivity Before Lock.
     * Minutes of inactivity before a password is required.
     */
    @SerializedName(value = "passwordMinutesOfInactivityBeforeLock", alternate = {"PasswordMinutesOfInactivityBeforeLock"})
    @Expose
    public Integer passwordMinutesOfInactivityBeforeLock;

    /**
     * The Password Previous Password Block Count.
     * The number of previous passwords to prevent re-use of.
     */
    @SerializedName(value = "passwordPreviousPasswordBlockCount", alternate = {"PasswordPreviousPasswordBlockCount"})
    @Expose
    public Integer passwordPreviousPasswordBlockCount;

    /**
     * The Password Required.
     * Require a password to unlock Windows Phone device.
     */
    @SerializedName(value = "passwordRequired", alternate = {"PasswordRequired"})
    @Expose
    public Boolean passwordRequired;

    /**
     * The Password Required Type.
     * The required password type. Possible values are: deviceDefault, alphanumeric, numeric.
     */
    @SerializedName(value = "passwordRequiredType", alternate = {"PasswordRequiredType"})
    @Expose
    public RequiredPasswordType passwordRequiredType;

    /**
     * The Password Require To Unlock From Idle.
     * Require a password to unlock an idle device.
     */
    @SerializedName(value = "passwordRequireToUnlockFromIdle", alternate = {"PasswordRequireToUnlockFromIdle"})
    @Expose
    public Boolean passwordRequireToUnlockFromIdle;

    /**
     * The Secure Boot Enabled.
     * Require devices to be reported as healthy by Windows Device Health Attestation - secure boot is enabled.
     */
    @SerializedName(value = "secureBootEnabled", alternate = {"SecureBootEnabled"})
    @Expose
    public Boolean secureBootEnabled;

    /**
     * The Storage Require Encryption.
     * Require encryption on windows devices.
     */
    @SerializedName(value = "storageRequireEncryption", alternate = {"StorageRequireEncryption"})
    @Expose
    public Boolean storageRequireEncryption;

    /**
     * The Valid Operating System Build Ranges.
     * The valid operating system build ranges on Windows devices. This collection can contain a maximum of 10000 elements.
     */
    @SerializedName(value = "validOperatingSystemBuildRanges", alternate = {"ValidOperatingSystemBuildRanges"})
    @Expose
    public java.util.List<OperatingSystemVersionRange> validOperatingSystemBuildRanges;


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
