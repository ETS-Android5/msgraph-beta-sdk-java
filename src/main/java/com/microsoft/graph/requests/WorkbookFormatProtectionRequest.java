// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WorkbookFormatProtection;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Format Protection Request.
 */
public class WorkbookFormatProtectionRequest extends BaseRequest<WorkbookFormatProtection> {
	
    /**
     * The request for the WorkbookFormatProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookFormatProtectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookFormatProtection.class);
    }

    /**
     * Gets the WorkbookFormatProtection from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookFormatProtection> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the WorkbookFormatProtection from the service
     *
     * @return the WorkbookFormatProtection from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookFormatProtection get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookFormatProtection> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public WorkbookFormatProtection delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WorkbookFormatProtection with a source
     *
     * @param sourceWorkbookFormatProtection the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookFormatProtection> patchAsync(@Nonnull final WorkbookFormatProtection sourceWorkbookFormatProtection) {
        return sendAsync(HttpMethod.PATCH, sourceWorkbookFormatProtection);
    }

    /**
     * Patches this WorkbookFormatProtection with a source
     *
     * @param sourceWorkbookFormatProtection the source object with updates
     * @return the updated WorkbookFormatProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookFormatProtection patch(@Nonnull final WorkbookFormatProtection sourceWorkbookFormatProtection) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookFormatProtection);
    }

    /**
     * Creates a WorkbookFormatProtection with a new object
     *
     * @param newWorkbookFormatProtection the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookFormatProtection> postAsync(@Nonnull final WorkbookFormatProtection newWorkbookFormatProtection) {
        return sendAsync(HttpMethod.POST, newWorkbookFormatProtection);
    }

    /**
     * Creates a WorkbookFormatProtection with a new object
     *
     * @param newWorkbookFormatProtection the new object to create
     * @return the created WorkbookFormatProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookFormatProtection post(@Nonnull final WorkbookFormatProtection newWorkbookFormatProtection) throws ClientException {
        return send(HttpMethod.POST, newWorkbookFormatProtection);
    }

    /**
     * Creates a WorkbookFormatProtection with a new object
     *
     * @param newWorkbookFormatProtection the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookFormatProtection> putAsync(@Nonnull final WorkbookFormatProtection newWorkbookFormatProtection) {
        return sendAsync(HttpMethod.PUT, newWorkbookFormatProtection);
    }

    /**
     * Creates a WorkbookFormatProtection with a new object
     *
     * @param newWorkbookFormatProtection the object to create/update
     * @return the created WorkbookFormatProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookFormatProtection put(@Nonnull final WorkbookFormatProtection newWorkbookFormatProtection) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookFormatProtection);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WorkbookFormatProtectionRequest select(@Nonnull final String value) {
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
     public WorkbookFormatProtectionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

