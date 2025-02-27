// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.TodoTask;
import com.microsoft.graph.requests.ChecklistItemCollectionRequestBuilder;
import com.microsoft.graph.requests.ChecklistItemRequestBuilder;
import com.microsoft.graph.requests.ExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.ExtensionRequestBuilder;
import com.microsoft.graph.requests.LinkedResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.LinkedResourceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Todo Task Request Builder.
 */
public class TodoTaskRequestBuilder extends BaseRequestBuilder<TodoTask> {

    /**
     * The request builder for the TodoTask
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TodoTaskRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the TodoTaskRequest instance
     */
    @Nonnull
    public TodoTaskRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the TodoTaskRequest instance
     */
    @Nonnull
    public TodoTaskRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.TodoTaskRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the ChecklistItem collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ChecklistItemCollectionRequestBuilder checklistItems() {
        return new ChecklistItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("checklistItems"), getClient(), null);
    }

    /**
     * Gets a request builder for the ChecklistItem item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ChecklistItemRequestBuilder checklistItems(@Nonnull final String id) {
        return new ChecklistItemRequestBuilder(getRequestUrlWithAdditionalSegment("checklistItems") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Extension collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ExtensionCollectionRequestBuilder extensions() {
        return new ExtensionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions"), getClient(), null);
    }

    /**
     * Gets a request builder for the Extension item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ExtensionRequestBuilder extensions(@Nonnull final String id) {
        return new ExtensionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the LinkedResource collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public LinkedResourceCollectionRequestBuilder linkedResources() {
        return new LinkedResourceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("linkedResources"), getClient(), null);
    }

    /**
     * Gets a request builder for the LinkedResource item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public LinkedResourceRequestBuilder linkedResources(@Nonnull final String id) {
        return new LinkedResourceRequestBuilder(getRequestUrlWithAdditionalSegment("linkedResources") + "/" + id, getClient(), null);
    }
}
