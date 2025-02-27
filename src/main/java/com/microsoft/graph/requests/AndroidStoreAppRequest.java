// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AndroidStoreApp;
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
 * The class for the Android Store App Request.
 */
public class AndroidStoreAppRequest extends BaseRequest<AndroidStoreApp> {
	
    /**
     * The request for the AndroidStoreApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidStoreAppRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidStoreApp.class);
    }

    /**
     * Gets the AndroidStoreApp from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidStoreApp> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AndroidStoreApp from the service
     *
     * @return the AndroidStoreApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidStoreApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidStoreApp> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AndroidStoreApp delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AndroidStoreApp with a source
     *
     * @param sourceAndroidStoreApp the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidStoreApp> patchAsync(@Nonnull final AndroidStoreApp sourceAndroidStoreApp) {
        return sendAsync(HttpMethod.PATCH, sourceAndroidStoreApp);
    }

    /**
     * Patches this AndroidStoreApp with a source
     *
     * @param sourceAndroidStoreApp the source object with updates
     * @return the updated AndroidStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidStoreApp patch(@Nonnull final AndroidStoreApp sourceAndroidStoreApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidStoreApp);
    }

    /**
     * Creates a AndroidStoreApp with a new object
     *
     * @param newAndroidStoreApp the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidStoreApp> postAsync(@Nonnull final AndroidStoreApp newAndroidStoreApp) {
        return sendAsync(HttpMethod.POST, newAndroidStoreApp);
    }

    /**
     * Creates a AndroidStoreApp with a new object
     *
     * @param newAndroidStoreApp the new object to create
     * @return the created AndroidStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidStoreApp post(@Nonnull final AndroidStoreApp newAndroidStoreApp) throws ClientException {
        return send(HttpMethod.POST, newAndroidStoreApp);
    }

    /**
     * Creates a AndroidStoreApp with a new object
     *
     * @param newAndroidStoreApp the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidStoreApp> putAsync(@Nonnull final AndroidStoreApp newAndroidStoreApp) {
        return sendAsync(HttpMethod.PUT, newAndroidStoreApp);
    }

    /**
     * Creates a AndroidStoreApp with a new object
     *
     * @param newAndroidStoreApp the object to create/update
     * @return the created AndroidStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidStoreApp put(@Nonnull final AndroidStoreApp newAndroidStoreApp) throws ClientException {
        return send(HttpMethod.PUT, newAndroidStoreApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AndroidStoreAppRequest select(@Nonnull final String value) {
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
     public AndroidStoreAppRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

