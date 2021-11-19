// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AccessPackageAssignmentRequestFilterByCurrentUserOptions;
import com.microsoft.graph.models.AccessPackageAssignmentRequest;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.AccessPackageAssignmentRequestFilterByCurrentUserCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessPackageAssignmentRequestFilterByCurrentUserCollectionRequest;
import com.microsoft.graph.requests.AccessPackageAssignmentRequestFilterByCurrentUserCollectionResponse;
import com.microsoft.graph.models.AccessPackageAssignmentRequestFilterByCurrentUserParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment Request Filter By Current User Collection Request Builder.
 */
public class AccessPackageAssignmentRequestFilterByCurrentUserCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<AccessPackageAssignmentRequest, AccessPackageAssignmentRequestFilterByCurrentUserCollectionRequestBuilder, AccessPackageAssignmentRequestFilterByCurrentUserCollectionResponse, AccessPackageAssignmentRequestFilterByCurrentUserCollectionPage, AccessPackageAssignmentRequestFilterByCurrentUserCollectionRequest> {

    /**
     * The request builder for this collection of AccessPackageAssignmentRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageAssignmentRequestFilterByCurrentUserCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessPackageAssignmentRequestFilterByCurrentUserCollectionRequestBuilder.class, AccessPackageAssignmentRequestFilterByCurrentUserCollectionRequest.class);
    }
    /**
     * The request builder for this collection of AccessPackageAssignmentRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public AccessPackageAssignmentRequestFilterByCurrentUserCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final AccessPackageAssignmentRequestFilterByCurrentUserParameterSet parameters) {
        super(requestUrl, client, requestOptions, AccessPackageAssignmentRequestFilterByCurrentUserCollectionRequestBuilder.class, AccessPackageAssignmentRequestFilterByCurrentUserCollectionRequest.class);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the AccessPackageAssignmentRequestFilterByCurrentUserCollectionRequest instance
     */
    @Override
    @Nonnull
    public AccessPackageAssignmentRequestFilterByCurrentUserCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final AccessPackageAssignmentRequestFilterByCurrentUserCollectionRequest request = super.buildRequest(requestOptions);
        if(functionOptions != null) {    
            for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
                request.addFunctionOption(option);
            }
        }
        return request;
    }
}
