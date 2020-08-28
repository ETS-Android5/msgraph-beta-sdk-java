// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.GroupPolicyMigrationReport;
import com.microsoft.graph.models.extensions.GroupPolicyObjectFile;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IGroupPolicyMigrationReportCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyMigrationReportCollectionResponse;
import com.microsoft.graph.requests.extensions.IGroupPolicyMigrationReportCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyMigrationReportCollectionRequest;
import com.microsoft.graph.requests.extensions.GroupPolicyMigrationReportCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Migration Report Collection Request.
 */
public class GroupPolicyMigrationReportCollectionRequest extends BaseCollectionRequest<GroupPolicyMigrationReportCollectionResponse, IGroupPolicyMigrationReportCollectionPage> implements IGroupPolicyMigrationReportCollectionRequest {

    /**
     * The request builder for this collection of GroupPolicyMigrationReport
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyMigrationReportCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyMigrationReportCollectionResponse.class, IGroupPolicyMigrationReportCollectionPage.class);
    }

    public void get(final ICallback<IGroupPolicyMigrationReportCollectionPage> callback) {
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

    public IGroupPolicyMigrationReportCollectionPage get() throws ClientException {
        final GroupPolicyMigrationReportCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final GroupPolicyMigrationReport newGroupPolicyMigrationReport, final ICallback<GroupPolicyMigrationReport> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new GroupPolicyMigrationReportRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newGroupPolicyMigrationReport, callback);
    }

    public GroupPolicyMigrationReport post(final GroupPolicyMigrationReport newGroupPolicyMigrationReport) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new GroupPolicyMigrationReportRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newGroupPolicyMigrationReport);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IGroupPolicyMigrationReportCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (GroupPolicyMigrationReportCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IGroupPolicyMigrationReportCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (GroupPolicyMigrationReportCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IGroupPolicyMigrationReportCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (GroupPolicyMigrationReportCollectionRequest)this;
    }

    public IGroupPolicyMigrationReportCollectionPage buildFromResponse(final GroupPolicyMigrationReportCollectionResponse response) {
        final IGroupPolicyMigrationReportCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new GroupPolicyMigrationReportCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final GroupPolicyMigrationReportCollectionPage page = new GroupPolicyMigrationReportCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
