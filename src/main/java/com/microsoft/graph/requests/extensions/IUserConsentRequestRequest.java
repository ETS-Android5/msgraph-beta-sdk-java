// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserConsentRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Consent Request Request.
 */
public interface IUserConsentRequestRequest extends IHttpRequest {

    /**
     * Gets the UserConsentRequest from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<UserConsentRequest> callback);

    /**
     * Gets the UserConsentRequest from the service
     *
     * @return the UserConsentRequest from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserConsentRequest get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<UserConsentRequest> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this UserConsentRequest with a source
     *
     * @param sourceUserConsentRequest the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final UserConsentRequest sourceUserConsentRequest, final ICallback<UserConsentRequest> callback);

    /**
     * Patches this UserConsentRequest with a source
     *
     * @param sourceUserConsentRequest the source object with updates
     * @return the updated UserConsentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserConsentRequest patch(final UserConsentRequest sourceUserConsentRequest) throws ClientException;

    /**
     * Posts a UserConsentRequest with a new object
     *
     * @param newUserConsentRequest the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final UserConsentRequest newUserConsentRequest, final ICallback<UserConsentRequest> callback);

    /**
     * Posts a UserConsentRequest with a new object
     *
     * @param newUserConsentRequest the new object to create
     * @return the created UserConsentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserConsentRequest post(final UserConsentRequest newUserConsentRequest) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUserConsentRequestRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUserConsentRequestRequest expand(final String value);

}

