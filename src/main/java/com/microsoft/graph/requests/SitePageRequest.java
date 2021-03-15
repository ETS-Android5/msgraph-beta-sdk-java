// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.SitePage;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Page Request.
 */
public class SitePageRequest extends BaseRequest<SitePage> {
	
    /**
     * The request for the SitePage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SitePageRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SitePage.class);
    }

    /**
     * Gets the SitePage from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SitePage> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the SitePage from the service
     *
     * @return the SitePage from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SitePage get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SitePage> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public SitePage delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this SitePage with a source
     *
     * @param sourceSitePage the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SitePage> patchAsync(@Nonnull final SitePage sourceSitePage) {
        return sendAsync(HttpMethod.PATCH, sourceSitePage);
    }

    /**
     * Patches this SitePage with a source
     *
     * @param sourceSitePage the source object with updates
     * @return the updated SitePage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SitePage patch(@Nonnull final SitePage sourceSitePage) throws ClientException {
        return send(HttpMethod.PATCH, sourceSitePage);
    }

    /**
     * Creates a SitePage with a new object
     *
     * @param newSitePage the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SitePage> postAsync(@Nonnull final SitePage newSitePage) {
        return sendAsync(HttpMethod.POST, newSitePage);
    }

    /**
     * Creates a SitePage with a new object
     *
     * @param newSitePage the new object to create
     * @return the created SitePage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SitePage post(@Nonnull final SitePage newSitePage) throws ClientException {
        return send(HttpMethod.POST, newSitePage);
    }

    /**
     * Creates a SitePage with a new object
     *
     * @param newSitePage the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SitePage> putAsync(@Nonnull final SitePage newSitePage) {
        return sendAsync(HttpMethod.PUT, newSitePage);
    }

    /**
     * Creates a SitePage with a new object
     *
     * @param newSitePage the object to create/update
     * @return the created SitePage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SitePage put(@Nonnull final SitePage newSitePage) throws ClientException {
        return send(HttpMethod.PUT, newSitePage);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public SitePageRequest select(@Nonnull final String value) {
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
     public SitePageRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

