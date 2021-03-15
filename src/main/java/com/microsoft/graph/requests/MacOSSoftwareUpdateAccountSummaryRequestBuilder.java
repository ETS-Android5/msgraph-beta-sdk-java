// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.MacOSSoftwareUpdateAccountSummary;
import com.microsoft.graph.requests.MacOSSoftwareUpdateCategorySummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.MacOSSoftwareUpdateCategorySummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSSoftware Update Account Summary Request Builder.
 */
public class MacOSSoftwareUpdateAccountSummaryRequestBuilder extends BaseRequestBuilder<MacOSSoftwareUpdateAccountSummary> {

    /**
     * The request builder for the MacOSSoftwareUpdateAccountSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MacOSSoftwareUpdateAccountSummaryRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the MacOSSoftwareUpdateAccountSummaryRequest instance
     */
    @Nonnull
    public MacOSSoftwareUpdateAccountSummaryRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the MacOSSoftwareUpdateAccountSummaryRequest instance
     */
    @Nonnull
    public MacOSSoftwareUpdateAccountSummaryRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.MacOSSoftwareUpdateAccountSummaryRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the MacOSSoftwareUpdateCategorySummary collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public MacOSSoftwareUpdateCategorySummaryCollectionRequestBuilder categorySummaries() {
        return new MacOSSoftwareUpdateCategorySummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("categorySummaries"), getClient(), null);
    }

    /**
     * Gets a request builder for the MacOSSoftwareUpdateCategorySummary item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public MacOSSoftwareUpdateCategorySummaryRequestBuilder categorySummaries(@Nonnull final String id) {
        return new MacOSSoftwareUpdateCategorySummaryRequestBuilder(getRequestUrlWithAdditionalSegment("categorySummaries") + "/" + id, getClient(), null);
    }
}
