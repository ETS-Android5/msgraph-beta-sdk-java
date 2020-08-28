// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Office365ServicesUserCounts;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Office365Services User Counts Request.
 */
public interface IOffice365ServicesUserCountsRequest extends IHttpRequest {

    /**
     * Gets the Office365ServicesUserCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Office365ServicesUserCounts> callback);

    /**
     * Gets the Office365ServicesUserCounts from the service
     *
     * @return the Office365ServicesUserCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Office365ServicesUserCounts get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Office365ServicesUserCounts> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Office365ServicesUserCounts with a source
     *
     * @param sourceOffice365ServicesUserCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Office365ServicesUserCounts sourceOffice365ServicesUserCounts, final ICallback<Office365ServicesUserCounts> callback);

    /**
     * Patches this Office365ServicesUserCounts with a source
     *
     * @param sourceOffice365ServicesUserCounts the source object with updates
     * @return the updated Office365ServicesUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Office365ServicesUserCounts patch(final Office365ServicesUserCounts sourceOffice365ServicesUserCounts) throws ClientException;

    /**
     * Posts a Office365ServicesUserCounts with a new object
     *
     * @param newOffice365ServicesUserCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Office365ServicesUserCounts newOffice365ServicesUserCounts, final ICallback<Office365ServicesUserCounts> callback);

    /**
     * Posts a Office365ServicesUserCounts with a new object
     *
     * @param newOffice365ServicesUserCounts the new object to create
     * @return the created Office365ServicesUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Office365ServicesUserCounts post(final Office365ServicesUserCounts newOffice365ServicesUserCounts) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IOffice365ServicesUserCountsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IOffice365ServicesUserCountsRequest expand(final String value);

}

