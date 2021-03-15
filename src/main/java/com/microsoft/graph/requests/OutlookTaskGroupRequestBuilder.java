// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.OutlookTaskGroup;
import com.microsoft.graph.requests.OutlookTaskFolderCollectionRequestBuilder;
import com.microsoft.graph.requests.OutlookTaskFolderRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Outlook Task Group Request Builder.
 */
public class OutlookTaskGroupRequestBuilder extends BaseRequestBuilder<OutlookTaskGroup> {

    /**
     * The request builder for the OutlookTaskGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OutlookTaskGroupRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the OutlookTaskGroupRequest instance
     */
    @Nonnull
    public OutlookTaskGroupRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the OutlookTaskGroupRequest instance
     */
    @Nonnull
    public OutlookTaskGroupRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.OutlookTaskGroupRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the OutlookTaskFolder collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public OutlookTaskFolderCollectionRequestBuilder taskFolders() {
        return new OutlookTaskFolderCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("taskFolders"), getClient(), null);
    }

    /**
     * Gets a request builder for the OutlookTaskFolder item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public OutlookTaskFolderRequestBuilder taskFolders(@Nonnull final String id) {
        return new OutlookTaskFolderRequestBuilder(getRequestUrlWithAdditionalSegment("taskFolders") + "/" + id, getClient(), null);
    }
}
