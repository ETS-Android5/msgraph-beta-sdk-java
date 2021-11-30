// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.OrganizationSettings;
import com.microsoft.graph.requests.InsightsSettingsRequestBuilder;
import com.microsoft.graph.requests.ProfileCardPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.ProfileCardPropertyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Organization Settings Request.
 */
public class OrganizationSettingsRequest extends BaseRequest<OrganizationSettings> {
	
    /**
     * The request for the OrganizationSettings
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OrganizationSettingsRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OrganizationSettings.class);
    }

    /**
     * Gets the OrganizationSettings from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OrganizationSettings> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the OrganizationSettings from the service
     *
     * @return the OrganizationSettings from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OrganizationSettings get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OrganizationSettings> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public OrganizationSettings delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this OrganizationSettings with a source
     *
     * @param sourceOrganizationSettings the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OrganizationSettings> patchAsync(@Nonnull final OrganizationSettings sourceOrganizationSettings) {
        return sendAsync(HttpMethod.PATCH, sourceOrganizationSettings);
    }

    /**
     * Patches this OrganizationSettings with a source
     *
     * @param sourceOrganizationSettings the source object with updates
     * @return the updated OrganizationSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OrganizationSettings patch(@Nonnull final OrganizationSettings sourceOrganizationSettings) throws ClientException {
        return send(HttpMethod.PATCH, sourceOrganizationSettings);
    }

    /**
     * Creates a OrganizationSettings with a new object
     *
     * @param newOrganizationSettings the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OrganizationSettings> postAsync(@Nonnull final OrganizationSettings newOrganizationSettings) {
        return sendAsync(HttpMethod.POST, newOrganizationSettings);
    }

    /**
     * Creates a OrganizationSettings with a new object
     *
     * @param newOrganizationSettings the new object to create
     * @return the created OrganizationSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OrganizationSettings post(@Nonnull final OrganizationSettings newOrganizationSettings) throws ClientException {
        return send(HttpMethod.POST, newOrganizationSettings);
    }

    /**
     * Creates a OrganizationSettings with a new object
     *
     * @param newOrganizationSettings the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OrganizationSettings> putAsync(@Nonnull final OrganizationSettings newOrganizationSettings) {
        return sendAsync(HttpMethod.PUT, newOrganizationSettings);
    }

    /**
     * Creates a OrganizationSettings with a new object
     *
     * @param newOrganizationSettings the object to create/update
     * @return the created OrganizationSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OrganizationSettings put(@Nonnull final OrganizationSettings newOrganizationSettings) throws ClientException {
        return send(HttpMethod.PUT, newOrganizationSettings);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public OrganizationSettingsRequest select(@Nonnull final String value) {
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
     public OrganizationSettingsRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

