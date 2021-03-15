// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ManagedAndroidStoreApp;
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
 * The class for the Managed Android Store App Request.
 */
public class ManagedAndroidStoreAppRequest extends BaseRequest<ManagedAndroidStoreApp> {
	
    /**
     * The request for the ManagedAndroidStoreApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAndroidStoreAppRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedAndroidStoreApp.class);
    }

    /**
     * Gets the ManagedAndroidStoreApp from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedAndroidStoreApp> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ManagedAndroidStoreApp from the service
     *
     * @return the ManagedAndroidStoreApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedAndroidStoreApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedAndroidStoreApp> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ManagedAndroidStoreApp delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ManagedAndroidStoreApp with a source
     *
     * @param sourceManagedAndroidStoreApp the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedAndroidStoreApp> patchAsync(@Nonnull final ManagedAndroidStoreApp sourceManagedAndroidStoreApp) {
        return sendAsync(HttpMethod.PATCH, sourceManagedAndroidStoreApp);
    }

    /**
     * Patches this ManagedAndroidStoreApp with a source
     *
     * @param sourceManagedAndroidStoreApp the source object with updates
     * @return the updated ManagedAndroidStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedAndroidStoreApp patch(@Nonnull final ManagedAndroidStoreApp sourceManagedAndroidStoreApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedAndroidStoreApp);
    }

    /**
     * Creates a ManagedAndroidStoreApp with a new object
     *
     * @param newManagedAndroidStoreApp the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedAndroidStoreApp> postAsync(@Nonnull final ManagedAndroidStoreApp newManagedAndroidStoreApp) {
        return sendAsync(HttpMethod.POST, newManagedAndroidStoreApp);
    }

    /**
     * Creates a ManagedAndroidStoreApp with a new object
     *
     * @param newManagedAndroidStoreApp the new object to create
     * @return the created ManagedAndroidStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedAndroidStoreApp post(@Nonnull final ManagedAndroidStoreApp newManagedAndroidStoreApp) throws ClientException {
        return send(HttpMethod.POST, newManagedAndroidStoreApp);
    }

    /**
     * Creates a ManagedAndroidStoreApp with a new object
     *
     * @param newManagedAndroidStoreApp the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedAndroidStoreApp> putAsync(@Nonnull final ManagedAndroidStoreApp newManagedAndroidStoreApp) {
        return sendAsync(HttpMethod.PUT, newManagedAndroidStoreApp);
    }

    /**
     * Creates a ManagedAndroidStoreApp with a new object
     *
     * @param newManagedAndroidStoreApp the object to create/update
     * @return the created ManagedAndroidStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedAndroidStoreApp put(@Nonnull final ManagedAndroidStoreApp newManagedAndroidStoreApp) throws ClientException {
        return send(HttpMethod.PUT, newManagedAndroidStoreApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ManagedAndroidStoreAppRequest select(@Nonnull final String value) {
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
     public ManagedAndroidStoreAppRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

