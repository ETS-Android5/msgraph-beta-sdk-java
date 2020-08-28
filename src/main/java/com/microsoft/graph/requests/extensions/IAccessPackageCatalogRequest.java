// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AccessPackageCatalog;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Access Package Catalog Request.
 */
public interface IAccessPackageCatalogRequest extends IHttpRequest {

    /**
     * Gets the AccessPackageCatalog from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<AccessPackageCatalog> callback);

    /**
     * Gets the AccessPackageCatalog from the service
     *
     * @return the AccessPackageCatalog from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessPackageCatalog get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<AccessPackageCatalog> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AccessPackageCatalog with a source
     *
     * @param sourceAccessPackageCatalog the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AccessPackageCatalog sourceAccessPackageCatalog, final ICallback<AccessPackageCatalog> callback);

    /**
     * Patches this AccessPackageCatalog with a source
     *
     * @param sourceAccessPackageCatalog the source object with updates
     * @return the updated AccessPackageCatalog
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessPackageCatalog patch(final AccessPackageCatalog sourceAccessPackageCatalog) throws ClientException;

    /**
     * Posts a AccessPackageCatalog with a new object
     *
     * @param newAccessPackageCatalog the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AccessPackageCatalog newAccessPackageCatalog, final ICallback<AccessPackageCatalog> callback);

    /**
     * Posts a AccessPackageCatalog with a new object
     *
     * @param newAccessPackageCatalog the new object to create
     * @return the created AccessPackageCatalog
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessPackageCatalog post(final AccessPackageCatalog newAccessPackageCatalog) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAccessPackageCatalogRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAccessPackageCatalogRequest expand(final String value);

}

