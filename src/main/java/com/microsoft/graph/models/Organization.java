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
import com.microsoft.graph.models.AssignedPlan;
import com.microsoft.graph.models.DirectorySizeQuota;
import com.microsoft.graph.models.PrivacyProfile;
import com.microsoft.graph.models.ProvisionedPlan;
import com.microsoft.graph.models.VerifiedDomain;
import com.microsoft.graph.models.CertificateConnectorSetting;
import com.microsoft.graph.models.MdmAuthority;
import com.microsoft.graph.models.OrganizationalBranding;
import com.microsoft.graph.models.CertificateBasedAuthConfiguration;
import com.microsoft.graph.models.Extension;
import com.microsoft.graph.models.OrganizationSettings;
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.requests.CertificateBasedAuthConfigurationCollectionPage;
import com.microsoft.graph.requests.ExtensionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Organization.
 */
public class Organization extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Assigned Plans.
     * The collection of service plans associated with the tenant. Not nullable.
     */
    @SerializedName(value = "assignedPlans", alternate = {"AssignedPlans"})
    @Expose
	@Nullable
    public java.util.List<AssignedPlan> assignedPlans;

    /**
     * The Business Phones.
     * Telephone number for the organization. Although this is a string collection, only one number can be set for this property.
     */
    @SerializedName(value = "businessPhones", alternate = {"BusinessPhones"})
    @Expose
	@Nullable
    public java.util.List<String> businessPhones;

    /**
     * The City.
     * City name of the address for the organization.
     */
    @SerializedName(value = "city", alternate = {"City"})
    @Expose
	@Nullable
    public String city;

    /**
     * The Country.
     * Country/region name of the address for the organization.
     */
    @SerializedName(value = "country", alternate = {"Country"})
    @Expose
	@Nullable
    public String country;

    /**
     * The Country Letter Code.
     * Country/region abbreviation for the organization.
     */
    @SerializedName(value = "countryLetterCode", alternate = {"CountryLetterCode"})
    @Expose
	@Nullable
    public String countryLetterCode;

    /**
     * The Created Date Time.
     * Timestamp of when the organization was created. The value cannot be modified and is automatically populated when the organization is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Directory Size Quota.
     * The directory size quota information of an organization.
     */
    @SerializedName(value = "directorySizeQuota", alternate = {"DirectorySizeQuota"})
    @Expose
	@Nullable
    public DirectorySizeQuota directorySizeQuota;

    /**
     * The Display Name.
     * The display name for the tenant.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Is Multiple Data Locations For Services Enabled.
     * true if organization is Multi-Geo enabled; false if organization is not Multi-Geo enabled; null (default). Read-only. For more information, see OneDrive Online Multi-Geo.
     */
    @SerializedName(value = "isMultipleDataLocationsForServicesEnabled", alternate = {"IsMultipleDataLocationsForServicesEnabled"})
    @Expose
	@Nullable
    public Boolean isMultipleDataLocationsForServicesEnabled;

    /**
     * The Marketing Notification Emails.
     * Not nullable.
     */
    @SerializedName(value = "marketingNotificationEmails", alternate = {"MarketingNotificationEmails"})
    @Expose
	@Nullable
    public java.util.List<String> marketingNotificationEmails;

    /**
     * The On Premises Last Sync Date Time.
     * The time and date at which the tenant was last synced with the on-premise directory. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    @SerializedName(value = "onPremisesLastSyncDateTime", alternate = {"OnPremisesLastSyncDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime onPremisesLastSyncDateTime;

    /**
     * The On Premises Sync Enabled.
     * true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced. Nullable. null if this object has never been synced from an on-premises directory (default).
     */
    @SerializedName(value = "onPremisesSyncEnabled", alternate = {"OnPremisesSyncEnabled"})
    @Expose
	@Nullable
    public Boolean onPremisesSyncEnabled;

    /**
     * The Postal Code.
     * Postal code of the address for the organization.
     */
    @SerializedName(value = "postalCode", alternate = {"PostalCode"})
    @Expose
	@Nullable
    public String postalCode;

    /**
     * The Preferred Language.
     * The preferred language for the organization. Should follow ISO 639-1 Code; for example en.
     */
    @SerializedName(value = "preferredLanguage", alternate = {"PreferredLanguage"})
    @Expose
	@Nullable
    public String preferredLanguage;

    /**
     * The Privacy Profile.
     * The privacy profile of an organization.
     */
    @SerializedName(value = "privacyProfile", alternate = {"PrivacyProfile"})
    @Expose
	@Nullable
    public PrivacyProfile privacyProfile;

    /**
     * The Provisioned Plans.
     * Not nullable.
     */
    @SerializedName(value = "provisionedPlans", alternate = {"ProvisionedPlans"})
    @Expose
	@Nullable
    public java.util.List<ProvisionedPlan> provisionedPlans;

    /**
     * The Security Compliance Notification Mails.
     * 
     */
    @SerializedName(value = "securityComplianceNotificationMails", alternate = {"SecurityComplianceNotificationMails"})
    @Expose
	@Nullable
    public java.util.List<String> securityComplianceNotificationMails;

    /**
     * The Security Compliance Notification Phones.
     * 
     */
    @SerializedName(value = "securityComplianceNotificationPhones", alternate = {"SecurityComplianceNotificationPhones"})
    @Expose
	@Nullable
    public java.util.List<String> securityComplianceNotificationPhones;

    /**
     * The State.
     * State name of the address for the organization.
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
	@Nullable
    public String state;

    /**
     * The Street.
     * Street name of the address for organization.
     */
    @SerializedName(value = "street", alternate = {"Street"})
    @Expose
	@Nullable
    public String street;

    /**
     * The Technical Notification Mails.
     * Not nullable.
     */
    @SerializedName(value = "technicalNotificationMails", alternate = {"TechnicalNotificationMails"})
    @Expose
	@Nullable
    public java.util.List<String> technicalNotificationMails;

    /**
     * The Verified Domains.
     * The collection of domains associated with this tenant. Not nullable.
     */
    @SerializedName(value = "verifiedDomains", alternate = {"VerifiedDomains"})
    @Expose
	@Nullable
    public java.util.List<VerifiedDomain> verifiedDomains;

    /**
     * The Certificate Connector Setting.
     * Certificate connector setting.
     */
    @SerializedName(value = "certificateConnectorSetting", alternate = {"CertificateConnectorSetting"})
    @Expose
	@Nullable
    public CertificateConnectorSetting certificateConnectorSetting;

    /**
     * The Mobile Device Management Authority.
     * Mobile device management authority. Possible values are: unknown, intune, sccm, office365.
     */
    @SerializedName(value = "mobileDeviceManagementAuthority", alternate = {"MobileDeviceManagementAuthority"})
    @Expose
	@Nullable
    public MdmAuthority mobileDeviceManagementAuthority;

    /**
     * The Branding.
     * 
     */
    @SerializedName(value = "branding", alternate = {"Branding"})
    @Expose
	@Nullable
    public OrganizationalBranding branding;

    /**
     * The Certificate Based Auth Configuration.
     * Navigation property to manage certificate-based authentication configuration. Only a single instance of certificateBasedAuthConfiguration can be created in the collection.
     */
	@Nullable
    public CertificateBasedAuthConfigurationCollectionPage certificateBasedAuthConfiguration;

    /**
     * The Extensions.
     * The collection of open extensions defined for the organization. Read-only. Nullable.
     */
    @SerializedName(value = "extensions", alternate = {"Extensions"})
    @Expose
	@Nullable
    public ExtensionCollectionPage extensions;

    /**
     * The Settings.
     * Retrieve the properties and relationships of organizationSettings object. Nullable.
     */
    @SerializedName(value = "settings", alternate = {"Settings"})
    @Expose
	@Nullable
    public OrganizationSettings settings;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("certificateBasedAuthConfiguration")) {
            certificateBasedAuthConfiguration = serializer.deserializeObject(json.get("certificateBasedAuthConfiguration"), CertificateBasedAuthConfigurationCollectionPage.class);
        }

        if (json.has("extensions")) {
            extensions = serializer.deserializeObject(json.get("extensions"), ExtensionCollectionPage.class);
        }
    }
}
