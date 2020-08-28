// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EmailActivitySummary;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Email Activity Summary Request.
 */
public interface IEmailActivitySummaryRequest extends IHttpRequest {

    /**
     * Gets the EmailActivitySummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<EmailActivitySummary> callback);

    /**
     * Gets the EmailActivitySummary from the service
     *
     * @return the EmailActivitySummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EmailActivitySummary get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<EmailActivitySummary> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this EmailActivitySummary with a source
     *
     * @param sourceEmailActivitySummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final EmailActivitySummary sourceEmailActivitySummary, final ICallback<EmailActivitySummary> callback);

    /**
     * Patches this EmailActivitySummary with a source
     *
     * @param sourceEmailActivitySummary the source object with updates
     * @return the updated EmailActivitySummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EmailActivitySummary patch(final EmailActivitySummary sourceEmailActivitySummary) throws ClientException;

    /**
     * Posts a EmailActivitySummary with a new object
     *
     * @param newEmailActivitySummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final EmailActivitySummary newEmailActivitySummary, final ICallback<EmailActivitySummary> callback);

    /**
     * Posts a EmailActivitySummary with a new object
     *
     * @param newEmailActivitySummary the new object to create
     * @return the created EmailActivitySummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EmailActivitySummary post(final EmailActivitySummary newEmailActivitySummary) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEmailActivitySummaryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEmailActivitySummaryRequest expand(final String value);

}

