// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests.extensions;
import com.microsoft.graph.ediscovery.models.extensions.DataSourceContainer;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Data Source Container Request.
 */
public interface IDataSourceContainerRequest extends IHttpRequest {

    /**
     * Gets the DataSourceContainer from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DataSourceContainer> callback);

    /**
     * Gets the DataSourceContainer from the service
     *
     * @return the DataSourceContainer from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DataSourceContainer get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DataSourceContainer> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DataSourceContainer with a source
     *
     * @param sourceDataSourceContainer the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DataSourceContainer sourceDataSourceContainer, final ICallback<? super DataSourceContainer> callback);

    /**
     * Patches this DataSourceContainer with a source
     *
     * @param sourceDataSourceContainer the source object with updates
     * @return the updated DataSourceContainer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DataSourceContainer patch(final DataSourceContainer sourceDataSourceContainer) throws ClientException;

    /**
     * Posts a DataSourceContainer with a new object
     *
     * @param newDataSourceContainer the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DataSourceContainer newDataSourceContainer, final ICallback<? super DataSourceContainer> callback);

    /**
     * Posts a DataSourceContainer with a new object
     *
     * @param newDataSourceContainer the new object to create
     * @return the created DataSourceContainer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DataSourceContainer post(final DataSourceContainer newDataSourceContainer) throws ClientException;

    /**
     * Posts a DataSourceContainer with a new object
     *
     * @param newDataSourceContainer the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DataSourceContainer newDataSourceContainer, final ICallback<? super DataSourceContainer> callback);

    /**
     * Posts a DataSourceContainer with a new object
     *
     * @param newDataSourceContainer the object to create/update
     * @return the created DataSourceContainer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DataSourceContainer put(final DataSourceContainer newDataSourceContainer) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDataSourceContainerRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDataSourceContainerRequest expand(final String value);

}

