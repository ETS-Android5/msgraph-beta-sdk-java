// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Office365ActivationsUserCounts;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ActivationsUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365ActivationsUserCountsCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365ActivationsUserCountsCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Office365Activations User Counts Collection Request.
 */
public class ReportRootGetOffice365ActivationsUserCountsCollectionRequest extends BaseCollectionRequest<ReportRootGetOffice365ActivationsUserCountsCollectionResponse, IReportRootGetOffice365ActivationsUserCountsCollectionPage> implements IReportRootGetOffice365ActivationsUserCountsCollectionRequest {


    /**
     * The request for this ReportRootGetOffice365ActivationsUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetOffice365ActivationsUserCountsCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootGetOffice365ActivationsUserCountsCollectionResponse.class, IReportRootGetOffice365ActivationsUserCountsCollectionPage.class);
    }


    public void get(final ICallback<IReportRootGetOffice365ActivationsUserCountsCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IReportRootGetOffice365ActivationsUserCountsCollectionPage get() throws ClientException {
        final ReportRootGetOffice365ActivationsUserCountsCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IReportRootGetOffice365ActivationsUserCountsCollectionPage buildFromResponse(final ReportRootGetOffice365ActivationsUserCountsCollectionResponse response) {
        final IReportRootGetOffice365ActivationsUserCountsCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ReportRootGetOffice365ActivationsUserCountsCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final IReportRootGetOffice365ActivationsUserCountsCollectionPage page = new ReportRootGetOffice365ActivationsUserCountsCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IReportRootGetOffice365ActivationsUserCountsCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IReportRootGetOffice365ActivationsUserCountsCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IReportRootGetOffice365ActivationsUserCountsCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IReportRootGetOffice365ActivationsUserCountsCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IReportRootGetOffice365ActivationsUserCountsCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IReportRootGetOffice365ActivationsUserCountsCollectionRequest)this;
    }

}
