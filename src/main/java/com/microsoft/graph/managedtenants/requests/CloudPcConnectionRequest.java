// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.managedtenants.models.CloudPcConnection;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud Pc Connection Request.
 */
public class CloudPcConnectionRequest extends BaseRequest<CloudPcConnection> {
	
    /**
     * The request for the CloudPcConnection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CloudPcConnectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CloudPcConnection.class);
    }

    /**
     * Gets the CloudPcConnection from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CloudPcConnection> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the CloudPcConnection from the service
     *
     * @return the CloudPcConnection from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CloudPcConnection get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CloudPcConnection> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public CloudPcConnection delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this CloudPcConnection with a source
     *
     * @param sourceCloudPcConnection the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CloudPcConnection> patchAsync(@Nonnull final CloudPcConnection sourceCloudPcConnection) {
        return sendAsync(HttpMethod.PATCH, sourceCloudPcConnection);
    }

    /**
     * Patches this CloudPcConnection with a source
     *
     * @param sourceCloudPcConnection the source object with updates
     * @return the updated CloudPcConnection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CloudPcConnection patch(@Nonnull final CloudPcConnection sourceCloudPcConnection) throws ClientException {
        return send(HttpMethod.PATCH, sourceCloudPcConnection);
    }

    /**
     * Creates a CloudPcConnection with a new object
     *
     * @param newCloudPcConnection the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CloudPcConnection> postAsync(@Nonnull final CloudPcConnection newCloudPcConnection) {
        return sendAsync(HttpMethod.POST, newCloudPcConnection);
    }

    /**
     * Creates a CloudPcConnection with a new object
     *
     * @param newCloudPcConnection the new object to create
     * @return the created CloudPcConnection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CloudPcConnection post(@Nonnull final CloudPcConnection newCloudPcConnection) throws ClientException {
        return send(HttpMethod.POST, newCloudPcConnection);
    }

    /**
     * Creates a CloudPcConnection with a new object
     *
     * @param newCloudPcConnection the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CloudPcConnection> putAsync(@Nonnull final CloudPcConnection newCloudPcConnection) {
        return sendAsync(HttpMethod.PUT, newCloudPcConnection);
    }

    /**
     * Creates a CloudPcConnection with a new object
     *
     * @param newCloudPcConnection the object to create/update
     * @return the created CloudPcConnection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CloudPcConnection put(@Nonnull final CloudPcConnection newCloudPcConnection) throws ClientException {
        return send(HttpMethod.PUT, newCloudPcConnection);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public CloudPcConnectionRequest select(@Nonnull final String value) {
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
     public CloudPcConnectionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

