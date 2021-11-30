// Template Source: BaseMethodRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.ReportRoot;
import com.microsoft.graph.requests.ReportRootGetEmailAppUsageAppsUserCountsRequest;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.ReportRootGetEmailAppUsageAppsUserCountsParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Email App Usage Apps User Counts Request.
 */
public class ReportRootGetEmailAppUsageAppsUserCountsRequest extends BaseRequest<java.io.InputStream> {
    /**
     * The request for this ReportRootGetEmailAppUsageAppsUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetEmailAppUsageAppsUserCountsRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, java.io.InputStream.class);
    }

    /**
     * Gets the java.io.InputStream
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<java.io.InputStream> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the java.io.InputStream
     *
     * @return the java.io.InputStream
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public java.io.InputStream get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public ReportRootGetEmailAppUsageAppsUserCountsRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public ReportRootGetEmailAppUsageAppsUserCountsRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

}
