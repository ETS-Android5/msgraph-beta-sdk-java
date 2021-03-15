// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.CloudPcProvisioningPolicy;
import com.microsoft.graph.models.CloudPcProvisioningPolicyAssignment;
import com.microsoft.graph.requests.CloudPcProvisioningPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.CloudPcProvisioningPolicyAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud Pc Provisioning Policy Request.
 */
public class CloudPcProvisioningPolicyRequest extends BaseRequest<CloudPcProvisioningPolicy> {
	
    /**
     * The request for the CloudPcProvisioningPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CloudPcProvisioningPolicyRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CloudPcProvisioningPolicy.class);
    }

    /**
     * Gets the CloudPcProvisioningPolicy from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CloudPcProvisioningPolicy> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the CloudPcProvisioningPolicy from the service
     *
     * @return the CloudPcProvisioningPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CloudPcProvisioningPolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CloudPcProvisioningPolicy> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public CloudPcProvisioningPolicy delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this CloudPcProvisioningPolicy with a source
     *
     * @param sourceCloudPcProvisioningPolicy the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CloudPcProvisioningPolicy> patchAsync(@Nonnull final CloudPcProvisioningPolicy sourceCloudPcProvisioningPolicy) {
        return sendAsync(HttpMethod.PATCH, sourceCloudPcProvisioningPolicy);
    }

    /**
     * Patches this CloudPcProvisioningPolicy with a source
     *
     * @param sourceCloudPcProvisioningPolicy the source object with updates
     * @return the updated CloudPcProvisioningPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CloudPcProvisioningPolicy patch(@Nonnull final CloudPcProvisioningPolicy sourceCloudPcProvisioningPolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceCloudPcProvisioningPolicy);
    }

    /**
     * Creates a CloudPcProvisioningPolicy with a new object
     *
     * @param newCloudPcProvisioningPolicy the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CloudPcProvisioningPolicy> postAsync(@Nonnull final CloudPcProvisioningPolicy newCloudPcProvisioningPolicy) {
        return sendAsync(HttpMethod.POST, newCloudPcProvisioningPolicy);
    }

    /**
     * Creates a CloudPcProvisioningPolicy with a new object
     *
     * @param newCloudPcProvisioningPolicy the new object to create
     * @return the created CloudPcProvisioningPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CloudPcProvisioningPolicy post(@Nonnull final CloudPcProvisioningPolicy newCloudPcProvisioningPolicy) throws ClientException {
        return send(HttpMethod.POST, newCloudPcProvisioningPolicy);
    }

    /**
     * Creates a CloudPcProvisioningPolicy with a new object
     *
     * @param newCloudPcProvisioningPolicy the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CloudPcProvisioningPolicy> putAsync(@Nonnull final CloudPcProvisioningPolicy newCloudPcProvisioningPolicy) {
        return sendAsync(HttpMethod.PUT, newCloudPcProvisioningPolicy);
    }

    /**
     * Creates a CloudPcProvisioningPolicy with a new object
     *
     * @param newCloudPcProvisioningPolicy the object to create/update
     * @return the created CloudPcProvisioningPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CloudPcProvisioningPolicy put(@Nonnull final CloudPcProvisioningPolicy newCloudPcProvisioningPolicy) throws ClientException {
        return send(HttpMethod.PUT, newCloudPcProvisioningPolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public CloudPcProvisioningPolicyRequest select(@Nonnull final String value) {
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
     public CloudPcProvisioningPolicyRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

