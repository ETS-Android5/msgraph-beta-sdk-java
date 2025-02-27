// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.EducationFileSynchronizationVerificationMessage;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.EducationSynchronizationProfileStartCollectionRequestBuilder;
import com.microsoft.graph.requests.EducationSynchronizationProfileStartCollectionRequest;
import com.microsoft.graph.requests.EducationSynchronizationProfileStartCollectionResponse;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseActionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Synchronization Profile Start Collection Request Builder.
 */
public class EducationSynchronizationProfileStartCollectionRequestBuilder extends BaseActionCollectionRequestBuilder<EducationFileSynchronizationVerificationMessage, EducationSynchronizationProfileStartCollectionRequestBuilder, EducationSynchronizationProfileStartCollectionResponse, EducationSynchronizationProfileStartCollectionPage, EducationSynchronizationProfileStartCollectionRequest> {

    /**
     * The request builder for this collection of EducationSynchronizationProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationSynchronizationProfileStartCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationSynchronizationProfileStartCollectionRequestBuilder.class, EducationSynchronizationProfileStartCollectionRequest.class);
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the EducationSynchronizationProfileStartCollectionRequest instance
     */
    @Override
    @Nonnull
    public EducationSynchronizationProfileStartCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final EducationSynchronizationProfileStartCollectionRequest request = super.buildRequest(requestOptions);
        return request;
    }
}
