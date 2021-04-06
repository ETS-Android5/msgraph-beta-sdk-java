// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ChromeOSOnboardingSettings;
import com.microsoft.graph.models.ChromeOSOnboardingStatus;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chrome OSOnboarding Settings Request.
 */
public class ChromeOSOnboardingSettingsRequest extends BaseRequest<ChromeOSOnboardingSettings> {
	
    /**
     * The request for the ChromeOSOnboardingSettings
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ChromeOSOnboardingSettingsRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ChromeOSOnboardingSettings.class);
    }

    /**
     * Gets the ChromeOSOnboardingSettings from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ChromeOSOnboardingSettings> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ChromeOSOnboardingSettings from the service
     *
     * @return the ChromeOSOnboardingSettings from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ChromeOSOnboardingSettings get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ChromeOSOnboardingSettings> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ChromeOSOnboardingSettings delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ChromeOSOnboardingSettings with a source
     *
     * @param sourceChromeOSOnboardingSettings the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ChromeOSOnboardingSettings> patchAsync(@Nonnull final ChromeOSOnboardingSettings sourceChromeOSOnboardingSettings) {
        return sendAsync(HttpMethod.PATCH, sourceChromeOSOnboardingSettings);
    }

    /**
     * Patches this ChromeOSOnboardingSettings with a source
     *
     * @param sourceChromeOSOnboardingSettings the source object with updates
     * @return the updated ChromeOSOnboardingSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ChromeOSOnboardingSettings patch(@Nonnull final ChromeOSOnboardingSettings sourceChromeOSOnboardingSettings) throws ClientException {
        return send(HttpMethod.PATCH, sourceChromeOSOnboardingSettings);
    }

    /**
     * Creates a ChromeOSOnboardingSettings with a new object
     *
     * @param newChromeOSOnboardingSettings the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ChromeOSOnboardingSettings> postAsync(@Nonnull final ChromeOSOnboardingSettings newChromeOSOnboardingSettings) {
        return sendAsync(HttpMethod.POST, newChromeOSOnboardingSettings);
    }

    /**
     * Creates a ChromeOSOnboardingSettings with a new object
     *
     * @param newChromeOSOnboardingSettings the new object to create
     * @return the created ChromeOSOnboardingSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ChromeOSOnboardingSettings post(@Nonnull final ChromeOSOnboardingSettings newChromeOSOnboardingSettings) throws ClientException {
        return send(HttpMethod.POST, newChromeOSOnboardingSettings);
    }

    /**
     * Creates a ChromeOSOnboardingSettings with a new object
     *
     * @param newChromeOSOnboardingSettings the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ChromeOSOnboardingSettings> putAsync(@Nonnull final ChromeOSOnboardingSettings newChromeOSOnboardingSettings) {
        return sendAsync(HttpMethod.PUT, newChromeOSOnboardingSettings);
    }

    /**
     * Creates a ChromeOSOnboardingSettings with a new object
     *
     * @param newChromeOSOnboardingSettings the object to create/update
     * @return the created ChromeOSOnboardingSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ChromeOSOnboardingSettings put(@Nonnull final ChromeOSOnboardingSettings newChromeOSOnboardingSettings) throws ClientException {
        return send(HttpMethod.PUT, newChromeOSOnboardingSettings);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ChromeOSOnboardingSettingsRequest select(@Nonnull final String value) {
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
     public ChromeOSOnboardingSettingsRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

