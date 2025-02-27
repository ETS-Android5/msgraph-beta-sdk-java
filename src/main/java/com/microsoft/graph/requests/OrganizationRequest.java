// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Organization;
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.requests.OrganizationalBrandingRequestBuilder;
import com.microsoft.graph.requests.CertificateBasedAuthConfigurationCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.CertificateBasedAuthConfigurationWithReferenceRequestBuilder;
import com.microsoft.graph.requests.ExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.ExtensionRequestBuilder;
import com.microsoft.graph.requests.OrganizationSettingsRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Organization Request.
 */
public class OrganizationRequest extends BaseRequest<Organization> {
	
    /**
     * The request for the Organization
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OrganizationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Organization.class);
    }

    /**
     * Gets the Organization from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Organization> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the Organization from the service
     *
     * @return the Organization from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Organization get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Organization> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Organization delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Organization with a source
     *
     * @param sourceOrganization the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Organization> patchAsync(@Nonnull final Organization sourceOrganization) {
        return sendAsync(HttpMethod.PATCH, sourceOrganization);
    }

    /**
     * Patches this Organization with a source
     *
     * @param sourceOrganization the source object with updates
     * @return the updated Organization
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Organization patch(@Nonnull final Organization sourceOrganization) throws ClientException {
        return send(HttpMethod.PATCH, sourceOrganization);
    }

    /**
     * Creates a Organization with a new object
     *
     * @param newOrganization the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Organization> postAsync(@Nonnull final Organization newOrganization) {
        return sendAsync(HttpMethod.POST, newOrganization);
    }

    /**
     * Creates a Organization with a new object
     *
     * @param newOrganization the new object to create
     * @return the created Organization
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Organization post(@Nonnull final Organization newOrganization) throws ClientException {
        return send(HttpMethod.POST, newOrganization);
    }

    /**
     * Creates a Organization with a new object
     *
     * @param newOrganization the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Organization> putAsync(@Nonnull final Organization newOrganization) {
        return sendAsync(HttpMethod.PUT, newOrganization);
    }

    /**
     * Creates a Organization with a new object
     *
     * @param newOrganization the object to create/update
     * @return the created Organization
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Organization put(@Nonnull final Organization newOrganization) throws ClientException {
        return send(HttpMethod.PUT, newOrganization);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public OrganizationRequest select(@Nonnull final String value) {
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
     public OrganizationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

