// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackageAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentMyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentMyCollectionPage;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentMyCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment My Collection Request.
 */
public class AccessPackageAssignmentMyCollectionRequest extends BaseCollectionRequest<AccessPackageAssignmentMyCollectionResponse, IAccessPackageAssignmentMyCollectionPage> implements IAccessPackageAssignmentMyCollectionRequest {


    /**
     * The request for this AccessPackageAssignmentMy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageAssignmentMyCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessPackageAssignmentMyCollectionResponse.class, IAccessPackageAssignmentMyCollectionPage.class);
    }


    public void get(final ICallback<IAccessPackageAssignmentMyCollectionPage> callback) {
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

    public IAccessPackageAssignmentMyCollectionPage get() throws ClientException {
        final AccessPackageAssignmentMyCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IAccessPackageAssignmentMyCollectionPage buildFromResponse(final AccessPackageAssignmentMyCollectionResponse response) {
        final IAccessPackageAssignmentMyCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new AccessPackageAssignmentMyCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final IAccessPackageAssignmentMyCollectionPage page = new AccessPackageAssignmentMyCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAccessPackageAssignmentMyCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IAccessPackageAssignmentMyCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IAccessPackageAssignmentMyCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IAccessPackageAssignmentMyCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAccessPackageAssignmentMyCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IAccessPackageAssignmentMyCollectionRequest)this;
    }

}
