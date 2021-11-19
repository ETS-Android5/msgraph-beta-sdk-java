// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Office365GroupsActivityStorage;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.ReportRootGetOffice365GroupsActivityStorageCollectionRequestBuilder;
import com.microsoft.graph.requests.ReportRootGetOffice365GroupsActivityStorageCollectionRequest;
import com.microsoft.graph.requests.ReportRootGetOffice365GroupsActivityStorageCollectionResponse;
import com.microsoft.graph.models.ReportRootGetOffice365GroupsActivityStorageParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Office365Groups Activity Storage Collection Request Builder.
 */
public class ReportRootGetOffice365GroupsActivityStorageCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<Office365GroupsActivityStorage, ReportRootGetOffice365GroupsActivityStorageCollectionRequestBuilder, ReportRootGetOffice365GroupsActivityStorageCollectionResponse, ReportRootGetOffice365GroupsActivityStorageCollectionPage, ReportRootGetOffice365GroupsActivityStorageCollectionRequest> {

    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetOffice365GroupsActivityStorageCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootGetOffice365GroupsActivityStorageCollectionRequestBuilder.class, ReportRootGetOffice365GroupsActivityStorageCollectionRequest.class);
    }
    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ReportRootGetOffice365GroupsActivityStorageCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ReportRootGetOffice365GroupsActivityStorageParameterSet parameters) {
        super(requestUrl, client, requestOptions, ReportRootGetOffice365GroupsActivityStorageCollectionRequestBuilder.class, ReportRootGetOffice365GroupsActivityStorageCollectionRequest.class);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ReportRootGetOffice365GroupsActivityStorageCollectionRequest instance
     */
    @Override
    @Nonnull
    public ReportRootGetOffice365GroupsActivityStorageCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ReportRootGetOffice365GroupsActivityStorageCollectionRequest request = super.buildRequest(requestOptions);
        if(functionOptions != null) {    
            for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
                request.addFunctionOption(option);
            }
        }
        return request;
    }
}
