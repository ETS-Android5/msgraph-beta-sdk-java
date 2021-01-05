// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceShellScript;
import com.microsoft.graph.models.extensions.DeviceManagementScriptGroupAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptGroupAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptGroupAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptGroupAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptGroupAssignmentCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptGroupAssignmentCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Script Group Assignment Collection Request.
 */
public class DeviceManagementScriptGroupAssignmentCollectionRequest extends BaseCollectionRequest<DeviceManagementScriptGroupAssignmentCollectionResponse, IDeviceManagementScriptGroupAssignmentCollectionPage> implements IDeviceManagementScriptGroupAssignmentCollectionRequest {

    /**
     * The request builder for this collection of DeviceManagementScriptGroupAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementScriptGroupAssignmentCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementScriptGroupAssignmentCollectionResponse.class, IDeviceManagementScriptGroupAssignmentCollectionPage.class);
    }

    public void get(final ICallback<? super IDeviceManagementScriptGroupAssignmentCollectionPage> callback) {
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

    public IDeviceManagementScriptGroupAssignmentCollectionPage get() throws ClientException {
        final DeviceManagementScriptGroupAssignmentCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceManagementScriptGroupAssignment newDeviceManagementScriptGroupAssignment, final ICallback<? super DeviceManagementScriptGroupAssignment> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceManagementScriptGroupAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceManagementScriptGroupAssignment, callback);
    }

    public DeviceManagementScriptGroupAssignment post(final DeviceManagementScriptGroupAssignment newDeviceManagementScriptGroupAssignment) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceManagementScriptGroupAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceManagementScriptGroupAssignment);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceManagementScriptGroupAssignmentCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceManagementScriptGroupAssignmentCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IDeviceManagementScriptGroupAssignmentCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (DeviceManagementScriptGroupAssignmentCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IDeviceManagementScriptGroupAssignmentCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (DeviceManagementScriptGroupAssignmentCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceManagementScriptGroupAssignmentCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceManagementScriptGroupAssignmentCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceManagementScriptGroupAssignmentCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DeviceManagementScriptGroupAssignmentCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IDeviceManagementScriptGroupAssignmentCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (DeviceManagementScriptGroupAssignmentCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IDeviceManagementScriptGroupAssignmentCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IDeviceManagementScriptGroupAssignmentCollectionRequest)this;
    }
    public IDeviceManagementScriptGroupAssignmentCollectionPage buildFromResponse(final DeviceManagementScriptGroupAssignmentCollectionResponse response) {
        final IDeviceManagementScriptGroupAssignmentCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceManagementScriptGroupAssignmentCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceManagementScriptGroupAssignmentCollectionPage page = new DeviceManagementScriptGroupAssignmentCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
