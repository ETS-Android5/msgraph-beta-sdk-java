
// Template Source: BaseEntityReferenceRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.ediscovery.models.AddToReviewSetOperation;
import com.microsoft.graph.ediscovery.requests.ReviewSetWithReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.SourceCollectionWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseReferenceRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Add To Review Set Operation Reference Request Builder.
 */
public class AddToReviewSetOperationReferenceRequestBuilder extends BaseReferenceRequestBuilder<AddToReviewSetOperation, AddToReviewSetOperationReferenceRequest> {

    /**
     * The request builder for the AddToReviewSetOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AddToReviewSetOperationReferenceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AddToReviewSetOperationReferenceRequest.class);
    }
}
