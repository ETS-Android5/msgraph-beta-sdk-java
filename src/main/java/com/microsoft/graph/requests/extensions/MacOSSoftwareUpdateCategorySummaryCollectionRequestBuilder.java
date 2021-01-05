// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MacOSSoftwareUpdateAccountSummary;
import com.microsoft.graph.models.extensions.MacOSSoftwareUpdateCategorySummary;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IMacOSSoftwareUpdateCategorySummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMacOSSoftwareUpdateCategorySummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IMacOSSoftwareUpdateCategorySummaryCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSSoftware Update Category Summary Collection Request Builder.
 */
public class MacOSSoftwareUpdateCategorySummaryCollectionRequestBuilder extends BaseRequestBuilder implements IMacOSSoftwareUpdateCategorySummaryCollectionRequestBuilder {

    /**
     * The request builder for this collection of MacOSSoftwareUpdateAccountSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MacOSSoftwareUpdateCategorySummaryCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IMacOSSoftwareUpdateCategorySummaryCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IMacOSSoftwareUpdateCategorySummaryCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new MacOSSoftwareUpdateCategorySummaryCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IMacOSSoftwareUpdateCategorySummaryRequestBuilder byId(final String id) {
        return new MacOSSoftwareUpdateCategorySummaryRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
