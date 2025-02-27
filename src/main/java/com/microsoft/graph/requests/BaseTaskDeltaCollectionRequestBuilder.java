// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.BaseTask;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.BaseTaskDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.BaseTaskDeltaCollectionRequest;
import com.microsoft.graph.requests.BaseTaskDeltaCollectionResponse;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Task Delta Collection Request Builder.
 */
public class BaseTaskDeltaCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<BaseTask, BaseTaskDeltaCollectionRequestBuilder, BaseTaskDeltaCollectionResponse, BaseTaskDeltaCollectionPage, BaseTaskDeltaCollectionRequest> {

    /**
     * The request builder for this collection of BaseTask
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseTaskDeltaCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseTaskDeltaCollectionRequestBuilder.class, BaseTaskDeltaCollectionRequest.class);
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the BaseTaskDeltaCollectionRequest instance
     */
    @Override
    @Nonnull
    public BaseTaskDeltaCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final BaseTaskDeltaCollectionRequest request = super.buildRequest(requestOptions);
        return request;
    }
}
