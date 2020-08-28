// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.requests.extensions.IInvitationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IInvitationRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserRequestBuilder;
import com.microsoft.graph.requests.extensions.IActivityStatisticsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IActivityStatisticsRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IServicePrincipalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IServicePrincipalRequestBuilder;
import com.microsoft.graph.requests.extensions.IBookingBusinessCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IBookingBusinessRequestBuilder;
import com.microsoft.graph.requests.extensions.IBookingCurrencyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IBookingCurrencyRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityProviderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityProviderRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationRequestBuilder;
import com.microsoft.graph.requests.extensions.IResourceSpecificPermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IResourceSpecificPermissionGrantRequestBuilder;
import com.microsoft.graph.requests.extensions.IAdministrativeUnitCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAdministrativeUnitRequestBuilder;
import com.microsoft.graph.requests.extensions.IAllowedDataLocationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAllowedDataLocationRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.ICertificateBasedAuthConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICertificateBasedAuthConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IOrgContactCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOrgContactRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainDnsRecordCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainDnsRecordRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryRoleTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryRoleTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectorySettingTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectorySettingTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IOrganizationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOrganizationRequestBuilder;
import com.microsoft.graph.requests.extensions.IOAuth2PermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOAuth2PermissionGrantRequestBuilder;
import com.microsoft.graph.requests.extensions.IScopedRoleMembershipCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IScopedRoleMembershipRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectorySettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectorySettingRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscribedSkuCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscribedSkuRequestBuilder;
import com.microsoft.graph.requests.extensions.IContractCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContractRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlaceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlaceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveRequestBuilder;
import com.microsoft.graph.requests.extensions.ISharedDriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISharedDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteRequestBuilder;
import com.microsoft.graph.requests.extensions.ISchemaExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISchemaExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnPremisesPublishingProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnPremisesPublishingProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectorGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectorGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IAttributeMappingFunctionSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAttributeMappingFunctionSchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.IFilterOperatorSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IFilterOperatorSchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewRequestBuilder;
import com.microsoft.graph.requests.extensions.IBusinessFlowTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IBusinessFlowTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewDecisionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewDecisionRequestBuilder;
import com.microsoft.graph.requests.extensions.IProgramCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IProgramRequestBuilder;
import com.microsoft.graph.requests.extensions.IProgramControlCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IProgramControlRequestBuilder;
import com.microsoft.graph.requests.extensions.IProgramControlTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IProgramControlTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.IApprovalWorkflowProviderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IApprovalWorkflowProviderRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgreementCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgreementRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgreementAcceptanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgreementAcceptanceRequestBuilder;
import com.microsoft.graph.requests.extensions.IRiskDetectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRiskDetectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRiskyUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRiskyUserRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedAccessCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedAccessRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceSubjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceSubjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedOperationEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedOperationEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedSignupStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedSignupStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedApprovalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedApprovalRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IDataPolicyOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDataPolicyOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.ICommandCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICommandRequestBuilder;
import com.microsoft.graph.requests.extensions.IPayloadResponseCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPayloadResponseRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscriptionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscriptionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExternalConnectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExternalConnectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamRequestBuilder;
import com.microsoft.graph.requests.extensions.IChatCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IChatRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuditLogRootRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootRequestBuilder;
import com.microsoft.graph.requests.extensions.IBitlockerRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityContainerRequestBuilder;
import com.microsoft.graph.requests.extensions.ITrustFrameworkRequestBuilder;
import com.microsoft.graph.requests.extensions.IComplianceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDataClassificationServiceRequestBuilder;
import com.microsoft.graph.requests.extensions.IInformationProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPolicyRootRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationRootRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.IStoreRequestBuilder;
import com.microsoft.graph.requests.extensions.ICloudCommunicationsRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityGovernanceRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityProtectionRootRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceAppManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.IOfficeConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.ISearchRequestBuilder;
import com.microsoft.graph.requests.extensions.IFinancialsRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecurityRequestBuilder;
import com.microsoft.graph.requests.extensions.ICommsApplicationRequestBuilder;
import com.microsoft.graph.requests.extensions.IExternalRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamworkRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppCatalogsRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.google.gson.JsonObject;
import com.microsoft.graph.models.extensions.IBaseGraphServiceClient;
import com.microsoft.graph.requests.extensions.CustomRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Graph Service Client.
 */
public interface IGraphServiceClient extends IBaseGraphServiceClient {
    
    <T> CustomRequestBuilder<T> customRequest(final String url, final Class<T> responseType);
	
    CustomRequestBuilder<JsonObject> customRequest(final String url);
}
