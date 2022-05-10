package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Application extends DirectoryObject implements Parsable {
    /** Specifies settings for an application that implements a web API. */
    private ApiApplication _api;
    /** The unique identifier for the application that is assigned by Azure AD. Not nullable. Read-only. */
    private String _appId;
    /** The appManagementPolicy applied to this application. */
    private java.util.List<AppManagementPolicy> _appManagementPolicies;
    /** The collection of roles assigned to the application. With app role assignments, these roles can be assigned to users, groups, or service principals associated with other applications. Not nullable. */
    private java.util.List<AppRole> _appRoles;
    /** Specifies the certification status of the application. */
    private Certification _certification;
    /** The connectorGroup the application is using with Azure AD Application Proxy. Nullable. */
    private ConnectorGroup _connectorGroup;
    /** The date and time the application was registered. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.  Supports $filter (eq, ne, not, ge, le, in, and eq on null values) and $orderBy. */
    private OffsetDateTime _createdDateTime;
    /** Read-only. */
    private DirectoryObject _createdOnBehalfOf;
    /** The default redirect URI. If specified and there is no explicit redirect URI in the sign-in request for SAML and OIDC flows, Azure AD sends the token to this redirect URI. Azure AD also sends the token to this default URI in SAML IdP-initiated single sign-on. The value must match one of the configured redirect URIs for the application. */
    private String _defaultRedirectUri;
    /** Free text field to provide a description of the application object to end users. The maximum allowed size is 1024 characters. Returned by default. Supports $filter (eq, ne, not, ge, le, startsWith) and $search. */
    private String _description;
    /** Specifies whether Microsoft has disabled the registered application. Possible values are: null (default value), NotDisabled, and DisabledDueToViolationOfServicesAgreement (reasons may include suspicious, abusive, or malicious activity, or a violation of the Microsoft Services Agreement).  Supports $filter (eq, ne, not). */
    private String _disabledByMicrosoftStatus;
    /** The display name for the application. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderBy. */
    private String _displayName;
    /** Read-only. Nullable. */
    private java.util.List<ExtensionProperty> _extensionProperties;
    /** Federated identities for applications. This object can only be retrieved on a single GET request (GET /applications/{id}/federatedIdentityCredentials). */
    private java.util.List<FederatedIdentityCredential> _federatedIdentityCredentials;
    /** Configures the groups claim issued in a user or OAuth 2.0 access token that the application expects. To set this attribute, use one of the following string values: None, SecurityGroup (for security groups and Azure AD roles), All (this gets all security groups, distribution groups, and Azure AD directory roles that the signed-in user is a member of). */
    private String _groupMembershipClaims;
    /** The homeRealmDiscoveryPolicies property */
    private java.util.List<HomeRealmDiscoveryPolicy> _homeRealmDiscoveryPolicies;
    /** Also known as App ID URI, this value is set when an application is used as a resource app. The identifierUris acts as the prefix for the scopes you'll reference in your API's code, and it must be globally unique. You can use the default value provided, which is in the form api://<application-client-id>, or specify a more readable URI like https://contoso.com/api. For more information on valid identifierUris patterns and best practices, see Azure AD application registration security best practices. Not nullable. Supports $filter (eq, ne, ge, le, startsWith). */
    private java.util.List<String> _identifierUris;
    /** Basic profile information of the application, such as it's marketing, support, terms of service, and privacy statement URLs. The terms of service and privacy statement are surfaced to users through the user consent experience. For more information, see How to: Add Terms of service and privacy statement for registered Azure AD apps. Supports $filter (eq, ne, not, ge, le, and eq on null values). */
    private InformationalUrl _info;
    /** Specifies whether this application supports device authentication without a user. The default is false. */
    private Boolean _isDeviceOnlyAuthSupported;
    /** Specifies the fallback application type as public client, such as an installed application running on a mobile device. The default value is false which means the fallback application type is confidential client such as a web app. There are certain scenarios where Azure AD cannot determine the client application type. For example, the ROPC flow where the application is configured without specifying a redirect URI. In those cases Azure AD interprets the application type based on the value of this property. */
    private Boolean _isFallbackPublicClient;
    /** The collection of key credentials associated with the application. Not nullable. Supports $filter (eq, not, ge, le). */
    private java.util.List<KeyCredential> _keyCredentials;
    /** The main logo for the application. Not nullable. */
    private byte[] _logo;
    /** Notes relevant for the management of the application. */
    private String _notes;
    /** Represents the set of properties required for configuring Application Proxy for this application. Configuring these properties allows you to publish your on-premises application for secure remote access. */
    private OnPremisesPublishing _onPremisesPublishing;
    /** Application developers can configure optional claims in their Azure AD applications to specify the claims that are sent to their application by the Microsoft security token service. For more information, see How to: Provide optional claims to your app. */
    private OptionalClaims _optionalClaims;
    /** Directory objects that are owners of the application. Read-only. Nullable. Supports $expand. */
    private java.util.List<DirectoryObject> _owners;
    /** Specifies parental control settings for an application. */
    private ParentalControlSettings _parentalControlSettings;
    /** The collection of password credentials associated with the application. Not nullable. */
    private java.util.List<PasswordCredential> _passwordCredentials;
    /** Specifies settings for installed clients such as desktop or mobile devices. */
    private PublicClientApplication _publicClient;
    /** The verified publisher domain for the application. Read-only. Supports $filter (eq, ne, ge, le, startsWith). */
    private String _publisherDomain;
    /** Specifies the resources that the application needs to access. This property also specifies the set of delegated permissions and application roles that it needs for each of those resources. This configuration of access to the required resources drives the consent experience. No more than 50 resource services (APIs) can be configured. Beginning mid-October 2021, the total number of required permissions must not exceed 400. Not nullable. Supports $filter (eq, not, ge, le). */
    private java.util.List<RequiredResourceAccess> _requiredResourceAccess;
    /** References application or service contact information from a Service or Asset Management database. Nullable. */
    private String _serviceManagementReference;
    /** Specifies the Microsoft accounts that are supported for the current application. The possible values are: AzureADMyOrg, AzureADMultipleOrgs, AzureADandPersonalMicrosoftAccount (default), and PersonalMicrosoftAccount. See more in the table below. Supports $filter (eq, ne, not). */
    private String _signInAudience;
    /** Specifies settings for a single-page application, including sign out URLs and redirect URIs for authorization codes and access tokens. */
    private SpaApplication _spa;
    /** The synchronization property */
    private Synchronization _synchronization;
    /** Custom strings that can be used to categorize and identify the application. Not nullable.Supports $filter (eq, not, ge, le, startsWith). */
    private java.util.List<String> _tags;
    /** Specifies the keyId of a public key from the keyCredentials collection. When configured, Azure AD encrypts all the tokens it emits by using the key this property points to. The application code that receives the encrypted token must use the matching private key to decrypt the token before it can be used for the signed-in user. */
    private String _tokenEncryptionKeyId;
    /** The tokenIssuancePolicies property */
    private java.util.List<TokenIssuancePolicy> _tokenIssuancePolicies;
    /** The tokenLifetimePolicies assigned to this application. Supports $expand. */
    private java.util.List<TokenLifetimePolicy> _tokenLifetimePolicies;
    /** The unique identifier that can be assigned to an application as an alternative identifier. Immutable. Read-only. */
    private String _uniqueName;
    /** Specifies the verified publisher of the application. For more information about how publisher verification helps support application security, trustworthiness, and compliance, see Publisher verification. */
    private VerifiedPublisher _verifiedPublisher;
    /** Specifies settings for a web application. */
    private WebApplication _web;
    /** Specifies settings for apps running Microsoft Windows and published in the Microsoft Store or Xbox games store. */
    private WindowsApplication _windows;
    /**
     * Instantiates a new application and sets the default values.
     * @return a void
     */
    public Application() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a application
     */
    @javax.annotation.Nonnull
    public static Application createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Application();
    }
    /**
     * Gets the api property value. Specifies settings for an application that implements a web API.
     * @return a apiApplication
     */
    @javax.annotation.Nullable
    public ApiApplication getApi() {
        return this._api;
    }
    /**
     * Gets the appId property value. The unique identifier for the application that is assigned by Azure AD. Not nullable. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppId() {
        return this._appId;
    }
    /**
     * Gets the appManagementPolicies property value. The appManagementPolicy applied to this application.
     * @return a appManagementPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<AppManagementPolicy> getAppManagementPolicies() {
        return this._appManagementPolicies;
    }
    /**
     * Gets the appRoles property value. The collection of roles assigned to the application. With app role assignments, these roles can be assigned to users, groups, or service principals associated with other applications. Not nullable.
     * @return a appRole
     */
    @javax.annotation.Nullable
    public java.util.List<AppRole> getAppRoles() {
        return this._appRoles;
    }
    /**
     * Gets the certification property value. Specifies the certification status of the application.
     * @return a certification
     */
    @javax.annotation.Nullable
    public Certification getCertification() {
        return this._certification;
    }
    /**
     * Gets the connectorGroup property value. The connectorGroup the application is using with Azure AD Application Proxy. Nullable.
     * @return a connectorGroup
     */
    @javax.annotation.Nullable
    public ConnectorGroup getConnectorGroup() {
        return this._connectorGroup;
    }
    /**
     * Gets the createdDateTime property value. The date and time the application was registered. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.  Supports $filter (eq, ne, not, ge, le, in, and eq on null values) and $orderBy.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the createdOnBehalfOf property value. Read-only.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public DirectoryObject getCreatedOnBehalfOf() {
        return this._createdOnBehalfOf;
    }
    /**
     * Gets the defaultRedirectUri property value. The default redirect URI. If specified and there is no explicit redirect URI in the sign-in request for SAML and OIDC flows, Azure AD sends the token to this redirect URI. Azure AD also sends the token to this default URI in SAML IdP-initiated single sign-on. The value must match one of the configured redirect URIs for the application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultRedirectUri() {
        return this._defaultRedirectUri;
    }
    /**
     * Gets the description property value. Free text field to provide a description of the application object to end users. The maximum allowed size is 1024 characters. Returned by default. Supports $filter (eq, ne, not, ge, le, startsWith) and $search.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the disabledByMicrosoftStatus property value. Specifies whether Microsoft has disabled the registered application. Possible values are: null (default value), NotDisabled, and DisabledDueToViolationOfServicesAgreement (reasons may include suspicious, abusive, or malicious activity, or a violation of the Microsoft Services Agreement).  Supports $filter (eq, ne, not).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisabledByMicrosoftStatus() {
        return this._disabledByMicrosoftStatus;
    }
    /**
     * Gets the displayName property value. The display name for the application. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderBy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the extensionProperties property value. Read-only. Nullable.
     * @return a extensionProperty
     */
    @javax.annotation.Nullable
    public java.util.List<ExtensionProperty> getExtensionProperties() {
        return this._extensionProperties;
    }
    /**
     * Gets the federatedIdentityCredentials property value. Federated identities for applications. This object can only be retrieved on a single GET request (GET /applications/{id}/federatedIdentityCredentials).
     * @return a federatedIdentityCredential
     */
    @javax.annotation.Nullable
    public java.util.List<FederatedIdentityCredential> getFederatedIdentityCredentials() {
        return this._federatedIdentityCredentials;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Application currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("api", (n) -> { currentObject.setApi(n.getObjectValue(ApiApplication::createFromDiscriminatorValue)); });
            this.put("appId", (n) -> { currentObject.setAppId(n.getStringValue()); });
            this.put("appManagementPolicies", (n) -> { currentObject.setAppManagementPolicies(n.getCollectionOfObjectValues(AppManagementPolicy::createFromDiscriminatorValue)); });
            this.put("appRoles", (n) -> { currentObject.setAppRoles(n.getCollectionOfObjectValues(AppRole::createFromDiscriminatorValue)); });
            this.put("certification", (n) -> { currentObject.setCertification(n.getObjectValue(Certification::createFromDiscriminatorValue)); });
            this.put("connectorGroup", (n) -> { currentObject.setConnectorGroup(n.getObjectValue(ConnectorGroup::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("createdOnBehalfOf", (n) -> { currentObject.setCreatedOnBehalfOf(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("defaultRedirectUri", (n) -> { currentObject.setDefaultRedirectUri(n.getStringValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("disabledByMicrosoftStatus", (n) -> { currentObject.setDisabledByMicrosoftStatus(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("extensionProperties", (n) -> { currentObject.setExtensionProperties(n.getCollectionOfObjectValues(ExtensionProperty::createFromDiscriminatorValue)); });
            this.put("federatedIdentityCredentials", (n) -> { currentObject.setFederatedIdentityCredentials(n.getCollectionOfObjectValues(FederatedIdentityCredential::createFromDiscriminatorValue)); });
            this.put("groupMembershipClaims", (n) -> { currentObject.setGroupMembershipClaims(n.getStringValue()); });
            this.put("homeRealmDiscoveryPolicies", (n) -> { currentObject.setHomeRealmDiscoveryPolicies(n.getCollectionOfObjectValues(HomeRealmDiscoveryPolicy::createFromDiscriminatorValue)); });
            this.put("identifierUris", (n) -> { currentObject.setIdentifierUris(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("info", (n) -> { currentObject.setInfo(n.getObjectValue(InformationalUrl::createFromDiscriminatorValue)); });
            this.put("isDeviceOnlyAuthSupported", (n) -> { currentObject.setIsDeviceOnlyAuthSupported(n.getBooleanValue()); });
            this.put("isFallbackPublicClient", (n) -> { currentObject.setIsFallbackPublicClient(n.getBooleanValue()); });
            this.put("keyCredentials", (n) -> { currentObject.setKeyCredentials(n.getCollectionOfObjectValues(KeyCredential::createFromDiscriminatorValue)); });
            this.put("logo", (n) -> { currentObject.setLogo(n.getByteArrayValue()); });
            this.put("notes", (n) -> { currentObject.setNotes(n.getStringValue()); });
            this.put("onPremisesPublishing", (n) -> { currentObject.setOnPremisesPublishing(n.getObjectValue(OnPremisesPublishing::createFromDiscriminatorValue)); });
            this.put("optionalClaims", (n) -> { currentObject.setOptionalClaims(n.getObjectValue(OptionalClaims::createFromDiscriminatorValue)); });
            this.put("owners", (n) -> { currentObject.setOwners(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("parentalControlSettings", (n) -> { currentObject.setParentalControlSettings(n.getObjectValue(ParentalControlSettings::createFromDiscriminatorValue)); });
            this.put("passwordCredentials", (n) -> { currentObject.setPasswordCredentials(n.getCollectionOfObjectValues(PasswordCredential::createFromDiscriminatorValue)); });
            this.put("publicClient", (n) -> { currentObject.setPublicClient(n.getObjectValue(PublicClientApplication::createFromDiscriminatorValue)); });
            this.put("publisherDomain", (n) -> { currentObject.setPublisherDomain(n.getStringValue()); });
            this.put("requiredResourceAccess", (n) -> { currentObject.setRequiredResourceAccess(n.getCollectionOfObjectValues(RequiredResourceAccess::createFromDiscriminatorValue)); });
            this.put("serviceManagementReference", (n) -> { currentObject.setServiceManagementReference(n.getStringValue()); });
            this.put("signInAudience", (n) -> { currentObject.setSignInAudience(n.getStringValue()); });
            this.put("spa", (n) -> { currentObject.setSpa(n.getObjectValue(SpaApplication::createFromDiscriminatorValue)); });
            this.put("synchronization", (n) -> { currentObject.setSynchronization(n.getObjectValue(Synchronization::createFromDiscriminatorValue)); });
            this.put("tags", (n) -> { currentObject.setTags(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("tokenEncryptionKeyId", (n) -> { currentObject.setTokenEncryptionKeyId(n.getStringValue()); });
            this.put("tokenIssuancePolicies", (n) -> { currentObject.setTokenIssuancePolicies(n.getCollectionOfObjectValues(TokenIssuancePolicy::createFromDiscriminatorValue)); });
            this.put("tokenLifetimePolicies", (n) -> { currentObject.setTokenLifetimePolicies(n.getCollectionOfObjectValues(TokenLifetimePolicy::createFromDiscriminatorValue)); });
            this.put("uniqueName", (n) -> { currentObject.setUniqueName(n.getStringValue()); });
            this.put("verifiedPublisher", (n) -> { currentObject.setVerifiedPublisher(n.getObjectValue(VerifiedPublisher::createFromDiscriminatorValue)); });
            this.put("web", (n) -> { currentObject.setWeb(n.getObjectValue(WebApplication::createFromDiscriminatorValue)); });
            this.put("windows", (n) -> { currentObject.setWindows(n.getObjectValue(WindowsApplication::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the groupMembershipClaims property value. Configures the groups claim issued in a user or OAuth 2.0 access token that the application expects. To set this attribute, use one of the following string values: None, SecurityGroup (for security groups and Azure AD roles), All (this gets all security groups, distribution groups, and Azure AD directory roles that the signed-in user is a member of).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGroupMembershipClaims() {
        return this._groupMembershipClaims;
    }
    /**
     * Gets the homeRealmDiscoveryPolicies property value. The homeRealmDiscoveryPolicies property
     * @return a homeRealmDiscoveryPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<HomeRealmDiscoveryPolicy> getHomeRealmDiscoveryPolicies() {
        return this._homeRealmDiscoveryPolicies;
    }
    /**
     * Gets the identifierUris property value. Also known as App ID URI, this value is set when an application is used as a resource app. The identifierUris acts as the prefix for the scopes you'll reference in your API's code, and it must be globally unique. You can use the default value provided, which is in the form api://<application-client-id>, or specify a more readable URI like https://contoso.com/api. For more information on valid identifierUris patterns and best practices, see Azure AD application registration security best practices. Not nullable. Supports $filter (eq, ne, ge, le, startsWith).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getIdentifierUris() {
        return this._identifierUris;
    }
    /**
     * Gets the info property value. Basic profile information of the application, such as it's marketing, support, terms of service, and privacy statement URLs. The terms of service and privacy statement are surfaced to users through the user consent experience. For more information, see How to: Add Terms of service and privacy statement for registered Azure AD apps. Supports $filter (eq, ne, not, ge, le, and eq on null values).
     * @return a informationalUrl
     */
    @javax.annotation.Nullable
    public InformationalUrl getInfo() {
        return this._info;
    }
    /**
     * Gets the isDeviceOnlyAuthSupported property value. Specifies whether this application supports device authentication without a user. The default is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDeviceOnlyAuthSupported() {
        return this._isDeviceOnlyAuthSupported;
    }
    /**
     * Gets the isFallbackPublicClient property value. Specifies the fallback application type as public client, such as an installed application running on a mobile device. The default value is false which means the fallback application type is confidential client such as a web app. There are certain scenarios where Azure AD cannot determine the client application type. For example, the ROPC flow where the application is configured without specifying a redirect URI. In those cases Azure AD interprets the application type based on the value of this property.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsFallbackPublicClient() {
        return this._isFallbackPublicClient;
    }
    /**
     * Gets the keyCredentials property value. The collection of key credentials associated with the application. Not nullable. Supports $filter (eq, not, ge, le).
     * @return a keyCredential
     */
    @javax.annotation.Nullable
    public java.util.List<KeyCredential> getKeyCredentials() {
        return this._keyCredentials;
    }
    /**
     * Gets the logo property value. The main logo for the application. Not nullable.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getLogo() {
        return this._logo;
    }
    /**
     * Gets the notes property value. Notes relevant for the management of the application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotes() {
        return this._notes;
    }
    /**
     * Gets the onPremisesPublishing property value. Represents the set of properties required for configuring Application Proxy for this application. Configuring these properties allows you to publish your on-premises application for secure remote access.
     * @return a onPremisesPublishing
     */
    @javax.annotation.Nullable
    public OnPremisesPublishing getOnPremisesPublishing() {
        return this._onPremisesPublishing;
    }
    /**
     * Gets the optionalClaims property value. Application developers can configure optional claims in their Azure AD applications to specify the claims that are sent to their application by the Microsoft security token service. For more information, see How to: Provide optional claims to your app.
     * @return a optionalClaims
     */
    @javax.annotation.Nullable
    public OptionalClaims getOptionalClaims() {
        return this._optionalClaims;
    }
    /**
     * Gets the owners property value. Directory objects that are owners of the application. Read-only. Nullable. Supports $expand.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getOwners() {
        return this._owners;
    }
    /**
     * Gets the parentalControlSettings property value. Specifies parental control settings for an application.
     * @return a parentalControlSettings
     */
    @javax.annotation.Nullable
    public ParentalControlSettings getParentalControlSettings() {
        return this._parentalControlSettings;
    }
    /**
     * Gets the passwordCredentials property value. The collection of password credentials associated with the application. Not nullable.
     * @return a passwordCredential
     */
    @javax.annotation.Nullable
    public java.util.List<PasswordCredential> getPasswordCredentials() {
        return this._passwordCredentials;
    }
    /**
     * Gets the publicClient property value. Specifies settings for installed clients such as desktop or mobile devices.
     * @return a publicClientApplication
     */
    @javax.annotation.Nullable
    public PublicClientApplication getPublicClient() {
        return this._publicClient;
    }
    /**
     * Gets the publisherDomain property value. The verified publisher domain for the application. Read-only. Supports $filter (eq, ne, ge, le, startsWith).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublisherDomain() {
        return this._publisherDomain;
    }
    /**
     * Gets the requiredResourceAccess property value. Specifies the resources that the application needs to access. This property also specifies the set of delegated permissions and application roles that it needs for each of those resources. This configuration of access to the required resources drives the consent experience. No more than 50 resource services (APIs) can be configured. Beginning mid-October 2021, the total number of required permissions must not exceed 400. Not nullable. Supports $filter (eq, not, ge, le).
     * @return a requiredResourceAccess
     */
    @javax.annotation.Nullable
    public java.util.List<RequiredResourceAccess> getRequiredResourceAccess() {
        return this._requiredResourceAccess;
    }
    /**
     * Gets the serviceManagementReference property value. References application or service contact information from a Service or Asset Management database. Nullable.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServiceManagementReference() {
        return this._serviceManagementReference;
    }
    /**
     * Gets the signInAudience property value. Specifies the Microsoft accounts that are supported for the current application. The possible values are: AzureADMyOrg, AzureADMultipleOrgs, AzureADandPersonalMicrosoftAccount (default), and PersonalMicrosoftAccount. See more in the table below. Supports $filter (eq, ne, not).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSignInAudience() {
        return this._signInAudience;
    }
    /**
     * Gets the spa property value. Specifies settings for a single-page application, including sign out URLs and redirect URIs for authorization codes and access tokens.
     * @return a spaApplication
     */
    @javax.annotation.Nullable
    public SpaApplication getSpa() {
        return this._spa;
    }
    /**
     * Gets the synchronization property value. The synchronization property
     * @return a synchronization
     */
    @javax.annotation.Nullable
    public Synchronization getSynchronization() {
        return this._synchronization;
    }
    /**
     * Gets the tags property value. Custom strings that can be used to categorize and identify the application. Not nullable.Supports $filter (eq, not, ge, le, startsWith).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTags() {
        return this._tags;
    }
    /**
     * Gets the tokenEncryptionKeyId property value. Specifies the keyId of a public key from the keyCredentials collection. When configured, Azure AD encrypts all the tokens it emits by using the key this property points to. The application code that receives the encrypted token must use the matching private key to decrypt the token before it can be used for the signed-in user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTokenEncryptionKeyId() {
        return this._tokenEncryptionKeyId;
    }
    /**
     * Gets the tokenIssuancePolicies property value. The tokenIssuancePolicies property
     * @return a tokenIssuancePolicy
     */
    @javax.annotation.Nullable
    public java.util.List<TokenIssuancePolicy> getTokenIssuancePolicies() {
        return this._tokenIssuancePolicies;
    }
    /**
     * Gets the tokenLifetimePolicies property value. The tokenLifetimePolicies assigned to this application. Supports $expand.
     * @return a tokenLifetimePolicy
     */
    @javax.annotation.Nullable
    public java.util.List<TokenLifetimePolicy> getTokenLifetimePolicies() {
        return this._tokenLifetimePolicies;
    }
    /**
     * Gets the uniqueName property value. The unique identifier that can be assigned to an application as an alternative identifier. Immutable. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUniqueName() {
        return this._uniqueName;
    }
    /**
     * Gets the verifiedPublisher property value. Specifies the verified publisher of the application. For more information about how publisher verification helps support application security, trustworthiness, and compliance, see Publisher verification.
     * @return a verifiedPublisher
     */
    @javax.annotation.Nullable
    public VerifiedPublisher getVerifiedPublisher() {
        return this._verifiedPublisher;
    }
    /**
     * Gets the web property value. Specifies settings for a web application.
     * @return a webApplication
     */
    @javax.annotation.Nullable
    public WebApplication getWeb() {
        return this._web;
    }
    /**
     * Gets the windows property value. Specifies settings for apps running Microsoft Windows and published in the Microsoft Store or Xbox games store.
     * @return a windowsApplication
     */
    @javax.annotation.Nullable
    public WindowsApplication getWindows() {
        return this._windows;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("api", this.getApi());
        writer.writeStringValue("appId", this.getAppId());
        writer.writeCollectionOfObjectValues("appManagementPolicies", this.getAppManagementPolicies());
        writer.writeCollectionOfObjectValues("appRoles", this.getAppRoles());
        writer.writeObjectValue("certification", this.getCertification());
        writer.writeObjectValue("connectorGroup", this.getConnectorGroup());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("createdOnBehalfOf", this.getCreatedOnBehalfOf());
        writer.writeStringValue("defaultRedirectUri", this.getDefaultRedirectUri());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("disabledByMicrosoftStatus", this.getDisabledByMicrosoftStatus());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("extensionProperties", this.getExtensionProperties());
        writer.writeCollectionOfObjectValues("federatedIdentityCredentials", this.getFederatedIdentityCredentials());
        writer.writeStringValue("groupMembershipClaims", this.getGroupMembershipClaims());
        writer.writeCollectionOfObjectValues("homeRealmDiscoveryPolicies", this.getHomeRealmDiscoveryPolicies());
        writer.writeCollectionOfPrimitiveValues("identifierUris", this.getIdentifierUris());
        writer.writeObjectValue("info", this.getInfo());
        writer.writeBooleanValue("isDeviceOnlyAuthSupported", this.getIsDeviceOnlyAuthSupported());
        writer.writeBooleanValue("isFallbackPublicClient", this.getIsFallbackPublicClient());
        writer.writeCollectionOfObjectValues("keyCredentials", this.getKeyCredentials());
        writer.writeByteArrayValue("logo", this.getLogo());
        writer.writeStringValue("notes", this.getNotes());
        writer.writeObjectValue("onPremisesPublishing", this.getOnPremisesPublishing());
        writer.writeObjectValue("optionalClaims", this.getOptionalClaims());
        writer.writeCollectionOfObjectValues("owners", this.getOwners());
        writer.writeObjectValue("parentalControlSettings", this.getParentalControlSettings());
        writer.writeCollectionOfObjectValues("passwordCredentials", this.getPasswordCredentials());
        writer.writeObjectValue("publicClient", this.getPublicClient());
        writer.writeStringValue("publisherDomain", this.getPublisherDomain());
        writer.writeCollectionOfObjectValues("requiredResourceAccess", this.getRequiredResourceAccess());
        writer.writeStringValue("serviceManagementReference", this.getServiceManagementReference());
        writer.writeStringValue("signInAudience", this.getSignInAudience());
        writer.writeObjectValue("spa", this.getSpa());
        writer.writeObjectValue("synchronization", this.getSynchronization());
        writer.writeCollectionOfPrimitiveValues("tags", this.getTags());
        writer.writeStringValue("tokenEncryptionKeyId", this.getTokenEncryptionKeyId());
        writer.writeCollectionOfObjectValues("tokenIssuancePolicies", this.getTokenIssuancePolicies());
        writer.writeCollectionOfObjectValues("tokenLifetimePolicies", this.getTokenLifetimePolicies());
        writer.writeStringValue("uniqueName", this.getUniqueName());
        writer.writeObjectValue("verifiedPublisher", this.getVerifiedPublisher());
        writer.writeObjectValue("web", this.getWeb());
        writer.writeObjectValue("windows", this.getWindows());
    }
    /**
     * Sets the api property value. Specifies settings for an application that implements a web API.
     * @param value Value to set for the api property.
     * @return a void
     */
    public void setApi(@javax.annotation.Nullable final ApiApplication value) {
        this._api = value;
    }
    /**
     * Sets the appId property value. The unique identifier for the application that is assigned by Azure AD. Not nullable. Read-only.
     * @param value Value to set for the appId property.
     * @return a void
     */
    public void setAppId(@javax.annotation.Nullable final String value) {
        this._appId = value;
    }
    /**
     * Sets the appManagementPolicies property value. The appManagementPolicy applied to this application.
     * @param value Value to set for the appManagementPolicies property.
     * @return a void
     */
    public void setAppManagementPolicies(@javax.annotation.Nullable final java.util.List<AppManagementPolicy> value) {
        this._appManagementPolicies = value;
    }
    /**
     * Sets the appRoles property value. The collection of roles assigned to the application. With app role assignments, these roles can be assigned to users, groups, or service principals associated with other applications. Not nullable.
     * @param value Value to set for the appRoles property.
     * @return a void
     */
    public void setAppRoles(@javax.annotation.Nullable final java.util.List<AppRole> value) {
        this._appRoles = value;
    }
    /**
     * Sets the certification property value. Specifies the certification status of the application.
     * @param value Value to set for the certification property.
     * @return a void
     */
    public void setCertification(@javax.annotation.Nullable final Certification value) {
        this._certification = value;
    }
    /**
     * Sets the connectorGroup property value. The connectorGroup the application is using with Azure AD Application Proxy. Nullable.
     * @param value Value to set for the connectorGroup property.
     * @return a void
     */
    public void setConnectorGroup(@javax.annotation.Nullable final ConnectorGroup value) {
        this._connectorGroup = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time the application was registered. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.  Supports $filter (eq, ne, not, ge, le, in, and eq on null values) and $orderBy.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the createdOnBehalfOf property value. Read-only.
     * @param value Value to set for the createdOnBehalfOf property.
     * @return a void
     */
    public void setCreatedOnBehalfOf(@javax.annotation.Nullable final DirectoryObject value) {
        this._createdOnBehalfOf = value;
    }
    /**
     * Sets the defaultRedirectUri property value. The default redirect URI. If specified and there is no explicit redirect URI in the sign-in request for SAML and OIDC flows, Azure AD sends the token to this redirect URI. Azure AD also sends the token to this default URI in SAML IdP-initiated single sign-on. The value must match one of the configured redirect URIs for the application.
     * @param value Value to set for the defaultRedirectUri property.
     * @return a void
     */
    public void setDefaultRedirectUri(@javax.annotation.Nullable final String value) {
        this._defaultRedirectUri = value;
    }
    /**
     * Sets the description property value. Free text field to provide a description of the application object to end users. The maximum allowed size is 1024 characters. Returned by default. Supports $filter (eq, ne, not, ge, le, startsWith) and $search.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the disabledByMicrosoftStatus property value. Specifies whether Microsoft has disabled the registered application. Possible values are: null (default value), NotDisabled, and DisabledDueToViolationOfServicesAgreement (reasons may include suspicious, abusive, or malicious activity, or a violation of the Microsoft Services Agreement).  Supports $filter (eq, ne, not).
     * @param value Value to set for the disabledByMicrosoftStatus property.
     * @return a void
     */
    public void setDisabledByMicrosoftStatus(@javax.annotation.Nullable final String value) {
        this._disabledByMicrosoftStatus = value;
    }
    /**
     * Sets the displayName property value. The display name for the application. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderBy.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the extensionProperties property value. Read-only. Nullable.
     * @param value Value to set for the extensionProperties property.
     * @return a void
     */
    public void setExtensionProperties(@javax.annotation.Nullable final java.util.List<ExtensionProperty> value) {
        this._extensionProperties = value;
    }
    /**
     * Sets the federatedIdentityCredentials property value. Federated identities for applications. This object can only be retrieved on a single GET request (GET /applications/{id}/federatedIdentityCredentials).
     * @param value Value to set for the federatedIdentityCredentials property.
     * @return a void
     */
    public void setFederatedIdentityCredentials(@javax.annotation.Nullable final java.util.List<FederatedIdentityCredential> value) {
        this._federatedIdentityCredentials = value;
    }
    /**
     * Sets the groupMembershipClaims property value. Configures the groups claim issued in a user or OAuth 2.0 access token that the application expects. To set this attribute, use one of the following string values: None, SecurityGroup (for security groups and Azure AD roles), All (this gets all security groups, distribution groups, and Azure AD directory roles that the signed-in user is a member of).
     * @param value Value to set for the groupMembershipClaims property.
     * @return a void
     */
    public void setGroupMembershipClaims(@javax.annotation.Nullable final String value) {
        this._groupMembershipClaims = value;
    }
    /**
     * Sets the homeRealmDiscoveryPolicies property value. The homeRealmDiscoveryPolicies property
     * @param value Value to set for the homeRealmDiscoveryPolicies property.
     * @return a void
     */
    public void setHomeRealmDiscoveryPolicies(@javax.annotation.Nullable final java.util.List<HomeRealmDiscoveryPolicy> value) {
        this._homeRealmDiscoveryPolicies = value;
    }
    /**
     * Sets the identifierUris property value. Also known as App ID URI, this value is set when an application is used as a resource app. The identifierUris acts as the prefix for the scopes you'll reference in your API's code, and it must be globally unique. You can use the default value provided, which is in the form api://<application-client-id>, or specify a more readable URI like https://contoso.com/api. For more information on valid identifierUris patterns and best practices, see Azure AD application registration security best practices. Not nullable. Supports $filter (eq, ne, ge, le, startsWith).
     * @param value Value to set for the identifierUris property.
     * @return a void
     */
    public void setIdentifierUris(@javax.annotation.Nullable final java.util.List<String> value) {
        this._identifierUris = value;
    }
    /**
     * Sets the info property value. Basic profile information of the application, such as it's marketing, support, terms of service, and privacy statement URLs. The terms of service and privacy statement are surfaced to users through the user consent experience. For more information, see How to: Add Terms of service and privacy statement for registered Azure AD apps. Supports $filter (eq, ne, not, ge, le, and eq on null values).
     * @param value Value to set for the info property.
     * @return a void
     */
    public void setInfo(@javax.annotation.Nullable final InformationalUrl value) {
        this._info = value;
    }
    /**
     * Sets the isDeviceOnlyAuthSupported property value. Specifies whether this application supports device authentication without a user. The default is false.
     * @param value Value to set for the isDeviceOnlyAuthSupported property.
     * @return a void
     */
    public void setIsDeviceOnlyAuthSupported(@javax.annotation.Nullable final Boolean value) {
        this._isDeviceOnlyAuthSupported = value;
    }
    /**
     * Sets the isFallbackPublicClient property value. Specifies the fallback application type as public client, such as an installed application running on a mobile device. The default value is false which means the fallback application type is confidential client such as a web app. There are certain scenarios where Azure AD cannot determine the client application type. For example, the ROPC flow where the application is configured without specifying a redirect URI. In those cases Azure AD interprets the application type based on the value of this property.
     * @param value Value to set for the isFallbackPublicClient property.
     * @return a void
     */
    public void setIsFallbackPublicClient(@javax.annotation.Nullable final Boolean value) {
        this._isFallbackPublicClient = value;
    }
    /**
     * Sets the keyCredentials property value. The collection of key credentials associated with the application. Not nullable. Supports $filter (eq, not, ge, le).
     * @param value Value to set for the keyCredentials property.
     * @return a void
     */
    public void setKeyCredentials(@javax.annotation.Nullable final java.util.List<KeyCredential> value) {
        this._keyCredentials = value;
    }
    /**
     * Sets the logo property value. The main logo for the application. Not nullable.
     * @param value Value to set for the logo property.
     * @return a void
     */
    public void setLogo(@javax.annotation.Nullable final byte[] value) {
        this._logo = value;
    }
    /**
     * Sets the notes property value. Notes relevant for the management of the application.
     * @param value Value to set for the notes property.
     * @return a void
     */
    public void setNotes(@javax.annotation.Nullable final String value) {
        this._notes = value;
    }
    /**
     * Sets the onPremisesPublishing property value. Represents the set of properties required for configuring Application Proxy for this application. Configuring these properties allows you to publish your on-premises application for secure remote access.
     * @param value Value to set for the onPremisesPublishing property.
     * @return a void
     */
    public void setOnPremisesPublishing(@javax.annotation.Nullable final OnPremisesPublishing value) {
        this._onPremisesPublishing = value;
    }
    /**
     * Sets the optionalClaims property value. Application developers can configure optional claims in their Azure AD applications to specify the claims that are sent to their application by the Microsoft security token service. For more information, see How to: Provide optional claims to your app.
     * @param value Value to set for the optionalClaims property.
     * @return a void
     */
    public void setOptionalClaims(@javax.annotation.Nullable final OptionalClaims value) {
        this._optionalClaims = value;
    }
    /**
     * Sets the owners property value. Directory objects that are owners of the application. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the owners property.
     * @return a void
     */
    public void setOwners(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._owners = value;
    }
    /**
     * Sets the parentalControlSettings property value. Specifies parental control settings for an application.
     * @param value Value to set for the parentalControlSettings property.
     * @return a void
     */
    public void setParentalControlSettings(@javax.annotation.Nullable final ParentalControlSettings value) {
        this._parentalControlSettings = value;
    }
    /**
     * Sets the passwordCredentials property value. The collection of password credentials associated with the application. Not nullable.
     * @param value Value to set for the passwordCredentials property.
     * @return a void
     */
    public void setPasswordCredentials(@javax.annotation.Nullable final java.util.List<PasswordCredential> value) {
        this._passwordCredentials = value;
    }
    /**
     * Sets the publicClient property value. Specifies settings for installed clients such as desktop or mobile devices.
     * @param value Value to set for the publicClient property.
     * @return a void
     */
    public void setPublicClient(@javax.annotation.Nullable final PublicClientApplication value) {
        this._publicClient = value;
    }
    /**
     * Sets the publisherDomain property value. The verified publisher domain for the application. Read-only. Supports $filter (eq, ne, ge, le, startsWith).
     * @param value Value to set for the publisherDomain property.
     * @return a void
     */
    public void setPublisherDomain(@javax.annotation.Nullable final String value) {
        this._publisherDomain = value;
    }
    /**
     * Sets the requiredResourceAccess property value. Specifies the resources that the application needs to access. This property also specifies the set of delegated permissions and application roles that it needs for each of those resources. This configuration of access to the required resources drives the consent experience. No more than 50 resource services (APIs) can be configured. Beginning mid-October 2021, the total number of required permissions must not exceed 400. Not nullable. Supports $filter (eq, not, ge, le).
     * @param value Value to set for the requiredResourceAccess property.
     * @return a void
     */
    public void setRequiredResourceAccess(@javax.annotation.Nullable final java.util.List<RequiredResourceAccess> value) {
        this._requiredResourceAccess = value;
    }
    /**
     * Sets the serviceManagementReference property value. References application or service contact information from a Service or Asset Management database. Nullable.
     * @param value Value to set for the serviceManagementReference property.
     * @return a void
     */
    public void setServiceManagementReference(@javax.annotation.Nullable final String value) {
        this._serviceManagementReference = value;
    }
    /**
     * Sets the signInAudience property value. Specifies the Microsoft accounts that are supported for the current application. The possible values are: AzureADMyOrg, AzureADMultipleOrgs, AzureADandPersonalMicrosoftAccount (default), and PersonalMicrosoftAccount. See more in the table below. Supports $filter (eq, ne, not).
     * @param value Value to set for the signInAudience property.
     * @return a void
     */
    public void setSignInAudience(@javax.annotation.Nullable final String value) {
        this._signInAudience = value;
    }
    /**
     * Sets the spa property value. Specifies settings for a single-page application, including sign out URLs and redirect URIs for authorization codes and access tokens.
     * @param value Value to set for the spa property.
     * @return a void
     */
    public void setSpa(@javax.annotation.Nullable final SpaApplication value) {
        this._spa = value;
    }
    /**
     * Sets the synchronization property value. The synchronization property
     * @param value Value to set for the synchronization property.
     * @return a void
     */
    public void setSynchronization(@javax.annotation.Nullable final Synchronization value) {
        this._synchronization = value;
    }
    /**
     * Sets the tags property value. Custom strings that can be used to categorize and identify the application. Not nullable.Supports $filter (eq, not, ge, le, startsWith).
     * @param value Value to set for the tags property.
     * @return a void
     */
    public void setTags(@javax.annotation.Nullable final java.util.List<String> value) {
        this._tags = value;
    }
    /**
     * Sets the tokenEncryptionKeyId property value. Specifies the keyId of a public key from the keyCredentials collection. When configured, Azure AD encrypts all the tokens it emits by using the key this property points to. The application code that receives the encrypted token must use the matching private key to decrypt the token before it can be used for the signed-in user.
     * @param value Value to set for the tokenEncryptionKeyId property.
     * @return a void
     */
    public void setTokenEncryptionKeyId(@javax.annotation.Nullable final String value) {
        this._tokenEncryptionKeyId = value;
    }
    /**
     * Sets the tokenIssuancePolicies property value. The tokenIssuancePolicies property
     * @param value Value to set for the tokenIssuancePolicies property.
     * @return a void
     */
    public void setTokenIssuancePolicies(@javax.annotation.Nullable final java.util.List<TokenIssuancePolicy> value) {
        this._tokenIssuancePolicies = value;
    }
    /**
     * Sets the tokenLifetimePolicies property value. The tokenLifetimePolicies assigned to this application. Supports $expand.
     * @param value Value to set for the tokenLifetimePolicies property.
     * @return a void
     */
    public void setTokenLifetimePolicies(@javax.annotation.Nullable final java.util.List<TokenLifetimePolicy> value) {
        this._tokenLifetimePolicies = value;
    }
    /**
     * Sets the uniqueName property value. The unique identifier that can be assigned to an application as an alternative identifier. Immutable. Read-only.
     * @param value Value to set for the uniqueName property.
     * @return a void
     */
    public void setUniqueName(@javax.annotation.Nullable final String value) {
        this._uniqueName = value;
    }
    /**
     * Sets the verifiedPublisher property value. Specifies the verified publisher of the application. For more information about how publisher verification helps support application security, trustworthiness, and compliance, see Publisher verification.
     * @param value Value to set for the verifiedPublisher property.
     * @return a void
     */
    public void setVerifiedPublisher(@javax.annotation.Nullable final VerifiedPublisher value) {
        this._verifiedPublisher = value;
    }
    /**
     * Sets the web property value. Specifies settings for a web application.
     * @param value Value to set for the web property.
     * @return a void
     */
    public void setWeb(@javax.annotation.Nullable final WebApplication value) {
        this._web = value;
    }
    /**
     * Sets the windows property value. Specifies settings for apps running Microsoft Windows and published in the Microsoft Store or Xbox games store.
     * @param value Value to set for the windows property.
     * @return a void
     */
    public void setWindows(@javax.annotation.Nullable final WindowsApplication value) {
        this._windows = value;
    }
}
