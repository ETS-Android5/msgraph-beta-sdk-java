// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.RestrictedSignIn;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Restricted Sign In Request.
 */
public interface IRestrictedSignInRequest extends IHttpRequest {

    /**
     * Gets the RestrictedSignIn from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<RestrictedSignIn> callback);

    /**
     * Gets the RestrictedSignIn from the service
     *
     * @return the RestrictedSignIn from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RestrictedSignIn get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<RestrictedSignIn> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this RestrictedSignIn with a source
     *
     * @param sourceRestrictedSignIn the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final RestrictedSignIn sourceRestrictedSignIn, final ICallback<RestrictedSignIn> callback);

    /**
     * Patches this RestrictedSignIn with a source
     *
     * @param sourceRestrictedSignIn the source object with updates
     * @return the updated RestrictedSignIn
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RestrictedSignIn patch(final RestrictedSignIn sourceRestrictedSignIn) throws ClientException;

    /**
     * Posts a RestrictedSignIn with a new object
     *
     * @param newRestrictedSignIn the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final RestrictedSignIn newRestrictedSignIn, final ICallback<RestrictedSignIn> callback);

    /**
     * Posts a RestrictedSignIn with a new object
     *
     * @param newRestrictedSignIn the new object to create
     * @return the created RestrictedSignIn
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RestrictedSignIn post(final RestrictedSignIn newRestrictedSignIn) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IRestrictedSignInRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IRestrictedSignInRequest expand(final String value);

}

