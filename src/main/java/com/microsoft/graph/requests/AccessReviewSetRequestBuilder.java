// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AccessReviewSet;
import com.microsoft.graph.requests.AccessReviewInstanceDecisionItemCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessReviewInstanceDecisionItemRequestBuilder;
import com.microsoft.graph.requests.AccessReviewScheduleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessReviewScheduleDefinitionRequestBuilder;
import com.microsoft.graph.requests.AccessReviewHistoryDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessReviewHistoryDefinitionRequestBuilder;
import com.microsoft.graph.requests.AccessReviewPolicyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Set Request Builder.
 */
public class AccessReviewSetRequestBuilder extends BaseRequestBuilder<AccessReviewSet> {

    /**
     * The request builder for the AccessReviewSet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessReviewSetRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the AccessReviewSetRequest instance
     */
    @Nonnull
    public AccessReviewSetRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the AccessReviewSetRequest instance
     */
    @Nonnull
    public AccessReviewSetRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.AccessReviewSetRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the AccessReviewInstanceDecisionItem collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public AccessReviewInstanceDecisionItemCollectionRequestBuilder decisions() {
        return new AccessReviewInstanceDecisionItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("decisions"), getClient(), null);
    }

    /**
     * Gets a request builder for the AccessReviewInstanceDecisionItem item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public AccessReviewInstanceDecisionItemRequestBuilder decisions(@Nonnull final String id) {
        return new AccessReviewInstanceDecisionItemRequestBuilder(getRequestUrlWithAdditionalSegment("decisions") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the AccessReviewScheduleDefinition collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public AccessReviewScheduleDefinitionCollectionRequestBuilder definitions() {
        return new AccessReviewScheduleDefinitionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("definitions"), getClient(), null);
    }

    /**
     * Gets a request builder for the AccessReviewScheduleDefinition item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public AccessReviewScheduleDefinitionRequestBuilder definitions(@Nonnull final String id) {
        return new AccessReviewScheduleDefinitionRequestBuilder(getRequestUrlWithAdditionalSegment("definitions") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the AccessReviewHistoryDefinition collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public AccessReviewHistoryDefinitionCollectionRequestBuilder historyDefinitions() {
        return new AccessReviewHistoryDefinitionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("historyDefinitions"), getClient(), null);
    }

    /**
     * Gets a request builder for the AccessReviewHistoryDefinition item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public AccessReviewHistoryDefinitionRequestBuilder historyDefinitions(@Nonnull final String id) {
        return new AccessReviewHistoryDefinitionRequestBuilder(getRequestUrlWithAdditionalSegment("historyDefinitions") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for AccessReviewPolicy
     *
     * @return the AccessReviewPolicyRequestBuilder instance
     */
    @Nonnull
    public AccessReviewPolicyRequestBuilder policy() {
        return new AccessReviewPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("policy"), getClient(), null);
    }
}
