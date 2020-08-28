// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.FileClassificationRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the File Classification Request Request.
 */
public interface IFileClassificationRequestRequest extends IHttpRequest {

    /**
     * Gets the FileClassificationRequest from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<FileClassificationRequest> callback);

    /**
     * Gets the FileClassificationRequest from the service
     *
     * @return the FileClassificationRequest from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    FileClassificationRequest get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<FileClassificationRequest> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this FileClassificationRequest with a source
     *
     * @param sourceFileClassificationRequest the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final FileClassificationRequest sourceFileClassificationRequest, final ICallback<FileClassificationRequest> callback);

    /**
     * Patches this FileClassificationRequest with a source
     *
     * @param sourceFileClassificationRequest the source object with updates
     * @return the updated FileClassificationRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    FileClassificationRequest patch(final FileClassificationRequest sourceFileClassificationRequest) throws ClientException;

    /**
     * Posts a FileClassificationRequest with a new object
     *
     * @param newFileClassificationRequest the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final FileClassificationRequest newFileClassificationRequest, final ICallback<FileClassificationRequest> callback);

    /**
     * Posts a FileClassificationRequest with a new object
     *
     * @param newFileClassificationRequest the new object to create
     * @return the created FileClassificationRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    FileClassificationRequest post(final FileClassificationRequest newFileClassificationRequest) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IFileClassificationRequestRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IFileClassificationRequestRequest expand(final String value);

}

