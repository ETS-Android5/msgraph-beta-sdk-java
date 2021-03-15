// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ServicePrincipal;
import com.microsoft.graph.models.Credential;
import com.microsoft.graph.models.PasswordSingleSignOnCredentialSet;
import com.microsoft.graph.models.SelfSignedCertificate;
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.requests.AppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.AppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.ClaimsMappingPolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.ClaimsMappingPolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.DirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.DirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.ServicePrincipalRequestBuilder;
import com.microsoft.graph.requests.DelegatedPermissionClassificationCollectionRequestBuilder;
import com.microsoft.graph.requests.DelegatedPermissionClassificationRequestBuilder;
import com.microsoft.graph.requests.EndpointCollectionRequestBuilder;
import com.microsoft.graph.requests.EndpointRequestBuilder;
import com.microsoft.graph.requests.HomeRealmDiscoveryPolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.HomeRealmDiscoveryPolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.LicenseDetailsCollectionRequestBuilder;
import com.microsoft.graph.requests.LicenseDetailsRequestBuilder;
import com.microsoft.graph.requests.UserRequestBuilder;
import com.microsoft.graph.requests.GroupRequestBuilder;
import com.microsoft.graph.requests.ApplicationRequestBuilder;
import com.microsoft.graph.requests.DeviceRequestBuilder;
import com.microsoft.graph.requests.OrgContactRequestBuilder;
import com.microsoft.graph.requests.OAuth2PermissionGrantCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.OAuth2PermissionGrantWithReferenceRequestBuilder;
import com.microsoft.graph.requests.TokenIssuancePolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.TokenIssuancePolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.TokenLifetimePolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.TokenLifetimePolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.SynchronizationRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal Request.
 */
public class ServicePrincipalRequest extends BaseRequest<ServicePrincipal> {
	
    /**
     * The request for the ServicePrincipal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ServicePrincipalRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ServicePrincipal.class);
    }

    /**
     * Gets the ServicePrincipal from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ServicePrincipal> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ServicePrincipal from the service
     *
     * @return the ServicePrincipal from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ServicePrincipal get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ServicePrincipal> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ServicePrincipal delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ServicePrincipal with a source
     *
     * @param sourceServicePrincipal the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ServicePrincipal> patchAsync(@Nonnull final ServicePrincipal sourceServicePrincipal) {
        return sendAsync(HttpMethod.PATCH, sourceServicePrincipal);
    }

    /**
     * Patches this ServicePrincipal with a source
     *
     * @param sourceServicePrincipal the source object with updates
     * @return the updated ServicePrincipal
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ServicePrincipal patch(@Nonnull final ServicePrincipal sourceServicePrincipal) throws ClientException {
        return send(HttpMethod.PATCH, sourceServicePrincipal);
    }

    /**
     * Creates a ServicePrincipal with a new object
     *
     * @param newServicePrincipal the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ServicePrincipal> postAsync(@Nonnull final ServicePrincipal newServicePrincipal) {
        return sendAsync(HttpMethod.POST, newServicePrincipal);
    }

    /**
     * Creates a ServicePrincipal with a new object
     *
     * @param newServicePrincipal the new object to create
     * @return the created ServicePrincipal
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ServicePrincipal post(@Nonnull final ServicePrincipal newServicePrincipal) throws ClientException {
        return send(HttpMethod.POST, newServicePrincipal);
    }

    /**
     * Creates a ServicePrincipal with a new object
     *
     * @param newServicePrincipal the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ServicePrincipal> putAsync(@Nonnull final ServicePrincipal newServicePrincipal) {
        return sendAsync(HttpMethod.PUT, newServicePrincipal);
    }

    /**
     * Creates a ServicePrincipal with a new object
     *
     * @param newServicePrincipal the object to create/update
     * @return the created ServicePrincipal
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ServicePrincipal put(@Nonnull final ServicePrincipal newServicePrincipal) throws ClientException {
        return send(HttpMethod.PUT, newServicePrincipal);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ServicePrincipalRequest select(@Nonnull final String value) {
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
     public ServicePrincipalRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

