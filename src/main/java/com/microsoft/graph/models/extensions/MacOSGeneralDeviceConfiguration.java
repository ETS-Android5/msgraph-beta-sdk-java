// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.AppListType;
import com.microsoft.graph.models.extensions.AppListItem;
import com.microsoft.graph.models.generated.RequiredPasswordType;
import com.microsoft.graph.models.extensions.MacOSPrivacyAccessControlItem;
import com.microsoft.graph.models.generated.MacOSSoftwareUpdateDelayPolicy;
import com.microsoft.graph.models.extensions.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSGeneral Device Configuration.
 */
public class MacOSGeneralDeviceConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Air Drop Blocked.
     * Indicates whether or not to allow AirDrop.
     */
    @SerializedName(value = "airDropBlocked", alternate = {"AirDropBlocked"})
    @Expose
    public Boolean airDropBlocked;

    /**
     * The Air Print Blocked.
     * Indicates whether or not AirPrint is blocked (macOS 10.12 and later).
     */
    @SerializedName(value = "airPrintBlocked", alternate = {"AirPrintBlocked"})
    @Expose
    public Boolean airPrintBlocked;

    /**
     * The Air Print Blocki Beacon Discovery.
     * Indicates whether or not iBeacon discovery of AirPrint printers is blocked. This prevents spurious AirPrint Bluetooth beacons from phishing for network traffic (macOS 10.3 and later).
     */
    @SerializedName(value = "airPrintBlockiBeaconDiscovery", alternate = {"AirPrintBlockiBeaconDiscovery"})
    @Expose
    public Boolean airPrintBlockiBeaconDiscovery;

    /**
     * The Air Print Force Trusted TLS.
     * Indicates if trusted certificates are required for TLS printing communication (macOS 10.13 and later).
     */
    @SerializedName(value = "airPrintForceTrustedTLS", alternate = {"AirPrintForceTrustedTLS"})
    @Expose
    public Boolean airPrintForceTrustedTLS;

    /**
     * The Apple Watch Block Auto Unlock.
     * Indicates whether or to block users from unlocking their Mac with Apple Watch.
     */
    @SerializedName(value = "appleWatchBlockAutoUnlock", alternate = {"AppleWatchBlockAutoUnlock"})
    @Expose
    public Boolean appleWatchBlockAutoUnlock;

    /**
     * The Camera Blocked.
     * Indicates whether or not to block the user from accessing the camera of the device.
     */
    @SerializedName(value = "cameraBlocked", alternate = {"CameraBlocked"})
    @Expose
    public Boolean cameraBlocked;

    /**
     * The Classroom App Block Remote Screen Observation.
     * Indicates whether or not to allow remote screen observation by Classroom app. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     */
    @SerializedName(value = "classroomAppBlockRemoteScreenObservation", alternate = {"ClassroomAppBlockRemoteScreenObservation"})
    @Expose
    public Boolean classroomAppBlockRemoteScreenObservation;

    /**
     * The Classroom App Force Unprompted Screen Observation.
     * Indicates whether or not to automatically give permission to the teacher of a managed course on the Classroom app to view a student's screen without prompting. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     */
    @SerializedName(value = "classroomAppForceUnpromptedScreenObservation", alternate = {"ClassroomAppForceUnpromptedScreenObservation"})
    @Expose
    public Boolean classroomAppForceUnpromptedScreenObservation;

    /**
     * The Classroom Force Automatically Join Classes.
     * Indicates whether or not to automatically give permission to the teacher's requests, without prompting the student. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     */
    @SerializedName(value = "classroomForceAutomaticallyJoinClasses", alternate = {"ClassroomForceAutomaticallyJoinClasses"})
    @Expose
    public Boolean classroomForceAutomaticallyJoinClasses;

    /**
     * The Classroom Force Request Permission To Leave Classes.
     * Indicates whether a student enrolled in an unmanaged course via Classroom will be required to request permission from the teacher when attempting to leave the course. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     */
    @SerializedName(value = "classroomForceRequestPermissionToLeaveClasses", alternate = {"ClassroomForceRequestPermissionToLeaveClasses"})
    @Expose
    public Boolean classroomForceRequestPermissionToLeaveClasses;

    /**
     * The Classroom Force Unprompted App And Device Lock.
     * Indicates whether or not to allow the teacher to lock apps or the device without prompting the student. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     */
    @SerializedName(value = "classroomForceUnpromptedAppAndDeviceLock", alternate = {"ClassroomForceUnpromptedAppAndDeviceLock"})
    @Expose
    public Boolean classroomForceUnpromptedAppAndDeviceLock;

    /**
     * The Compliant App List Type.
     * List that is in the CompliantAppsList. Possible values are: none, appsInListCompliant, appsNotInListCompliant.
     */
    @SerializedName(value = "compliantAppListType", alternate = {"CompliantAppListType"})
    @Expose
    public AppListType compliantAppListType;

    /**
     * The Compliant Apps List.
     * List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.
     */
    @SerializedName(value = "compliantAppsList", alternate = {"CompliantAppsList"})
    @Expose
    public java.util.List<AppListItem> compliantAppsList;

    /**
     * The Content Caching Blocked.
     * Indicates whether or not to allow content caching.
     */
    @SerializedName(value = "contentCachingBlocked", alternate = {"ContentCachingBlocked"})
    @Expose
    public Boolean contentCachingBlocked;

    /**
     * The Definition Lookup Blocked.
     * Indicates whether or not to block definition lookup.
     */
    @SerializedName(value = "definitionLookupBlocked", alternate = {"DefinitionLookupBlocked"})
    @Expose
    public Boolean definitionLookupBlocked;

    /**
     * The Email In Domain Suffixes.
     * An email address lacking a suffix that matches any of these strings will be considered out-of-domain.
     */
    @SerializedName(value = "emailInDomainSuffixes", alternate = {"EmailInDomainSuffixes"})
    @Expose
    public java.util.List<String> emailInDomainSuffixes;

    /**
     * The ICloud Block Activity Continuation.
     * Indicates whether or not to block the user from continuing work that they started on a MacOS device on another iOS or MacOS device (MacOS 10.15 or later).
     */
    @SerializedName(value = "iCloudBlockActivityContinuation", alternate = {"ICloudBlockActivityContinuation"})
    @Expose
    public Boolean iCloudBlockActivityContinuation;

    /**
     * The ICloud Block Address Book.
     * Indicates whether or not to block iCloud from syncing contacts.
     */
    @SerializedName(value = "iCloudBlockAddressBook", alternate = {"ICloudBlockAddressBook"})
    @Expose
    public Boolean iCloudBlockAddressBook;

    /**
     * The ICloud Block Bookmarks.
     * Indicates whether or not to block iCloud from syncing bookmarks.
     */
    @SerializedName(value = "iCloudBlockBookmarks", alternate = {"ICloudBlockBookmarks"})
    @Expose
    public Boolean iCloudBlockBookmarks;

    /**
     * The ICloud Block Calendar.
     * Indicates whether or not to block iCloud from syncing calendars.
     */
    @SerializedName(value = "iCloudBlockCalendar", alternate = {"ICloudBlockCalendar"})
    @Expose
    public Boolean iCloudBlockCalendar;

    /**
     * The ICloud Block Document Sync.
     * Indicates whether or not to block iCloud document sync.
     */
    @SerializedName(value = "iCloudBlockDocumentSync", alternate = {"ICloudBlockDocumentSync"})
    @Expose
    public Boolean iCloudBlockDocumentSync;

    /**
     * The ICloud Block Mail.
     * Indicates whether or not to block iCloud from syncing mail.
     */
    @SerializedName(value = "iCloudBlockMail", alternate = {"ICloudBlockMail"})
    @Expose
    public Boolean iCloudBlockMail;

    /**
     * The ICloud Block Notes.
     * Indicates whether or not to block iCloud from syncing notes.
     */
    @SerializedName(value = "iCloudBlockNotes", alternate = {"ICloudBlockNotes"})
    @Expose
    public Boolean iCloudBlockNotes;

    /**
     * The ICloud Block Photo Library.
     * Indicates whether or not to block iCloud Photo Library.
     */
    @SerializedName(value = "iCloudBlockPhotoLibrary", alternate = {"ICloudBlockPhotoLibrary"})
    @Expose
    public Boolean iCloudBlockPhotoLibrary;

    /**
     * The ICloud Block Reminders.
     * Indicates whether or not to block iCloud from syncing reminders.
     */
    @SerializedName(value = "iCloudBlockReminders", alternate = {"ICloudBlockReminders"})
    @Expose
    public Boolean iCloudBlockReminders;

    /**
     * The ITunes Block File Sharing.
     * Indicates whether or not to block files from being transferred using iTunes.
     */
    @SerializedName(value = "iTunesBlockFileSharing", alternate = {"ITunesBlockFileSharing"})
    @Expose
    public Boolean iTunesBlockFileSharing;

    /**
     * The ITunes Block Music Service.
     * Indicates whether or not to block Music service and revert Music app to classic mode.
     */
    @SerializedName(value = "iTunesBlockMusicService", alternate = {"ITunesBlockMusicService"})
    @Expose
    public Boolean iTunesBlockMusicService;

    /**
     * The Keyboard Block Dictation.
     * Indicates whether or not to block the user from using dictation input.
     */
    @SerializedName(value = "keyboardBlockDictation", alternate = {"KeyboardBlockDictation"})
    @Expose
    public Boolean keyboardBlockDictation;

    /**
     * The Keychain Block Cloud Sync.
     * Indicates whether or not iCloud keychain synchronization is blocked (macOS 10.12 and later).
     */
    @SerializedName(value = "keychainBlockCloudSync", alternate = {"KeychainBlockCloudSync"})
    @Expose
    public Boolean keychainBlockCloudSync;

    /**
     * The Password Block Air Drop Sharing.
     * Indicates whether or not to block sharing passwords with the AirDrop passwords feature.
     */
    @SerializedName(value = "passwordBlockAirDropSharing", alternate = {"PasswordBlockAirDropSharing"})
    @Expose
    public Boolean passwordBlockAirDropSharing;

    /**
     * The Password Block Auto Fill.
     * Indicates whether or not to block the AutoFill Passwords feature.
     */
    @SerializedName(value = "passwordBlockAutoFill", alternate = {"PasswordBlockAutoFill"})
    @Expose
    public Boolean passwordBlockAutoFill;

    /**
     * The Password Block Fingerprint Unlock.
     * Indicates whether or not to block fingerprint unlock.
     */
    @SerializedName(value = "passwordBlockFingerprintUnlock", alternate = {"PasswordBlockFingerprintUnlock"})
    @Expose
    public Boolean passwordBlockFingerprintUnlock;

    /**
     * The Password Block Modification.
     * Indicates whether or not to allow passcode modification.
     */
    @SerializedName(value = "passwordBlockModification", alternate = {"PasswordBlockModification"})
    @Expose
    public Boolean passwordBlockModification;

    /**
     * The Password Block Proximity Requests.
     * Indicates whether or not to block requesting passwords from nearby devices.
     */
    @SerializedName(value = "passwordBlockProximityRequests", alternate = {"PasswordBlockProximityRequests"})
    @Expose
    public Boolean passwordBlockProximityRequests;

    /**
     * The Password Block Simple.
     * Block simple passwords.
     */
    @SerializedName(value = "passwordBlockSimple", alternate = {"PasswordBlockSimple"})
    @Expose
    public Boolean passwordBlockSimple;

    /**
     * The Password Expiration Days.
     * Number of days before the password expires.
     */
    @SerializedName(value = "passwordExpirationDays", alternate = {"PasswordExpirationDays"})
    @Expose
    public Integer passwordExpirationDays;

    /**
     * The Password Minimum Character Set Count.
     * Number of character sets a password must contain. Valid values 0 to 4
     */
    @SerializedName(value = "passwordMinimumCharacterSetCount", alternate = {"PasswordMinimumCharacterSetCount"})
    @Expose
    public Integer passwordMinimumCharacterSetCount;

    /**
     * The Password Minimum Length.
     * Minimum length of passwords.
     */
    @SerializedName(value = "passwordMinimumLength", alternate = {"PasswordMinimumLength"})
    @Expose
    public Integer passwordMinimumLength;

    /**
     * The Password Minutes Of Inactivity Before Lock.
     * Minutes of inactivity required before a password is required.
     */
    @SerializedName(value = "passwordMinutesOfInactivityBeforeLock", alternate = {"PasswordMinutesOfInactivityBeforeLock"})
    @Expose
    public Integer passwordMinutesOfInactivityBeforeLock;

    /**
     * The Password Minutes Of Inactivity Before Screen Timeout.
     * Minutes of inactivity required before the screen times out.
     */
    @SerializedName(value = "passwordMinutesOfInactivityBeforeScreenTimeout", alternate = {"PasswordMinutesOfInactivityBeforeScreenTimeout"})
    @Expose
    public Integer passwordMinutesOfInactivityBeforeScreenTimeout;

    /**
     * The Password Previous Password Block Count.
     * Number of previous passwords to block.
     */
    @SerializedName(value = "passwordPreviousPasswordBlockCount", alternate = {"PasswordPreviousPasswordBlockCount"})
    @Expose
    public Integer passwordPreviousPasswordBlockCount;

    /**
     * The Password Required.
     * Whether or not to require a password.
     */
    @SerializedName(value = "passwordRequired", alternate = {"PasswordRequired"})
    @Expose
    public Boolean passwordRequired;

    /**
     * The Password Required Type.
     * Type of password that is required. Possible values are: deviceDefault, alphanumeric, numeric.
     */
    @SerializedName(value = "passwordRequiredType", alternate = {"PasswordRequiredType"})
    @Expose
    public RequiredPasswordType passwordRequiredType;

    /**
     * The Privacy Access Controls.
     * List of privacy preference policy controls. This collection can contain a maximum of 10000 elements.
     */
    @SerializedName(value = "privacyAccessControls", alternate = {"PrivacyAccessControls"})
    @Expose
    public java.util.List<MacOSPrivacyAccessControlItem> privacyAccessControls;

    /**
     * The Safari Block Autofill.
     * Indicates whether or not to block the user from using Auto fill in Safari.
     */
    @SerializedName(value = "safariBlockAutofill", alternate = {"SafariBlockAutofill"})
    @Expose
    public Boolean safariBlockAutofill;

    /**
     * The Screen Capture Blocked.
     * Indicates whether or not to block the user from taking Screenshots.
     */
    @SerializedName(value = "screenCaptureBlocked", alternate = {"ScreenCaptureBlocked"})
    @Expose
    public Boolean screenCaptureBlocked;

    /**
     * The Software Updates Enforced Delay In Days.
     * Sets how many days a software update will be delyed for a supervised device. Valid values 0 to 90
     */
    @SerializedName(value = "softwareUpdatesEnforcedDelayInDays", alternate = {"SoftwareUpdatesEnforcedDelayInDays"})
    @Expose
    public Integer softwareUpdatesEnforcedDelayInDays;

    /**
     * The Software Updates Force Delayed.
     * Indicates whether or not to delay user visibility of software updates when the device is in supervised mode.
     */
    @SerializedName(value = "softwareUpdatesForceDelayed", alternate = {"SoftwareUpdatesForceDelayed"})
    @Expose
    public Boolean softwareUpdatesForceDelayed;

    /**
     * The Spotlight Block Internet Results.
     * Indicates whether or not to block Spotlight from returning any results from an Internet search.
     */
    @SerializedName(value = "spotlightBlockInternetResults", alternate = {"SpotlightBlockInternetResults"})
    @Expose
    public Boolean spotlightBlockInternetResults;

    /**
     * The Update Delay Policy.
     * Determines whether to delay OS and/or app updates for macOS.
     */
    @SerializedName(value = "updateDelayPolicy", alternate = {"UpdateDelayPolicy"})
    @Expose
    public EnumSet<MacOSSoftwareUpdateDelayPolicy> updateDelayPolicy;


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
