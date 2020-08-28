// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OneDriveUsageAccountDetail;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the One Drive Usage Account Detail Request.
 */
public interface IOneDriveUsageAccountDetailRequest extends IHttpRequest {

    /**
     * Gets the OneDriveUsageAccountDetail from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<OneDriveUsageAccountDetail> callback);

    /**
     * Gets the OneDriveUsageAccountDetail from the service
     *
     * @return the OneDriveUsageAccountDetail from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OneDriveUsageAccountDetail get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<OneDriveUsageAccountDetail> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this OneDriveUsageAccountDetail with a source
     *
     * @param sourceOneDriveUsageAccountDetail the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final OneDriveUsageAccountDetail sourceOneDriveUsageAccountDetail, final ICallback<OneDriveUsageAccountDetail> callback);

    /**
     * Patches this OneDriveUsageAccountDetail with a source
     *
     * @param sourceOneDriveUsageAccountDetail the source object with updates
     * @return the updated OneDriveUsageAccountDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OneDriveUsageAccountDetail patch(final OneDriveUsageAccountDetail sourceOneDriveUsageAccountDetail) throws ClientException;

    /**
     * Posts a OneDriveUsageAccountDetail with a new object
     *
     * @param newOneDriveUsageAccountDetail the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final OneDriveUsageAccountDetail newOneDriveUsageAccountDetail, final ICallback<OneDriveUsageAccountDetail> callback);

    /**
     * Posts a OneDriveUsageAccountDetail with a new object
     *
     * @param newOneDriveUsageAccountDetail the new object to create
     * @return the created OneDriveUsageAccountDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OneDriveUsageAccountDetail post(final OneDriveUsageAccountDetail newOneDriveUsageAccountDetail) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IOneDriveUsageAccountDetailRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IOneDriveUsageAccountDetailRequest expand(final String value);

}

