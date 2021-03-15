// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Office365ActivationsUserDetail;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.ReportRootGetOffice365ActivationsUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.ReportRootGetOffice365ActivationsUserDetailCollectionRequest;
import com.microsoft.graph.requests.ReportRootGetOffice365ActivationsUserDetailCollectionResponse;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Office365Activations User Detail Collection Request Builder.
 */
public class ReportRootGetOffice365ActivationsUserDetailCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<Office365ActivationsUserDetail, ReportRootGetOffice365ActivationsUserDetailCollectionRequestBuilder, ReportRootGetOffice365ActivationsUserDetailCollectionResponse, ReportRootGetOffice365ActivationsUserDetailCollectionPage, ReportRootGetOffice365ActivationsUserDetailCollectionRequest> {

    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetOffice365ActivationsUserDetailCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootGetOffice365ActivationsUserDetailCollectionRequestBuilder.class, ReportRootGetOffice365ActivationsUserDetailCollectionRequest.class);
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ReportRootGetOffice365ActivationsUserDetailCollectionRequest instance
     */
    @Override
    @Nonnull
    public ReportRootGetOffice365ActivationsUserDetailCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ReportRootGetOffice365ActivationsUserDetailCollectionRequest request = super.buildRequest(requestOptions);
        return request;
    }
}
