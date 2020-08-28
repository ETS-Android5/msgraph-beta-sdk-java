// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SkypeForBusinessDeviceUsageUserDetail;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Skype For Business Device Usage User Detail Collection Request.
 */
public class ReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionRequest extends BaseCollectionRequest<ReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionResponse, IReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionPage> implements IReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionRequest {


    /**
     * The request for this ReportRootGetSkypeForBusinessDeviceUsageUserDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionResponse.class, IReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionPage.class);
    }


    public void get(final ICallback<IReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionPage> callback) {
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

    public IReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionPage get() throws ClientException {
        final ReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionPage buildFromResponse(final ReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionResponse response) {
        final IReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (com.microsoft.graph.models.extensions.DateOnly) null);
        } else {
            builder = null;
        }
        final IReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionPage page = new ReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IReportRootGetSkypeForBusinessDeviceUsageUserDetailCollectionRequest)this;
    }

}
