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
import com.microsoft.graph.models.CloudPcRemoteActionResult;
import com.microsoft.graph.models.ChassisType;
import com.microsoft.graph.models.ChromeOSDeviceProperty;
import com.microsoft.graph.models.ComplianceState;
import com.microsoft.graph.models.ConfigurationManagerClientEnabledFeatures;
import com.microsoft.graph.models.ConfigurationManagerClientHealthState;
import com.microsoft.graph.models.ConfigurationManagerClientInformation;
import com.microsoft.graph.models.DeviceActionResult;
import com.microsoft.graph.models.DeviceEnrollmentType;
import com.microsoft.graph.models.DeviceHealthAttestationState;
import com.microsoft.graph.models.DeviceRegistrationState;
import com.microsoft.graph.models.DeviceType;
import com.microsoft.graph.models.DeviceManagementExchangeAccessState;
import com.microsoft.graph.models.DeviceManagementExchangeAccessStateReason;
import com.microsoft.graph.models.HardwareInformation;
import com.microsoft.graph.models.JoinType;
import com.microsoft.graph.models.LostModeState;
import com.microsoft.graph.models.ManagedDeviceOwnerType;
import com.microsoft.graph.models.ManagementAgentType;
import com.microsoft.graph.models.ManagedDeviceManagementFeatures;
import com.microsoft.graph.models.ManagementState;
import com.microsoft.graph.models.OwnerType;
import com.microsoft.graph.models.ManagedDevicePartnerReportedHealthState;
import com.microsoft.graph.models.ManagedDeviceArchitecture;
import com.microsoft.graph.models.LoggedOnUser;
import com.microsoft.graph.models.AssignmentFilterEvaluationStatusDetails;
import com.microsoft.graph.models.DeviceCompliancePolicyState;
import com.microsoft.graph.models.DeviceConfigurationState;
import com.microsoft.graph.models.ManagedDeviceMobileAppConfigurationState;
import com.microsoft.graph.models.SecurityBaselineState;
import com.microsoft.graph.models.DetectedApp;
import com.microsoft.graph.models.DeviceCategory;
import com.microsoft.graph.models.DeviceLogCollectionResponse;
import com.microsoft.graph.models.User;
import com.microsoft.graph.models.WindowsProtectionState;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.AssignmentFilterEvaluationStatusDetailsCollectionPage;
import com.microsoft.graph.requests.DeviceCompliancePolicyStateCollectionPage;
import com.microsoft.graph.requests.DeviceConfigurationStateCollectionPage;
import com.microsoft.graph.requests.ManagedDeviceMobileAppConfigurationStateCollectionPage;
import com.microsoft.graph.requests.SecurityBaselineStateCollectionPage;
import com.microsoft.graph.requests.DetectedAppCollectionPage;
import com.microsoft.graph.requests.DeviceLogCollectionResponseCollectionPage;
import com.microsoft.graph.requests.UserCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device.
 */
public class ManagedDevice extends Entity implements IJsonBackedObject {


    /**
     * The Cloud Pc Remote Action Results.
     * 
     */
    @SerializedName(value = "cloudPcRemoteActionResults", alternate = {"CloudPcRemoteActionResults"})
    @Expose
	@Nullable
    public java.util.List<CloudPcRemoteActionResult> cloudPcRemoteActionResults;

    /**
     * The Aad Registered.
     * Whether the device is Azure Active Directory registered. This property is read-only.
     */
    @SerializedName(value = "aadRegistered", alternate = {"AadRegistered"})
    @Expose
	@Nullable
    public Boolean aadRegistered;

    /**
     * The Activation Lock Bypass Code.
     * Code that allows the Activation Lock on a device to be bypassed. This property is read-only.
     */
    @SerializedName(value = "activationLockBypassCode", alternate = {"ActivationLockBypassCode"})
    @Expose
	@Nullable
    public String activationLockBypassCode;

    /**
     * The Android Security Patch Level.
     * Android security patch level. This property is read-only.
     */
    @SerializedName(value = "androidSecurityPatchLevel", alternate = {"AndroidSecurityPatchLevel"})
    @Expose
	@Nullable
    public String androidSecurityPatchLevel;

    /**
     * The Autopilot Enrolled.
     * Reports if the managed device is enrolled via auto-pilot. This property is read-only.
     */
    @SerializedName(value = "autopilotEnrolled", alternate = {"AutopilotEnrolled"})
    @Expose
	@Nullable
    public Boolean autopilotEnrolled;

    /**
     * The Azure Active Directory Device Id.
     * The unique identifier for the Azure Active Directory device. Read only. This property is read-only.
     */
    @SerializedName(value = "azureActiveDirectoryDeviceId", alternate = {"AzureActiveDirectoryDeviceId"})
    @Expose
	@Nullable
    public String azureActiveDirectoryDeviceId;

    /**
     * The Azure ADDevice Id.
     * The unique identifier for the Azure Active Directory device. Read only. This property is read-only.
     */
    @SerializedName(value = "azureADDeviceId", alternate = {"AzureADDeviceId"})
    @Expose
	@Nullable
    public String azureADDeviceId;

    /**
     * The Azure ADRegistered.
     * Whether the device is Azure Active Directory registered. This property is read-only.
     */
    @SerializedName(value = "azureADRegistered", alternate = {"AzureADRegistered"})
    @Expose
	@Nullable
    public Boolean azureADRegistered;

    /**
     * The Chassis Type.
     * Chassis type of the device. This property is read-only. Possible values are: unknown, desktop, laptop, worksWorkstation, enterpriseServer, phone, tablet, mobileOther, mobileUnknown.
     */
    @SerializedName(value = "chassisType", alternate = {"ChassisType"})
    @Expose
	@Nullable
    public ChassisType chassisType;

    /**
     * The Chrome OSDevice Info.
     * List of properties of the ChromeOS Device.
     */
    @SerializedName(value = "chromeOSDeviceInfo", alternate = {"ChromeOSDeviceInfo"})
    @Expose
	@Nullable
    public java.util.List<ChromeOSDeviceProperty> chromeOSDeviceInfo;

    /**
     * The Compliance Grace Period Expiration Date Time.
     * The DateTime when device compliance grace period expires. This property is read-only.
     */
    @SerializedName(value = "complianceGracePeriodExpirationDateTime", alternate = {"ComplianceGracePeriodExpirationDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime complianceGracePeriodExpirationDateTime;

    /**
     * The Compliance State.
     * Compliance state of the device. This property is read-only. Possible values are: unknown, compliant, noncompliant, conflict, error, inGracePeriod, configManager.
     */
    @SerializedName(value = "complianceState", alternate = {"ComplianceState"})
    @Expose
	@Nullable
    public ComplianceState complianceState;

    /**
     * The Configuration Manager Client Enabled Features.
     * ConfigrMgr client enabled features. This property is read-only.
     */
    @SerializedName(value = "configurationManagerClientEnabledFeatures", alternate = {"ConfigurationManagerClientEnabledFeatures"})
    @Expose
	@Nullable
    public ConfigurationManagerClientEnabledFeatures configurationManagerClientEnabledFeatures;

    /**
     * The Configuration Manager Client Health State.
     * Configuration manager client health state, valid only for devices managed by MDM/ConfigMgr Agent
     */
    @SerializedName(value = "configurationManagerClientHealthState", alternate = {"ConfigurationManagerClientHealthState"})
    @Expose
	@Nullable
    public ConfigurationManagerClientHealthState configurationManagerClientHealthState;

    /**
     * The Configuration Manager Client Information.
     * Configuration manager client information, valid only for devices managed, duel-managed or tri-managed by ConfigMgr Agent
     */
    @SerializedName(value = "configurationManagerClientInformation", alternate = {"ConfigurationManagerClientInformation"})
    @Expose
	@Nullable
    public ConfigurationManagerClientInformation configurationManagerClientInformation;

    /**
     * The Device Action Results.
     * List of ComplexType deviceActionResult objects. This property is read-only.
     */
    @SerializedName(value = "deviceActionResults", alternate = {"DeviceActionResults"})
    @Expose
	@Nullable
    public java.util.List<DeviceActionResult> deviceActionResults;

    /**
     * The Device Category Display Name.
     * Device category display name. This property is read-only.
     */
    @SerializedName(value = "deviceCategoryDisplayName", alternate = {"DeviceCategoryDisplayName"})
    @Expose
	@Nullable
    public String deviceCategoryDisplayName;

    /**
     * The Device Enrollment Type.
     * Enrollment type of the device. This property is read-only. Possible values are: unknown, userEnrollment, deviceEnrollmentManager, appleBulkWithUser, appleBulkWithoutUser, windowsAzureADJoin, windowsBulkUserless, windowsAutoEnrollment, windowsBulkAzureDomainJoin, windowsCoManagement, windowsAzureADJoinUsingDeviceAuth, appleUserEnrollment, appleUserEnrollmentWithServiceAccount, azureAdJoinUsingAzureVmExtension, androidEnterpriseDedicatedDevice, androidEnterpriseFullyManaged, androidEnterpriseCorporateWorkProfile.
     */
    @SerializedName(value = "deviceEnrollmentType", alternate = {"DeviceEnrollmentType"})
    @Expose
	@Nullable
    public DeviceEnrollmentType deviceEnrollmentType;

    /**
     * The Device Health Attestation State.
     * The device health attestation state. This property is read-only.
     */
    @SerializedName(value = "deviceHealthAttestationState", alternate = {"DeviceHealthAttestationState"})
    @Expose
	@Nullable
    public DeviceHealthAttestationState deviceHealthAttestationState;

    /**
     * The Device Name.
     * Name of the device. This property is read-only.
     */
    @SerializedName(value = "deviceName", alternate = {"DeviceName"})
    @Expose
	@Nullable
    public String deviceName;

    /**
     * The Device Registration State.
     * Device registration state. This property is read-only. Possible values are: notRegistered, registered, revoked, keyConflict, approvalPending, certificateReset, notRegisteredPendingEnrollment, unknown.
     */
    @SerializedName(value = "deviceRegistrationState", alternate = {"DeviceRegistrationState"})
    @Expose
	@Nullable
    public DeviceRegistrationState deviceRegistrationState;

    /**
     * The Device Type.
     * Platform of the device. This property is read-only. Possible values are: desktop, windowsRT, winMO6, nokia, windowsPhone, mac, winCE, winEmbedded, iPhone, iPad, iPod, android, iSocConsumer, unix, macMDM, holoLens, surfaceHub, androidForWork, androidEnterprise, windows10x, androidnGMS, chromeOS, linux, blackberry, palm, unknown, cloudPC.
     */
    @SerializedName(value = "deviceType", alternate = {"DeviceType"})
    @Expose
	@Nullable
    public DeviceType deviceType;

    /**
     * The Eas Activated.
     * Whether the device is Exchange ActiveSync activated. This property is read-only.
     */
    @SerializedName(value = "easActivated", alternate = {"EasActivated"})
    @Expose
	@Nullable
    public Boolean easActivated;

    /**
     * The Eas Activation Date Time.
     * Exchange ActivationSync activation time of the device. This property is read-only.
     */
    @SerializedName(value = "easActivationDateTime", alternate = {"EasActivationDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime easActivationDateTime;

    /**
     * The Eas Device Id.
     * Exchange ActiveSync Id of the device. This property is read-only.
     */
    @SerializedName(value = "easDeviceId", alternate = {"EasDeviceId"})
    @Expose
	@Nullable
    public String easDeviceId;

    /**
     * The Email Address.
     * Email(s) for the user associated with the device. This property is read-only.
     */
    @SerializedName(value = "emailAddress", alternate = {"EmailAddress"})
    @Expose
	@Nullable
    public String emailAddress;

    /**
     * The Enrolled Date Time.
     * Enrollment time of the device. This property is read-only.
     */
    @SerializedName(value = "enrolledDateTime", alternate = {"EnrolledDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime enrolledDateTime;

    /**
     * The Enrollment Profile Name.
     * Name of the enrollment profile assigned to the device. Default value is empty string, indicating no enrollment profile was assgined. This property is read-only.
     */
    @SerializedName(value = "enrollmentProfileName", alternate = {"EnrollmentProfileName"})
    @Expose
	@Nullable
    public String enrollmentProfileName;

    /**
     * The Ethernet Mac Address.
     * Ethernet MAC. This property is read-only.
     */
    @SerializedName(value = "ethernetMacAddress", alternate = {"EthernetMacAddress"})
    @Expose
	@Nullable
    public String ethernetMacAddress;

    /**
     * The Exchange Access State.
     * The Access State of the device in Exchange. This property is read-only. Possible values are: none, unknown, allowed, blocked, quarantined.
     */
    @SerializedName(value = "exchangeAccessState", alternate = {"ExchangeAccessState"})
    @Expose
	@Nullable
    public DeviceManagementExchangeAccessState exchangeAccessState;

    /**
     * The Exchange Access State Reason.
     * The reason for the device's access state in Exchange. This property is read-only. Possible values are: none, unknown, exchangeGlobalRule, exchangeIndividualRule, exchangeDeviceRule, exchangeUpgrade, exchangeMailboxPolicy, other, compliant, notCompliant, notEnrolled, unknownLocation, mfaRequired, azureADBlockDueToAccessPolicy, compromisedPassword, deviceNotKnownWithManagedApp.
     */
    @SerializedName(value = "exchangeAccessStateReason", alternate = {"ExchangeAccessStateReason"})
    @Expose
	@Nullable
    public DeviceManagementExchangeAccessStateReason exchangeAccessStateReason;

    /**
     * The Exchange Last Successful Sync Date Time.
     * Last time the device contacted Exchange. This property is read-only.
     */
    @SerializedName(value = "exchangeLastSuccessfulSyncDateTime", alternate = {"ExchangeLastSuccessfulSyncDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime exchangeLastSuccessfulSyncDateTime;

    /**
     * The Free Storage Space In Bytes.
     * Free Storage in Bytes. This property is read-only.
     */
    @SerializedName(value = "freeStorageSpaceInBytes", alternate = {"FreeStorageSpaceInBytes"})
    @Expose
	@Nullable
    public Long freeStorageSpaceInBytes;

    /**
     * The Hardware Information.
     * The hardward details for the device.  Includes information such as storage space, manufacturer, serial number, etc. This property is read-only.
     */
    @SerializedName(value = "hardwareInformation", alternate = {"HardwareInformation"})
    @Expose
	@Nullable
    public HardwareInformation hardwareInformation;

    /**
     * The Iccid.
     * Integrated Circuit Card Identifier, it is A SIM card's unique identification number. This property is read-only.
     */
    @SerializedName(value = "iccid", alternate = {"Iccid"})
    @Expose
	@Nullable
    public String iccid;

    /**
     * The Imei.
     * IMEI. This property is read-only.
     */
    @SerializedName(value = "imei", alternate = {"Imei"})
    @Expose
	@Nullable
    public String imei;

    /**
     * The Is Encrypted.
     * Device encryption status. This property is read-only.
     */
    @SerializedName(value = "isEncrypted", alternate = {"IsEncrypted"})
    @Expose
	@Nullable
    public Boolean isEncrypted;

    /**
     * The Is Supervised.
     * Device supervised status. This property is read-only.
     */
    @SerializedName(value = "isSupervised", alternate = {"IsSupervised"})
    @Expose
	@Nullable
    public Boolean isSupervised;

    /**
     * The Jail Broken.
     * whether the device is jail broken or rooted. This property is read-only.
     */
    @SerializedName(value = "jailBroken", alternate = {"JailBroken"})
    @Expose
	@Nullable
    public String jailBroken;

    /**
     * The Join Type.
     * Device join type. Possible values are: unknown, azureADJoined, azureADRegistered, hybridAzureADJoined.
     */
    @SerializedName(value = "joinType", alternate = {"JoinType"})
    @Expose
	@Nullable
    public JoinType joinType;

    /**
     * The Last Sync Date Time.
     * The date and time that the device last completed a successful sync with Intune. This property is read-only.
     */
    @SerializedName(value = "lastSyncDateTime", alternate = {"LastSyncDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastSyncDateTime;

    /**
     * The Lost Mode State.
     * Indicates if Lost mode is enabled or disabled. This property is read-only. Possible values are: disabled, enabled.
     */
    @SerializedName(value = "lostModeState", alternate = {"LostModeState"})
    @Expose
	@Nullable
    public LostModeState lostModeState;

    /**
     * The Managed Device Name.
     * Automatically generated name to identify a device. Can be overwritten to a user friendly name.
     */
    @SerializedName(value = "managedDeviceName", alternate = {"ManagedDeviceName"})
    @Expose
	@Nullable
    public String managedDeviceName;

    /**
     * The Managed Device Owner Type.
     * Ownership of the device. Can be 'company' or 'personal'. Possible values are: unknown, company, personal.
     */
    @SerializedName(value = "managedDeviceOwnerType", alternate = {"ManagedDeviceOwnerType"})
    @Expose
	@Nullable
    public ManagedDeviceOwnerType managedDeviceOwnerType;

    /**
     * The Management Agent.
     * Management channel of the device. Intune, EAS, etc. This property is read-only. Possible values are: eas, mdm, easMdm, intuneClient, easIntuneClient, configurationManagerClient, configurationManagerClientMdm, configurationManagerClientMdmEas, unknown, jamf, googleCloudDevicePolicyController, microsoft365ManagedMdm, msSense, intuneAosp.
     */
    @SerializedName(value = "managementAgent", alternate = {"ManagementAgent"})
    @Expose
	@Nullable
    public ManagementAgentType managementAgent;

    /**
     * The Management Certificate Expiration Date.
     * Reports device management certificate expiration date. This property is read-only.
     */
    @SerializedName(value = "managementCertificateExpirationDate", alternate = {"ManagementCertificateExpirationDate"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime managementCertificateExpirationDate;

    /**
     * The Management Features.
     * Device management features. Possible values are: none, microsoftManagedDesktop.
     */
    @SerializedName(value = "managementFeatures", alternate = {"ManagementFeatures"})
    @Expose
	@Nullable
    public ManagedDeviceManagementFeatures managementFeatures;

    /**
     * The Management State.
     * Management state of the device. This property is read-only. Possible values are: managed, retirePending, retireFailed, wipePending, wipeFailed, unhealthy, deletePending, retireIssued, wipeIssued, wipeCanceled, retireCanceled, discovered.
     */
    @SerializedName(value = "managementState", alternate = {"ManagementState"})
    @Expose
	@Nullable
    public ManagementState managementState;

    /**
     * The Manufacturer.
     * Manufacturer of the device. This property is read-only.
     */
    @SerializedName(value = "manufacturer", alternate = {"Manufacturer"})
    @Expose
	@Nullable
    public String manufacturer;

    /**
     * The Meid.
     * MEID. This property is read-only.
     */
    @SerializedName(value = "meid", alternate = {"Meid"})
    @Expose
	@Nullable
    public String meid;

    /**
     * The Model.
     * Model of the device. This property is read-only.
     */
    @SerializedName(value = "model", alternate = {"Model"})
    @Expose
	@Nullable
    public String model;

    /**
     * The Notes.
     * Notes on the device created by IT Admin
     */
    @SerializedName(value = "notes", alternate = {"Notes"})
    @Expose
	@Nullable
    public String notes;

    /**
     * The Operating System.
     * Operating system of the device. Windows, iOS, etc. This property is read-only.
     */
    @SerializedName(value = "operatingSystem", alternate = {"OperatingSystem"})
    @Expose
	@Nullable
    public String operatingSystem;

    /**
     * The Os Version.
     * Operating system version of the device. This property is read-only.
     */
    @SerializedName(value = "osVersion", alternate = {"OsVersion"})
    @Expose
	@Nullable
    public String osVersion;

    /**
     * The Owner Type.
     * Ownership of the device. Can be 'company' or 'personal'. Possible values are: unknown, company, personal.
     */
    @SerializedName(value = "ownerType", alternate = {"OwnerType"})
    @Expose
	@Nullable
    public OwnerType ownerType;

    /**
     * The Partner Reported Threat State.
     * Indicates the threat state of a device when a Mobile Threat Defense partner is in use by the account and device. Read Only. This property is read-only. Possible values are: unknown, activated, deactivated, secured, lowSeverity, mediumSeverity, highSeverity, unresponsive, compromised, misconfigured.
     */
    @SerializedName(value = "partnerReportedThreatState", alternate = {"PartnerReportedThreatState"})
    @Expose
	@Nullable
    public ManagedDevicePartnerReportedHealthState partnerReportedThreatState;

    /**
     * The Phone Number.
     * Phone number of the device. This property is read-only.
     */
    @SerializedName(value = "phoneNumber", alternate = {"PhoneNumber"})
    @Expose
	@Nullable
    public String phoneNumber;

    /**
     * The Physical Memory In Bytes.
     * Total Memory in Bytes. This property is read-only.
     */
    @SerializedName(value = "physicalMemoryInBytes", alternate = {"PhysicalMemoryInBytes"})
    @Expose
	@Nullable
    public Long physicalMemoryInBytes;

    /**
     * The Prefer Mdm Over Group Policy Applied Date Time.
     * Reports the DateTime the preferMdmOverGroupPolicy setting was set.  When set, the Intune MDM settings will override Group Policy settings if there is a conflict. Read Only. This property is read-only.
     */
    @SerializedName(value = "preferMdmOverGroupPolicyAppliedDateTime", alternate = {"PreferMdmOverGroupPolicyAppliedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime preferMdmOverGroupPolicyAppliedDateTime;

    /**
     * The Processor Architecture.
     * Processor architecture. This property is read-only. Possible values are: unknown, x86, x64, arm, arM64.
     */
    @SerializedName(value = "processorArchitecture", alternate = {"ProcessorArchitecture"})
    @Expose
	@Nullable
    public ManagedDeviceArchitecture processorArchitecture;

    /**
     * The Remote Assistance Session Error Details.
     * An error string that identifies issues when creating Remote Assistance session objects. This property is read-only.
     */
    @SerializedName(value = "remoteAssistanceSessionErrorDetails", alternate = {"RemoteAssistanceSessionErrorDetails"})
    @Expose
	@Nullable
    public String remoteAssistanceSessionErrorDetails;

    /**
     * The Remote Assistance Session Url.
     * Url that allows a Remote Assistance session to be established with the device. This property is read-only.
     */
    @SerializedName(value = "remoteAssistanceSessionUrl", alternate = {"RemoteAssistanceSessionUrl"})
    @Expose
	@Nullable
    public String remoteAssistanceSessionUrl;

    /**
     * The Require User Enrollment Approval.
     * Reports if the managed iOS device is user approval enrollment. This property is read-only.
     */
    @SerializedName(value = "requireUserEnrollmentApproval", alternate = {"RequireUserEnrollmentApproval"})
    @Expose
	@Nullable
    public Boolean requireUserEnrollmentApproval;

    /**
     * The Retire After Date Time.
     * Indicates the time after when a device will be auto retired because of scheduled action. This property is read-only.
     */
    @SerializedName(value = "retireAfterDateTime", alternate = {"RetireAfterDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime retireAfterDateTime;

    /**
     * The Role Scope Tag Ids.
     * List of Scope Tag IDs for this Device instance.
     */
    @SerializedName(value = "roleScopeTagIds", alternate = {"RoleScopeTagIds"})
    @Expose
	@Nullable
    public java.util.List<String> roleScopeTagIds;

    /**
     * The Serial Number.
     * SerialNumber. This property is read-only.
     */
    @SerializedName(value = "serialNumber", alternate = {"SerialNumber"})
    @Expose
	@Nullable
    public String serialNumber;

    /**
     * The Sku Family.
     * Device sku family
     */
    @SerializedName(value = "skuFamily", alternate = {"SkuFamily"})
    @Expose
	@Nullable
    public String skuFamily;

    /**
     * The Sku Number.
     * Device sku number, see also: https://docs.microsoft.com/en-us/windows/win32/api/sysinfoapi/nf-sysinfoapi-getproductinfo. Valid values 0 to 2147483647. This property is read-only.
     */
    @SerializedName(value = "skuNumber", alternate = {"SkuNumber"})
    @Expose
	@Nullable
    public Integer skuNumber;

    /**
     * The Specification Version.
     * Specification version. This property is read-only.
     */
    @SerializedName(value = "specificationVersion", alternate = {"SpecificationVersion"})
    @Expose
	@Nullable
    public String specificationVersion;

    /**
     * The Subscriber Carrier.
     * Subscriber Carrier. This property is read-only.
     */
    @SerializedName(value = "subscriberCarrier", alternate = {"SubscriberCarrier"})
    @Expose
	@Nullable
    public String subscriberCarrier;

    /**
     * The Total Storage Space In Bytes.
     * Total Storage in Bytes. This property is read-only.
     */
    @SerializedName(value = "totalStorageSpaceInBytes", alternate = {"TotalStorageSpaceInBytes"})
    @Expose
	@Nullable
    public Long totalStorageSpaceInBytes;

    /**
     * The Udid.
     * Unique Device Identifier for iOS and macOS devices. This property is read-only.
     */
    @SerializedName(value = "udid", alternate = {"Udid"})
    @Expose
	@Nullable
    public String udid;

    /**
     * The User Display Name.
     * User display name. This property is read-only.
     */
    @SerializedName(value = "userDisplayName", alternate = {"UserDisplayName"})
    @Expose
	@Nullable
    public String userDisplayName;

    /**
     * The User Id.
     * Unique Identifier for the user associated with the device. This property is read-only.
     */
    @SerializedName(value = "userId", alternate = {"UserId"})
    @Expose
	@Nullable
    public String userId;

    /**
     * The User Principal Name.
     * Device user principal name. This property is read-only.
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
	@Nullable
    public String userPrincipalName;

    /**
     * The Users Logged On.
     * Indicates the last logged on users of a device. This property is read-only.
     */
    @SerializedName(value = "usersLoggedOn", alternate = {"UsersLoggedOn"})
    @Expose
	@Nullable
    public java.util.List<LoggedOnUser> usersLoggedOn;

    /**
     * The Wi Fi Mac Address.
     * Wi-Fi MAC. This property is read-only.
     */
    @SerializedName(value = "wiFiMacAddress", alternate = {"WiFiMacAddress"})
    @Expose
	@Nullable
    public String wiFiMacAddress;

    /**
     * The Windows Active Malware Count.
     * Count of active malware for this windows device. This property is read-only.
     */
    @SerializedName(value = "windowsActiveMalwareCount", alternate = {"WindowsActiveMalwareCount"})
    @Expose
	@Nullable
    public Integer windowsActiveMalwareCount;

    /**
     * The Windows Remediated Malware Count.
     * Count of remediated malware for this windows device. This property is read-only.
     */
    @SerializedName(value = "windowsRemediatedMalwareCount", alternate = {"WindowsRemediatedMalwareCount"})
    @Expose
	@Nullable
    public Integer windowsRemediatedMalwareCount;

    /**
     * The Assignment Filter Evaluation Status Details.
     * Managed device mobile app configuration states for this device.
     */
    @SerializedName(value = "assignmentFilterEvaluationStatusDetails", alternate = {"AssignmentFilterEvaluationStatusDetails"})
    @Expose
	@Nullable
    public AssignmentFilterEvaluationStatusDetailsCollectionPage assignmentFilterEvaluationStatusDetails;

    /**
     * The Device Compliance Policy States.
     * Device compliance policy states for this device.
     */
    @SerializedName(value = "deviceCompliancePolicyStates", alternate = {"DeviceCompliancePolicyStates"})
    @Expose
	@Nullable
    public DeviceCompliancePolicyStateCollectionPage deviceCompliancePolicyStates;

    /**
     * The Device Configuration States.
     * Device configuration states for this device.
     */
    @SerializedName(value = "deviceConfigurationStates", alternate = {"DeviceConfigurationStates"})
    @Expose
	@Nullable
    public DeviceConfigurationStateCollectionPage deviceConfigurationStates;

    /**
     * The Managed Device Mobile App Configuration States.
     * Managed device mobile app configuration states for this device.
     */
    @SerializedName(value = "managedDeviceMobileAppConfigurationStates", alternate = {"ManagedDeviceMobileAppConfigurationStates"})
    @Expose
	@Nullable
    public ManagedDeviceMobileAppConfigurationStateCollectionPage managedDeviceMobileAppConfigurationStates;

    /**
     * The Security Baseline States.
     * Security baseline states for this device.
     */
    @SerializedName(value = "securityBaselineStates", alternate = {"SecurityBaselineStates"})
    @Expose
	@Nullable
    public SecurityBaselineStateCollectionPage securityBaselineStates;

    /**
     * The Detected Apps.
     * All applications currently installed on the device
     */
	@Nullable
    public DetectedAppCollectionPage detectedApps;

    /**
     * The Device Category.
     * Device category
     */
    @SerializedName(value = "deviceCategory", alternate = {"DeviceCategory"})
    @Expose
	@Nullable
    public DeviceCategory deviceCategory;

    /**
     * The Log Collection Requests.
     * List of log collection requests
     */
    @SerializedName(value = "logCollectionRequests", alternate = {"LogCollectionRequests"})
    @Expose
	@Nullable
    public DeviceLogCollectionResponseCollectionPage logCollectionRequests;

    /**
     * The Users.
     * The primary users associated with the managed device.
     */
	@Nullable
    public UserCollectionPage users;

    /**
     * The Windows Protection State.
     * The device protection status.
     */
    @SerializedName(value = "windowsProtectionState", alternate = {"WindowsProtectionState"})
    @Expose
	@Nullable
    public WindowsProtectionState windowsProtectionState;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("assignmentFilterEvaluationStatusDetails")) {
            assignmentFilterEvaluationStatusDetails = serializer.deserializeObject(json.get("assignmentFilterEvaluationStatusDetails"), AssignmentFilterEvaluationStatusDetailsCollectionPage.class);
        }

        if (json.has("deviceCompliancePolicyStates")) {
            deviceCompliancePolicyStates = serializer.deserializeObject(json.get("deviceCompliancePolicyStates"), DeviceCompliancePolicyStateCollectionPage.class);
        }

        if (json.has("deviceConfigurationStates")) {
            deviceConfigurationStates = serializer.deserializeObject(json.get("deviceConfigurationStates"), DeviceConfigurationStateCollectionPage.class);
        }

        if (json.has("managedDeviceMobileAppConfigurationStates")) {
            managedDeviceMobileAppConfigurationStates = serializer.deserializeObject(json.get("managedDeviceMobileAppConfigurationStates"), ManagedDeviceMobileAppConfigurationStateCollectionPage.class);
        }

        if (json.has("securityBaselineStates")) {
            securityBaselineStates = serializer.deserializeObject(json.get("securityBaselineStates"), SecurityBaselineStateCollectionPage.class);
        }

        if (json.has("detectedApps")) {
            detectedApps = serializer.deserializeObject(json.get("detectedApps"), DetectedAppCollectionPage.class);
        }

        if (json.has("logCollectionRequests")) {
            logCollectionRequests = serializer.deserializeObject(json.get("logCollectionRequests"), DeviceLogCollectionResponseCollectionPage.class);
        }

        if (json.has("users")) {
            users = serializer.deserializeObject(json.get("users"), UserCollectionPage.class);
        }
    }
}
