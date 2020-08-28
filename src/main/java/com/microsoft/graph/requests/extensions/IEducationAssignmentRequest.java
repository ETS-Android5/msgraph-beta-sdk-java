// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EducationAssignment;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Education Assignment Request.
 */
public interface IEducationAssignmentRequest extends IHttpRequest {

    /**
     * Gets the EducationAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<EducationAssignment> callback);

    /**
     * Gets the EducationAssignment from the service
     *
     * @return the EducationAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationAssignment get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<EducationAssignment> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this EducationAssignment with a source
     *
     * @param sourceEducationAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final EducationAssignment sourceEducationAssignment, final ICallback<EducationAssignment> callback);

    /**
     * Patches this EducationAssignment with a source
     *
     * @param sourceEducationAssignment the source object with updates
     * @return the updated EducationAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationAssignment patch(final EducationAssignment sourceEducationAssignment) throws ClientException;

    /**
     * Posts a EducationAssignment with a new object
     *
     * @param newEducationAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final EducationAssignment newEducationAssignment, final ICallback<EducationAssignment> callback);

    /**
     * Posts a EducationAssignment with a new object
     *
     * @param newEducationAssignment the new object to create
     * @return the created EducationAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationAssignment post(final EducationAssignment newEducationAssignment) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEducationAssignmentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEducationAssignmentRequest expand(final String value);

}

