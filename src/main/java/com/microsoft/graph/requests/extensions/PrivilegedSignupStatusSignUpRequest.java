// Template Source: BaseMethodRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PrivilegedSignupStatus;
import com.microsoft.graph.requests.extensions.IPrivilegedSignupStatusSignUpRequest;
import com.microsoft.graph.requests.extensions.PrivilegedSignupStatusSignUpRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Signup Status Sign Up Request.
 */
public class PrivilegedSignupStatusSignUpRequest extends BaseRequest implements IPrivilegedSignupStatusSignUpRequest {

    /**
     * The request for this PrivilegedSignupStatusSignUp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedSignupStatusSignUpRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrivilegedSignupStatus.class);
    }

    /**
     * Creates the PrivilegedSignupStatusSignUp
     *
     * @param callback the callback to be called after success or failure
     */
    public void post(final ICallback<? super PrivilegedSignupStatus> callback) {
        send(HttpMethod.POST, callback, null);
    }

    /**
     * Creates the PrivilegedSignupStatusSignUp
     *
     * @return the PrivilegedSignupStatus
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public PrivilegedSignupStatus post() throws ClientException {
       return send(HttpMethod.POST, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPrivilegedSignupStatusSignUpRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PrivilegedSignupStatusSignUpRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPrivilegedSignupStatusSignUpRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PrivilegedSignupStatusSignUpRequest)this;
    }

}
