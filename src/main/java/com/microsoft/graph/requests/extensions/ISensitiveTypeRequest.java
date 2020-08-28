// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SensitiveType;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Sensitive Type Request.
 */
public interface ISensitiveTypeRequest extends IHttpRequest {

    /**
     * Gets the SensitiveType from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<SensitiveType> callback);

    /**
     * Gets the SensitiveType from the service
     *
     * @return the SensitiveType from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SensitiveType get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<SensitiveType> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SensitiveType with a source
     *
     * @param sourceSensitiveType the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SensitiveType sourceSensitiveType, final ICallback<SensitiveType> callback);

    /**
     * Patches this SensitiveType with a source
     *
     * @param sourceSensitiveType the source object with updates
     * @return the updated SensitiveType
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SensitiveType patch(final SensitiveType sourceSensitiveType) throws ClientException;

    /**
     * Posts a SensitiveType with a new object
     *
     * @param newSensitiveType the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SensitiveType newSensitiveType, final ICallback<SensitiveType> callback);

    /**
     * Posts a SensitiveType with a new object
     *
     * @param newSensitiveType the new object to create
     * @return the created SensitiveType
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SensitiveType post(final SensitiveType newSensitiveType) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISensitiveTypeRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISensitiveTypeRequest expand(final String value);

}

