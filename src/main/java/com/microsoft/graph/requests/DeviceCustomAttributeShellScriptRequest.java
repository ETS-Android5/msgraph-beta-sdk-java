// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceCustomAttributeShellScript;
import com.microsoft.graph.models.DeviceManagementScriptGroupAssignment;
import com.microsoft.graph.models.DeviceManagementScriptAssignment;
import com.microsoft.graph.requests.DeviceManagementScriptAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementScriptAssignmentRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementScriptDeviceStateCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementScriptDeviceStateRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementScriptGroupAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementScriptGroupAssignmentRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementScriptRunSummaryWithReferenceRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementScriptUserStateCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementScriptUserStateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Custom Attribute Shell Script Request.
 */
public class DeviceCustomAttributeShellScriptRequest extends BaseRequest<DeviceCustomAttributeShellScript> {
	
    /**
     * The request for the DeviceCustomAttributeShellScript
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceCustomAttributeShellScriptRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceCustomAttributeShellScript.class);
    }

    /**
     * Gets the DeviceCustomAttributeShellScript from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceCustomAttributeShellScript> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DeviceCustomAttributeShellScript from the service
     *
     * @return the DeviceCustomAttributeShellScript from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceCustomAttributeShellScript get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceCustomAttributeShellScript> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DeviceCustomAttributeShellScript delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceCustomAttributeShellScript with a source
     *
     * @param sourceDeviceCustomAttributeShellScript the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceCustomAttributeShellScript> patchAsync(@Nonnull final DeviceCustomAttributeShellScript sourceDeviceCustomAttributeShellScript) {
        return sendAsync(HttpMethod.PATCH, sourceDeviceCustomAttributeShellScript);
    }

    /**
     * Patches this DeviceCustomAttributeShellScript with a source
     *
     * @param sourceDeviceCustomAttributeShellScript the source object with updates
     * @return the updated DeviceCustomAttributeShellScript
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceCustomAttributeShellScript patch(@Nonnull final DeviceCustomAttributeShellScript sourceDeviceCustomAttributeShellScript) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceCustomAttributeShellScript);
    }

    /**
     * Creates a DeviceCustomAttributeShellScript with a new object
     *
     * @param newDeviceCustomAttributeShellScript the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceCustomAttributeShellScript> postAsync(@Nonnull final DeviceCustomAttributeShellScript newDeviceCustomAttributeShellScript) {
        return sendAsync(HttpMethod.POST, newDeviceCustomAttributeShellScript);
    }

    /**
     * Creates a DeviceCustomAttributeShellScript with a new object
     *
     * @param newDeviceCustomAttributeShellScript the new object to create
     * @return the created DeviceCustomAttributeShellScript
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceCustomAttributeShellScript post(@Nonnull final DeviceCustomAttributeShellScript newDeviceCustomAttributeShellScript) throws ClientException {
        return send(HttpMethod.POST, newDeviceCustomAttributeShellScript);
    }

    /**
     * Creates a DeviceCustomAttributeShellScript with a new object
     *
     * @param newDeviceCustomAttributeShellScript the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceCustomAttributeShellScript> putAsync(@Nonnull final DeviceCustomAttributeShellScript newDeviceCustomAttributeShellScript) {
        return sendAsync(HttpMethod.PUT, newDeviceCustomAttributeShellScript);
    }

    /**
     * Creates a DeviceCustomAttributeShellScript with a new object
     *
     * @param newDeviceCustomAttributeShellScript the object to create/update
     * @return the created DeviceCustomAttributeShellScript
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceCustomAttributeShellScript put(@Nonnull final DeviceCustomAttributeShellScript newDeviceCustomAttributeShellScript) throws ClientException {
        return send(HttpMethod.PUT, newDeviceCustomAttributeShellScript);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceCustomAttributeShellScriptRequest select(@Nonnull final String value) {
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
     public DeviceCustomAttributeShellScriptRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

