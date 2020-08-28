// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AppleEnrollmentProfileAssignment;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Apple Enrollment Profile Assignment Request.
 */
public interface IAppleEnrollmentProfileAssignmentRequest extends IHttpRequest {

    /**
     * Gets the AppleEnrollmentProfileAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<AppleEnrollmentProfileAssignment> callback);

    /**
     * Gets the AppleEnrollmentProfileAssignment from the service
     *
     * @return the AppleEnrollmentProfileAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AppleEnrollmentProfileAssignment get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<AppleEnrollmentProfileAssignment> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AppleEnrollmentProfileAssignment with a source
     *
     * @param sourceAppleEnrollmentProfileAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AppleEnrollmentProfileAssignment sourceAppleEnrollmentProfileAssignment, final ICallback<AppleEnrollmentProfileAssignment> callback);

    /**
     * Patches this AppleEnrollmentProfileAssignment with a source
     *
     * @param sourceAppleEnrollmentProfileAssignment the source object with updates
     * @return the updated AppleEnrollmentProfileAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AppleEnrollmentProfileAssignment patch(final AppleEnrollmentProfileAssignment sourceAppleEnrollmentProfileAssignment) throws ClientException;

    /**
     * Posts a AppleEnrollmentProfileAssignment with a new object
     *
     * @param newAppleEnrollmentProfileAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AppleEnrollmentProfileAssignment newAppleEnrollmentProfileAssignment, final ICallback<AppleEnrollmentProfileAssignment> callback);

    /**
     * Posts a AppleEnrollmentProfileAssignment with a new object
     *
     * @param newAppleEnrollmentProfileAssignment the new object to create
     * @return the created AppleEnrollmentProfileAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AppleEnrollmentProfileAssignment post(final AppleEnrollmentProfileAssignment newAppleEnrollmentProfileAssignment) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAppleEnrollmentProfileAssignmentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAppleEnrollmentProfileAssignmentRequest expand(final String value);

}

