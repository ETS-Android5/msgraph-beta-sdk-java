// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Security;
import com.microsoft.graph.requests.extensions.IAlertCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAlertRequestBuilder;
import com.microsoft.graph.requests.extensions.AlertCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AlertRequestBuilder;
import com.microsoft.graph.requests.extensions.ICloudAppSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICloudAppSecurityProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.CloudAppSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CloudAppSecurityProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainSecurityProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainSecurityProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IFileSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IFileSecurityProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.FileSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.FileSecurityProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IHostSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IHostSecurityProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.HostSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.HostSecurityProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IIpSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIpSecurityProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IpSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IpSecurityProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IProviderTenantSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IProviderTenantSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.ProviderTenantSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ProviderTenantSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecureScoreControlProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecureScoreControlProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.SecureScoreControlProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SecureScoreControlProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecureScoreCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecureScoreRequestBuilder;
import com.microsoft.graph.requests.extensions.SecureScoreCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SecureScoreRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecurityActionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecurityActionRequestBuilder;
import com.microsoft.graph.requests.extensions.SecurityActionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SecurityActionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITiIndicatorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITiIndicatorRequestBuilder;
import com.microsoft.graph.requests.extensions.TiIndicatorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TiIndicatorRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserSecurityProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.UserSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserSecurityProfileRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security Request Builder.
 */
public class SecurityRequestBuilder extends BaseRequestBuilder implements ISecurityRequestBuilder {

    /**
     * The request builder for the Security
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SecurityRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ISecurityRequest instance
     */
    public ISecurityRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ISecurityRequest instance
     */
    public ISecurityRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.SecurityRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IAlertCollectionRequestBuilder alerts() {
        return new AlertCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("alerts"), getClient(), null);
    }

    public IAlertRequestBuilder alerts(final String id) {
        return new AlertRequestBuilder(getRequestUrlWithAdditionalSegment("alerts") + "/" + id, getClient(), null);
    }
    public ICloudAppSecurityProfileCollectionRequestBuilder cloudAppSecurityProfiles() {
        return new CloudAppSecurityProfileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("cloudAppSecurityProfiles"), getClient(), null);
    }

    public ICloudAppSecurityProfileRequestBuilder cloudAppSecurityProfiles(final String id) {
        return new CloudAppSecurityProfileRequestBuilder(getRequestUrlWithAdditionalSegment("cloudAppSecurityProfiles") + "/" + id, getClient(), null);
    }
    public IDomainSecurityProfileCollectionRequestBuilder domainSecurityProfiles() {
        return new DomainSecurityProfileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("domainSecurityProfiles"), getClient(), null);
    }

    public IDomainSecurityProfileRequestBuilder domainSecurityProfiles(final String id) {
        return new DomainSecurityProfileRequestBuilder(getRequestUrlWithAdditionalSegment("domainSecurityProfiles") + "/" + id, getClient(), null);
    }
    public IFileSecurityProfileCollectionRequestBuilder fileSecurityProfiles() {
        return new FileSecurityProfileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("fileSecurityProfiles"), getClient(), null);
    }

    public IFileSecurityProfileRequestBuilder fileSecurityProfiles(final String id) {
        return new FileSecurityProfileRequestBuilder(getRequestUrlWithAdditionalSegment("fileSecurityProfiles") + "/" + id, getClient(), null);
    }
    public IHostSecurityProfileCollectionRequestBuilder hostSecurityProfiles() {
        return new HostSecurityProfileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("hostSecurityProfiles"), getClient(), null);
    }

    public IHostSecurityProfileRequestBuilder hostSecurityProfiles(final String id) {
        return new HostSecurityProfileRequestBuilder(getRequestUrlWithAdditionalSegment("hostSecurityProfiles") + "/" + id, getClient(), null);
    }
    public IIpSecurityProfileCollectionRequestBuilder ipSecurityProfiles() {
        return new IpSecurityProfileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("ipSecurityProfiles"), getClient(), null);
    }

    public IIpSecurityProfileRequestBuilder ipSecurityProfiles(final String id) {
        return new IpSecurityProfileRequestBuilder(getRequestUrlWithAdditionalSegment("ipSecurityProfiles") + "/" + id, getClient(), null);
    }
    public IProviderTenantSettingCollectionRequestBuilder providerTenantSettings() {
        return new ProviderTenantSettingCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("providerTenantSettings"), getClient(), null);
    }

    public IProviderTenantSettingRequestBuilder providerTenantSettings(final String id) {
        return new ProviderTenantSettingRequestBuilder(getRequestUrlWithAdditionalSegment("providerTenantSettings") + "/" + id, getClient(), null);
    }
    public ISecureScoreControlProfileCollectionRequestBuilder secureScoreControlProfiles() {
        return new SecureScoreControlProfileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("secureScoreControlProfiles"), getClient(), null);
    }

    public ISecureScoreControlProfileRequestBuilder secureScoreControlProfiles(final String id) {
        return new SecureScoreControlProfileRequestBuilder(getRequestUrlWithAdditionalSegment("secureScoreControlProfiles") + "/" + id, getClient(), null);
    }
    public ISecureScoreCollectionRequestBuilder secureScores() {
        return new SecureScoreCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("secureScores"), getClient(), null);
    }

    public ISecureScoreRequestBuilder secureScores(final String id) {
        return new SecureScoreRequestBuilder(getRequestUrlWithAdditionalSegment("secureScores") + "/" + id, getClient(), null);
    }
    public ISecurityActionCollectionRequestBuilder securityActions() {
        return new SecurityActionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("securityActions"), getClient(), null);
    }

    public ISecurityActionRequestBuilder securityActions(final String id) {
        return new SecurityActionRequestBuilder(getRequestUrlWithAdditionalSegment("securityActions") + "/" + id, getClient(), null);
    }
    public ITiIndicatorCollectionRequestBuilder tiIndicators() {
        return new TiIndicatorCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("tiIndicators"), getClient(), null);
    }

    public ITiIndicatorRequestBuilder tiIndicators(final String id) {
        return new TiIndicatorRequestBuilder(getRequestUrlWithAdditionalSegment("tiIndicators") + "/" + id, getClient(), null);
    }
    public IUserSecurityProfileCollectionRequestBuilder userSecurityProfiles() {
        return new UserSecurityProfileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userSecurityProfiles"), getClient(), null);
    }

    public IUserSecurityProfileRequestBuilder userSecurityProfiles(final String id) {
        return new UserSecurityProfileRequestBuilder(getRequestUrlWithAdditionalSegment("userSecurityProfiles") + "/" + id, getClient(), null);
    }
}
