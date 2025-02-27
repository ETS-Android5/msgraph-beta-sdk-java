// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.managedtenants.models.ManagedTenant;
import com.microsoft.graph.managedtenants.requests.AggregatedPolicyComplianceCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.AggregatedPolicyComplianceRequestBuilder;
import com.microsoft.graph.managedtenants.requests.AuditEventCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.AuditEventRequestBuilder;
import com.microsoft.graph.managedtenants.requests.CloudPcConnectionCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.CloudPcConnectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.CloudPcDeviceCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.CloudPcDeviceRequestBuilder;
import com.microsoft.graph.managedtenants.requests.CloudPcOverviewCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.CloudPcOverviewRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ConditionalAccessPolicyCoverageCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ConditionalAccessPolicyCoverageRequestBuilder;
import com.microsoft.graph.managedtenants.requests.CredentialUserRegistrationsSummaryCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.CredentialUserRegistrationsSummaryRequestBuilder;
import com.microsoft.graph.managedtenants.requests.DeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.DeviceCompliancePolicySettingStateSummaryRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagedDeviceComplianceCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagedDeviceComplianceRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagedDeviceComplianceTrendCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagedDeviceComplianceTrendRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementActionCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementActionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementActionTenantDeploymentStatusCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementActionTenantDeploymentStatusRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementIntentCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementIntentRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementTemplateCollectionObjectCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementTemplateCollectionObjectRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementTemplateCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementTemplateRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementTemplateStepCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementTemplateStepRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementTemplateStepVersionCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementTemplateStepVersionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.MyRoleCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.MyRoleRequestBuilder;
import com.microsoft.graph.managedtenants.requests.TenantGroupCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.TenantGroupRequestBuilder;
import com.microsoft.graph.managedtenants.requests.TenantCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.TenantRequestBuilder;
import com.microsoft.graph.managedtenants.requests.TenantCustomizedInformationCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.TenantCustomizedInformationRequestBuilder;
import com.microsoft.graph.managedtenants.requests.TenantDetailedInformationCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.TenantDetailedInformationRequestBuilder;
import com.microsoft.graph.managedtenants.requests.TenantTagCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.TenantTagRequestBuilder;
import com.microsoft.graph.managedtenants.requests.WindowsDeviceMalwareStateCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.WindowsDeviceMalwareStateRequestBuilder;
import com.microsoft.graph.managedtenants.requests.WindowsProtectionStateCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.WindowsProtectionStateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Tenant Request Builder.
 */
public class ManagedTenantRequestBuilder extends BaseRequestBuilder<ManagedTenant> {

    /**
     * The request builder for the ManagedTenant
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedTenantRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ManagedTenantRequest instance
     */
    @Nonnull
    public ManagedTenantRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ManagedTenantRequest instance
     */
    @Nonnull
    public ManagedTenantRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.managedtenants.requests.ManagedTenantRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the AggregatedPolicyCompliance collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public AggregatedPolicyComplianceCollectionRequestBuilder aggregatedPolicyCompliances() {
        return new AggregatedPolicyComplianceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("aggregatedPolicyCompliances"), getClient(), null);
    }

    /**
     * Gets a request builder for the AggregatedPolicyCompliance item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public AggregatedPolicyComplianceRequestBuilder aggregatedPolicyCompliances(@Nonnull final String id) {
        return new AggregatedPolicyComplianceRequestBuilder(getRequestUrlWithAdditionalSegment("aggregatedPolicyCompliances") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the AuditEvent collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public AuditEventCollectionRequestBuilder auditEvents() {
        return new AuditEventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("auditEvents"), getClient(), null);
    }

    /**
     * Gets a request builder for the AuditEvent item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public AuditEventRequestBuilder auditEvents(@Nonnull final String id) {
        return new AuditEventRequestBuilder(getRequestUrlWithAdditionalSegment("auditEvents") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the CloudPcConnection collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public CloudPcConnectionCollectionRequestBuilder cloudPcConnections() {
        return new CloudPcConnectionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("cloudPcConnections"), getClient(), null);
    }

    /**
     * Gets a request builder for the CloudPcConnection item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public CloudPcConnectionRequestBuilder cloudPcConnections(@Nonnull final String id) {
        return new CloudPcConnectionRequestBuilder(getRequestUrlWithAdditionalSegment("cloudPcConnections") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the CloudPcDevice collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public CloudPcDeviceCollectionRequestBuilder cloudPcDevices() {
        return new CloudPcDeviceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("cloudPcDevices"), getClient(), null);
    }

    /**
     * Gets a request builder for the CloudPcDevice item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public CloudPcDeviceRequestBuilder cloudPcDevices(@Nonnull final String id) {
        return new CloudPcDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("cloudPcDevices") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the CloudPcOverview collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public CloudPcOverviewCollectionRequestBuilder cloudPcsOverview() {
        return new CloudPcOverviewCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("cloudPcsOverview"), getClient(), null);
    }

    /**
     * Gets a request builder for the CloudPcOverview item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public CloudPcOverviewRequestBuilder cloudPcsOverview(@Nonnull final String id) {
        return new CloudPcOverviewRequestBuilder(getRequestUrlWithAdditionalSegment("cloudPcsOverview") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ConditionalAccessPolicyCoverage collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ConditionalAccessPolicyCoverageCollectionRequestBuilder conditionalAccessPolicyCoverages() {
        return new ConditionalAccessPolicyCoverageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("conditionalAccessPolicyCoverages"), getClient(), null);
    }

    /**
     * Gets a request builder for the ConditionalAccessPolicyCoverage item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ConditionalAccessPolicyCoverageRequestBuilder conditionalAccessPolicyCoverages(@Nonnull final String id) {
        return new ConditionalAccessPolicyCoverageRequestBuilder(getRequestUrlWithAdditionalSegment("conditionalAccessPolicyCoverages") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the CredentialUserRegistrationsSummary collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public CredentialUserRegistrationsSummaryCollectionRequestBuilder credentialUserRegistrationsSummaries() {
        return new CredentialUserRegistrationsSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("credentialUserRegistrationsSummaries"), getClient(), null);
    }

    /**
     * Gets a request builder for the CredentialUserRegistrationsSummary item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public CredentialUserRegistrationsSummaryRequestBuilder credentialUserRegistrationsSummaries(@Nonnull final String id) {
        return new CredentialUserRegistrationsSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("credentialUserRegistrationsSummaries") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceCompliancePolicySettingStateSummary collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder deviceCompliancePolicySettingStateSummaries() {
        return new DeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCompliancePolicySettingStateSummaries"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceCompliancePolicySettingStateSummary item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceCompliancePolicySettingStateSummaryRequestBuilder deviceCompliancePolicySettingStateSummaries(@Nonnull final String id) {
        return new DeviceCompliancePolicySettingStateSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCompliancePolicySettingStateSummaries") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagedDeviceCompliance collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ManagedDeviceComplianceCollectionRequestBuilder managedDeviceCompliances() {
        return new ManagedDeviceComplianceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managedDeviceCompliances"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagedDeviceCompliance item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ManagedDeviceComplianceRequestBuilder managedDeviceCompliances(@Nonnull final String id) {
        return new ManagedDeviceComplianceRequestBuilder(getRequestUrlWithAdditionalSegment("managedDeviceCompliances") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagedDeviceComplianceTrend collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ManagedDeviceComplianceTrendCollectionRequestBuilder managedDeviceComplianceTrends() {
        return new ManagedDeviceComplianceTrendCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managedDeviceComplianceTrends"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagedDeviceComplianceTrend item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ManagedDeviceComplianceTrendRequestBuilder managedDeviceComplianceTrends(@Nonnull final String id) {
        return new ManagedDeviceComplianceTrendRequestBuilder(getRequestUrlWithAdditionalSegment("managedDeviceComplianceTrends") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagementAction collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ManagementActionCollectionRequestBuilder managementActions() {
        return new ManagementActionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managementActions"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagementAction item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ManagementActionRequestBuilder managementActions(@Nonnull final String id) {
        return new ManagementActionRequestBuilder(getRequestUrlWithAdditionalSegment("managementActions") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagementActionTenantDeploymentStatus collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ManagementActionTenantDeploymentStatusCollectionRequestBuilder managementActionTenantDeploymentStatuses() {
        return new ManagementActionTenantDeploymentStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managementActionTenantDeploymentStatuses"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagementActionTenantDeploymentStatus item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ManagementActionTenantDeploymentStatusRequestBuilder managementActionTenantDeploymentStatuses(@Nonnull final String id) {
        return new ManagementActionTenantDeploymentStatusRequestBuilder(getRequestUrlWithAdditionalSegment("managementActionTenantDeploymentStatuses") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagementIntent collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ManagementIntentCollectionRequestBuilder managementIntents() {
        return new ManagementIntentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managementIntents"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagementIntent item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ManagementIntentRequestBuilder managementIntents(@Nonnull final String id) {
        return new ManagementIntentRequestBuilder(getRequestUrlWithAdditionalSegment("managementIntents") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagementTemplateCollectionObject collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ManagementTemplateCollectionObjectCollectionRequestBuilder managementTemplateCollections() {
        return new ManagementTemplateCollectionObjectCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managementTemplateCollections"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagementTemplateCollectionObject item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ManagementTemplateCollectionObjectRequestBuilder managementTemplateCollections(@Nonnull final String id) {
        return new ManagementTemplateCollectionObjectRequestBuilder(getRequestUrlWithAdditionalSegment("managementTemplateCollections") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagementTemplate collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ManagementTemplateCollectionRequestBuilder managementTemplates() {
        return new ManagementTemplateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managementTemplates"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagementTemplate item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ManagementTemplateRequestBuilder managementTemplates(@Nonnull final String id) {
        return new ManagementTemplateRequestBuilder(getRequestUrlWithAdditionalSegment("managementTemplates") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagementTemplateStep collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ManagementTemplateStepCollectionRequestBuilder managementTemplateSteps() {
        return new ManagementTemplateStepCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managementTemplateSteps"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagementTemplateStep item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ManagementTemplateStepRequestBuilder managementTemplateSteps(@Nonnull final String id) {
        return new ManagementTemplateStepRequestBuilder(getRequestUrlWithAdditionalSegment("managementTemplateSteps") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagementTemplateStepVersion collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ManagementTemplateStepVersionCollectionRequestBuilder managementTemplateStepVersions() {
        return new ManagementTemplateStepVersionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managementTemplateStepVersions"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagementTemplateStepVersion item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ManagementTemplateStepVersionRequestBuilder managementTemplateStepVersions(@Nonnull final String id) {
        return new ManagementTemplateStepVersionRequestBuilder(getRequestUrlWithAdditionalSegment("managementTemplateStepVersions") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the MyRole collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public MyRoleCollectionRequestBuilder myRoles() {
        return new MyRoleCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("myRoles"), getClient(), null);
    }

    /**
     * Gets a request builder for the MyRole item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public MyRoleRequestBuilder myRoles(@Nonnull final String id) {
        return new MyRoleRequestBuilder(getRequestUrlWithAdditionalSegment("myRoles") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the TenantGroup collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public TenantGroupCollectionRequestBuilder tenantGroups() {
        return new TenantGroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("tenantGroups"), getClient(), null);
    }

    /**
     * Gets a request builder for the TenantGroup item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public TenantGroupRequestBuilder tenantGroups(@Nonnull final String id) {
        return new TenantGroupRequestBuilder(getRequestUrlWithAdditionalSegment("tenantGroups") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Tenant collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public TenantCollectionRequestBuilder tenants() {
        return new TenantCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("tenants"), getClient(), null);
    }

    /**
     * Gets a request builder for the Tenant item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public TenantRequestBuilder tenants(@Nonnull final String id) {
        return new TenantRequestBuilder(getRequestUrlWithAdditionalSegment("tenants") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the TenantCustomizedInformation collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public TenantCustomizedInformationCollectionRequestBuilder tenantsCustomizedInformation() {
        return new TenantCustomizedInformationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("tenantsCustomizedInformation"), getClient(), null);
    }

    /**
     * Gets a request builder for the TenantCustomizedInformation item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public TenantCustomizedInformationRequestBuilder tenantsCustomizedInformation(@Nonnull final String id) {
        return new TenantCustomizedInformationRequestBuilder(getRequestUrlWithAdditionalSegment("tenantsCustomizedInformation") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the TenantDetailedInformation collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public TenantDetailedInformationCollectionRequestBuilder tenantsDetailedInformation() {
        return new TenantDetailedInformationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("tenantsDetailedInformation"), getClient(), null);
    }

    /**
     * Gets a request builder for the TenantDetailedInformation item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public TenantDetailedInformationRequestBuilder tenantsDetailedInformation(@Nonnull final String id) {
        return new TenantDetailedInformationRequestBuilder(getRequestUrlWithAdditionalSegment("tenantsDetailedInformation") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the TenantTag collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public TenantTagCollectionRequestBuilder tenantTags() {
        return new TenantTagCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("tenantTags"), getClient(), null);
    }

    /**
     * Gets a request builder for the TenantTag item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public TenantTagRequestBuilder tenantTags(@Nonnull final String id) {
        return new TenantTagRequestBuilder(getRequestUrlWithAdditionalSegment("tenantTags") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the WindowsDeviceMalwareState collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public WindowsDeviceMalwareStateCollectionRequestBuilder windowsDeviceMalwareStates() {
        return new WindowsDeviceMalwareStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("windowsDeviceMalwareStates"), getClient(), null);
    }

    /**
     * Gets a request builder for the WindowsDeviceMalwareState item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public WindowsDeviceMalwareStateRequestBuilder windowsDeviceMalwareStates(@Nonnull final String id) {
        return new WindowsDeviceMalwareStateRequestBuilder(getRequestUrlWithAdditionalSegment("windowsDeviceMalwareStates") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the WindowsProtectionState collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public WindowsProtectionStateCollectionRequestBuilder windowsProtectionStates() {
        return new WindowsProtectionStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("windowsProtectionStates"), getClient(), null);
    }

    /**
     * Gets a request builder for the WindowsProtectionState item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public WindowsProtectionStateRequestBuilder windowsProtectionStates(@Nonnull final String id) {
        return new WindowsProtectionStateRequestBuilder(getRequestUrlWithAdditionalSegment("windowsProtectionStates") + "/" + id, getClient(), null);
    }
}
