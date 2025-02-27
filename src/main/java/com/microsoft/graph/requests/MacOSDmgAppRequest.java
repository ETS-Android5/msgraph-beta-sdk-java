// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.MacOSDmgApp;
import com.microsoft.graph.models.MobileAppAssignment;
import com.microsoft.graph.models.MobileAppRelationship;
import com.microsoft.graph.models.HasPayloadLinkResultItem;
import com.microsoft.graph.models.MobileAppRelationshipState;
import com.microsoft.graph.models.MobileApp;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSDmg App Request.
 */
public class MacOSDmgAppRequest extends BaseRequest<MacOSDmgApp> {
	
    /**
     * The request for the MacOSDmgApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MacOSDmgAppRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MacOSDmgApp.class);
    }

    /**
     * Gets the MacOSDmgApp from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MacOSDmgApp> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the MacOSDmgApp from the service
     *
     * @return the MacOSDmgApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MacOSDmgApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MacOSDmgApp> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public MacOSDmgApp delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this MacOSDmgApp with a source
     *
     * @param sourceMacOSDmgApp the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MacOSDmgApp> patchAsync(@Nonnull final MacOSDmgApp sourceMacOSDmgApp) {
        return sendAsync(HttpMethod.PATCH, sourceMacOSDmgApp);
    }

    /**
     * Patches this MacOSDmgApp with a source
     *
     * @param sourceMacOSDmgApp the source object with updates
     * @return the updated MacOSDmgApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MacOSDmgApp patch(@Nonnull final MacOSDmgApp sourceMacOSDmgApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceMacOSDmgApp);
    }

    /**
     * Creates a MacOSDmgApp with a new object
     *
     * @param newMacOSDmgApp the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MacOSDmgApp> postAsync(@Nonnull final MacOSDmgApp newMacOSDmgApp) {
        return sendAsync(HttpMethod.POST, newMacOSDmgApp);
    }

    /**
     * Creates a MacOSDmgApp with a new object
     *
     * @param newMacOSDmgApp the new object to create
     * @return the created MacOSDmgApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MacOSDmgApp post(@Nonnull final MacOSDmgApp newMacOSDmgApp) throws ClientException {
        return send(HttpMethod.POST, newMacOSDmgApp);
    }

    /**
     * Creates a MacOSDmgApp with a new object
     *
     * @param newMacOSDmgApp the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MacOSDmgApp> putAsync(@Nonnull final MacOSDmgApp newMacOSDmgApp) {
        return sendAsync(HttpMethod.PUT, newMacOSDmgApp);
    }

    /**
     * Creates a MacOSDmgApp with a new object
     *
     * @param newMacOSDmgApp the object to create/update
     * @return the created MacOSDmgApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MacOSDmgApp put(@Nonnull final MacOSDmgApp newMacOSDmgApp) throws ClientException {
        return send(HttpMethod.PUT, newMacOSDmgApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public MacOSDmgAppRequest select(@Nonnull final String value) {
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
     public MacOSDmgAppRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

