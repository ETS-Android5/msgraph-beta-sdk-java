// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.PolicyRoot;
import com.microsoft.graph.requests.AuthenticationMethodsPolicyRequestBuilder;
import com.microsoft.graph.requests.AuthenticationFlowsPolicyRequestBuilder;
import com.microsoft.graph.requests.B2cAuthenticationMethodsPolicyRequestBuilder;
import com.microsoft.graph.requests.ActivityBasedTimeoutPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.ActivityBasedTimeoutPolicyRequestBuilder;
import com.microsoft.graph.requests.AuthorizationPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.AuthorizationPolicyRequestBuilder;
import com.microsoft.graph.requests.ClaimsMappingPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.ClaimsMappingPolicyRequestBuilder;
import com.microsoft.graph.requests.HomeRealmDiscoveryPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.HomeRealmDiscoveryPolicyRequestBuilder;
import com.microsoft.graph.requests.PermissionGrantPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.PermissionGrantPolicyRequestBuilder;
import com.microsoft.graph.requests.PrivateLinkResourcePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.PrivateLinkResourcePolicyRequestBuilder;
import com.microsoft.graph.requests.TokenIssuancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.TokenIssuancePolicyRequestBuilder;
import com.microsoft.graph.requests.TokenLifetimePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.TokenLifetimePolicyRequestBuilder;
import com.microsoft.graph.requests.FeatureRolloutPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.FeatureRolloutPolicyRequestBuilder;
import com.microsoft.graph.requests.AdminConsentRequestPolicyRequestBuilder;
import com.microsoft.graph.requests.DirectoryRoleAccessReviewPolicyRequestBuilder;
import com.microsoft.graph.requests.ConditionalAccessPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.ConditionalAccessPolicyRequestBuilder;
import com.microsoft.graph.requests.IdentitySecurityDefaultsEnforcementPolicyRequestBuilder;
import com.microsoft.graph.requests.UnifiedRoleManagementPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.UnifiedRoleManagementPolicyRequestBuilder;
import com.microsoft.graph.requests.UnifiedRoleManagementPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.UnifiedRoleManagementPolicyAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Policy Root Request Builder.
 */
public class PolicyRootRequestBuilder extends BaseRequestBuilder<PolicyRoot> {

    /**
     * The request builder for the PolicyRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PolicyRootRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the PolicyRootRequest instance
     */
    @Nonnull
    public PolicyRootRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the PolicyRootRequest instance
     */
    @Nonnull
    public PolicyRootRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.PolicyRootRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for AuthenticationMethodsPolicy
     *
     * @return the AuthenticationMethodsPolicyRequestBuilder instance
     */
    @Nonnull
    public AuthenticationMethodsPolicyRequestBuilder authenticationMethodsPolicy() {
        return new AuthenticationMethodsPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("authenticationMethodsPolicy"), getClient(), null);
    }

    /**
     * Gets the request builder for AuthenticationFlowsPolicy
     *
     * @return the AuthenticationFlowsPolicyRequestBuilder instance
     */
    @Nonnull
    public AuthenticationFlowsPolicyRequestBuilder authenticationFlowsPolicy() {
        return new AuthenticationFlowsPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("authenticationFlowsPolicy"), getClient(), null);
    }

    /**
     * Gets the request builder for B2cAuthenticationMethodsPolicy
     *
     * @return the B2cAuthenticationMethodsPolicyRequestBuilder instance
     */
    @Nonnull
    public B2cAuthenticationMethodsPolicyRequestBuilder b2cAuthenticationMethodsPolicy() {
        return new B2cAuthenticationMethodsPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("b2cAuthenticationMethodsPolicy"), getClient(), null);
    }
    /**
     *  Gets a request builder for the ActivityBasedTimeoutPolicy collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ActivityBasedTimeoutPolicyCollectionRequestBuilder activityBasedTimeoutPolicies() {
        return new ActivityBasedTimeoutPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("activityBasedTimeoutPolicies"), getClient(), null);
    }

    /**
     * Gets a request builder for the ActivityBasedTimeoutPolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ActivityBasedTimeoutPolicyRequestBuilder activityBasedTimeoutPolicies(@Nonnull final String id) {
        return new ActivityBasedTimeoutPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("activityBasedTimeoutPolicies") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the AuthorizationPolicy collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public AuthorizationPolicyCollectionRequestBuilder authorizationPolicy() {
        return new AuthorizationPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("authorizationPolicy"), getClient(), null);
    }

    /**
     * Gets a request builder for the AuthorizationPolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public AuthorizationPolicyRequestBuilder authorizationPolicy(@Nonnull final String id) {
        return new AuthorizationPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("authorizationPolicy") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ClaimsMappingPolicy collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ClaimsMappingPolicyCollectionRequestBuilder claimsMappingPolicies() {
        return new ClaimsMappingPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("claimsMappingPolicies"), getClient(), null);
    }

    /**
     * Gets a request builder for the ClaimsMappingPolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ClaimsMappingPolicyRequestBuilder claimsMappingPolicies(@Nonnull final String id) {
        return new ClaimsMappingPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("claimsMappingPolicies") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the HomeRealmDiscoveryPolicy collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public HomeRealmDiscoveryPolicyCollectionRequestBuilder homeRealmDiscoveryPolicies() {
        return new HomeRealmDiscoveryPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("homeRealmDiscoveryPolicies"), getClient(), null);
    }

    /**
     * Gets a request builder for the HomeRealmDiscoveryPolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public HomeRealmDiscoveryPolicyRequestBuilder homeRealmDiscoveryPolicies(@Nonnull final String id) {
        return new HomeRealmDiscoveryPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("homeRealmDiscoveryPolicies") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PermissionGrantPolicy collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PermissionGrantPolicyCollectionRequestBuilder permissionGrantPolicies() {
        return new PermissionGrantPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("permissionGrantPolicies"), getClient(), null);
    }

    /**
     * Gets a request builder for the PermissionGrantPolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PermissionGrantPolicyRequestBuilder permissionGrantPolicies(@Nonnull final String id) {
        return new PermissionGrantPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("permissionGrantPolicies") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PrivateLinkResourcePolicy collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PrivateLinkResourcePolicyCollectionRequestBuilder privateLinkResourcePolicies() {
        return new PrivateLinkResourcePolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("privateLinkResourcePolicies"), getClient(), null);
    }

    /**
     * Gets a request builder for the PrivateLinkResourcePolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PrivateLinkResourcePolicyRequestBuilder privateLinkResourcePolicies(@Nonnull final String id) {
        return new PrivateLinkResourcePolicyRequestBuilder(getRequestUrlWithAdditionalSegment("privateLinkResourcePolicies") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the TokenIssuancePolicy collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public TokenIssuancePolicyCollectionRequestBuilder tokenIssuancePolicies() {
        return new TokenIssuancePolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("tokenIssuancePolicies"), getClient(), null);
    }

    /**
     * Gets a request builder for the TokenIssuancePolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public TokenIssuancePolicyRequestBuilder tokenIssuancePolicies(@Nonnull final String id) {
        return new TokenIssuancePolicyRequestBuilder(getRequestUrlWithAdditionalSegment("tokenIssuancePolicies") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the TokenLifetimePolicy collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public TokenLifetimePolicyCollectionRequestBuilder tokenLifetimePolicies() {
        return new TokenLifetimePolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("tokenLifetimePolicies"), getClient(), null);
    }

    /**
     * Gets a request builder for the TokenLifetimePolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public TokenLifetimePolicyRequestBuilder tokenLifetimePolicies(@Nonnull final String id) {
        return new TokenLifetimePolicyRequestBuilder(getRequestUrlWithAdditionalSegment("tokenLifetimePolicies") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the FeatureRolloutPolicy collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public FeatureRolloutPolicyCollectionRequestBuilder featureRolloutPolicies() {
        return new FeatureRolloutPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("featureRolloutPolicies"), getClient(), null);
    }

    /**
     * Gets a request builder for the FeatureRolloutPolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public FeatureRolloutPolicyRequestBuilder featureRolloutPolicies(@Nonnull final String id) {
        return new FeatureRolloutPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("featureRolloutPolicies") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for AdminConsentRequestPolicy
     *
     * @return the AdminConsentRequestPolicyRequestBuilder instance
     */
    @Nonnull
    public AdminConsentRequestPolicyRequestBuilder adminConsentRequestPolicy() {
        return new AdminConsentRequestPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("adminConsentRequestPolicy"), getClient(), null);
    }

    /**
     * Gets the request builder for DirectoryRoleAccessReviewPolicy
     *
     * @return the DirectoryRoleAccessReviewPolicyRequestBuilder instance
     */
    @Nonnull
    public DirectoryRoleAccessReviewPolicyRequestBuilder directoryRoleAccessReviewPolicy() {
        return new DirectoryRoleAccessReviewPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("directoryRoleAccessReviewPolicy"), getClient(), null);
    }
    /**
     *  Gets a request builder for the ConditionalAccessPolicy collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ConditionalAccessPolicyCollectionRequestBuilder conditionalAccessPolicies() {
        return new ConditionalAccessPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("conditionalAccessPolicies"), getClient(), null);
    }

    /**
     * Gets a request builder for the ConditionalAccessPolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ConditionalAccessPolicyRequestBuilder conditionalAccessPolicies(@Nonnull final String id) {
        return new ConditionalAccessPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("conditionalAccessPolicies") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for IdentitySecurityDefaultsEnforcementPolicy
     *
     * @return the IdentitySecurityDefaultsEnforcementPolicyRequestBuilder instance
     */
    @Nonnull
    public IdentitySecurityDefaultsEnforcementPolicyRequestBuilder identitySecurityDefaultsEnforcementPolicy() {
        return new IdentitySecurityDefaultsEnforcementPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("identitySecurityDefaultsEnforcementPolicy"), getClient(), null);
    }
    /**
     *  Gets a request builder for the UnifiedRoleManagementPolicy collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UnifiedRoleManagementPolicyCollectionRequestBuilder roleManagementPolicies() {
        return new UnifiedRoleManagementPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("roleManagementPolicies"), getClient(), null);
    }

    /**
     * Gets a request builder for the UnifiedRoleManagementPolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UnifiedRoleManagementPolicyRequestBuilder roleManagementPolicies(@Nonnull final String id) {
        return new UnifiedRoleManagementPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("roleManagementPolicies") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the UnifiedRoleManagementPolicyAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UnifiedRoleManagementPolicyAssignmentCollectionRequestBuilder roleManagementPolicyAssignments() {
        return new UnifiedRoleManagementPolicyAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("roleManagementPolicyAssignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the UnifiedRoleManagementPolicyAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UnifiedRoleManagementPolicyAssignmentRequestBuilder roleManagementPolicyAssignments(@Nonnull final String id) {
        return new UnifiedRoleManagementPolicyAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("roleManagementPolicyAssignments") + "/" + id, getClient(), null);
    }
}
