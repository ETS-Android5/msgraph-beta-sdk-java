// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.GroupPolicyConfigurationAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Configuration Assignment Request.
 */
public class GroupPolicyConfigurationAssignmentRequest extends BaseRequest<GroupPolicyConfigurationAssignment> {
	
    /**
     * The request for the GroupPolicyConfigurationAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyConfigurationAssignmentRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyConfigurationAssignment.class);
    }

    /**
     * Gets the GroupPolicyConfigurationAssignment from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyConfigurationAssignment> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the GroupPolicyConfigurationAssignment from the service
     *
     * @return the GroupPolicyConfigurationAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupPolicyConfigurationAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyConfigurationAssignment> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public GroupPolicyConfigurationAssignment delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this GroupPolicyConfigurationAssignment with a source
     *
     * @param sourceGroupPolicyConfigurationAssignment the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyConfigurationAssignment> patchAsync(@Nonnull final GroupPolicyConfigurationAssignment sourceGroupPolicyConfigurationAssignment) {
        return sendAsync(HttpMethod.PATCH, sourceGroupPolicyConfigurationAssignment);
    }

    /**
     * Patches this GroupPolicyConfigurationAssignment with a source
     *
     * @param sourceGroupPolicyConfigurationAssignment the source object with updates
     * @return the updated GroupPolicyConfigurationAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupPolicyConfigurationAssignment patch(@Nonnull final GroupPolicyConfigurationAssignment sourceGroupPolicyConfigurationAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceGroupPolicyConfigurationAssignment);
    }

    /**
     * Creates a GroupPolicyConfigurationAssignment with a new object
     *
     * @param newGroupPolicyConfigurationAssignment the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyConfigurationAssignment> postAsync(@Nonnull final GroupPolicyConfigurationAssignment newGroupPolicyConfigurationAssignment) {
        return sendAsync(HttpMethod.POST, newGroupPolicyConfigurationAssignment);
    }

    /**
     * Creates a GroupPolicyConfigurationAssignment with a new object
     *
     * @param newGroupPolicyConfigurationAssignment the new object to create
     * @return the created GroupPolicyConfigurationAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupPolicyConfigurationAssignment post(@Nonnull final GroupPolicyConfigurationAssignment newGroupPolicyConfigurationAssignment) throws ClientException {
        return send(HttpMethod.POST, newGroupPolicyConfigurationAssignment);
    }

    /**
     * Creates a GroupPolicyConfigurationAssignment with a new object
     *
     * @param newGroupPolicyConfigurationAssignment the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyConfigurationAssignment> putAsync(@Nonnull final GroupPolicyConfigurationAssignment newGroupPolicyConfigurationAssignment) {
        return sendAsync(HttpMethod.PUT, newGroupPolicyConfigurationAssignment);
    }

    /**
     * Creates a GroupPolicyConfigurationAssignment with a new object
     *
     * @param newGroupPolicyConfigurationAssignment the object to create/update
     * @return the created GroupPolicyConfigurationAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupPolicyConfigurationAssignment put(@Nonnull final GroupPolicyConfigurationAssignment newGroupPolicyConfigurationAssignment) throws ClientException {
        return send(HttpMethod.PUT, newGroupPolicyConfigurationAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public GroupPolicyConfigurationAssignmentRequest select(@Nonnull final String value) {
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
     public GroupPolicyConfigurationAssignmentRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

