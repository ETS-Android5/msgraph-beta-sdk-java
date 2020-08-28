// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TeamsApp;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Teams App Request.
 */
public interface ITeamsAppRequest extends IHttpRequest {

    /**
     * Gets the TeamsApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<TeamsApp> callback);

    /**
     * Gets the TeamsApp from the service
     *
     * @return the TeamsApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamsApp get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<TeamsApp> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this TeamsApp with a source
     *
     * @param sourceTeamsApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final TeamsApp sourceTeamsApp, final ICallback<TeamsApp> callback);

    /**
     * Patches this TeamsApp with a source
     *
     * @param sourceTeamsApp the source object with updates
     * @return the updated TeamsApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamsApp patch(final TeamsApp sourceTeamsApp) throws ClientException;

    /**
     * Posts a TeamsApp with a new object
     *
     * @param newTeamsApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final TeamsApp newTeamsApp, final ICallback<TeamsApp> callback);

    /**
     * Posts a TeamsApp with a new object
     *
     * @param newTeamsApp the new object to create
     * @return the created TeamsApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamsApp post(final TeamsApp newTeamsApp) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITeamsAppRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITeamsAppRequest expand(final String value);

}

