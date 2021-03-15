// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WorkbookTable;
import com.microsoft.graph.models.WorkbookRange;
import com.microsoft.graph.requests.WorkbookTableColumnCollectionRequestBuilder;
import com.microsoft.graph.requests.WorkbookTableColumnRequestBuilder;
import com.microsoft.graph.requests.WorkbookTableRowCollectionRequestBuilder;
import com.microsoft.graph.requests.WorkbookTableRowRequestBuilder;
import com.microsoft.graph.requests.WorkbookTableSortRequestBuilder;
import com.microsoft.graph.requests.WorkbookWorksheetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Request.
 */
public class WorkbookTableRequest extends BaseRequest<WorkbookTable> {
	
    /**
     * The request for the WorkbookTable
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookTableRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookTable.class);
    }

    /**
     * Gets the WorkbookTable from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookTable> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the WorkbookTable from the service
     *
     * @return the WorkbookTable from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookTable get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookTable> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public WorkbookTable delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WorkbookTable with a source
     *
     * @param sourceWorkbookTable the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookTable> patchAsync(@Nonnull final WorkbookTable sourceWorkbookTable) {
        return sendAsync(HttpMethod.PATCH, sourceWorkbookTable);
    }

    /**
     * Patches this WorkbookTable with a source
     *
     * @param sourceWorkbookTable the source object with updates
     * @return the updated WorkbookTable
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookTable patch(@Nonnull final WorkbookTable sourceWorkbookTable) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookTable);
    }

    /**
     * Creates a WorkbookTable with a new object
     *
     * @param newWorkbookTable the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookTable> postAsync(@Nonnull final WorkbookTable newWorkbookTable) {
        return sendAsync(HttpMethod.POST, newWorkbookTable);
    }

    /**
     * Creates a WorkbookTable with a new object
     *
     * @param newWorkbookTable the new object to create
     * @return the created WorkbookTable
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookTable post(@Nonnull final WorkbookTable newWorkbookTable) throws ClientException {
        return send(HttpMethod.POST, newWorkbookTable);
    }

    /**
     * Creates a WorkbookTable with a new object
     *
     * @param newWorkbookTable the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookTable> putAsync(@Nonnull final WorkbookTable newWorkbookTable) {
        return sendAsync(HttpMethod.PUT, newWorkbookTable);
    }

    /**
     * Creates a WorkbookTable with a new object
     *
     * @param newWorkbookTable the object to create/update
     * @return the created WorkbookTable
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookTable put(@Nonnull final WorkbookTable newWorkbookTable) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookTable);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WorkbookTableRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public WorkbookTableRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

