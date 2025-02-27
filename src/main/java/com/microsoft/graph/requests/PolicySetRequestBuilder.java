// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.PolicySet;
import com.microsoft.graph.models.PolicySetItem;
import com.microsoft.graph.models.PolicySetAssignment;
import com.microsoft.graph.requests.PolicySetAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.PolicySetAssignmentRequestBuilder;
import com.microsoft.graph.requests.PolicySetItemCollectionRequestBuilder;
import com.microsoft.graph.requests.PolicySetItemRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.PolicySetUpdateParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Policy Set Request Builder.
 */
public class PolicySetRequestBuilder extends BaseRequestBuilder<PolicySet> {

    /**
     * The request builder for the PolicySet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PolicySetRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the PolicySetRequest instance
     */
    @Nonnull
    public PolicySetRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the PolicySetRequest instance
     */
    @Nonnull
    public PolicySetRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.PolicySetRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the PolicySetAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PolicySetAssignmentCollectionRequestBuilder assignments() {
        return new PolicySetAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the PolicySetAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PolicySetAssignmentRequestBuilder assignments(@Nonnull final String id) {
        return new PolicySetAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PolicySetItem collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PolicySetItemCollectionRequestBuilder items() {
        return new PolicySetItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("items"), getClient(), null);
    }

    /**
     * Gets a request builder for the PolicySetItem item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PolicySetItemRequestBuilder items(@Nonnull final String id) {
        return new PolicySetItemRequestBuilder(getRequestUrlWithAdditionalSegment("items") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public PolicySetUpdateRequestBuilder update(@Nonnull final PolicySetUpdateParameterSet parameters) {
        return new PolicySetUpdateRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.update"), getClient(), null, parameters);
    }
}
