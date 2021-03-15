// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.NetworkIPv4ConfigurationManagementCondition;
import com.microsoft.graph.models.DevicePlatformType;
import com.microsoft.graph.models.ManagementCondition;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Network IPv4Configuration Management Condition Request.
 */
public class NetworkIPv4ConfigurationManagementConditionRequest extends BaseRequest<NetworkIPv4ConfigurationManagementCondition> {
	
    /**
     * The request for the NetworkIPv4ConfigurationManagementCondition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public NetworkIPv4ConfigurationManagementConditionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, NetworkIPv4ConfigurationManagementCondition.class);
    }

    /**
     * Gets the NetworkIPv4ConfigurationManagementCondition from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<NetworkIPv4ConfigurationManagementCondition> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the NetworkIPv4ConfigurationManagementCondition from the service
     *
     * @return the NetworkIPv4ConfigurationManagementCondition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public NetworkIPv4ConfigurationManagementCondition get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<NetworkIPv4ConfigurationManagementCondition> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public NetworkIPv4ConfigurationManagementCondition delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this NetworkIPv4ConfigurationManagementCondition with a source
     *
     * @param sourceNetworkIPv4ConfigurationManagementCondition the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<NetworkIPv4ConfigurationManagementCondition> patchAsync(@Nonnull final NetworkIPv4ConfigurationManagementCondition sourceNetworkIPv4ConfigurationManagementCondition) {
        return sendAsync(HttpMethod.PATCH, sourceNetworkIPv4ConfigurationManagementCondition);
    }

    /**
     * Patches this NetworkIPv4ConfigurationManagementCondition with a source
     *
     * @param sourceNetworkIPv4ConfigurationManagementCondition the source object with updates
     * @return the updated NetworkIPv4ConfigurationManagementCondition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public NetworkIPv4ConfigurationManagementCondition patch(@Nonnull final NetworkIPv4ConfigurationManagementCondition sourceNetworkIPv4ConfigurationManagementCondition) throws ClientException {
        return send(HttpMethod.PATCH, sourceNetworkIPv4ConfigurationManagementCondition);
    }

    /**
     * Creates a NetworkIPv4ConfigurationManagementCondition with a new object
     *
     * @param newNetworkIPv4ConfigurationManagementCondition the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<NetworkIPv4ConfigurationManagementCondition> postAsync(@Nonnull final NetworkIPv4ConfigurationManagementCondition newNetworkIPv4ConfigurationManagementCondition) {
        return sendAsync(HttpMethod.POST, newNetworkIPv4ConfigurationManagementCondition);
    }

    /**
     * Creates a NetworkIPv4ConfigurationManagementCondition with a new object
     *
     * @param newNetworkIPv4ConfigurationManagementCondition the new object to create
     * @return the created NetworkIPv4ConfigurationManagementCondition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public NetworkIPv4ConfigurationManagementCondition post(@Nonnull final NetworkIPv4ConfigurationManagementCondition newNetworkIPv4ConfigurationManagementCondition) throws ClientException {
        return send(HttpMethod.POST, newNetworkIPv4ConfigurationManagementCondition);
    }

    /**
     * Creates a NetworkIPv4ConfigurationManagementCondition with a new object
     *
     * @param newNetworkIPv4ConfigurationManagementCondition the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<NetworkIPv4ConfigurationManagementCondition> putAsync(@Nonnull final NetworkIPv4ConfigurationManagementCondition newNetworkIPv4ConfigurationManagementCondition) {
        return sendAsync(HttpMethod.PUT, newNetworkIPv4ConfigurationManagementCondition);
    }

    /**
     * Creates a NetworkIPv4ConfigurationManagementCondition with a new object
     *
     * @param newNetworkIPv4ConfigurationManagementCondition the object to create/update
     * @return the created NetworkIPv4ConfigurationManagementCondition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public NetworkIPv4ConfigurationManagementCondition put(@Nonnull final NetworkIPv4ConfigurationManagementCondition newNetworkIPv4ConfigurationManagementCondition) throws ClientException {
        return send(HttpMethod.PUT, newNetworkIPv4ConfigurationManagementCondition);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public NetworkIPv4ConfigurationManagementConditionRequest select(@Nonnull final String value) {
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
     public NetworkIPv4ConfigurationManagementConditionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

