// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.EntitlementManagement;
import com.microsoft.graph.requests.ApprovalCollectionRequestBuilder;
import com.microsoft.graph.requests.ApprovalRequestBuilder;
import com.microsoft.graph.requests.AccessPackageAssignmentPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessPackageAssignmentPolicyRequestBuilder;
import com.microsoft.graph.requests.AccessPackageAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessPackageAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.AccessPackageAssignmentResourceRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessPackageAssignmentResourceRoleRequestBuilder;
import com.microsoft.graph.requests.AccessPackageAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessPackageAssignmentRequestBuilder;
import com.microsoft.graph.requests.AccessPackageCatalogCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessPackageCatalogRequestBuilder;
import com.microsoft.graph.requests.AccessPackageResourceEnvironmentCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessPackageResourceEnvironmentRequestBuilder;
import com.microsoft.graph.requests.AccessPackageResourceRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessPackageResourceRequestRequestBuilder;
import com.microsoft.graph.requests.AccessPackageResourceRoleScopeCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessPackageResourceRoleScopeRequestBuilder;
import com.microsoft.graph.requests.AccessPackageResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessPackageResourceRequestBuilder;
import com.microsoft.graph.requests.AccessPackageCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessPackageRequestBuilder;
import com.microsoft.graph.requests.ConnectedOrganizationCollectionRequestBuilder;
import com.microsoft.graph.requests.ConnectedOrganizationRequestBuilder;
import com.microsoft.graph.requests.EntitlementManagementSettingsRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Entitlement Management Request.
 */
public class EntitlementManagementRequest extends BaseRequest<EntitlementManagement> {
	
    /**
     * The request for the EntitlementManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EntitlementManagementRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EntitlementManagement.class);
    }

    /**
     * Gets the EntitlementManagement from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EntitlementManagement> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the EntitlementManagement from the service
     *
     * @return the EntitlementManagement from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EntitlementManagement get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EntitlementManagement> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public EntitlementManagement delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this EntitlementManagement with a source
     *
     * @param sourceEntitlementManagement the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EntitlementManagement> patchAsync(@Nonnull final EntitlementManagement sourceEntitlementManagement) {
        return sendAsync(HttpMethod.PATCH, sourceEntitlementManagement);
    }

    /**
     * Patches this EntitlementManagement with a source
     *
     * @param sourceEntitlementManagement the source object with updates
     * @return the updated EntitlementManagement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EntitlementManagement patch(@Nonnull final EntitlementManagement sourceEntitlementManagement) throws ClientException {
        return send(HttpMethod.PATCH, sourceEntitlementManagement);
    }

    /**
     * Creates a EntitlementManagement with a new object
     *
     * @param newEntitlementManagement the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EntitlementManagement> postAsync(@Nonnull final EntitlementManagement newEntitlementManagement) {
        return sendAsync(HttpMethod.POST, newEntitlementManagement);
    }

    /**
     * Creates a EntitlementManagement with a new object
     *
     * @param newEntitlementManagement the new object to create
     * @return the created EntitlementManagement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EntitlementManagement post(@Nonnull final EntitlementManagement newEntitlementManagement) throws ClientException {
        return send(HttpMethod.POST, newEntitlementManagement);
    }

    /**
     * Creates a EntitlementManagement with a new object
     *
     * @param newEntitlementManagement the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EntitlementManagement> putAsync(@Nonnull final EntitlementManagement newEntitlementManagement) {
        return sendAsync(HttpMethod.PUT, newEntitlementManagement);
    }

    /**
     * Creates a EntitlementManagement with a new object
     *
     * @param newEntitlementManagement the object to create/update
     * @return the created EntitlementManagement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EntitlementManagement put(@Nonnull final EntitlementManagement newEntitlementManagement) throws ClientException {
        return send(HttpMethod.PUT, newEntitlementManagement);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public EntitlementManagementRequest select(@Nonnull final String value) {
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
     public EntitlementManagementRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

