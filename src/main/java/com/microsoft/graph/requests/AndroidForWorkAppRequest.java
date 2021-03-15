// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AndroidForWorkApp;
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
 * The class for the Android For Work App Request.
 */
public class AndroidForWorkAppRequest extends BaseRequest<AndroidForWorkApp> {
	
    /**
     * The request for the AndroidForWorkApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidForWorkAppRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidForWorkApp.class);
    }

    /**
     * Gets the AndroidForWorkApp from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidForWorkApp> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AndroidForWorkApp from the service
     *
     * @return the AndroidForWorkApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidForWorkApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidForWorkApp> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AndroidForWorkApp delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AndroidForWorkApp with a source
     *
     * @param sourceAndroidForWorkApp the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidForWorkApp> patchAsync(@Nonnull final AndroidForWorkApp sourceAndroidForWorkApp) {
        return sendAsync(HttpMethod.PATCH, sourceAndroidForWorkApp);
    }

    /**
     * Patches this AndroidForWorkApp with a source
     *
     * @param sourceAndroidForWorkApp the source object with updates
     * @return the updated AndroidForWorkApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidForWorkApp patch(@Nonnull final AndroidForWorkApp sourceAndroidForWorkApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidForWorkApp);
    }

    /**
     * Creates a AndroidForWorkApp with a new object
     *
     * @param newAndroidForWorkApp the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidForWorkApp> postAsync(@Nonnull final AndroidForWorkApp newAndroidForWorkApp) {
        return sendAsync(HttpMethod.POST, newAndroidForWorkApp);
    }

    /**
     * Creates a AndroidForWorkApp with a new object
     *
     * @param newAndroidForWorkApp the new object to create
     * @return the created AndroidForWorkApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidForWorkApp post(@Nonnull final AndroidForWorkApp newAndroidForWorkApp) throws ClientException {
        return send(HttpMethod.POST, newAndroidForWorkApp);
    }

    /**
     * Creates a AndroidForWorkApp with a new object
     *
     * @param newAndroidForWorkApp the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidForWorkApp> putAsync(@Nonnull final AndroidForWorkApp newAndroidForWorkApp) {
        return sendAsync(HttpMethod.PUT, newAndroidForWorkApp);
    }

    /**
     * Creates a AndroidForWorkApp with a new object
     *
     * @param newAndroidForWorkApp the object to create/update
     * @return the created AndroidForWorkApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidForWorkApp put(@Nonnull final AndroidForWorkApp newAndroidForWorkApp) throws ClientException {
        return send(HttpMethod.PUT, newAndroidForWorkApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AndroidForWorkAppRequest select(@Nonnull final String value) {
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
     public AndroidForWorkAppRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

