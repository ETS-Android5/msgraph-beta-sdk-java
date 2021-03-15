// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.GroupEvaluateDynamicMembershipRequest;
import com.microsoft.graph.models.Group;
import com.microsoft.graph.models.EvaluateDynamicMembershipResult;
import com.microsoft.graph.models.EvaluateDynamicMembershipResult;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.GroupEvaluateDynamicMembershipParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Evaluate Dynamic Membership Request Builder.
 */
public class GroupEvaluateDynamicMembershipRequestBuilder extends BaseActionRequestBuilder<EvaluateDynamicMembershipResult> {

    /**
     * The request builder for this GroupEvaluateDynamicMembership
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupEvaluateDynamicMembershipRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private GroupEvaluateDynamicMembershipParameterSet body;
    /**
     * The request builder for this GroupEvaluateDynamicMembership
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public GroupEvaluateDynamicMembershipRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final GroupEvaluateDynamicMembershipParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the GroupEvaluateDynamicMembershipRequest
     *
     * @param requestOptions the options for the request
     * @return the GroupEvaluateDynamicMembershipRequest instance
     */
    @Nonnull
    public GroupEvaluateDynamicMembershipRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the GroupEvaluateDynamicMembershipRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the GroupEvaluateDynamicMembershipRequest instance
     */
    @Nonnull
    public GroupEvaluateDynamicMembershipRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final GroupEvaluateDynamicMembershipRequest request = new GroupEvaluateDynamicMembershipRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
