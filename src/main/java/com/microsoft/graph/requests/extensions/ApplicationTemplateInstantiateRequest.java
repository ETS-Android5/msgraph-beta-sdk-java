// Template Source: BaseMethodBodyRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ApplicationTemplateInstantiateBody;
import com.microsoft.graph.models.extensions.ApplicationServicePrincipal;
import com.microsoft.graph.requests.extensions.IApplicationTemplateInstantiateRequest;
import com.microsoft.graph.requests.extensions.ApplicationTemplateInstantiateRequest;

import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Application Template Instantiate Request.
 */
public class ApplicationTemplateInstantiateRequest extends BaseRequest implements IApplicationTemplateInstantiateRequest {
    protected final ApplicationTemplateInstantiateBody body;

    /**
     * The request for this ApplicationTemplateInstantiate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ApplicationTemplateInstantiateRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ApplicationServicePrincipal.class);
        body = new ApplicationTemplateInstantiateBody();
    }

    public void post(final ICallback<? super ApplicationServicePrincipal> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public ApplicationServicePrincipal post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IApplicationTemplateInstantiateRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ApplicationTemplateInstantiateRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IApplicationTemplateInstantiateRequest top(final int value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (ApplicationTemplateInstantiateRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IApplicationTemplateInstantiateRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ApplicationTemplateInstantiateRequest)this;
    }

}
