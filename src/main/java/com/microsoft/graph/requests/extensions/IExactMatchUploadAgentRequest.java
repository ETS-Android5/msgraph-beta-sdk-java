// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ExactMatchUploadAgent;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Exact Match Upload Agent Request.
 */
public interface IExactMatchUploadAgentRequest extends IHttpRequest {

    /**
     * Gets the ExactMatchUploadAgent from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super ExactMatchUploadAgent> callback);

    /**
     * Gets the ExactMatchUploadAgent from the service
     *
     * @return the ExactMatchUploadAgent from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ExactMatchUploadAgent get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super ExactMatchUploadAgent> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ExactMatchUploadAgent with a source
     *
     * @param sourceExactMatchUploadAgent the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ExactMatchUploadAgent sourceExactMatchUploadAgent, final ICallback<? super ExactMatchUploadAgent> callback);

    /**
     * Patches this ExactMatchUploadAgent with a source
     *
     * @param sourceExactMatchUploadAgent the source object with updates
     * @return the updated ExactMatchUploadAgent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ExactMatchUploadAgent patch(final ExactMatchUploadAgent sourceExactMatchUploadAgent) throws ClientException;

    /**
     * Posts a ExactMatchUploadAgent with a new object
     *
     * @param newExactMatchUploadAgent the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ExactMatchUploadAgent newExactMatchUploadAgent, final ICallback<? super ExactMatchUploadAgent> callback);

    /**
     * Posts a ExactMatchUploadAgent with a new object
     *
     * @param newExactMatchUploadAgent the new object to create
     * @return the created ExactMatchUploadAgent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ExactMatchUploadAgent post(final ExactMatchUploadAgent newExactMatchUploadAgent) throws ClientException;

    /**
     * Posts a ExactMatchUploadAgent with a new object
     *
     * @param newExactMatchUploadAgent the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ExactMatchUploadAgent newExactMatchUploadAgent, final ICallback<? super ExactMatchUploadAgent> callback);

    /**
     * Posts a ExactMatchUploadAgent with a new object
     *
     * @param newExactMatchUploadAgent the object to create/update
     * @return the created ExactMatchUploadAgent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ExactMatchUploadAgent put(final ExactMatchUploadAgent newExactMatchUploadAgent) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IExactMatchUploadAgentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IExactMatchUploadAgentRequest expand(final String value);

}

