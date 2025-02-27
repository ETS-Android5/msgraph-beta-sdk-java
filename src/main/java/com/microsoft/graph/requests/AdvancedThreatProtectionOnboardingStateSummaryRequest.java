// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AdvancedThreatProtectionOnboardingStateSummary;
import com.microsoft.graph.requests.AdvancedThreatProtectionOnboardingDeviceSettingStateCollectionRequestBuilder;
import com.microsoft.graph.requests.AdvancedThreatProtectionOnboardingDeviceSettingStateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Advanced Threat Protection Onboarding State Summary Request.
 */
public class AdvancedThreatProtectionOnboardingStateSummaryRequest extends BaseRequest<AdvancedThreatProtectionOnboardingStateSummary> {
	
    /**
     * The request for the AdvancedThreatProtectionOnboardingStateSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AdvancedThreatProtectionOnboardingStateSummaryRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AdvancedThreatProtectionOnboardingStateSummary.class);
    }

    /**
     * Gets the AdvancedThreatProtectionOnboardingStateSummary from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AdvancedThreatProtectionOnboardingStateSummary> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AdvancedThreatProtectionOnboardingStateSummary from the service
     *
     * @return the AdvancedThreatProtectionOnboardingStateSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AdvancedThreatProtectionOnboardingStateSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AdvancedThreatProtectionOnboardingStateSummary> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AdvancedThreatProtectionOnboardingStateSummary delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AdvancedThreatProtectionOnboardingStateSummary with a source
     *
     * @param sourceAdvancedThreatProtectionOnboardingStateSummary the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AdvancedThreatProtectionOnboardingStateSummary> patchAsync(@Nonnull final AdvancedThreatProtectionOnboardingStateSummary sourceAdvancedThreatProtectionOnboardingStateSummary) {
        return sendAsync(HttpMethod.PATCH, sourceAdvancedThreatProtectionOnboardingStateSummary);
    }

    /**
     * Patches this AdvancedThreatProtectionOnboardingStateSummary with a source
     *
     * @param sourceAdvancedThreatProtectionOnboardingStateSummary the source object with updates
     * @return the updated AdvancedThreatProtectionOnboardingStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AdvancedThreatProtectionOnboardingStateSummary patch(@Nonnull final AdvancedThreatProtectionOnboardingStateSummary sourceAdvancedThreatProtectionOnboardingStateSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceAdvancedThreatProtectionOnboardingStateSummary);
    }

    /**
     * Creates a AdvancedThreatProtectionOnboardingStateSummary with a new object
     *
     * @param newAdvancedThreatProtectionOnboardingStateSummary the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AdvancedThreatProtectionOnboardingStateSummary> postAsync(@Nonnull final AdvancedThreatProtectionOnboardingStateSummary newAdvancedThreatProtectionOnboardingStateSummary) {
        return sendAsync(HttpMethod.POST, newAdvancedThreatProtectionOnboardingStateSummary);
    }

    /**
     * Creates a AdvancedThreatProtectionOnboardingStateSummary with a new object
     *
     * @param newAdvancedThreatProtectionOnboardingStateSummary the new object to create
     * @return the created AdvancedThreatProtectionOnboardingStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AdvancedThreatProtectionOnboardingStateSummary post(@Nonnull final AdvancedThreatProtectionOnboardingStateSummary newAdvancedThreatProtectionOnboardingStateSummary) throws ClientException {
        return send(HttpMethod.POST, newAdvancedThreatProtectionOnboardingStateSummary);
    }

    /**
     * Creates a AdvancedThreatProtectionOnboardingStateSummary with a new object
     *
     * @param newAdvancedThreatProtectionOnboardingStateSummary the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AdvancedThreatProtectionOnboardingStateSummary> putAsync(@Nonnull final AdvancedThreatProtectionOnboardingStateSummary newAdvancedThreatProtectionOnboardingStateSummary) {
        return sendAsync(HttpMethod.PUT, newAdvancedThreatProtectionOnboardingStateSummary);
    }

    /**
     * Creates a AdvancedThreatProtectionOnboardingStateSummary with a new object
     *
     * @param newAdvancedThreatProtectionOnboardingStateSummary the object to create/update
     * @return the created AdvancedThreatProtectionOnboardingStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AdvancedThreatProtectionOnboardingStateSummary put(@Nonnull final AdvancedThreatProtectionOnboardingStateSummary newAdvancedThreatProtectionOnboardingStateSummary) throws ClientException {
        return send(HttpMethod.PUT, newAdvancedThreatProtectionOnboardingStateSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AdvancedThreatProtectionOnboardingStateSummaryRequest select(@Nonnull final String value) {
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
     public AdvancedThreatProtectionOnboardingStateSummaryRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

