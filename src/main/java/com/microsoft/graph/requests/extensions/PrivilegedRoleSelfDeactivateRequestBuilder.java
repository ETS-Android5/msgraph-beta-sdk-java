// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleSelfDeactivateRequest;
import com.microsoft.graph.requests.extensions.PrivilegedRoleSelfDeactivateRequest;
import com.microsoft.graph.models.extensions.PrivilegedRoleAssignment;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Role Self Deactivate Request Builder.
 */
public class PrivilegedRoleSelfDeactivateRequestBuilder extends BaseActionRequestBuilder implements IPrivilegedRoleSelfDeactivateRequestBuilder {

    /**
     * The request builder for this PrivilegedRoleSelfDeactivate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedRoleSelfDeactivateRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IPrivilegedRoleSelfDeactivateRequest
     *
     * @return the IPrivilegedRoleSelfDeactivateRequest instance
     */
    public IPrivilegedRoleSelfDeactivateRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IPrivilegedRoleSelfDeactivateRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IPrivilegedRoleSelfDeactivateRequest instance
     */
    public IPrivilegedRoleSelfDeactivateRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        PrivilegedRoleSelfDeactivateRequest request = new PrivilegedRoleSelfDeactivateRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
