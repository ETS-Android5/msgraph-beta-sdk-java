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
import com.microsoft.graph.models.SignInActivity;
import com.microsoft.graph.models.AssignedLicense;
import com.microsoft.graph.models.AssignedPlan;
import com.microsoft.graph.models.CustomSecurityAttributeValue;
import com.microsoft.graph.models.DeviceKey;
import com.microsoft.graph.models.EmployeeOrgData;
import com.microsoft.graph.models.ObjectIdentity;
import com.microsoft.graph.models.LicenseAssignmentState;
import com.microsoft.graph.models.OnPremisesExtensionAttributes;
import com.microsoft.graph.models.OnPremisesProvisioningError;
import com.microsoft.graph.models.PasswordProfile;
import com.microsoft.graph.models.ProvisionedPlan;
import com.microsoft.graph.models.MailboxSettings;
import com.microsoft.graph.models.UserPrint;
import com.microsoft.graph.models.UserAnalytics;
import com.microsoft.graph.models.CloudPC;
import com.microsoft.graph.models.UsageRight;
import com.microsoft.graph.models.InformationProtection;
import com.microsoft.graph.models.AppRoleAssignment;
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.models.LicenseDetails;
import com.microsoft.graph.models.OAuth2PermissionGrant;
import com.microsoft.graph.models.ScopedRoleMembership;
import com.microsoft.graph.models.Calendar;
import com.microsoft.graph.models.CalendarGroup;
import com.microsoft.graph.models.Event;
import com.microsoft.graph.models.ContactFolder;
import com.microsoft.graph.models.Contact;
import com.microsoft.graph.models.InferenceClassification;
import com.microsoft.graph.models.Group;
import com.microsoft.graph.models.MailFolder;
import com.microsoft.graph.models.Message;
import com.microsoft.graph.models.OutlookUser;
import com.microsoft.graph.models.Person;
import com.microsoft.graph.models.Drive;
import com.microsoft.graph.models.Site;
import com.microsoft.graph.models.Extension;
import com.microsoft.graph.models.AppConsentRequest;
import com.microsoft.graph.models.Approval;
import com.microsoft.graph.models.AccessReviewInstance;
import com.microsoft.graph.models.AgreementAcceptance;
import com.microsoft.graph.security.models.Security;
import com.microsoft.graph.models.DeviceEnrollmentConfiguration;
import com.microsoft.graph.models.ManagedDevice;
import com.microsoft.graph.models.ManagedAppRegistration;
import com.microsoft.graph.models.WindowsInformationProtectionDeviceRegistration;
import com.microsoft.graph.models.DeviceManagementTroubleshootingEvent;
import com.microsoft.graph.models.MobileAppIntentAndState;
import com.microsoft.graph.models.MobileAppTroubleshootingEvent;
import com.microsoft.graph.models.Notification;
import com.microsoft.graph.models.PlannerUser;
import com.microsoft.graph.models.ItemInsights;
import com.microsoft.graph.models.UserSettings;
import com.microsoft.graph.models.Onenote;
import com.microsoft.graph.models.ProfilePhoto;
import com.microsoft.graph.models.Profile;
import com.microsoft.graph.models.UserActivity;
import com.microsoft.graph.models.Device;
import com.microsoft.graph.models.OnlineMeeting;
import com.microsoft.graph.models.Presence;
import com.microsoft.graph.models.Authentication;
import com.microsoft.graph.models.Tasks;
import com.microsoft.graph.models.Chat;
import com.microsoft.graph.models.Team;
import com.microsoft.graph.models.UserTeamwork;
import com.microsoft.graph.models.Todo;
import com.microsoft.graph.requests.CloudPCCollectionPage;
import com.microsoft.graph.requests.UsageRightCollectionPage;
import com.microsoft.graph.requests.AppRoleAssignmentCollectionPage;
import com.microsoft.graph.requests.DirectoryObjectCollectionPage;
import com.microsoft.graph.requests.LicenseDetailsCollectionPage;
import com.microsoft.graph.requests.OAuth2PermissionGrantCollectionPage;
import com.microsoft.graph.requests.ScopedRoleMembershipCollectionPage;
import com.microsoft.graph.requests.CalendarGroupCollectionPage;
import com.microsoft.graph.requests.CalendarCollectionPage;
import com.microsoft.graph.requests.EventCollectionPage;
import com.microsoft.graph.requests.ContactFolderCollectionPage;
import com.microsoft.graph.requests.ContactCollectionPage;
import com.microsoft.graph.requests.GroupCollectionPage;
import com.microsoft.graph.requests.MailFolderCollectionPage;
import com.microsoft.graph.requests.MessageCollectionPage;
import com.microsoft.graph.requests.PersonCollectionPage;
import com.microsoft.graph.requests.DriveCollectionPage;
import com.microsoft.graph.requests.SiteCollectionPage;
import com.microsoft.graph.requests.ExtensionCollectionPage;
import com.microsoft.graph.requests.AppConsentRequestCollectionPage;
import com.microsoft.graph.requests.ApprovalCollectionPage;
import com.microsoft.graph.requests.AccessReviewInstanceCollectionPage;
import com.microsoft.graph.requests.AgreementAcceptanceCollectionPage;
import com.microsoft.graph.requests.DeviceEnrollmentConfigurationCollectionPage;
import com.microsoft.graph.requests.ManagedDeviceCollectionPage;
import com.microsoft.graph.requests.ManagedAppRegistrationCollectionPage;
import com.microsoft.graph.requests.WindowsInformationProtectionDeviceRegistrationCollectionPage;
import com.microsoft.graph.requests.DeviceManagementTroubleshootingEventCollectionPage;
import com.microsoft.graph.requests.MobileAppIntentAndStateCollectionPage;
import com.microsoft.graph.requests.MobileAppTroubleshootingEventCollectionPage;
import com.microsoft.graph.requests.NotificationCollectionPage;
import com.microsoft.graph.requests.ProfilePhotoCollectionPage;
import com.microsoft.graph.requests.UserActivityCollectionPage;
import com.microsoft.graph.requests.DeviceCollectionPage;
import com.microsoft.graph.requests.OnlineMeetingCollectionPage;
import com.microsoft.graph.requests.ChatCollectionPage;
import com.microsoft.graph.requests.TeamCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User.
 */
public class User extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Sign In Activity.
     * Get the last signed-in date and request ID of the sign-in for a given user. Read-only.Returned only on $select. Supports $filter (eq, ne, not, ge, le) but, not with any other filterable properties. Note: Details for this property require an Azure AD Premium P1/P2 license and the AuditLog.Read.All permission.Note: There's a known issue with retrieving this property.This property is not returned for a user who has never signed in or last signed in before April 2020.
     */
    @SerializedName(value = "signInActivity", alternate = {"SignInActivity"})
    @Expose
	@Nullable
    public SignInActivity signInActivity;

    /**
     * The Account Enabled.
     * true if the account is enabled; otherwise, false. This property is required when a user is created. Supports $filter (eq, ne, not, and in).
     */
    @SerializedName(value = "accountEnabled", alternate = {"AccountEnabled"})
    @Expose
	@Nullable
    public Boolean accountEnabled;

    /**
     * The Age Group.
     * Sets the age group of the user. Allowed values: null, Minor, NotAdult and Adult. Refer to the legal age group property definitions for further information. Supports $filter (eq, ne, not, and in).
     */
    @SerializedName(value = "ageGroup", alternate = {"AgeGroup"})
    @Expose
	@Nullable
    public String ageGroup;

    /**
     * The Assigned Licenses.
     * The licenses that are assigned to the user, including inherited (group-based) licenses. Not nullable. Supports $filter (eq, not, and counting empty collections).
     */
    @SerializedName(value = "assignedLicenses", alternate = {"AssignedLicenses"})
    @Expose
	@Nullable
    public java.util.List<AssignedLicense> assignedLicenses;

    /**
     * The Assigned Plans.
     * The plans that are assigned to the user. Read-only. Not nullable.Supports $filter (eq and not).
     */
    @SerializedName(value = "assignedPlans", alternate = {"AssignedPlans"})
    @Expose
	@Nullable
    public java.util.List<AssignedPlan> assignedPlans;

    /**
     * The Business Phones.
     * The telephone numbers for the user. Only one number can be set for this property. Read-only for users synced from on-premises directory. Supports $filter (eq, not, ge, le, startsWith).
     */
    @SerializedName(value = "businessPhones", alternate = {"BusinessPhones"})
    @Expose
	@Nullable
    public java.util.List<String> businessPhones;

    /**
     * The City.
     * The city in which the user is located. Maximum length is 128 characters. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     */
    @SerializedName(value = "city", alternate = {"City"})
    @Expose
	@Nullable
    public String city;

    /**
     * The Company Name.
     * The company name which the user is associated. This property can be useful for describing the company that an external user comes from. The maximum length is 64 characters.Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     */
    @SerializedName(value = "companyName", alternate = {"CompanyName"})
    @Expose
	@Nullable
    public String companyName;

    /**
     * The Consent Provided For Minor.
     * Sets whether consent has been obtained for minors. Allowed values: null, Granted, Denied and NotRequired. Refer to the legal age group property definitions for further information. Supports $filter (eq, ne, not, and in).
     */
    @SerializedName(value = "consentProvidedForMinor", alternate = {"ConsentProvidedForMinor"})
    @Expose
	@Nullable
    public String consentProvidedForMinor;

    /**
     * The Country.
     * The country/region in which the user is located; for example, US or UK. Maximum length is 128 characters. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     */
    @SerializedName(value = "country", alternate = {"Country"})
    @Expose
	@Nullable
    public String country;

    /**
     * The Created Date Time.
     * The date and time the user was created. The value cannot be modified and is automatically populated when the entity is created. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. Property is nullable. A null value indicates that an accurate creation time couldn't be determined for the user. Read-only. Supports $filter (eq, ne, not , ge, le, in).
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Creation Type.
     * Indicates whether the user account was created through one of the following methods:  As a regular school or work account (null). As an external account (Invitation). As a local account for an Azure Active Directory B2C tenant (LocalAccount). Through self-service sign-up by an internal user using email verification (EmailVerified). Through self-service sign-up by an external user signing up through a link that is part of a user flow (SelfServiceSignUp).  Read-only.Supports $filter (eq, ne, not, and in).
     */
    @SerializedName(value = "creationType", alternate = {"CreationType"})
    @Expose
	@Nullable
    public String creationType;

    /**
     * The Custom Security Attributes.
     * An open complex type that holds the value of a custom security attribute that is assigned to a directory object. Nullable. Returned only on $select. Supports $filter (eq, ne, not, startsWith).
     */
    @SerializedName(value = "customSecurityAttributes", alternate = {"CustomSecurityAttributes"})
    @Expose
	@Nullable
    public CustomSecurityAttributeValue customSecurityAttributes;

    /**
     * The Department.
     * The name for the department in which the user works. Maximum length is 64 characters.Supports $filter (eq, ne, not , ge, le, in, and eq on null values).
     */
    @SerializedName(value = "department", alternate = {"Department"})
    @Expose
	@Nullable
    public String department;

    /**
     * The Device Keys.
     * 
     */
    @SerializedName(value = "deviceKeys", alternate = {"DeviceKeys"})
    @Expose
	@Nullable
    public java.util.List<DeviceKey> deviceKeys;

    /**
     * The Display Name.
     * The name displayed in the address book for the user. This value is usually the combination of the user's first name, middle initial, and last name. This property is required when a user is created and it cannot be cleared during updates. Maximum length is 256 characters. Supports $filter (eq, ne, not , ge, le, in, startsWith, and eq on null values), $orderBy, and $search.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Employee Hire Date.
     * The date and time when the user was hired or will start work in case of a future hire. Supports $filter (eq, ne, not , ge, le, in).
     */
    @SerializedName(value = "employeeHireDate", alternate = {"EmployeeHireDate"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime employeeHireDate;

    /**
     * The Employee Id.
     * The employee identifier assigned to the user by the organization. The maximum length is 16 characters.Supports $filter (eq, ne, not , ge, le, in, startsWith, and eq on null values).
     */
    @SerializedName(value = "employeeId", alternate = {"EmployeeId"})
    @Expose
	@Nullable
    public String employeeId;

    /**
     * The Employee Org Data.
     * Represents organization data (e.g. division and costCenter) associated with a user. Supports $filter (eq, ne, not , ge, le, in).
     */
    @SerializedName(value = "employeeOrgData", alternate = {"EmployeeOrgData"})
    @Expose
	@Nullable
    public EmployeeOrgData employeeOrgData;

    /**
     * The Employee Type.
     * Captures enterprise worker type. For example, Employee, Contractor, Consultant, or Vendor. Supports $filter (eq, ne, not , ge, le, in, startsWith).
     */
    @SerializedName(value = "employeeType", alternate = {"EmployeeType"})
    @Expose
	@Nullable
    public String employeeType;

    /**
     * The External User State.
     * For an external user invited to the tenant using the invitation API, this property represents the invited user's invitation status. For invited users, the state can be PendingAcceptance or Accepted, or null for all other users. Supports $filter (eq, ne, not , in).
     */
    @SerializedName(value = "externalUserState", alternate = {"ExternalUserState"})
    @Expose
	@Nullable
    public String externalUserState;

    /**
     * The External User State Change Date Time.
     * Shows the timestamp for the latest change to the externalUserState property. Supports $filter (eq, ne, not , in).
     */
    @SerializedName(value = "externalUserStateChangeDateTime", alternate = {"ExternalUserStateChangeDateTime"})
    @Expose
	@Nullable
    public String externalUserStateChangeDateTime;

    /**
     * The Fax Number.
     * The fax number of the user. Supports $filter (eq, ne, not , ge, le, in, startsWith, and eq on null values).
     */
    @SerializedName(value = "faxNumber", alternate = {"FaxNumber"})
    @Expose
	@Nullable
    public String faxNumber;

    /**
     * The Given Name.
     * The given name (first name) of the user. Maximum length is 64 characters. Supports $filter (eq, ne, not , ge, le, in, startsWith, and eq on null values).
     */
    @SerializedName(value = "givenName", alternate = {"GivenName"})
    @Expose
	@Nullable
    public String givenName;

    /**
     * The Identities.
     * Represents the identities that can be used to sign in to this user account. An identity can be provided by Microsoft (also known as a local account), by organizations, or by social identity providers such as Facebook, Google, and Microsoft, and tied to a user account. May contain multiple items with the same signInType value. Supports $filter (eq) including on null values, only where the signInType is not userPrincipalName.
     */
    @SerializedName(value = "identities", alternate = {"Identities"})
    @Expose
	@Nullable
    public java.util.List<ObjectIdentity> identities;

    /**
     * The Im Addresses.
     * The instant message voice over IP (VOIP) session initiation protocol (SIP) addresses for the user. Read-only. Supports $filter (eq, not, ge, le, startsWith).
     */
    @SerializedName(value = "imAddresses", alternate = {"ImAddresses"})
    @Expose
	@Nullable
    public java.util.List<String> imAddresses;

    /**
     * The Info Catalogs.
     * Identifies the info segments assigned to the user.  Supports $filter (eq, not, ge, le, startsWith).
     */
    @SerializedName(value = "infoCatalogs", alternate = {"InfoCatalogs"})
    @Expose
	@Nullable
    public java.util.List<String> infoCatalogs;

    /**
     * The Is Management Restricted.
     * 
     */
    @SerializedName(value = "isManagementRestricted", alternate = {"IsManagementRestricted"})
    @Expose
	@Nullable
    public Boolean isManagementRestricted;

    /**
     * The Is Resource Account.
     * Do not use – reserved for future use.
     */
    @SerializedName(value = "isResourceAccount", alternate = {"IsResourceAccount"})
    @Expose
	@Nullable
    public Boolean isResourceAccount;

    /**
     * The Job Title.
     * The user's job title. Maximum length is 128 characters. Supports $filter (eq, ne, not , ge, le, in, startsWith, and eq on null values).
     */
    @SerializedName(value = "jobTitle", alternate = {"JobTitle"})
    @Expose
	@Nullable
    public String jobTitle;

    /**
     * The Last Password Change Date Time.
     * The time when this Azure AD user last changed their password or when their password was created, , whichever date the latest action was performed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. Returned only on $select.
     */
    @SerializedName(value = "lastPasswordChangeDateTime", alternate = {"LastPasswordChangeDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastPasswordChangeDateTime;

    /**
     * The Legal Age Group Classification.
     * Used by enterprise applications to determine the legal age group of the user. This property is read-only and calculated based on ageGroup and consentProvidedForMinor properties. Allowed values: null, MinorWithOutParentalConsent, MinorWithParentalConsent, MinorNoParentalConsentRequired, NotAdult and Adult. Refer to the legal age group property definitions for further information. Returned only on $select.
     */
    @SerializedName(value = "legalAgeGroupClassification", alternate = {"LegalAgeGroupClassification"})
    @Expose
	@Nullable
    public String legalAgeGroupClassification;

    /**
     * The License Assignment States.
     * State of license assignments for this user. Read-only. Returned only on $select.
     */
    @SerializedName(value = "licenseAssignmentStates", alternate = {"LicenseAssignmentStates"})
    @Expose
	@Nullable
    public java.util.List<LicenseAssignmentState> licenseAssignmentStates;

    /**
     * The Mail.
     * The SMTP address for the user, for example, admin@contoso.com. Changes to this property will also update the user's proxyAddresses collection to include the value as an SMTP address. For Azure AD B2C accounts, this property can be updated up to only ten times with unique SMTP addresses. This property cannot contain accent characters.  Supports $filter (eq, ne, not, ge, le, in, startsWith, endsWith, and eq on null values).
     */
    @SerializedName(value = "mail", alternate = {"Mail"})
    @Expose
	@Nullable
    public String mail;

    /**
     * The Mail Nickname.
     * The mail alias for the user. This property must be specified when a user is created. Maximum length is 64 characters. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     */
    @SerializedName(value = "mailNickname", alternate = {"MailNickname"})
    @Expose
	@Nullable
    public String mailNickname;

    /**
     * The Mobile Phone.
     * The primary cellular telephone number for the user. Read-only for users synced from on-premises directory.  Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     */
    @SerializedName(value = "mobilePhone", alternate = {"MobilePhone"})
    @Expose
	@Nullable
    public String mobilePhone;

    /**
     * The Office Location.
     * The office location in the user's place of business. Maximum length is 128 characters. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     */
    @SerializedName(value = "officeLocation", alternate = {"OfficeLocation"})
    @Expose
	@Nullable
    public String officeLocation;

    /**
     * The On Premises Distinguished Name.
     * Contains the on-premises Active Directory distinguished name or DN. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect. Read-only.
     */
    @SerializedName(value = "onPremisesDistinguishedName", alternate = {"OnPremisesDistinguishedName"})
    @Expose
	@Nullable
    public String onPremisesDistinguishedName;

    /**
     * The On Premises Domain Name.
     * Contains the on-premises domainFQDN, also called dnsDomainName synchronized from the on-premises directory. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect. Read-only.
     */
    @SerializedName(value = "onPremisesDomainName", alternate = {"OnPremisesDomainName"})
    @Expose
	@Nullable
    public String onPremisesDomainName;

    /**
     * The On Premises Extension Attributes.
     * Contains extensionAttributes1-15 for the user. The individual extension attributes are neither selectable nor filterable. For an onPremisesSyncEnabled user, the source of authority for this set of properties is the on-premises and is read-only. For a cloud-only user (where onPremisesSyncEnabled is false), these properties can be set during creation or update of a user object.  For a cloud-only user previously synced from on-premises Active Directory, these properties are read-only in Microsoft Graph but can be fully managed through the Exchange Admin Center or the Exchange Online V2 module in PowerShell. These extension attributes are also known as Exchange custom attributes 1-15. Returned only on $select.
     */
    @SerializedName(value = "onPremisesExtensionAttributes", alternate = {"OnPremisesExtensionAttributes"})
    @Expose
	@Nullable
    public OnPremisesExtensionAttributes onPremisesExtensionAttributes;

    /**
     * The On Premises Immutable Id.
     * This property is used to associate an on-premises Active Directory user account to their Azure AD user object. This property must be specified when creating a new user account in the Graph if you are using a federated domain for the user's userPrincipalName (UPN) property. Note: The $ and _ characters cannot be used when specifying this property. Supports $filter (eq, ne, not, ge, le, in).
     */
    @SerializedName(value = "onPremisesImmutableId", alternate = {"OnPremisesImmutableId"})
    @Expose
	@Nullable
    public String onPremisesImmutableId;

    /**
     * The On Premises Last Sync Date Time.
     * Indicates the last time at which the object was synced with the on-premises directory; for example: '2013-02-16T03:04:54Z'. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. Supports $filter (eq, ne, not, ge, le, in).
     */
    @SerializedName(value = "onPremisesLastSyncDateTime", alternate = {"OnPremisesLastSyncDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime onPremisesLastSyncDateTime;

    /**
     * The On Premises Provisioning Errors.
     * Errors when using Microsoft synchronization product during provisioning.  Supports $filter (eq, not, ge, le).
     */
    @SerializedName(value = "onPremisesProvisioningErrors", alternate = {"OnPremisesProvisioningErrors"})
    @Expose
	@Nullable
    public java.util.List<OnPremisesProvisioningError> onPremisesProvisioningErrors;

    /**
     * The On Premises Sam Account Name.
     * Contains the on-premises sAMAccountName synchronized from the on-premises directory. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect. Read-only. Supports $filter (eq, ne, not, ge, le, in, startsWith).
     */
    @SerializedName(value = "onPremisesSamAccountName", alternate = {"OnPremisesSamAccountName"})
    @Expose
	@Nullable
    public String onPremisesSamAccountName;

    /**
     * The On Premises Security Identifier.
     * Contains the on-premises security identifier (SID) for the user that was synchronized from on-premises to the cloud. Read-only. Supports $filter (eq including on null values).
     */
    @SerializedName(value = "onPremisesSecurityIdentifier", alternate = {"OnPremisesSecurityIdentifier"})
    @Expose
	@Nullable
    public String onPremisesSecurityIdentifier;

    /**
     * The On Premises Sync Enabled.
     * true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory (default). Read-only. Supports $filter (eq, ne, not, in, and eq on null values).
     */
    @SerializedName(value = "onPremisesSyncEnabled", alternate = {"OnPremisesSyncEnabled"})
    @Expose
	@Nullable
    public Boolean onPremisesSyncEnabled;

    /**
     * The On Premises User Principal Name.
     * Contains the on-premises userPrincipalName synchronized from the on-premises directory. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect. Read-only. Supports $filter (eq, ne, not, ge, le, in, startsWith).
     */
    @SerializedName(value = "onPremisesUserPrincipalName", alternate = {"OnPremisesUserPrincipalName"})
    @Expose
	@Nullable
    public String onPremisesUserPrincipalName;

    /**
     * The Other Mails.
     * A list of additional email addresses for the user; for example: ['bob@contoso.com', 'Robert@fabrikam.com'].NOTE: This property cannot contain accent characters.Supports $filter (eq, not, ge, le, in, startsWith, and counting empty collections).
     */
    @SerializedName(value = "otherMails", alternate = {"OtherMails"})
    @Expose
	@Nullable
    public java.util.List<String> otherMails;

    /**
     * The Password Policies.
     * Specifies password policies for the user. This value is an enumeration with one possible value being DisableStrongPassword, which allows weaker passwords than the default policy to be specified. DisablePasswordExpiration can also be specified. The two may be specified together; for example: DisablePasswordExpiration, DisableStrongPassword. For more information on the default password policies, see Azure AD pasword policies. Supports $filter (ne, not, and eq on null values).
     */
    @SerializedName(value = "passwordPolicies", alternate = {"PasswordPolicies"})
    @Expose
	@Nullable
    public String passwordPolicies;

    /**
     * The Password Profile.
     * Specifies the password profile for the user. The profile contains the user's password. This property is required when a user is created. The password in the profile must satisfy minimum requirements as specified by the passwordPolicies property. By default, a strong password is required. NOTE: For Azure B2C tenants, the forceChangePasswordNextSignIn property should be set to false and instead use custom policies and user flows to force password reset at first logon. See Force password reset at first logon. Supports $filter (eq, ne, not, in, and eq on null values).
     */
    @SerializedName(value = "passwordProfile", alternate = {"PasswordProfile"})
    @Expose
	@Nullable
    public PasswordProfile passwordProfile;

    /**
     * The Postal Code.
     * The postal code for the user's postal address. The postal code is specific to the user's country/region. In the United States of America, this attribute contains the ZIP code. Maximum length is 40 characters. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     */
    @SerializedName(value = "postalCode", alternate = {"PostalCode"})
    @Expose
	@Nullable
    public String postalCode;

    /**
     * The Preferred Data Location.
     * The preferred data location for the user. For more information, see OneDrive Online Multi-Geo.
     */
    @SerializedName(value = "preferredDataLocation", alternate = {"PreferredDataLocation"})
    @Expose
	@Nullable
    public String preferredDataLocation;

    /**
     * The Preferred Language.
     * The preferred language for the user. Should follow ISO 639-1 Code; for example en-US. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     */
    @SerializedName(value = "preferredLanguage", alternate = {"PreferredLanguage"})
    @Expose
	@Nullable
    public String preferredLanguage;

    /**
     * The Provisioned Plans.
     * The plans that are provisioned for the user. Read-only. Not nullable. Supports $filter (eq, not, ge, le).
     */
    @SerializedName(value = "provisionedPlans", alternate = {"ProvisionedPlans"})
    @Expose
	@Nullable
    public java.util.List<ProvisionedPlan> provisionedPlans;

    /**
     * The Proxy Addresses.
     * For example: ['SMTP: bob@contoso.com', 'smtp: bob@sales.contoso.com']. Changes to the mail property will also update this collection to include the value as an SMTP address. For more information, see mail and proxyAddresses properties. The proxy address prefixed with SMTP (capitalized) is the primary proxy address while those prefixed with smtp are the secondary proxy addresses. For Azure AD B2C accounts, this property has a limit of ten unique addresses. Read-only in Microsoft Graph; you can update this property only through the Microsoft 365 admin center. Not nullable. Supports $filter (eq, not, ge, le, startsWith, endsWith, and counting empty collections).
     */
    @SerializedName(value = "proxyAddresses", alternate = {"ProxyAddresses"})
    @Expose
	@Nullable
    public java.util.List<String> proxyAddresses;

    /**
     * The Refresh Tokens Valid From Date Time.
     * Any refresh tokens or sessions tokens (session cookies) issued before this time are invalid, and applications will get an error when using an invalid refresh or sessions token to acquire a delegated access token (to access APIs such as Microsoft Graph).  If this happens, the application will need to acquire a new refresh token by making a request to the authorize endpoint. Read-only. Use invalidateAllRefreshTokens to reset.
     */
    @SerializedName(value = "refreshTokensValidFromDateTime", alternate = {"RefreshTokensValidFromDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime refreshTokensValidFromDateTime;

    /**
     * The Show In Address List.
     * true if the Outlook global address list should contain this user, otherwise false. If not set, this will be treated as true. For users invited through the invitation manager, this property will be set to false. Supports $filter (eq, ne, not, in).
     */
    @SerializedName(value = "showInAddressList", alternate = {"ShowInAddressList"})
    @Expose
	@Nullable
    public Boolean showInAddressList;

    /**
     * The Sign In Sessions Valid From Date Time.
     * Any refresh tokens or sessions tokens (session cookies) issued before this time are invalid, and applications will get an error when using an invalid refresh or sessions token to acquire a delegated access token (to access APIs such as Microsoft Graph).  If this happens, the application will need to acquire a new refresh token by making a request to the authorize endpoint. Read-only. Use revokeSignInSessions to reset.
     */
    @SerializedName(value = "signInSessionsValidFromDateTime", alternate = {"SignInSessionsValidFromDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime signInSessionsValidFromDateTime;

    /**
     * The State.
     * The state or province in the user's address. Maximum length is 128 characters. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
	@Nullable
    public String state;

    /**
     * The Street Address.
     * The street address of the user's place of business. Maximum length is 1024 characters. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     */
    @SerializedName(value = "streetAddress", alternate = {"StreetAddress"})
    @Expose
	@Nullable
    public String streetAddress;

    /**
     * The Surname.
     * The user's surname (family name or last name). Maximum length is 64 characters. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     */
    @SerializedName(value = "surname", alternate = {"Surname"})
    @Expose
	@Nullable
    public String surname;

    /**
     * The Usage Location.
     * A two letter country code (ISO standard 3166). Required for users that will be assigned licenses due to legal requirement to check for availability of services in countries.  Examples include: US, JP, and GB. Not nullable. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     */
    @SerializedName(value = "usageLocation", alternate = {"UsageLocation"})
    @Expose
	@Nullable
    public String usageLocation;

    /**
     * The User Principal Name.
     * The user principal name (UPN) of the user. The UPN is an Internet-style login name for the user based on the Internet standard RFC 822. By convention, this should map to the user's email name. The general format is alias@domain, where domain must be present in the tenant's collection of verified domains. This property is required when a user is created. The verified domains for the tenant can be accessed from the verifiedDomains property of organization.NOTE: This property cannot contain accent characters. Only the following characters are allowed A - Z, a - z, 0 - 9, ' . - _ ! # ^ ~. For the complete list of allowed characters, see username policies. Supports $filter (eq, ne, not, ge, le, in, startsWith, endsWith) and $orderBy.
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
	@Nullable
    public String userPrincipalName;

    /**
     * The User Type.
     * A String value that can be used to classify user types in your directory, such as Member and Guest. Supports $filter (eq, ne, not, in, and eq on null values). NOTE: For more information about the permissions for member and guest users, see What are the default user permissions in Azure Active Directory?
     */
    @SerializedName(value = "userType", alternate = {"UserType"})
    @Expose
	@Nullable
    public String userType;

    /**
     * The Mailbox Settings.
     * Settings for the primary mailbox of the signed-in user. You can get or update settings for sending automatic replies to incoming messages, locale, and time zone. For more information, see User preferences for languages and regional formats. Returned only on $select.
     */
    @SerializedName(value = "mailboxSettings", alternate = {"MailboxSettings"})
    @Expose
	@Nullable
    public MailboxSettings mailboxSettings;

    /**
     * The Device Enrollment Limit.
     * The limit on the maximum number of devices that the user is permitted to enroll. Allowed values are 5 or 1000.
     */
    @SerializedName(value = "deviceEnrollmentLimit", alternate = {"DeviceEnrollmentLimit"})
    @Expose
	@Nullable
    public Integer deviceEnrollmentLimit;

    /**
     * The Print.
     * 
     */
    @SerializedName(value = "print", alternate = {"Print"})
    @Expose
	@Nullable
    public UserPrint print;

    /**
     * The About Me.
     * A freeform text entry field for the user to describe themselves. Returned only on $select.
     */
    @SerializedName(value = "aboutMe", alternate = {"AboutMe"})
    @Expose
	@Nullable
    public String aboutMe;

    /**
     * The Birthday.
     * The birthday of the user. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z Returned only on $select.
     */
    @SerializedName(value = "birthday", alternate = {"Birthday"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime birthday;

    /**
     * The Hire Date.
     * The hire date of the user. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.  Returned only on $select.  Note: This property is specific to SharePoint Online. We recommend using the native employeeHireDate property to set and update hire date values using Microsoft Graph APIs.
     */
    @SerializedName(value = "hireDate", alternate = {"HireDate"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime hireDate;

    /**
     * The Interests.
     * A list for the user to describe their interests. Returned only on $select.
     */
    @SerializedName(value = "interests", alternate = {"Interests"})
    @Expose
	@Nullable
    public java.util.List<String> interests;

    /**
     * The My Site.
     * The URL for the user's personal site. Returned only on $select.
     */
    @SerializedName(value = "mySite", alternate = {"MySite"})
    @Expose
	@Nullable
    public String mySite;

    /**
     * The Past Projects.
     * A list for the user to enumerate their past projects. Returned only on $select.
     */
    @SerializedName(value = "pastProjects", alternate = {"PastProjects"})
    @Expose
	@Nullable
    public java.util.List<String> pastProjects;

    /**
     * The Preferred Name.
     * The preferred name for the user. Returned only on $select.
     */
    @SerializedName(value = "preferredName", alternate = {"PreferredName"})
    @Expose
	@Nullable
    public String preferredName;

    /**
     * The Responsibilities.
     * A list for the user to enumerate their responsibilities. Returned only on $select.
     */
    @SerializedName(value = "responsibilities", alternate = {"Responsibilities"})
    @Expose
	@Nullable
    public java.util.List<String> responsibilities;

    /**
     * The Schools.
     * A list for the user to enumerate the schools they have attended. Returned only on $select.
     */
    @SerializedName(value = "schools", alternate = {"Schools"})
    @Expose
	@Nullable
    public java.util.List<String> schools;

    /**
     * The Skills.
     * A list for the user to enumerate their skills. Returned only on $select.
     */
    @SerializedName(value = "skills", alternate = {"Skills"})
    @Expose
	@Nullable
    public java.util.List<String> skills;

    /**
     * The Analytics.
     * 
     */
    @SerializedName(value = "analytics", alternate = {"Analytics"})
    @Expose
	@Nullable
    public UserAnalytics analytics;

    /**
     * The Cloud PCs.
     * 
     */
    @SerializedName(value = "cloudPCs", alternate = {"CloudPCs"})
    @Expose
	@Nullable
    public CloudPCCollectionPage cloudPCs;

    /**
     * The Usage Rights.
     * Represents the usage rights a user has been granted.
     */
    @SerializedName(value = "usageRights", alternate = {"UsageRights"})
    @Expose
	@Nullable
    public UsageRightCollectionPage usageRights;

    /**
     * The Information Protection.
     * 
     */
    @SerializedName(value = "informationProtection", alternate = {"InformationProtection"})
    @Expose
	@Nullable
    public InformationProtection informationProtection;

    /**
     * The App Role Assignments.
     * Represents the app roles a user has been granted for an application. Supports $expand.
     */
    @SerializedName(value = "appRoleAssignments", alternate = {"AppRoleAssignments"})
    @Expose
	@Nullable
    public AppRoleAssignmentCollectionPage appRoleAssignments;

    /**
     * The Created Objects.
     * Directory objects that were created by the user. Read-only. Nullable.
     */
	@Nullable
    public DirectoryObjectCollectionPage createdObjects;

    /**
     * The Direct Reports.
     * The users and contacts that report to the user. (The users and contacts that have their manager property set to this user.) Read-only. Nullable. Supports $expand.
     */
	@Nullable
    public DirectoryObjectCollectionPage directReports;

    /**
     * The License Details.
     * A collection of this user's license details. Read-only.
     */
    @SerializedName(value = "licenseDetails", alternate = {"LicenseDetails"})
    @Expose
	@Nullable
    public LicenseDetailsCollectionPage licenseDetails;

    /**
     * The Manager.
     * The user or contact that is this user's manager. Read-only. (HTTP Methods: GET, PUT, DELETE.). Supports $expand.
     */
    @SerializedName(value = "manager", alternate = {"Manager"})
    @Expose
	@Nullable
    public DirectoryObject manager;

    /**
     * The Member Of.
     * The groups, directory roles and administrative units that the user is a member of. Read-only. Nullable. Supports $expand.
     */
	@Nullable
    public DirectoryObjectCollectionPage memberOf;

    /**
     * The Oauth2Permission Grants.
     * 
     */
	@Nullable
    public OAuth2PermissionGrantCollectionPage oauth2PermissionGrants;

    /**
     * The Owned Devices.
     * Devices that are owned by the user. Read-only. Nullable. Supports $expand.
     */
	@Nullable
    public DirectoryObjectCollectionPage ownedDevices;

    /**
     * The Owned Objects.
     * Directory objects that are owned by the user. Read-only. Nullable. Supports $expand.
     */
	@Nullable
    public DirectoryObjectCollectionPage ownedObjects;

    /**
     * The Registered Devices.
     * Devices that are registered for the user. Read-only. Nullable. Supports $expand.
     */
	@Nullable
    public DirectoryObjectCollectionPage registeredDevices;

    /**
     * The Scoped Role Member Of.
     * The scoped-role administrative unit memberships for this user. Read-only. Nullable.
     */
    @SerializedName(value = "scopedRoleMemberOf", alternate = {"ScopedRoleMemberOf"})
    @Expose
	@Nullable
    public ScopedRoleMembershipCollectionPage scopedRoleMemberOf;

    /**
     * The Transitive Member Of.
     * 
     */
	@Nullable
    public DirectoryObjectCollectionPage transitiveMemberOf;

    /**
     * The Transitive Reports.
     * The transitive reports for a user. Read-only.
     */
	@Nullable
    public DirectoryObjectCollectionPage transitiveReports;

    /**
     * The Calendar.
     * The user's primary calendar. Read-only.
     */
    @SerializedName(value = "calendar", alternate = {"Calendar"})
    @Expose
	@Nullable
    public Calendar calendar;

    /**
     * The Calendar Groups.
     * The user's calendar groups. Read-only. Nullable.
     */
    @SerializedName(value = "calendarGroups", alternate = {"CalendarGroups"})
    @Expose
	@Nullable
    public CalendarGroupCollectionPage calendarGroups;

    /**
     * The Calendars.
     * The user's calendars. Read-only. Nullable.
     */
    @SerializedName(value = "calendars", alternate = {"Calendars"})
    @Expose
	@Nullable
    public CalendarCollectionPage calendars;

    /**
     * The Calendar View.
     * The calendar view for the calendar. Read-only. Nullable.
     */
    @SerializedName(value = "calendarView", alternate = {"CalendarView"})
    @Expose
	@Nullable
    public EventCollectionPage calendarView;

    /**
     * The Contact Folders.
     * The user's contacts folders. Read-only. Nullable.
     */
    @SerializedName(value = "contactFolders", alternate = {"ContactFolders"})
    @Expose
	@Nullable
    public ContactFolderCollectionPage contactFolders;

    /**
     * The Contacts.
     * The user's contacts. Read-only. Nullable.
     */
    @SerializedName(value = "contacts", alternate = {"Contacts"})
    @Expose
	@Nullable
    public ContactCollectionPage contacts;

    /**
     * The Events.
     * The user's events. Default is to show events under the Default Calendar. Read-only. Nullable.
     */
    @SerializedName(value = "events", alternate = {"Events"})
    @Expose
	@Nullable
    public EventCollectionPage events;

    /**
     * The Inference Classification.
     * Relevance classification of the user's messages based on explicit designations which override inferred relevance or importance.
     */
    @SerializedName(value = "inferenceClassification", alternate = {"InferenceClassification"})
    @Expose
	@Nullable
    public InferenceClassification inferenceClassification;

    /**
     * The Joined Groups.
     * Read-only. Nullable.
     */
    @SerializedName(value = "joinedGroups", alternate = {"JoinedGroups"})
    @Expose
	@Nullable
    public GroupCollectionPage joinedGroups;

    /**
     * The Mail Folders.
     * The user's mail folders. Read-only. Nullable.
     */
    @SerializedName(value = "mailFolders", alternate = {"MailFolders"})
    @Expose
	@Nullable
    public MailFolderCollectionPage mailFolders;

    /**
     * The Messages.
     * The messages in a mailbox or folder. Read-only. Nullable.
     */
    @SerializedName(value = "messages", alternate = {"Messages"})
    @Expose
	@Nullable
    public MessageCollectionPage messages;

    /**
     * The Outlook.
     * Selective Outlook services available to the user. Read-only. Nullable.
     */
    @SerializedName(value = "outlook", alternate = {"Outlook"})
    @Expose
	@Nullable
    public OutlookUser outlook;

    /**
     * The People.
     * Read-only. The most relevant people to the user. The collection is ordered by their relevance to the user, which is determined by the user's communication, collaboration and business relationships. A person is an aggregation of information from across mail, contacts and social networks.
     */
    @SerializedName(value = "people", alternate = {"People"})
    @Expose
	@Nullable
    public PersonCollectionPage people;

    /**
     * The Drive.
     * The user's OneDrive. Read-only.
     */
    @SerializedName(value = "drive", alternate = {"Drive"})
    @Expose
	@Nullable
    public Drive drive;

    /**
     * The Drives.
     * A collection of drives available for this user. Read-only.
     */
    @SerializedName(value = "drives", alternate = {"Drives"})
    @Expose
	@Nullable
    public DriveCollectionPage drives;

    /**
     * The Followed Sites.
     * 
     */
	@Nullable
    public SiteCollectionPage followedSites;

    /**
     * The Extensions.
     * The collection of open extensions defined for the user. Nullable.
     */
    @SerializedName(value = "extensions", alternate = {"Extensions"})
    @Expose
	@Nullable
    public ExtensionCollectionPage extensions;

    /**
     * The App Consent Requests For Approval.
     * 
     */
    @SerializedName(value = "appConsentRequestsForApproval", alternate = {"AppConsentRequestsForApproval"})
    @Expose
	@Nullable
    public AppConsentRequestCollectionPage appConsentRequestsForApproval;

    /**
     * The Approvals.
     * 
     */
    @SerializedName(value = "approvals", alternate = {"Approvals"})
    @Expose
	@Nullable
    public ApprovalCollectionPage approvals;

    /**
     * The Pending Access Review Instances.
     * Navigation property to get list of access reviews pending approval by reviewer.
     */
    @SerializedName(value = "pendingAccessReviewInstances", alternate = {"PendingAccessReviewInstances"})
    @Expose
	@Nullable
    public AccessReviewInstanceCollectionPage pendingAccessReviewInstances;

    /**
     * The Agreement Acceptances.
     * The user's terms of use acceptance statuses. Read-only. Nullable.
     */
	@Nullable
    public AgreementAcceptanceCollectionPage agreementAcceptances;

    /**
     * The Security.
     * 
     */
    @SerializedName(value = "security", alternate = {"Security"})
    @Expose
	@Nullable
    public Security security;

    /**
     * The Device Enrollment Configurations.
     * Get enrollment configurations targeted to the user
     */
    @SerializedName(value = "deviceEnrollmentConfigurations", alternate = {"DeviceEnrollmentConfigurations"})
    @Expose
	@Nullable
    public DeviceEnrollmentConfigurationCollectionPage deviceEnrollmentConfigurations;

    /**
     * The Managed Devices.
     * The managed devices associated with the user.
     */
    @SerializedName(value = "managedDevices", alternate = {"ManagedDevices"})
    @Expose
	@Nullable
    public ManagedDeviceCollectionPage managedDevices;

    /**
     * The Managed App Registrations.
     * Zero or more managed app registrations that belong to the user.
     */
	@Nullable
    public ManagedAppRegistrationCollectionPage managedAppRegistrations;

    /**
     * The Windows Information Protection Device Registrations.
     * Zero or more WIP device registrations that belong to the user.
     */
	@Nullable
    public WindowsInformationProtectionDeviceRegistrationCollectionPage windowsInformationProtectionDeviceRegistrations;

    /**
     * The Device Management Troubleshooting Events.
     * The list of troubleshooting events for this user.
     */
    @SerializedName(value = "deviceManagementTroubleshootingEvents", alternate = {"DeviceManagementTroubleshootingEvents"})
    @Expose
	@Nullable
    public DeviceManagementTroubleshootingEventCollectionPage deviceManagementTroubleshootingEvents;

    /**
     * The Mobile App Intent And States.
     * The list of troubleshooting events for this user.
     */
    @SerializedName(value = "mobileAppIntentAndStates", alternate = {"MobileAppIntentAndStates"})
    @Expose
	@Nullable
    public MobileAppIntentAndStateCollectionPage mobileAppIntentAndStates;

    /**
     * The Mobile App Troubleshooting Events.
     * The list of mobile app troubleshooting events for this user.
     */
    @SerializedName(value = "mobileAppTroubleshootingEvents", alternate = {"MobileAppTroubleshootingEvents"})
    @Expose
	@Nullable
    public MobileAppTroubleshootingEventCollectionPage mobileAppTroubleshootingEvents;

    /**
     * The Notifications.
     * 
     */
    @SerializedName(value = "notifications", alternate = {"Notifications"})
    @Expose
	@Nullable
    public NotificationCollectionPage notifications;

    /**
     * The Planner.
     * Selective Planner services available to the user. Read-only. Nullable.
     */
    @SerializedName(value = "planner", alternate = {"Planner"})
    @Expose
	@Nullable
    public PlannerUser planner;

    /**
     * The Insights.
     * Read-only. Nullable.
     */
    @SerializedName(value = "insights", alternate = {"Insights"})
    @Expose
	@Nullable
    public ItemInsights insights;

    /**
     * The Settings.
     * Read-only. Nullable.
     */
    @SerializedName(value = "settings", alternate = {"Settings"})
    @Expose
	@Nullable
    public UserSettings settings;

    /**
     * The Onenote.
     * Read-only.
     */
    @SerializedName(value = "onenote", alternate = {"Onenote"})
    @Expose
	@Nullable
    public Onenote onenote;

    /**
     * The Photo.
     * The user's profile photo. Read-only.
     */
    @SerializedName(value = "photo", alternate = {"Photo"})
    @Expose
	@Nullable
    public ProfilePhoto photo;

    /**
     * The Photos.
     * Read-only. Nullable.
     */
    @SerializedName(value = "photos", alternate = {"Photos"})
    @Expose
	@Nullable
    public ProfilePhotoCollectionPage photos;

    /**
     * The Profile.
     * Represents properties that are descriptive of a user in a tenant.
     */
    @SerializedName(value = "profile", alternate = {"Profile"})
    @Expose
	@Nullable
    public Profile profile;

    /**
     * The Activities.
     * The user's activities across devices. Read-only. Nullable.
     */
    @SerializedName(value = "activities", alternate = {"Activities"})
    @Expose
	@Nullable
    public UserActivityCollectionPage activities;

    /**
     * The Devices.
     * 
     */
    @SerializedName(value = "devices", alternate = {"Devices"})
    @Expose
	@Nullable
    public DeviceCollectionPage devices;

    /**
     * The Online Meetings.
     * 
     */
    @SerializedName(value = "onlineMeetings", alternate = {"OnlineMeetings"})
    @Expose
	@Nullable
    public OnlineMeetingCollectionPage onlineMeetings;

    /**
     * The Presence.
     * 
     */
    @SerializedName(value = "presence", alternate = {"Presence"})
    @Expose
	@Nullable
    public Presence presence;

    /**
     * The Authentication.
     * TODO: Add Description
     */
    @SerializedName(value = "authentication", alternate = {"Authentication"})
    @Expose
	@Nullable
    public Authentication authentication;

    /**
     * The Tasks.
     * 
     */
    @SerializedName(value = "tasks", alternate = {"Tasks"})
    @Expose
	@Nullable
    public Tasks tasks;

    /**
     * The Chats.
     * 
     */
    @SerializedName(value = "chats", alternate = {"Chats"})
    @Expose
	@Nullable
    public ChatCollectionPage chats;

    /**
     * The Joined Teams.
     * The Microsoft Teams teams that the user is a member of. Read-only. Nullable.
     */
	@Nullable
    public TeamCollectionPage joinedTeams;

    /**
     * The Teamwork.
     * A container for Microsoft Teams features available for the user. Read-only. Nullable.
     */
    @SerializedName(value = "teamwork", alternate = {"Teamwork"})
    @Expose
	@Nullable
    public UserTeamwork teamwork;

    /**
     * The Todo.
     * Represents the To Do services available to a user.
     */
    @SerializedName(value = "todo", alternate = {"Todo"})
    @Expose
	@Nullable
    public Todo todo;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("cloudPCs")) {
            cloudPCs = serializer.deserializeObject(json.get("cloudPCs"), CloudPCCollectionPage.class);
        }

        if (json.has("usageRights")) {
            usageRights = serializer.deserializeObject(json.get("usageRights"), UsageRightCollectionPage.class);
        }

        if (json.has("appRoleAssignments")) {
            appRoleAssignments = serializer.deserializeObject(json.get("appRoleAssignments"), AppRoleAssignmentCollectionPage.class);
        }

        if (json.has("createdObjects")) {
            createdObjects = serializer.deserializeObject(json.get("createdObjects"), DirectoryObjectCollectionPage.class);
        }

        if (json.has("directReports")) {
            directReports = serializer.deserializeObject(json.get("directReports"), DirectoryObjectCollectionPage.class);
        }

        if (json.has("licenseDetails")) {
            licenseDetails = serializer.deserializeObject(json.get("licenseDetails"), LicenseDetailsCollectionPage.class);
        }

        if (json.has("memberOf")) {
            memberOf = serializer.deserializeObject(json.get("memberOf"), DirectoryObjectCollectionPage.class);
        }

        if (json.has("oauth2PermissionGrants")) {
            oauth2PermissionGrants = serializer.deserializeObject(json.get("oauth2PermissionGrants"), OAuth2PermissionGrantCollectionPage.class);
        }

        if (json.has("ownedDevices")) {
            ownedDevices = serializer.deserializeObject(json.get("ownedDevices"), DirectoryObjectCollectionPage.class);
        }

        if (json.has("ownedObjects")) {
            ownedObjects = serializer.deserializeObject(json.get("ownedObjects"), DirectoryObjectCollectionPage.class);
        }

        if (json.has("registeredDevices")) {
            registeredDevices = serializer.deserializeObject(json.get("registeredDevices"), DirectoryObjectCollectionPage.class);
        }

        if (json.has("scopedRoleMemberOf")) {
            scopedRoleMemberOf = serializer.deserializeObject(json.get("scopedRoleMemberOf"), ScopedRoleMembershipCollectionPage.class);
        }

        if (json.has("transitiveMemberOf")) {
            transitiveMemberOf = serializer.deserializeObject(json.get("transitiveMemberOf"), DirectoryObjectCollectionPage.class);
        }

        if (json.has("transitiveReports")) {
            transitiveReports = serializer.deserializeObject(json.get("transitiveReports"), DirectoryObjectCollectionPage.class);
        }

        if (json.has("calendarGroups")) {
            calendarGroups = serializer.deserializeObject(json.get("calendarGroups"), CalendarGroupCollectionPage.class);
        }

        if (json.has("calendars")) {
            calendars = serializer.deserializeObject(json.get("calendars"), CalendarCollectionPage.class);
        }

        if (json.has("calendarView")) {
            calendarView = serializer.deserializeObject(json.get("calendarView"), EventCollectionPage.class);
        }

        if (json.has("contactFolders")) {
            contactFolders = serializer.deserializeObject(json.get("contactFolders"), ContactFolderCollectionPage.class);
        }

        if (json.has("contacts")) {
            contacts = serializer.deserializeObject(json.get("contacts"), ContactCollectionPage.class);
        }

        if (json.has("events")) {
            events = serializer.deserializeObject(json.get("events"), EventCollectionPage.class);
        }

        if (json.has("joinedGroups")) {
            joinedGroups = serializer.deserializeObject(json.get("joinedGroups"), GroupCollectionPage.class);
        }

        if (json.has("mailFolders")) {
            mailFolders = serializer.deserializeObject(json.get("mailFolders"), MailFolderCollectionPage.class);
        }

        if (json.has("messages")) {
            messages = serializer.deserializeObject(json.get("messages"), MessageCollectionPage.class);
        }

        if (json.has("people")) {
            people = serializer.deserializeObject(json.get("people"), PersonCollectionPage.class);
        }

        if (json.has("drives")) {
            drives = serializer.deserializeObject(json.get("drives"), DriveCollectionPage.class);
        }

        if (json.has("followedSites")) {
            followedSites = serializer.deserializeObject(json.get("followedSites"), SiteCollectionPage.class);
        }

        if (json.has("extensions")) {
            extensions = serializer.deserializeObject(json.get("extensions"), ExtensionCollectionPage.class);
        }

        if (json.has("appConsentRequestsForApproval")) {
            appConsentRequestsForApproval = serializer.deserializeObject(json.get("appConsentRequestsForApproval"), AppConsentRequestCollectionPage.class);
        }

        if (json.has("approvals")) {
            approvals = serializer.deserializeObject(json.get("approvals"), ApprovalCollectionPage.class);
        }

        if (json.has("pendingAccessReviewInstances")) {
            pendingAccessReviewInstances = serializer.deserializeObject(json.get("pendingAccessReviewInstances"), AccessReviewInstanceCollectionPage.class);
        }

        if (json.has("agreementAcceptances")) {
            agreementAcceptances = serializer.deserializeObject(json.get("agreementAcceptances"), AgreementAcceptanceCollectionPage.class);
        }

        if (json.has("deviceEnrollmentConfigurations")) {
            deviceEnrollmentConfigurations = serializer.deserializeObject(json.get("deviceEnrollmentConfigurations"), DeviceEnrollmentConfigurationCollectionPage.class);
        }

        if (json.has("managedDevices")) {
            managedDevices = serializer.deserializeObject(json.get("managedDevices"), ManagedDeviceCollectionPage.class);
        }

        if (json.has("managedAppRegistrations")) {
            managedAppRegistrations = serializer.deserializeObject(json.get("managedAppRegistrations"), ManagedAppRegistrationCollectionPage.class);
        }

        if (json.has("windowsInformationProtectionDeviceRegistrations")) {
            windowsInformationProtectionDeviceRegistrations = serializer.deserializeObject(json.get("windowsInformationProtectionDeviceRegistrations"), WindowsInformationProtectionDeviceRegistrationCollectionPage.class);
        }

        if (json.has("deviceManagementTroubleshootingEvents")) {
            deviceManagementTroubleshootingEvents = serializer.deserializeObject(json.get("deviceManagementTroubleshootingEvents"), DeviceManagementTroubleshootingEventCollectionPage.class);
        }

        if (json.has("mobileAppIntentAndStates")) {
            mobileAppIntentAndStates = serializer.deserializeObject(json.get("mobileAppIntentAndStates"), MobileAppIntentAndStateCollectionPage.class);
        }

        if (json.has("mobileAppTroubleshootingEvents")) {
            mobileAppTroubleshootingEvents = serializer.deserializeObject(json.get("mobileAppTroubleshootingEvents"), MobileAppTroubleshootingEventCollectionPage.class);
        }

        if (json.has("notifications")) {
            notifications = serializer.deserializeObject(json.get("notifications"), NotificationCollectionPage.class);
        }

        if (json.has("photos")) {
            photos = serializer.deserializeObject(json.get("photos"), ProfilePhotoCollectionPage.class);
        }

        if (json.has("activities")) {
            activities = serializer.deserializeObject(json.get("activities"), UserActivityCollectionPage.class);
        }

        if (json.has("devices")) {
            devices = serializer.deserializeObject(json.get("devices"), DeviceCollectionPage.class);
        }

        if (json.has("onlineMeetings")) {
            onlineMeetings = serializer.deserializeObject(json.get("onlineMeetings"), OnlineMeetingCollectionPage.class);
        }

        if (json.has("chats")) {
            chats = serializer.deserializeObject(json.get("chats"), ChatCollectionPage.class);
        }

        if (json.has("joinedTeams")) {
            joinedTeams = serializer.deserializeObject(json.get("joinedTeams"), TeamCollectionPage.class);
        }
    }
}
