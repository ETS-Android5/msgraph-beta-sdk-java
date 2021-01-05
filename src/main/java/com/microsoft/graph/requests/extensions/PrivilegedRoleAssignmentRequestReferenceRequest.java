// Template Source: BaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrivilegedRoleAssignmentRequest;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedRoleRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Role Assignment Request Reference Request.
 */
public class PrivilegedRoleAssignmentRequestReferenceRequest extends BaseRequest implements IPrivilegedRoleAssignmentRequestReferenceRequest {

    /**
     * The request for the PrivilegedRoleAssignmentRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedRoleAssignmentRequestReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrivilegedRoleAssignmentRequest.class);
    }

    public void delete(final ICallback<? super PrivilegedRoleAssignmentRequest> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public PrivilegedRoleAssignmentRequest delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPrivilegedRoleAssignmentRequestReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PrivilegedRoleAssignmentRequestReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPrivilegedRoleAssignmentRequestReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PrivilegedRoleAssignmentRequestReferenceRequest)this;
    }
    /**
     * Puts the PrivilegedRoleAssignmentRequest
     *
     * @param srcPrivilegedRoleAssignmentRequest the PrivilegedRoleAssignmentRequest reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(PrivilegedRoleAssignmentRequest srcPrivilegedRoleAssignmentRequest, final ICallback<? super PrivilegedRoleAssignmentRequest> callback) {
        send(HttpMethod.PUT, callback, srcPrivilegedRoleAssignmentRequest);
    }

    /**
     * Puts the PrivilegedRoleAssignmentRequest
     *
     * @param srcPrivilegedRoleAssignmentRequest the PrivilegedRoleAssignmentRequest reference to PUT
     * @return the PrivilegedRoleAssignmentRequest
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public PrivilegedRoleAssignmentRequest put(PrivilegedRoleAssignmentRequest srcPrivilegedRoleAssignmentRequest) throws ClientException {
        return send(HttpMethod.PUT, srcPrivilegedRoleAssignmentRequest);
    }
}
