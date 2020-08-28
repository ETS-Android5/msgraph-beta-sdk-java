// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.ComanagedDevicesSummary;
import com.microsoft.graph.models.extensions.ComanagementEligibleDevicesSummary;
import com.microsoft.graph.models.extensions.RolePermission;
import com.microsoft.graph.models.extensions.RoleScopeTag;
import com.microsoft.graph.models.extensions.DeviceAndAppManagementAssignedRoleDetails;
import com.microsoft.graph.requests.extensions.IAuditEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuditEventRequestBuilder;
import com.microsoft.graph.requests.extensions.AuditEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AuditEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidForWorkAppConfigurationSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidForWorkAppConfigurationSchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidForWorkAppConfigurationSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidForWorkAppConfigurationSchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidForWorkEnrollmentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidForWorkEnrollmentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidForWorkEnrollmentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidForWorkEnrollmentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidManagedStoreAppConfigurationSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidManagedStoreAppConfigurationSchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidManagedStoreAppConfigurationSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidManagedStoreAppConfigurationSchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidDeviceOwnerEnrollmentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidDeviceOwnerEnrollmentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidDeviceOwnerEnrollmentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidDeviceOwnerEnrollmentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceAndAppManagementAssignmentFilterCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceAndAppManagementAssignmentFilterRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceAndAppManagementAssignmentFilterCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceAndAppManagementAssignmentFilterRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsRequestBuilder;
import com.microsoft.graph.requests.extensions.TermsAndConditionsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TermsAndConditionsRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicySettingStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicySettingStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.ICartToClassAssociationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICartToClassAssociationRequestBuilder;
import com.microsoft.graph.requests.extensions.CartToClassAssociationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CartToClassAssociationRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosUpdateDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosUpdateDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IosUpdateDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IosUpdateDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.INdesConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.INdesConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.NdesConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.NdesConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IRestrictedAppsViolationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRestrictedAppsViolationRequestBuilder;
import com.microsoft.graph.requests.extensions.RestrictedAppsViolationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RestrictedAppsViolationRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceEncryptionStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceEncryptionStateRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceEncryptionStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceEncryptionStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationConflictSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationConflictSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationConflictSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationConflictSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAllDeviceCertificateStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAllDeviceCertificateStateRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAllDeviceCertificateStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAllDeviceCertificateStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceEnrollmentConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceEnrollmentConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeOnPremisesPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeOnPremisesPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeOnPremisesPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeOnPremisesPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileThreatDefenseConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileThreatDefenseConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileThreatDefenseConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileThreatDefenseConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.IComplianceManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IComplianceManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.ComplianceManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ComplianceManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IRemoteActionAuditCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRemoteActionAuditRequestBuilder;
import com.microsoft.graph.requests.extensions.RemoteActionAuditCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RemoteActionAuditRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceShellScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceShellScriptRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceShellScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceShellScriptRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceHealthScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceHealthScriptRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceHealthScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceHealthScriptRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceScriptRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceScriptRequestBuilder;
import com.microsoft.graph.requests.extensions.IDetectedAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDetectedAppRequestBuilder;
import com.microsoft.graph.requests.extensions.DetectedAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DetectedAppRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsMalwareInformationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsMalwareInformationRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsMalwareInformationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsMalwareInformationRequestBuilder;
import com.microsoft.graph.requests.extensions.IDataSharingConsentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDataSharingConsentRequestBuilder;
import com.microsoft.graph.requests.extensions.DataSharingConsentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DataSharingConsentRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsBaselineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsBaselineRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsBaselineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsBaselineRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsDevicePerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsDevicePerformanceRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDevicePerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDevicePerformanceRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsDeviceStartupHistoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsDeviceStartupHistoryRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceStartupHistoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceStartupHistoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsDeviceStartupProcessCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsDeviceStartupProcessRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceStartupProcessCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceStartupProcessRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsDeviceStartupProcessPerformanceRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceStartupProcessPerformanceRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsScoreHistoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsScoreHistoryRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsScoreHistoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsScoreHistoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsMetricHistoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsMetricHistoryRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsMetricHistoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsMetricHistoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsAppHealthApplicationPerformanceRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthApplicationPerformanceRequestBuilder;
import com.microsoft.graph.requests.extensions.IComanagementEligibleDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IComanagementEligibleDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.ComanagementEligibleDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ComanagementEligibleDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementDerivedCredentialSettingsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementDerivedCredentialSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementDerivedCredentialSettingsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementDerivedCredentialSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeploymentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeploymentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeploymentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeploymentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IImportedDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IImportedDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.ImportedDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ImportedDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.IDepOnboardingSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDepOnboardingSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.DepOnboardingSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DepOnboardingSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.IImportedWindowsAutopilotDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IImportedWindowsAutopilotDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.ImportedWindowsAutopilotDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ImportedWindowsAutopilotDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppleUserInitiatedEnrollmentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppleUserInitiatedEnrollmentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.AppleUserInitiatedEnrollmentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AppleUserInitiatedEnrollmentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagementConditionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagementConditionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagementConditionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagementConditionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagementConditionStatementCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagementConditionStatementRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagementConditionStatementCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagementConditionStatementRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyObjectFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyObjectFileRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyObjectFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyObjectFileRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyMigrationReportCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyMigrationReportRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyMigrationReportCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyMigrationReportRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionFileRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionFileRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyUploadedDefinitionFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyUploadedDefinitionFileRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyUploadedDefinitionFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyUploadedDefinitionFileRequestBuilder;
import com.microsoft.graph.requests.extensions.INotificationMessageTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.INotificationMessageTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.NotificationMessageTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.NotificationMessageTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementDomainJoinConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementDomainJoinConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementDomainJoinConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementDomainJoinConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceAndAppManagementRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceAndAppManagementRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceAndAppManagementRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceAndAppManagementRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleScopeTagCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleScopeTagRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleScopeTagCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleScopeTagRequestBuilder;
import com.microsoft.graph.requests.extensions.IResourceOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IResourceOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.ResourceOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ResourceOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.IRemoteAssistancePartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRemoteAssistancePartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.RemoteAssistancePartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RemoteAssistancePartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.ITelecomExpenseManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITelecomExpenseManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.TelecomExpenseManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TelecomExpenseManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.IEmbeddedSIMActivationCodePoolCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEmbeddedSIMActivationCodePoolRequestBuilder;
import com.microsoft.graph.requests.extensions.EmbeddedSIMActivationCodePoolCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EmbeddedSIMActivationCodePoolRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementAutopilotEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementAutopilotEventRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementAutopilotEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementAutopilotEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsFeatureUpdateProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsFeatureUpdateProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsFeatureUpdateProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsFeatureUpdateProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLearningSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLearningSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionNetworkLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionNetworkLearningSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionNetworkLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionNetworkLearningSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IIntuneBrandingProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIntuneBrandingProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IntuneBrandingProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IntuneBrandingProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserPFXCertificateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserPFXCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.UserPFXCertificateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserPFXCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidForWorkSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidForWorkSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidManagedStoreAccountEnterpriseSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidManagedStoreAccountEnterpriseSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.ISoftwareUpdateStatusSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.SoftwareUpdateStatusSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IAdvancedThreatProtectionOnboardingStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.AdvancedThreatProtectionOnboardingStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationUserStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationUserStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnPremisesConditionalAccessSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.OnPremisesConditionalAccessSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplePushNotificationCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplePushNotificationCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsRegressionSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsRegressionSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementReportsRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementReportsRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Request.
 */
public class DeviceManagementRequest extends BaseRequest implements IDeviceManagementRequest {
	
    /**
     * The request for the DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagement.class);
    }

    /**
     * Gets the DeviceManagement from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceManagement> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagement from the service
     *
     * @return the DeviceManagement from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagement get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DeviceManagement> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceManagement with a source
     *
     * @param sourceDeviceManagement the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceManagement sourceDeviceManagement, final ICallback<DeviceManagement> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagement);
    }

    /**
     * Patches this DeviceManagement with a source
     *
     * @param sourceDeviceManagement the source object with updates
     * @return the updated DeviceManagement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagement patch(final DeviceManagement sourceDeviceManagement) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagement);
    }

    /**
     * Creates a DeviceManagement with a new object
     *
     * @param newDeviceManagement the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceManagement newDeviceManagement, final ICallback<DeviceManagement> callback) {
        send(HttpMethod.POST, callback, newDeviceManagement);
    }

    /**
     * Creates a DeviceManagement with a new object
     *
     * @param newDeviceManagement the new object to create
     * @return the created DeviceManagement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagement post(final DeviceManagement newDeviceManagement) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagement);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceManagementRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceManagementRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceManagementRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceManagementRequest)this;
     }

}

