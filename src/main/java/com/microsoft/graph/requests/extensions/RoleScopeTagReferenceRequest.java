// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RoleScopeTag;
import com.microsoft.graph.models.extensions.RoleScopeTagAutoAssignment;
import com.microsoft.graph.requests.extensions.IRoleScopeTagAutoAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleScopeTagAutoAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleScopeTagAutoAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleScopeTagAutoAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Role Scope Tag Reference Request.
 */
public class RoleScopeTagReferenceRequest extends BaseRequest implements IRoleScopeTagReferenceRequest {

    /**
     * The request for the RoleScopeTag
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RoleScopeTagReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, RoleScopeTag.class);
    }

    public void delete(final ICallback<RoleScopeTag> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public RoleScopeTag delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IRoleScopeTagReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (RoleScopeTagReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IRoleScopeTagReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (RoleScopeTagReferenceRequest)this;
    }
    /**
     * Puts the RoleScopeTag
     *
     * @param srcRoleScopeTag the RoleScopeTag reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(RoleScopeTag srcRoleScopeTag, final ICallback<RoleScopeTag> callback) {
        send(HttpMethod.PUT, callback, srcRoleScopeTag);
    }

    /**
     * Puts the RoleScopeTag
     *
     * @param srcRoleScopeTag the RoleScopeTag reference to PUT
     * @return the RoleScopeTag
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public RoleScopeTag put(RoleScopeTag srcRoleScopeTag) throws ClientException {
        return send(HttpMethod.PUT, srcRoleScopeTag);
    }
}
