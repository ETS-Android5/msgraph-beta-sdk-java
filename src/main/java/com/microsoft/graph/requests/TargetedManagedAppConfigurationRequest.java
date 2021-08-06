// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.TargetedManagedAppConfiguration;
import com.microsoft.graph.models.TargetedManagedAppPolicyAssignment;
import com.microsoft.graph.models.HasPayloadLinkResultItem;
import com.microsoft.graph.models.ManagedMobileApp;
import com.microsoft.graph.models.TargetedManagedAppGroupType;
import com.microsoft.graph.requests.ManagedMobileAppCollectionRequestBuilder;
import com.microsoft.graph.requests.ManagedMobileAppRequestBuilder;
import com.microsoft.graph.requests.TargetedManagedAppPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.TargetedManagedAppPolicyAssignmentRequestBuilder;
import com.microsoft.graph.requests.ManagedAppPolicyDeploymentSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Targeted Managed App Configuration Request.
 */
public class TargetedManagedAppConfigurationRequest extends BaseRequest<TargetedManagedAppConfiguration> {
	
    /**
     * The request for the TargetedManagedAppConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TargetedManagedAppConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TargetedManagedAppConfiguration.class);
    }

    /**
     * Gets the TargetedManagedAppConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TargetedManagedAppConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the TargetedManagedAppConfiguration from the service
     *
     * @return the TargetedManagedAppConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TargetedManagedAppConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TargetedManagedAppConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public TargetedManagedAppConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this TargetedManagedAppConfiguration with a source
     *
     * @param sourceTargetedManagedAppConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TargetedManagedAppConfiguration> patchAsync(@Nonnull final TargetedManagedAppConfiguration sourceTargetedManagedAppConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceTargetedManagedAppConfiguration);
    }

    /**
     * Patches this TargetedManagedAppConfiguration with a source
     *
     * @param sourceTargetedManagedAppConfiguration the source object with updates
     * @return the updated TargetedManagedAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TargetedManagedAppConfiguration patch(@Nonnull final TargetedManagedAppConfiguration sourceTargetedManagedAppConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceTargetedManagedAppConfiguration);
    }

    /**
     * Creates a TargetedManagedAppConfiguration with a new object
     *
     * @param newTargetedManagedAppConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TargetedManagedAppConfiguration> postAsync(@Nonnull final TargetedManagedAppConfiguration newTargetedManagedAppConfiguration) {
        return sendAsync(HttpMethod.POST, newTargetedManagedAppConfiguration);
    }

    /**
     * Creates a TargetedManagedAppConfiguration with a new object
     *
     * @param newTargetedManagedAppConfiguration the new object to create
     * @return the created TargetedManagedAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TargetedManagedAppConfiguration post(@Nonnull final TargetedManagedAppConfiguration newTargetedManagedAppConfiguration) throws ClientException {
        return send(HttpMethod.POST, newTargetedManagedAppConfiguration);
    }

    /**
     * Creates a TargetedManagedAppConfiguration with a new object
     *
     * @param newTargetedManagedAppConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TargetedManagedAppConfiguration> putAsync(@Nonnull final TargetedManagedAppConfiguration newTargetedManagedAppConfiguration) {
        return sendAsync(HttpMethod.PUT, newTargetedManagedAppConfiguration);
    }

    /**
     * Creates a TargetedManagedAppConfiguration with a new object
     *
     * @param newTargetedManagedAppConfiguration the object to create/update
     * @return the created TargetedManagedAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TargetedManagedAppConfiguration put(@Nonnull final TargetedManagedAppConfiguration newTargetedManagedAppConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newTargetedManagedAppConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public TargetedManagedAppConfigurationRequest select(@Nonnull final String value) {
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
     public TargetedManagedAppConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

