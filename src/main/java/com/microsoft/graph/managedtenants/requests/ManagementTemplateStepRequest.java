// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.managedtenants.models.ManagementTemplateStep;
import com.microsoft.graph.managedtenants.requests.ManagementTemplateStepVersionWithReferenceRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementTemplateWithReferenceRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementTemplateStepVersionCollectionWithReferencesRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Management Template Step Request.
 */
public class ManagementTemplateStepRequest extends BaseRequest<ManagementTemplateStep> {
	
    /**
     * The request for the ManagementTemplateStep
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagementTemplateStepRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagementTemplateStep.class);
    }

    /**
     * Gets the ManagementTemplateStep from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagementTemplateStep> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ManagementTemplateStep from the service
     *
     * @return the ManagementTemplateStep from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagementTemplateStep get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagementTemplateStep> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ManagementTemplateStep delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ManagementTemplateStep with a source
     *
     * @param sourceManagementTemplateStep the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagementTemplateStep> patchAsync(@Nonnull final ManagementTemplateStep sourceManagementTemplateStep) {
        return sendAsync(HttpMethod.PATCH, sourceManagementTemplateStep);
    }

    /**
     * Patches this ManagementTemplateStep with a source
     *
     * @param sourceManagementTemplateStep the source object with updates
     * @return the updated ManagementTemplateStep
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagementTemplateStep patch(@Nonnull final ManagementTemplateStep sourceManagementTemplateStep) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagementTemplateStep);
    }

    /**
     * Creates a ManagementTemplateStep with a new object
     *
     * @param newManagementTemplateStep the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagementTemplateStep> postAsync(@Nonnull final ManagementTemplateStep newManagementTemplateStep) {
        return sendAsync(HttpMethod.POST, newManagementTemplateStep);
    }

    /**
     * Creates a ManagementTemplateStep with a new object
     *
     * @param newManagementTemplateStep the new object to create
     * @return the created ManagementTemplateStep
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagementTemplateStep post(@Nonnull final ManagementTemplateStep newManagementTemplateStep) throws ClientException {
        return send(HttpMethod.POST, newManagementTemplateStep);
    }

    /**
     * Creates a ManagementTemplateStep with a new object
     *
     * @param newManagementTemplateStep the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagementTemplateStep> putAsync(@Nonnull final ManagementTemplateStep newManagementTemplateStep) {
        return sendAsync(HttpMethod.PUT, newManagementTemplateStep);
    }

    /**
     * Creates a ManagementTemplateStep with a new object
     *
     * @param newManagementTemplateStep the object to create/update
     * @return the created ManagementTemplateStep
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagementTemplateStep put(@Nonnull final ManagementTemplateStep newManagementTemplateStep) throws ClientException {
        return send(HttpMethod.PUT, newManagementTemplateStep);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ManagementTemplateStepRequest select(@Nonnull final String value) {
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
     public ManagementTemplateStepRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

