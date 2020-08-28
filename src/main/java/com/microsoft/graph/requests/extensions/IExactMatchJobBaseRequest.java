// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ExactMatchJobBase;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Exact Match Job Base Request.
 */
public interface IExactMatchJobBaseRequest extends IHttpRequest {

    /**
     * Gets the ExactMatchJobBase from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<ExactMatchJobBase> callback);

    /**
     * Gets the ExactMatchJobBase from the service
     *
     * @return the ExactMatchJobBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ExactMatchJobBase get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<ExactMatchJobBase> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ExactMatchJobBase with a source
     *
     * @param sourceExactMatchJobBase the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ExactMatchJobBase sourceExactMatchJobBase, final ICallback<ExactMatchJobBase> callback);

    /**
     * Patches this ExactMatchJobBase with a source
     *
     * @param sourceExactMatchJobBase the source object with updates
     * @return the updated ExactMatchJobBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ExactMatchJobBase patch(final ExactMatchJobBase sourceExactMatchJobBase) throws ClientException;

    /**
     * Posts a ExactMatchJobBase with a new object
     *
     * @param newExactMatchJobBase the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ExactMatchJobBase newExactMatchJobBase, final ICallback<ExactMatchJobBase> callback);

    /**
     * Posts a ExactMatchJobBase with a new object
     *
     * @param newExactMatchJobBase the new object to create
     * @return the created ExactMatchJobBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ExactMatchJobBase post(final ExactMatchJobBase newExactMatchJobBase) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IExactMatchJobBaseRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IExactMatchJobBaseRequest expand(final String value);

}

