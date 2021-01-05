// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsDefenderApplicationControlSupplementalPolicyAssignment;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Defender Application Control Supplemental Policy Assignment Request.
 */
public interface IWindowsDefenderApplicationControlSupplementalPolicyAssignmentRequest extends IHttpRequest {

    /**
     * Gets the WindowsDefenderApplicationControlSupplementalPolicyAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super WindowsDefenderApplicationControlSupplementalPolicyAssignment> callback);

    /**
     * Gets the WindowsDefenderApplicationControlSupplementalPolicyAssignment from the service
     *
     * @return the WindowsDefenderApplicationControlSupplementalPolicyAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsDefenderApplicationControlSupplementalPolicyAssignment get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super WindowsDefenderApplicationControlSupplementalPolicyAssignment> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WindowsDefenderApplicationControlSupplementalPolicyAssignment with a source
     *
     * @param sourceWindowsDefenderApplicationControlSupplementalPolicyAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WindowsDefenderApplicationControlSupplementalPolicyAssignment sourceWindowsDefenderApplicationControlSupplementalPolicyAssignment, final ICallback<? super WindowsDefenderApplicationControlSupplementalPolicyAssignment> callback);

    /**
     * Patches this WindowsDefenderApplicationControlSupplementalPolicyAssignment with a source
     *
     * @param sourceWindowsDefenderApplicationControlSupplementalPolicyAssignment the source object with updates
     * @return the updated WindowsDefenderApplicationControlSupplementalPolicyAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsDefenderApplicationControlSupplementalPolicyAssignment patch(final WindowsDefenderApplicationControlSupplementalPolicyAssignment sourceWindowsDefenderApplicationControlSupplementalPolicyAssignment) throws ClientException;

    /**
     * Posts a WindowsDefenderApplicationControlSupplementalPolicyAssignment with a new object
     *
     * @param newWindowsDefenderApplicationControlSupplementalPolicyAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WindowsDefenderApplicationControlSupplementalPolicyAssignment newWindowsDefenderApplicationControlSupplementalPolicyAssignment, final ICallback<? super WindowsDefenderApplicationControlSupplementalPolicyAssignment> callback);

    /**
     * Posts a WindowsDefenderApplicationControlSupplementalPolicyAssignment with a new object
     *
     * @param newWindowsDefenderApplicationControlSupplementalPolicyAssignment the new object to create
     * @return the created WindowsDefenderApplicationControlSupplementalPolicyAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsDefenderApplicationControlSupplementalPolicyAssignment post(final WindowsDefenderApplicationControlSupplementalPolicyAssignment newWindowsDefenderApplicationControlSupplementalPolicyAssignment) throws ClientException;

    /**
     * Posts a WindowsDefenderApplicationControlSupplementalPolicyAssignment with a new object
     *
     * @param newWindowsDefenderApplicationControlSupplementalPolicyAssignment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final WindowsDefenderApplicationControlSupplementalPolicyAssignment newWindowsDefenderApplicationControlSupplementalPolicyAssignment, final ICallback<? super WindowsDefenderApplicationControlSupplementalPolicyAssignment> callback);

    /**
     * Posts a WindowsDefenderApplicationControlSupplementalPolicyAssignment with a new object
     *
     * @param newWindowsDefenderApplicationControlSupplementalPolicyAssignment the object to create/update
     * @return the created WindowsDefenderApplicationControlSupplementalPolicyAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsDefenderApplicationControlSupplementalPolicyAssignment put(final WindowsDefenderApplicationControlSupplementalPolicyAssignment newWindowsDefenderApplicationControlSupplementalPolicyAssignment) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindowsDefenderApplicationControlSupplementalPolicyAssignmentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindowsDefenderApplicationControlSupplementalPolicyAssignmentRequest expand(final String value);

}

