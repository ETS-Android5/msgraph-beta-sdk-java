// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.Enablement;
import com.microsoft.graph.models.extensions.MacOSAppleEventReceiver;
import com.microsoft.graph.models.generated.MacOSProcessIdentifierType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSPrivacy Access Control Item.
 */
public class MacOSPrivacyAccessControlItem implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Accessibility.
     * Allow the app or process to control the Mac via the Accessibility subsystem.
     */
    @SerializedName(value = "accessibility", alternate = {"Accessibility"})
    @Expose
    public Enablement accessibility;

    /**
     * The Address Book.
     * Allow or block access to contact information managed by Contacts.
     */
    @SerializedName(value = "addressBook", alternate = {"AddressBook"})
    @Expose
    public Enablement addressBook;

    /**
     * The Apple Events Allowed Receivers.
     * Allow or deny the app or process to send a restricted Apple event to another app or process. You will need to know the identifier, identifier type, and code requirement of the receiving app or process. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "appleEventsAllowedReceivers", alternate = {"AppleEventsAllowedReceivers"})
    @Expose
    public java.util.List<MacOSAppleEventReceiver> appleEventsAllowedReceivers;

    /**
     * The Block Camera.
     * Block access to camera app.
     */
    @SerializedName(value = "blockCamera", alternate = {"BlockCamera"})
    @Expose
    public Boolean blockCamera;

    /**
     * The Block Listen Event.
     * Block the app or process from listening to events from input devices such as mouse, keyboard, and trackpad.Requires macOS 10.15 or later.
     */
    @SerializedName(value = "blockListenEvent", alternate = {"BlockListenEvent"})
    @Expose
    public Boolean blockListenEvent;

    /**
     * The Block Microphone.
     * Block access to microphone.
     */
    @SerializedName(value = "blockMicrophone", alternate = {"BlockMicrophone"})
    @Expose
    public Boolean blockMicrophone;

    /**
     * The Block Screen Capture.
     * Block app from capturing contents of system display. Requires macOS 10.15 or later.
     */
    @SerializedName(value = "blockScreenCapture", alternate = {"BlockScreenCapture"})
    @Expose
    public Boolean blockScreenCapture;

    /**
     * The Calendar.
     * Allow or block access to event information managed by Calendar.
     */
    @SerializedName(value = "calendar", alternate = {"Calendar"})
    @Expose
    public Enablement calendar;

    /**
     * The Code Requirement.
     * Enter the code requirement, which can be obtained with the command 'codesign ???display -r ???' in the Terminal app. Include everything after '=&amp;gt;'.
     */
    @SerializedName(value = "codeRequirement", alternate = {"CodeRequirement"})
    @Expose
    public String codeRequirement;

    /**
     * The Display Name.
     * The display name of the app, process, or executable.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The File Provider Presence.
     * Allow the app or process to access files managed by another app???s file provider extension. Requires macOS 10.15 or later. 
     */
    @SerializedName(value = "fileProviderPresence", alternate = {"FileProviderPresence"})
    @Expose
    public Enablement fileProviderPresence;

    /**
     * The Identifier.
     * The bundle ID or path of the app, process, or executable.
     */
    @SerializedName(value = "identifier", alternate = {"Identifier"})
    @Expose
    public String identifier;

    /**
     * The Identifier Type.
     * A bundle ID is used to identify an app. A path is used to identify a process or executable.
     */
    @SerializedName(value = "identifierType", alternate = {"IdentifierType"})
    @Expose
    public MacOSProcessIdentifierType identifierType;

    /**
     * The Media Library.
     * Allow or block access to music and the media library.
     */
    @SerializedName(value = "mediaLibrary", alternate = {"MediaLibrary"})
    @Expose
    public Enablement mediaLibrary;

    /**
     * The Photos.
     * Allow or block access to images managed by Photos.
     */
    @SerializedName(value = "photos", alternate = {"Photos"})
    @Expose
    public Enablement photos;

    /**
     * The Post Event.
     * Control access to CoreGraphics APIs, which are used to send CGEvents to the system event stream.
     */
    @SerializedName(value = "postEvent", alternate = {"PostEvent"})
    @Expose
    public Enablement postEvent;

    /**
     * The Reminders.
     * Allow or block access to information managed by Reminders.
     */
    @SerializedName(value = "reminders", alternate = {"Reminders"})
    @Expose
    public Enablement reminders;

    /**
     * The Speech Recognition.
     * Allow or block access to system speech recognition facility.
     */
    @SerializedName(value = "speechRecognition", alternate = {"SpeechRecognition"})
    @Expose
    public Enablement speechRecognition;

    /**
     * The Static Code Validation.
     * Statically validates the code requirement. Use this setting if the process invalidates its dynamic code signature.
     */
    @SerializedName(value = "staticCodeValidation", alternate = {"StaticCodeValidation"})
    @Expose
    public Boolean staticCodeValidation;

    /**
     * The System Policy All Files.
     * Control access to all protected files on a device. Files might be in locations such as emails, messages, apps, and administrative settings. Apply this setting with caution.
     */
    @SerializedName(value = "systemPolicyAllFiles", alternate = {"SystemPolicyAllFiles"})
    @Expose
    public Enablement systemPolicyAllFiles;

    /**
     * The System Policy Desktop Folder.
     * Allow or block access to Desktop folder.
     */
    @SerializedName(value = "systemPolicyDesktopFolder", alternate = {"SystemPolicyDesktopFolder"})
    @Expose
    public Enablement systemPolicyDesktopFolder;

    /**
     * The System Policy Documents Folder.
     * Allow or block access to Documents folder.
     */
    @SerializedName(value = "systemPolicyDocumentsFolder", alternate = {"SystemPolicyDocumentsFolder"})
    @Expose
    public Enablement systemPolicyDocumentsFolder;

    /**
     * The System Policy Downloads Folder.
     * Allow or block access to Downloads folder.
     */
    @SerializedName(value = "systemPolicyDownloadsFolder", alternate = {"SystemPolicyDownloadsFolder"})
    @Expose
    public Enablement systemPolicyDownloadsFolder;

    /**
     * The System Policy Network Volumes.
     * Allow or block access to network volumes. Requires macOS 10.15 or later.
     */
    @SerializedName(value = "systemPolicyNetworkVolumes", alternate = {"SystemPolicyNetworkVolumes"})
    @Expose
    public Enablement systemPolicyNetworkVolumes;

    /**
     * The System Policy Removable Volumes.
     * Control access to removable  volumes on the device, such as an external hard drive. Requires macOS 10.15 or later.
     */
    @SerializedName(value = "systemPolicyRemovableVolumes", alternate = {"SystemPolicyRemovableVolumes"})
    @Expose
    public Enablement systemPolicyRemovableVolumes;

    /**
     * The System Policy System Admin Files.
     * Allow app or process to access files used in system administration.
     */
    @SerializedName(value = "systemPolicySystemAdminFiles", alternate = {"SystemPolicySystemAdminFiles"})
    @Expose
    public Enablement systemPolicySystemAdminFiles;


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
