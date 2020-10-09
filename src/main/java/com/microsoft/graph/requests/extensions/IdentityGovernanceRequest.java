// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IdentityGovernance;
import com.microsoft.graph.requests.extensions.IAccessReviewSetRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewSetRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppConsentApprovalRouteRequestBuilder;
import com.microsoft.graph.requests.extensions.AppConsentApprovalRouteRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsOfUseContainerRequestBuilder;
import com.microsoft.graph.requests.extensions.TermsOfUseContainerRequestBuilder;
import com.microsoft.graph.requests.extensions.IEntitlementManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.EntitlementManagementRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity Governance Request.
 */
public class IdentityGovernanceRequest extends BaseRequest implements IIdentityGovernanceRequest {
	
    /**
     * The request for the IdentityGovernance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IdentityGovernanceRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IdentityGovernance.class);
    }

    /**
     * Gets the IdentityGovernance from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super IdentityGovernance> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the IdentityGovernance from the service
     *
     * @return the IdentityGovernance from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IdentityGovernance get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super IdentityGovernance> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this IdentityGovernance with a source
     *
     * @param sourceIdentityGovernance the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final IdentityGovernance sourceIdentityGovernance, final ICallback<? super IdentityGovernance> callback) {
        send(HttpMethod.PATCH, callback, sourceIdentityGovernance);
    }

    /**
     * Patches this IdentityGovernance with a source
     *
     * @param sourceIdentityGovernance the source object with updates
     * @return the updated IdentityGovernance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IdentityGovernance patch(final IdentityGovernance sourceIdentityGovernance) throws ClientException {
        return send(HttpMethod.PATCH, sourceIdentityGovernance);
    }

    /**
     * Creates a IdentityGovernance with a new object
     *
     * @param newIdentityGovernance the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final IdentityGovernance newIdentityGovernance, final ICallback<? super IdentityGovernance> callback) {
        send(HttpMethod.POST, callback, newIdentityGovernance);
    }

    /**
     * Creates a IdentityGovernance with a new object
     *
     * @param newIdentityGovernance the new object to create
     * @return the created IdentityGovernance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IdentityGovernance post(final IdentityGovernance newIdentityGovernance) throws ClientException {
        return send(HttpMethod.POST, newIdentityGovernance);
    }

    /**
     * Creates a IdentityGovernance with a new object
     *
     * @param newIdentityGovernance the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final IdentityGovernance newIdentityGovernance, final ICallback<? super IdentityGovernance> callback) {
        send(HttpMethod.PUT, callback, newIdentityGovernance);
    }

    /**
     * Creates a IdentityGovernance with a new object
     *
     * @param newIdentityGovernance the object to create/update
     * @return the created IdentityGovernance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IdentityGovernance put(final IdentityGovernance newIdentityGovernance) throws ClientException {
        return send(HttpMethod.PUT, newIdentityGovernance);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IIdentityGovernanceRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (IdentityGovernanceRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IIdentityGovernanceRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (IdentityGovernanceRequest)this;
     }

}

