// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EntitlementManagement;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentResourceRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentResourceRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentResourceRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentResourceRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageCatalogCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageCatalogRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageCatalogCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageCatalogRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceEnvironmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceEnvironmentRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceEnvironmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceEnvironmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRoleScopeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRoleScopeRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRoleScopeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRoleScopeRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectedOrganizationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectedOrganizationRequestBuilder;
import com.microsoft.graph.requests.extensions.ConnectedOrganizationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConnectedOrganizationRequestBuilder;
import com.microsoft.graph.requests.extensions.IEntitlementManagementSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.EntitlementManagementSettingsRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Entitlement Management Request.
 */
public class EntitlementManagementRequest extends BaseRequest implements IEntitlementManagementRequest {
	
    /**
     * The request for the EntitlementManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EntitlementManagementRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EntitlementManagement.class);
    }

    /**
     * Gets the EntitlementManagement from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super EntitlementManagement> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EntitlementManagement from the service
     *
     * @return the EntitlementManagement from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EntitlementManagement get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super EntitlementManagement> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this EntitlementManagement with a source
     *
     * @param sourceEntitlementManagement the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final EntitlementManagement sourceEntitlementManagement, final ICallback<? super EntitlementManagement> callback) {
        send(HttpMethod.PATCH, callback, sourceEntitlementManagement);
    }

    /**
     * Patches this EntitlementManagement with a source
     *
     * @param sourceEntitlementManagement the source object with updates
     * @return the updated EntitlementManagement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EntitlementManagement patch(final EntitlementManagement sourceEntitlementManagement) throws ClientException {
        return send(HttpMethod.PATCH, sourceEntitlementManagement);
    }

    /**
     * Creates a EntitlementManagement with a new object
     *
     * @param newEntitlementManagement the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final EntitlementManagement newEntitlementManagement, final ICallback<? super EntitlementManagement> callback) {
        send(HttpMethod.POST, callback, newEntitlementManagement);
    }

    /**
     * Creates a EntitlementManagement with a new object
     *
     * @param newEntitlementManagement the new object to create
     * @return the created EntitlementManagement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EntitlementManagement post(final EntitlementManagement newEntitlementManagement) throws ClientException {
        return send(HttpMethod.POST, newEntitlementManagement);
    }

    /**
     * Creates a EntitlementManagement with a new object
     *
     * @param newEntitlementManagement the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final EntitlementManagement newEntitlementManagement, final ICallback<? super EntitlementManagement> callback) {
        send(HttpMethod.PUT, callback, newEntitlementManagement);
    }

    /**
     * Creates a EntitlementManagement with a new object
     *
     * @param newEntitlementManagement the object to create/update
     * @return the created EntitlementManagement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EntitlementManagement put(final EntitlementManagement newEntitlementManagement) throws ClientException {
        return send(HttpMethod.PUT, newEntitlementManagement);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IEntitlementManagementRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (EntitlementManagementRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IEntitlementManagementRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (EntitlementManagementRequest)this;
     }

}

