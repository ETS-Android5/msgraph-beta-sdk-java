// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.WindowsInformationProtectionPinCharacterRequirements;
import com.microsoft.graph.models.extensions.WindowsInformationProtection;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Information Protection Policy.
 */
public class WindowsInformationProtectionPolicy extends WindowsInformationProtection implements IJsonBackedObject {


    /**
     * The Days Without Contact Before Unenroll.
     * Offline interval before app data is wiped (days)
     */
    @SerializedName(value = "daysWithoutContactBeforeUnenroll", alternate = {"DaysWithoutContactBeforeUnenroll"})
    @Expose
    public Integer daysWithoutContactBeforeUnenroll;

    /**
     * The Mdm Enrollment Url.
     * Enrollment url for the MDM
     */
    @SerializedName(value = "mdmEnrollmentUrl", alternate = {"MdmEnrollmentUrl"})
    @Expose
    public String mdmEnrollmentUrl;

    /**
     * The Minutes Of Inactivity Before Device Lock.
     * Specifies the maximum amount of time (in minutes) allowed after the device is idle that will cause the device to become PIN or password locked.   Range is an integer X where 0 &amp;lt;= X &amp;lt;= 999.
     */
    @SerializedName(value = "minutesOfInactivityBeforeDeviceLock", alternate = {"MinutesOfInactivityBeforeDeviceLock"})
    @Expose
    public Integer minutesOfInactivityBeforeDeviceLock;

    /**
     * The Number Of Past Pins Remembered.
     * Integer value that specifies the number of past PINs that can be associated to a user account that can't be reused. The largest number you can configure for this policy setting is 50. The lowest number you can configure for this policy setting is 0. If this policy is set to 0, then storage of previous PINs is not required. This node was added in Windows 10, version 1511. Default is 0.
     */
    @SerializedName(value = "numberOfPastPinsRemembered", alternate = {"NumberOfPastPinsRemembered"})
    @Expose
    public Integer numberOfPastPinsRemembered;

    /**
     * The Password Maximum Attempt Count.
     * The number of authentication failures allowed before the device will be wiped. A value of 0 disables device wipe functionality. Range is an integer X where 4 &amp;lt;= X &amp;lt;= 16 for desktop and 0 &amp;lt;= X &amp;lt;= 999 for mobile devices.
     */
    @SerializedName(value = "passwordMaximumAttemptCount", alternate = {"PasswordMaximumAttemptCount"})
    @Expose
    public Integer passwordMaximumAttemptCount;

    /**
     * The Pin Expiration Days.
     * Integer value specifies the period of time (in days) that a PIN can be used before the system requires the user to change it. The largest number you can configure for this policy setting is 730. The lowest number you can configure for this policy setting is 0. If this policy is set to 0, then the user's PIN will never expire. This node was added in Windows 10, version 1511. Default is 0.
     */
    @SerializedName(value = "pinExpirationDays", alternate = {"PinExpirationDays"})
    @Expose
    public Integer pinExpirationDays;

    /**
     * The Pin Lowercase Letters.
     * Integer value that configures the use of lowercase letters in the Windows Hello for Business PIN. Default is NotAllow. Possible values are: notAllow, requireAtLeastOne, allow.
     */
    @SerializedName(value = "pinLowercaseLetters", alternate = {"PinLowercaseLetters"})
    @Expose
    public WindowsInformationProtectionPinCharacterRequirements pinLowercaseLetters;

    /**
     * The Pin Minimum Length.
     * Integer value that sets the minimum number of characters required for the PIN. Default value is 4. The lowest number you can configure for this policy setting is 4. The largest number you can configure must be less than the number configured in the Maximum PIN length policy setting or the number 127, whichever is the lowest.
     */
    @SerializedName(value = "pinMinimumLength", alternate = {"PinMinimumLength"})
    @Expose
    public Integer pinMinimumLength;

    /**
     * The Pin Special Characters.
     * Integer value that configures the use of special characters in the Windows Hello for Business PIN. Valid special characters for Windows Hello for Business PIN gestures include: ! ' # $ % &amp; ' ( )  + , - . / : ; &amp;lt; = &amp;gt; ? @ [ / ] ^  ` {
     */
    @SerializedName(value = "pinSpecialCharacters", alternate = {"PinSpecialCharacters"})
    @Expose
    public WindowsInformationProtectionPinCharacterRequirements pinSpecialCharacters;

    /**
     * The Pin Uppercase Letters.
     * Integer value that configures the use of uppercase letters in the Windows Hello for Business PIN. Default is NotAllow. Possible values are: notAllow, requireAtLeastOne, allow.
     */
    @SerializedName(value = "pinUppercaseLetters", alternate = {"PinUppercaseLetters"})
    @Expose
    public WindowsInformationProtectionPinCharacterRequirements pinUppercaseLetters;

    /**
     * The Revoke On Mdm Handoff Disabled.
     * New property in RS2, pending documentation
     */
    @SerializedName(value = "revokeOnMdmHandoffDisabled", alternate = {"RevokeOnMdmHandoffDisabled"})
    @Expose
    public Boolean revokeOnMdmHandoffDisabled;

    /**
     * The Windows Hello For Business Blocked.
     * Boolean value that sets Windows Hello for Business as a method for signing into Windows.
     */
    @SerializedName(value = "windowsHelloForBusinessBlocked", alternate = {"WindowsHelloForBusinessBlocked"})
    @Expose
    public Boolean windowsHelloForBusinessBlocked;


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
