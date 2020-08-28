// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackage;
import com.microsoft.graph.models.extensions.AccessPackageResourceRoleScope;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRoleScopeCollectionPage;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRoleScopeCollectionResponse;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRoleScopeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRoleScopeCollectionRequest;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRoleScopeCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Resource Role Scope Collection Request.
 */
public class AccessPackageResourceRoleScopeCollectionRequest extends BaseCollectionRequest<AccessPackageResourceRoleScopeCollectionResponse, IAccessPackageResourceRoleScopeCollectionPage> implements IAccessPackageResourceRoleScopeCollectionRequest {

    /**
     * The request builder for this collection of AccessPackageResourceRoleScope
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageResourceRoleScopeCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessPackageResourceRoleScopeCollectionResponse.class, IAccessPackageResourceRoleScopeCollectionPage.class);
    }

    public void get(final ICallback<IAccessPackageResourceRoleScopeCollectionPage> callback) {
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

    public IAccessPackageResourceRoleScopeCollectionPage get() throws ClientException {
        final AccessPackageResourceRoleScopeCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final AccessPackageResourceRoleScope newAccessPackageResourceRoleScope, final ICallback<AccessPackageResourceRoleScope> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new AccessPackageResourceRoleScopeRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newAccessPackageResourceRoleScope, callback);
    }

    public AccessPackageResourceRoleScope post(final AccessPackageResourceRoleScope newAccessPackageResourceRoleScope) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new AccessPackageResourceRoleScopeRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newAccessPackageResourceRoleScope);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAccessPackageResourceRoleScopeCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AccessPackageResourceRoleScopeCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAccessPackageResourceRoleScopeCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (AccessPackageResourceRoleScopeCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IAccessPackageResourceRoleScopeCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (AccessPackageResourceRoleScopeCollectionRequest)this;
    }

    public IAccessPackageResourceRoleScopeCollectionPage buildFromResponse(final AccessPackageResourceRoleScopeCollectionResponse response) {
        final IAccessPackageResourceRoleScopeCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new AccessPackageResourceRoleScopeCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final AccessPackageResourceRoleScopeCollectionPage page = new AccessPackageResourceRoleScopeCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
