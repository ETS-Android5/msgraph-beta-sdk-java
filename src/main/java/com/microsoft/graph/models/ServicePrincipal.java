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
import com.microsoft.graph.models.PasswordSingleSignOnSettings;
import com.microsoft.graph.models.AddIn;
import com.microsoft.graph.models.AppRole;
import com.microsoft.graph.models.CustomSecurityAttributeValue;
import com.microsoft.graph.models.InformationalUrl;
import com.microsoft.graph.models.KeyCredential;
import com.microsoft.graph.models.PasswordCredential;
import com.microsoft.graph.models.PermissionScope;
import com.microsoft.graph.models.SamlSingleSignOnSettings;
import com.microsoft.graph.models.AppManagementPolicy;
import com.microsoft.graph.models.AppRoleAssignment;
import com.microsoft.graph.models.ClaimsMappingPolicy;
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.models.DelegatedPermissionClassification;
import com.microsoft.graph.models.Endpoint;
import com.microsoft.graph.models.FederatedIdentityCredential;
import com.microsoft.graph.models.HomeRealmDiscoveryPolicy;
import com.microsoft.graph.models.LicenseDetails;
import com.microsoft.graph.models.OAuth2PermissionGrant;
import com.microsoft.graph.models.TokenIssuancePolicy;
import com.microsoft.graph.models.TokenLifetimePolicy;
import com.microsoft.graph.models.Synchronization;
import com.microsoft.graph.requests.AppManagementPolicyCollectionPage;
import com.microsoft.graph.requests.AppRoleAssignmentCollectionPage;
import com.microsoft.graph.requests.ClaimsMappingPolicyCollectionPage;
import com.microsoft.graph.requests.DirectoryObjectCollectionPage;
import com.microsoft.graph.requests.DelegatedPermissionClassificationCollectionPage;
import com.microsoft.graph.requests.EndpointCollectionPage;
import com.microsoft.graph.requests.FederatedIdentityCredentialCollectionPage;
import com.microsoft.graph.requests.HomeRealmDiscoveryPolicyCollectionPage;
import com.microsoft.graph.requests.LicenseDetailsCollectionPage;
import com.microsoft.graph.requests.OAuth2PermissionGrantCollectionPage;
import com.microsoft.graph.requests.TokenIssuancePolicyCollectionPage;
import com.microsoft.graph.requests.TokenLifetimePolicyCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal.
 */
public class ServicePrincipal extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Password Single Sign On Settings.
     * The collection for settings related to password single sign-on. Use $select=passwordSingleSignOnSettings to read the property. Read-only for applicationTemplates except for custom applicationTemplates.
     */
    @SerializedName(value = "passwordSingleSignOnSettings", alternate = {"PasswordSingleSignOnSettings"})
    @Expose
	@Nullable
    public PasswordSingleSignOnSettings passwordSingleSignOnSettings;

    /**
     * The Account Enabled.
     * true if the service principal account is enabled; otherwise, false. Supports $filter (eq, ne, not, in).
     */
    @SerializedName(value = "accountEnabled", alternate = {"AccountEnabled"})
    @Expose
	@Nullable
    public Boolean accountEnabled;

    /**
     * The Add Ins.
     * Defines custom behavior that a consuming service can use to call an app in specific contexts. For example, applications that can render file streams may set the addIns property for its 'FileHandler' functionality. This will let services like Microsoft 365 call the application in the context of a document the user is working on.
     */
    @SerializedName(value = "addIns", alternate = {"AddIns"})
    @Expose
	@Nullable
    public java.util.List<AddIn> addIns;

    /**
     * The Alternative Names.
     * Used to retrieve service principals by subscription, identify resource group and full resource ids for managed identities. Supports $filter (eq, not, ge, le, startsWith).
     */
    @SerializedName(value = "alternativeNames", alternate = {"AlternativeNames"})
    @Expose
	@Nullable
    public java.util.List<String> alternativeNames;

    /**
     * The App Description.
     * The description exposed by the associated application.
     */
    @SerializedName(value = "appDescription", alternate = {"AppDescription"})
    @Expose
	@Nullable
    public String appDescription;

    /**
     * The App Display Name.
     * The display name exposed by the associated application.
     */
    @SerializedName(value = "appDisplayName", alternate = {"AppDisplayName"})
    @Expose
	@Nullable
    public String appDisplayName;

    /**
     * The App Id.
     * The unique identifier for the associated application (its appId property). Supports $filter (eq, ne, not, in, startsWith).
     */
    @SerializedName(value = "appId", alternate = {"AppId"})
    @Expose
	@Nullable
    public String appId;

    /**
     * The Application Template Id.
     * Unique identifier of the applicationTemplate that the servicePrincipal was created from. Read-only. Supports $filter (eq, ne, NOT, startsWith).
     */
    @SerializedName(value = "applicationTemplateId", alternate = {"ApplicationTemplateId"})
    @Expose
	@Nullable
    public String applicationTemplateId;

    /**
     * The App Owner Organization Id.
     * Contains the tenant id where the application is registered. This is applicable only to service principals backed by applications.Supports $filter (eq, ne, NOT, ge, le).
     */
    @SerializedName(value = "appOwnerOrganizationId", alternate = {"AppOwnerOrganizationId"})
    @Expose
	@Nullable
    public java.util.UUID appOwnerOrganizationId;

    /**
     * The App Role Assignment Required.
     * Specifies whether users or other service principals need to be granted an app role assignment for this service principal before users can sign in or apps can get tokens. The default value is false. Not nullable. Supports $filter (eq, ne, NOT).
     */
    @SerializedName(value = "appRoleAssignmentRequired", alternate = {"AppRoleAssignmentRequired"})
    @Expose
	@Nullable
    public Boolean appRoleAssignmentRequired;

    /**
     * The App Roles.
     * The roles exposed by the application which this service principal represents. For more information see the appRoles property definition on the application entity. Not nullable.
     */
    @SerializedName(value = "appRoles", alternate = {"AppRoles"})
    @Expose
	@Nullable
    public java.util.List<AppRole> appRoles;

    /**
     * The Custom Security Attributes.
     * An open complex type that holds the value of a custom security attribute that is assigned to a directory object. Nullable. Returned only on $select. Supports $filter (eq, ne, not, startsWith).
     */
    @SerializedName(value = "customSecurityAttributes", alternate = {"CustomSecurityAttributes"})
    @Expose
	@Nullable
    public CustomSecurityAttributeValue customSecurityAttributes;

    /**
     * The Description.
     * Free text field to provide an internal end-user facing description of the service principal. End-user portals such MyApps will display the application description in this field. The maximum allowed size is 1024 characters. Supports $filter (eq, ne, not, ge, le, startsWith) and $search.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Disabled By Microsoft Status.
     * Specifies whether Microsoft has disabled the registered application. Possible values are: null (default value), NotDisabled, and DisabledDueToViolationOfServicesAgreement (reasons may include suspicious, abusive, or malicious activity, or a violation of the Microsoft Services Agreement).  Supports $filter (eq, ne, not).
     */
    @SerializedName(value = "disabledByMicrosoftStatus", alternate = {"DisabledByMicrosoftStatus"})
    @Expose
	@Nullable
    public String disabledByMicrosoftStatus;

    /**
     * The Display Name.
     * The display name for the service principal. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderBy.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Error Url.
     * Deprecated. Don't use.
     */
    @SerializedName(value = "errorUrl", alternate = {"ErrorUrl"})
    @Expose
	@Nullable
    public String errorUrl;

    /**
     * The Homepage.
     * Home page or landing page of the application.
     */
    @SerializedName(value = "homepage", alternate = {"Homepage"})
    @Expose
	@Nullable
    public String homepage;

    /**
     * The Info.
     * Basic profile information of the acquired application such as app's marketing, support, terms of service and privacy statement URLs. The terms of service and privacy statement are surfaced to users through the user consent experience. For more info, see How to: Add Terms of service and privacy statement for registered Azure AD apps. Supports $filter (eq, ne, not, ge, le, and eq on null values).
     */
    @SerializedName(value = "info", alternate = {"Info"})
    @Expose
	@Nullable
    public InformationalUrl info;

    /**
     * The Key Credentials.
     * The collection of key credentials associated with the service principal. Not nullable. Supports $filter (eq, not, ge, le).
     */
    @SerializedName(value = "keyCredentials", alternate = {"KeyCredentials"})
    @Expose
	@Nullable
    public java.util.List<KeyCredential> keyCredentials;

    /**
     * The Login Url.
     * Specifies the URL where the service provider redirects the user to Azure AD to authenticate. Azure AD uses the URL to launch the application from Microsoft 365 or the Azure AD My Apps. When blank, Azure AD performs IdP-initiated sign-on for applications configured with SAML-based single sign-on. The user launches the application from Microsoft 365, the Azure AD My Apps, or the Azure AD SSO URL.
     */
    @SerializedName(value = "loginUrl", alternate = {"LoginUrl"})
    @Expose
	@Nullable
    public String loginUrl;

    /**
     * The Logout Url.
     * Specifies the URL that will be used by Microsoft's authorization service to logout an user using OpenId Connect front-channel, back-channel or SAML logout protocols.
     */
    @SerializedName(value = "logoutUrl", alternate = {"LogoutUrl"})
    @Expose
	@Nullable
    public String logoutUrl;

    /**
     * The Notes.
     * Free text field to capture information about the service principal, typically used for operational purposes. Maximum allowed size is 1024 characters.
     */
    @SerializedName(value = "notes", alternate = {"Notes"})
    @Expose
	@Nullable
    public String notes;

    /**
     * The Notification Email Addresses.
     * Specifies the list of email addresses where Azure AD sends a notification when the active certificate is near the expiration date. This is only for the certificates used to sign the SAML token issued for Azure AD Gallery applications.
     */
    @SerializedName(value = "notificationEmailAddresses", alternate = {"NotificationEmailAddresses"})
    @Expose
	@Nullable
    public java.util.List<String> notificationEmailAddresses;

    /**
     * The Password Credentials.
     * The collection of password credentials associated with the service principal. Not nullable.
     */
    @SerializedName(value = "passwordCredentials", alternate = {"PasswordCredentials"})
    @Expose
	@Nullable
    public java.util.List<PasswordCredential> passwordCredentials;

    /**
     * The Preferred Single Sign On Mode.
     * Specifies the single sign-on mode configured for this application. Azure AD uses the preferred single sign-on mode to launch the application from Microsoft 365 or the Azure AD My Apps. The supported values are password, saml, notSupported, and oidc.
     */
    @SerializedName(value = "preferredSingleSignOnMode", alternate = {"PreferredSingleSignOnMode"})
    @Expose
	@Nullable
    public String preferredSingleSignOnMode;

    /**
     * The Preferred Token Signing Key End Date Time.
     * Specifies the expiration date of the keyCredential used for token signing, marked by preferredTokenSigningKeyThumbprint.
     */
    @SerializedName(value = "preferredTokenSigningKeyEndDateTime", alternate = {"PreferredTokenSigningKeyEndDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime preferredTokenSigningKeyEndDateTime;

    /**
     * The Preferred Token Signing Key Thumbprint.
     * Reserved for internal use only. Do not write or otherwise rely on this property. May be removed in future versions.
     */
    @SerializedName(value = "preferredTokenSigningKeyThumbprint", alternate = {"PreferredTokenSigningKeyThumbprint"})
    @Expose
	@Nullable
    public String preferredTokenSigningKeyThumbprint;

    /**
     * The Published Permission Scopes.
     * The delegated permissions exposed by the application. For more information see the oauth2PermissionScopes property on the application entity's api property. Not nullable. Note: This property is named oauth2PermissionScopes in v1.0.
     */
    @SerializedName(value = "publishedPermissionScopes", alternate = {"PublishedPermissionScopes"})
    @Expose
	@Nullable
    public java.util.List<PermissionScope> publishedPermissionScopes;

    /**
     * The Publisher Name.
     * 
     */
    @SerializedName(value = "publisherName", alternate = {"PublisherName"})
    @Expose
	@Nullable
    public String publisherName;

    /**
     * The Reply Urls.
     * The URLs that user tokens are sent to for sign in with the associated application, or the redirect URIs that OAuth 2.0 authorization codes and access tokens are sent to for the associated application. Not nullable.
     */
    @SerializedName(value = "replyUrls", alternate = {"ReplyUrls"})
    @Expose
	@Nullable
    public java.util.List<String> replyUrls;

    /**
     * The Saml Metadata Url.
     * The url where the service exposes SAML metadata for federation.
     */
    @SerializedName(value = "samlMetadataUrl", alternate = {"SamlMetadataUrl"})
    @Expose
	@Nullable
    public String samlMetadataUrl;

    /**
     * The Saml Single Sign On Settings.
     * The collection for settings related to saml single sign-on.
     */
    @SerializedName(value = "samlSingleSignOnSettings", alternate = {"SamlSingleSignOnSettings"})
    @Expose
	@Nullable
    public SamlSingleSignOnSettings samlSingleSignOnSettings;

    /**
     * The Service Principal Names.
     * Contains the list of identifiersUris, copied over from the associated application. Additional values can be added to hybrid applications. These values can be used to identify the permissions exposed by this app within Azure AD. For example,Client apps can specify a resource URI which is based on the values of this property to acquire an access token, which is the URI returned in the 'aud' claim.The any operator is required for filter expressions on multi-valued properties. Not nullable.  Supports $filter (eq, not, ge, le, startsWith).
     */
    @SerializedName(value = "servicePrincipalNames", alternate = {"ServicePrincipalNames"})
    @Expose
	@Nullable
    public java.util.List<String> servicePrincipalNames;

    /**
     * The Service Principal Type.
     * Identifies if the service principal represents an application or a managed identity. This is set by Azure AD internally. For a service principal that represents an application this is set as Application. For a service principal that represent a managed identity this is set as ManagedIdentity. The SocialIdp type is for internal use.
     */
    @SerializedName(value = "servicePrincipalType", alternate = {"ServicePrincipalType"})
    @Expose
	@Nullable
    public String servicePrincipalType;

    /**
     * The Sign In Audience.
     * Specifies the Microsoft accounts that are supported for the current application. Read-only. Supported values are:AzureADMyOrg: Users with a Microsoft work or school account in my organization’s Azure AD tenant (single-tenant).AzureADMultipleOrgs: Users with a Microsoft work or school account in any organization’s Azure AD tenant (multi-tenant).AzureADandPersonalMicrosoftAccount: Users with a personal Microsoft account, or a work or school account in any organization’s Azure AD tenant.PersonalMicrosoftAccount: Users with a personal Microsoft account only.
     */
    @SerializedName(value = "signInAudience", alternate = {"SignInAudience"})
    @Expose
	@Nullable
    public String signInAudience;

    /**
     * The Tags.
     * Custom strings that can be used to categorize and identify the service principal. Not nullable. Supports $filter (eq, not, ge, le, startsWith).
     */
    @SerializedName(value = "tags", alternate = {"Tags"})
    @Expose
	@Nullable
    public java.util.List<String> tags;

    /**
     * The Token Encryption Key Id.
     * Specifies the keyId of a public key from the keyCredentials collection. When configured, Azure AD issues tokens for this application encrypted using the key specified by this property. The application code that receives the encrypted token must use the matching private key to decrypt the token before it can be used for the signed-in user.
     */
    @SerializedName(value = "tokenEncryptionKeyId", alternate = {"TokenEncryptionKeyId"})
    @Expose
	@Nullable
    public java.util.UUID tokenEncryptionKeyId;

    /**
     * The App Management Policies.
     * The appManagementPolicy applied to this service principal.
     */
	@Nullable
    public AppManagementPolicyCollectionPage appManagementPolicies;

    /**
     * The App Role Assigned To.
     * App role assignments for this app or service, granted to users, groups, and other service principals.Supports $expand.
     */
    @SerializedName(value = "appRoleAssignedTo", alternate = {"AppRoleAssignedTo"})
    @Expose
	@Nullable
    public AppRoleAssignmentCollectionPage appRoleAssignedTo;

    /**
     * The App Role Assignments.
     * App role assignment for another app or service, granted to this service principal. Supports $expand.
     */
    @SerializedName(value = "appRoleAssignments", alternate = {"AppRoleAssignments"})
    @Expose
	@Nullable
    public AppRoleAssignmentCollectionPage appRoleAssignments;

    /**
     * The Claims Mapping Policies.
     * The claimsMappingPolicies assigned to this service principal. Supports $expand.
     */
	@Nullable
    public ClaimsMappingPolicyCollectionPage claimsMappingPolicies;

    /**
     * The Created Objects.
     * Directory objects created by this service principal. Read-only. Nullable.
     */
	@Nullable
    public DirectoryObjectCollectionPage createdObjects;

    /**
     * The Delegated Permission Classifications.
     * The permission classifications for delegated permissions exposed by the app that this service principal represents. Supports $expand.
     */
    @SerializedName(value = "delegatedPermissionClassifications", alternate = {"DelegatedPermissionClassifications"})
    @Expose
	@Nullable
    public DelegatedPermissionClassificationCollectionPage delegatedPermissionClassifications;

    /**
     * The Endpoints.
     * Endpoints available for discovery. Services like Sharepoint populate this property with a tenant specific SharePoint endpoints that other applications can discover and use in their experiences.
     */
    @SerializedName(value = "endpoints", alternate = {"Endpoints"})
    @Expose
	@Nullable
    public EndpointCollectionPage endpoints;

    /**
     * The Federated Identity Credentials.
     * 
     */
    @SerializedName(value = "federatedIdentityCredentials", alternate = {"FederatedIdentityCredentials"})
    @Expose
	@Nullable
    public FederatedIdentityCredentialCollectionPage federatedIdentityCredentials;

    /**
     * The Home Realm Discovery Policies.
     * The homeRealmDiscoveryPolicies assigned to this service principal. Supports $expand.
     */
	@Nullable
    public HomeRealmDiscoveryPolicyCollectionPage homeRealmDiscoveryPolicies;

    /**
     * The License Details.
     * 
     */
    @SerializedName(value = "licenseDetails", alternate = {"LicenseDetails"})
    @Expose
	@Nullable
    public LicenseDetailsCollectionPage licenseDetails;

    /**
     * The Member Of.
     * Roles that this service principal is a member of. HTTP Methods: GET Read-only. Nullable. Supports $expand.
     */
	@Nullable
    public DirectoryObjectCollectionPage memberOf;

    /**
     * The Oauth2Permission Grants.
     * Delegated permission grants authorizing this service principal to access an API on behalf of a signed-in user. Read-only. Nullable.
     */
	@Nullable
    public OAuth2PermissionGrantCollectionPage oauth2PermissionGrants;

    /**
     * The Owned Objects.
     * Directory objects that are owned by this service principal. Read-only. Nullable. Supports $expand.
     */
	@Nullable
    public DirectoryObjectCollectionPage ownedObjects;

    /**
     * The Owners.
     * Directory objects that are owners of this servicePrincipal. The owners are a set of non-admin users or servicePrincipals who are allowed to modify this object. Read-only. Nullable. Supports $expand.
     */
	@Nullable
    public DirectoryObjectCollectionPage owners;

    /**
     * The Token Issuance Policies.
     * The tokenIssuancePolicies assigned to this service principal. Supports $expand.
     */
	@Nullable
    public TokenIssuancePolicyCollectionPage tokenIssuancePolicies;

    /**
     * The Token Lifetime Policies.
     * The tokenLifetimePolicies assigned to this service principal. Supports $expand.
     */
	@Nullable
    public TokenLifetimePolicyCollectionPage tokenLifetimePolicies;

    /**
     * The Transitive Member Of.
     * 
     */
	@Nullable
    public DirectoryObjectCollectionPage transitiveMemberOf;

    /**
     * The Synchronization.
     * 
     */
    @SerializedName(value = "synchronization", alternate = {"Synchronization"})
    @Expose
	@Nullable
    public Synchronization synchronization;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("appManagementPolicies")) {
            appManagementPolicies = serializer.deserializeObject(json.get("appManagementPolicies"), AppManagementPolicyCollectionPage.class);
        }

        if (json.has("appRoleAssignedTo")) {
            appRoleAssignedTo = serializer.deserializeObject(json.get("appRoleAssignedTo"), AppRoleAssignmentCollectionPage.class);
        }

        if (json.has("appRoleAssignments")) {
            appRoleAssignments = serializer.deserializeObject(json.get("appRoleAssignments"), AppRoleAssignmentCollectionPage.class);
        }

        if (json.has("claimsMappingPolicies")) {
            claimsMappingPolicies = serializer.deserializeObject(json.get("claimsMappingPolicies"), ClaimsMappingPolicyCollectionPage.class);
        }

        if (json.has("createdObjects")) {
            createdObjects = serializer.deserializeObject(json.get("createdObjects"), DirectoryObjectCollectionPage.class);
        }

        if (json.has("delegatedPermissionClassifications")) {
            delegatedPermissionClassifications = serializer.deserializeObject(json.get("delegatedPermissionClassifications"), DelegatedPermissionClassificationCollectionPage.class);
        }

        if (json.has("endpoints")) {
            endpoints = serializer.deserializeObject(json.get("endpoints"), EndpointCollectionPage.class);
        }

        if (json.has("federatedIdentityCredentials")) {
            federatedIdentityCredentials = serializer.deserializeObject(json.get("federatedIdentityCredentials"), FederatedIdentityCredentialCollectionPage.class);
        }

        if (json.has("homeRealmDiscoveryPolicies")) {
            homeRealmDiscoveryPolicies = serializer.deserializeObject(json.get("homeRealmDiscoveryPolicies"), HomeRealmDiscoveryPolicyCollectionPage.class);
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

        if (json.has("ownedObjects")) {
            ownedObjects = serializer.deserializeObject(json.get("ownedObjects"), DirectoryObjectCollectionPage.class);
        }

        if (json.has("owners")) {
            owners = serializer.deserializeObject(json.get("owners"), DirectoryObjectCollectionPage.class);
        }

        if (json.has("tokenIssuancePolicies")) {
            tokenIssuancePolicies = serializer.deserializeObject(json.get("tokenIssuancePolicies"), TokenIssuancePolicyCollectionPage.class);
        }

        if (json.has("tokenLifetimePolicies")) {
            tokenLifetimePolicies = serializer.deserializeObject(json.get("tokenLifetimePolicies"), TokenLifetimePolicyCollectionPage.class);
        }

        if (json.has("transitiveMemberOf")) {
            transitiveMemberOf = serializer.deserializeObject(json.get("transitiveMemberOf"), DirectoryObjectCollectionPage.class);
        }
    }
}
