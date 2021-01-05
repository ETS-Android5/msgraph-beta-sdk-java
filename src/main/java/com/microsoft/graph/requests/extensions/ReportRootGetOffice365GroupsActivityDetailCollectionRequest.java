// Template Source: BaseMethodCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Office365GroupsActivityDetail;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetOffice365GroupsActivityDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365GroupsActivityDetailCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365GroupsActivityDetailCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Office365Groups Activity Detail Collection Request.
 */
public class ReportRootGetOffice365GroupsActivityDetailCollectionRequest extends BaseCollectionRequest<ReportRootGetOffice365GroupsActivityDetailCollectionResponse, IReportRootGetOffice365GroupsActivityDetailCollectionPage> implements IReportRootGetOffice365GroupsActivityDetailCollectionRequest {


    /**
     * The request for this ReportRootGetOffice365GroupsActivityDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetOffice365GroupsActivityDetailCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootGetOffice365GroupsActivityDetailCollectionResponse.class, IReportRootGetOffice365GroupsActivityDetailCollectionPage.class);
    }


    public void get(final ICallback<? super IReportRootGetOffice365GroupsActivityDetailCollectionPage> callback) {
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

    public IReportRootGetOffice365GroupsActivityDetailCollectionPage get() throws ClientException {
        final ReportRootGetOffice365GroupsActivityDetailCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IReportRootGetOffice365GroupsActivityDetailCollectionPage buildFromResponse(final ReportRootGetOffice365GroupsActivityDetailCollectionResponse response) {
        final IReportRootGetOffice365GroupsActivityDetailCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ReportRootGetOffice365GroupsActivityDetailCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (com.microsoft.graph.models.extensions.DateOnly) null);
        } else {
            builder = null;
        }
        final IReportRootGetOffice365GroupsActivityDetailCollectionPage page = new ReportRootGetOffice365GroupsActivityDetailCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IReportRootGetOffice365GroupsActivityDetailCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IReportRootGetOffice365GroupsActivityDetailCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IReportRootGetOffice365GroupsActivityDetailCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IReportRootGetOffice365GroupsActivityDetailCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IReportRootGetOffice365GroupsActivityDetailCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IReportRootGetOffice365GroupsActivityDetailCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IReportRootGetOffice365GroupsActivityDetailCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IReportRootGetOffice365GroupsActivityDetailCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IReportRootGetOffice365GroupsActivityDetailCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (IReportRootGetOffice365GroupsActivityDetailCollectionRequest)this;
    }

}
