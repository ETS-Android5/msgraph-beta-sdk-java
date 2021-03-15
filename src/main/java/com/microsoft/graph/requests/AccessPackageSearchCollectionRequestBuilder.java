// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AccessPackage;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.AccessPackageSearchCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessPackageSearchCollectionRequest;
import com.microsoft.graph.requests.AccessPackageSearchCollectionResponse;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Search Collection Request Builder.
 */
public class AccessPackageSearchCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<AccessPackage, AccessPackageSearchCollectionRequestBuilder, AccessPackageSearchCollectionResponse, AccessPackageSearchCollectionPage, AccessPackageSearchCollectionRequest> {

    /**
     * The request builder for this collection of AccessPackage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageSearchCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessPackageSearchCollectionRequestBuilder.class, AccessPackageSearchCollectionRequest.class);
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the AccessPackageSearchCollectionRequest instance
     */
    @Override
    @Nonnull
    public AccessPackageSearchCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final AccessPackageSearchCollectionRequest request = super.buildRequest(requestOptions);
        return request;
    }
}
