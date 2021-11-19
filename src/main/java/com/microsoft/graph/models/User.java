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
import com.microsoft.graph.models.UserAnalytics;
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
import com.microsoft.graph.models.Chat;
import com.microsoft.graph.models.Team;
import com.microsoft.graph.models.UserTeamwork;
import com.microsoft.graph.models.Todo;
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
     * 
     */
    @SerializedName(value = "signInActivity", alternate = {"SignInActivity"})
    @Expose
	@Nullable
    public SignInActivity signInActivity;

    /**
     * The Account Enabled.
     * 
     */
    @SerializedName(value = "accountEnabled", alternate = {"AccountEnabled"})
    @Expose
	@Nullable
    public Boolean accountEnabled;

    /**
     * The Age Group.
     * 
     */
    @SerializedName(value = "ageGroup", alternate = {"AgeGroup"})
    @Expose
	@Nullable
    public String ageGroup;

    /**
     * The Assigned Licenses.
     * 
     */
    @SerializedName(value = "assignedLicenses", alternate = {"AssignedLicenses"})
    @Expose
	@Nullable
    public java.util.List<AssignedLicense> assignedLicenses;

    /**
     * The Assigned Plans.
     * 
     */
    @SerializedName(value = "assignedPlans", alternate = {"AssignedPlans"})
    @Expose
	@Nullable
    public java.util.List<AssignedPlan> assignedPlans;

    /**
     * The Business Phones.
     * 
     */
    @SerializedName(value = "businessPhones", alternate = {"BusinessPhones"})
    @Expose
	@Nullable
    public java.util.List<String> businessPhones;

    /**
     * The City.
     * 
     */
    @SerializedName(value = "city", alternate = {"City"})
    @Expose
	@Nullable
    public String city;

    /**
     * The Company Name.
     * 
     */
    @SerializedName(value = "companyName", alternate = {"CompanyName"})
    @Expose
	@Nullable
    public String companyName;

    /**
     * The Consent Provided For Minor.
     * 
     */
    @SerializedName(value = "consentProvidedForMinor", alternate = {"ConsentProvidedForMinor"})
    @Expose
	@Nullable
    public String consentProvidedForMinor;

    /**
     * The Country.
     * 
     */
    @SerializedName(value = "country", alternate = {"Country"})
    @Expose
	@Nullable
    public String country;

    /**
     * The Created Date Time.
     * 
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Creation Type.
     * 
     */
    @SerializedName(value = "creationType", alternate = {"CreationType"})
    @Expose
	@Nullable
    public String creationType;

    /**
     * The Custom Security Attributes.
     * 
     */
    @SerializedName(value = "customSecurityAttributes", alternate = {"CustomSecurityAttributes"})
    @Expose
	@Nullable
    public CustomSecurityAttributeValue customSecurityAttributes;

    /**
     * The Department.
     * 
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
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Employee Hire Date.
     * 
     */
    @SerializedName(value = "employeeHireDate", alternate = {"EmployeeHireDate"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime employeeHireDate;

    /**
     * The Employee Id.
     * 
     */
    @SerializedName(value = "employeeId", alternate = {"EmployeeId"})
    @Expose
	@Nullable
    public String employeeId;

    /**
     * The Employee Org Data.
     * 
     */
    @SerializedName(value = "employeeOrgData", alternate = {"EmployeeOrgData"})
    @Expose
	@Nullable
    public EmployeeOrgData employeeOrgData;

    /**
     * The Employee Type.
     * 
     */
    @SerializedName(value = "employeeType", alternate = {"EmployeeType"})
    @Expose
	@Nullable
    public String employeeType;

    /**
     * The External User State.
     * 
     */
    @SerializedName(value = "externalUserState", alternate = {"ExternalUserState"})
    @Expose
	@Nullable
    public String externalUserState;

    /**
     * The External User State Change Date Time.
     * 
     */
    @SerializedName(value = "externalUserStateChangeDateTime", alternate = {"ExternalUserStateChangeDateTime"})
    @Expose
	@Nullable
    public String externalUserStateChangeDateTime;

    /**
     * The Fax Number.
     * 
     */
    @SerializedName(value = "faxNumber", alternate = {"FaxNumber"})
    @Expose
	@Nullable
    public String faxNumber;

    /**
     * The Given Name.
     * 
     */
    @SerializedName(value = "givenName", alternate = {"GivenName"})
    @Expose
	@Nullable
    public String givenName;

    /**
     * The Identities.
     * 
     */
    @SerializedName(value = "identities", alternate = {"Identities"})
    @Expose
	@Nullable
    public java.util.List<ObjectIdentity> identities;

    /**
     * The Im Addresses.
     * 
     */
    @SerializedName(value = "imAddresses", alternate = {"ImAddresses"})
    @Expose
	@Nullable
    public java.util.List<String> imAddresses;

    /**
     * The Info Catalogs.
     * 
     */
    @SerializedName(value = "infoCatalogs", alternate = {"InfoCatalogs"})
    @Expose
	@Nullable
    public java.util.List<String> infoCatalogs;

    /**
     * The Is Resource Account.
     * 
     */
    @SerializedName(value = "isResourceAccount", alternate = {"IsResourceAccount"})
    @Expose
	@Nullable
    public Boolean isResourceAccount;

    /**
     * The Job Title.
     * 
     */
    @SerializedName(value = "jobTitle", alternate = {"JobTitle"})
    @Expose
	@Nullable
    public String jobTitle;

    /**
     * The Last Password Change Date Time.
     * 
     */
    @SerializedName(value = "lastPasswordChangeDateTime", alternate = {"LastPasswordChangeDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastPasswordChangeDateTime;

    /**
     * The Legal Age Group Classification.
     * 
     */
    @SerializedName(value = "legalAgeGroupClassification", alternate = {"LegalAgeGroupClassification"})
    @Expose
	@Nullable
    public String legalAgeGroupClassification;

    /**
     * The License Assignment States.
     * 
     */
    @SerializedName(value = "licenseAssignmentStates", alternate = {"LicenseAssignmentStates"})
    @Expose
	@Nullable
    public java.util.List<LicenseAssignmentState> licenseAssignmentStates;

    /**
     * The Mail.
     * 
     */
    @SerializedName(value = "mail", alternate = {"Mail"})
    @Expose
	@Nullable
    public String mail;

    /**
     * The Mail Nickname.
     * 
     */
    @SerializedName(value = "mailNickname", alternate = {"MailNickname"})
    @Expose
	@Nullable
    public String mailNickname;

    /**
     * The Mobile Phone.
     * 
     */
    @SerializedName(value = "mobilePhone", alternate = {"MobilePhone"})
    @Expose
	@Nullable
    public String mobilePhone;

    /**
     * The Office Location.
     * 
     */
    @SerializedName(value = "officeLocation", alternate = {"OfficeLocation"})
    @Expose
	@Nullable
    public String officeLocation;

    /**
     * The On Premises Distinguished Name.
     * 
     */
    @SerializedName(value = "onPremisesDistinguishedName", alternate = {"OnPremisesDistinguishedName"})
    @Expose
	@Nullable
    public String onPremisesDistinguishedName;

    /**
     * The On Premises Domain Name.
     * 
     */
    @SerializedName(value = "onPremisesDomainName", alternate = {"OnPremisesDomainName"})
    @Expose
	@Nullable
    public String onPremisesDomainName;

    /**
     * The On Premises Extension Attributes.
     * 
     */
    @SerializedName(value = "onPremisesExtensionAttributes", alternate = {"OnPremisesExtensionAttributes"})
    @Expose
	@Nullable
    public OnPremisesExtensionAttributes onPremisesExtensionAttributes;

    /**
     * The On Premises Immutable Id.
     * 
     */
    @SerializedName(value = "onPremisesImmutableId", alternate = {"OnPremisesImmutableId"})
    @Expose
	@Nullable
    public String onPremisesImmutableId;

    /**
     * The On Premises Last Sync Date Time.
     * 
     */
    @SerializedName(value = "onPremisesLastSyncDateTime", alternate = {"OnPremisesLastSyncDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime onPremisesLastSyncDateTime;

    /**
     * The On Premises Provisioning Errors.
     * 
     */
    @SerializedName(value = "onPremisesProvisioningErrors", alternate = {"OnPremisesProvisioningErrors"})
    @Expose
	@Nullable
    public java.util.List<OnPremisesProvisioningError> onPremisesProvisioningErrors;

    /**
     * The On Premises Sam Account Name.
     * 
     */
    @SerializedName(value = "onPremisesSamAccountName", alternate = {"OnPremisesSamAccountName"})
    @Expose
	@Nullable
    public String onPremisesSamAccountName;

    /**
     * The On Premises Security Identifier.
     * 
     */
    @SerializedName(value = "onPremisesSecurityIdentifier", alternate = {"OnPremisesSecurityIdentifier"})
    @Expose
	@Nullable
    public String onPremisesSecurityIdentifier;

    /**
     * The On Premises Sync Enabled.
     * 
     */
    @SerializedName(value = "onPremisesSyncEnabled", alternate = {"OnPremisesSyncEnabled"})
    @Expose
	@Nullable
    public Boolean onPremisesSyncEnabled;

    /**
     * The On Premises User Principal Name.
     * 
     */
    @SerializedName(value = "onPremisesUserPrincipalName", alternate = {"OnPremisesUserPrincipalName"})
    @Expose
	@Nullable
    public String onPremisesUserPrincipalName;

    /**
     * The Other Mails.
     * 
     */
    @SerializedName(value = "otherMails", alternate = {"OtherMails"})
    @Expose
	@Nullable
    public java.util.List<String> otherMails;

    /**
     * The Password Policies.
     * 
     */
    @SerializedName(value = "passwordPolicies", alternate = {"PasswordPolicies"})
    @Expose
	@Nullable
    public String passwordPolicies;

    /**
     * The Password Profile.
     * 
     */
    @SerializedName(value = "passwordProfile", alternate = {"PasswordProfile"})
    @Expose
	@Nullable
    public PasswordProfile passwordProfile;

    /**
     * The Postal Code.
     * 
     */
    @SerializedName(value = "postalCode", alternate = {"PostalCode"})
    @Expose
	@Nullable
    public String postalCode;

    /**
     * The Preferred Data Location.
     * 
     */
    @SerializedName(value = "preferredDataLocation", alternate = {"PreferredDataLocation"})
    @Expose
	@Nullable
    public String preferredDataLocation;

    /**
     * The Preferred Language.
     * 
     */
    @SerializedName(value = "preferredLanguage", alternate = {"PreferredLanguage"})
    @Expose
	@Nullable
    public String preferredLanguage;

    /**
     * The Provisioned Plans.
     * 
     */
    @SerializedName(value = "provisionedPlans", alternate = {"ProvisionedPlans"})
    @Expose
	@Nullable
    public java.util.List<ProvisionedPlan> provisionedPlans;

    /**
     * The Proxy Addresses.
     * 
     */
    @SerializedName(value = "proxyAddresses", alternate = {"ProxyAddresses"})
    @Expose
	@Nullable
    public java.util.List<String> proxyAddresses;

    /**
     * The Refresh Tokens Valid From Date Time.
     * 
     */
    @SerializedName(value = "refreshTokensValidFromDateTime", alternate = {"RefreshTokensValidFromDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime refreshTokensValidFromDateTime;

    /**
     * The Show In Address List.
     * 
     */
    @SerializedName(value = "showInAddressList", alternate = {"ShowInAddressList"})
    @Expose
	@Nullable
    public Boolean showInAddressList;

    /**
     * The Sign In Sessions Valid From Date Time.
     * 
     */
    @SerializedName(value = "signInSessionsValidFromDateTime", alternate = {"SignInSessionsValidFromDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime signInSessionsValidFromDateTime;

    /**
     * The State.
     * 
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
	@Nullable
    public String state;

    /**
     * The Street Address.
     * 
     */
    @SerializedName(value = "streetAddress", alternate = {"StreetAddress"})
    @Expose
	@Nullable
    public String streetAddress;

    /**
     * The Surname.
     * 
     */
    @SerializedName(value = "surname", alternate = {"Surname"})
    @Expose
	@Nullable
    public String surname;

    /**
     * The Usage Location.
     * 
     */
    @SerializedName(value = "usageLocation", alternate = {"UsageLocation"})
    @Expose
	@Nullable
    public String usageLocation;

    /**
     * The User Principal Name.
     * 
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
	@Nullable
    public String userPrincipalName;

    /**
     * The User Type.
     * 
     */
    @SerializedName(value = "userType", alternate = {"UserType"})
    @Expose
	@Nullable
    public String userType;

    /**
     * The Mailbox Settings.
     * 
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
     * The About Me.
     * 
     */
    @SerializedName(value = "aboutMe", alternate = {"AboutMe"})
    @Expose
	@Nullable
    public String aboutMe;

    /**
     * The Birthday.
     * 
     */
    @SerializedName(value = "birthday", alternate = {"Birthday"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime birthday;

    /**
     * The Hire Date.
     * 
     */
    @SerializedName(value = "hireDate", alternate = {"HireDate"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime hireDate;

    /**
     * The Interests.
     * 
     */
    @SerializedName(value = "interests", alternate = {"Interests"})
    @Expose
	@Nullable
    public java.util.List<String> interests;

    /**
     * The My Site.
     * 
     */
    @SerializedName(value = "mySite", alternate = {"MySite"})
    @Expose
	@Nullable
    public String mySite;

    /**
     * The Past Projects.
     * 
     */
    @SerializedName(value = "pastProjects", alternate = {"PastProjects"})
    @Expose
	@Nullable
    public java.util.List<String> pastProjects;

    /**
     * The Preferred Name.
     * 
     */
    @SerializedName(value = "preferredName", alternate = {"PreferredName"})
    @Expose
	@Nullable
    public String preferredName;

    /**
     * The Responsibilities.
     * 
     */
    @SerializedName(value = "responsibilities", alternate = {"Responsibilities"})
    @Expose
	@Nullable
    public java.util.List<String> responsibilities;

    /**
     * The Schools.
     * 
     */
    @SerializedName(value = "schools", alternate = {"Schools"})
    @Expose
	@Nullable
    public java.util.List<String> schools;

    /**
     * The Skills.
     * 
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
     * The Usage Rights.
     * 
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
     * 
     */
    @SerializedName(value = "appRoleAssignments", alternate = {"AppRoleAssignments"})
    @Expose
	@Nullable
    public AppRoleAssignmentCollectionPage appRoleAssignments;

    /**
     * The Created Objects.
     * 
     */
	@Nullable
    public DirectoryObjectCollectionPage createdObjects;

    /**
     * The Direct Reports.
     * 
     */
	@Nullable
    public DirectoryObjectCollectionPage directReports;

    /**
     * The License Details.
     * 
     */
    @SerializedName(value = "licenseDetails", alternate = {"LicenseDetails"})
    @Expose
	@Nullable
    public LicenseDetailsCollectionPage licenseDetails;

    /**
     * The Manager.
     * 
     */
    @SerializedName(value = "manager", alternate = {"Manager"})
    @Expose
	@Nullable
    public DirectoryObject manager;

    /**
     * The Member Of.
     * 
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
     * 
     */
	@Nullable
    public DirectoryObjectCollectionPage ownedDevices;

    /**
     * The Owned Objects.
     * 
     */
	@Nullable
    public DirectoryObjectCollectionPage ownedObjects;

    /**
     * The Registered Devices.
     * 
     */
	@Nullable
    public DirectoryObjectCollectionPage registeredDevices;

    /**
     * The Scoped Role Member Of.
     * 
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
     * 
     */
	@Nullable
    public DirectoryObjectCollectionPage transitiveReports;

    /**
     * The Calendar.
     * 
     */
    @SerializedName(value = "calendar", alternate = {"Calendar"})
    @Expose
	@Nullable
    public Calendar calendar;

    /**
     * The Calendar Groups.
     * 
     */
    @SerializedName(value = "calendarGroups", alternate = {"CalendarGroups"})
    @Expose
	@Nullable
    public CalendarGroupCollectionPage calendarGroups;

    /**
     * The Calendars.
     * 
     */
    @SerializedName(value = "calendars", alternate = {"Calendars"})
    @Expose
	@Nullable
    public CalendarCollectionPage calendars;

    /**
     * The Calendar View.
     * 
     */
    @SerializedName(value = "calendarView", alternate = {"CalendarView"})
    @Expose
	@Nullable
    public EventCollectionPage calendarView;

    /**
     * The Contact Folders.
     * 
     */
    @SerializedName(value = "contactFolders", alternate = {"ContactFolders"})
    @Expose
	@Nullable
    public ContactFolderCollectionPage contactFolders;

    /**
     * The Contacts.
     * 
     */
    @SerializedName(value = "contacts", alternate = {"Contacts"})
    @Expose
	@Nullable
    public ContactCollectionPage contacts;

    /**
     * The Events.
     * 
     */
    @SerializedName(value = "events", alternate = {"Events"})
    @Expose
	@Nullable
    public EventCollectionPage events;

    /**
     * The Inference Classification.
     * 
     */
    @SerializedName(value = "inferenceClassification", alternate = {"InferenceClassification"})
    @Expose
	@Nullable
    public InferenceClassification inferenceClassification;

    /**
     * The Joined Groups.
     * 
     */
    @SerializedName(value = "joinedGroups", alternate = {"JoinedGroups"})
    @Expose
	@Nullable
    public GroupCollectionPage joinedGroups;

    /**
     * The Mail Folders.
     * 
     */
    @SerializedName(value = "mailFolders", alternate = {"MailFolders"})
    @Expose
	@Nullable
    public MailFolderCollectionPage mailFolders;

    /**
     * The Messages.
     * 
     */
    @SerializedName(value = "messages", alternate = {"Messages"})
    @Expose
	@Nullable
    public MessageCollectionPage messages;

    /**
     * The Outlook.
     * 
     */
    @SerializedName(value = "outlook", alternate = {"Outlook"})
    @Expose
	@Nullable
    public OutlookUser outlook;

    /**
     * The People.
     * 
     */
    @SerializedName(value = "people", alternate = {"People"})
    @Expose
	@Nullable
    public PersonCollectionPage people;

    /**
     * The Drive.
     * 
     */
    @SerializedName(value = "drive", alternate = {"Drive"})
    @Expose
	@Nullable
    public Drive drive;

    /**
     * The Drives.
     * 
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
     * 
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
     * 
     */
    @SerializedName(value = "pendingAccessReviewInstances", alternate = {"PendingAccessReviewInstances"})
    @Expose
	@Nullable
    public AccessReviewInstanceCollectionPage pendingAccessReviewInstances;

    /**
     * The Agreement Acceptances.
     * 
     */
	@Nullable
    public AgreementAcceptanceCollectionPage agreementAcceptances;

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
     * 
     */
    @SerializedName(value = "planner", alternate = {"Planner"})
    @Expose
	@Nullable
    public PlannerUser planner;

    /**
     * The Insights.
     * 
     */
    @SerializedName(value = "insights", alternate = {"Insights"})
    @Expose
	@Nullable
    public ItemInsights insights;

    /**
     * The Settings.
     * 
     */
    @SerializedName(value = "settings", alternate = {"Settings"})
    @Expose
	@Nullable
    public UserSettings settings;

    /**
     * The Onenote.
     * 
     */
    @SerializedName(value = "onenote", alternate = {"Onenote"})
    @Expose
	@Nullable
    public Onenote onenote;

    /**
     * The Photo.
     * 
     */
    @SerializedName(value = "photo", alternate = {"Photo"})
    @Expose
	@Nullable
    public ProfilePhoto photo;

    /**
     * The Photos.
     * 
     */
    @SerializedName(value = "photos", alternate = {"Photos"})
    @Expose
	@Nullable
    public ProfilePhotoCollectionPage photos;

    /**
     * The Profile.
     * 
     */
    @SerializedName(value = "profile", alternate = {"Profile"})
    @Expose
	@Nullable
    public Profile profile;

    /**
     * The Activities.
     * 
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
     * 
     */
    @SerializedName(value = "authentication", alternate = {"Authentication"})
    @Expose
	@Nullable
    public Authentication authentication;

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
     * 
     */
	@Nullable
    public TeamCollectionPage joinedTeams;

    /**
     * The Teamwork.
     * 
     */
    @SerializedName(value = "teamwork", alternate = {"Teamwork"})
    @Expose
	@Nullable
    public UserTeamwork teamwork;

    /**
     * The Todo.
     * 
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
