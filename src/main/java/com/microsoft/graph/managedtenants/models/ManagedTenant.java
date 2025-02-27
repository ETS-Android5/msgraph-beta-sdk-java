// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.managedtenants.models.AggregatedPolicyCompliance;
import com.microsoft.graph.managedtenants.models.AuditEvent;
import com.microsoft.graph.managedtenants.models.CloudPcConnection;
import com.microsoft.graph.managedtenants.models.CloudPcDevice;
import com.microsoft.graph.managedtenants.models.CloudPcOverview;
import com.microsoft.graph.managedtenants.models.ConditionalAccessPolicyCoverage;
import com.microsoft.graph.managedtenants.models.CredentialUserRegistrationsSummary;
import com.microsoft.graph.managedtenants.models.DeviceCompliancePolicySettingStateSummary;
import com.microsoft.graph.managedtenants.models.ManagedDeviceCompliance;
import com.microsoft.graph.managedtenants.models.ManagedDeviceComplianceTrend;
import com.microsoft.graph.managedtenants.models.ManagementAction;
import com.microsoft.graph.managedtenants.models.ManagementActionTenantDeploymentStatus;
import com.microsoft.graph.managedtenants.models.ManagementIntent;
import com.microsoft.graph.managedtenants.models.ManagementTemplateCollectionObject;
import com.microsoft.graph.managedtenants.models.ManagementTemplate;
import com.microsoft.graph.managedtenants.models.ManagementTemplateStep;
import com.microsoft.graph.managedtenants.models.ManagementTemplateStepVersion;
import com.microsoft.graph.managedtenants.models.MyRole;
import com.microsoft.graph.managedtenants.models.TenantGroup;
import com.microsoft.graph.managedtenants.models.Tenant;
import com.microsoft.graph.managedtenants.models.TenantCustomizedInformation;
import com.microsoft.graph.managedtenants.models.TenantDetailedInformation;
import com.microsoft.graph.managedtenants.models.TenantTag;
import com.microsoft.graph.managedtenants.models.WindowsDeviceMalwareState;
import com.microsoft.graph.managedtenants.models.WindowsProtectionState;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.managedtenants.requests.AggregatedPolicyComplianceCollectionPage;
import com.microsoft.graph.managedtenants.requests.AuditEventCollectionPage;
import com.microsoft.graph.managedtenants.requests.CloudPcConnectionCollectionPage;
import com.microsoft.graph.managedtenants.requests.CloudPcDeviceCollectionPage;
import com.microsoft.graph.managedtenants.requests.CloudPcOverviewCollectionPage;
import com.microsoft.graph.managedtenants.requests.ConditionalAccessPolicyCoverageCollectionPage;
import com.microsoft.graph.managedtenants.requests.CredentialUserRegistrationsSummaryCollectionPage;
import com.microsoft.graph.managedtenants.requests.DeviceCompliancePolicySettingStateSummaryCollectionPage;
import com.microsoft.graph.managedtenants.requests.ManagedDeviceComplianceCollectionPage;
import com.microsoft.graph.managedtenants.requests.ManagedDeviceComplianceTrendCollectionPage;
import com.microsoft.graph.managedtenants.requests.ManagementActionCollectionPage;
import com.microsoft.graph.managedtenants.requests.ManagementActionTenantDeploymentStatusCollectionPage;
import com.microsoft.graph.managedtenants.requests.ManagementIntentCollectionPage;
import com.microsoft.graph.managedtenants.requests.ManagementTemplateCollectionObjectCollectionPage;
import com.microsoft.graph.managedtenants.requests.ManagementTemplateCollectionPage;
import com.microsoft.graph.managedtenants.requests.ManagementTemplateStepCollectionPage;
import com.microsoft.graph.managedtenants.requests.ManagementTemplateStepVersionCollectionPage;
import com.microsoft.graph.managedtenants.requests.MyRoleCollectionPage;
import com.microsoft.graph.managedtenants.requests.TenantGroupCollectionPage;
import com.microsoft.graph.managedtenants.requests.TenantCollectionPage;
import com.microsoft.graph.managedtenants.requests.TenantCustomizedInformationCollectionPage;
import com.microsoft.graph.managedtenants.requests.TenantDetailedInformationCollectionPage;
import com.microsoft.graph.managedtenants.requests.TenantTagCollectionPage;
import com.microsoft.graph.managedtenants.requests.WindowsDeviceMalwareStateCollectionPage;
import com.microsoft.graph.managedtenants.requests.WindowsProtectionStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Tenant.
 */
public class ManagedTenant extends Entity implements IJsonBackedObject {


    /**
     * The Aggregated Policy Compliances.
     * Aggregate view of device compliance policies across managed tenants.
     */
    @SerializedName(value = "aggregatedPolicyCompliances", alternate = {"AggregatedPolicyCompliances"})
    @Expose
	@Nullable
    public AggregatedPolicyComplianceCollectionPage aggregatedPolicyCompliances;

    /**
     * The Audit Events.
     * The collection of audit events across managed tenants.
     */
    @SerializedName(value = "auditEvents", alternate = {"AuditEvents"})
    @Expose
	@Nullable
    public AuditEventCollectionPage auditEvents;

    /**
     * The Cloud Pc Connections.
     * The collection of cloud PC connections across managed tenants.
     */
    @SerializedName(value = "cloudPcConnections", alternate = {"CloudPcConnections"})
    @Expose
	@Nullable
    public CloudPcConnectionCollectionPage cloudPcConnections;

    /**
     * The Cloud Pc Devices.
     * The collection of cloud PC devices across managed tenants.
     */
    @SerializedName(value = "cloudPcDevices", alternate = {"CloudPcDevices"})
    @Expose
	@Nullable
    public CloudPcDeviceCollectionPage cloudPcDevices;

    /**
     * The Cloud Pcs Overview.
     * Overview of cloud PC information across managed tenants.
     */
    @SerializedName(value = "cloudPcsOverview", alternate = {"CloudPcsOverview"})
    @Expose
	@Nullable
    public CloudPcOverviewCollectionPage cloudPcsOverview;

    /**
     * The Conditional Access Policy Coverages.
     * Aggregate view of conditional access policy coverage across managed tenants.
     */
    @SerializedName(value = "conditionalAccessPolicyCoverages", alternate = {"ConditionalAccessPolicyCoverages"})
    @Expose
	@Nullable
    public ConditionalAccessPolicyCoverageCollectionPage conditionalAccessPolicyCoverages;

    /**
     * The Credential User Registrations Summaries.
     * Summary information for user registration for multi-factor authentication and self service password reset across managed tenants.
     */
    @SerializedName(value = "credentialUserRegistrationsSummaries", alternate = {"CredentialUserRegistrationsSummaries"})
    @Expose
	@Nullable
    public CredentialUserRegistrationsSummaryCollectionPage credentialUserRegistrationsSummaries;

    /**
     * The Device Compliance Policy Setting State Summaries.
     * Summary information for device compliance policy setting states across managed tenants.
     */
    @SerializedName(value = "deviceCompliancePolicySettingStateSummaries", alternate = {"DeviceCompliancePolicySettingStateSummaries"})
    @Expose
	@Nullable
    public DeviceCompliancePolicySettingStateSummaryCollectionPage deviceCompliancePolicySettingStateSummaries;

    /**
     * The Managed Device Compliances.
     * The collection of compliance for managed devices across managed tenants.
     */
    @SerializedName(value = "managedDeviceCompliances", alternate = {"ManagedDeviceCompliances"})
    @Expose
	@Nullable
    public ManagedDeviceComplianceCollectionPage managedDeviceCompliances;

    /**
     * The Managed Device Compliance Trends.
     * Trend insights for device compliance across managed tenants.
     */
    @SerializedName(value = "managedDeviceComplianceTrends", alternate = {"ManagedDeviceComplianceTrends"})
    @Expose
	@Nullable
    public ManagedDeviceComplianceTrendCollectionPage managedDeviceComplianceTrends;

    /**
     * The Management Actions.
     * The collection of baseline management actions across managed tenants.
     */
    @SerializedName(value = "managementActions", alternate = {"ManagementActions"})
    @Expose
	@Nullable
    public ManagementActionCollectionPage managementActions;

    /**
     * The Management Action Tenant Deployment Statuses.
     * The tenant level status of management actions across managed tenants.
     */
    @SerializedName(value = "managementActionTenantDeploymentStatuses", alternate = {"ManagementActionTenantDeploymentStatuses"})
    @Expose
	@Nullable
    public ManagementActionTenantDeploymentStatusCollectionPage managementActionTenantDeploymentStatuses;

    /**
     * The Management Intents.
     * The collection of baseline management intents across managed tenants.
     */
    @SerializedName(value = "managementIntents", alternate = {"ManagementIntents"})
    @Expose
	@Nullable
    public ManagementIntentCollectionPage managementIntents;

    /**
     * The Management Template Collections.
     * 
     */
    @SerializedName(value = "managementTemplateCollections", alternate = {"ManagementTemplateCollections"})
    @Expose
	@Nullable
    public ManagementTemplateCollectionObjectCollectionPage managementTemplateCollections;

    /**
     * The Management Templates.
     * The collection of baseline management templates across managed tenants.
     */
    @SerializedName(value = "managementTemplates", alternate = {"ManagementTemplates"})
    @Expose
	@Nullable
    public ManagementTemplateCollectionPage managementTemplates;

    /**
     * The Management Template Steps.
     * 
     */
    @SerializedName(value = "managementTemplateSteps", alternate = {"ManagementTemplateSteps"})
    @Expose
	@Nullable
    public ManagementTemplateStepCollectionPage managementTemplateSteps;

    /**
     * The Management Template Step Versions.
     * 
     */
    @SerializedName(value = "managementTemplateStepVersions", alternate = {"ManagementTemplateStepVersions"})
    @Expose
	@Nullable
    public ManagementTemplateStepVersionCollectionPage managementTemplateStepVersions;

    /**
     * The My Roles.
     * 
     */
    @SerializedName(value = "myRoles", alternate = {"MyRoles"})
    @Expose
	@Nullable
    public MyRoleCollectionPage myRoles;

    /**
     * The Tenant Groups.
     * The collection of a logical grouping of managed tenants used by the multi-tenant management platform.
     */
    @SerializedName(value = "tenantGroups", alternate = {"TenantGroups"})
    @Expose
	@Nullable
    public TenantGroupCollectionPage tenantGroups;

    /**
     * The Tenants.
     * The collection of tenants associated with the managing entity.
     */
    @SerializedName(value = "tenants", alternate = {"Tenants"})
    @Expose
	@Nullable
    public TenantCollectionPage tenants;

    /**
     * The Tenants Customized Information.
     * The collection of tenant level customized information across managed tenants.
     */
    @SerializedName(value = "tenantsCustomizedInformation", alternate = {"TenantsCustomizedInformation"})
    @Expose
	@Nullable
    public TenantCustomizedInformationCollectionPage tenantsCustomizedInformation;

    /**
     * The Tenants Detailed Information.
     * The collection tenant level detailed information across managed tenants.
     */
    @SerializedName(value = "tenantsDetailedInformation", alternate = {"TenantsDetailedInformation"})
    @Expose
	@Nullable
    public TenantDetailedInformationCollectionPage tenantsDetailedInformation;

    /**
     * The Tenant Tags.
     * The collection of tenant tags across managed tenants.
     */
    @SerializedName(value = "tenantTags", alternate = {"TenantTags"})
    @Expose
	@Nullable
    public TenantTagCollectionPage tenantTags;

    /**
     * The Windows Device Malware States.
     * The state of malware for Windows devices, registered with Microsoft Endpoint Manager, across managed tenants.
     */
    @SerializedName(value = "windowsDeviceMalwareStates", alternate = {"WindowsDeviceMalwareStates"})
    @Expose
	@Nullable
    public WindowsDeviceMalwareStateCollectionPage windowsDeviceMalwareStates;

    /**
     * The Windows Protection States.
     * The protection state for Windows devices, registered with Microsoft Endpoint Manager, across managed tenants.
     */
    @SerializedName(value = "windowsProtectionStates", alternate = {"WindowsProtectionStates"})
    @Expose
	@Nullable
    public WindowsProtectionStateCollectionPage windowsProtectionStates;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("aggregatedPolicyCompliances")) {
            aggregatedPolicyCompliances = serializer.deserializeObject(json.get("aggregatedPolicyCompliances"), AggregatedPolicyComplianceCollectionPage.class);
        }

        if (json.has("auditEvents")) {
            auditEvents = serializer.deserializeObject(json.get("auditEvents"), AuditEventCollectionPage.class);
        }

        if (json.has("cloudPcConnections")) {
            cloudPcConnections = serializer.deserializeObject(json.get("cloudPcConnections"), CloudPcConnectionCollectionPage.class);
        }

        if (json.has("cloudPcDevices")) {
            cloudPcDevices = serializer.deserializeObject(json.get("cloudPcDevices"), CloudPcDeviceCollectionPage.class);
        }

        if (json.has("cloudPcsOverview")) {
            cloudPcsOverview = serializer.deserializeObject(json.get("cloudPcsOverview"), CloudPcOverviewCollectionPage.class);
        }

        if (json.has("conditionalAccessPolicyCoverages")) {
            conditionalAccessPolicyCoverages = serializer.deserializeObject(json.get("conditionalAccessPolicyCoverages"), ConditionalAccessPolicyCoverageCollectionPage.class);
        }

        if (json.has("credentialUserRegistrationsSummaries")) {
            credentialUserRegistrationsSummaries = serializer.deserializeObject(json.get("credentialUserRegistrationsSummaries"), CredentialUserRegistrationsSummaryCollectionPage.class);
        }

        if (json.has("deviceCompliancePolicySettingStateSummaries")) {
            deviceCompliancePolicySettingStateSummaries = serializer.deserializeObject(json.get("deviceCompliancePolicySettingStateSummaries"), DeviceCompliancePolicySettingStateSummaryCollectionPage.class);
        }

        if (json.has("managedDeviceCompliances")) {
            managedDeviceCompliances = serializer.deserializeObject(json.get("managedDeviceCompliances"), ManagedDeviceComplianceCollectionPage.class);
        }

        if (json.has("managedDeviceComplianceTrends")) {
            managedDeviceComplianceTrends = serializer.deserializeObject(json.get("managedDeviceComplianceTrends"), ManagedDeviceComplianceTrendCollectionPage.class);
        }

        if (json.has("managementActions")) {
            managementActions = serializer.deserializeObject(json.get("managementActions"), ManagementActionCollectionPage.class);
        }

        if (json.has("managementActionTenantDeploymentStatuses")) {
            managementActionTenantDeploymentStatuses = serializer.deserializeObject(json.get("managementActionTenantDeploymentStatuses"), ManagementActionTenantDeploymentStatusCollectionPage.class);
        }

        if (json.has("managementIntents")) {
            managementIntents = serializer.deserializeObject(json.get("managementIntents"), ManagementIntentCollectionPage.class);
        }

        if (json.has("managementTemplateCollections")) {
            managementTemplateCollections = serializer.deserializeObject(json.get("managementTemplateCollections"), ManagementTemplateCollectionObjectCollectionPage.class);
        }

        if (json.has("managementTemplates")) {
            managementTemplates = serializer.deserializeObject(json.get("managementTemplates"), ManagementTemplateCollectionPage.class);
        }

        if (json.has("managementTemplateSteps")) {
            managementTemplateSteps = serializer.deserializeObject(json.get("managementTemplateSteps"), ManagementTemplateStepCollectionPage.class);
        }

        if (json.has("managementTemplateStepVersions")) {
            managementTemplateStepVersions = serializer.deserializeObject(json.get("managementTemplateStepVersions"), ManagementTemplateStepVersionCollectionPage.class);
        }

        if (json.has("myRoles")) {
            myRoles = serializer.deserializeObject(json.get("myRoles"), MyRoleCollectionPage.class);
        }

        if (json.has("tenantGroups")) {
            tenantGroups = serializer.deserializeObject(json.get("tenantGroups"), TenantGroupCollectionPage.class);
        }

        if (json.has("tenants")) {
            tenants = serializer.deserializeObject(json.get("tenants"), TenantCollectionPage.class);
        }

        if (json.has("tenantsCustomizedInformation")) {
            tenantsCustomizedInformation = serializer.deserializeObject(json.get("tenantsCustomizedInformation"), TenantCustomizedInformationCollectionPage.class);
        }

        if (json.has("tenantsDetailedInformation")) {
            tenantsDetailedInformation = serializer.deserializeObject(json.get("tenantsDetailedInformation"), TenantDetailedInformationCollectionPage.class);
        }

        if (json.has("tenantTags")) {
            tenantTags = serializer.deserializeObject(json.get("tenantTags"), TenantTagCollectionPage.class);
        }

        if (json.has("windowsDeviceMalwareStates")) {
            windowsDeviceMalwareStates = serializer.deserializeObject(json.get("windowsDeviceMalwareStates"), WindowsDeviceMalwareStateCollectionPage.class);
        }

        if (json.has("windowsProtectionStates")) {
            windowsProtectionStates = serializer.deserializeObject(json.get("windowsProtectionStates"), WindowsProtectionStateCollectionPage.class);
        }
    }
}
