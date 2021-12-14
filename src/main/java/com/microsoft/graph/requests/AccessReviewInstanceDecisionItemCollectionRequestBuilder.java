// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AccessReviewInstance;
import com.microsoft.graph.models.AccessReviewInstanceDecisionItem;
import com.microsoft.graph.models.AccessReviewInstanceDecisionItemFilterByCurrentUserOptions;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.AccessReviewInstanceDecisionItemCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessReviewInstanceDecisionItemRequestBuilder;
import com.microsoft.graph.requests.AccessReviewInstanceDecisionItemCollectionRequest;
import com.microsoft.graph.requests.AccessReviewInstanceDecisionItemRecordAllDecisionsRequestBuilder;
import com.microsoft.graph.requests.AccessReviewInstanceDecisionItemFilterByCurrentUserCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.AccessReviewInstanceDecisionItemRecordAllDecisionsParameterSet;
import com.microsoft.graph.models.AccessReviewInstanceDecisionItemFilterByCurrentUserParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Instance Decision Item Collection Request Builder.
 */
public class AccessReviewInstanceDecisionItemCollectionRequestBuilder extends BaseCollectionRequestBuilder<AccessReviewInstanceDecisionItem, AccessReviewInstanceDecisionItemRequestBuilder, AccessReviewInstanceDecisionItemCollectionResponse, AccessReviewInstanceDecisionItemCollectionPage, AccessReviewInstanceDecisionItemCollectionRequest> {

    /**
     * The request builder for this collection of AccessReviewInstance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessReviewInstanceDecisionItemCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessReviewInstanceDecisionItemRequestBuilder.class, AccessReviewInstanceDecisionItemCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public AccessReviewInstanceDecisionItemRecordAllDecisionsRequestBuilder recordAllDecisions(@Nonnull final AccessReviewInstanceDecisionItemRecordAllDecisionsParameterSet parameters) {
        return new AccessReviewInstanceDecisionItemRecordAllDecisionsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.recordAllDecisions"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public AccessReviewInstanceDecisionItemFilterByCurrentUserCollectionRequestBuilder filterByCurrentUser(@Nonnull final AccessReviewInstanceDecisionItemFilterByCurrentUserParameterSet parameters) {
        return new AccessReviewInstanceDecisionItemFilterByCurrentUserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.filterByCurrentUser"), getClient(), null, parameters);
    }

    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}
