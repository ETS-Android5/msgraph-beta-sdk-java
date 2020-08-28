// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ReviewSet;
import com.microsoft.graph.requests.extensions.IReviewSetQueryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReviewSetQueryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Review Set Request Builder.
 */
public interface IReviewSetRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IReviewSetRequest instance
     */
    IReviewSetRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IReviewSetRequest instance
     */
    IReviewSetRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IReviewSetQueryCollectionRequestBuilder queries();

    IReviewSetQueryRequestBuilder queries(final String id);

}