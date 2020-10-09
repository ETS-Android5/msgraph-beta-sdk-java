// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UnifiedRbacResourceAction;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Unified Rbac Resource Action Request.
 */
public interface IUnifiedRbacResourceActionRequest extends IHttpRequest {

    /**
     * Gets the UnifiedRbacResourceAction from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super UnifiedRbacResourceAction> callback);

    /**
     * Gets the UnifiedRbacResourceAction from the service
     *
     * @return the UnifiedRbacResourceAction from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnifiedRbacResourceAction get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super UnifiedRbacResourceAction> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this UnifiedRbacResourceAction with a source
     *
     * @param sourceUnifiedRbacResourceAction the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final UnifiedRbacResourceAction sourceUnifiedRbacResourceAction, final ICallback<? super UnifiedRbacResourceAction> callback);

    /**
     * Patches this UnifiedRbacResourceAction with a source
     *
     * @param sourceUnifiedRbacResourceAction the source object with updates
     * @return the updated UnifiedRbacResourceAction
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnifiedRbacResourceAction patch(final UnifiedRbacResourceAction sourceUnifiedRbacResourceAction) throws ClientException;

    /**
     * Posts a UnifiedRbacResourceAction with a new object
     *
     * @param newUnifiedRbacResourceAction the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final UnifiedRbacResourceAction newUnifiedRbacResourceAction, final ICallback<? super UnifiedRbacResourceAction> callback);

    /**
     * Posts a UnifiedRbacResourceAction with a new object
     *
     * @param newUnifiedRbacResourceAction the new object to create
     * @return the created UnifiedRbacResourceAction
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnifiedRbacResourceAction post(final UnifiedRbacResourceAction newUnifiedRbacResourceAction) throws ClientException;

    /**
     * Posts a UnifiedRbacResourceAction with a new object
     *
     * @param newUnifiedRbacResourceAction the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final UnifiedRbacResourceAction newUnifiedRbacResourceAction, final ICallback<? super UnifiedRbacResourceAction> callback);

    /**
     * Posts a UnifiedRbacResourceAction with a new object
     *
     * @param newUnifiedRbacResourceAction the object to create/update
     * @return the created UnifiedRbacResourceAction
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnifiedRbacResourceAction put(final UnifiedRbacResourceAction newUnifiedRbacResourceAction) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUnifiedRbacResourceActionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUnifiedRbacResourceActionRequest expand(final String value);

}

