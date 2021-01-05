// Template Source: BaseMethodCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDeviceConfigurationHasPayloadLinksCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationHasPayloadLinksCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceConfigurationHasPayloadLinksCollectionResponse;
import com.microsoft.graph.models.extensions.DeviceConfigurationHasPayloadLinksBody;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Has Payload Links Collection Request.
 */
public class DeviceConfigurationHasPayloadLinksCollectionRequest extends BaseCollectionRequest<DeviceConfigurationHasPayloadLinksCollectionResponse, IDeviceConfigurationHasPayloadLinksCollectionPage> implements IDeviceConfigurationHasPayloadLinksCollectionRequest {


    protected final DeviceConfigurationHasPayloadLinksBody body;


    /**
     * The request for this DeviceConfigurationHasPayloadLinks
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceConfigurationHasPayloadLinksCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceConfigurationHasPayloadLinksCollectionResponse.class, IDeviceConfigurationHasPayloadLinksCollectionPage.class);
        body = new DeviceConfigurationHasPayloadLinksBody();
    }


    public void post(final ICallback<? super IDeviceConfigurationHasPayloadLinksCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(post(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IDeviceConfigurationHasPayloadLinksCollectionPage post() throws ClientException {
        final DeviceConfigurationHasPayloadLinksCollectionResponse response = post(body);
        return buildFromResponse(response);
    }


    public IDeviceConfigurationHasPayloadLinksCollectionPage buildFromResponse(final DeviceConfigurationHasPayloadLinksCollectionResponse response) {
        final IDeviceConfigurationHasPayloadLinksCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceConfigurationHasPayloadLinksCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (java.util.List<String>) null);
        } else {
            builder = null;
        }
        final IDeviceConfigurationHasPayloadLinksCollectionPage page = new DeviceConfigurationHasPayloadLinksCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceConfigurationHasPayloadLinksCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IDeviceConfigurationHasPayloadLinksCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceConfigurationHasPayloadLinksCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IDeviceConfigurationHasPayloadLinksCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceConfigurationHasPayloadLinksCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IDeviceConfigurationHasPayloadLinksCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IDeviceConfigurationHasPayloadLinksCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IDeviceConfigurationHasPayloadLinksCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IDeviceConfigurationHasPayloadLinksCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (IDeviceConfigurationHasPayloadLinksCollectionRequest)this;
    }

}
