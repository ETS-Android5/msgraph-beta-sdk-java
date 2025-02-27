// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.GroupPolicyPresentationTextBox;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Presentation Text Box Request.
 */
public class GroupPolicyPresentationTextBoxRequest extends BaseRequest<GroupPolicyPresentationTextBox> {
	
    /**
     * The request for the GroupPolicyPresentationTextBox
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyPresentationTextBoxRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyPresentationTextBox.class);
    }

    /**
     * Gets the GroupPolicyPresentationTextBox from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyPresentationTextBox> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the GroupPolicyPresentationTextBox from the service
     *
     * @return the GroupPolicyPresentationTextBox from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupPolicyPresentationTextBox get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyPresentationTextBox> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public GroupPolicyPresentationTextBox delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this GroupPolicyPresentationTextBox with a source
     *
     * @param sourceGroupPolicyPresentationTextBox the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyPresentationTextBox> patchAsync(@Nonnull final GroupPolicyPresentationTextBox sourceGroupPolicyPresentationTextBox) {
        return sendAsync(HttpMethod.PATCH, sourceGroupPolicyPresentationTextBox);
    }

    /**
     * Patches this GroupPolicyPresentationTextBox with a source
     *
     * @param sourceGroupPolicyPresentationTextBox the source object with updates
     * @return the updated GroupPolicyPresentationTextBox
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupPolicyPresentationTextBox patch(@Nonnull final GroupPolicyPresentationTextBox sourceGroupPolicyPresentationTextBox) throws ClientException {
        return send(HttpMethod.PATCH, sourceGroupPolicyPresentationTextBox);
    }

    /**
     * Creates a GroupPolicyPresentationTextBox with a new object
     *
     * @param newGroupPolicyPresentationTextBox the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyPresentationTextBox> postAsync(@Nonnull final GroupPolicyPresentationTextBox newGroupPolicyPresentationTextBox) {
        return sendAsync(HttpMethod.POST, newGroupPolicyPresentationTextBox);
    }

    /**
     * Creates a GroupPolicyPresentationTextBox with a new object
     *
     * @param newGroupPolicyPresentationTextBox the new object to create
     * @return the created GroupPolicyPresentationTextBox
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupPolicyPresentationTextBox post(@Nonnull final GroupPolicyPresentationTextBox newGroupPolicyPresentationTextBox) throws ClientException {
        return send(HttpMethod.POST, newGroupPolicyPresentationTextBox);
    }

    /**
     * Creates a GroupPolicyPresentationTextBox with a new object
     *
     * @param newGroupPolicyPresentationTextBox the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyPresentationTextBox> putAsync(@Nonnull final GroupPolicyPresentationTextBox newGroupPolicyPresentationTextBox) {
        return sendAsync(HttpMethod.PUT, newGroupPolicyPresentationTextBox);
    }

    /**
     * Creates a GroupPolicyPresentationTextBox with a new object
     *
     * @param newGroupPolicyPresentationTextBox the object to create/update
     * @return the created GroupPolicyPresentationTextBox
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupPolicyPresentationTextBox put(@Nonnull final GroupPolicyPresentationTextBox newGroupPolicyPresentationTextBox) throws ClientException {
        return send(HttpMethod.PUT, newGroupPolicyPresentationTextBox);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public GroupPolicyPresentationTextBoxRequest select(@Nonnull final String value) {
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
     public GroupPolicyPresentationTextBoxRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

