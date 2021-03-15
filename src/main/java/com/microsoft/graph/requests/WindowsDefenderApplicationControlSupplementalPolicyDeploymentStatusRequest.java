// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus;
import com.microsoft.graph.requests.WindowsDefenderApplicationControlSupplementalPolicyWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Defender Application Control Supplemental Policy Deployment Status Request.
 */
public class WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatusRequest extends BaseRequest<WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus> {
	
    /**
     * The request for the WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatusRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus.class);
    }

    /**
     * Gets the WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus from the service
     *
     * @return the WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus with a source
     *
     * @param sourceWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus> patchAsync(@Nonnull final WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus sourceWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus) {
        return sendAsync(HttpMethod.PATCH, sourceWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus);
    }

    /**
     * Patches this WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus with a source
     *
     * @param sourceWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus the source object with updates
     * @return the updated WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus patch(@Nonnull final WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus sourceWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus);
    }

    /**
     * Creates a WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus with a new object
     *
     * @param newWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus> postAsync(@Nonnull final WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus newWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus) {
        return sendAsync(HttpMethod.POST, newWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus);
    }

    /**
     * Creates a WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus with a new object
     *
     * @param newWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus the new object to create
     * @return the created WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus post(@Nonnull final WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus newWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus) throws ClientException {
        return send(HttpMethod.POST, newWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus);
    }

    /**
     * Creates a WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus with a new object
     *
     * @param newWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus> putAsync(@Nonnull final WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus newWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus) {
        return sendAsync(HttpMethod.PUT, newWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus);
    }

    /**
     * Creates a WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus with a new object
     *
     * @param newWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus the object to create/update
     * @return the created WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus put(@Nonnull final WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus newWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus) throws ClientException {
        return send(HttpMethod.PUT, newWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatusRequest select(@Nonnull final String value) {
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
     public WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatusRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

