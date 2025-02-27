// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AndroidForWorkCompliancePolicy;
import com.microsoft.graph.models.DeviceCompliancePolicyAssignment;
import com.microsoft.graph.models.HasPayloadLinkResultItem;
import com.microsoft.graph.models.ScheduledRetireState;
import com.microsoft.graph.models.DeviceCompliancePolicyScript;
import com.microsoft.graph.models.DeviceComplianceScriptValidationResult;
import com.microsoft.graph.models.DeviceComplianceScheduledActionForRule;
import com.microsoft.graph.models.RetireScheduledManagedDevice;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work Compliance Policy Request.
 */
public class AndroidForWorkCompliancePolicyRequest extends BaseRequest<AndroidForWorkCompliancePolicy> {
	
    /**
     * The request for the AndroidForWorkCompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidForWorkCompliancePolicyRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidForWorkCompliancePolicy.class);
    }

    /**
     * Gets the AndroidForWorkCompliancePolicy from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidForWorkCompliancePolicy> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AndroidForWorkCompliancePolicy from the service
     *
     * @return the AndroidForWorkCompliancePolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidForWorkCompliancePolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidForWorkCompliancePolicy> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AndroidForWorkCompliancePolicy delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AndroidForWorkCompliancePolicy with a source
     *
     * @param sourceAndroidForWorkCompliancePolicy the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidForWorkCompliancePolicy> patchAsync(@Nonnull final AndroidForWorkCompliancePolicy sourceAndroidForWorkCompliancePolicy) {
        return sendAsync(HttpMethod.PATCH, sourceAndroidForWorkCompliancePolicy);
    }

    /**
     * Patches this AndroidForWorkCompliancePolicy with a source
     *
     * @param sourceAndroidForWorkCompliancePolicy the source object with updates
     * @return the updated AndroidForWorkCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidForWorkCompliancePolicy patch(@Nonnull final AndroidForWorkCompliancePolicy sourceAndroidForWorkCompliancePolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidForWorkCompliancePolicy);
    }

    /**
     * Creates a AndroidForWorkCompliancePolicy with a new object
     *
     * @param newAndroidForWorkCompliancePolicy the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidForWorkCompliancePolicy> postAsync(@Nonnull final AndroidForWorkCompliancePolicy newAndroidForWorkCompliancePolicy) {
        return sendAsync(HttpMethod.POST, newAndroidForWorkCompliancePolicy);
    }

    /**
     * Creates a AndroidForWorkCompliancePolicy with a new object
     *
     * @param newAndroidForWorkCompliancePolicy the new object to create
     * @return the created AndroidForWorkCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidForWorkCompliancePolicy post(@Nonnull final AndroidForWorkCompliancePolicy newAndroidForWorkCompliancePolicy) throws ClientException {
        return send(HttpMethod.POST, newAndroidForWorkCompliancePolicy);
    }

    /**
     * Creates a AndroidForWorkCompliancePolicy with a new object
     *
     * @param newAndroidForWorkCompliancePolicy the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidForWorkCompliancePolicy> putAsync(@Nonnull final AndroidForWorkCompliancePolicy newAndroidForWorkCompliancePolicy) {
        return sendAsync(HttpMethod.PUT, newAndroidForWorkCompliancePolicy);
    }

    /**
     * Creates a AndroidForWorkCompliancePolicy with a new object
     *
     * @param newAndroidForWorkCompliancePolicy the object to create/update
     * @return the created AndroidForWorkCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidForWorkCompliancePolicy put(@Nonnull final AndroidForWorkCompliancePolicy newAndroidForWorkCompliancePolicy) throws ClientException {
        return send(HttpMethod.PUT, newAndroidForWorkCompliancePolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AndroidForWorkCompliancePolicyRequest select(@Nonnull final String value) {
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
     public AndroidForWorkCompliancePolicyRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

