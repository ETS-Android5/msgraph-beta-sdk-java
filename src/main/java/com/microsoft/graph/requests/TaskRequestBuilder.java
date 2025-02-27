// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Task;
import com.microsoft.graph.models.BaseTask;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.BaseTaskMoveParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Task Request Builder.
 */
public class TaskRequestBuilder extends BaseRequestBuilder<Task> {

    /**
     * The request builder for the Task
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TaskRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the TaskRequest instance
     */
    @Nonnull
    public TaskRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the TaskRequest instance
     */
    @Nonnull
    public TaskRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.TaskRequest(getRequestUrl(), getClient(), requestOptions);
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
     *  Gets a request builder for the LinkedResource_v2 collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public LinkedResource_v2CollectionRequestBuilder linkedResources() {
        return new LinkedResource_v2CollectionRequestBuilder(getRequestUrlWithAdditionalSegment("linkedResources"), getClient(), null);
    }

    /**
     * Gets a request builder for the LinkedResource_v2 item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public LinkedResource_v2RequestBuilder linkedResources(@Nonnull final String id) {
        return new LinkedResource_v2RequestBuilder(getRequestUrlWithAdditionalSegment("linkedResources") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for BaseTaskList
     *
     * @return the BaseTaskListWithReferenceRequestBuilder instance
     */
    @Nonnull
    public BaseTaskListWithReferenceRequestBuilder parentList() {
        return new BaseTaskListWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("parentList"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public BaseTaskMoveRequestBuilder move(@Nonnull final BaseTaskMoveParameterSet parameters) {
        return new BaseTaskMoveRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.move"), getClient(), null, parameters);
    }
}
