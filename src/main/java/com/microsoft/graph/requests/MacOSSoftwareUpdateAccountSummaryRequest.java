// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.MacOSSoftwareUpdateAccountSummary;
import com.microsoft.graph.requests.MacOSSoftwareUpdateCategorySummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.MacOSSoftwareUpdateCategorySummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSSoftware Update Account Summary Request.
 */
public class MacOSSoftwareUpdateAccountSummaryRequest extends BaseRequest<MacOSSoftwareUpdateAccountSummary> {
	
    /**
     * The request for the MacOSSoftwareUpdateAccountSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MacOSSoftwareUpdateAccountSummaryRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MacOSSoftwareUpdateAccountSummary.class);
    }

    /**
     * Gets the MacOSSoftwareUpdateAccountSummary from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MacOSSoftwareUpdateAccountSummary> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the MacOSSoftwareUpdateAccountSummary from the service
     *
     * @return the MacOSSoftwareUpdateAccountSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MacOSSoftwareUpdateAccountSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MacOSSoftwareUpdateAccountSummary> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public MacOSSoftwareUpdateAccountSummary delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this MacOSSoftwareUpdateAccountSummary with a source
     *
     * @param sourceMacOSSoftwareUpdateAccountSummary the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MacOSSoftwareUpdateAccountSummary> patchAsync(@Nonnull final MacOSSoftwareUpdateAccountSummary sourceMacOSSoftwareUpdateAccountSummary) {
        return sendAsync(HttpMethod.PATCH, sourceMacOSSoftwareUpdateAccountSummary);
    }

    /**
     * Patches this MacOSSoftwareUpdateAccountSummary with a source
     *
     * @param sourceMacOSSoftwareUpdateAccountSummary the source object with updates
     * @return the updated MacOSSoftwareUpdateAccountSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MacOSSoftwareUpdateAccountSummary patch(@Nonnull final MacOSSoftwareUpdateAccountSummary sourceMacOSSoftwareUpdateAccountSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceMacOSSoftwareUpdateAccountSummary);
    }

    /**
     * Creates a MacOSSoftwareUpdateAccountSummary with a new object
     *
     * @param newMacOSSoftwareUpdateAccountSummary the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MacOSSoftwareUpdateAccountSummary> postAsync(@Nonnull final MacOSSoftwareUpdateAccountSummary newMacOSSoftwareUpdateAccountSummary) {
        return sendAsync(HttpMethod.POST, newMacOSSoftwareUpdateAccountSummary);
    }

    /**
     * Creates a MacOSSoftwareUpdateAccountSummary with a new object
     *
     * @param newMacOSSoftwareUpdateAccountSummary the new object to create
     * @return the created MacOSSoftwareUpdateAccountSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MacOSSoftwareUpdateAccountSummary post(@Nonnull final MacOSSoftwareUpdateAccountSummary newMacOSSoftwareUpdateAccountSummary) throws ClientException {
        return send(HttpMethod.POST, newMacOSSoftwareUpdateAccountSummary);
    }

    /**
     * Creates a MacOSSoftwareUpdateAccountSummary with a new object
     *
     * @param newMacOSSoftwareUpdateAccountSummary the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MacOSSoftwareUpdateAccountSummary> putAsync(@Nonnull final MacOSSoftwareUpdateAccountSummary newMacOSSoftwareUpdateAccountSummary) {
        return sendAsync(HttpMethod.PUT, newMacOSSoftwareUpdateAccountSummary);
    }

    /**
     * Creates a MacOSSoftwareUpdateAccountSummary with a new object
     *
     * @param newMacOSSoftwareUpdateAccountSummary the object to create/update
     * @return the created MacOSSoftwareUpdateAccountSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MacOSSoftwareUpdateAccountSummary put(@Nonnull final MacOSSoftwareUpdateAccountSummary newMacOSSoftwareUpdateAccountSummary) throws ClientException {
        return send(HttpMethod.PUT, newMacOSSoftwareUpdateAccountSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public MacOSSoftwareUpdateAccountSummaryRequest select(@Nonnull final String value) {
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
     public MacOSSoftwareUpdateAccountSummaryRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

