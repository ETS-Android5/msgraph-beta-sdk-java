// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Tasks;
import com.microsoft.graph.requests.BaseTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.BaseTaskRequestBuilder;
import com.microsoft.graph.requests.BaseTaskListCollectionRequestBuilder;
import com.microsoft.graph.requests.BaseTaskListRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Tasks Request Builder.
 */
public class TasksRequestBuilder extends BaseRequestBuilder<Tasks> {

    /**
     * The request builder for the Tasks
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TasksRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the TasksRequest instance
     */
    @Nonnull
    public TasksRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the TasksRequest instance
     */
    @Nonnull
    public TasksRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.TasksRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the BaseTask collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public BaseTaskCollectionRequestBuilder alltasks() {
        return new BaseTaskCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("alltasks"), getClient(), null);
    }

    /**
     * Gets a request builder for the BaseTask item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public BaseTaskRequestBuilder alltasks(@Nonnull final String id) {
        return new BaseTaskRequestBuilder(getRequestUrlWithAdditionalSegment("alltasks") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the BaseTaskList collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public BaseTaskListCollectionRequestBuilder lists() {
        return new BaseTaskListCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("lists"), getClient(), null);
    }

    /**
     * Gets a request builder for the BaseTaskList item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public BaseTaskListRequestBuilder lists(@Nonnull final String id) {
        return new BaseTaskListRequestBuilder(getRequestUrlWithAdditionalSegment("lists") + "/" + id, getClient(), null);
    }
}
