// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SiteUsageStorage;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Site Usage Storage Request.
 */
public interface ISiteUsageStorageRequest extends IHttpRequest {

    /**
     * Gets the SiteUsageStorage from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<SiteUsageStorage> callback);

    /**
     * Gets the SiteUsageStorage from the service
     *
     * @return the SiteUsageStorage from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SiteUsageStorage get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<SiteUsageStorage> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SiteUsageStorage with a source
     *
     * @param sourceSiteUsageStorage the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SiteUsageStorage sourceSiteUsageStorage, final ICallback<SiteUsageStorage> callback);

    /**
     * Patches this SiteUsageStorage with a source
     *
     * @param sourceSiteUsageStorage the source object with updates
     * @return the updated SiteUsageStorage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SiteUsageStorage patch(final SiteUsageStorage sourceSiteUsageStorage) throws ClientException;

    /**
     * Posts a SiteUsageStorage with a new object
     *
     * @param newSiteUsageStorage the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SiteUsageStorage newSiteUsageStorage, final ICallback<SiteUsageStorage> callback);

    /**
     * Posts a SiteUsageStorage with a new object
     *
     * @param newSiteUsageStorage the new object to create
     * @return the created SiteUsageStorage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SiteUsageStorage post(final SiteUsageStorage newSiteUsageStorage) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISiteUsageStorageRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISiteUsageStorageRequest expand(final String value);

}

