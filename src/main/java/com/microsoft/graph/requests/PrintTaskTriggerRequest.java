// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.PrintTaskTrigger;
import com.microsoft.graph.requests.PrintTaskDefinitionWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Task Trigger Request.
 */
public class PrintTaskTriggerRequest extends BaseRequest<PrintTaskTrigger> {
	
    /**
     * The request for the PrintTaskTrigger
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrintTaskTriggerRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrintTaskTrigger.class);
    }

    /**
     * Gets the PrintTaskTrigger from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PrintTaskTrigger> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the PrintTaskTrigger from the service
     *
     * @return the PrintTaskTrigger from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrintTaskTrigger get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PrintTaskTrigger> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public PrintTaskTrigger delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this PrintTaskTrigger with a source
     *
     * @param sourcePrintTaskTrigger the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PrintTaskTrigger> patchAsync(@Nonnull final PrintTaskTrigger sourcePrintTaskTrigger) {
        return sendAsync(HttpMethod.PATCH, sourcePrintTaskTrigger);
    }

    /**
     * Patches this PrintTaskTrigger with a source
     *
     * @param sourcePrintTaskTrigger the source object with updates
     * @return the updated PrintTaskTrigger
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrintTaskTrigger patch(@Nonnull final PrintTaskTrigger sourcePrintTaskTrigger) throws ClientException {
        return send(HttpMethod.PATCH, sourcePrintTaskTrigger);
    }

    /**
     * Creates a PrintTaskTrigger with a new object
     *
     * @param newPrintTaskTrigger the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PrintTaskTrigger> postAsync(@Nonnull final PrintTaskTrigger newPrintTaskTrigger) {
        return sendAsync(HttpMethod.POST, newPrintTaskTrigger);
    }

    /**
     * Creates a PrintTaskTrigger with a new object
     *
     * @param newPrintTaskTrigger the new object to create
     * @return the created PrintTaskTrigger
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrintTaskTrigger post(@Nonnull final PrintTaskTrigger newPrintTaskTrigger) throws ClientException {
        return send(HttpMethod.POST, newPrintTaskTrigger);
    }

    /**
     * Creates a PrintTaskTrigger with a new object
     *
     * @param newPrintTaskTrigger the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PrintTaskTrigger> putAsync(@Nonnull final PrintTaskTrigger newPrintTaskTrigger) {
        return sendAsync(HttpMethod.PUT, newPrintTaskTrigger);
    }

    /**
     * Creates a PrintTaskTrigger with a new object
     *
     * @param newPrintTaskTrigger the object to create/update
     * @return the created PrintTaskTrigger
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrintTaskTrigger put(@Nonnull final PrintTaskTrigger newPrintTaskTrigger) throws ClientException {
        return send(HttpMethod.PUT, newPrintTaskTrigger);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public PrintTaskTriggerRequest select(@Nonnull final String value) {
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
     public PrintTaskTriggerRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

