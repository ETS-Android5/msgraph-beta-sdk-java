// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Security;
import com.microsoft.graph.requests.SubjectRightsRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.SubjectRightsRequestRequestBuilder;
import com.microsoft.graph.security.requests.CasesRootRequestBuilder;
import com.microsoft.graph.security.requests.InformationProtectionRequestBuilder;
import com.microsoft.graph.requests.AttackSimulationRootRequestBuilder;
import com.microsoft.graph.requests.AlertCollectionRequestBuilder;
import com.microsoft.graph.requests.AlertRequestBuilder;
import com.microsoft.graph.requests.CloudAppSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.CloudAppSecurityProfileRequestBuilder;
import com.microsoft.graph.requests.DomainSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.DomainSecurityProfileRequestBuilder;
import com.microsoft.graph.requests.FileSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.FileSecurityProfileRequestBuilder;
import com.microsoft.graph.requests.HostSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.HostSecurityProfileRequestBuilder;
import com.microsoft.graph.requests.IpSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.IpSecurityProfileRequestBuilder;
import com.microsoft.graph.requests.ProviderTenantSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.ProviderTenantSettingRequestBuilder;
import com.microsoft.graph.requests.SecureScoreControlProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.SecureScoreControlProfileRequestBuilder;
import com.microsoft.graph.requests.SecureScoreCollectionRequestBuilder;
import com.microsoft.graph.requests.SecureScoreRequestBuilder;
import com.microsoft.graph.requests.SecurityActionCollectionRequestBuilder;
import com.microsoft.graph.requests.SecurityActionRequestBuilder;
import com.microsoft.graph.requests.TiIndicatorCollectionRequestBuilder;
import com.microsoft.graph.requests.TiIndicatorRequestBuilder;
import com.microsoft.graph.requests.UserSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.UserSecurityProfileRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security Request Builder.
 */
public class SecurityRequestBuilder extends BaseRequestBuilder<Security> {

    /**
     * The request builder for the Security
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SecurityRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the SecurityRequest instance
     */
    @Nonnull
    public SecurityRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the SecurityRequest instance
     */
    @Nonnull
    public SecurityRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.SecurityRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the SubjectRightsRequest collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public SubjectRightsRequestCollectionRequestBuilder subjectRightsRequests() {
        return new SubjectRightsRequestCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("subjectRightsRequests"), getClient(), null);
    }

    /**
     * Gets a request builder for the SubjectRightsRequest item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public SubjectRightsRequestRequestBuilder subjectRightsRequests(@Nonnull final String id) {
        return new SubjectRightsRequestRequestBuilder(getRequestUrlWithAdditionalSegment("subjectRightsRequests") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for CasesRoot
     *
     * @return the CasesRootRequestBuilder instance
     */
    @Nonnull
    public CasesRootRequestBuilder cases() {
        return new CasesRootRequestBuilder(getRequestUrlWithAdditionalSegment("cases"), getClient(), null);
    }

    /**
     * Gets the request builder for InformationProtection
     *
     * @return the InformationProtectionRequestBuilder instance
     */
    @Nonnull
    public InformationProtectionRequestBuilder informationProtection() {
        return new InformationProtectionRequestBuilder(getRequestUrlWithAdditionalSegment("informationProtection"), getClient(), null);
    }

    /**
     * Gets the request builder for AttackSimulationRoot
     *
     * @return the AttackSimulationRootRequestBuilder instance
     */
    @Nonnull
    public AttackSimulationRootRequestBuilder attackSimulation() {
        return new AttackSimulationRootRequestBuilder(getRequestUrlWithAdditionalSegment("attackSimulation"), getClient(), null);
    }
    /**
     *  Gets a request builder for the Alert collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public AlertCollectionRequestBuilder alerts() {
        return new AlertCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("alerts"), getClient(), null);
    }

    /**
     * Gets a request builder for the Alert item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public AlertRequestBuilder alerts(@Nonnull final String id) {
        return new AlertRequestBuilder(getRequestUrlWithAdditionalSegment("alerts") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the CloudAppSecurityProfile collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public CloudAppSecurityProfileCollectionRequestBuilder cloudAppSecurityProfiles() {
        return new CloudAppSecurityProfileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("cloudAppSecurityProfiles"), getClient(), null);
    }

    /**
     * Gets a request builder for the CloudAppSecurityProfile item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public CloudAppSecurityProfileRequestBuilder cloudAppSecurityProfiles(@Nonnull final String id) {
        return new CloudAppSecurityProfileRequestBuilder(getRequestUrlWithAdditionalSegment("cloudAppSecurityProfiles") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DomainSecurityProfile collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DomainSecurityProfileCollectionRequestBuilder domainSecurityProfiles() {
        return new DomainSecurityProfileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("domainSecurityProfiles"), getClient(), null);
    }

    /**
     * Gets a request builder for the DomainSecurityProfile item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DomainSecurityProfileRequestBuilder domainSecurityProfiles(@Nonnull final String id) {
        return new DomainSecurityProfileRequestBuilder(getRequestUrlWithAdditionalSegment("domainSecurityProfiles") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the FileSecurityProfile collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public FileSecurityProfileCollectionRequestBuilder fileSecurityProfiles() {
        return new FileSecurityProfileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("fileSecurityProfiles"), getClient(), null);
    }

    /**
     * Gets a request builder for the FileSecurityProfile item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public FileSecurityProfileRequestBuilder fileSecurityProfiles(@Nonnull final String id) {
        return new FileSecurityProfileRequestBuilder(getRequestUrlWithAdditionalSegment("fileSecurityProfiles") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the HostSecurityProfile collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public HostSecurityProfileCollectionRequestBuilder hostSecurityProfiles() {
        return new HostSecurityProfileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("hostSecurityProfiles"), getClient(), null);
    }

    /**
     * Gets a request builder for the HostSecurityProfile item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public HostSecurityProfileRequestBuilder hostSecurityProfiles(@Nonnull final String id) {
        return new HostSecurityProfileRequestBuilder(getRequestUrlWithAdditionalSegment("hostSecurityProfiles") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the IpSecurityProfile collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public IpSecurityProfileCollectionRequestBuilder ipSecurityProfiles() {
        return new IpSecurityProfileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("ipSecurityProfiles"), getClient(), null);
    }

    /**
     * Gets a request builder for the IpSecurityProfile item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public IpSecurityProfileRequestBuilder ipSecurityProfiles(@Nonnull final String id) {
        return new IpSecurityProfileRequestBuilder(getRequestUrlWithAdditionalSegment("ipSecurityProfiles") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ProviderTenantSetting collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ProviderTenantSettingCollectionRequestBuilder providerTenantSettings() {
        return new ProviderTenantSettingCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("providerTenantSettings"), getClient(), null);
    }

    /**
     * Gets a request builder for the ProviderTenantSetting item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ProviderTenantSettingRequestBuilder providerTenantSettings(@Nonnull final String id) {
        return new ProviderTenantSettingRequestBuilder(getRequestUrlWithAdditionalSegment("providerTenantSettings") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the SecureScoreControlProfile collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public SecureScoreControlProfileCollectionRequestBuilder secureScoreControlProfiles() {
        return new SecureScoreControlProfileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("secureScoreControlProfiles"), getClient(), null);
    }

    /**
     * Gets a request builder for the SecureScoreControlProfile item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public SecureScoreControlProfileRequestBuilder secureScoreControlProfiles(@Nonnull final String id) {
        return new SecureScoreControlProfileRequestBuilder(getRequestUrlWithAdditionalSegment("secureScoreControlProfiles") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the SecureScore collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public SecureScoreCollectionRequestBuilder secureScores() {
        return new SecureScoreCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("secureScores"), getClient(), null);
    }

    /**
     * Gets a request builder for the SecureScore item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public SecureScoreRequestBuilder secureScores(@Nonnull final String id) {
        return new SecureScoreRequestBuilder(getRequestUrlWithAdditionalSegment("secureScores") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the SecurityAction collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public SecurityActionCollectionRequestBuilder securityActions() {
        return new SecurityActionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("securityActions"), getClient(), null);
    }

    /**
     * Gets a request builder for the SecurityAction item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public SecurityActionRequestBuilder securityActions(@Nonnull final String id) {
        return new SecurityActionRequestBuilder(getRequestUrlWithAdditionalSegment("securityActions") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the TiIndicator collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public TiIndicatorCollectionRequestBuilder tiIndicators() {
        return new TiIndicatorCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("tiIndicators"), getClient(), null);
    }

    /**
     * Gets a request builder for the TiIndicator item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public TiIndicatorRequestBuilder tiIndicators(@Nonnull final String id) {
        return new TiIndicatorRequestBuilder(getRequestUrlWithAdditionalSegment("tiIndicators") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the UserSecurityProfile collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UserSecurityProfileCollectionRequestBuilder userSecurityProfiles() {
        return new UserSecurityProfileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userSecurityProfiles"), getClient(), null);
    }

    /**
     * Gets a request builder for the UserSecurityProfile item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UserSecurityProfileRequestBuilder userSecurityProfiles(@Nonnull final String id) {
        return new UserSecurityProfileRequestBuilder(getRequestUrlWithAdditionalSegment("userSecurityProfiles") + "/" + id, getClient(), null);
    }
}
