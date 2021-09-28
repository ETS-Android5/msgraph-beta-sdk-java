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
import com.microsoft.graph.models.AlternativeSecurityId;
import com.microsoft.graph.models.OnPremisesExtensionAttributes;
import com.microsoft.graph.models.UsageRight;
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.models.Extension;
import com.microsoft.graph.models.Command;
import com.microsoft.graph.requests.UsageRightCollectionPage;
import com.microsoft.graph.requests.DirectoryObjectCollectionPage;
import com.microsoft.graph.requests.ExtensionCollectionPage;
import com.microsoft.graph.requests.CommandCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device.
 */
public class Device extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Account Enabled.
     * true if the account is enabled; otherwise, false. Required. Default is true.  Supports $filter (eq, ne, NOT, in). Only callers in Global Administrator and Cloud Device Administrator roles can set this property.
     */
    @SerializedName(value = "accountEnabled", alternate = {"AccountEnabled"})
    @Expose
	@Nullable
    public Boolean accountEnabled;

    /**
     * The Alternative Security Ids.
     * For internal use only. Not nullable. Supports $filter (eq, NOT, ge, le).
     */
    @SerializedName(value = "alternativeSecurityIds", alternate = {"AlternativeSecurityIds"})
    @Expose
	@Nullable
    public java.util.List<AlternativeSecurityId> alternativeSecurityIds;

    /**
     * The Approximate Last Sign In Date Time.
     * The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. Supports $filter (eq, ne, NOT, ge, le) and $orderBy.
     */
    @SerializedName(value = "approximateLastSignInDateTime", alternate = {"ApproximateLastSignInDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime approximateLastSignInDateTime;

    /**
     * The Compliance Expiration Date Time.
     * The timestamp when the device is no longer deemed compliant. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    @SerializedName(value = "complianceExpirationDateTime", alternate = {"ComplianceExpirationDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime complianceExpirationDateTime;

    /**
     * The Device Category.
     * User-defined property set by Intune to automatically add devices to groups and simplify managing devices.
     */
    @SerializedName(value = "deviceCategory", alternate = {"DeviceCategory"})
    @Expose
	@Nullable
    public String deviceCategory;

    /**
     * The Device Id.
     * Unique identifier set by Azure Device Registration Service at the time of registration. Supports $filter (eq, ne, NOT, startsWith).
     */
    @SerializedName(value = "deviceId", alternate = {"DeviceId"})
    @Expose
	@Nullable
    public String deviceId;

    /**
     * The Device Metadata.
     * For internal use only. Set to null.
     */
    @SerializedName(value = "deviceMetadata", alternate = {"DeviceMetadata"})
    @Expose
	@Nullable
    public String deviceMetadata;

    /**
     * The Device Ownership.
     * Ownership of the device. This property is set by Intune. Possible values are: unknown, company, personal.
     */
    @SerializedName(value = "deviceOwnership", alternate = {"DeviceOwnership"})
    @Expose
	@Nullable
    public String deviceOwnership;

    /**
     * The Device Version.
     * For internal use only.
     */
    @SerializedName(value = "deviceVersion", alternate = {"DeviceVersion"})
    @Expose
	@Nullable
    public Integer deviceVersion;

    /**
     * The Display Name.
     * The display name for the device. Required. Supports $filter (eq, ne, NOT, ge, le, in, startsWith), $search, and $orderBy.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Domain Name.
     * The on-premises domain name of Hybrid Azure AD joined devices. This property is set by Intune.
     */
    @SerializedName(value = "domainName", alternate = {"DomainName"})
    @Expose
	@Nullable
    public String domainName;

    /**
     * The Enrollment Profile Name.
     * Enrollment profile applied to the device. For example, Apple Device Enrollment Profile, Device enrollment - Corporate device identifiers, or Windows Autopilot profile name. This property is set by Intune.
     */
    @SerializedName(value = "enrollmentProfileName", alternate = {"EnrollmentProfileName"})
    @Expose
	@Nullable
    public String enrollmentProfileName;

    /**
     * The Enrollment Type.
     * Enrollment type of the device. This property is set by Intune. Possible values are: unknown, userEnrollment, deviceEnrollmentManager, appleBulkWithUser, appleBulkWithoutUser, windowsAzureADJoin, windowsBulkUserless, windowsAutoEnrollment, windowsBulkAzureDomainJoin, windowsCoManagement.
     */
    @SerializedName(value = "enrollmentType", alternate = {"EnrollmentType"})
    @Expose
	@Nullable
    public String enrollmentType;

    /**
     * The Extension Attributes.
     * 
     */
    @SerializedName(value = "extensionAttributes", alternate = {"ExtensionAttributes"})
    @Expose
	@Nullable
    public OnPremisesExtensionAttributes extensionAttributes;

    /**
     * The Hostnames.
     * List of hostNames for the device.
     */
    @SerializedName(value = "hostnames", alternate = {"Hostnames"})
    @Expose
	@Nullable
    public java.util.List<String> hostnames;

    /**
     * The Is Compliant.
     * true if the device complies with Mobile Device Management (MDM) policies; otherwise, false. Read-only. This can only be updated by Intune for any device OS type or by an approved MDM app for Windows OS devices. Supports $filter (eq, ne, NOT).
     */
    @SerializedName(value = "isCompliant", alternate = {"IsCompliant"})
    @Expose
	@Nullable
    public Boolean isCompliant;

    /**
     * The Is Managed.
     * true if the device is managed by a Mobile Device Management (MDM) app; otherwise, false. This can only be updated by Intune for any device OS type or by an approved MDM app for Windows OS devices. Supports $filter (eq, ne, NOT).
     */
    @SerializedName(value = "isManaged", alternate = {"IsManaged"})
    @Expose
	@Nullable
    public Boolean isManaged;

    /**
     * The Is Rooted.
     * true if device is rooted; false if device is jail-broken. This can only be updated by Intune.
     */
    @SerializedName(value = "isRooted", alternate = {"IsRooted"})
    @Expose
	@Nullable
    public Boolean isRooted;

    /**
     * The Management Type.
     * Management channel of the device.  This property is set by Intune. Possible values are: eas, mdm, easMdm, intuneClient, easIntuneClient, configurationManagerClient, configurationManagerClientMdm, configurationManagerClientMdmEas, unknown, jamf, googleCloudDevicePolicyController.
     */
    @SerializedName(value = "managementType", alternate = {"ManagementType"})
    @Expose
	@Nullable
    public String managementType;

    /**
     * The On Premises Last Sync Date Time.
     * The last time at which the object was synced with the on-premises directory. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z Read-only. Supports $filter (eq, ne, NOT, ge, le, in).
     */
    @SerializedName(value = "onPremisesLastSyncDateTime", alternate = {"OnPremisesLastSyncDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime onPremisesLastSyncDateTime;

    /**
     * The On Premises Sync Enabled.
     * true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory (default). Read-only. Supports $filter (eq, ne, NOT, in).
     */
    @SerializedName(value = "onPremisesSyncEnabled", alternate = {"OnPremisesSyncEnabled"})
    @Expose
	@Nullable
    public Boolean onPremisesSyncEnabled;

    /**
     * The Operating System.
     * The type of operating system on the device. Required. Supports $filter (eq, ne, NOT, ge, le, startsWith).
     */
    @SerializedName(value = "operatingSystem", alternate = {"OperatingSystem"})
    @Expose
	@Nullable
    public String operatingSystem;

    /**
     * The Operating System Version.
     * The version of the operating system on the device. Required. Supports $filter (eq, ne, NOT, ge, le, startsWith).
     */
    @SerializedName(value = "operatingSystemVersion", alternate = {"OperatingSystemVersion"})
    @Expose
	@Nullable
    public String operatingSystemVersion;

    /**
     * The Physical Ids.
     * For internal use only. Not nullable. Supports $filter (eq, NOT, ge, le, startsWith).
     */
    @SerializedName(value = "physicalIds", alternate = {"PhysicalIds"})
    @Expose
	@Nullable
    public java.util.List<String> physicalIds;

    /**
     * The Profile Type.
     * The profile type of the device. Possible values: RegisteredDevice (default), SecureVM, Printer, Shared, IoT.
     */
    @SerializedName(value = "profileType", alternate = {"ProfileType"})
    @Expose
	@Nullable
    public String profileType;

    /**
     * The Registration Date Time.
     * Date and time of when the device was registered. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    @SerializedName(value = "registrationDateTime", alternate = {"RegistrationDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime registrationDateTime;

    /**
     * The System Labels.
     * List of labels applied to the device by the system.
     */
    @SerializedName(value = "systemLabels", alternate = {"SystemLabels"})
    @Expose
	@Nullable
    public java.util.List<String> systemLabels;

    /**
     * The Trust Type.
     * Type of trust for the joined device. Read-only. Possible values:  Workplace (indicates bring your own personal devices), AzureAd (Cloud only joined devices), ServerAd (on-premises domain joined devices joined to Azure AD). For more details, see Introduction to device management in Azure Active Directory
     */
    @SerializedName(value = "trustType", alternate = {"TrustType"})
    @Expose
	@Nullable
    public String trustType;

    /**
     * The Kind.
     * Form factor of device. Only returned if user signs in with a Microsoft account as part of Project Rome.
     */
    @SerializedName(value = "kind", alternate = {"Kind"})
    @Expose
	@Nullable
    public String kind;

    /**
     * The Manufacturer.
     * Manufacturer of the device. Read-only.
     */
    @SerializedName(value = "manufacturer", alternate = {"Manufacturer"})
    @Expose
	@Nullable
    public String manufacturer;

    /**
     * The Model.
     * Model of the device. Read-only.
     */
    @SerializedName(value = "model", alternate = {"Model"})
    @Expose
	@Nullable
    public String model;

    /**
     * The Name.
     * Friendly name of a device. Only returned if user signs in with a Microsoft account as part of Project Rome.
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Platform.
     * Platform of device. Only returned if user signs in with a Microsoft account as part of Project Rome. Only returned if user signs in with a Microsoft account as part of Project Rome.
     */
    @SerializedName(value = "platform", alternate = {"Platform"})
    @Expose
	@Nullable
    public String platform;

    /**
     * The Status.
     * Device is online or offline. Only returned if user signs in with a Microsoft account as part of Project Rome.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public String status;

    /**
     * The Usage Rights.
     * Represents the usage rights a device has been granted.
     */
    @SerializedName(value = "usageRights", alternate = {"UsageRights"})
    @Expose
	@Nullable
    public UsageRightCollectionPage usageRights;

    /**
     * The Member Of.
     * Groups that this device is a member of. Read-only. Nullable. Supports $expand.
     */
	@Nullable
    public DirectoryObjectCollectionPage memberOf;

    /**
     * The Registered Owners.
     * The user that cloud joined the device or registered their personal device. The registered owner is set at the time of registration. Currently, there can be only one owner. Read-only. Nullable. Supports $expand.
     */
	@Nullable
    public DirectoryObjectCollectionPage registeredOwners;

    /**
     * The Registered Users.
     * Collection of registered users of the device. For cloud joined devices and registered personal devices, registered users are set to the same value as registered owners at the time of registration. Read-only. Nullable. Supports $expand.
     */
	@Nullable
    public DirectoryObjectCollectionPage registeredUsers;

    /**
     * The Transitive Member Of.
     * Groups that the device is a member of. This operation is transitive. Supports $expand.
     */
	@Nullable
    public DirectoryObjectCollectionPage transitiveMemberOf;

    /**
     * The Extensions.
     * The collection of open extensions defined for the device. Read-only. Nullable.
     */
    @SerializedName(value = "extensions", alternate = {"Extensions"})
    @Expose
	@Nullable
    public ExtensionCollectionPage extensions;

    /**
     * The Commands.
     * Set of commands sent to this device.
     */
    @SerializedName(value = "commands", alternate = {"Commands"})
    @Expose
	@Nullable
    public CommandCollectionPage commands;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("usageRights")) {
            usageRights = serializer.deserializeObject(json.get("usageRights"), UsageRightCollectionPage.class);
        }

        if (json.has("memberOf")) {
            memberOf = serializer.deserializeObject(json.get("memberOf"), DirectoryObjectCollectionPage.class);
        }

        if (json.has("registeredOwners")) {
            registeredOwners = serializer.deserializeObject(json.get("registeredOwners"), DirectoryObjectCollectionPage.class);
        }

        if (json.has("registeredUsers")) {
            registeredUsers = serializer.deserializeObject(json.get("registeredUsers"), DirectoryObjectCollectionPage.class);
        }

        if (json.has("transitiveMemberOf")) {
            transitiveMemberOf = serializer.deserializeObject(json.get("transitiveMemberOf"), DirectoryObjectCollectionPage.class);
        }

        if (json.has("extensions")) {
            extensions = serializer.deserializeObject(json.get("extensions"), ExtensionCollectionPage.class);
        }

        if (json.has("commands")) {
            commands = serializer.deserializeObject(json.get("commands"), CommandCollectionPage.class);
        }
    }
}
