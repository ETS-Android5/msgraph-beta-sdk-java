// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.MobileApp;
import com.microsoft.graph.models.MobileAppAssignment;
import com.microsoft.graph.models.MobileAppRelationship;
import com.microsoft.graph.models.HasPayloadLinkResultItem;
import com.microsoft.graph.models.MobileAppRelationshipState;
import com.microsoft.graph.requests.MobileAppAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.MobileAppAssignmentRequestBuilder;
import com.microsoft.graph.requests.MobileAppCategoryCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.MobileAppCategoryWithReferenceRequestBuilder;
import com.microsoft.graph.requests.MobileAppInstallStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.MobileAppInstallStatusRequestBuilder;
import com.microsoft.graph.requests.MobileAppInstallSummaryRequestBuilder;
import com.microsoft.graph.requests.MobileAppRelationshipCollectionRequestBuilder;
import com.microsoft.graph.requests.MobileAppRelationshipRequestBuilder;
import com.microsoft.graph.requests.UserAppInstallStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.UserAppInstallStatusRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Request.
 */
public class MobileAppRequest extends BaseRequest<MobileApp> {
	
    /**
     * The request for the MobileApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public MobileAppRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends MobileApp> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the MobileApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileApp.class);
    }

    /**
     * Gets the MobileApp from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MobileApp> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the MobileApp from the service
     *
     * @return the MobileApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MobileApp> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public MobileApp delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this MobileApp with a source
     *
     * @param sourceMobileApp the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MobileApp> patchAsync(@Nonnull final MobileApp sourceMobileApp) {
        return sendAsync(HttpMethod.PATCH, sourceMobileApp);
    }

    /**
     * Patches this MobileApp with a source
     *
     * @param sourceMobileApp the source object with updates
     * @return the updated MobileApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileApp patch(@Nonnull final MobileApp sourceMobileApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceMobileApp);
    }

    /**
     * Creates a MobileApp with a new object
     *
     * @param newMobileApp the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MobileApp> postAsync(@Nonnull final MobileApp newMobileApp) {
        return sendAsync(HttpMethod.POST, newMobileApp);
    }

    /**
     * Creates a MobileApp with a new object
     *
     * @param newMobileApp the new object to create
     * @return the created MobileApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileApp post(@Nonnull final MobileApp newMobileApp) throws ClientException {
        return send(HttpMethod.POST, newMobileApp);
    }

    /**
     * Creates a MobileApp with a new object
     *
     * @param newMobileApp the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MobileApp> putAsync(@Nonnull final MobileApp newMobileApp) {
        return sendAsync(HttpMethod.PUT, newMobileApp);
    }

    /**
     * Creates a MobileApp with a new object
     *
     * @param newMobileApp the object to create/update
     * @return the created MobileApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileApp put(@Nonnull final MobileApp newMobileApp) throws ClientException {
        return send(HttpMethod.PUT, newMobileApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public MobileAppRequest select(@Nonnull final String value) {
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
     public MobileAppRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

