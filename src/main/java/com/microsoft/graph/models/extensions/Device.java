// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AlternativeSecurityId;
import com.microsoft.graph.models.extensions.OnPremisesExtensionAttributes;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.Extension;
import com.microsoft.graph.models.extensions.Command;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionPage;
import com.microsoft.graph.requests.extensions.ExtensionCollectionPage;
import com.microsoft.graph.requests.extensions.CommandCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device.
 */
public class Device extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Account Enabled.
     * true if the account is enabled; otherwise, false. Required.
     */
    @SerializedName(value = "accountEnabled", alternate = {"AccountEnabled"})
    @Expose
    public Boolean accountEnabled;

    /**
     * The Alternative Security Ids.
     * For internal use only. Not nullable.
     */
    @SerializedName(value = "alternativeSecurityIds", alternate = {"AlternativeSecurityIds"})
    @Expose
    public java.util.List<AlternativeSecurityId> alternativeSecurityIds;

    /**
     * The Approximate Last Sign In Date Time.
     * The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
     */
    @SerializedName(value = "approximateLastSignInDateTime", alternate = {"ApproximateLastSignInDateTime"})
    @Expose
    public java.util.Calendar approximateLastSignInDateTime;

    /**
     * The Compliance Expiration Date Time.
     * The timestamp when the device is no longer deemed compliant. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
     */
    @SerializedName(value = "complianceExpirationDateTime", alternate = {"ComplianceExpirationDateTime"})
    @Expose
    public java.util.Calendar complianceExpirationDateTime;

    /**
     * The Device Category.
     * 
     */
    @SerializedName(value = "deviceCategory", alternate = {"DeviceCategory"})
    @Expose
    public String deviceCategory;

    /**
     * The Device Id.
     * Unique identifier set by Azure Device Registration Service at the time of registration.
     */
    @SerializedName(value = "deviceId", alternate = {"DeviceId"})
    @Expose
    public String deviceId;

    /**
     * The Device Metadata.
     * For interal use only. Set to null.
     */
    @SerializedName(value = "deviceMetadata", alternate = {"DeviceMetadata"})
    @Expose
    public String deviceMetadata;

    /**
     * The Device Ownership.
     * 
     */
    @SerializedName(value = "deviceOwnership", alternate = {"DeviceOwnership"})
    @Expose
    public String deviceOwnership;

    /**
     * The Device Version.
     * For interal use only.
     */
    @SerializedName(value = "deviceVersion", alternate = {"DeviceVersion"})
    @Expose
    public Integer deviceVersion;

    /**
     * The Display Name.
     * The display name for the device. Required.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Domain Name.
     * 
     */
    @SerializedName(value = "domainName", alternate = {"DomainName"})
    @Expose
    public String domainName;

    /**
     * The Enrollment Profile Name.
     * 
     */
    @SerializedName(value = "enrollmentProfileName", alternate = {"EnrollmentProfileName"})
    @Expose
    public String enrollmentProfileName;

    /**
     * The Enrollment Type.
     * 
     */
    @SerializedName(value = "enrollmentType", alternate = {"EnrollmentType"})
    @Expose
    public String enrollmentType;

    /**
     * The Extension Attributes.
     * 
     */
    @SerializedName(value = "extensionAttributes", alternate = {"ExtensionAttributes"})
    @Expose
    public OnPremisesExtensionAttributes extensionAttributes;

    /**
     * The Is Compliant.
     * true if the device complies with Mobile Device Management (MDM) policies; otherwise, false. Read-only. This can only be updated by Intune for any device OS type or by an approved MDM app for Windows OS devices.
     */
    @SerializedName(value = "isCompliant", alternate = {"IsCompliant"})
    @Expose
    public Boolean isCompliant;

    /**
     * The Is Managed.
     * true if the device is managed by a Mobile Device Management (MDM) app; otherwise, false. This can only be updated by Intune for any device OS type or by an approved MDM app for Windows OS devices.
     */
    @SerializedName(value = "isManaged", alternate = {"IsManaged"})
    @Expose
    public Boolean isManaged;

    /**
     * The Is Rooted.
     * 
     */
    @SerializedName(value = "isRooted", alternate = {"IsRooted"})
    @Expose
    public Boolean isRooted;

    /**
     * The Management Type.
     * 
     */
    @SerializedName(value = "managementType", alternate = {"ManagementType"})
    @Expose
    public String managementType;

    /**
     * The On Premises Last Sync Date Time.
     * The last time at which the object was synced with the on-premises directory.The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z' Read-only.
     */
    @SerializedName(value = "onPremisesLastSyncDateTime", alternate = {"OnPremisesLastSyncDateTime"})
    @Expose
    public java.util.Calendar onPremisesLastSyncDateTime;

    /**
     * The On Premises Sync Enabled.
     * true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory (default). Read-only.
     */
    @SerializedName(value = "onPremisesSyncEnabled", alternate = {"OnPremisesSyncEnabled"})
    @Expose
    public Boolean onPremisesSyncEnabled;

    /**
     * The Operating System.
     * The type of operating system on the device. Required.
     */
    @SerializedName(value = "operatingSystem", alternate = {"OperatingSystem"})
    @Expose
    public String operatingSystem;

    /**
     * The Operating System Version.
     * The version of the operating system on the device. Required.
     */
    @SerializedName(value = "operatingSystemVersion", alternate = {"OperatingSystemVersion"})
    @Expose
    public String operatingSystemVersion;

    /**
     * The Physical Ids.
     * For interal use only. Not nullable.
     */
    @SerializedName(value = "physicalIds", alternate = {"PhysicalIds"})
    @Expose
    public java.util.List<String> physicalIds;

    /**
     * The Profile Type.
     * The profile type of the device. Possible values:RegisteredDevice (default)SecureVMPrinterSharedIoT
     */
    @SerializedName(value = "profileType", alternate = {"ProfileType"})
    @Expose
    public String profileType;

    /**
     * The Registration Date Time.
     * 
     */
    @SerializedName(value = "registrationDateTime", alternate = {"RegistrationDateTime"})
    @Expose
    public java.util.Calendar registrationDateTime;

    /**
     * The System Labels.
     * List of labels applied to the device by the system.
     */
    @SerializedName(value = "systemLabels", alternate = {"SystemLabels"})
    @Expose
    public java.util.List<String> systemLabels;

    /**
     * The Trust Type.
     * Type of trust for the joined device. Read-only. Possible values: Workplace - indicates bring your own personal devicesAzureAd - Cloud only joined devicesServerAd - on-premises domain joined devices joined to Azure AD. For more details, see Introduction to device management in Azure Active Directory
     */
    @SerializedName(value = "trustType", alternate = {"TrustType"})
    @Expose
    public String trustType;

    /**
     * The Kind.
     * 
     */
    @SerializedName(value = "kind", alternate = {"Kind"})
    @Expose
    public String kind;

    /**
     * The Manufacturer.
     * Manufacturer of the device. Read-only.
     */
    @SerializedName(value = "manufacturer", alternate = {"Manufacturer"})
    @Expose
    public String manufacturer;

    /**
     * The Model.
     * Model of the device. Read-only.
     */
    @SerializedName(value = "model", alternate = {"Model"})
    @Expose
    public String model;

    /**
     * The Name.
     * 
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
    public String name;

    /**
     * The Platform.
     * 
     */
    @SerializedName(value = "platform", alternate = {"Platform"})
    @Expose
    public String platform;

    /**
     * The Status.
     * 
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
    public String status;

    /**
     * The Member Of.
     * Groups that this group is a member of. HTTP Methods: GET (supported for all groups). Read-only. Nullable.
     */
    public DirectoryObjectCollectionPage memberOf;

    /**
     * The Registered Owners.
     * The user that cloud joined the device or registered their personal device. The registered owner is set at the time of registration. Currently, there can be only one owner. Read-only. Nullable.
     */
    public DirectoryObjectCollectionPage registeredOwners;

    /**
     * The Registered Users.
     * Collection of registered users of the device. For cloud joined devices and registered personal devices, registered users are set to the same value as registered owners at the time of registration. Read-only. Nullable.
     */
    public DirectoryObjectCollectionPage registeredUsers;

    /**
     * The Transitive Member Of.
     * 
     */
    public DirectoryObjectCollectionPage transitiveMemberOf;

    /**
     * The Extensions.
     * The collection of open extensions defined for the device. Read-only. Nullable.
     */
    @SerializedName(value = "extensions", alternate = {"Extensions"})
    @Expose
    public ExtensionCollectionPage extensions;

    /**
     * The Commands.
     * 
     */
    @SerializedName(value = "commands", alternate = {"Commands"})
    @Expose
    public CommandCollectionPage commands;


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


        if (json.has("memberOf")) {
            memberOf = serializer.deserializeObject(json.get("memberOf").toString(), DirectoryObjectCollectionPage.class);
        }

        if (json.has("registeredOwners")) {
            registeredOwners = serializer.deserializeObject(json.get("registeredOwners").toString(), DirectoryObjectCollectionPage.class);
        }

        if (json.has("registeredUsers")) {
            registeredUsers = serializer.deserializeObject(json.get("registeredUsers").toString(), DirectoryObjectCollectionPage.class);
        }

        if (json.has("transitiveMemberOf")) {
            transitiveMemberOf = serializer.deserializeObject(json.get("transitiveMemberOf").toString(), DirectoryObjectCollectionPage.class);
        }

        if (json.has("extensions")) {
            extensions = serializer.deserializeObject(json.get("extensions").toString(), ExtensionCollectionPage.class);
        }

        if (json.has("commands")) {
            commands = serializer.deserializeObject(json.get("commands").toString(), CommandCollectionPage.class);
        }
    }
}
