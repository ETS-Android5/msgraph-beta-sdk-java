// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.Enablement;
import com.microsoft.graph.models.MacOSAppleEventReceiver;
import com.microsoft.graph.models.MacOSProcessIdentifierType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSPrivacy Access Control Item.
 */
public class MacOSPrivacyAccessControlItem implements IJsonBackedObject {

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
     * The Accessibility.
     * Allow the app or process to control the Mac via the Accessibility subsystem. Possible values are: notConfigured, enabled, disabled.
     */
    @SerializedName(value = "accessibility", alternate = {"Accessibility"})
    @Expose
	@Nullable
    public Enablement accessibility;

    /**
     * The Address Book.
     * Allow or block access to contact information managed by Contacts. Possible values are: notConfigured, enabled, disabled.
     */
    @SerializedName(value = "addressBook", alternate = {"AddressBook"})
    @Expose
	@Nullable
    public Enablement addressBook;

    /**
     * The Apple Events Allowed Receivers.
     * Allow or deny the app or process to send a restricted Apple event to another app or process. You will need to know the identifier, identifier type, and code requirement of the receiving app or process. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "appleEventsAllowedReceivers", alternate = {"AppleEventsAllowedReceivers"})
    @Expose
	@Nullable
    public java.util.List<MacOSAppleEventReceiver> appleEventsAllowedReceivers;

    /**
     * The Block Camera.
     * Block access to camera app.
     */
    @SerializedName(value = "blockCamera", alternate = {"BlockCamera"})
    @Expose
	@Nullable
    public Boolean blockCamera;

    /**
     * The Block Listen Event.
     * Block the app or process from listening to events from input devices such as mouse, keyboard, and trackpad.Requires macOS 10.15 or later.
     */
    @SerializedName(value = "blockListenEvent", alternate = {"BlockListenEvent"})
    @Expose
	@Nullable
    public Boolean blockListenEvent;

    /**
     * The Block Microphone.
     * Block access to microphone.
     */
    @SerializedName(value = "blockMicrophone", alternate = {"BlockMicrophone"})
    @Expose
	@Nullable
    public Boolean blockMicrophone;

    /**
     * The Block Screen Capture.
     * Block app from capturing contents of system display. Requires macOS 10.15 or later.
     */
    @SerializedName(value = "blockScreenCapture", alternate = {"BlockScreenCapture"})
    @Expose
	@Nullable
    public Boolean blockScreenCapture;

    /**
     * The Calendar.
     * Allow or block access to event information managed by Calendar. Possible values are: notConfigured, enabled, disabled.
     */
    @SerializedName(value = "calendar", alternate = {"Calendar"})
    @Expose
	@Nullable
    public Enablement calendar;

    /**
     * The Code Requirement.
     * Enter the code requirement, which can be obtained with the command 'codesign –display -r –' in the Terminal app. Include everything after '=&amp;gt;'.
     */
    @SerializedName(value = "codeRequirement", alternate = {"CodeRequirement"})
    @Expose
	@Nullable
    public String codeRequirement;

    /**
     * The Display Name.
     * The display name of the app, process, or executable.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The File Provider Presence.
     * Allow the app or process to access files managed by another app’s file provider extension. Requires macOS 10.15 or later. . Possible values are: notConfigured, enabled, disabled.
     */
    @SerializedName(value = "fileProviderPresence", alternate = {"FileProviderPresence"})
    @Expose
	@Nullable
    public Enablement fileProviderPresence;

    /**
     * The Identifier.
     * The bundle ID or path of the app, process, or executable.
     */
    @SerializedName(value = "identifier", alternate = {"Identifier"})
    @Expose
	@Nullable
    public String identifier;

    /**
     * The Identifier Type.
     * A bundle ID is used to identify an app. A path is used to identify a process or executable. Possible values are: bundleID, path.
     */
    @SerializedName(value = "identifierType", alternate = {"IdentifierType"})
    @Expose
	@Nullable
    public MacOSProcessIdentifierType identifierType;

    /**
     * The Media Library.
     * Allow or block access to music and the media library. Possible values are: notConfigured, enabled, disabled.
     */
    @SerializedName(value = "mediaLibrary", alternate = {"MediaLibrary"})
    @Expose
	@Nullable
    public Enablement mediaLibrary;

    /**
     * The Photos.
     * Allow or block access to images managed by Photos. Possible values are: notConfigured, enabled, disabled.
     */
    @SerializedName(value = "photos", alternate = {"Photos"})
    @Expose
	@Nullable
    public Enablement photos;

    /**
     * The Post Event.
     * Control access to CoreGraphics APIs, which are used to send CGEvents to the system event stream. Possible values are: notConfigured, enabled, disabled.
     */
    @SerializedName(value = "postEvent", alternate = {"PostEvent"})
    @Expose
	@Nullable
    public Enablement postEvent;

    /**
     * The Reminders.
     * Allow or block access to information managed by Reminders. Possible values are: notConfigured, enabled, disabled.
     */
    @SerializedName(value = "reminders", alternate = {"Reminders"})
    @Expose
	@Nullable
    public Enablement reminders;

    /**
     * The Speech Recognition.
     * Allow or block access to system speech recognition facility. Possible values are: notConfigured, enabled, disabled.
     */
    @SerializedName(value = "speechRecognition", alternate = {"SpeechRecognition"})
    @Expose
	@Nullable
    public Enablement speechRecognition;

    /**
     * The Static Code Validation.
     * Statically validates the code requirement. Use this setting if the process invalidates its dynamic code signature.
     */
    @SerializedName(value = "staticCodeValidation", alternate = {"StaticCodeValidation"})
    @Expose
	@Nullable
    public Boolean staticCodeValidation;

    /**
     * The System Policy All Files.
     * Control access to all protected files on a device. Files might be in locations such as emails, messages, apps, and administrative settings. Apply this setting with caution. Possible values are: notConfigured, enabled, disabled.
     */
    @SerializedName(value = "systemPolicyAllFiles", alternate = {"SystemPolicyAllFiles"})
    @Expose
	@Nullable
    public Enablement systemPolicyAllFiles;

    /**
     * The System Policy Desktop Folder.
     * Allow or block access to Desktop folder. Possible values are: notConfigured, enabled, disabled.
     */
    @SerializedName(value = "systemPolicyDesktopFolder", alternate = {"SystemPolicyDesktopFolder"})
    @Expose
	@Nullable
    public Enablement systemPolicyDesktopFolder;

    /**
     * The System Policy Documents Folder.
     * Allow or block access to Documents folder. Possible values are: notConfigured, enabled, disabled.
     */
    @SerializedName(value = "systemPolicyDocumentsFolder", alternate = {"SystemPolicyDocumentsFolder"})
    @Expose
	@Nullable
    public Enablement systemPolicyDocumentsFolder;

    /**
     * The System Policy Downloads Folder.
     * Allow or block access to Downloads folder. Possible values are: notConfigured, enabled, disabled.
     */
    @SerializedName(value = "systemPolicyDownloadsFolder", alternate = {"SystemPolicyDownloadsFolder"})
    @Expose
	@Nullable
    public Enablement systemPolicyDownloadsFolder;

    /**
     * The System Policy Network Volumes.
     * Allow or block access to network volumes. Requires macOS 10.15 or later. Possible values are: notConfigured, enabled, disabled.
     */
    @SerializedName(value = "systemPolicyNetworkVolumes", alternate = {"SystemPolicyNetworkVolumes"})
    @Expose
	@Nullable
    public Enablement systemPolicyNetworkVolumes;

    /**
     * The System Policy Removable Volumes.
     * Control access to removable  volumes on the device, such as an external hard drive. Requires macOS 10.15 or later. Possible values are: notConfigured, enabled, disabled.
     */
    @SerializedName(value = "systemPolicyRemovableVolumes", alternate = {"SystemPolicyRemovableVolumes"})
    @Expose
	@Nullable
    public Enablement systemPolicyRemovableVolumes;

    /**
     * The System Policy System Admin Files.
     * Allow app or process to access files used in system administration. Possible values are: notConfigured, enabled, disabled.
     */
    @SerializedName(value = "systemPolicySystemAdminFiles", alternate = {"SystemPolicySystemAdminFiles"})
    @Expose
	@Nullable
    public Enablement systemPolicySystemAdminFiles;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
