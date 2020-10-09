// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IdentityGovernance;
import com.microsoft.graph.requests.extensions.IAccessReviewSetRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewSetRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppConsentApprovalRouteRequestBuilder;
import com.microsoft.graph.requests.extensions.AppConsentApprovalRouteRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsOfUseContainerRequestBuilder;
import com.microsoft.graph.requests.extensions.TermsOfUseContainerRequestBuilder;
import com.microsoft.graph.requests.extensions.IEntitlementManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.EntitlementManagementRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity Governance Request Builder.
 */
public class IdentityGovernanceRequestBuilder extends BaseRequestBuilder implements IIdentityGovernanceRequestBuilder {

    /**
     * The request builder for the IdentityGovernance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IdentityGovernanceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IIdentityGovernanceRequest instance
     */
    public IIdentityGovernanceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IIdentityGovernanceRequest instance
     */
    public IIdentityGovernanceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.IdentityGovernanceRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for AccessReviewSet
     *
     * @return the IAccessReviewSetRequestBuilder instance
     */
    public IAccessReviewSetRequestBuilder accessReviews() {
        return new AccessReviewSetRequestBuilder(getRequestUrlWithAdditionalSegment("accessReviews"), getClient(), null);
    }

    /**
     * Gets the request builder for AppConsentApprovalRoute
     *
     * @return the IAppConsentApprovalRouteRequestBuilder instance
     */
    public IAppConsentApprovalRouteRequestBuilder appConsent() {
        return new AppConsentApprovalRouteRequestBuilder(getRequestUrlWithAdditionalSegment("appConsent"), getClient(), null);
    }

    /**
     * Gets the request builder for TermsOfUseContainer
     *
     * @return the ITermsOfUseContainerRequestBuilder instance
     */
    public ITermsOfUseContainerRequestBuilder termsOfUse() {
        return new TermsOfUseContainerRequestBuilder(getRequestUrlWithAdditionalSegment("termsOfUse"), getClient(), null);
    }

    /**
     * Gets the request builder for EntitlementManagement
     *
     * @return the IEntitlementManagementRequestBuilder instance
     */
    public IEntitlementManagementRequestBuilder entitlementManagement() {
        return new EntitlementManagementRequestBuilder(getRequestUrlWithAdditionalSegment("entitlementManagement"), getClient(), null);
    }
}
