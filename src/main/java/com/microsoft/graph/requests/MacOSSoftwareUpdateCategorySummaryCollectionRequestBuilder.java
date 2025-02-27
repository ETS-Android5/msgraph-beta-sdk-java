// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.MacOSSoftwareUpdateAccountSummary;
import com.microsoft.graph.models.MacOSSoftwareUpdateCategorySummary;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.MacOSSoftwareUpdateCategorySummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.MacOSSoftwareUpdateCategorySummaryRequestBuilder;
import com.microsoft.graph.requests.MacOSSoftwareUpdateCategorySummaryCollectionRequest;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSSoftware Update Category Summary Collection Request Builder.
 */
public class MacOSSoftwareUpdateCategorySummaryCollectionRequestBuilder extends BaseCollectionRequestBuilder<MacOSSoftwareUpdateCategorySummary, MacOSSoftwareUpdateCategorySummaryRequestBuilder, MacOSSoftwareUpdateCategorySummaryCollectionResponse, MacOSSoftwareUpdateCategorySummaryCollectionPage, MacOSSoftwareUpdateCategorySummaryCollectionRequest> {

    /**
     * The request builder for this collection of MacOSSoftwareUpdateAccountSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MacOSSoftwareUpdateCategorySummaryCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MacOSSoftwareUpdateCategorySummaryRequestBuilder.class, MacOSSoftwareUpdateCategorySummaryCollectionRequest.class);
    }



    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}
