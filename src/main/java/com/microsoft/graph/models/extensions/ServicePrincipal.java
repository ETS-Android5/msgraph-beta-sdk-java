// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.PasswordSingleSignOnSettings;
import com.microsoft.graph.models.extensions.AddIn;
import com.microsoft.graph.models.extensions.AppRole;
import com.microsoft.graph.models.extensions.InformationalUrl;
import com.microsoft.graph.models.extensions.KeyCredential;
import com.microsoft.graph.models.extensions.PermissionScope;
import com.microsoft.graph.models.extensions.PasswordCredential;
import com.microsoft.graph.models.extensions.SamlSingleSignOnSettings;
import com.microsoft.graph.models.extensions.AppRoleAssignment;
import com.microsoft.graph.models.extensions.ClaimsMappingPolicy;
import com.microsoft.graph.models.extensions.HomeRealmDiscoveryPolicy;
import com.microsoft.graph.models.extensions.Endpoint;
import com.microsoft.graph.models.extensions.OAuth2PermissionGrant;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.LicenseDetails;
import com.microsoft.graph.models.extensions.TokenIssuancePolicy;
import com.microsoft.graph.models.extensions.TokenLifetimePolicy;
import com.microsoft.graph.models.extensions.Synchronization;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.ClaimsMappingPolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.ClaimsMappingPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.EndpointCollectionResponse;
import com.microsoft.graph.requests.extensions.EndpointCollectionPage;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantCollectionResponse;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantCollectionPage;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionResponse;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionPage;
import com.microsoft.graph.requests.extensions.LicenseDetailsCollectionResponse;
import com.microsoft.graph.requests.extensions.LicenseDetailsCollectionPage;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyCollectionPage;
import com.microsoft.graph.requests.extensions.TokenLifetimePolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.TokenLifetimePolicyCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal.
 */
public class ServicePrincipal extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Password Single Sign On Settings.
     * 
     */
    @SerializedName("passwordSingleSignOnSettings")
    @Expose
    public PasswordSingleSignOnSettings passwordSingleSignOnSettings;

    /**
     * The Account Enabled.
     * true if the service principal account is enabled; otherwise, false.
     */
    @SerializedName("accountEnabled")
    @Expose
    public Boolean accountEnabled;

    /**
     * The Add Ins.
     * Defines custom behavior that a consuming service can use to call an app in specific contexts. For example, applications that can render file streams may set the addIns property for its 'FileHandler' functionality. This will let services like Microsoft 365 call the application in the context of a document the user is working on.
     */
    @SerializedName("addIns")
    @Expose
    public java.util.List<AddIn> addIns;

    /**
     * The Alternative Names.
     * Used to retrieve service principals by subscription, identify resource group and full resource ids for managed identities.
     */
    @SerializedName("alternativeNames")
    @Expose
    public java.util.List<String> alternativeNames;

    /**
     * The App Description.
     * 
     */
    @SerializedName("appDescription")
    @Expose
    public String appDescription;

    /**
     * The App Display Name.
     * The display name exposed by the associated application.
     */
    @SerializedName("appDisplayName")
    @Expose
    public String appDisplayName;

    /**
     * The App Id.
     * The unique identifier for the associated application (its appId property).
     */
    @SerializedName("appId")
    @Expose
    public String appId;

    /**
     * The Application Template Id.
     * Unique identifier of the applicationTemplate that the servicePrincipal was created from. Read-only.
     */
    @SerializedName("applicationTemplateId")
    @Expose
    public String applicationTemplateId;

    /**
     * The App Owner Organization Id.
     * Contains the tenant id where the application is registered. This is applicable only to service principals backed by applications.
     */
    @SerializedName("appOwnerOrganizationId")
    @Expose
    public java.util.UUID appOwnerOrganizationId;

    /**
     * The App Role Assignment Required.
     * Specifies whether users or other service principals need to be granted an app role assignment for this service principal before users can sign in or apps can get tokens. The default value is false. Not nullable.
     */
    @SerializedName("appRoleAssignmentRequired")
    @Expose
    public Boolean appRoleAssignmentRequired;

    /**
     * The App Roles.
     * The roles exposed by the application which this service principal represents. For more information see the appRoles property definition on the application entity. Not nullable.
     */
    @SerializedName("appRoles")
    @Expose
    public java.util.List<AppRole> appRoles;

    /**
     * The Description.
     * 
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Display Name.
     * The display name for the service principal.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Error Url.
     * 
     */
    @SerializedName("errorUrl")
    @Expose
    public String errorUrl;

    /**
     * The Homepage.
     * Home page or landing page of the application.
     */
    @SerializedName("homepage")
    @Expose
    public String homepage;

    /**
     * The Info.
     * Basic profile information of the acquired application such as app's marketing, support, terms of service and privacy statement URLs. The terms of service and privacy statement are surfaced to users through the user consent experience. For more info, see How to: Add Terms of service and privacy statement for registered Azure AD apps.
     */
    @SerializedName("info")
    @Expose
    public InformationalUrl info;

    /**
     * The Key Credentials.
     * The collection of key credentials associated with the service principal. Not nullable.
     */
    @SerializedName("keyCredentials")
    @Expose
    public java.util.List<KeyCredential> keyCredentials;

    /**
     * The Login Url.
     * Specifies the URL where the service provider redirects the user to Azure AD to authenticate. Azure AD uses the URL to launch the application from Microsoft 365 or the Azure AD My Apps. When blank, Azure AD performs IdP-initiated sign-on for applications configured with SAML-based single sign-on. The user launches the application from Microsoft 365, the Azure AD My Apps, or the Azure AD SSO URL.
     */
    @SerializedName("loginUrl")
    @Expose
    public String loginUrl;

    /**
     * The Logout Url.
     * Specifies the URL that will be used by Microsoft's authorization service to logout an user using OpenId Connect front-channel, back-channel or SAML logout protocols.
     */
    @SerializedName("logoutUrl")
    @Expose
    public String logoutUrl;

    /**
     * The Notes.
     * 
     */
    @SerializedName("notes")
    @Expose
    public String notes;

    /**
     * The Notification Email Addresses.
     * Specifies the list of email addresses where Azure AD sends a notification when the active certificate is near the expiration date. This is only for the certificates used to sign the SAML token issued for Azure AD Gallery applications.
     */
    @SerializedName("notificationEmailAddresses")
    @Expose
    public java.util.List<String> notificationEmailAddresses;

    /**
     * The Published Permission Scopes.
     * 
     */
    @SerializedName("publishedPermissionScopes")
    @Expose
    public java.util.List<PermissionScope> publishedPermissionScopes;

    /**
     * The Password Credentials.
     * The collection of password credentials associated with the service principal. Not nullable.
     */
    @SerializedName("passwordCredentials")
    @Expose
    public java.util.List<PasswordCredential> passwordCredentials;

    /**
     * The Preferred Token Signing Key End Date Time.
     * 
     */
    @SerializedName("preferredTokenSigningKeyEndDateTime")
    @Expose
    public java.util.Calendar preferredTokenSigningKeyEndDateTime;

    /**
     * The Preferred Token Signing Key Thumbprint.
     * 
     */
    @SerializedName("preferredTokenSigningKeyThumbprint")
    @Expose
    public String preferredTokenSigningKeyThumbprint;

    /**
     * The Preferred Single Sign On Mode.
     * Specifies the single sign-on mode configured for this application. Azure AD uses the preferred single sign-on mode to launch the application from Microsoft 365 or the Azure AD My Apps. The supported values are password, saml, external, and oidc.
     */
    @SerializedName("preferredSingleSignOnMode")
    @Expose
    public String preferredSingleSignOnMode;

    /**
     * The Publisher Name.
     * 
     */
    @SerializedName("publisherName")
    @Expose
    public String publisherName;

    /**
     * The Reply Urls.
     * The URLs that user tokens are sent to for sign in with the associated application, or the redirect URIs that OAuth 2.0 authorization codes and access tokens are sent to for the associated application. Not nullable.
     */
    @SerializedName("replyUrls")
    @Expose
    public java.util.List<String> replyUrls;

    /**
     * The Saml Metadata Url.
     * 
     */
    @SerializedName("samlMetadataUrl")
    @Expose
    public String samlMetadataUrl;

    /**
     * The Saml Single Sign On Settings.
     * The collection for settings related to saml single sign-on.
     */
    @SerializedName("samlSingleSignOnSettings")
    @Expose
    public SamlSingleSignOnSettings samlSingleSignOnSettings;

    /**
     * The Service Principal Names.
     * Contains the list of identifiersUris, copied over from the associated application. Additional values can be added to hybrid applications. These values can be used to identify the permissions exposed by this app within Azure AD. For example,Client apps can specify a resource URI which is based on the values of this property to acquire an access token, which is the URI returned in the 'aud' claim.The any operator is required for filter expressions on multi-valued properties. Not nullable.
     */
    @SerializedName("servicePrincipalNames")
    @Expose
    public java.util.List<String> servicePrincipalNames;

    /**
     * The Service Principal Type.
     * Identifies if the service principal represents an application or a managed identity. This is set by Azure AD internally. For a service principal that represents an application this is set as Application. For a service principal that represent a managed identity this is set as ManagedIdentity.
     */
    @SerializedName("servicePrincipalType")
    @Expose
    public String servicePrincipalType;

    /**
     * The Sign In Audience.
     * 
     */
    @SerializedName("signInAudience")
    @Expose
    public String signInAudience;

    /**
     * The Tags.
     * Custom strings that can be used to categorize and identify the service principal. Not nullable.
     */
    @SerializedName("tags")
    @Expose
    public java.util.List<String> tags;

    /**
     * The Token Encryption Key Id.
     * Specifies the keyId of a public key from the keyCredentials collection. When configured, Azure AD issues tokens for this application encrypted using the key specified by this property. The application code that receives the encrypted token must use the matching private key to decrypt the token before it can be used for the signed-in user.
     */
    @SerializedName("tokenEncryptionKeyId")
    @Expose
    public java.util.UUID tokenEncryptionKeyId;

    /**
     * The App Role Assigned To.
     * Principals (users, groups, and service principals) that are assigned to this service principal. Read-only.
     */
    public AppRoleAssignmentCollectionPage appRoleAssignedTo;

    /**
     * The App Role Assignments.
     * Applications that this service principal is assigned to. Read-only. Nullable.
     */
    public AppRoleAssignmentCollectionPage appRoleAssignments;

    /**
     * The Claims Mapping Policies.
     * The claimsMappingPolicies assigned to this service principal.
     */
    public ClaimsMappingPolicyCollectionPage claimsMappingPolicies;

    /**
     * The Home Realm Discovery Policies.
     * The homeRealmDiscoveryPolicies assigned to this service principal.
     */
    public HomeRealmDiscoveryPolicyCollectionPage homeRealmDiscoveryPolicies;

    /**
     * The Endpoints.
     * Endpoints available for discovery. Services like Sharepoint populate this property with a tenant specific SharePoint endpoints that other applications can discover and use in their experiences.
     */
    public EndpointCollectionPage endpoints;

    /**
     * The Oauth2Permission Grants.
     * Delegated permission grants authorizing this service principal to access an API on behalf of a signed-in user. Read-only. Nullable.
     */
    public OAuth2PermissionGrantCollectionPage oauth2PermissionGrants;

    /**
     * The Member Of.
     * Roles that this service principal is a member of. HTTP Methods: GET Read-only. Nullable.
     */
    public DirectoryObjectCollectionPage memberOf;

    /**
     * The Transitive Member Of.
     * 
     */
    public DirectoryObjectCollectionPage transitiveMemberOf;

    /**
     * The Created Objects.
     * Directory objects created by this service principal. Read-only. Nullable.
     */
    public DirectoryObjectCollectionPage createdObjects;

    /**
     * The License Details.
     * 
     */
    public LicenseDetailsCollectionPage licenseDetails;

    /**
     * The Owners.
     * Directory objects that are owners of this servicePrincipal. The owners are a set of non-admin users or servicePrincipals who are allowed to modify this object. Read-only. Nullable.
     */
    public DirectoryObjectCollectionPage owners;

    /**
     * The Owned Objects.
     * Directory objects that are owned by this service principal. Read-only. Nullable.
     */
    public DirectoryObjectCollectionPage ownedObjects;

    /**
     * The Token Issuance Policies.
     * The tokenIssuancePolicies assigned to this service principal.
     */
    public TokenIssuancePolicyCollectionPage tokenIssuancePolicies;

    /**
     * The Token Lifetime Policies.
     * The tokenLifetimePolicies assigned to this service principal.
     */
    public TokenLifetimePolicyCollectionPage tokenLifetimePolicies;

    /**
     * The Synchronization.
     * 
     */
    @SerializedName("synchronization")
    @Expose
    public Synchronization synchronization;


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


        if (json.has("appRoleAssignedTo")) {
            final AppRoleAssignmentCollectionResponse response = new AppRoleAssignmentCollectionResponse();
            if (json.has("appRoleAssignedTo@odata.nextLink")) {
                response.nextLink = json.get("appRoleAssignedTo@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("appRoleAssignedTo").toString(), JsonObject[].class);
            final AppRoleAssignment[] array = new AppRoleAssignment[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), AppRoleAssignment.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            appRoleAssignedTo = new AppRoleAssignmentCollectionPage(response, null);
        }

        if (json.has("appRoleAssignments")) {
            final AppRoleAssignmentCollectionResponse response = new AppRoleAssignmentCollectionResponse();
            if (json.has("appRoleAssignments@odata.nextLink")) {
                response.nextLink = json.get("appRoleAssignments@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("appRoleAssignments").toString(), JsonObject[].class);
            final AppRoleAssignment[] array = new AppRoleAssignment[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), AppRoleAssignment.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            appRoleAssignments = new AppRoleAssignmentCollectionPage(response, null);
        }

        if (json.has("claimsMappingPolicies")) {
            final ClaimsMappingPolicyCollectionResponse response = new ClaimsMappingPolicyCollectionResponse();
            if (json.has("claimsMappingPolicies@odata.nextLink")) {
                response.nextLink = json.get("claimsMappingPolicies@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("claimsMappingPolicies").toString(), JsonObject[].class);
            final ClaimsMappingPolicy[] array = new ClaimsMappingPolicy[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ClaimsMappingPolicy.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            claimsMappingPolicies = new ClaimsMappingPolicyCollectionPage(response, null);
        }

        if (json.has("homeRealmDiscoveryPolicies")) {
            final HomeRealmDiscoveryPolicyCollectionResponse response = new HomeRealmDiscoveryPolicyCollectionResponse();
            if (json.has("homeRealmDiscoveryPolicies@odata.nextLink")) {
                response.nextLink = json.get("homeRealmDiscoveryPolicies@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("homeRealmDiscoveryPolicies").toString(), JsonObject[].class);
            final HomeRealmDiscoveryPolicy[] array = new HomeRealmDiscoveryPolicy[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), HomeRealmDiscoveryPolicy.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            homeRealmDiscoveryPolicies = new HomeRealmDiscoveryPolicyCollectionPage(response, null);
        }

        if (json.has("endpoints")) {
            final EndpointCollectionResponse response = new EndpointCollectionResponse();
            if (json.has("endpoints@odata.nextLink")) {
                response.nextLink = json.get("endpoints@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("endpoints").toString(), JsonObject[].class);
            final Endpoint[] array = new Endpoint[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Endpoint.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            endpoints = new EndpointCollectionPage(response, null);
        }

        if (json.has("oauth2PermissionGrants")) {
            final OAuth2PermissionGrantCollectionResponse response = new OAuth2PermissionGrantCollectionResponse();
            if (json.has("oauth2PermissionGrants@odata.nextLink")) {
                response.nextLink = json.get("oauth2PermissionGrants@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("oauth2PermissionGrants").toString(), JsonObject[].class);
            final OAuth2PermissionGrant[] array = new OAuth2PermissionGrant[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), OAuth2PermissionGrant.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            oauth2PermissionGrants = new OAuth2PermissionGrantCollectionPage(response, null);
        }

        if (json.has("memberOf")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("memberOf@odata.nextLink")) {
                response.nextLink = json.get("memberOf@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("memberOf").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            memberOf = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("transitiveMemberOf")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("transitiveMemberOf@odata.nextLink")) {
                response.nextLink = json.get("transitiveMemberOf@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("transitiveMemberOf").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            transitiveMemberOf = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("createdObjects")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("createdObjects@odata.nextLink")) {
                response.nextLink = json.get("createdObjects@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("createdObjects").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            createdObjects = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("licenseDetails")) {
            final LicenseDetailsCollectionResponse response = new LicenseDetailsCollectionResponse();
            if (json.has("licenseDetails@odata.nextLink")) {
                response.nextLink = json.get("licenseDetails@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("licenseDetails").toString(), JsonObject[].class);
            final LicenseDetails[] array = new LicenseDetails[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), LicenseDetails.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            licenseDetails = new LicenseDetailsCollectionPage(response, null);
        }

        if (json.has("owners")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("owners@odata.nextLink")) {
                response.nextLink = json.get("owners@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("owners").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            owners = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("ownedObjects")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("ownedObjects@odata.nextLink")) {
                response.nextLink = json.get("ownedObjects@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("ownedObjects").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            ownedObjects = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("tokenIssuancePolicies")) {
            final TokenIssuancePolicyCollectionResponse response = new TokenIssuancePolicyCollectionResponse();
            if (json.has("tokenIssuancePolicies@odata.nextLink")) {
                response.nextLink = json.get("tokenIssuancePolicies@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("tokenIssuancePolicies").toString(), JsonObject[].class);
            final TokenIssuancePolicy[] array = new TokenIssuancePolicy[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), TokenIssuancePolicy.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            tokenIssuancePolicies = new TokenIssuancePolicyCollectionPage(response, null);
        }

        if (json.has("tokenLifetimePolicies")) {
            final TokenLifetimePolicyCollectionResponse response = new TokenLifetimePolicyCollectionResponse();
            if (json.has("tokenLifetimePolicies@odata.nextLink")) {
                response.nextLink = json.get("tokenLifetimePolicies@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("tokenLifetimePolicies").toString(), JsonObject[].class);
            final TokenLifetimePolicy[] array = new TokenLifetimePolicy[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), TokenLifetimePolicy.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            tokenLifetimePolicies = new TokenLifetimePolicyCollectionPage(response, null);
        }
    }
}
