package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Singleton entity that acts as a container for all device management functionality. */
public class DeviceManagement extends Entity implements Parsable {
    /** The date & time when tenant data moved between scaleunits. */
    private OffsetDateTime _accountMoveCompletionDateTime;
    /** Admin consent information. */
    private AdminConsent _adminConsent;
    /** The summary state of ATP onboarding state for this account. */
    private AdvancedThreatProtectionOnboardingStateSummary _advancedThreatProtectionOnboardingStateSummary;
    /** Android device owner enrollment profile entities. */
    private java.util.List<AndroidDeviceOwnerEnrollmentProfile> _androidDeviceOwnerEnrollmentProfiles;
    /** Android for Work app configuration schema entities. */
    private java.util.List<AndroidForWorkAppConfigurationSchema> _androidForWorkAppConfigurationSchemas;
    /** Android for Work enrollment profile entities. */
    private java.util.List<AndroidForWorkEnrollmentProfile> _androidForWorkEnrollmentProfiles;
    /** The singleton Android for Work settings entity. */
    private AndroidForWorkSettings _androidForWorkSettings;
    /** The singleton Android managed store account enterprise settings entity. */
    private AndroidManagedStoreAccountEnterpriseSettings _androidManagedStoreAccountEnterpriseSettings;
    /** Android Enterprise app configuration schema entities. */
    private java.util.List<AndroidManagedStoreAppConfigurationSchema> _androidManagedStoreAppConfigurationSchemas;
    /** Apple push notification certificate. */
    private ApplePushNotificationCertificate _applePushNotificationCertificate;
    /** Apple user initiated enrollment profiles */
    private java.util.List<AppleUserInitiatedEnrollmentProfile> _appleUserInitiatedEnrollmentProfiles;
    /** The list of assignment filters */
    private java.util.List<DeviceAndAppManagementAssignmentFilter> _assignmentFilters;
    /** The Audit Events */
    private java.util.List<AuditEvent> _auditEvents;
    /** The list of autopilot events for the tenant. */
    private java.util.List<DeviceManagementAutopilotEvent> _autopilotEvents;
    /** The Cart To Class Associations. */
    private java.util.List<CartToClassAssociation> _cartToClassAssociations;
    /** The available categories */
    private java.util.List<DeviceManagementSettingCategory> _categories;
    /** Collection of certificate connector details, each associated with a corresponding Intune Certificate Connector. */
    private java.util.List<CertificateConnectorDetails> _certificateConnectorDetails;
    /** Collection of ChromeOSOnboardingSettings settings associated with account. */
    private java.util.List<ChromeOSOnboardingSettings> _chromeOSOnboardingSettings;
    /** The list of CloudPC Connectivity Issue. */
    private java.util.List<CloudPCConnectivityIssue> _cloudPCConnectivityIssues;
    /** The list of co-managed devices report */
    private java.util.List<ManagedDevice> _comanagedDevices;
    /** The list of co-management eligible devices report */
    private java.util.List<ComanagementEligibleDevice> _comanagementEligibleDevices;
    /** List of all compliance categories */
    private java.util.List<DeviceManagementConfigurationCategory> _complianceCategories;
    /** The list of Compliance Management Partners configured by the tenant. */
    private java.util.List<ComplianceManagementPartner> _complianceManagementPartners;
    /** List of all compliance policies */
    private java.util.List<DeviceManagementCompliancePolicy> _compliancePolicies;
    /** List of all ComplianceSettings */
    private java.util.List<DeviceManagementConfigurationSettingDefinition> _complianceSettings;
    /** The Exchange on premises conditional access settings. On premises conditional access will require devices to be both enrolled and compliant for mail access */
    private OnPremisesConditionalAccessSettings _conditionalAccessSettings;
    /** A list of ConfigManagerCollection */
    private java.util.List<ConfigManagerCollection> _configManagerCollections;
    /** List of all Configuration Categories */
    private java.util.List<DeviceManagementConfigurationCategory> _configurationCategories;
    /** List of all Configuration policies */
    private java.util.List<DeviceManagementConfigurationPolicy> _configurationPolicies;
    /** List of all templates */
    private java.util.List<DeviceManagementConfigurationPolicyTemplate> _configurationPolicyTemplates;
    /** List of all ConfigurationSettings */
    private java.util.List<DeviceManagementConfigurationSettingDefinition> _configurationSettings;
    /** Data sharing consents. */
    private java.util.List<DataSharingConsent> _dataSharingConsents;
    /** This collections of multiple DEP tokens per-tenant. */
    private java.util.List<DepOnboardingSetting> _depOnboardingSettings;
    /** Collection of Derived credential settings associated with account. */
    private java.util.List<DeviceManagementDerivedCredentialSettings> _derivedCredentials;
    /** The list of detected apps associated with a device. */
    private java.util.List<DetectedApp> _detectedApps;
    /** The list of device categories with the tenant. */
    private java.util.List<DeviceCategory> _deviceCategories;
    /** The device compliance policies. */
    private java.util.List<DeviceCompliancePolicy> _deviceCompliancePolicies;
    /** The device compliance state summary for this account. */
    private DeviceCompliancePolicyDeviceStateSummary _deviceCompliancePolicyDeviceStateSummary;
    /** The summary states of compliance policy settings for this account. */
    private java.util.List<DeviceCompliancePolicySettingStateSummary> _deviceCompliancePolicySettingStateSummaries;
    /** The last requested time of device compliance reporting for this account. This property is read-only. */
    private OffsetDateTime _deviceComplianceReportSummarizationDateTime;
    /** The list of device compliance scripts associated with the tenant. */
    private java.util.List<DeviceComplianceScript> _deviceComplianceScripts;
    /** Summary of policies in conflict state for this account. */
    private java.util.List<DeviceConfigurationConflictSummary> _deviceConfigurationConflictSummary;
    /** The device configuration device state summary for this account. */
    private DeviceConfigurationDeviceStateSummary _deviceConfigurationDeviceStateSummaries;
    /** Restricted apps violations for this account. */
    private java.util.List<RestrictedAppsViolation> _deviceConfigurationRestrictedAppsViolations;
    /** The device configurations. */
    private java.util.List<DeviceConfiguration> _deviceConfigurations;
    /** Summary of all certificates for all devices. */
    private java.util.List<ManagedAllDeviceCertificateState> _deviceConfigurationsAllManagedDeviceCertificateStates;
    /** The device configuration user state summary for this account. */
    private DeviceConfigurationUserStateSummary _deviceConfigurationUserStateSummaries;
    /** The list of device custom attribute shell scripts associated with the tenant. */
    private java.util.List<DeviceCustomAttributeShellScript> _deviceCustomAttributeShellScripts;
    /** The list of device enrollment configurations */
    private java.util.List<DeviceEnrollmentConfiguration> _deviceEnrollmentConfigurations;
    /** The list of device health scripts associated with the tenant. */
    private java.util.List<DeviceHealthScript> _deviceHealthScripts;
    /** The list of Device Management Partners configured by the tenant. */
    private java.util.List<DeviceManagementPartner> _deviceManagementPartners;
    /** The list of device management scripts associated with the tenant. */
    private java.util.List<DeviceManagementScript> _deviceManagementScripts;
    /** Device protection overview. */
    private DeviceProtectionOverview _deviceProtectionOverview;
    /** The list of device shell scripts associated with the tenant. */
    private java.util.List<DeviceShellScript> _deviceShellScripts;
    /** A list of connector objects. */
    private java.util.List<DeviceManagementDomainJoinConnector> _domainJoinConnectors;
    /** The embedded SIM activation code pools created by this account. */
    private java.util.List<EmbeddedSIMActivationCodePool> _embeddedSIMActivationCodePools;
    /** The list of Exchange Connectors configured by the tenant. */
    private java.util.List<DeviceManagementExchangeConnector> _exchangeConnectors;
    /** The list of Exchange On Premisis policies configured by the tenant. */
    private java.util.List<DeviceManagementExchangeOnPremisesPolicy> _exchangeOnPremisesPolicies;
    /** The policy which controls mobile device access to Exchange On Premises */
    private DeviceManagementExchangeOnPremisesPolicy _exchangeOnPremisesPolicy;
    /** The available group policy categories for this account. */
    private java.util.List<GroupPolicyCategory> _groupPolicyCategories;
    /** The group policy configurations created by this account. */
    private java.util.List<GroupPolicyConfiguration> _groupPolicyConfigurations;
    /** The available group policy definition files for this account. */
    private java.util.List<GroupPolicyDefinitionFile> _groupPolicyDefinitionFiles;
    /** The available group policy definitions for this account. */
    private java.util.List<GroupPolicyDefinition> _groupPolicyDefinitions;
    /** A list of Group Policy migration reports. */
    private java.util.List<GroupPolicyMigrationReport> _groupPolicyMigrationReports;
    /** A list of Group Policy Object files uploaded. */
    private java.util.List<GroupPolicyObjectFile> _groupPolicyObjectFiles;
    /** The available group policy uploaded definition files for this account. */
    private java.util.List<GroupPolicyUploadedDefinitionFile> _groupPolicyUploadedDefinitionFiles;
    /** The imported device identities. */
    private java.util.List<ImportedDeviceIdentity> _importedDeviceIdentities;
    /** Collection of imported Windows autopilot devices. */
    private java.util.List<ImportedWindowsAutopilotDeviceIdentity> _importedWindowsAutopilotDeviceIdentities;
    /** The device management intents */
    private java.util.List<DeviceManagementIntent> _intents;
    /** Intune Account ID for given tenant */
    private String _intuneAccountId;
    /** intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the end user web portal. */
    private IntuneBrand _intuneBrand;
    /** Intune branding profiles targeted to AAD groups */
    private java.util.List<IntuneBrandingProfile> _intuneBrandingProfiles;
    /** The IOS software update installation statuses for this account. */
    private java.util.List<IosUpdateDeviceStatus> _iosUpdateStatuses;
    /** The last modified time of reporting for this account. This property is read-only. */
    private OffsetDateTime _lastReportAggregationDateTime;
    /** The property to enable Non-MDM managed legacy PC management for this account. This property is read-only. */
    private Boolean _legacyPcManangementEnabled;
    /** The MacOS software update account summaries for this account. */
    private java.util.List<MacOSSoftwareUpdateAccountSummary> _macOSSoftwareUpdateAccountSummaries;
    /** Device cleanup rule */
    private ManagedDeviceCleanupSettings _managedDeviceCleanupSettings;
    /** Encryption report for devices in this account */
    private java.util.List<ManagedDeviceEncryptionState> _managedDeviceEncryptionStates;
    /** Device overview */
    private ManagedDeviceOverview _managedDeviceOverview;
    /** The list of managed devices. */
    private java.util.List<ManagedDevice> _managedDevices;
    /** Maximum number of DEP tokens allowed per-tenant. */
    private Integer _maximumDepTokens;
    /** Collection of MicrosoftTunnelConfiguration settings associated with account. */
    private java.util.List<MicrosoftTunnelConfiguration> _microsoftTunnelConfigurations;
    /** Collection of MicrosoftTunnelHealthThreshold settings associated with account. */
    private java.util.List<MicrosoftTunnelHealthThreshold> _microsoftTunnelHealthThresholds;
    /** Collection of MicrosoftTunnelServerLogCollectionResponse settings associated with account. */
    private java.util.List<MicrosoftTunnelServerLogCollectionResponse> _microsoftTunnelServerLogCollectionResponses;
    /** Collection of MicrosoftTunnelSite settings associated with account. */
    private java.util.List<MicrosoftTunnelSite> _microsoftTunnelSites;
    /** The collection property of MobileAppTroubleshootingEvent. */
    private java.util.List<MobileAppTroubleshootingEvent> _mobileAppTroubleshootingEvents;
    /** The list of Mobile threat Defense connectors configured by the tenant. */
    private java.util.List<MobileThreatDefenseConnector> _mobileThreatDefenseConnectors;
    /** The collection of Ndes connectors for this account. */
    private java.util.List<NdesConnector> _ndesConnectors;
    /** The Notification Message Templates. */
    private java.util.List<NotificationMessageTemplate> _notificationMessageTemplates;
    /** List of OEM Warranty Statuses */
    private java.util.List<OemWarrantyInformationOnboarding> _oemWarrantyInformationOnboarding;
    /** The list of device remote action audits with the tenant. */
    private java.util.List<RemoteActionAudit> _remoteActionAudits;
    /** The remote assist partners. */
    private java.util.List<RemoteAssistancePartner> _remoteAssistancePartners;
    /** The remote assistance settings singleton */
    private RemoteAssistanceSettings _remoteAssistanceSettings;
    /** Reports singleton */
    private DeviceManagementReports _reports;
    /** Collection of resource access settings associated with account. */
    private java.util.List<DeviceManagementResourceAccessProfileBase> _resourceAccessProfiles;
    /** The Resource Operations. */
    private java.util.List<ResourceOperation> _resourceOperations;
    /** List of all reusable settings that can be referred in a policy */
    private java.util.List<DeviceManagementReusablePolicySetting> _reusablePolicySettings;
    /** List of all reusable settings */
    private java.util.List<DeviceManagementConfigurationSettingDefinition> _reusableSettings;
    /** The Role Assignments. */
    private java.util.List<DeviceAndAppManagementRoleAssignment> _roleAssignments;
    /** The Role Definitions. */
    private java.util.List<RoleDefinition> _roleDefinitions;
    /** The Role Scope Tags. */
    private java.util.List<RoleScopeTag> _roleScopeTags;
    /** The device management intent setting definitions */
    private java.util.List<DeviceManagementSettingDefinition> _settingDefinitions;
    /** Account level settings. */
    private DeviceManagementSettings _settings;
    /** The software update status summary. */
    private SoftwareUpdateStatusSummary _softwareUpdateStatusSummary;
    /** Tenant's Subscription. Possible values are: none, intune, office365, intunePremium, intune_EDU, intune_SMB. */
    private DeviceManagementSubscriptions _subscriptions;
    /** Tenant mobile device management subscription state. Possible values are: pending, active, warning, disabled, deleted, blocked, lockedOut. */
    private DeviceManagementSubscriptionState _subscriptionState;
    /** The telecom expense management partners. */
    private java.util.List<TelecomExpenseManagementPartner> _telecomExpenseManagementPartners;
    /** The available templates */
    private java.util.List<DeviceManagementTemplate> _templates;
    /** List of all TemplateSettings */
    private java.util.List<DeviceManagementConfigurationSettingTemplate> _templateSettings;
    /** TenantAttach RBAC Enablement */
    private TenantAttachRBAC _tenantAttachRBAC;
    /** The terms and conditions associated with device management of the company. */
    private java.util.List<TermsAndConditions> _termsAndConditions;
    /** The list of troubleshooting events for the tenant. */
    private java.util.List<DeviceManagementTroubleshootingEvent> _troubleshootingEvents;
    /** When enabled, users assigned as administrators via Role Assignment Memberships do not require an assigned Intune license. Prior to this, only Intune licensed users were granted permissions with an Intune role unless they were assigned a role via Azure Active Directory. You are limited to 350 unlicensed direct members for each AAD security group in a role assignment, but you can assign multiple AAD security groups to a role if you need to support more than 350 unlicensed administrators. Licensed administrators are unaffected, do not have to be direct members, nor does the 350 member limit apply. This property is read-only. */
    private Boolean _unlicensedAdminstratorsEnabled;
    /** User experience analytics appHealth Application Performance */
    private java.util.List<UserExperienceAnalyticsAppHealthApplicationPerformance> _userExperienceAnalyticsAppHealthApplicationPerformance;
    /** User experience analytics appHealth Application Performance by App Version */
    private java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion> _userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion;
    /** User experience analytics appHealth Application Performance by App Version details */
    private java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails> _userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails;
    /** User experience analytics appHealth Application Performance by App Version Device Id */
    private java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId> _userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId;
    /** User experience analytics appHealth Application Performance by OS Version */
    private java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion> _userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion;
    /** User experience analytics appHealth Model Performance */
    private java.util.List<UserExperienceAnalyticsAppHealthDeviceModelPerformance> _userExperienceAnalyticsAppHealthDeviceModelPerformance;
    /** User experience analytics appHealth Device Performance */
    private java.util.List<UserExperienceAnalyticsAppHealthDevicePerformance> _userExperienceAnalyticsAppHealthDevicePerformance;
    /** User experience analytics device performance details */
    private java.util.List<UserExperienceAnalyticsAppHealthDevicePerformanceDetails> _userExperienceAnalyticsAppHealthDevicePerformanceDetails;
    /** User experience analytics appHealth OS version Performance */
    private java.util.List<UserExperienceAnalyticsAppHealthOSVersionPerformance> _userExperienceAnalyticsAppHealthOSVersionPerformance;
    /** User experience analytics appHealth overview */
    private UserExperienceAnalyticsCategory _userExperienceAnalyticsAppHealthOverview;
    /** User experience analytics baselines */
    private java.util.List<UserExperienceAnalyticsBaseline> _userExperienceAnalyticsBaselines;
    /** User Experience Analytics Battery Health App Impact */
    private java.util.List<UserExperienceAnalyticsBatteryHealthAppImpact> _userExperienceAnalyticsBatteryHealthAppImpact;
    /** User Experience Analytics Battery Health Capacity Details */
    private UserExperienceAnalyticsBatteryHealthCapacityDetails _userExperienceAnalyticsBatteryHealthCapacityDetails;
    /** User Experience Analytics Battery Health Device App Impact */
    private java.util.List<UserExperienceAnalyticsBatteryHealthDeviceAppImpact> _userExperienceAnalyticsBatteryHealthDeviceAppImpact;
    /** User Experience Analytics Battery Health Device Performance */
    private java.util.List<UserExperienceAnalyticsBatteryHealthDevicePerformance> _userExperienceAnalyticsBatteryHealthDevicePerformance;
    /** User Experience Analytics Battery Health Device Runtime History */
    private java.util.List<UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory> _userExperienceAnalyticsBatteryHealthDeviceRuntimeHistory;
    /** User Experience Analytics Battery Health Model Performance */
    private java.util.List<UserExperienceAnalyticsBatteryHealthModelPerformance> _userExperienceAnalyticsBatteryHealthModelPerformance;
    /** User Experience Analytics Battery Health Os Performance */
    private java.util.List<UserExperienceAnalyticsBatteryHealthOsPerformance> _userExperienceAnalyticsBatteryHealthOsPerformance;
    /** User Experience Analytics Battery Health Runtime Details */
    private UserExperienceAnalyticsBatteryHealthRuntimeDetails _userExperienceAnalyticsBatteryHealthRuntimeDetails;
    /** User experience analytics categories */
    private java.util.List<UserExperienceAnalyticsCategory> _userExperienceAnalyticsCategories;
    /** User experience analytics device metric history */
    private java.util.List<UserExperienceAnalyticsMetricHistory> _userExperienceAnalyticsDeviceMetricHistory;
    /** User experience analytics device performance */
    private java.util.List<UserExperienceAnalyticsDevicePerformance> _userExperienceAnalyticsDevicePerformance;
    /** The user experience analytics device scope entity endpoint to trigger on the service to either START or STOP computing metrics data based on a device scope configuration. */
    private UserExperienceAnalyticsDeviceScope _userExperienceAnalyticsDeviceScope;
    /** The user experience analytics device scope entity contains device scope configuration use to apply filtering on the endpoint analytics reports. */
    private java.util.List<UserExperienceAnalyticsDeviceScope> _userExperienceAnalyticsDeviceScopes;
    /** User experience analytics device scores */
    private java.util.List<UserExperienceAnalyticsDeviceScores> _userExperienceAnalyticsDeviceScores;
    /** User experience analytics device Startup History */
    private java.util.List<UserExperienceAnalyticsDeviceStartupHistory> _userExperienceAnalyticsDeviceStartupHistory;
    /** User experience analytics device Startup Processes */
    private java.util.List<UserExperienceAnalyticsDeviceStartupProcess> _userExperienceAnalyticsDeviceStartupProcesses;
    /** User experience analytics device Startup Process Performance */
    private java.util.List<UserExperienceAnalyticsDeviceStartupProcessPerformance> _userExperienceAnalyticsDeviceStartupProcessPerformance;
    /** User experience analytics devices without cloud identity. */
    private java.util.List<UserExperienceAnalyticsDeviceWithoutCloudIdentity> _userExperienceAnalyticsDevicesWithoutCloudIdentity;
    /** User experience analytics impacting process */
    private java.util.List<UserExperienceAnalyticsImpactingProcess> _userExperienceAnalyticsImpactingProcess;
    /** User experience analytics metric history */
    private java.util.List<UserExperienceAnalyticsMetricHistory> _userExperienceAnalyticsMetricHistory;
    /** User experience analytics model scores */
    private java.util.List<UserExperienceAnalyticsModelScores> _userExperienceAnalyticsModelScores;
    /** User experience analytics devices not Windows Autopilot ready. */
    private java.util.List<UserExperienceAnalyticsNotAutopilotReadyDevice> _userExperienceAnalyticsNotAutopilotReadyDevice;
    /** User experience analytics overview */
    private UserExperienceAnalyticsOverview _userExperienceAnalyticsOverview;
    /** User experience analytics regression summary */
    private UserExperienceAnalyticsRegressionSummary _userExperienceAnalyticsRegressionSummary;
    /** User experience analytics remote connection */
    private java.util.List<UserExperienceAnalyticsRemoteConnection> _userExperienceAnalyticsRemoteConnection;
    /** User experience analytics resource performance */
    private java.util.List<UserExperienceAnalyticsResourcePerformance> _userExperienceAnalyticsResourcePerformance;
    /** User experience analytics device Startup Score History */
    private java.util.List<UserExperienceAnalyticsScoreHistory> _userExperienceAnalyticsScoreHistory;
    /** User experience analytics device settings */
    private UserExperienceAnalyticsSettings _userExperienceAnalyticsSettings;
    /** User experience analytics work from anywhere hardware readiness metrics. */
    private UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric _userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric;
    /** User experience analytics work from anywhere metrics. */
    private java.util.List<UserExperienceAnalyticsWorkFromAnywhereMetric> _userExperienceAnalyticsWorkFromAnywhereMetrics;
    /** The user experience analytics work from anywhere model performance */
    private java.util.List<UserExperienceAnalyticsWorkFromAnywhereModelPerformance> _userExperienceAnalyticsWorkFromAnywhereModelPerformance;
    /** Collection of PFX certificates associated with a user. */
    private java.util.List<UserPFXCertificate> _userPfxCertificates;
    /** The virtualEndpoint property */
    private VirtualEndpoint _virtualEndpoint;
    /** Windows auto pilot deployment profiles */
    private java.util.List<WindowsAutopilotDeploymentProfile> _windowsAutopilotDeploymentProfiles;
    /** The Windows autopilot device identities contained collection. */
    private java.util.List<WindowsAutopilotDeviceIdentity> _windowsAutopilotDeviceIdentities;
    /** The Windows autopilot account settings. */
    private WindowsAutopilotSettings _windowsAutopilotSettings;
    /** A collection of windows driver update profiles */
    private java.util.List<WindowsDriverUpdateProfile> _windowsDriverUpdateProfiles;
    /** A collection of windows feature update profiles */
    private java.util.List<WindowsFeatureUpdateProfile> _windowsFeatureUpdateProfiles;
    /** The windows information protection app learning summaries. */
    private java.util.List<WindowsInformationProtectionAppLearningSummary> _windowsInformationProtectionAppLearningSummaries;
    /** The windows information protection network learning summaries. */
    private java.util.List<WindowsInformationProtectionNetworkLearningSummary> _windowsInformationProtectionNetworkLearningSummaries;
    /** The list of affected malware in the tenant. */
    private java.util.List<WindowsMalwareInformation> _windowsMalwareInformation;
    /** Malware overview for windows devices. */
    private WindowsMalwareOverview _windowsMalwareOverview;
    /** A collection of windows quality update profiles */
    private java.util.List<WindowsQualityUpdateProfile> _windowsQualityUpdateProfiles;
    /** A collection of windows update catalog items (fetaure updates item , quality updates item) */
    private java.util.List<WindowsUpdateCatalogItem> _windowsUpdateCatalogItems;
    /** The Collection of ZebraFotaArtifacts. */
    private java.util.List<ZebraFotaArtifact> _zebraFotaArtifacts;
    /** The singleton ZebraFotaConnector associated with account. */
    private ZebraFotaConnector _zebraFotaConnector;
    /** Collection of ZebraFotaDeployments associated with account. */
    private java.util.List<ZebraFotaDeployment> _zebraFotaDeployments;
    /**
     * Instantiates a new deviceManagement and sets the default values.
     * @return a void
     */
    public DeviceManagement() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagement
     */
    @javax.annotation.Nonnull
    public static DeviceManagement createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagement();
    }
    /**
     * Gets the accountMoveCompletionDateTime property value. The date & time when tenant data moved between scaleunits.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAccountMoveCompletionDateTime() {
        return this._accountMoveCompletionDateTime;
    }
    /**
     * Gets the adminConsent property value. Admin consent information.
     * @return a adminConsent
     */
    @javax.annotation.Nullable
    public AdminConsent getAdminConsent() {
        return this._adminConsent;
    }
    /**
     * Gets the advancedThreatProtectionOnboardingStateSummary property value. The summary state of ATP onboarding state for this account.
     * @return a advancedThreatProtectionOnboardingStateSummary
     */
    @javax.annotation.Nullable
    public AdvancedThreatProtectionOnboardingStateSummary getAdvancedThreatProtectionOnboardingStateSummary() {
        return this._advancedThreatProtectionOnboardingStateSummary;
    }
    /**
     * Gets the androidDeviceOwnerEnrollmentProfiles property value. Android device owner enrollment profile entities.
     * @return a androidDeviceOwnerEnrollmentProfile
     */
    @javax.annotation.Nullable
    public java.util.List<AndroidDeviceOwnerEnrollmentProfile> getAndroidDeviceOwnerEnrollmentProfiles() {
        return this._androidDeviceOwnerEnrollmentProfiles;
    }
    /**
     * Gets the androidForWorkAppConfigurationSchemas property value. Android for Work app configuration schema entities.
     * @return a androidForWorkAppConfigurationSchema
     */
    @javax.annotation.Nullable
    public java.util.List<AndroidForWorkAppConfigurationSchema> getAndroidForWorkAppConfigurationSchemas() {
        return this._androidForWorkAppConfigurationSchemas;
    }
    /**
     * Gets the androidForWorkEnrollmentProfiles property value. Android for Work enrollment profile entities.
     * @return a androidForWorkEnrollmentProfile
     */
    @javax.annotation.Nullable
    public java.util.List<AndroidForWorkEnrollmentProfile> getAndroidForWorkEnrollmentProfiles() {
        return this._androidForWorkEnrollmentProfiles;
    }
    /**
     * Gets the androidForWorkSettings property value. The singleton Android for Work settings entity.
     * @return a androidForWorkSettings
     */
    @javax.annotation.Nullable
    public AndroidForWorkSettings getAndroidForWorkSettings() {
        return this._androidForWorkSettings;
    }
    /**
     * Gets the androidManagedStoreAccountEnterpriseSettings property value. The singleton Android managed store account enterprise settings entity.
     * @return a androidManagedStoreAccountEnterpriseSettings
     */
    @javax.annotation.Nullable
    public AndroidManagedStoreAccountEnterpriseSettings getAndroidManagedStoreAccountEnterpriseSettings() {
        return this._androidManagedStoreAccountEnterpriseSettings;
    }
    /**
     * Gets the androidManagedStoreAppConfigurationSchemas property value. Android Enterprise app configuration schema entities.
     * @return a androidManagedStoreAppConfigurationSchema
     */
    @javax.annotation.Nullable
    public java.util.List<AndroidManagedStoreAppConfigurationSchema> getAndroidManagedStoreAppConfigurationSchemas() {
        return this._androidManagedStoreAppConfigurationSchemas;
    }
    /**
     * Gets the applePushNotificationCertificate property value. Apple push notification certificate.
     * @return a applePushNotificationCertificate
     */
    @javax.annotation.Nullable
    public ApplePushNotificationCertificate getApplePushNotificationCertificate() {
        return this._applePushNotificationCertificate;
    }
    /**
     * Gets the appleUserInitiatedEnrollmentProfiles property value. Apple user initiated enrollment profiles
     * @return a appleUserInitiatedEnrollmentProfile
     */
    @javax.annotation.Nullable
    public java.util.List<AppleUserInitiatedEnrollmentProfile> getAppleUserInitiatedEnrollmentProfiles() {
        return this._appleUserInitiatedEnrollmentProfiles;
    }
    /**
     * Gets the assignmentFilters property value. The list of assignment filters
     * @return a deviceAndAppManagementAssignmentFilter
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceAndAppManagementAssignmentFilter> getAssignmentFilters() {
        return this._assignmentFilters;
    }
    /**
     * Gets the auditEvents property value. The Audit Events
     * @return a auditEvent
     */
    @javax.annotation.Nullable
    public java.util.List<AuditEvent> getAuditEvents() {
        return this._auditEvents;
    }
    /**
     * Gets the autopilotEvents property value. The list of autopilot events for the tenant.
     * @return a deviceManagementAutopilotEvent
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementAutopilotEvent> getAutopilotEvents() {
        return this._autopilotEvents;
    }
    /**
     * Gets the cartToClassAssociations property value. The Cart To Class Associations.
     * @return a cartToClassAssociation
     */
    @javax.annotation.Nullable
    public java.util.List<CartToClassAssociation> getCartToClassAssociations() {
        return this._cartToClassAssociations;
    }
    /**
     * Gets the categories property value. The available categories
     * @return a deviceManagementSettingCategory
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementSettingCategory> getCategories() {
        return this._categories;
    }
    /**
     * Gets the certificateConnectorDetails property value. Collection of certificate connector details, each associated with a corresponding Intune Certificate Connector.
     * @return a certificateConnectorDetails
     */
    @javax.annotation.Nullable
    public java.util.List<CertificateConnectorDetails> getCertificateConnectorDetails() {
        return this._certificateConnectorDetails;
    }
    /**
     * Gets the chromeOSOnboardingSettings property value. Collection of ChromeOSOnboardingSettings settings associated with account.
     * @return a chromeOSOnboardingSettings
     */
    @javax.annotation.Nullable
    public java.util.List<ChromeOSOnboardingSettings> getChromeOSOnboardingSettings() {
        return this._chromeOSOnboardingSettings;
    }
    /**
     * Gets the cloudPCConnectivityIssues property value. The list of CloudPC Connectivity Issue.
     * @return a cloudPCConnectivityIssue
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPCConnectivityIssue> getCloudPCConnectivityIssues() {
        return this._cloudPCConnectivityIssues;
    }
    /**
     * Gets the comanagedDevices property value. The list of co-managed devices report
     * @return a managedDevice
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedDevice> getComanagedDevices() {
        return this._comanagedDevices;
    }
    /**
     * Gets the comanagementEligibleDevices property value. The list of co-management eligible devices report
     * @return a comanagementEligibleDevice
     */
    @javax.annotation.Nullable
    public java.util.List<ComanagementEligibleDevice> getComanagementEligibleDevices() {
        return this._comanagementEligibleDevices;
    }
    /**
     * Gets the complianceCategories property value. List of all compliance categories
     * @return a deviceManagementConfigurationCategory
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationCategory> getComplianceCategories() {
        return this._complianceCategories;
    }
    /**
     * Gets the complianceManagementPartners property value. The list of Compliance Management Partners configured by the tenant.
     * @return a complianceManagementPartner
     */
    @javax.annotation.Nullable
    public java.util.List<ComplianceManagementPartner> getComplianceManagementPartners() {
        return this._complianceManagementPartners;
    }
    /**
     * Gets the compliancePolicies property value. List of all compliance policies
     * @return a deviceManagementCompliancePolicy
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementCompliancePolicy> getCompliancePolicies() {
        return this._compliancePolicies;
    }
    /**
     * Gets the complianceSettings property value. List of all ComplianceSettings
     * @return a deviceManagementConfigurationSettingDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingDefinition> getComplianceSettings() {
        return this._complianceSettings;
    }
    /**
     * Gets the conditionalAccessSettings property value. The Exchange on premises conditional access settings. On premises conditional access will require devices to be both enrolled and compliant for mail access
     * @return a onPremisesConditionalAccessSettings
     */
    @javax.annotation.Nullable
    public OnPremisesConditionalAccessSettings getConditionalAccessSettings() {
        return this._conditionalAccessSettings;
    }
    /**
     * Gets the configManagerCollections property value. A list of ConfigManagerCollection
     * @return a configManagerCollection
     */
    @javax.annotation.Nullable
    public java.util.List<ConfigManagerCollection> getConfigManagerCollections() {
        return this._configManagerCollections;
    }
    /**
     * Gets the configurationCategories property value. List of all Configuration Categories
     * @return a deviceManagementConfigurationCategory
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationCategory> getConfigurationCategories() {
        return this._configurationCategories;
    }
    /**
     * Gets the configurationPolicies property value. List of all Configuration policies
     * @return a deviceManagementConfigurationPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationPolicy> getConfigurationPolicies() {
        return this._configurationPolicies;
    }
    /**
     * Gets the configurationPolicyTemplates property value. List of all templates
     * @return a deviceManagementConfigurationPolicyTemplate
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationPolicyTemplate> getConfigurationPolicyTemplates() {
        return this._configurationPolicyTemplates;
    }
    /**
     * Gets the configurationSettings property value. List of all ConfigurationSettings
     * @return a deviceManagementConfigurationSettingDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingDefinition> getConfigurationSettings() {
        return this._configurationSettings;
    }
    /**
     * Gets the dataSharingConsents property value. Data sharing consents.
     * @return a dataSharingConsent
     */
    @javax.annotation.Nullable
    public java.util.List<DataSharingConsent> getDataSharingConsents() {
        return this._dataSharingConsents;
    }
    /**
     * Gets the depOnboardingSettings property value. This collections of multiple DEP tokens per-tenant.
     * @return a depOnboardingSetting
     */
    @javax.annotation.Nullable
    public java.util.List<DepOnboardingSetting> getDepOnboardingSettings() {
        return this._depOnboardingSettings;
    }
    /**
     * Gets the derivedCredentials property value. Collection of Derived credential settings associated with account.
     * @return a deviceManagementDerivedCredentialSettings
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementDerivedCredentialSettings> getDerivedCredentials() {
        return this._derivedCredentials;
    }
    /**
     * Gets the detectedApps property value. The list of detected apps associated with a device.
     * @return a detectedApp
     */
    @javax.annotation.Nullable
    public java.util.List<DetectedApp> getDetectedApps() {
        return this._detectedApps;
    }
    /**
     * Gets the deviceCategories property value. The list of device categories with the tenant.
     * @return a deviceCategory
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceCategory> getDeviceCategories() {
        return this._deviceCategories;
    }
    /**
     * Gets the deviceCompliancePolicies property value. The device compliance policies.
     * @return a deviceCompliancePolicy
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceCompliancePolicy> getDeviceCompliancePolicies() {
        return this._deviceCompliancePolicies;
    }
    /**
     * Gets the deviceCompliancePolicyDeviceStateSummary property value. The device compliance state summary for this account.
     * @return a deviceCompliancePolicyDeviceStateSummary
     */
    @javax.annotation.Nullable
    public DeviceCompliancePolicyDeviceStateSummary getDeviceCompliancePolicyDeviceStateSummary() {
        return this._deviceCompliancePolicyDeviceStateSummary;
    }
    /**
     * Gets the deviceCompliancePolicySettingStateSummaries property value. The summary states of compliance policy settings for this account.
     * @return a deviceCompliancePolicySettingStateSummary
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceCompliancePolicySettingStateSummary> getDeviceCompliancePolicySettingStateSummaries() {
        return this._deviceCompliancePolicySettingStateSummaries;
    }
    /**
     * Gets the deviceComplianceReportSummarizationDateTime property value. The last requested time of device compliance reporting for this account. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDeviceComplianceReportSummarizationDateTime() {
        return this._deviceComplianceReportSummarizationDateTime;
    }
    /**
     * Gets the deviceComplianceScripts property value. The list of device compliance scripts associated with the tenant.
     * @return a deviceComplianceScript
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceComplianceScript> getDeviceComplianceScripts() {
        return this._deviceComplianceScripts;
    }
    /**
     * Gets the deviceConfigurationConflictSummary property value. Summary of policies in conflict state for this account.
     * @return a deviceConfigurationConflictSummary
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceConfigurationConflictSummary> getDeviceConfigurationConflictSummary() {
        return this._deviceConfigurationConflictSummary;
    }
    /**
     * Gets the deviceConfigurationDeviceStateSummaries property value. The device configuration device state summary for this account.
     * @return a deviceConfigurationDeviceStateSummary
     */
    @javax.annotation.Nullable
    public DeviceConfigurationDeviceStateSummary getDeviceConfigurationDeviceStateSummaries() {
        return this._deviceConfigurationDeviceStateSummaries;
    }
    /**
     * Gets the deviceConfigurationRestrictedAppsViolations property value. Restricted apps violations for this account.
     * @return a restrictedAppsViolation
     */
    @javax.annotation.Nullable
    public java.util.List<RestrictedAppsViolation> getDeviceConfigurationRestrictedAppsViolations() {
        return this._deviceConfigurationRestrictedAppsViolations;
    }
    /**
     * Gets the deviceConfigurations property value. The device configurations.
     * @return a deviceConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceConfiguration> getDeviceConfigurations() {
        return this._deviceConfigurations;
    }
    /**
     * Gets the deviceConfigurationsAllManagedDeviceCertificateStates property value. Summary of all certificates for all devices.
     * @return a managedAllDeviceCertificateState
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedAllDeviceCertificateState> getDeviceConfigurationsAllManagedDeviceCertificateStates() {
        return this._deviceConfigurationsAllManagedDeviceCertificateStates;
    }
    /**
     * Gets the deviceConfigurationUserStateSummaries property value. The device configuration user state summary for this account.
     * @return a deviceConfigurationUserStateSummary
     */
    @javax.annotation.Nullable
    public DeviceConfigurationUserStateSummary getDeviceConfigurationUserStateSummaries() {
        return this._deviceConfigurationUserStateSummaries;
    }
    /**
     * Gets the deviceCustomAttributeShellScripts property value. The list of device custom attribute shell scripts associated with the tenant.
     * @return a deviceCustomAttributeShellScript
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceCustomAttributeShellScript> getDeviceCustomAttributeShellScripts() {
        return this._deviceCustomAttributeShellScripts;
    }
    /**
     * Gets the deviceEnrollmentConfigurations property value. The list of device enrollment configurations
     * @return a deviceEnrollmentConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceEnrollmentConfiguration> getDeviceEnrollmentConfigurations() {
        return this._deviceEnrollmentConfigurations;
    }
    /**
     * Gets the deviceHealthScripts property value. The list of device health scripts associated with the tenant.
     * @return a deviceHealthScript
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceHealthScript> getDeviceHealthScripts() {
        return this._deviceHealthScripts;
    }
    /**
     * Gets the deviceManagementPartners property value. The list of Device Management Partners configured by the tenant.
     * @return a deviceManagementPartner
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementPartner> getDeviceManagementPartners() {
        return this._deviceManagementPartners;
    }
    /**
     * Gets the deviceManagementScripts property value. The list of device management scripts associated with the tenant.
     * @return a deviceManagementScript
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementScript> getDeviceManagementScripts() {
        return this._deviceManagementScripts;
    }
    /**
     * Gets the deviceProtectionOverview property value. Device protection overview.
     * @return a deviceProtectionOverview
     */
    @javax.annotation.Nullable
    public DeviceProtectionOverview getDeviceProtectionOverview() {
        return this._deviceProtectionOverview;
    }
    /**
     * Gets the deviceShellScripts property value. The list of device shell scripts associated with the tenant.
     * @return a deviceShellScript
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceShellScript> getDeviceShellScripts() {
        return this._deviceShellScripts;
    }
    /**
     * Gets the domainJoinConnectors property value. A list of connector objects.
     * @return a deviceManagementDomainJoinConnector
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementDomainJoinConnector> getDomainJoinConnectors() {
        return this._domainJoinConnectors;
    }
    /**
     * Gets the embeddedSIMActivationCodePools property value. The embedded SIM activation code pools created by this account.
     * @return a embeddedSIMActivationCodePool
     */
    @javax.annotation.Nullable
    public java.util.List<EmbeddedSIMActivationCodePool> getEmbeddedSIMActivationCodePools() {
        return this._embeddedSIMActivationCodePools;
    }
    /**
     * Gets the exchangeConnectors property value. The list of Exchange Connectors configured by the tenant.
     * @return a deviceManagementExchangeConnector
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementExchangeConnector> getExchangeConnectors() {
        return this._exchangeConnectors;
    }
    /**
     * Gets the exchangeOnPremisesPolicies property value. The list of Exchange On Premisis policies configured by the tenant.
     * @return a deviceManagementExchangeOnPremisesPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementExchangeOnPremisesPolicy> getExchangeOnPremisesPolicies() {
        return this._exchangeOnPremisesPolicies;
    }
    /**
     * Gets the exchangeOnPremisesPolicy property value. The policy which controls mobile device access to Exchange On Premises
     * @return a deviceManagementExchangeOnPremisesPolicy
     */
    @javax.annotation.Nullable
    public DeviceManagementExchangeOnPremisesPolicy getExchangeOnPremisesPolicy() {
        return this._exchangeOnPremisesPolicy;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagement currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("accountMoveCompletionDateTime", (n) -> { currentObject.setAccountMoveCompletionDateTime(n.getOffsetDateTimeValue()); });
            this.put("adminConsent", (n) -> { currentObject.setAdminConsent(n.getObjectValue(AdminConsent::createFromDiscriminatorValue)); });
            this.put("advancedThreatProtectionOnboardingStateSummary", (n) -> { currentObject.setAdvancedThreatProtectionOnboardingStateSummary(n.getObjectValue(AdvancedThreatProtectionOnboardingStateSummary::createFromDiscriminatorValue)); });
            this.put("androidDeviceOwnerEnrollmentProfiles", (n) -> { currentObject.setAndroidDeviceOwnerEnrollmentProfiles(n.getCollectionOfObjectValues(AndroidDeviceOwnerEnrollmentProfile::createFromDiscriminatorValue)); });
            this.put("androidForWorkAppConfigurationSchemas", (n) -> { currentObject.setAndroidForWorkAppConfigurationSchemas(n.getCollectionOfObjectValues(AndroidForWorkAppConfigurationSchema::createFromDiscriminatorValue)); });
            this.put("androidForWorkEnrollmentProfiles", (n) -> { currentObject.setAndroidForWorkEnrollmentProfiles(n.getCollectionOfObjectValues(AndroidForWorkEnrollmentProfile::createFromDiscriminatorValue)); });
            this.put("androidForWorkSettings", (n) -> { currentObject.setAndroidForWorkSettings(n.getObjectValue(AndroidForWorkSettings::createFromDiscriminatorValue)); });
            this.put("androidManagedStoreAccountEnterpriseSettings", (n) -> { currentObject.setAndroidManagedStoreAccountEnterpriseSettings(n.getObjectValue(AndroidManagedStoreAccountEnterpriseSettings::createFromDiscriminatorValue)); });
            this.put("androidManagedStoreAppConfigurationSchemas", (n) -> { currentObject.setAndroidManagedStoreAppConfigurationSchemas(n.getCollectionOfObjectValues(AndroidManagedStoreAppConfigurationSchema::createFromDiscriminatorValue)); });
            this.put("applePushNotificationCertificate", (n) -> { currentObject.setApplePushNotificationCertificate(n.getObjectValue(ApplePushNotificationCertificate::createFromDiscriminatorValue)); });
            this.put("appleUserInitiatedEnrollmentProfiles", (n) -> { currentObject.setAppleUserInitiatedEnrollmentProfiles(n.getCollectionOfObjectValues(AppleUserInitiatedEnrollmentProfile::createFromDiscriminatorValue)); });
            this.put("assignmentFilters", (n) -> { currentObject.setAssignmentFilters(n.getCollectionOfObjectValues(DeviceAndAppManagementAssignmentFilter::createFromDiscriminatorValue)); });
            this.put("auditEvents", (n) -> { currentObject.setAuditEvents(n.getCollectionOfObjectValues(AuditEvent::createFromDiscriminatorValue)); });
            this.put("autopilotEvents", (n) -> { currentObject.setAutopilotEvents(n.getCollectionOfObjectValues(DeviceManagementAutopilotEvent::createFromDiscriminatorValue)); });
            this.put("cartToClassAssociations", (n) -> { currentObject.setCartToClassAssociations(n.getCollectionOfObjectValues(CartToClassAssociation::createFromDiscriminatorValue)); });
            this.put("categories", (n) -> { currentObject.setCategories(n.getCollectionOfObjectValues(DeviceManagementSettingCategory::createFromDiscriminatorValue)); });
            this.put("certificateConnectorDetails", (n) -> { currentObject.setCertificateConnectorDetails(n.getCollectionOfObjectValues(CertificateConnectorDetails::createFromDiscriminatorValue)); });
            this.put("chromeOSOnboardingSettings", (n) -> { currentObject.setChromeOSOnboardingSettings(n.getCollectionOfObjectValues(ChromeOSOnboardingSettings::createFromDiscriminatorValue)); });
            this.put("cloudPCConnectivityIssues", (n) -> { currentObject.setCloudPCConnectivityIssues(n.getCollectionOfObjectValues(CloudPCConnectivityIssue::createFromDiscriminatorValue)); });
            this.put("comanagedDevices", (n) -> { currentObject.setComanagedDevices(n.getCollectionOfObjectValues(ManagedDevice::createFromDiscriminatorValue)); });
            this.put("comanagementEligibleDevices", (n) -> { currentObject.setComanagementEligibleDevices(n.getCollectionOfObjectValues(ComanagementEligibleDevice::createFromDiscriminatorValue)); });
            this.put("complianceCategories", (n) -> { currentObject.setComplianceCategories(n.getCollectionOfObjectValues(DeviceManagementConfigurationCategory::createFromDiscriminatorValue)); });
            this.put("complianceManagementPartners", (n) -> { currentObject.setComplianceManagementPartners(n.getCollectionOfObjectValues(ComplianceManagementPartner::createFromDiscriminatorValue)); });
            this.put("compliancePolicies", (n) -> { currentObject.setCompliancePolicies(n.getCollectionOfObjectValues(DeviceManagementCompliancePolicy::createFromDiscriminatorValue)); });
            this.put("complianceSettings", (n) -> { currentObject.setComplianceSettings(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingDefinition::createFromDiscriminatorValue)); });
            this.put("conditionalAccessSettings", (n) -> { currentObject.setConditionalAccessSettings(n.getObjectValue(OnPremisesConditionalAccessSettings::createFromDiscriminatorValue)); });
            this.put("configManagerCollections", (n) -> { currentObject.setConfigManagerCollections(n.getCollectionOfObjectValues(ConfigManagerCollection::createFromDiscriminatorValue)); });
            this.put("configurationCategories", (n) -> { currentObject.setConfigurationCategories(n.getCollectionOfObjectValues(DeviceManagementConfigurationCategory::createFromDiscriminatorValue)); });
            this.put("configurationPolicies", (n) -> { currentObject.setConfigurationPolicies(n.getCollectionOfObjectValues(DeviceManagementConfigurationPolicy::createFromDiscriminatorValue)); });
            this.put("configurationPolicyTemplates", (n) -> { currentObject.setConfigurationPolicyTemplates(n.getCollectionOfObjectValues(DeviceManagementConfigurationPolicyTemplate::createFromDiscriminatorValue)); });
            this.put("configurationSettings", (n) -> { currentObject.setConfigurationSettings(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingDefinition::createFromDiscriminatorValue)); });
            this.put("dataSharingConsents", (n) -> { currentObject.setDataSharingConsents(n.getCollectionOfObjectValues(DataSharingConsent::createFromDiscriminatorValue)); });
            this.put("depOnboardingSettings", (n) -> { currentObject.setDepOnboardingSettings(n.getCollectionOfObjectValues(DepOnboardingSetting::createFromDiscriminatorValue)); });
            this.put("derivedCredentials", (n) -> { currentObject.setDerivedCredentials(n.getCollectionOfObjectValues(DeviceManagementDerivedCredentialSettings::createFromDiscriminatorValue)); });
            this.put("detectedApps", (n) -> { currentObject.setDetectedApps(n.getCollectionOfObjectValues(DetectedApp::createFromDiscriminatorValue)); });
            this.put("deviceCategories", (n) -> { currentObject.setDeviceCategories(n.getCollectionOfObjectValues(DeviceCategory::createFromDiscriminatorValue)); });
            this.put("deviceCompliancePolicies", (n) -> { currentObject.setDeviceCompliancePolicies(n.getCollectionOfObjectValues(DeviceCompliancePolicy::createFromDiscriminatorValue)); });
            this.put("deviceCompliancePolicyDeviceStateSummary", (n) -> { currentObject.setDeviceCompliancePolicyDeviceStateSummary(n.getObjectValue(DeviceCompliancePolicyDeviceStateSummary::createFromDiscriminatorValue)); });
            this.put("deviceCompliancePolicySettingStateSummaries", (n) -> { currentObject.setDeviceCompliancePolicySettingStateSummaries(n.getCollectionOfObjectValues(DeviceCompliancePolicySettingStateSummary::createFromDiscriminatorValue)); });
            this.put("deviceComplianceReportSummarizationDateTime", (n) -> { currentObject.setDeviceComplianceReportSummarizationDateTime(n.getOffsetDateTimeValue()); });
            this.put("deviceComplianceScripts", (n) -> { currentObject.setDeviceComplianceScripts(n.getCollectionOfObjectValues(DeviceComplianceScript::createFromDiscriminatorValue)); });
            this.put("deviceConfigurationConflictSummary", (n) -> { currentObject.setDeviceConfigurationConflictSummary(n.getCollectionOfObjectValues(DeviceConfigurationConflictSummary::createFromDiscriminatorValue)); });
            this.put("deviceConfigurationDeviceStateSummaries", (n) -> { currentObject.setDeviceConfigurationDeviceStateSummaries(n.getObjectValue(DeviceConfigurationDeviceStateSummary::createFromDiscriminatorValue)); });
            this.put("deviceConfigurationRestrictedAppsViolations", (n) -> { currentObject.setDeviceConfigurationRestrictedAppsViolations(n.getCollectionOfObjectValues(RestrictedAppsViolation::createFromDiscriminatorValue)); });
            this.put("deviceConfigurations", (n) -> { currentObject.setDeviceConfigurations(n.getCollectionOfObjectValues(DeviceConfiguration::createFromDiscriminatorValue)); });
            this.put("deviceConfigurationsAllManagedDeviceCertificateStates", (n) -> { currentObject.setDeviceConfigurationsAllManagedDeviceCertificateStates(n.getCollectionOfObjectValues(ManagedAllDeviceCertificateState::createFromDiscriminatorValue)); });
            this.put("deviceConfigurationUserStateSummaries", (n) -> { currentObject.setDeviceConfigurationUserStateSummaries(n.getObjectValue(DeviceConfigurationUserStateSummary::createFromDiscriminatorValue)); });
            this.put("deviceCustomAttributeShellScripts", (n) -> { currentObject.setDeviceCustomAttributeShellScripts(n.getCollectionOfObjectValues(DeviceCustomAttributeShellScript::createFromDiscriminatorValue)); });
            this.put("deviceEnrollmentConfigurations", (n) -> { currentObject.setDeviceEnrollmentConfigurations(n.getCollectionOfObjectValues(DeviceEnrollmentConfiguration::createFromDiscriminatorValue)); });
            this.put("deviceHealthScripts", (n) -> { currentObject.setDeviceHealthScripts(n.getCollectionOfObjectValues(DeviceHealthScript::createFromDiscriminatorValue)); });
            this.put("deviceManagementPartners", (n) -> { currentObject.setDeviceManagementPartners(n.getCollectionOfObjectValues(DeviceManagementPartner::createFromDiscriminatorValue)); });
            this.put("deviceManagementScripts", (n) -> { currentObject.setDeviceManagementScripts(n.getCollectionOfObjectValues(DeviceManagementScript::createFromDiscriminatorValue)); });
            this.put("deviceProtectionOverview", (n) -> { currentObject.setDeviceProtectionOverview(n.getObjectValue(DeviceProtectionOverview::createFromDiscriminatorValue)); });
            this.put("deviceShellScripts", (n) -> { currentObject.setDeviceShellScripts(n.getCollectionOfObjectValues(DeviceShellScript::createFromDiscriminatorValue)); });
            this.put("domainJoinConnectors", (n) -> { currentObject.setDomainJoinConnectors(n.getCollectionOfObjectValues(DeviceManagementDomainJoinConnector::createFromDiscriminatorValue)); });
            this.put("embeddedSIMActivationCodePools", (n) -> { currentObject.setEmbeddedSIMActivationCodePools(n.getCollectionOfObjectValues(EmbeddedSIMActivationCodePool::createFromDiscriminatorValue)); });
            this.put("exchangeConnectors", (n) -> { currentObject.setExchangeConnectors(n.getCollectionOfObjectValues(DeviceManagementExchangeConnector::createFromDiscriminatorValue)); });
            this.put("exchangeOnPremisesPolicies", (n) -> { currentObject.setExchangeOnPremisesPolicies(n.getCollectionOfObjectValues(DeviceManagementExchangeOnPremisesPolicy::createFromDiscriminatorValue)); });
            this.put("exchangeOnPremisesPolicy", (n) -> { currentObject.setExchangeOnPremisesPolicy(n.getObjectValue(DeviceManagementExchangeOnPremisesPolicy::createFromDiscriminatorValue)); });
            this.put("groupPolicyCategories", (n) -> { currentObject.setGroupPolicyCategories(n.getCollectionOfObjectValues(GroupPolicyCategory::createFromDiscriminatorValue)); });
            this.put("groupPolicyConfigurations", (n) -> { currentObject.setGroupPolicyConfigurations(n.getCollectionOfObjectValues(GroupPolicyConfiguration::createFromDiscriminatorValue)); });
            this.put("groupPolicyDefinitionFiles", (n) -> { currentObject.setGroupPolicyDefinitionFiles(n.getCollectionOfObjectValues(GroupPolicyDefinitionFile::createFromDiscriminatorValue)); });
            this.put("groupPolicyDefinitions", (n) -> { currentObject.setGroupPolicyDefinitions(n.getCollectionOfObjectValues(GroupPolicyDefinition::createFromDiscriminatorValue)); });
            this.put("groupPolicyMigrationReports", (n) -> { currentObject.setGroupPolicyMigrationReports(n.getCollectionOfObjectValues(GroupPolicyMigrationReport::createFromDiscriminatorValue)); });
            this.put("groupPolicyObjectFiles", (n) -> { currentObject.setGroupPolicyObjectFiles(n.getCollectionOfObjectValues(GroupPolicyObjectFile::createFromDiscriminatorValue)); });
            this.put("groupPolicyUploadedDefinitionFiles", (n) -> { currentObject.setGroupPolicyUploadedDefinitionFiles(n.getCollectionOfObjectValues(GroupPolicyUploadedDefinitionFile::createFromDiscriminatorValue)); });
            this.put("importedDeviceIdentities", (n) -> { currentObject.setImportedDeviceIdentities(n.getCollectionOfObjectValues(ImportedDeviceIdentity::createFromDiscriminatorValue)); });
            this.put("importedWindowsAutopilotDeviceIdentities", (n) -> { currentObject.setImportedWindowsAutopilotDeviceIdentities(n.getCollectionOfObjectValues(ImportedWindowsAutopilotDeviceIdentity::createFromDiscriminatorValue)); });
            this.put("intents", (n) -> { currentObject.setIntents(n.getCollectionOfObjectValues(DeviceManagementIntent::createFromDiscriminatorValue)); });
            this.put("intuneAccountId", (n) -> { currentObject.setIntuneAccountId(n.getStringValue()); });
            this.put("intuneBrand", (n) -> { currentObject.setIntuneBrand(n.getObjectValue(IntuneBrand::createFromDiscriminatorValue)); });
            this.put("intuneBrandingProfiles", (n) -> { currentObject.setIntuneBrandingProfiles(n.getCollectionOfObjectValues(IntuneBrandingProfile::createFromDiscriminatorValue)); });
            this.put("iosUpdateStatuses", (n) -> { currentObject.setIosUpdateStatuses(n.getCollectionOfObjectValues(IosUpdateDeviceStatus::createFromDiscriminatorValue)); });
            this.put("lastReportAggregationDateTime", (n) -> { currentObject.setLastReportAggregationDateTime(n.getOffsetDateTimeValue()); });
            this.put("legacyPcManangementEnabled", (n) -> { currentObject.setLegacyPcManangementEnabled(n.getBooleanValue()); });
            this.put("macOSSoftwareUpdateAccountSummaries", (n) -> { currentObject.setMacOSSoftwareUpdateAccountSummaries(n.getCollectionOfObjectValues(MacOSSoftwareUpdateAccountSummary::createFromDiscriminatorValue)); });
            this.put("managedDeviceCleanupSettings", (n) -> { currentObject.setManagedDeviceCleanupSettings(n.getObjectValue(ManagedDeviceCleanupSettings::createFromDiscriminatorValue)); });
            this.put("managedDeviceEncryptionStates", (n) -> { currentObject.setManagedDeviceEncryptionStates(n.getCollectionOfObjectValues(ManagedDeviceEncryptionState::createFromDiscriminatorValue)); });
            this.put("managedDeviceOverview", (n) -> { currentObject.setManagedDeviceOverview(n.getObjectValue(ManagedDeviceOverview::createFromDiscriminatorValue)); });
            this.put("managedDevices", (n) -> { currentObject.setManagedDevices(n.getCollectionOfObjectValues(ManagedDevice::createFromDiscriminatorValue)); });
            this.put("maximumDepTokens", (n) -> { currentObject.setMaximumDepTokens(n.getIntegerValue()); });
            this.put("microsoftTunnelConfigurations", (n) -> { currentObject.setMicrosoftTunnelConfigurations(n.getCollectionOfObjectValues(MicrosoftTunnelConfiguration::createFromDiscriminatorValue)); });
            this.put("microsoftTunnelHealthThresholds", (n) -> { currentObject.setMicrosoftTunnelHealthThresholds(n.getCollectionOfObjectValues(MicrosoftTunnelHealthThreshold::createFromDiscriminatorValue)); });
            this.put("microsoftTunnelServerLogCollectionResponses", (n) -> { currentObject.setMicrosoftTunnelServerLogCollectionResponses(n.getCollectionOfObjectValues(MicrosoftTunnelServerLogCollectionResponse::createFromDiscriminatorValue)); });
            this.put("microsoftTunnelSites", (n) -> { currentObject.setMicrosoftTunnelSites(n.getCollectionOfObjectValues(MicrosoftTunnelSite::createFromDiscriminatorValue)); });
            this.put("mobileAppTroubleshootingEvents", (n) -> { currentObject.setMobileAppTroubleshootingEvents(n.getCollectionOfObjectValues(MobileAppTroubleshootingEvent::createFromDiscriminatorValue)); });
            this.put("mobileThreatDefenseConnectors", (n) -> { currentObject.setMobileThreatDefenseConnectors(n.getCollectionOfObjectValues(MobileThreatDefenseConnector::createFromDiscriminatorValue)); });
            this.put("ndesConnectors", (n) -> { currentObject.setNdesConnectors(n.getCollectionOfObjectValues(NdesConnector::createFromDiscriminatorValue)); });
            this.put("notificationMessageTemplates", (n) -> { currentObject.setNotificationMessageTemplates(n.getCollectionOfObjectValues(NotificationMessageTemplate::createFromDiscriminatorValue)); });
            this.put("oemWarrantyInformationOnboarding", (n) -> { currentObject.setOemWarrantyInformationOnboarding(n.getCollectionOfObjectValues(OemWarrantyInformationOnboarding::createFromDiscriminatorValue)); });
            this.put("remoteActionAudits", (n) -> { currentObject.setRemoteActionAudits(n.getCollectionOfObjectValues(RemoteActionAudit::createFromDiscriminatorValue)); });
            this.put("remoteAssistancePartners", (n) -> { currentObject.setRemoteAssistancePartners(n.getCollectionOfObjectValues(RemoteAssistancePartner::createFromDiscriminatorValue)); });
            this.put("remoteAssistanceSettings", (n) -> { currentObject.setRemoteAssistanceSettings(n.getObjectValue(RemoteAssistanceSettings::createFromDiscriminatorValue)); });
            this.put("reports", (n) -> { currentObject.setReports(n.getObjectValue(DeviceManagementReports::createFromDiscriminatorValue)); });
            this.put("resourceAccessProfiles", (n) -> { currentObject.setResourceAccessProfiles(n.getCollectionOfObjectValues(DeviceManagementResourceAccessProfileBase::createFromDiscriminatorValue)); });
            this.put("resourceOperations", (n) -> { currentObject.setResourceOperations(n.getCollectionOfObjectValues(ResourceOperation::createFromDiscriminatorValue)); });
            this.put("reusablePolicySettings", (n) -> { currentObject.setReusablePolicySettings(n.getCollectionOfObjectValues(DeviceManagementReusablePolicySetting::createFromDiscriminatorValue)); });
            this.put("reusableSettings", (n) -> { currentObject.setReusableSettings(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingDefinition::createFromDiscriminatorValue)); });
            this.put("roleAssignments", (n) -> { currentObject.setRoleAssignments(n.getCollectionOfObjectValues(DeviceAndAppManagementRoleAssignment::createFromDiscriminatorValue)); });
            this.put("roleDefinitions", (n) -> { currentObject.setRoleDefinitions(n.getCollectionOfObjectValues(RoleDefinition::createFromDiscriminatorValue)); });
            this.put("roleScopeTags", (n) -> { currentObject.setRoleScopeTags(n.getCollectionOfObjectValues(RoleScopeTag::createFromDiscriminatorValue)); });
            this.put("settingDefinitions", (n) -> { currentObject.setSettingDefinitions(n.getCollectionOfObjectValues(DeviceManagementSettingDefinition::createFromDiscriminatorValue)); });
            this.put("settings", (n) -> { currentObject.setSettings(n.getObjectValue(DeviceManagementSettings::createFromDiscriminatorValue)); });
            this.put("softwareUpdateStatusSummary", (n) -> { currentObject.setSoftwareUpdateStatusSummary(n.getObjectValue(SoftwareUpdateStatusSummary::createFromDiscriminatorValue)); });
            this.put("subscriptions", (n) -> { currentObject.setSubscriptions(n.getEnumValue(DeviceManagementSubscriptions.class)); });
            this.put("subscriptionState", (n) -> { currentObject.setSubscriptionState(n.getEnumValue(DeviceManagementSubscriptionState.class)); });
            this.put("telecomExpenseManagementPartners", (n) -> { currentObject.setTelecomExpenseManagementPartners(n.getCollectionOfObjectValues(TelecomExpenseManagementPartner::createFromDiscriminatorValue)); });
            this.put("templates", (n) -> { currentObject.setTemplates(n.getCollectionOfObjectValues(DeviceManagementTemplate::createFromDiscriminatorValue)); });
            this.put("templateSettings", (n) -> { currentObject.setTemplateSettings(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingTemplate::createFromDiscriminatorValue)); });
            this.put("tenantAttachRBAC", (n) -> { currentObject.setTenantAttachRBAC(n.getObjectValue(TenantAttachRBAC::createFromDiscriminatorValue)); });
            this.put("termsAndConditions", (n) -> { currentObject.setTermsAndConditions(n.getCollectionOfObjectValues(TermsAndConditions::createFromDiscriminatorValue)); });
            this.put("troubleshootingEvents", (n) -> { currentObject.setTroubleshootingEvents(n.getCollectionOfObjectValues(DeviceManagementTroubleshootingEvent::createFromDiscriminatorValue)); });
            this.put("unlicensedAdminstratorsEnabled", (n) -> { currentObject.setUnlicensedAdminstratorsEnabled(n.getBooleanValue()); });
            this.put("userExperienceAnalyticsAppHealthApplicationPerformance", (n) -> { currentObject.setUserExperienceAnalyticsAppHealthApplicationPerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthApplicationPerformance::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion", (n) -> { currentObject.setUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails", (n) -> { currentObject.setUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId", (n) -> { currentObject.setUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion", (n) -> { currentObject.setUserExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsAppHealthDeviceModelPerformance", (n) -> { currentObject.setUserExperienceAnalyticsAppHealthDeviceModelPerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthDeviceModelPerformance::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsAppHealthDevicePerformance", (n) -> { currentObject.setUserExperienceAnalyticsAppHealthDevicePerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthDevicePerformance::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsAppHealthDevicePerformanceDetails", (n) -> { currentObject.setUserExperienceAnalyticsAppHealthDevicePerformanceDetails(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthDevicePerformanceDetails::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsAppHealthOSVersionPerformance", (n) -> { currentObject.setUserExperienceAnalyticsAppHealthOSVersionPerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthOSVersionPerformance::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsAppHealthOverview", (n) -> { currentObject.setUserExperienceAnalyticsAppHealthOverview(n.getObjectValue(UserExperienceAnalyticsCategory::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsBaselines", (n) -> { currentObject.setUserExperienceAnalyticsBaselines(n.getCollectionOfObjectValues(UserExperienceAnalyticsBaseline::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsBatteryHealthAppImpact", (n) -> { currentObject.setUserExperienceAnalyticsBatteryHealthAppImpact(n.getCollectionOfObjectValues(UserExperienceAnalyticsBatteryHealthAppImpact::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsBatteryHealthCapacityDetails", (n) -> { currentObject.setUserExperienceAnalyticsBatteryHealthCapacityDetails(n.getObjectValue(UserExperienceAnalyticsBatteryHealthCapacityDetails::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsBatteryHealthDeviceAppImpact", (n) -> { currentObject.setUserExperienceAnalyticsBatteryHealthDeviceAppImpact(n.getCollectionOfObjectValues(UserExperienceAnalyticsBatteryHealthDeviceAppImpact::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsBatteryHealthDevicePerformance", (n) -> { currentObject.setUserExperienceAnalyticsBatteryHealthDevicePerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsBatteryHealthDevicePerformance::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsBatteryHealthDeviceRuntimeHistory", (n) -> { currentObject.setUserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory(n.getCollectionOfObjectValues(UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsBatteryHealthModelPerformance", (n) -> { currentObject.setUserExperienceAnalyticsBatteryHealthModelPerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsBatteryHealthModelPerformance::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsBatteryHealthOsPerformance", (n) -> { currentObject.setUserExperienceAnalyticsBatteryHealthOsPerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsBatteryHealthOsPerformance::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsBatteryHealthRuntimeDetails", (n) -> { currentObject.setUserExperienceAnalyticsBatteryHealthRuntimeDetails(n.getObjectValue(UserExperienceAnalyticsBatteryHealthRuntimeDetails::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsCategories", (n) -> { currentObject.setUserExperienceAnalyticsCategories(n.getCollectionOfObjectValues(UserExperienceAnalyticsCategory::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsDeviceMetricHistory", (n) -> { currentObject.setUserExperienceAnalyticsDeviceMetricHistory(n.getCollectionOfObjectValues(UserExperienceAnalyticsMetricHistory::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsDevicePerformance", (n) -> { currentObject.setUserExperienceAnalyticsDevicePerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsDevicePerformance::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsDeviceScope", (n) -> { currentObject.setUserExperienceAnalyticsDeviceScope(n.getObjectValue(UserExperienceAnalyticsDeviceScope::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsDeviceScopes", (n) -> { currentObject.setUserExperienceAnalyticsDeviceScopes(n.getCollectionOfObjectValues(UserExperienceAnalyticsDeviceScope::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsDeviceScores", (n) -> { currentObject.setUserExperienceAnalyticsDeviceScores(n.getCollectionOfObjectValues(UserExperienceAnalyticsDeviceScores::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsDeviceStartupHistory", (n) -> { currentObject.setUserExperienceAnalyticsDeviceStartupHistory(n.getCollectionOfObjectValues(UserExperienceAnalyticsDeviceStartupHistory::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsDeviceStartupProcesses", (n) -> { currentObject.setUserExperienceAnalyticsDeviceStartupProcesses(n.getCollectionOfObjectValues(UserExperienceAnalyticsDeviceStartupProcess::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsDeviceStartupProcessPerformance", (n) -> { currentObject.setUserExperienceAnalyticsDeviceStartupProcessPerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsDeviceStartupProcessPerformance::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsDevicesWithoutCloudIdentity", (n) -> { currentObject.setUserExperienceAnalyticsDevicesWithoutCloudIdentity(n.getCollectionOfObjectValues(UserExperienceAnalyticsDeviceWithoutCloudIdentity::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsImpactingProcess", (n) -> { currentObject.setUserExperienceAnalyticsImpactingProcess(n.getCollectionOfObjectValues(UserExperienceAnalyticsImpactingProcess::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsMetricHistory", (n) -> { currentObject.setUserExperienceAnalyticsMetricHistory(n.getCollectionOfObjectValues(UserExperienceAnalyticsMetricHistory::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsModelScores", (n) -> { currentObject.setUserExperienceAnalyticsModelScores(n.getCollectionOfObjectValues(UserExperienceAnalyticsModelScores::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsNotAutopilotReadyDevice", (n) -> { currentObject.setUserExperienceAnalyticsNotAutopilotReadyDevice(n.getCollectionOfObjectValues(UserExperienceAnalyticsNotAutopilotReadyDevice::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsOverview", (n) -> { currentObject.setUserExperienceAnalyticsOverview(n.getObjectValue(UserExperienceAnalyticsOverview::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsRegressionSummary", (n) -> { currentObject.setUserExperienceAnalyticsRegressionSummary(n.getObjectValue(UserExperienceAnalyticsRegressionSummary::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsRemoteConnection", (n) -> { currentObject.setUserExperienceAnalyticsRemoteConnection(n.getCollectionOfObjectValues(UserExperienceAnalyticsRemoteConnection::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsResourcePerformance", (n) -> { currentObject.setUserExperienceAnalyticsResourcePerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsResourcePerformance::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsScoreHistory", (n) -> { currentObject.setUserExperienceAnalyticsScoreHistory(n.getCollectionOfObjectValues(UserExperienceAnalyticsScoreHistory::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsSettings", (n) -> { currentObject.setUserExperienceAnalyticsSettings(n.getObjectValue(UserExperienceAnalyticsSettings::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric", (n) -> { currentObject.setUserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric(n.getObjectValue(UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsWorkFromAnywhereMetrics", (n) -> { currentObject.setUserExperienceAnalyticsWorkFromAnywhereMetrics(n.getCollectionOfObjectValues(UserExperienceAnalyticsWorkFromAnywhereMetric::createFromDiscriminatorValue)); });
            this.put("userExperienceAnalyticsWorkFromAnywhereModelPerformance", (n) -> { currentObject.setUserExperienceAnalyticsWorkFromAnywhereModelPerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsWorkFromAnywhereModelPerformance::createFromDiscriminatorValue)); });
            this.put("userPfxCertificates", (n) -> { currentObject.setUserPfxCertificates(n.getCollectionOfObjectValues(UserPFXCertificate::createFromDiscriminatorValue)); });
            this.put("virtualEndpoint", (n) -> { currentObject.setVirtualEndpoint(n.getObjectValue(VirtualEndpoint::createFromDiscriminatorValue)); });
            this.put("windowsAutopilotDeploymentProfiles", (n) -> { currentObject.setWindowsAutopilotDeploymentProfiles(n.getCollectionOfObjectValues(WindowsAutopilotDeploymentProfile::createFromDiscriminatorValue)); });
            this.put("windowsAutopilotDeviceIdentities", (n) -> { currentObject.setWindowsAutopilotDeviceIdentities(n.getCollectionOfObjectValues(WindowsAutopilotDeviceIdentity::createFromDiscriminatorValue)); });
            this.put("windowsAutopilotSettings", (n) -> { currentObject.setWindowsAutopilotSettings(n.getObjectValue(WindowsAutopilotSettings::createFromDiscriminatorValue)); });
            this.put("windowsDriverUpdateProfiles", (n) -> { currentObject.setWindowsDriverUpdateProfiles(n.getCollectionOfObjectValues(WindowsDriverUpdateProfile::createFromDiscriminatorValue)); });
            this.put("windowsFeatureUpdateProfiles", (n) -> { currentObject.setWindowsFeatureUpdateProfiles(n.getCollectionOfObjectValues(WindowsFeatureUpdateProfile::createFromDiscriminatorValue)); });
            this.put("windowsInformationProtectionAppLearningSummaries", (n) -> { currentObject.setWindowsInformationProtectionAppLearningSummaries(n.getCollectionOfObjectValues(WindowsInformationProtectionAppLearningSummary::createFromDiscriminatorValue)); });
            this.put("windowsInformationProtectionNetworkLearningSummaries", (n) -> { currentObject.setWindowsInformationProtectionNetworkLearningSummaries(n.getCollectionOfObjectValues(WindowsInformationProtectionNetworkLearningSummary::createFromDiscriminatorValue)); });
            this.put("windowsMalwareInformation", (n) -> { currentObject.setWindowsMalwareInformation(n.getCollectionOfObjectValues(WindowsMalwareInformation::createFromDiscriminatorValue)); });
            this.put("windowsMalwareOverview", (n) -> { currentObject.setWindowsMalwareOverview(n.getObjectValue(WindowsMalwareOverview::createFromDiscriminatorValue)); });
            this.put("windowsQualityUpdateProfiles", (n) -> { currentObject.setWindowsQualityUpdateProfiles(n.getCollectionOfObjectValues(WindowsQualityUpdateProfile::createFromDiscriminatorValue)); });
            this.put("windowsUpdateCatalogItems", (n) -> { currentObject.setWindowsUpdateCatalogItems(n.getCollectionOfObjectValues(WindowsUpdateCatalogItem::createFromDiscriminatorValue)); });
            this.put("zebraFotaArtifacts", (n) -> { currentObject.setZebraFotaArtifacts(n.getCollectionOfObjectValues(ZebraFotaArtifact::createFromDiscriminatorValue)); });
            this.put("zebraFotaConnector", (n) -> { currentObject.setZebraFotaConnector(n.getObjectValue(ZebraFotaConnector::createFromDiscriminatorValue)); });
            this.put("zebraFotaDeployments", (n) -> { currentObject.setZebraFotaDeployments(n.getCollectionOfObjectValues(ZebraFotaDeployment::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the groupPolicyCategories property value. The available group policy categories for this account.
     * @return a groupPolicyCategory
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyCategory> getGroupPolicyCategories() {
        return this._groupPolicyCategories;
    }
    /**
     * Gets the groupPolicyConfigurations property value. The group policy configurations created by this account.
     * @return a groupPolicyConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyConfiguration> getGroupPolicyConfigurations() {
        return this._groupPolicyConfigurations;
    }
    /**
     * Gets the groupPolicyDefinitionFiles property value. The available group policy definition files for this account.
     * @return a groupPolicyDefinitionFile
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyDefinitionFile> getGroupPolicyDefinitionFiles() {
        return this._groupPolicyDefinitionFiles;
    }
    /**
     * Gets the groupPolicyDefinitions property value. The available group policy definitions for this account.
     * @return a groupPolicyDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyDefinition> getGroupPolicyDefinitions() {
        return this._groupPolicyDefinitions;
    }
    /**
     * Gets the groupPolicyMigrationReports property value. A list of Group Policy migration reports.
     * @return a groupPolicyMigrationReport
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyMigrationReport> getGroupPolicyMigrationReports() {
        return this._groupPolicyMigrationReports;
    }
    /**
     * Gets the groupPolicyObjectFiles property value. A list of Group Policy Object files uploaded.
     * @return a groupPolicyObjectFile
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyObjectFile> getGroupPolicyObjectFiles() {
        return this._groupPolicyObjectFiles;
    }
    /**
     * Gets the groupPolicyUploadedDefinitionFiles property value. The available group policy uploaded definition files for this account.
     * @return a groupPolicyUploadedDefinitionFile
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyUploadedDefinitionFile> getGroupPolicyUploadedDefinitionFiles() {
        return this._groupPolicyUploadedDefinitionFiles;
    }
    /**
     * Gets the importedDeviceIdentities property value. The imported device identities.
     * @return a importedDeviceIdentity
     */
    @javax.annotation.Nullable
    public java.util.List<ImportedDeviceIdentity> getImportedDeviceIdentities() {
        return this._importedDeviceIdentities;
    }
    /**
     * Gets the importedWindowsAutopilotDeviceIdentities property value. Collection of imported Windows autopilot devices.
     * @return a importedWindowsAutopilotDeviceIdentity
     */
    @javax.annotation.Nullable
    public java.util.List<ImportedWindowsAutopilotDeviceIdentity> getImportedWindowsAutopilotDeviceIdentities() {
        return this._importedWindowsAutopilotDeviceIdentities;
    }
    /**
     * Gets the intents property value. The device management intents
     * @return a deviceManagementIntent
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementIntent> getIntents() {
        return this._intents;
    }
    /**
     * Gets the intuneAccountId property value. Intune Account ID for given tenant
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIntuneAccountId() {
        return this._intuneAccountId;
    }
    /**
     * Gets the intuneBrand property value. intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the end user web portal.
     * @return a intuneBrand
     */
    @javax.annotation.Nullable
    public IntuneBrand getIntuneBrand() {
        return this._intuneBrand;
    }
    /**
     * Gets the intuneBrandingProfiles property value. Intune branding profiles targeted to AAD groups
     * @return a intuneBrandingProfile
     */
    @javax.annotation.Nullable
    public java.util.List<IntuneBrandingProfile> getIntuneBrandingProfiles() {
        return this._intuneBrandingProfiles;
    }
    /**
     * Gets the iosUpdateStatuses property value. The IOS software update installation statuses for this account.
     * @return a iosUpdateDeviceStatus
     */
    @javax.annotation.Nullable
    public java.util.List<IosUpdateDeviceStatus> getIosUpdateStatuses() {
        return this._iosUpdateStatuses;
    }
    /**
     * Gets the lastReportAggregationDateTime property value. The last modified time of reporting for this account. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastReportAggregationDateTime() {
        return this._lastReportAggregationDateTime;
    }
    /**
     * Gets the legacyPcManangementEnabled property value. The property to enable Non-MDM managed legacy PC management for this account. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLegacyPcManangementEnabled() {
        return this._legacyPcManangementEnabled;
    }
    /**
     * Gets the macOSSoftwareUpdateAccountSummaries property value. The MacOS software update account summaries for this account.
     * @return a macOSSoftwareUpdateAccountSummary
     */
    @javax.annotation.Nullable
    public java.util.List<MacOSSoftwareUpdateAccountSummary> getMacOSSoftwareUpdateAccountSummaries() {
        return this._macOSSoftwareUpdateAccountSummaries;
    }
    /**
     * Gets the managedDeviceCleanupSettings property value. Device cleanup rule
     * @return a managedDeviceCleanupSettings
     */
    @javax.annotation.Nullable
    public ManagedDeviceCleanupSettings getManagedDeviceCleanupSettings() {
        return this._managedDeviceCleanupSettings;
    }
    /**
     * Gets the managedDeviceEncryptionStates property value. Encryption report for devices in this account
     * @return a managedDeviceEncryptionState
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedDeviceEncryptionState> getManagedDeviceEncryptionStates() {
        return this._managedDeviceEncryptionStates;
    }
    /**
     * Gets the managedDeviceOverview property value. Device overview
     * @return a managedDeviceOverview
     */
    @javax.annotation.Nullable
    public ManagedDeviceOverview getManagedDeviceOverview() {
        return this._managedDeviceOverview;
    }
    /**
     * Gets the managedDevices property value. The list of managed devices.
     * @return a managedDevice
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedDevice> getManagedDevices() {
        return this._managedDevices;
    }
    /**
     * Gets the maximumDepTokens property value. Maximum number of DEP tokens allowed per-tenant.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaximumDepTokens() {
        return this._maximumDepTokens;
    }
    /**
     * Gets the microsoftTunnelConfigurations property value. Collection of MicrosoftTunnelConfiguration settings associated with account.
     * @return a microsoftTunnelConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<MicrosoftTunnelConfiguration> getMicrosoftTunnelConfigurations() {
        return this._microsoftTunnelConfigurations;
    }
    /**
     * Gets the microsoftTunnelHealthThresholds property value. Collection of MicrosoftTunnelHealthThreshold settings associated with account.
     * @return a microsoftTunnelHealthThreshold
     */
    @javax.annotation.Nullable
    public java.util.List<MicrosoftTunnelHealthThreshold> getMicrosoftTunnelHealthThresholds() {
        return this._microsoftTunnelHealthThresholds;
    }
    /**
     * Gets the microsoftTunnelServerLogCollectionResponses property value. Collection of MicrosoftTunnelServerLogCollectionResponse settings associated with account.
     * @return a microsoftTunnelServerLogCollectionResponse
     */
    @javax.annotation.Nullable
    public java.util.List<MicrosoftTunnelServerLogCollectionResponse> getMicrosoftTunnelServerLogCollectionResponses() {
        return this._microsoftTunnelServerLogCollectionResponses;
    }
    /**
     * Gets the microsoftTunnelSites property value. Collection of MicrosoftTunnelSite settings associated with account.
     * @return a microsoftTunnelSite
     */
    @javax.annotation.Nullable
    public java.util.List<MicrosoftTunnelSite> getMicrosoftTunnelSites() {
        return this._microsoftTunnelSites;
    }
    /**
     * Gets the mobileAppTroubleshootingEvents property value. The collection property of MobileAppTroubleshootingEvent.
     * @return a mobileAppTroubleshootingEvent
     */
    @javax.annotation.Nullable
    public java.util.List<MobileAppTroubleshootingEvent> getMobileAppTroubleshootingEvents() {
        return this._mobileAppTroubleshootingEvents;
    }
    /**
     * Gets the mobileThreatDefenseConnectors property value. The list of Mobile threat Defense connectors configured by the tenant.
     * @return a mobileThreatDefenseConnector
     */
    @javax.annotation.Nullable
    public java.util.List<MobileThreatDefenseConnector> getMobileThreatDefenseConnectors() {
        return this._mobileThreatDefenseConnectors;
    }
    /**
     * Gets the ndesConnectors property value. The collection of Ndes connectors for this account.
     * @return a ndesConnector
     */
    @javax.annotation.Nullable
    public java.util.List<NdesConnector> getNdesConnectors() {
        return this._ndesConnectors;
    }
    /**
     * Gets the notificationMessageTemplates property value. The Notification Message Templates.
     * @return a notificationMessageTemplate
     */
    @javax.annotation.Nullable
    public java.util.List<NotificationMessageTemplate> getNotificationMessageTemplates() {
        return this._notificationMessageTemplates;
    }
    /**
     * Gets the oemWarrantyInformationOnboarding property value. List of OEM Warranty Statuses
     * @return a oemWarrantyInformationOnboarding
     */
    @javax.annotation.Nullable
    public java.util.List<OemWarrantyInformationOnboarding> getOemWarrantyInformationOnboarding() {
        return this._oemWarrantyInformationOnboarding;
    }
    /**
     * Gets the remoteActionAudits property value. The list of device remote action audits with the tenant.
     * @return a remoteActionAudit
     */
    @javax.annotation.Nullable
    public java.util.List<RemoteActionAudit> getRemoteActionAudits() {
        return this._remoteActionAudits;
    }
    /**
     * Gets the remoteAssistancePartners property value. The remote assist partners.
     * @return a remoteAssistancePartner
     */
    @javax.annotation.Nullable
    public java.util.List<RemoteAssistancePartner> getRemoteAssistancePartners() {
        return this._remoteAssistancePartners;
    }
    /**
     * Gets the remoteAssistanceSettings property value. The remote assistance settings singleton
     * @return a remoteAssistanceSettings
     */
    @javax.annotation.Nullable
    public RemoteAssistanceSettings getRemoteAssistanceSettings() {
        return this._remoteAssistanceSettings;
    }
    /**
     * Gets the reports property value. Reports singleton
     * @return a deviceManagementReports
     */
    @javax.annotation.Nullable
    public DeviceManagementReports getReports() {
        return this._reports;
    }
    /**
     * Gets the resourceAccessProfiles property value. Collection of resource access settings associated with account.
     * @return a deviceManagementResourceAccessProfileBase
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementResourceAccessProfileBase> getResourceAccessProfiles() {
        return this._resourceAccessProfiles;
    }
    /**
     * Gets the resourceOperations property value. The Resource Operations.
     * @return a resourceOperation
     */
    @javax.annotation.Nullable
    public java.util.List<ResourceOperation> getResourceOperations() {
        return this._resourceOperations;
    }
    /**
     * Gets the reusablePolicySettings property value. List of all reusable settings that can be referred in a policy
     * @return a deviceManagementReusablePolicySetting
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementReusablePolicySetting> getReusablePolicySettings() {
        return this._reusablePolicySettings;
    }
    /**
     * Gets the reusableSettings property value. List of all reusable settings
     * @return a deviceManagementConfigurationSettingDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingDefinition> getReusableSettings() {
        return this._reusableSettings;
    }
    /**
     * Gets the roleAssignments property value. The Role Assignments.
     * @return a deviceAndAppManagementRoleAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceAndAppManagementRoleAssignment> getRoleAssignments() {
        return this._roleAssignments;
    }
    /**
     * Gets the roleDefinitions property value. The Role Definitions.
     * @return a roleDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<RoleDefinition> getRoleDefinitions() {
        return this._roleDefinitions;
    }
    /**
     * Gets the roleScopeTags property value. The Role Scope Tags.
     * @return a roleScopeTag
     */
    @javax.annotation.Nullable
    public java.util.List<RoleScopeTag> getRoleScopeTags() {
        return this._roleScopeTags;
    }
    /**
     * Gets the settingDefinitions property value. The device management intent setting definitions
     * @return a deviceManagementSettingDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementSettingDefinition> getSettingDefinitions() {
        return this._settingDefinitions;
    }
    /**
     * Gets the settings property value. Account level settings.
     * @return a deviceManagementSettings
     */
    @javax.annotation.Nullable
    public DeviceManagementSettings getSettings() {
        return this._settings;
    }
    /**
     * Gets the softwareUpdateStatusSummary property value. The software update status summary.
     * @return a softwareUpdateStatusSummary
     */
    @javax.annotation.Nullable
    public SoftwareUpdateStatusSummary getSoftwareUpdateStatusSummary() {
        return this._softwareUpdateStatusSummary;
    }
    /**
     * Gets the subscriptions property value. Tenant's Subscription. Possible values are: none, intune, office365, intunePremium, intune_EDU, intune_SMB.
     * @return a deviceManagementSubscriptions
     */
    @javax.annotation.Nullable
    public DeviceManagementSubscriptions getSubscriptions() {
        return this._subscriptions;
    }
    /**
     * Gets the subscriptionState property value. Tenant mobile device management subscription state. Possible values are: pending, active, warning, disabled, deleted, blocked, lockedOut.
     * @return a deviceManagementSubscriptionState
     */
    @javax.annotation.Nullable
    public DeviceManagementSubscriptionState getSubscriptionState() {
        return this._subscriptionState;
    }
    /**
     * Gets the telecomExpenseManagementPartners property value. The telecom expense management partners.
     * @return a telecomExpenseManagementPartner
     */
    @javax.annotation.Nullable
    public java.util.List<TelecomExpenseManagementPartner> getTelecomExpenseManagementPartners() {
        return this._telecomExpenseManagementPartners;
    }
    /**
     * Gets the templates property value. The available templates
     * @return a deviceManagementTemplate
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementTemplate> getTemplates() {
        return this._templates;
    }
    /**
     * Gets the templateSettings property value. List of all TemplateSettings
     * @return a deviceManagementConfigurationSettingTemplate
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingTemplate> getTemplateSettings() {
        return this._templateSettings;
    }
    /**
     * Gets the tenantAttachRBAC property value. TenantAttach RBAC Enablement
     * @return a tenantAttachRBAC
     */
    @javax.annotation.Nullable
    public TenantAttachRBAC getTenantAttachRBAC() {
        return this._tenantAttachRBAC;
    }
    /**
     * Gets the termsAndConditions property value. The terms and conditions associated with device management of the company.
     * @return a termsAndConditions
     */
    @javax.annotation.Nullable
    public java.util.List<TermsAndConditions> getTermsAndConditions() {
        return this._termsAndConditions;
    }
    /**
     * Gets the troubleshootingEvents property value. The list of troubleshooting events for the tenant.
     * @return a deviceManagementTroubleshootingEvent
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementTroubleshootingEvent> getTroubleshootingEvents() {
        return this._troubleshootingEvents;
    }
    /**
     * Gets the unlicensedAdminstratorsEnabled property value. When enabled, users assigned as administrators via Role Assignment Memberships do not require an assigned Intune license. Prior to this, only Intune licensed users were granted permissions with an Intune role unless they were assigned a role via Azure Active Directory. You are limited to 350 unlicensed direct members for each AAD security group in a role assignment, but you can assign multiple AAD security groups to a role if you need to support more than 350 unlicensed administrators. Licensed administrators are unaffected, do not have to be direct members, nor does the 350 member limit apply. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUnlicensedAdminstratorsEnabled() {
        return this._unlicensedAdminstratorsEnabled;
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthApplicationPerformance property value. User experience analytics appHealth Application Performance
     * @return a userExperienceAnalyticsAppHealthApplicationPerformance
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthApplicationPerformance> getUserExperienceAnalyticsAppHealthApplicationPerformance() {
        return this._userExperienceAnalyticsAppHealthApplicationPerformance;
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion property value. User experience analytics appHealth Application Performance by App Version
     * @return a userExperienceAnalyticsAppHealthAppPerformanceByAppVersion
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion> getUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion() {
        return this._userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion;
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails property value. User experience analytics appHealth Application Performance by App Version details
     * @return a userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails> getUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails() {
        return this._userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails;
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId property value. User experience analytics appHealth Application Performance by App Version Device Id
     * @return a userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId> getUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId() {
        return this._userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId;
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion property value. User experience analytics appHealth Application Performance by OS Version
     * @return a userExperienceAnalyticsAppHealthAppPerformanceByOSVersion
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion> getUserExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion() {
        return this._userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion;
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthDeviceModelPerformance property value. User experience analytics appHealth Model Performance
     * @return a userExperienceAnalyticsAppHealthDeviceModelPerformance
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthDeviceModelPerformance> getUserExperienceAnalyticsAppHealthDeviceModelPerformance() {
        return this._userExperienceAnalyticsAppHealthDeviceModelPerformance;
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthDevicePerformance property value. User experience analytics appHealth Device Performance
     * @return a userExperienceAnalyticsAppHealthDevicePerformance
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthDevicePerformance> getUserExperienceAnalyticsAppHealthDevicePerformance() {
        return this._userExperienceAnalyticsAppHealthDevicePerformance;
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthDevicePerformanceDetails property value. User experience analytics device performance details
     * @return a userExperienceAnalyticsAppHealthDevicePerformanceDetails
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthDevicePerformanceDetails> getUserExperienceAnalyticsAppHealthDevicePerformanceDetails() {
        return this._userExperienceAnalyticsAppHealthDevicePerformanceDetails;
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthOSVersionPerformance property value. User experience analytics appHealth OS version Performance
     * @return a userExperienceAnalyticsAppHealthOSVersionPerformance
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthOSVersionPerformance> getUserExperienceAnalyticsAppHealthOSVersionPerformance() {
        return this._userExperienceAnalyticsAppHealthOSVersionPerformance;
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthOverview property value. User experience analytics appHealth overview
     * @return a userExperienceAnalyticsCategory
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsCategory getUserExperienceAnalyticsAppHealthOverview() {
        return this._userExperienceAnalyticsAppHealthOverview;
    }
    /**
     * Gets the userExperienceAnalyticsBaselines property value. User experience analytics baselines
     * @return a userExperienceAnalyticsBaseline
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsBaseline> getUserExperienceAnalyticsBaselines() {
        return this._userExperienceAnalyticsBaselines;
    }
    /**
     * Gets the userExperienceAnalyticsBatteryHealthAppImpact property value. User Experience Analytics Battery Health App Impact
     * @return a userExperienceAnalyticsBatteryHealthAppImpact
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsBatteryHealthAppImpact> getUserExperienceAnalyticsBatteryHealthAppImpact() {
        return this._userExperienceAnalyticsBatteryHealthAppImpact;
    }
    /**
     * Gets the userExperienceAnalyticsBatteryHealthCapacityDetails property value. User Experience Analytics Battery Health Capacity Details
     * @return a userExperienceAnalyticsBatteryHealthCapacityDetails
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsBatteryHealthCapacityDetails getUserExperienceAnalyticsBatteryHealthCapacityDetails() {
        return this._userExperienceAnalyticsBatteryHealthCapacityDetails;
    }
    /**
     * Gets the userExperienceAnalyticsBatteryHealthDeviceAppImpact property value. User Experience Analytics Battery Health Device App Impact
     * @return a userExperienceAnalyticsBatteryHealthDeviceAppImpact
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsBatteryHealthDeviceAppImpact> getUserExperienceAnalyticsBatteryHealthDeviceAppImpact() {
        return this._userExperienceAnalyticsBatteryHealthDeviceAppImpact;
    }
    /**
     * Gets the userExperienceAnalyticsBatteryHealthDevicePerformance property value. User Experience Analytics Battery Health Device Performance
     * @return a userExperienceAnalyticsBatteryHealthDevicePerformance
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsBatteryHealthDevicePerformance> getUserExperienceAnalyticsBatteryHealthDevicePerformance() {
        return this._userExperienceAnalyticsBatteryHealthDevicePerformance;
    }
    /**
     * Gets the userExperienceAnalyticsBatteryHealthDeviceRuntimeHistory property value. User Experience Analytics Battery Health Device Runtime History
     * @return a userExperienceAnalyticsBatteryHealthDeviceRuntimeHistory
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory> getUserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory() {
        return this._userExperienceAnalyticsBatteryHealthDeviceRuntimeHistory;
    }
    /**
     * Gets the userExperienceAnalyticsBatteryHealthModelPerformance property value. User Experience Analytics Battery Health Model Performance
     * @return a userExperienceAnalyticsBatteryHealthModelPerformance
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsBatteryHealthModelPerformance> getUserExperienceAnalyticsBatteryHealthModelPerformance() {
        return this._userExperienceAnalyticsBatteryHealthModelPerformance;
    }
    /**
     * Gets the userExperienceAnalyticsBatteryHealthOsPerformance property value. User Experience Analytics Battery Health Os Performance
     * @return a userExperienceAnalyticsBatteryHealthOsPerformance
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsBatteryHealthOsPerformance> getUserExperienceAnalyticsBatteryHealthOsPerformance() {
        return this._userExperienceAnalyticsBatteryHealthOsPerformance;
    }
    /**
     * Gets the userExperienceAnalyticsBatteryHealthRuntimeDetails property value. User Experience Analytics Battery Health Runtime Details
     * @return a userExperienceAnalyticsBatteryHealthRuntimeDetails
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsBatteryHealthRuntimeDetails getUserExperienceAnalyticsBatteryHealthRuntimeDetails() {
        return this._userExperienceAnalyticsBatteryHealthRuntimeDetails;
    }
    /**
     * Gets the userExperienceAnalyticsCategories property value. User experience analytics categories
     * @return a userExperienceAnalyticsCategory
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsCategory> getUserExperienceAnalyticsCategories() {
        return this._userExperienceAnalyticsCategories;
    }
    /**
     * Gets the userExperienceAnalyticsDeviceMetricHistory property value. User experience analytics device metric history
     * @return a userExperienceAnalyticsMetricHistory
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsMetricHistory> getUserExperienceAnalyticsDeviceMetricHistory() {
        return this._userExperienceAnalyticsDeviceMetricHistory;
    }
    /**
     * Gets the userExperienceAnalyticsDevicePerformance property value. User experience analytics device performance
     * @return a userExperienceAnalyticsDevicePerformance
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsDevicePerformance> getUserExperienceAnalyticsDevicePerformance() {
        return this._userExperienceAnalyticsDevicePerformance;
    }
    /**
     * Gets the userExperienceAnalyticsDeviceScope property value. The user experience analytics device scope entity endpoint to trigger on the service to either START or STOP computing metrics data based on a device scope configuration.
     * @return a userExperienceAnalyticsDeviceScope
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsDeviceScope getUserExperienceAnalyticsDeviceScope() {
        return this._userExperienceAnalyticsDeviceScope;
    }
    /**
     * Gets the userExperienceAnalyticsDeviceScopes property value. The user experience analytics device scope entity contains device scope configuration use to apply filtering on the endpoint analytics reports.
     * @return a userExperienceAnalyticsDeviceScope
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsDeviceScope> getUserExperienceAnalyticsDeviceScopes() {
        return this._userExperienceAnalyticsDeviceScopes;
    }
    /**
     * Gets the userExperienceAnalyticsDeviceScores property value. User experience analytics device scores
     * @return a userExperienceAnalyticsDeviceScores
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsDeviceScores> getUserExperienceAnalyticsDeviceScores() {
        return this._userExperienceAnalyticsDeviceScores;
    }
    /**
     * Gets the userExperienceAnalyticsDeviceStartupHistory property value. User experience analytics device Startup History
     * @return a userExperienceAnalyticsDeviceStartupHistory
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsDeviceStartupHistory> getUserExperienceAnalyticsDeviceStartupHistory() {
        return this._userExperienceAnalyticsDeviceStartupHistory;
    }
    /**
     * Gets the userExperienceAnalyticsDeviceStartupProcesses property value. User experience analytics device Startup Processes
     * @return a userExperienceAnalyticsDeviceStartupProcess
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsDeviceStartupProcess> getUserExperienceAnalyticsDeviceStartupProcesses() {
        return this._userExperienceAnalyticsDeviceStartupProcesses;
    }
    /**
     * Gets the userExperienceAnalyticsDeviceStartupProcessPerformance property value. User experience analytics device Startup Process Performance
     * @return a userExperienceAnalyticsDeviceStartupProcessPerformance
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsDeviceStartupProcessPerformance> getUserExperienceAnalyticsDeviceStartupProcessPerformance() {
        return this._userExperienceAnalyticsDeviceStartupProcessPerformance;
    }
    /**
     * Gets the userExperienceAnalyticsDevicesWithoutCloudIdentity property value. User experience analytics devices without cloud identity.
     * @return a userExperienceAnalyticsDeviceWithoutCloudIdentity
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsDeviceWithoutCloudIdentity> getUserExperienceAnalyticsDevicesWithoutCloudIdentity() {
        return this._userExperienceAnalyticsDevicesWithoutCloudIdentity;
    }
    /**
     * Gets the userExperienceAnalyticsImpactingProcess property value. User experience analytics impacting process
     * @return a userExperienceAnalyticsImpactingProcess
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsImpactingProcess> getUserExperienceAnalyticsImpactingProcess() {
        return this._userExperienceAnalyticsImpactingProcess;
    }
    /**
     * Gets the userExperienceAnalyticsMetricHistory property value. User experience analytics metric history
     * @return a userExperienceAnalyticsMetricHistory
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsMetricHistory> getUserExperienceAnalyticsMetricHistory() {
        return this._userExperienceAnalyticsMetricHistory;
    }
    /**
     * Gets the userExperienceAnalyticsModelScores property value. User experience analytics model scores
     * @return a userExperienceAnalyticsModelScores
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsModelScores> getUserExperienceAnalyticsModelScores() {
        return this._userExperienceAnalyticsModelScores;
    }
    /**
     * Gets the userExperienceAnalyticsNotAutopilotReadyDevice property value. User experience analytics devices not Windows Autopilot ready.
     * @return a userExperienceAnalyticsNotAutopilotReadyDevice
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsNotAutopilotReadyDevice> getUserExperienceAnalyticsNotAutopilotReadyDevice() {
        return this._userExperienceAnalyticsNotAutopilotReadyDevice;
    }
    /**
     * Gets the userExperienceAnalyticsOverview property value. User experience analytics overview
     * @return a userExperienceAnalyticsOverview
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsOverview getUserExperienceAnalyticsOverview() {
        return this._userExperienceAnalyticsOverview;
    }
    /**
     * Gets the userExperienceAnalyticsRegressionSummary property value. User experience analytics regression summary
     * @return a userExperienceAnalyticsRegressionSummary
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsRegressionSummary getUserExperienceAnalyticsRegressionSummary() {
        return this._userExperienceAnalyticsRegressionSummary;
    }
    /**
     * Gets the userExperienceAnalyticsRemoteConnection property value. User experience analytics remote connection
     * @return a userExperienceAnalyticsRemoteConnection
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsRemoteConnection> getUserExperienceAnalyticsRemoteConnection() {
        return this._userExperienceAnalyticsRemoteConnection;
    }
    /**
     * Gets the userExperienceAnalyticsResourcePerformance property value. User experience analytics resource performance
     * @return a userExperienceAnalyticsResourcePerformance
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsResourcePerformance> getUserExperienceAnalyticsResourcePerformance() {
        return this._userExperienceAnalyticsResourcePerformance;
    }
    /**
     * Gets the userExperienceAnalyticsScoreHistory property value. User experience analytics device Startup Score History
     * @return a userExperienceAnalyticsScoreHistory
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsScoreHistory> getUserExperienceAnalyticsScoreHistory() {
        return this._userExperienceAnalyticsScoreHistory;
    }
    /**
     * Gets the userExperienceAnalyticsSettings property value. User experience analytics device settings
     * @return a userExperienceAnalyticsSettings
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsSettings getUserExperienceAnalyticsSettings() {
        return this._userExperienceAnalyticsSettings;
    }
    /**
     * Gets the userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric property value. User experience analytics work from anywhere hardware readiness metrics.
     * @return a userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric getUserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric() {
        return this._userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric;
    }
    /**
     * Gets the userExperienceAnalyticsWorkFromAnywhereMetrics property value. User experience analytics work from anywhere metrics.
     * @return a userExperienceAnalyticsWorkFromAnywhereMetric
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsWorkFromAnywhereMetric> getUserExperienceAnalyticsWorkFromAnywhereMetrics() {
        return this._userExperienceAnalyticsWorkFromAnywhereMetrics;
    }
    /**
     * Gets the userExperienceAnalyticsWorkFromAnywhereModelPerformance property value. The user experience analytics work from anywhere model performance
     * @return a userExperienceAnalyticsWorkFromAnywhereModelPerformance
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsWorkFromAnywhereModelPerformance> getUserExperienceAnalyticsWorkFromAnywhereModelPerformance() {
        return this._userExperienceAnalyticsWorkFromAnywhereModelPerformance;
    }
    /**
     * Gets the userPfxCertificates property value. Collection of PFX certificates associated with a user.
     * @return a userPFXCertificate
     */
    @javax.annotation.Nullable
    public java.util.List<UserPFXCertificate> getUserPfxCertificates() {
        return this._userPfxCertificates;
    }
    /**
     * Gets the virtualEndpoint property value. The virtualEndpoint property
     * @return a virtualEndpoint
     */
    @javax.annotation.Nullable
    public VirtualEndpoint getVirtualEndpoint() {
        return this._virtualEndpoint;
    }
    /**
     * Gets the windowsAutopilotDeploymentProfiles property value. Windows auto pilot deployment profiles
     * @return a windowsAutopilotDeploymentProfile
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsAutopilotDeploymentProfile> getWindowsAutopilotDeploymentProfiles() {
        return this._windowsAutopilotDeploymentProfiles;
    }
    /**
     * Gets the windowsAutopilotDeviceIdentities property value. The Windows autopilot device identities contained collection.
     * @return a windowsAutopilotDeviceIdentity
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsAutopilotDeviceIdentity> getWindowsAutopilotDeviceIdentities() {
        return this._windowsAutopilotDeviceIdentities;
    }
    /**
     * Gets the windowsAutopilotSettings property value. The Windows autopilot account settings.
     * @return a windowsAutopilotSettings
     */
    @javax.annotation.Nullable
    public WindowsAutopilotSettings getWindowsAutopilotSettings() {
        return this._windowsAutopilotSettings;
    }
    /**
     * Gets the windowsDriverUpdateProfiles property value. A collection of windows driver update profiles
     * @return a windowsDriverUpdateProfile
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsDriverUpdateProfile> getWindowsDriverUpdateProfiles() {
        return this._windowsDriverUpdateProfiles;
    }
    /**
     * Gets the windowsFeatureUpdateProfiles property value. A collection of windows feature update profiles
     * @return a windowsFeatureUpdateProfile
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsFeatureUpdateProfile> getWindowsFeatureUpdateProfiles() {
        return this._windowsFeatureUpdateProfiles;
    }
    /**
     * Gets the windowsInformationProtectionAppLearningSummaries property value. The windows information protection app learning summaries.
     * @return a windowsInformationProtectionAppLearningSummary
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsInformationProtectionAppLearningSummary> getWindowsInformationProtectionAppLearningSummaries() {
        return this._windowsInformationProtectionAppLearningSummaries;
    }
    /**
     * Gets the windowsInformationProtectionNetworkLearningSummaries property value. The windows information protection network learning summaries.
     * @return a windowsInformationProtectionNetworkLearningSummary
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsInformationProtectionNetworkLearningSummary> getWindowsInformationProtectionNetworkLearningSummaries() {
        return this._windowsInformationProtectionNetworkLearningSummaries;
    }
    /**
     * Gets the windowsMalwareInformation property value. The list of affected malware in the tenant.
     * @return a windowsMalwareInformation
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsMalwareInformation> getWindowsMalwareInformation() {
        return this._windowsMalwareInformation;
    }
    /**
     * Gets the windowsMalwareOverview property value. Malware overview for windows devices.
     * @return a windowsMalwareOverview
     */
    @javax.annotation.Nullable
    public WindowsMalwareOverview getWindowsMalwareOverview() {
        return this._windowsMalwareOverview;
    }
    /**
     * Gets the windowsQualityUpdateProfiles property value. A collection of windows quality update profiles
     * @return a windowsQualityUpdateProfile
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsQualityUpdateProfile> getWindowsQualityUpdateProfiles() {
        return this._windowsQualityUpdateProfiles;
    }
    /**
     * Gets the windowsUpdateCatalogItems property value. A collection of windows update catalog items (fetaure updates item , quality updates item)
     * @return a windowsUpdateCatalogItem
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsUpdateCatalogItem> getWindowsUpdateCatalogItems() {
        return this._windowsUpdateCatalogItems;
    }
    /**
     * Gets the zebraFotaArtifacts property value. The Collection of ZebraFotaArtifacts.
     * @return a zebraFotaArtifact
     */
    @javax.annotation.Nullable
    public java.util.List<ZebraFotaArtifact> getZebraFotaArtifacts() {
        return this._zebraFotaArtifacts;
    }
    /**
     * Gets the zebraFotaConnector property value. The singleton ZebraFotaConnector associated with account.
     * @return a zebraFotaConnector
     */
    @javax.annotation.Nullable
    public ZebraFotaConnector getZebraFotaConnector() {
        return this._zebraFotaConnector;
    }
    /**
     * Gets the zebraFotaDeployments property value. Collection of ZebraFotaDeployments associated with account.
     * @return a zebraFotaDeployment
     */
    @javax.annotation.Nullable
    public java.util.List<ZebraFotaDeployment> getZebraFotaDeployments() {
        return this._zebraFotaDeployments;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("accountMoveCompletionDateTime", this.getAccountMoveCompletionDateTime());
        writer.writeObjectValue("adminConsent", this.getAdminConsent());
        writer.writeObjectValue("advancedThreatProtectionOnboardingStateSummary", this.getAdvancedThreatProtectionOnboardingStateSummary());
        writer.writeCollectionOfObjectValues("androidDeviceOwnerEnrollmentProfiles", this.getAndroidDeviceOwnerEnrollmentProfiles());
        writer.writeCollectionOfObjectValues("androidForWorkAppConfigurationSchemas", this.getAndroidForWorkAppConfigurationSchemas());
        writer.writeCollectionOfObjectValues("androidForWorkEnrollmentProfiles", this.getAndroidForWorkEnrollmentProfiles());
        writer.writeObjectValue("androidForWorkSettings", this.getAndroidForWorkSettings());
        writer.writeObjectValue("androidManagedStoreAccountEnterpriseSettings", this.getAndroidManagedStoreAccountEnterpriseSettings());
        writer.writeCollectionOfObjectValues("androidManagedStoreAppConfigurationSchemas", this.getAndroidManagedStoreAppConfigurationSchemas());
        writer.writeObjectValue("applePushNotificationCertificate", this.getApplePushNotificationCertificate());
        writer.writeCollectionOfObjectValues("appleUserInitiatedEnrollmentProfiles", this.getAppleUserInitiatedEnrollmentProfiles());
        writer.writeCollectionOfObjectValues("assignmentFilters", this.getAssignmentFilters());
        writer.writeCollectionOfObjectValues("auditEvents", this.getAuditEvents());
        writer.writeCollectionOfObjectValues("autopilotEvents", this.getAutopilotEvents());
        writer.writeCollectionOfObjectValues("cartToClassAssociations", this.getCartToClassAssociations());
        writer.writeCollectionOfObjectValues("categories", this.getCategories());
        writer.writeCollectionOfObjectValues("certificateConnectorDetails", this.getCertificateConnectorDetails());
        writer.writeCollectionOfObjectValues("chromeOSOnboardingSettings", this.getChromeOSOnboardingSettings());
        writer.writeCollectionOfObjectValues("cloudPCConnectivityIssues", this.getCloudPCConnectivityIssues());
        writer.writeCollectionOfObjectValues("comanagedDevices", this.getComanagedDevices());
        writer.writeCollectionOfObjectValues("comanagementEligibleDevices", this.getComanagementEligibleDevices());
        writer.writeCollectionOfObjectValues("complianceCategories", this.getComplianceCategories());
        writer.writeCollectionOfObjectValues("complianceManagementPartners", this.getComplianceManagementPartners());
        writer.writeCollectionOfObjectValues("compliancePolicies", this.getCompliancePolicies());
        writer.writeCollectionOfObjectValues("complianceSettings", this.getComplianceSettings());
        writer.writeObjectValue("conditionalAccessSettings", this.getConditionalAccessSettings());
        writer.writeCollectionOfObjectValues("configManagerCollections", this.getConfigManagerCollections());
        writer.writeCollectionOfObjectValues("configurationCategories", this.getConfigurationCategories());
        writer.writeCollectionOfObjectValues("configurationPolicies", this.getConfigurationPolicies());
        writer.writeCollectionOfObjectValues("configurationPolicyTemplates", this.getConfigurationPolicyTemplates());
        writer.writeCollectionOfObjectValues("configurationSettings", this.getConfigurationSettings());
        writer.writeCollectionOfObjectValues("dataSharingConsents", this.getDataSharingConsents());
        writer.writeCollectionOfObjectValues("depOnboardingSettings", this.getDepOnboardingSettings());
        writer.writeCollectionOfObjectValues("derivedCredentials", this.getDerivedCredentials());
        writer.writeCollectionOfObjectValues("detectedApps", this.getDetectedApps());
        writer.writeCollectionOfObjectValues("deviceCategories", this.getDeviceCategories());
        writer.writeCollectionOfObjectValues("deviceCompliancePolicies", this.getDeviceCompliancePolicies());
        writer.writeObjectValue("deviceCompliancePolicyDeviceStateSummary", this.getDeviceCompliancePolicyDeviceStateSummary());
        writer.writeCollectionOfObjectValues("deviceCompliancePolicySettingStateSummaries", this.getDeviceCompliancePolicySettingStateSummaries());
        writer.writeOffsetDateTimeValue("deviceComplianceReportSummarizationDateTime", this.getDeviceComplianceReportSummarizationDateTime());
        writer.writeCollectionOfObjectValues("deviceComplianceScripts", this.getDeviceComplianceScripts());
        writer.writeCollectionOfObjectValues("deviceConfigurationConflictSummary", this.getDeviceConfigurationConflictSummary());
        writer.writeObjectValue("deviceConfigurationDeviceStateSummaries", this.getDeviceConfigurationDeviceStateSummaries());
        writer.writeCollectionOfObjectValues("deviceConfigurationRestrictedAppsViolations", this.getDeviceConfigurationRestrictedAppsViolations());
        writer.writeCollectionOfObjectValues("deviceConfigurations", this.getDeviceConfigurations());
        writer.writeCollectionOfObjectValues("deviceConfigurationsAllManagedDeviceCertificateStates", this.getDeviceConfigurationsAllManagedDeviceCertificateStates());
        writer.writeObjectValue("deviceConfigurationUserStateSummaries", this.getDeviceConfigurationUserStateSummaries());
        writer.writeCollectionOfObjectValues("deviceCustomAttributeShellScripts", this.getDeviceCustomAttributeShellScripts());
        writer.writeCollectionOfObjectValues("deviceEnrollmentConfigurations", this.getDeviceEnrollmentConfigurations());
        writer.writeCollectionOfObjectValues("deviceHealthScripts", this.getDeviceHealthScripts());
        writer.writeCollectionOfObjectValues("deviceManagementPartners", this.getDeviceManagementPartners());
        writer.writeCollectionOfObjectValues("deviceManagementScripts", this.getDeviceManagementScripts());
        writer.writeObjectValue("deviceProtectionOverview", this.getDeviceProtectionOverview());
        writer.writeCollectionOfObjectValues("deviceShellScripts", this.getDeviceShellScripts());
        writer.writeCollectionOfObjectValues("domainJoinConnectors", this.getDomainJoinConnectors());
        writer.writeCollectionOfObjectValues("embeddedSIMActivationCodePools", this.getEmbeddedSIMActivationCodePools());
        writer.writeCollectionOfObjectValues("exchangeConnectors", this.getExchangeConnectors());
        writer.writeCollectionOfObjectValues("exchangeOnPremisesPolicies", this.getExchangeOnPremisesPolicies());
        writer.writeObjectValue("exchangeOnPremisesPolicy", this.getExchangeOnPremisesPolicy());
        writer.writeCollectionOfObjectValues("groupPolicyCategories", this.getGroupPolicyCategories());
        writer.writeCollectionOfObjectValues("groupPolicyConfigurations", this.getGroupPolicyConfigurations());
        writer.writeCollectionOfObjectValues("groupPolicyDefinitionFiles", this.getGroupPolicyDefinitionFiles());
        writer.writeCollectionOfObjectValues("groupPolicyDefinitions", this.getGroupPolicyDefinitions());
        writer.writeCollectionOfObjectValues("groupPolicyMigrationReports", this.getGroupPolicyMigrationReports());
        writer.writeCollectionOfObjectValues("groupPolicyObjectFiles", this.getGroupPolicyObjectFiles());
        writer.writeCollectionOfObjectValues("groupPolicyUploadedDefinitionFiles", this.getGroupPolicyUploadedDefinitionFiles());
        writer.writeCollectionOfObjectValues("importedDeviceIdentities", this.getImportedDeviceIdentities());
        writer.writeCollectionOfObjectValues("importedWindowsAutopilotDeviceIdentities", this.getImportedWindowsAutopilotDeviceIdentities());
        writer.writeCollectionOfObjectValues("intents", this.getIntents());
        writer.writeStringValue("intuneAccountId", this.getIntuneAccountId());
        writer.writeObjectValue("intuneBrand", this.getIntuneBrand());
        writer.writeCollectionOfObjectValues("intuneBrandingProfiles", this.getIntuneBrandingProfiles());
        writer.writeCollectionOfObjectValues("iosUpdateStatuses", this.getIosUpdateStatuses());
        writer.writeOffsetDateTimeValue("lastReportAggregationDateTime", this.getLastReportAggregationDateTime());
        writer.writeBooleanValue("legacyPcManangementEnabled", this.getLegacyPcManangementEnabled());
        writer.writeCollectionOfObjectValues("macOSSoftwareUpdateAccountSummaries", this.getMacOSSoftwareUpdateAccountSummaries());
        writer.writeObjectValue("managedDeviceCleanupSettings", this.getManagedDeviceCleanupSettings());
        writer.writeCollectionOfObjectValues("managedDeviceEncryptionStates", this.getManagedDeviceEncryptionStates());
        writer.writeObjectValue("managedDeviceOverview", this.getManagedDeviceOverview());
        writer.writeCollectionOfObjectValues("managedDevices", this.getManagedDevices());
        writer.writeIntegerValue("maximumDepTokens", this.getMaximumDepTokens());
        writer.writeCollectionOfObjectValues("microsoftTunnelConfigurations", this.getMicrosoftTunnelConfigurations());
        writer.writeCollectionOfObjectValues("microsoftTunnelHealthThresholds", this.getMicrosoftTunnelHealthThresholds());
        writer.writeCollectionOfObjectValues("microsoftTunnelServerLogCollectionResponses", this.getMicrosoftTunnelServerLogCollectionResponses());
        writer.writeCollectionOfObjectValues("microsoftTunnelSites", this.getMicrosoftTunnelSites());
        writer.writeCollectionOfObjectValues("mobileAppTroubleshootingEvents", this.getMobileAppTroubleshootingEvents());
        writer.writeCollectionOfObjectValues("mobileThreatDefenseConnectors", this.getMobileThreatDefenseConnectors());
        writer.writeCollectionOfObjectValues("ndesConnectors", this.getNdesConnectors());
        writer.writeCollectionOfObjectValues("notificationMessageTemplates", this.getNotificationMessageTemplates());
        writer.writeCollectionOfObjectValues("oemWarrantyInformationOnboarding", this.getOemWarrantyInformationOnboarding());
        writer.writeCollectionOfObjectValues("remoteActionAudits", this.getRemoteActionAudits());
        writer.writeCollectionOfObjectValues("remoteAssistancePartners", this.getRemoteAssistancePartners());
        writer.writeObjectValue("remoteAssistanceSettings", this.getRemoteAssistanceSettings());
        writer.writeObjectValue("reports", this.getReports());
        writer.writeCollectionOfObjectValues("resourceAccessProfiles", this.getResourceAccessProfiles());
        writer.writeCollectionOfObjectValues("resourceOperations", this.getResourceOperations());
        writer.writeCollectionOfObjectValues("reusablePolicySettings", this.getReusablePolicySettings());
        writer.writeCollectionOfObjectValues("reusableSettings", this.getReusableSettings());
        writer.writeCollectionOfObjectValues("roleAssignments", this.getRoleAssignments());
        writer.writeCollectionOfObjectValues("roleDefinitions", this.getRoleDefinitions());
        writer.writeCollectionOfObjectValues("roleScopeTags", this.getRoleScopeTags());
        writer.writeCollectionOfObjectValues("settingDefinitions", this.getSettingDefinitions());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeObjectValue("softwareUpdateStatusSummary", this.getSoftwareUpdateStatusSummary());
        writer.writeEnumValue("subscriptions", this.getSubscriptions());
        writer.writeEnumValue("subscriptionState", this.getSubscriptionState());
        writer.writeCollectionOfObjectValues("telecomExpenseManagementPartners", this.getTelecomExpenseManagementPartners());
        writer.writeCollectionOfObjectValues("templates", this.getTemplates());
        writer.writeCollectionOfObjectValues("templateSettings", this.getTemplateSettings());
        writer.writeObjectValue("tenantAttachRBAC", this.getTenantAttachRBAC());
        writer.writeCollectionOfObjectValues("termsAndConditions", this.getTermsAndConditions());
        writer.writeCollectionOfObjectValues("troubleshootingEvents", this.getTroubleshootingEvents());
        writer.writeBooleanValue("unlicensedAdminstratorsEnabled", this.getUnlicensedAdminstratorsEnabled());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthApplicationPerformance", this.getUserExperienceAnalyticsAppHealthApplicationPerformance());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion", this.getUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails", this.getUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId", this.getUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion", this.getUserExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthDeviceModelPerformance", this.getUserExperienceAnalyticsAppHealthDeviceModelPerformance());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthDevicePerformance", this.getUserExperienceAnalyticsAppHealthDevicePerformance());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthDevicePerformanceDetails", this.getUserExperienceAnalyticsAppHealthDevicePerformanceDetails());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthOSVersionPerformance", this.getUserExperienceAnalyticsAppHealthOSVersionPerformance());
        writer.writeObjectValue("userExperienceAnalyticsAppHealthOverview", this.getUserExperienceAnalyticsAppHealthOverview());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsBaselines", this.getUserExperienceAnalyticsBaselines());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsBatteryHealthAppImpact", this.getUserExperienceAnalyticsBatteryHealthAppImpact());
        writer.writeObjectValue("userExperienceAnalyticsBatteryHealthCapacityDetails", this.getUserExperienceAnalyticsBatteryHealthCapacityDetails());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsBatteryHealthDeviceAppImpact", this.getUserExperienceAnalyticsBatteryHealthDeviceAppImpact());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsBatteryHealthDevicePerformance", this.getUserExperienceAnalyticsBatteryHealthDevicePerformance());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsBatteryHealthDeviceRuntimeHistory", this.getUserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsBatteryHealthModelPerformance", this.getUserExperienceAnalyticsBatteryHealthModelPerformance());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsBatteryHealthOsPerformance", this.getUserExperienceAnalyticsBatteryHealthOsPerformance());
        writer.writeObjectValue("userExperienceAnalyticsBatteryHealthRuntimeDetails", this.getUserExperienceAnalyticsBatteryHealthRuntimeDetails());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsCategories", this.getUserExperienceAnalyticsCategories());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsDeviceMetricHistory", this.getUserExperienceAnalyticsDeviceMetricHistory());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsDevicePerformance", this.getUserExperienceAnalyticsDevicePerformance());
        writer.writeObjectValue("userExperienceAnalyticsDeviceScope", this.getUserExperienceAnalyticsDeviceScope());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsDeviceScopes", this.getUserExperienceAnalyticsDeviceScopes());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsDeviceScores", this.getUserExperienceAnalyticsDeviceScores());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsDeviceStartupHistory", this.getUserExperienceAnalyticsDeviceStartupHistory());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsDeviceStartupProcesses", this.getUserExperienceAnalyticsDeviceStartupProcesses());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsDeviceStartupProcessPerformance", this.getUserExperienceAnalyticsDeviceStartupProcessPerformance());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsDevicesWithoutCloudIdentity", this.getUserExperienceAnalyticsDevicesWithoutCloudIdentity());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsImpactingProcess", this.getUserExperienceAnalyticsImpactingProcess());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsMetricHistory", this.getUserExperienceAnalyticsMetricHistory());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsModelScores", this.getUserExperienceAnalyticsModelScores());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsNotAutopilotReadyDevice", this.getUserExperienceAnalyticsNotAutopilotReadyDevice());
        writer.writeObjectValue("userExperienceAnalyticsOverview", this.getUserExperienceAnalyticsOverview());
        writer.writeObjectValue("userExperienceAnalyticsRegressionSummary", this.getUserExperienceAnalyticsRegressionSummary());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsRemoteConnection", this.getUserExperienceAnalyticsRemoteConnection());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsResourcePerformance", this.getUserExperienceAnalyticsResourcePerformance());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsScoreHistory", this.getUserExperienceAnalyticsScoreHistory());
        writer.writeObjectValue("userExperienceAnalyticsSettings", this.getUserExperienceAnalyticsSettings());
        writer.writeObjectValue("userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric", this.getUserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsWorkFromAnywhereMetrics", this.getUserExperienceAnalyticsWorkFromAnywhereMetrics());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsWorkFromAnywhereModelPerformance", this.getUserExperienceAnalyticsWorkFromAnywhereModelPerformance());
        writer.writeCollectionOfObjectValues("userPfxCertificates", this.getUserPfxCertificates());
        writer.writeObjectValue("virtualEndpoint", this.getVirtualEndpoint());
        writer.writeCollectionOfObjectValues("windowsAutopilotDeploymentProfiles", this.getWindowsAutopilotDeploymentProfiles());
        writer.writeCollectionOfObjectValues("windowsAutopilotDeviceIdentities", this.getWindowsAutopilotDeviceIdentities());
        writer.writeObjectValue("windowsAutopilotSettings", this.getWindowsAutopilotSettings());
        writer.writeCollectionOfObjectValues("windowsDriverUpdateProfiles", this.getWindowsDriverUpdateProfiles());
        writer.writeCollectionOfObjectValues("windowsFeatureUpdateProfiles", this.getWindowsFeatureUpdateProfiles());
        writer.writeCollectionOfObjectValues("windowsInformationProtectionAppLearningSummaries", this.getWindowsInformationProtectionAppLearningSummaries());
        writer.writeCollectionOfObjectValues("windowsInformationProtectionNetworkLearningSummaries", this.getWindowsInformationProtectionNetworkLearningSummaries());
        writer.writeCollectionOfObjectValues("windowsMalwareInformation", this.getWindowsMalwareInformation());
        writer.writeObjectValue("windowsMalwareOverview", this.getWindowsMalwareOverview());
        writer.writeCollectionOfObjectValues("windowsQualityUpdateProfiles", this.getWindowsQualityUpdateProfiles());
        writer.writeCollectionOfObjectValues("windowsUpdateCatalogItems", this.getWindowsUpdateCatalogItems());
        writer.writeCollectionOfObjectValues("zebraFotaArtifacts", this.getZebraFotaArtifacts());
        writer.writeObjectValue("zebraFotaConnector", this.getZebraFotaConnector());
        writer.writeCollectionOfObjectValues("zebraFotaDeployments", this.getZebraFotaDeployments());
    }
    /**
     * Sets the accountMoveCompletionDateTime property value. The date & time when tenant data moved between scaleunits.
     * @param value Value to set for the accountMoveCompletionDateTime property.
     * @return a void
     */
    public void setAccountMoveCompletionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._accountMoveCompletionDateTime = value;
    }
    /**
     * Sets the adminConsent property value. Admin consent information.
     * @param value Value to set for the adminConsent property.
     * @return a void
     */
    public void setAdminConsent(@javax.annotation.Nullable final AdminConsent value) {
        this._adminConsent = value;
    }
    /**
     * Sets the advancedThreatProtectionOnboardingStateSummary property value. The summary state of ATP onboarding state for this account.
     * @param value Value to set for the advancedThreatProtectionOnboardingStateSummary property.
     * @return a void
     */
    public void setAdvancedThreatProtectionOnboardingStateSummary(@javax.annotation.Nullable final AdvancedThreatProtectionOnboardingStateSummary value) {
        this._advancedThreatProtectionOnboardingStateSummary = value;
    }
    /**
     * Sets the androidDeviceOwnerEnrollmentProfiles property value. Android device owner enrollment profile entities.
     * @param value Value to set for the androidDeviceOwnerEnrollmentProfiles property.
     * @return a void
     */
    public void setAndroidDeviceOwnerEnrollmentProfiles(@javax.annotation.Nullable final java.util.List<AndroidDeviceOwnerEnrollmentProfile> value) {
        this._androidDeviceOwnerEnrollmentProfiles = value;
    }
    /**
     * Sets the androidForWorkAppConfigurationSchemas property value. Android for Work app configuration schema entities.
     * @param value Value to set for the androidForWorkAppConfigurationSchemas property.
     * @return a void
     */
    public void setAndroidForWorkAppConfigurationSchemas(@javax.annotation.Nullable final java.util.List<AndroidForWorkAppConfigurationSchema> value) {
        this._androidForWorkAppConfigurationSchemas = value;
    }
    /**
     * Sets the androidForWorkEnrollmentProfiles property value. Android for Work enrollment profile entities.
     * @param value Value to set for the androidForWorkEnrollmentProfiles property.
     * @return a void
     */
    public void setAndroidForWorkEnrollmentProfiles(@javax.annotation.Nullable final java.util.List<AndroidForWorkEnrollmentProfile> value) {
        this._androidForWorkEnrollmentProfiles = value;
    }
    /**
     * Sets the androidForWorkSettings property value. The singleton Android for Work settings entity.
     * @param value Value to set for the androidForWorkSettings property.
     * @return a void
     */
    public void setAndroidForWorkSettings(@javax.annotation.Nullable final AndroidForWorkSettings value) {
        this._androidForWorkSettings = value;
    }
    /**
     * Sets the androidManagedStoreAccountEnterpriseSettings property value. The singleton Android managed store account enterprise settings entity.
     * @param value Value to set for the androidManagedStoreAccountEnterpriseSettings property.
     * @return a void
     */
    public void setAndroidManagedStoreAccountEnterpriseSettings(@javax.annotation.Nullable final AndroidManagedStoreAccountEnterpriseSettings value) {
        this._androidManagedStoreAccountEnterpriseSettings = value;
    }
    /**
     * Sets the androidManagedStoreAppConfigurationSchemas property value. Android Enterprise app configuration schema entities.
     * @param value Value to set for the androidManagedStoreAppConfigurationSchemas property.
     * @return a void
     */
    public void setAndroidManagedStoreAppConfigurationSchemas(@javax.annotation.Nullable final java.util.List<AndroidManagedStoreAppConfigurationSchema> value) {
        this._androidManagedStoreAppConfigurationSchemas = value;
    }
    /**
     * Sets the applePushNotificationCertificate property value. Apple push notification certificate.
     * @param value Value to set for the applePushNotificationCertificate property.
     * @return a void
     */
    public void setApplePushNotificationCertificate(@javax.annotation.Nullable final ApplePushNotificationCertificate value) {
        this._applePushNotificationCertificate = value;
    }
    /**
     * Sets the appleUserInitiatedEnrollmentProfiles property value. Apple user initiated enrollment profiles
     * @param value Value to set for the appleUserInitiatedEnrollmentProfiles property.
     * @return a void
     */
    public void setAppleUserInitiatedEnrollmentProfiles(@javax.annotation.Nullable final java.util.List<AppleUserInitiatedEnrollmentProfile> value) {
        this._appleUserInitiatedEnrollmentProfiles = value;
    }
    /**
     * Sets the assignmentFilters property value. The list of assignment filters
     * @param value Value to set for the assignmentFilters property.
     * @return a void
     */
    public void setAssignmentFilters(@javax.annotation.Nullable final java.util.List<DeviceAndAppManagementAssignmentFilter> value) {
        this._assignmentFilters = value;
    }
    /**
     * Sets the auditEvents property value. The Audit Events
     * @param value Value to set for the auditEvents property.
     * @return a void
     */
    public void setAuditEvents(@javax.annotation.Nullable final java.util.List<AuditEvent> value) {
        this._auditEvents = value;
    }
    /**
     * Sets the autopilotEvents property value. The list of autopilot events for the tenant.
     * @param value Value to set for the autopilotEvents property.
     * @return a void
     */
    public void setAutopilotEvents(@javax.annotation.Nullable final java.util.List<DeviceManagementAutopilotEvent> value) {
        this._autopilotEvents = value;
    }
    /**
     * Sets the cartToClassAssociations property value. The Cart To Class Associations.
     * @param value Value to set for the cartToClassAssociations property.
     * @return a void
     */
    public void setCartToClassAssociations(@javax.annotation.Nullable final java.util.List<CartToClassAssociation> value) {
        this._cartToClassAssociations = value;
    }
    /**
     * Sets the categories property value. The available categories
     * @param value Value to set for the categories property.
     * @return a void
     */
    public void setCategories(@javax.annotation.Nullable final java.util.List<DeviceManagementSettingCategory> value) {
        this._categories = value;
    }
    /**
     * Sets the certificateConnectorDetails property value. Collection of certificate connector details, each associated with a corresponding Intune Certificate Connector.
     * @param value Value to set for the certificateConnectorDetails property.
     * @return a void
     */
    public void setCertificateConnectorDetails(@javax.annotation.Nullable final java.util.List<CertificateConnectorDetails> value) {
        this._certificateConnectorDetails = value;
    }
    /**
     * Sets the chromeOSOnboardingSettings property value. Collection of ChromeOSOnboardingSettings settings associated with account.
     * @param value Value to set for the chromeOSOnboardingSettings property.
     * @return a void
     */
    public void setChromeOSOnboardingSettings(@javax.annotation.Nullable final java.util.List<ChromeOSOnboardingSettings> value) {
        this._chromeOSOnboardingSettings = value;
    }
    /**
     * Sets the cloudPCConnectivityIssues property value. The list of CloudPC Connectivity Issue.
     * @param value Value to set for the cloudPCConnectivityIssues property.
     * @return a void
     */
    public void setCloudPCConnectivityIssues(@javax.annotation.Nullable final java.util.List<CloudPCConnectivityIssue> value) {
        this._cloudPCConnectivityIssues = value;
    }
    /**
     * Sets the comanagedDevices property value. The list of co-managed devices report
     * @param value Value to set for the comanagedDevices property.
     * @return a void
     */
    public void setComanagedDevices(@javax.annotation.Nullable final java.util.List<ManagedDevice> value) {
        this._comanagedDevices = value;
    }
    /**
     * Sets the comanagementEligibleDevices property value. The list of co-management eligible devices report
     * @param value Value to set for the comanagementEligibleDevices property.
     * @return a void
     */
    public void setComanagementEligibleDevices(@javax.annotation.Nullable final java.util.List<ComanagementEligibleDevice> value) {
        this._comanagementEligibleDevices = value;
    }
    /**
     * Sets the complianceCategories property value. List of all compliance categories
     * @param value Value to set for the complianceCategories property.
     * @return a void
     */
    public void setComplianceCategories(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationCategory> value) {
        this._complianceCategories = value;
    }
    /**
     * Sets the complianceManagementPartners property value. The list of Compliance Management Partners configured by the tenant.
     * @param value Value to set for the complianceManagementPartners property.
     * @return a void
     */
    public void setComplianceManagementPartners(@javax.annotation.Nullable final java.util.List<ComplianceManagementPartner> value) {
        this._complianceManagementPartners = value;
    }
    /**
     * Sets the compliancePolicies property value. List of all compliance policies
     * @param value Value to set for the compliancePolicies property.
     * @return a void
     */
    public void setCompliancePolicies(@javax.annotation.Nullable final java.util.List<DeviceManagementCompliancePolicy> value) {
        this._compliancePolicies = value;
    }
    /**
     * Sets the complianceSettings property value. List of all ComplianceSettings
     * @param value Value to set for the complianceSettings property.
     * @return a void
     */
    public void setComplianceSettings(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingDefinition> value) {
        this._complianceSettings = value;
    }
    /**
     * Sets the conditionalAccessSettings property value. The Exchange on premises conditional access settings. On premises conditional access will require devices to be both enrolled and compliant for mail access
     * @param value Value to set for the conditionalAccessSettings property.
     * @return a void
     */
    public void setConditionalAccessSettings(@javax.annotation.Nullable final OnPremisesConditionalAccessSettings value) {
        this._conditionalAccessSettings = value;
    }
    /**
     * Sets the configManagerCollections property value. A list of ConfigManagerCollection
     * @param value Value to set for the configManagerCollections property.
     * @return a void
     */
    public void setConfigManagerCollections(@javax.annotation.Nullable final java.util.List<ConfigManagerCollection> value) {
        this._configManagerCollections = value;
    }
    /**
     * Sets the configurationCategories property value. List of all Configuration Categories
     * @param value Value to set for the configurationCategories property.
     * @return a void
     */
    public void setConfigurationCategories(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationCategory> value) {
        this._configurationCategories = value;
    }
    /**
     * Sets the configurationPolicies property value. List of all Configuration policies
     * @param value Value to set for the configurationPolicies property.
     * @return a void
     */
    public void setConfigurationPolicies(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationPolicy> value) {
        this._configurationPolicies = value;
    }
    /**
     * Sets the configurationPolicyTemplates property value. List of all templates
     * @param value Value to set for the configurationPolicyTemplates property.
     * @return a void
     */
    public void setConfigurationPolicyTemplates(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationPolicyTemplate> value) {
        this._configurationPolicyTemplates = value;
    }
    /**
     * Sets the configurationSettings property value. List of all ConfigurationSettings
     * @param value Value to set for the configurationSettings property.
     * @return a void
     */
    public void setConfigurationSettings(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingDefinition> value) {
        this._configurationSettings = value;
    }
    /**
     * Sets the dataSharingConsents property value. Data sharing consents.
     * @param value Value to set for the dataSharingConsents property.
     * @return a void
     */
    public void setDataSharingConsents(@javax.annotation.Nullable final java.util.List<DataSharingConsent> value) {
        this._dataSharingConsents = value;
    }
    /**
     * Sets the depOnboardingSettings property value. This collections of multiple DEP tokens per-tenant.
     * @param value Value to set for the depOnboardingSettings property.
     * @return a void
     */
    public void setDepOnboardingSettings(@javax.annotation.Nullable final java.util.List<DepOnboardingSetting> value) {
        this._depOnboardingSettings = value;
    }
    /**
     * Sets the derivedCredentials property value. Collection of Derived credential settings associated with account.
     * @param value Value to set for the derivedCredentials property.
     * @return a void
     */
    public void setDerivedCredentials(@javax.annotation.Nullable final java.util.List<DeviceManagementDerivedCredentialSettings> value) {
        this._derivedCredentials = value;
    }
    /**
     * Sets the detectedApps property value. The list of detected apps associated with a device.
     * @param value Value to set for the detectedApps property.
     * @return a void
     */
    public void setDetectedApps(@javax.annotation.Nullable final java.util.List<DetectedApp> value) {
        this._detectedApps = value;
    }
    /**
     * Sets the deviceCategories property value. The list of device categories with the tenant.
     * @param value Value to set for the deviceCategories property.
     * @return a void
     */
    public void setDeviceCategories(@javax.annotation.Nullable final java.util.List<DeviceCategory> value) {
        this._deviceCategories = value;
    }
    /**
     * Sets the deviceCompliancePolicies property value. The device compliance policies.
     * @param value Value to set for the deviceCompliancePolicies property.
     * @return a void
     */
    public void setDeviceCompliancePolicies(@javax.annotation.Nullable final java.util.List<DeviceCompliancePolicy> value) {
        this._deviceCompliancePolicies = value;
    }
    /**
     * Sets the deviceCompliancePolicyDeviceStateSummary property value. The device compliance state summary for this account.
     * @param value Value to set for the deviceCompliancePolicyDeviceStateSummary property.
     * @return a void
     */
    public void setDeviceCompliancePolicyDeviceStateSummary(@javax.annotation.Nullable final DeviceCompliancePolicyDeviceStateSummary value) {
        this._deviceCompliancePolicyDeviceStateSummary = value;
    }
    /**
     * Sets the deviceCompliancePolicySettingStateSummaries property value. The summary states of compliance policy settings for this account.
     * @param value Value to set for the deviceCompliancePolicySettingStateSummaries property.
     * @return a void
     */
    public void setDeviceCompliancePolicySettingStateSummaries(@javax.annotation.Nullable final java.util.List<DeviceCompliancePolicySettingStateSummary> value) {
        this._deviceCompliancePolicySettingStateSummaries = value;
    }
    /**
     * Sets the deviceComplianceReportSummarizationDateTime property value. The last requested time of device compliance reporting for this account. This property is read-only.
     * @param value Value to set for the deviceComplianceReportSummarizationDateTime property.
     * @return a void
     */
    public void setDeviceComplianceReportSummarizationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._deviceComplianceReportSummarizationDateTime = value;
    }
    /**
     * Sets the deviceComplianceScripts property value. The list of device compliance scripts associated with the tenant.
     * @param value Value to set for the deviceComplianceScripts property.
     * @return a void
     */
    public void setDeviceComplianceScripts(@javax.annotation.Nullable final java.util.List<DeviceComplianceScript> value) {
        this._deviceComplianceScripts = value;
    }
    /**
     * Sets the deviceConfigurationConflictSummary property value. Summary of policies in conflict state for this account.
     * @param value Value to set for the deviceConfigurationConflictSummary property.
     * @return a void
     */
    public void setDeviceConfigurationConflictSummary(@javax.annotation.Nullable final java.util.List<DeviceConfigurationConflictSummary> value) {
        this._deviceConfigurationConflictSummary = value;
    }
    /**
     * Sets the deviceConfigurationDeviceStateSummaries property value. The device configuration device state summary for this account.
     * @param value Value to set for the deviceConfigurationDeviceStateSummaries property.
     * @return a void
     */
    public void setDeviceConfigurationDeviceStateSummaries(@javax.annotation.Nullable final DeviceConfigurationDeviceStateSummary value) {
        this._deviceConfigurationDeviceStateSummaries = value;
    }
    /**
     * Sets the deviceConfigurationRestrictedAppsViolations property value. Restricted apps violations for this account.
     * @param value Value to set for the deviceConfigurationRestrictedAppsViolations property.
     * @return a void
     */
    public void setDeviceConfigurationRestrictedAppsViolations(@javax.annotation.Nullable final java.util.List<RestrictedAppsViolation> value) {
        this._deviceConfigurationRestrictedAppsViolations = value;
    }
    /**
     * Sets the deviceConfigurations property value. The device configurations.
     * @param value Value to set for the deviceConfigurations property.
     * @return a void
     */
    public void setDeviceConfigurations(@javax.annotation.Nullable final java.util.List<DeviceConfiguration> value) {
        this._deviceConfigurations = value;
    }
    /**
     * Sets the deviceConfigurationsAllManagedDeviceCertificateStates property value. Summary of all certificates for all devices.
     * @param value Value to set for the deviceConfigurationsAllManagedDeviceCertificateStates property.
     * @return a void
     */
    public void setDeviceConfigurationsAllManagedDeviceCertificateStates(@javax.annotation.Nullable final java.util.List<ManagedAllDeviceCertificateState> value) {
        this._deviceConfigurationsAllManagedDeviceCertificateStates = value;
    }
    /**
     * Sets the deviceConfigurationUserStateSummaries property value. The device configuration user state summary for this account.
     * @param value Value to set for the deviceConfigurationUserStateSummaries property.
     * @return a void
     */
    public void setDeviceConfigurationUserStateSummaries(@javax.annotation.Nullable final DeviceConfigurationUserStateSummary value) {
        this._deviceConfigurationUserStateSummaries = value;
    }
    /**
     * Sets the deviceCustomAttributeShellScripts property value. The list of device custom attribute shell scripts associated with the tenant.
     * @param value Value to set for the deviceCustomAttributeShellScripts property.
     * @return a void
     */
    public void setDeviceCustomAttributeShellScripts(@javax.annotation.Nullable final java.util.List<DeviceCustomAttributeShellScript> value) {
        this._deviceCustomAttributeShellScripts = value;
    }
    /**
     * Sets the deviceEnrollmentConfigurations property value. The list of device enrollment configurations
     * @param value Value to set for the deviceEnrollmentConfigurations property.
     * @return a void
     */
    public void setDeviceEnrollmentConfigurations(@javax.annotation.Nullable final java.util.List<DeviceEnrollmentConfiguration> value) {
        this._deviceEnrollmentConfigurations = value;
    }
    /**
     * Sets the deviceHealthScripts property value. The list of device health scripts associated with the tenant.
     * @param value Value to set for the deviceHealthScripts property.
     * @return a void
     */
    public void setDeviceHealthScripts(@javax.annotation.Nullable final java.util.List<DeviceHealthScript> value) {
        this._deviceHealthScripts = value;
    }
    /**
     * Sets the deviceManagementPartners property value. The list of Device Management Partners configured by the tenant.
     * @param value Value to set for the deviceManagementPartners property.
     * @return a void
     */
    public void setDeviceManagementPartners(@javax.annotation.Nullable final java.util.List<DeviceManagementPartner> value) {
        this._deviceManagementPartners = value;
    }
    /**
     * Sets the deviceManagementScripts property value. The list of device management scripts associated with the tenant.
     * @param value Value to set for the deviceManagementScripts property.
     * @return a void
     */
    public void setDeviceManagementScripts(@javax.annotation.Nullable final java.util.List<DeviceManagementScript> value) {
        this._deviceManagementScripts = value;
    }
    /**
     * Sets the deviceProtectionOverview property value. Device protection overview.
     * @param value Value to set for the deviceProtectionOverview property.
     * @return a void
     */
    public void setDeviceProtectionOverview(@javax.annotation.Nullable final DeviceProtectionOverview value) {
        this._deviceProtectionOverview = value;
    }
    /**
     * Sets the deviceShellScripts property value. The list of device shell scripts associated with the tenant.
     * @param value Value to set for the deviceShellScripts property.
     * @return a void
     */
    public void setDeviceShellScripts(@javax.annotation.Nullable final java.util.List<DeviceShellScript> value) {
        this._deviceShellScripts = value;
    }
    /**
     * Sets the domainJoinConnectors property value. A list of connector objects.
     * @param value Value to set for the domainJoinConnectors property.
     * @return a void
     */
    public void setDomainJoinConnectors(@javax.annotation.Nullable final java.util.List<DeviceManagementDomainJoinConnector> value) {
        this._domainJoinConnectors = value;
    }
    /**
     * Sets the embeddedSIMActivationCodePools property value. The embedded SIM activation code pools created by this account.
     * @param value Value to set for the embeddedSIMActivationCodePools property.
     * @return a void
     */
    public void setEmbeddedSIMActivationCodePools(@javax.annotation.Nullable final java.util.List<EmbeddedSIMActivationCodePool> value) {
        this._embeddedSIMActivationCodePools = value;
    }
    /**
     * Sets the exchangeConnectors property value. The list of Exchange Connectors configured by the tenant.
     * @param value Value to set for the exchangeConnectors property.
     * @return a void
     */
    public void setExchangeConnectors(@javax.annotation.Nullable final java.util.List<DeviceManagementExchangeConnector> value) {
        this._exchangeConnectors = value;
    }
    /**
     * Sets the exchangeOnPremisesPolicies property value. The list of Exchange On Premisis policies configured by the tenant.
     * @param value Value to set for the exchangeOnPremisesPolicies property.
     * @return a void
     */
    public void setExchangeOnPremisesPolicies(@javax.annotation.Nullable final java.util.List<DeviceManagementExchangeOnPremisesPolicy> value) {
        this._exchangeOnPremisesPolicies = value;
    }
    /**
     * Sets the exchangeOnPremisesPolicy property value. The policy which controls mobile device access to Exchange On Premises
     * @param value Value to set for the exchangeOnPremisesPolicy property.
     * @return a void
     */
    public void setExchangeOnPremisesPolicy(@javax.annotation.Nullable final DeviceManagementExchangeOnPremisesPolicy value) {
        this._exchangeOnPremisesPolicy = value;
    }
    /**
     * Sets the groupPolicyCategories property value. The available group policy categories for this account.
     * @param value Value to set for the groupPolicyCategories property.
     * @return a void
     */
    public void setGroupPolicyCategories(@javax.annotation.Nullable final java.util.List<GroupPolicyCategory> value) {
        this._groupPolicyCategories = value;
    }
    /**
     * Sets the groupPolicyConfigurations property value. The group policy configurations created by this account.
     * @param value Value to set for the groupPolicyConfigurations property.
     * @return a void
     */
    public void setGroupPolicyConfigurations(@javax.annotation.Nullable final java.util.List<GroupPolicyConfiguration> value) {
        this._groupPolicyConfigurations = value;
    }
    /**
     * Sets the groupPolicyDefinitionFiles property value. The available group policy definition files for this account.
     * @param value Value to set for the groupPolicyDefinitionFiles property.
     * @return a void
     */
    public void setGroupPolicyDefinitionFiles(@javax.annotation.Nullable final java.util.List<GroupPolicyDefinitionFile> value) {
        this._groupPolicyDefinitionFiles = value;
    }
    /**
     * Sets the groupPolicyDefinitions property value. The available group policy definitions for this account.
     * @param value Value to set for the groupPolicyDefinitions property.
     * @return a void
     */
    public void setGroupPolicyDefinitions(@javax.annotation.Nullable final java.util.List<GroupPolicyDefinition> value) {
        this._groupPolicyDefinitions = value;
    }
    /**
     * Sets the groupPolicyMigrationReports property value. A list of Group Policy migration reports.
     * @param value Value to set for the groupPolicyMigrationReports property.
     * @return a void
     */
    public void setGroupPolicyMigrationReports(@javax.annotation.Nullable final java.util.List<GroupPolicyMigrationReport> value) {
        this._groupPolicyMigrationReports = value;
    }
    /**
     * Sets the groupPolicyObjectFiles property value. A list of Group Policy Object files uploaded.
     * @param value Value to set for the groupPolicyObjectFiles property.
     * @return a void
     */
    public void setGroupPolicyObjectFiles(@javax.annotation.Nullable final java.util.List<GroupPolicyObjectFile> value) {
        this._groupPolicyObjectFiles = value;
    }
    /**
     * Sets the groupPolicyUploadedDefinitionFiles property value. The available group policy uploaded definition files for this account.
     * @param value Value to set for the groupPolicyUploadedDefinitionFiles property.
     * @return a void
     */
    public void setGroupPolicyUploadedDefinitionFiles(@javax.annotation.Nullable final java.util.List<GroupPolicyUploadedDefinitionFile> value) {
        this._groupPolicyUploadedDefinitionFiles = value;
    }
    /**
     * Sets the importedDeviceIdentities property value. The imported device identities.
     * @param value Value to set for the importedDeviceIdentities property.
     * @return a void
     */
    public void setImportedDeviceIdentities(@javax.annotation.Nullable final java.util.List<ImportedDeviceIdentity> value) {
        this._importedDeviceIdentities = value;
    }
    /**
     * Sets the importedWindowsAutopilotDeviceIdentities property value. Collection of imported Windows autopilot devices.
     * @param value Value to set for the importedWindowsAutopilotDeviceIdentities property.
     * @return a void
     */
    public void setImportedWindowsAutopilotDeviceIdentities(@javax.annotation.Nullable final java.util.List<ImportedWindowsAutopilotDeviceIdentity> value) {
        this._importedWindowsAutopilotDeviceIdentities = value;
    }
    /**
     * Sets the intents property value. The device management intents
     * @param value Value to set for the intents property.
     * @return a void
     */
    public void setIntents(@javax.annotation.Nullable final java.util.List<DeviceManagementIntent> value) {
        this._intents = value;
    }
    /**
     * Sets the intuneAccountId property value. Intune Account ID for given tenant
     * @param value Value to set for the intuneAccountId property.
     * @return a void
     */
    public void setIntuneAccountId(@javax.annotation.Nullable final String value) {
        this._intuneAccountId = value;
    }
    /**
     * Sets the intuneBrand property value. intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the end user web portal.
     * @param value Value to set for the intuneBrand property.
     * @return a void
     */
    public void setIntuneBrand(@javax.annotation.Nullable final IntuneBrand value) {
        this._intuneBrand = value;
    }
    /**
     * Sets the intuneBrandingProfiles property value. Intune branding profiles targeted to AAD groups
     * @param value Value to set for the intuneBrandingProfiles property.
     * @return a void
     */
    public void setIntuneBrandingProfiles(@javax.annotation.Nullable final java.util.List<IntuneBrandingProfile> value) {
        this._intuneBrandingProfiles = value;
    }
    /**
     * Sets the iosUpdateStatuses property value. The IOS software update installation statuses for this account.
     * @param value Value to set for the iosUpdateStatuses property.
     * @return a void
     */
    public void setIosUpdateStatuses(@javax.annotation.Nullable final java.util.List<IosUpdateDeviceStatus> value) {
        this._iosUpdateStatuses = value;
    }
    /**
     * Sets the lastReportAggregationDateTime property value. The last modified time of reporting for this account. This property is read-only.
     * @param value Value to set for the lastReportAggregationDateTime property.
     * @return a void
     */
    public void setLastReportAggregationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastReportAggregationDateTime = value;
    }
    /**
     * Sets the legacyPcManangementEnabled property value. The property to enable Non-MDM managed legacy PC management for this account. This property is read-only.
     * @param value Value to set for the legacyPcManangementEnabled property.
     * @return a void
     */
    public void setLegacyPcManangementEnabled(@javax.annotation.Nullable final Boolean value) {
        this._legacyPcManangementEnabled = value;
    }
    /**
     * Sets the macOSSoftwareUpdateAccountSummaries property value. The MacOS software update account summaries for this account.
     * @param value Value to set for the macOSSoftwareUpdateAccountSummaries property.
     * @return a void
     */
    public void setMacOSSoftwareUpdateAccountSummaries(@javax.annotation.Nullable final java.util.List<MacOSSoftwareUpdateAccountSummary> value) {
        this._macOSSoftwareUpdateAccountSummaries = value;
    }
    /**
     * Sets the managedDeviceCleanupSettings property value. Device cleanup rule
     * @param value Value to set for the managedDeviceCleanupSettings property.
     * @return a void
     */
    public void setManagedDeviceCleanupSettings(@javax.annotation.Nullable final ManagedDeviceCleanupSettings value) {
        this._managedDeviceCleanupSettings = value;
    }
    /**
     * Sets the managedDeviceEncryptionStates property value. Encryption report for devices in this account
     * @param value Value to set for the managedDeviceEncryptionStates property.
     * @return a void
     */
    public void setManagedDeviceEncryptionStates(@javax.annotation.Nullable final java.util.List<ManagedDeviceEncryptionState> value) {
        this._managedDeviceEncryptionStates = value;
    }
    /**
     * Sets the managedDeviceOverview property value. Device overview
     * @param value Value to set for the managedDeviceOverview property.
     * @return a void
     */
    public void setManagedDeviceOverview(@javax.annotation.Nullable final ManagedDeviceOverview value) {
        this._managedDeviceOverview = value;
    }
    /**
     * Sets the managedDevices property value. The list of managed devices.
     * @param value Value to set for the managedDevices property.
     * @return a void
     */
    public void setManagedDevices(@javax.annotation.Nullable final java.util.List<ManagedDevice> value) {
        this._managedDevices = value;
    }
    /**
     * Sets the maximumDepTokens property value. Maximum number of DEP tokens allowed per-tenant.
     * @param value Value to set for the maximumDepTokens property.
     * @return a void
     */
    public void setMaximumDepTokens(@javax.annotation.Nullable final Integer value) {
        this._maximumDepTokens = value;
    }
    /**
     * Sets the microsoftTunnelConfigurations property value. Collection of MicrosoftTunnelConfiguration settings associated with account.
     * @param value Value to set for the microsoftTunnelConfigurations property.
     * @return a void
     */
    public void setMicrosoftTunnelConfigurations(@javax.annotation.Nullable final java.util.List<MicrosoftTunnelConfiguration> value) {
        this._microsoftTunnelConfigurations = value;
    }
    /**
     * Sets the microsoftTunnelHealthThresholds property value. Collection of MicrosoftTunnelHealthThreshold settings associated with account.
     * @param value Value to set for the microsoftTunnelHealthThresholds property.
     * @return a void
     */
    public void setMicrosoftTunnelHealthThresholds(@javax.annotation.Nullable final java.util.List<MicrosoftTunnelHealthThreshold> value) {
        this._microsoftTunnelHealthThresholds = value;
    }
    /**
     * Sets the microsoftTunnelServerLogCollectionResponses property value. Collection of MicrosoftTunnelServerLogCollectionResponse settings associated with account.
     * @param value Value to set for the microsoftTunnelServerLogCollectionResponses property.
     * @return a void
     */
    public void setMicrosoftTunnelServerLogCollectionResponses(@javax.annotation.Nullable final java.util.List<MicrosoftTunnelServerLogCollectionResponse> value) {
        this._microsoftTunnelServerLogCollectionResponses = value;
    }
    /**
     * Sets the microsoftTunnelSites property value. Collection of MicrosoftTunnelSite settings associated with account.
     * @param value Value to set for the microsoftTunnelSites property.
     * @return a void
     */
    public void setMicrosoftTunnelSites(@javax.annotation.Nullable final java.util.List<MicrosoftTunnelSite> value) {
        this._microsoftTunnelSites = value;
    }
    /**
     * Sets the mobileAppTroubleshootingEvents property value. The collection property of MobileAppTroubleshootingEvent.
     * @param value Value to set for the mobileAppTroubleshootingEvents property.
     * @return a void
     */
    public void setMobileAppTroubleshootingEvents(@javax.annotation.Nullable final java.util.List<MobileAppTroubleshootingEvent> value) {
        this._mobileAppTroubleshootingEvents = value;
    }
    /**
     * Sets the mobileThreatDefenseConnectors property value. The list of Mobile threat Defense connectors configured by the tenant.
     * @param value Value to set for the mobileThreatDefenseConnectors property.
     * @return a void
     */
    public void setMobileThreatDefenseConnectors(@javax.annotation.Nullable final java.util.List<MobileThreatDefenseConnector> value) {
        this._mobileThreatDefenseConnectors = value;
    }
    /**
     * Sets the ndesConnectors property value. The collection of Ndes connectors for this account.
     * @param value Value to set for the ndesConnectors property.
     * @return a void
     */
    public void setNdesConnectors(@javax.annotation.Nullable final java.util.List<NdesConnector> value) {
        this._ndesConnectors = value;
    }
    /**
     * Sets the notificationMessageTemplates property value. The Notification Message Templates.
     * @param value Value to set for the notificationMessageTemplates property.
     * @return a void
     */
    public void setNotificationMessageTemplates(@javax.annotation.Nullable final java.util.List<NotificationMessageTemplate> value) {
        this._notificationMessageTemplates = value;
    }
    /**
     * Sets the oemWarrantyInformationOnboarding property value. List of OEM Warranty Statuses
     * @param value Value to set for the oemWarrantyInformationOnboarding property.
     * @return a void
     */
    public void setOemWarrantyInformationOnboarding(@javax.annotation.Nullable final java.util.List<OemWarrantyInformationOnboarding> value) {
        this._oemWarrantyInformationOnboarding = value;
    }
    /**
     * Sets the remoteActionAudits property value. The list of device remote action audits with the tenant.
     * @param value Value to set for the remoteActionAudits property.
     * @return a void
     */
    public void setRemoteActionAudits(@javax.annotation.Nullable final java.util.List<RemoteActionAudit> value) {
        this._remoteActionAudits = value;
    }
    /**
     * Sets the remoteAssistancePartners property value. The remote assist partners.
     * @param value Value to set for the remoteAssistancePartners property.
     * @return a void
     */
    public void setRemoteAssistancePartners(@javax.annotation.Nullable final java.util.List<RemoteAssistancePartner> value) {
        this._remoteAssistancePartners = value;
    }
    /**
     * Sets the remoteAssistanceSettings property value. The remote assistance settings singleton
     * @param value Value to set for the remoteAssistanceSettings property.
     * @return a void
     */
    public void setRemoteAssistanceSettings(@javax.annotation.Nullable final RemoteAssistanceSettings value) {
        this._remoteAssistanceSettings = value;
    }
    /**
     * Sets the reports property value. Reports singleton
     * @param value Value to set for the reports property.
     * @return a void
     */
    public void setReports(@javax.annotation.Nullable final DeviceManagementReports value) {
        this._reports = value;
    }
    /**
     * Sets the resourceAccessProfiles property value. Collection of resource access settings associated with account.
     * @param value Value to set for the resourceAccessProfiles property.
     * @return a void
     */
    public void setResourceAccessProfiles(@javax.annotation.Nullable final java.util.List<DeviceManagementResourceAccessProfileBase> value) {
        this._resourceAccessProfiles = value;
    }
    /**
     * Sets the resourceOperations property value. The Resource Operations.
     * @param value Value to set for the resourceOperations property.
     * @return a void
     */
    public void setResourceOperations(@javax.annotation.Nullable final java.util.List<ResourceOperation> value) {
        this._resourceOperations = value;
    }
    /**
     * Sets the reusablePolicySettings property value. List of all reusable settings that can be referred in a policy
     * @param value Value to set for the reusablePolicySettings property.
     * @return a void
     */
    public void setReusablePolicySettings(@javax.annotation.Nullable final java.util.List<DeviceManagementReusablePolicySetting> value) {
        this._reusablePolicySettings = value;
    }
    /**
     * Sets the reusableSettings property value. List of all reusable settings
     * @param value Value to set for the reusableSettings property.
     * @return a void
     */
    public void setReusableSettings(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingDefinition> value) {
        this._reusableSettings = value;
    }
    /**
     * Sets the roleAssignments property value. The Role Assignments.
     * @param value Value to set for the roleAssignments property.
     * @return a void
     */
    public void setRoleAssignments(@javax.annotation.Nullable final java.util.List<DeviceAndAppManagementRoleAssignment> value) {
        this._roleAssignments = value;
    }
    /**
     * Sets the roleDefinitions property value. The Role Definitions.
     * @param value Value to set for the roleDefinitions property.
     * @return a void
     */
    public void setRoleDefinitions(@javax.annotation.Nullable final java.util.List<RoleDefinition> value) {
        this._roleDefinitions = value;
    }
    /**
     * Sets the roleScopeTags property value. The Role Scope Tags.
     * @param value Value to set for the roleScopeTags property.
     * @return a void
     */
    public void setRoleScopeTags(@javax.annotation.Nullable final java.util.List<RoleScopeTag> value) {
        this._roleScopeTags = value;
    }
    /**
     * Sets the settingDefinitions property value. The device management intent setting definitions
     * @param value Value to set for the settingDefinitions property.
     * @return a void
     */
    public void setSettingDefinitions(@javax.annotation.Nullable final java.util.List<DeviceManagementSettingDefinition> value) {
        this._settingDefinitions = value;
    }
    /**
     * Sets the settings property value. Account level settings.
     * @param value Value to set for the settings property.
     * @return a void
     */
    public void setSettings(@javax.annotation.Nullable final DeviceManagementSettings value) {
        this._settings = value;
    }
    /**
     * Sets the softwareUpdateStatusSummary property value. The software update status summary.
     * @param value Value to set for the softwareUpdateStatusSummary property.
     * @return a void
     */
    public void setSoftwareUpdateStatusSummary(@javax.annotation.Nullable final SoftwareUpdateStatusSummary value) {
        this._softwareUpdateStatusSummary = value;
    }
    /**
     * Sets the subscriptions property value. Tenant's Subscription. Possible values are: none, intune, office365, intunePremium, intune_EDU, intune_SMB.
     * @param value Value to set for the subscriptions property.
     * @return a void
     */
    public void setSubscriptions(@javax.annotation.Nullable final DeviceManagementSubscriptions value) {
        this._subscriptions = value;
    }
    /**
     * Sets the subscriptionState property value. Tenant mobile device management subscription state. Possible values are: pending, active, warning, disabled, deleted, blocked, lockedOut.
     * @param value Value to set for the subscriptionState property.
     * @return a void
     */
    public void setSubscriptionState(@javax.annotation.Nullable final DeviceManagementSubscriptionState value) {
        this._subscriptionState = value;
    }
    /**
     * Sets the telecomExpenseManagementPartners property value. The telecom expense management partners.
     * @param value Value to set for the telecomExpenseManagementPartners property.
     * @return a void
     */
    public void setTelecomExpenseManagementPartners(@javax.annotation.Nullable final java.util.List<TelecomExpenseManagementPartner> value) {
        this._telecomExpenseManagementPartners = value;
    }
    /**
     * Sets the templates property value. The available templates
     * @param value Value to set for the templates property.
     * @return a void
     */
    public void setTemplates(@javax.annotation.Nullable final java.util.List<DeviceManagementTemplate> value) {
        this._templates = value;
    }
    /**
     * Sets the templateSettings property value. List of all TemplateSettings
     * @param value Value to set for the templateSettings property.
     * @return a void
     */
    public void setTemplateSettings(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingTemplate> value) {
        this._templateSettings = value;
    }
    /**
     * Sets the tenantAttachRBAC property value. TenantAttach RBAC Enablement
     * @param value Value to set for the tenantAttachRBAC property.
     * @return a void
     */
    public void setTenantAttachRBAC(@javax.annotation.Nullable final TenantAttachRBAC value) {
        this._tenantAttachRBAC = value;
    }
    /**
     * Sets the termsAndConditions property value. The terms and conditions associated with device management of the company.
     * @param value Value to set for the termsAndConditions property.
     * @return a void
     */
    public void setTermsAndConditions(@javax.annotation.Nullable final java.util.List<TermsAndConditions> value) {
        this._termsAndConditions = value;
    }
    /**
     * Sets the troubleshootingEvents property value. The list of troubleshooting events for the tenant.
     * @param value Value to set for the troubleshootingEvents property.
     * @return a void
     */
    public void setTroubleshootingEvents(@javax.annotation.Nullable final java.util.List<DeviceManagementTroubleshootingEvent> value) {
        this._troubleshootingEvents = value;
    }
    /**
     * Sets the unlicensedAdminstratorsEnabled property value. When enabled, users assigned as administrators via Role Assignment Memberships do not require an assigned Intune license. Prior to this, only Intune licensed users were granted permissions with an Intune role unless they were assigned a role via Azure Active Directory. You are limited to 350 unlicensed direct members for each AAD security group in a role assignment, but you can assign multiple AAD security groups to a role if you need to support more than 350 unlicensed administrators. Licensed administrators are unaffected, do not have to be direct members, nor does the 350 member limit apply. This property is read-only.
     * @param value Value to set for the unlicensedAdminstratorsEnabled property.
     * @return a void
     */
    public void setUnlicensedAdminstratorsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._unlicensedAdminstratorsEnabled = value;
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthApplicationPerformance property value. User experience analytics appHealth Application Performance
     * @param value Value to set for the userExperienceAnalyticsAppHealthApplicationPerformance property.
     * @return a void
     */
    public void setUserExperienceAnalyticsAppHealthApplicationPerformance(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthApplicationPerformance> value) {
        this._userExperienceAnalyticsAppHealthApplicationPerformance = value;
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion property value. User experience analytics appHealth Application Performance by App Version
     * @param value Value to set for the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion property.
     * @return a void
     */
    public void setUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion> value) {
        this._userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion = value;
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails property value. User experience analytics appHealth Application Performance by App Version details
     * @param value Value to set for the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails property.
     * @return a void
     */
    public void setUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails> value) {
        this._userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails = value;
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId property value. User experience analytics appHealth Application Performance by App Version Device Id
     * @param value Value to set for the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId property.
     * @return a void
     */
    public void setUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId> value) {
        this._userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId = value;
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion property value. User experience analytics appHealth Application Performance by OS Version
     * @param value Value to set for the userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion property.
     * @return a void
     */
    public void setUserExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion> value) {
        this._userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion = value;
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthDeviceModelPerformance property value. User experience analytics appHealth Model Performance
     * @param value Value to set for the userExperienceAnalyticsAppHealthDeviceModelPerformance property.
     * @return a void
     */
    public void setUserExperienceAnalyticsAppHealthDeviceModelPerformance(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthDeviceModelPerformance> value) {
        this._userExperienceAnalyticsAppHealthDeviceModelPerformance = value;
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthDevicePerformance property value. User experience analytics appHealth Device Performance
     * @param value Value to set for the userExperienceAnalyticsAppHealthDevicePerformance property.
     * @return a void
     */
    public void setUserExperienceAnalyticsAppHealthDevicePerformance(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthDevicePerformance> value) {
        this._userExperienceAnalyticsAppHealthDevicePerformance = value;
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthDevicePerformanceDetails property value. User experience analytics device performance details
     * @param value Value to set for the userExperienceAnalyticsAppHealthDevicePerformanceDetails property.
     * @return a void
     */
    public void setUserExperienceAnalyticsAppHealthDevicePerformanceDetails(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthDevicePerformanceDetails> value) {
        this._userExperienceAnalyticsAppHealthDevicePerformanceDetails = value;
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthOSVersionPerformance property value. User experience analytics appHealth OS version Performance
     * @param value Value to set for the userExperienceAnalyticsAppHealthOSVersionPerformance property.
     * @return a void
     */
    public void setUserExperienceAnalyticsAppHealthOSVersionPerformance(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthOSVersionPerformance> value) {
        this._userExperienceAnalyticsAppHealthOSVersionPerformance = value;
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthOverview property value. User experience analytics appHealth overview
     * @param value Value to set for the userExperienceAnalyticsAppHealthOverview property.
     * @return a void
     */
    public void setUserExperienceAnalyticsAppHealthOverview(@javax.annotation.Nullable final UserExperienceAnalyticsCategory value) {
        this._userExperienceAnalyticsAppHealthOverview = value;
    }
    /**
     * Sets the userExperienceAnalyticsBaselines property value. User experience analytics baselines
     * @param value Value to set for the userExperienceAnalyticsBaselines property.
     * @return a void
     */
    public void setUserExperienceAnalyticsBaselines(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsBaseline> value) {
        this._userExperienceAnalyticsBaselines = value;
    }
    /**
     * Sets the userExperienceAnalyticsBatteryHealthAppImpact property value. User Experience Analytics Battery Health App Impact
     * @param value Value to set for the userExperienceAnalyticsBatteryHealthAppImpact property.
     * @return a void
     */
    public void setUserExperienceAnalyticsBatteryHealthAppImpact(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsBatteryHealthAppImpact> value) {
        this._userExperienceAnalyticsBatteryHealthAppImpact = value;
    }
    /**
     * Sets the userExperienceAnalyticsBatteryHealthCapacityDetails property value. User Experience Analytics Battery Health Capacity Details
     * @param value Value to set for the userExperienceAnalyticsBatteryHealthCapacityDetails property.
     * @return a void
     */
    public void setUserExperienceAnalyticsBatteryHealthCapacityDetails(@javax.annotation.Nullable final UserExperienceAnalyticsBatteryHealthCapacityDetails value) {
        this._userExperienceAnalyticsBatteryHealthCapacityDetails = value;
    }
    /**
     * Sets the userExperienceAnalyticsBatteryHealthDeviceAppImpact property value. User Experience Analytics Battery Health Device App Impact
     * @param value Value to set for the userExperienceAnalyticsBatteryHealthDeviceAppImpact property.
     * @return a void
     */
    public void setUserExperienceAnalyticsBatteryHealthDeviceAppImpact(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsBatteryHealthDeviceAppImpact> value) {
        this._userExperienceAnalyticsBatteryHealthDeviceAppImpact = value;
    }
    /**
     * Sets the userExperienceAnalyticsBatteryHealthDevicePerformance property value. User Experience Analytics Battery Health Device Performance
     * @param value Value to set for the userExperienceAnalyticsBatteryHealthDevicePerformance property.
     * @return a void
     */
    public void setUserExperienceAnalyticsBatteryHealthDevicePerformance(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsBatteryHealthDevicePerformance> value) {
        this._userExperienceAnalyticsBatteryHealthDevicePerformance = value;
    }
    /**
     * Sets the userExperienceAnalyticsBatteryHealthDeviceRuntimeHistory property value. User Experience Analytics Battery Health Device Runtime History
     * @param value Value to set for the userExperienceAnalyticsBatteryHealthDeviceRuntimeHistory property.
     * @return a void
     */
    public void setUserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory> value) {
        this._userExperienceAnalyticsBatteryHealthDeviceRuntimeHistory = value;
    }
    /**
     * Sets the userExperienceAnalyticsBatteryHealthModelPerformance property value. User Experience Analytics Battery Health Model Performance
     * @param value Value to set for the userExperienceAnalyticsBatteryHealthModelPerformance property.
     * @return a void
     */
    public void setUserExperienceAnalyticsBatteryHealthModelPerformance(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsBatteryHealthModelPerformance> value) {
        this._userExperienceAnalyticsBatteryHealthModelPerformance = value;
    }
    /**
     * Sets the userExperienceAnalyticsBatteryHealthOsPerformance property value. User Experience Analytics Battery Health Os Performance
     * @param value Value to set for the userExperienceAnalyticsBatteryHealthOsPerformance property.
     * @return a void
     */
    public void setUserExperienceAnalyticsBatteryHealthOsPerformance(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsBatteryHealthOsPerformance> value) {
        this._userExperienceAnalyticsBatteryHealthOsPerformance = value;
    }
    /**
     * Sets the userExperienceAnalyticsBatteryHealthRuntimeDetails property value. User Experience Analytics Battery Health Runtime Details
     * @param value Value to set for the userExperienceAnalyticsBatteryHealthRuntimeDetails property.
     * @return a void
     */
    public void setUserExperienceAnalyticsBatteryHealthRuntimeDetails(@javax.annotation.Nullable final UserExperienceAnalyticsBatteryHealthRuntimeDetails value) {
        this._userExperienceAnalyticsBatteryHealthRuntimeDetails = value;
    }
    /**
     * Sets the userExperienceAnalyticsCategories property value. User experience analytics categories
     * @param value Value to set for the userExperienceAnalyticsCategories property.
     * @return a void
     */
    public void setUserExperienceAnalyticsCategories(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsCategory> value) {
        this._userExperienceAnalyticsCategories = value;
    }
    /**
     * Sets the userExperienceAnalyticsDeviceMetricHistory property value. User experience analytics device metric history
     * @param value Value to set for the userExperienceAnalyticsDeviceMetricHistory property.
     * @return a void
     */
    public void setUserExperienceAnalyticsDeviceMetricHistory(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsMetricHistory> value) {
        this._userExperienceAnalyticsDeviceMetricHistory = value;
    }
    /**
     * Sets the userExperienceAnalyticsDevicePerformance property value. User experience analytics device performance
     * @param value Value to set for the userExperienceAnalyticsDevicePerformance property.
     * @return a void
     */
    public void setUserExperienceAnalyticsDevicePerformance(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsDevicePerformance> value) {
        this._userExperienceAnalyticsDevicePerformance = value;
    }
    /**
     * Sets the userExperienceAnalyticsDeviceScope property value. The user experience analytics device scope entity endpoint to trigger on the service to either START or STOP computing metrics data based on a device scope configuration.
     * @param value Value to set for the userExperienceAnalyticsDeviceScope property.
     * @return a void
     */
    public void setUserExperienceAnalyticsDeviceScope(@javax.annotation.Nullable final UserExperienceAnalyticsDeviceScope value) {
        this._userExperienceAnalyticsDeviceScope = value;
    }
    /**
     * Sets the userExperienceAnalyticsDeviceScopes property value. The user experience analytics device scope entity contains device scope configuration use to apply filtering on the endpoint analytics reports.
     * @param value Value to set for the userExperienceAnalyticsDeviceScopes property.
     * @return a void
     */
    public void setUserExperienceAnalyticsDeviceScopes(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsDeviceScope> value) {
        this._userExperienceAnalyticsDeviceScopes = value;
    }
    /**
     * Sets the userExperienceAnalyticsDeviceScores property value. User experience analytics device scores
     * @param value Value to set for the userExperienceAnalyticsDeviceScores property.
     * @return a void
     */
    public void setUserExperienceAnalyticsDeviceScores(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsDeviceScores> value) {
        this._userExperienceAnalyticsDeviceScores = value;
    }
    /**
     * Sets the userExperienceAnalyticsDeviceStartupHistory property value. User experience analytics device Startup History
     * @param value Value to set for the userExperienceAnalyticsDeviceStartupHistory property.
     * @return a void
     */
    public void setUserExperienceAnalyticsDeviceStartupHistory(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsDeviceStartupHistory> value) {
        this._userExperienceAnalyticsDeviceStartupHistory = value;
    }
    /**
     * Sets the userExperienceAnalyticsDeviceStartupProcesses property value. User experience analytics device Startup Processes
     * @param value Value to set for the userExperienceAnalyticsDeviceStartupProcesses property.
     * @return a void
     */
    public void setUserExperienceAnalyticsDeviceStartupProcesses(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsDeviceStartupProcess> value) {
        this._userExperienceAnalyticsDeviceStartupProcesses = value;
    }
    /**
     * Sets the userExperienceAnalyticsDeviceStartupProcessPerformance property value. User experience analytics device Startup Process Performance
     * @param value Value to set for the userExperienceAnalyticsDeviceStartupProcessPerformance property.
     * @return a void
     */
    public void setUserExperienceAnalyticsDeviceStartupProcessPerformance(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsDeviceStartupProcessPerformance> value) {
        this._userExperienceAnalyticsDeviceStartupProcessPerformance = value;
    }
    /**
     * Sets the userExperienceAnalyticsDevicesWithoutCloudIdentity property value. User experience analytics devices without cloud identity.
     * @param value Value to set for the userExperienceAnalyticsDevicesWithoutCloudIdentity property.
     * @return a void
     */
    public void setUserExperienceAnalyticsDevicesWithoutCloudIdentity(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsDeviceWithoutCloudIdentity> value) {
        this._userExperienceAnalyticsDevicesWithoutCloudIdentity = value;
    }
    /**
     * Sets the userExperienceAnalyticsImpactingProcess property value. User experience analytics impacting process
     * @param value Value to set for the userExperienceAnalyticsImpactingProcess property.
     * @return a void
     */
    public void setUserExperienceAnalyticsImpactingProcess(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsImpactingProcess> value) {
        this._userExperienceAnalyticsImpactingProcess = value;
    }
    /**
     * Sets the userExperienceAnalyticsMetricHistory property value. User experience analytics metric history
     * @param value Value to set for the userExperienceAnalyticsMetricHistory property.
     * @return a void
     */
    public void setUserExperienceAnalyticsMetricHistory(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsMetricHistory> value) {
        this._userExperienceAnalyticsMetricHistory = value;
    }
    /**
     * Sets the userExperienceAnalyticsModelScores property value. User experience analytics model scores
     * @param value Value to set for the userExperienceAnalyticsModelScores property.
     * @return a void
     */
    public void setUserExperienceAnalyticsModelScores(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsModelScores> value) {
        this._userExperienceAnalyticsModelScores = value;
    }
    /**
     * Sets the userExperienceAnalyticsNotAutopilotReadyDevice property value. User experience analytics devices not Windows Autopilot ready.
     * @param value Value to set for the userExperienceAnalyticsNotAutopilotReadyDevice property.
     * @return a void
     */
    public void setUserExperienceAnalyticsNotAutopilotReadyDevice(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsNotAutopilotReadyDevice> value) {
        this._userExperienceAnalyticsNotAutopilotReadyDevice = value;
    }
    /**
     * Sets the userExperienceAnalyticsOverview property value. User experience analytics overview
     * @param value Value to set for the userExperienceAnalyticsOverview property.
     * @return a void
     */
    public void setUserExperienceAnalyticsOverview(@javax.annotation.Nullable final UserExperienceAnalyticsOverview value) {
        this._userExperienceAnalyticsOverview = value;
    }
    /**
     * Sets the userExperienceAnalyticsRegressionSummary property value. User experience analytics regression summary
     * @param value Value to set for the userExperienceAnalyticsRegressionSummary property.
     * @return a void
     */
    public void setUserExperienceAnalyticsRegressionSummary(@javax.annotation.Nullable final UserExperienceAnalyticsRegressionSummary value) {
        this._userExperienceAnalyticsRegressionSummary = value;
    }
    /**
     * Sets the userExperienceAnalyticsRemoteConnection property value. User experience analytics remote connection
     * @param value Value to set for the userExperienceAnalyticsRemoteConnection property.
     * @return a void
     */
    public void setUserExperienceAnalyticsRemoteConnection(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsRemoteConnection> value) {
        this._userExperienceAnalyticsRemoteConnection = value;
    }
    /**
     * Sets the userExperienceAnalyticsResourcePerformance property value. User experience analytics resource performance
     * @param value Value to set for the userExperienceAnalyticsResourcePerformance property.
     * @return a void
     */
    public void setUserExperienceAnalyticsResourcePerformance(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsResourcePerformance> value) {
        this._userExperienceAnalyticsResourcePerformance = value;
    }
    /**
     * Sets the userExperienceAnalyticsScoreHistory property value. User experience analytics device Startup Score History
     * @param value Value to set for the userExperienceAnalyticsScoreHistory property.
     * @return a void
     */
    public void setUserExperienceAnalyticsScoreHistory(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsScoreHistory> value) {
        this._userExperienceAnalyticsScoreHistory = value;
    }
    /**
     * Sets the userExperienceAnalyticsSettings property value. User experience analytics device settings
     * @param value Value to set for the userExperienceAnalyticsSettings property.
     * @return a void
     */
    public void setUserExperienceAnalyticsSettings(@javax.annotation.Nullable final UserExperienceAnalyticsSettings value) {
        this._userExperienceAnalyticsSettings = value;
    }
    /**
     * Sets the userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric property value. User experience analytics work from anywhere hardware readiness metrics.
     * @param value Value to set for the userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric property.
     * @return a void
     */
    public void setUserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric(@javax.annotation.Nullable final UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric value) {
        this._userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric = value;
    }
    /**
     * Sets the userExperienceAnalyticsWorkFromAnywhereMetrics property value. User experience analytics work from anywhere metrics.
     * @param value Value to set for the userExperienceAnalyticsWorkFromAnywhereMetrics property.
     * @return a void
     */
    public void setUserExperienceAnalyticsWorkFromAnywhereMetrics(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsWorkFromAnywhereMetric> value) {
        this._userExperienceAnalyticsWorkFromAnywhereMetrics = value;
    }
    /**
     * Sets the userExperienceAnalyticsWorkFromAnywhereModelPerformance property value. The user experience analytics work from anywhere model performance
     * @param value Value to set for the userExperienceAnalyticsWorkFromAnywhereModelPerformance property.
     * @return a void
     */
    public void setUserExperienceAnalyticsWorkFromAnywhereModelPerformance(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsWorkFromAnywhereModelPerformance> value) {
        this._userExperienceAnalyticsWorkFromAnywhereModelPerformance = value;
    }
    /**
     * Sets the userPfxCertificates property value. Collection of PFX certificates associated with a user.
     * @param value Value to set for the userPfxCertificates property.
     * @return a void
     */
    public void setUserPfxCertificates(@javax.annotation.Nullable final java.util.List<UserPFXCertificate> value) {
        this._userPfxCertificates = value;
    }
    /**
     * Sets the virtualEndpoint property value. The virtualEndpoint property
     * @param value Value to set for the virtualEndpoint property.
     * @return a void
     */
    public void setVirtualEndpoint(@javax.annotation.Nullable final VirtualEndpoint value) {
        this._virtualEndpoint = value;
    }
    /**
     * Sets the windowsAutopilotDeploymentProfiles property value. Windows auto pilot deployment profiles
     * @param value Value to set for the windowsAutopilotDeploymentProfiles property.
     * @return a void
     */
    public void setWindowsAutopilotDeploymentProfiles(@javax.annotation.Nullable final java.util.List<WindowsAutopilotDeploymentProfile> value) {
        this._windowsAutopilotDeploymentProfiles = value;
    }
    /**
     * Sets the windowsAutopilotDeviceIdentities property value. The Windows autopilot device identities contained collection.
     * @param value Value to set for the windowsAutopilotDeviceIdentities property.
     * @return a void
     */
    public void setWindowsAutopilotDeviceIdentities(@javax.annotation.Nullable final java.util.List<WindowsAutopilotDeviceIdentity> value) {
        this._windowsAutopilotDeviceIdentities = value;
    }
    /**
     * Sets the windowsAutopilotSettings property value. The Windows autopilot account settings.
     * @param value Value to set for the windowsAutopilotSettings property.
     * @return a void
     */
    public void setWindowsAutopilotSettings(@javax.annotation.Nullable final WindowsAutopilotSettings value) {
        this._windowsAutopilotSettings = value;
    }
    /**
     * Sets the windowsDriverUpdateProfiles property value. A collection of windows driver update profiles
     * @param value Value to set for the windowsDriverUpdateProfiles property.
     * @return a void
     */
    public void setWindowsDriverUpdateProfiles(@javax.annotation.Nullable final java.util.List<WindowsDriverUpdateProfile> value) {
        this._windowsDriverUpdateProfiles = value;
    }
    /**
     * Sets the windowsFeatureUpdateProfiles property value. A collection of windows feature update profiles
     * @param value Value to set for the windowsFeatureUpdateProfiles property.
     * @return a void
     */
    public void setWindowsFeatureUpdateProfiles(@javax.annotation.Nullable final java.util.List<WindowsFeatureUpdateProfile> value) {
        this._windowsFeatureUpdateProfiles = value;
    }
    /**
     * Sets the windowsInformationProtectionAppLearningSummaries property value. The windows information protection app learning summaries.
     * @param value Value to set for the windowsInformationProtectionAppLearningSummaries property.
     * @return a void
     */
    public void setWindowsInformationProtectionAppLearningSummaries(@javax.annotation.Nullable final java.util.List<WindowsInformationProtectionAppLearningSummary> value) {
        this._windowsInformationProtectionAppLearningSummaries = value;
    }
    /**
     * Sets the windowsInformationProtectionNetworkLearningSummaries property value. The windows information protection network learning summaries.
     * @param value Value to set for the windowsInformationProtectionNetworkLearningSummaries property.
     * @return a void
     */
    public void setWindowsInformationProtectionNetworkLearningSummaries(@javax.annotation.Nullable final java.util.List<WindowsInformationProtectionNetworkLearningSummary> value) {
        this._windowsInformationProtectionNetworkLearningSummaries = value;
    }
    /**
     * Sets the windowsMalwareInformation property value. The list of affected malware in the tenant.
     * @param value Value to set for the windowsMalwareInformation property.
     * @return a void
     */
    public void setWindowsMalwareInformation(@javax.annotation.Nullable final java.util.List<WindowsMalwareInformation> value) {
        this._windowsMalwareInformation = value;
    }
    /**
     * Sets the windowsMalwareOverview property value. Malware overview for windows devices.
     * @param value Value to set for the windowsMalwareOverview property.
     * @return a void
     */
    public void setWindowsMalwareOverview(@javax.annotation.Nullable final WindowsMalwareOverview value) {
        this._windowsMalwareOverview = value;
    }
    /**
     * Sets the windowsQualityUpdateProfiles property value. A collection of windows quality update profiles
     * @param value Value to set for the windowsQualityUpdateProfiles property.
     * @return a void
     */
    public void setWindowsQualityUpdateProfiles(@javax.annotation.Nullable final java.util.List<WindowsQualityUpdateProfile> value) {
        this._windowsQualityUpdateProfiles = value;
    }
    /**
     * Sets the windowsUpdateCatalogItems property value. A collection of windows update catalog items (fetaure updates item , quality updates item)
     * @param value Value to set for the windowsUpdateCatalogItems property.
     * @return a void
     */
    public void setWindowsUpdateCatalogItems(@javax.annotation.Nullable final java.util.List<WindowsUpdateCatalogItem> value) {
        this._windowsUpdateCatalogItems = value;
    }
    /**
     * Sets the zebraFotaArtifacts property value. The Collection of ZebraFotaArtifacts.
     * @param value Value to set for the zebraFotaArtifacts property.
     * @return a void
     */
    public void setZebraFotaArtifacts(@javax.annotation.Nullable final java.util.List<ZebraFotaArtifact> value) {
        this._zebraFotaArtifacts = value;
    }
    /**
     * Sets the zebraFotaConnector property value. The singleton ZebraFotaConnector associated with account.
     * @param value Value to set for the zebraFotaConnector property.
     * @return a void
     */
    public void setZebraFotaConnector(@javax.annotation.Nullable final ZebraFotaConnector value) {
        this._zebraFotaConnector = value;
    }
    /**
     * Sets the zebraFotaDeployments property value. Collection of ZebraFotaDeployments associated with account.
     * @param value Value to set for the zebraFotaDeployments property.
     * @return a void
     */
    public void setZebraFotaDeployments(@javax.annotation.Nullable final java.util.List<ZebraFotaDeployment> value) {
        this._zebraFotaDeployments = value;
    }
}
