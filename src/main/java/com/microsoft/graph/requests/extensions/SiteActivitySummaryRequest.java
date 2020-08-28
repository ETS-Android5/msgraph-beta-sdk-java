// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SiteActivitySummary;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Activity Summary Request.
 */
public class SiteActivitySummaryRequest extends BaseRequest implements ISiteActivitySummaryRequest {
	
    /**
     * The request for the SiteActivitySummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SiteActivitySummaryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SiteActivitySummary.class);
    }

    /**
     * Gets the SiteActivitySummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<SiteActivitySummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SiteActivitySummary from the service
     *
     * @return the SiteActivitySummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SiteActivitySummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<SiteActivitySummary> callback) {
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
     * Patches this SiteActivitySummary with a source
     *
     * @param sourceSiteActivitySummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SiteActivitySummary sourceSiteActivitySummary, final ICallback<SiteActivitySummary> callback) {
        send(HttpMethod.PATCH, callback, sourceSiteActivitySummary);
    }

    /**
     * Patches this SiteActivitySummary with a source
     *
     * @param sourceSiteActivitySummary the source object with updates
     * @return the updated SiteActivitySummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SiteActivitySummary patch(final SiteActivitySummary sourceSiteActivitySummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceSiteActivitySummary);
    }

    /**
     * Creates a SiteActivitySummary with a new object
     *
     * @param newSiteActivitySummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SiteActivitySummary newSiteActivitySummary, final ICallback<SiteActivitySummary> callback) {
        send(HttpMethod.POST, callback, newSiteActivitySummary);
    }

    /**
     * Creates a SiteActivitySummary with a new object
     *
     * @param newSiteActivitySummary the new object to create
     * @return the created SiteActivitySummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SiteActivitySummary post(final SiteActivitySummary newSiteActivitySummary) throws ClientException {
        return send(HttpMethod.POST, newSiteActivitySummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISiteActivitySummaryRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SiteActivitySummaryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISiteActivitySummaryRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SiteActivitySummaryRequest)this;
     }

}

