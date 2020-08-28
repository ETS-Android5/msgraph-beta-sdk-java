// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SiteActivitySummary;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Site Activity Summary Request.
 */
public interface ISiteActivitySummaryRequest extends IHttpRequest {

    /**
     * Gets the SiteActivitySummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<SiteActivitySummary> callback);

    /**
     * Gets the SiteActivitySummary from the service
     *
     * @return the SiteActivitySummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SiteActivitySummary get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<SiteActivitySummary> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SiteActivitySummary with a source
     *
     * @param sourceSiteActivitySummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SiteActivitySummary sourceSiteActivitySummary, final ICallback<SiteActivitySummary> callback);

    /**
     * Patches this SiteActivitySummary with a source
     *
     * @param sourceSiteActivitySummary the source object with updates
     * @return the updated SiteActivitySummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SiteActivitySummary patch(final SiteActivitySummary sourceSiteActivitySummary) throws ClientException;

    /**
     * Posts a SiteActivitySummary with a new object
     *
     * @param newSiteActivitySummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SiteActivitySummary newSiteActivitySummary, final ICallback<SiteActivitySummary> callback);

    /**
     * Posts a SiteActivitySummary with a new object
     *
     * @param newSiteActivitySummary the new object to create
     * @return the created SiteActivitySummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SiteActivitySummary post(final SiteActivitySummary newSiteActivitySummary) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISiteActivitySummaryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISiteActivitySummaryRequest expand(final String value);

}

