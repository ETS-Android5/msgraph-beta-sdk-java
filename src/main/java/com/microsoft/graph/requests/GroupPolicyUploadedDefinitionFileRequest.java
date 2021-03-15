// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.GroupPolicyUploadedDefinitionFile;
import com.microsoft.graph.models.GroupPolicyUploadedLanguageFile;
import com.microsoft.graph.requests.GroupPolicyOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.GroupPolicyOperationRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Uploaded Definition File Request.
 */
public class GroupPolicyUploadedDefinitionFileRequest extends BaseRequest<GroupPolicyUploadedDefinitionFile> {
	
    /**
     * The request for the GroupPolicyUploadedDefinitionFile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyUploadedDefinitionFileRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyUploadedDefinitionFile.class);
    }

    /**
     * Gets the GroupPolicyUploadedDefinitionFile from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyUploadedDefinitionFile> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the GroupPolicyUploadedDefinitionFile from the service
     *
     * @return the GroupPolicyUploadedDefinitionFile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupPolicyUploadedDefinitionFile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyUploadedDefinitionFile> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public GroupPolicyUploadedDefinitionFile delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this GroupPolicyUploadedDefinitionFile with a source
     *
     * @param sourceGroupPolicyUploadedDefinitionFile the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyUploadedDefinitionFile> patchAsync(@Nonnull final GroupPolicyUploadedDefinitionFile sourceGroupPolicyUploadedDefinitionFile) {
        return sendAsync(HttpMethod.PATCH, sourceGroupPolicyUploadedDefinitionFile);
    }

    /**
     * Patches this GroupPolicyUploadedDefinitionFile with a source
     *
     * @param sourceGroupPolicyUploadedDefinitionFile the source object with updates
     * @return the updated GroupPolicyUploadedDefinitionFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupPolicyUploadedDefinitionFile patch(@Nonnull final GroupPolicyUploadedDefinitionFile sourceGroupPolicyUploadedDefinitionFile) throws ClientException {
        return send(HttpMethod.PATCH, sourceGroupPolicyUploadedDefinitionFile);
    }

    /**
     * Creates a GroupPolicyUploadedDefinitionFile with a new object
     *
     * @param newGroupPolicyUploadedDefinitionFile the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyUploadedDefinitionFile> postAsync(@Nonnull final GroupPolicyUploadedDefinitionFile newGroupPolicyUploadedDefinitionFile) {
        return sendAsync(HttpMethod.POST, newGroupPolicyUploadedDefinitionFile);
    }

    /**
     * Creates a GroupPolicyUploadedDefinitionFile with a new object
     *
     * @param newGroupPolicyUploadedDefinitionFile the new object to create
     * @return the created GroupPolicyUploadedDefinitionFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupPolicyUploadedDefinitionFile post(@Nonnull final GroupPolicyUploadedDefinitionFile newGroupPolicyUploadedDefinitionFile) throws ClientException {
        return send(HttpMethod.POST, newGroupPolicyUploadedDefinitionFile);
    }

    /**
     * Creates a GroupPolicyUploadedDefinitionFile with a new object
     *
     * @param newGroupPolicyUploadedDefinitionFile the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyUploadedDefinitionFile> putAsync(@Nonnull final GroupPolicyUploadedDefinitionFile newGroupPolicyUploadedDefinitionFile) {
        return sendAsync(HttpMethod.PUT, newGroupPolicyUploadedDefinitionFile);
    }

    /**
     * Creates a GroupPolicyUploadedDefinitionFile with a new object
     *
     * @param newGroupPolicyUploadedDefinitionFile the object to create/update
     * @return the created GroupPolicyUploadedDefinitionFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupPolicyUploadedDefinitionFile put(@Nonnull final GroupPolicyUploadedDefinitionFile newGroupPolicyUploadedDefinitionFile) throws ClientException {
        return send(HttpMethod.PUT, newGroupPolicyUploadedDefinitionFile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public GroupPolicyUploadedDefinitionFileRequest select(@Nonnull final String value) {
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
     public GroupPolicyUploadedDefinitionFileRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

