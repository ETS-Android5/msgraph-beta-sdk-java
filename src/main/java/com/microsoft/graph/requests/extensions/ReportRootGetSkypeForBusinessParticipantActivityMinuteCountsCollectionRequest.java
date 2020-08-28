// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SkypeForBusinessParticipantActivityMinuteCounts;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessParticipantActivityMinuteCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessParticipantActivityMinuteCountsCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessParticipantActivityMinuteCountsCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Skype For Business Participant Activity Minute Counts Collection Request.
 */
public class ReportRootGetSkypeForBusinessParticipantActivityMinuteCountsCollectionRequest extends BaseCollectionRequest<ReportRootGetSkypeForBusinessParticipantActivityMinuteCountsCollectionResponse, IReportRootGetSkypeForBusinessParticipantActivityMinuteCountsCollectionPage> implements IReportRootGetSkypeForBusinessParticipantActivityMinuteCountsCollectionRequest {


    /**
     * The request for this ReportRootGetSkypeForBusinessParticipantActivityMinuteCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetSkypeForBusinessParticipantActivityMinuteCountsCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootGetSkypeForBusinessParticipantActivityMinuteCountsCollectionResponse.class, IReportRootGetSkypeForBusinessParticipantActivityMinuteCountsCollectionPage.class);
    }


    public void get(final ICallback<IReportRootGetSkypeForBusinessParticipantActivityMinuteCountsCollectionPage> callback) {
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

    public IReportRootGetSkypeForBusinessParticipantActivityMinuteCountsCollectionPage get() throws ClientException {
        final ReportRootGetSkypeForBusinessParticipantActivityMinuteCountsCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IReportRootGetSkypeForBusinessParticipantActivityMinuteCountsCollectionPage buildFromResponse(final ReportRootGetSkypeForBusinessParticipantActivityMinuteCountsCollectionResponse response) {
        final IReportRootGetSkypeForBusinessParticipantActivityMinuteCountsCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ReportRootGetSkypeForBusinessParticipantActivityMinuteCountsCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (String) null);
        } else {
            builder = null;
        }
        final IReportRootGetSkypeForBusinessParticipantActivityMinuteCountsCollectionPage page = new ReportRootGetSkypeForBusinessParticipantActivityMinuteCountsCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IReportRootGetSkypeForBusinessParticipantActivityMinuteCountsCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IReportRootGetSkypeForBusinessParticipantActivityMinuteCountsCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IReportRootGetSkypeForBusinessParticipantActivityMinuteCountsCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IReportRootGetSkypeForBusinessParticipantActivityMinuteCountsCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IReportRootGetSkypeForBusinessParticipantActivityMinuteCountsCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IReportRootGetSkypeForBusinessParticipantActivityMinuteCountsCollectionRequest)this;
    }

}
