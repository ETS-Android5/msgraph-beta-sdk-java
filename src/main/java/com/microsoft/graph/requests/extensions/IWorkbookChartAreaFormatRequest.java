// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookChartAreaFormat;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Chart Area Format Request.
 */
public interface IWorkbookChartAreaFormatRequest extends IHttpRequest {

    /**
     * Gets the WorkbookChartAreaFormat from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super WorkbookChartAreaFormat> callback);

    /**
     * Gets the WorkbookChartAreaFormat from the service
     *
     * @return the WorkbookChartAreaFormat from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartAreaFormat get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super WorkbookChartAreaFormat> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WorkbookChartAreaFormat with a source
     *
     * @param sourceWorkbookChartAreaFormat the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WorkbookChartAreaFormat sourceWorkbookChartAreaFormat, final ICallback<? super WorkbookChartAreaFormat> callback);

    /**
     * Patches this WorkbookChartAreaFormat with a source
     *
     * @param sourceWorkbookChartAreaFormat the source object with updates
     * @return the updated WorkbookChartAreaFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartAreaFormat patch(final WorkbookChartAreaFormat sourceWorkbookChartAreaFormat) throws ClientException;

    /**
     * Posts a WorkbookChartAreaFormat with a new object
     *
     * @param newWorkbookChartAreaFormat the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WorkbookChartAreaFormat newWorkbookChartAreaFormat, final ICallback<? super WorkbookChartAreaFormat> callback);

    /**
     * Posts a WorkbookChartAreaFormat with a new object
     *
     * @param newWorkbookChartAreaFormat the new object to create
     * @return the created WorkbookChartAreaFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartAreaFormat post(final WorkbookChartAreaFormat newWorkbookChartAreaFormat) throws ClientException;

    /**
     * Posts a WorkbookChartAreaFormat with a new object
     *
     * @param newWorkbookChartAreaFormat the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final WorkbookChartAreaFormat newWorkbookChartAreaFormat, final ICallback<? super WorkbookChartAreaFormat> callback);

    /**
     * Posts a WorkbookChartAreaFormat with a new object
     *
     * @param newWorkbookChartAreaFormat the object to create/update
     * @return the created WorkbookChartAreaFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartAreaFormat put(final WorkbookChartAreaFormat newWorkbookChartAreaFormat) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookChartAreaFormatRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookChartAreaFormatRequest expand(final String value);

}

