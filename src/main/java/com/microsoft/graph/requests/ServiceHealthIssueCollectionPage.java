// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.ServiceHealthIssue;
import com.microsoft.graph.requests.ServiceHealthIssueCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.ServiceHealthIssueCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Health Issue Collection Page.
 */
public class ServiceHealthIssueCollectionPage extends BaseCollectionPage<ServiceHealthIssue, ServiceHealthIssueCollectionRequestBuilder> {

    /**
     * A collection page for ServiceHealthIssue
     *
     * @param response the serialized ServiceHealthIssueCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ServiceHealthIssueCollectionPage(@Nonnull final ServiceHealthIssueCollectionResponse response, @Nonnull final ServiceHealthIssueCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for ServiceHealthIssue
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ServiceHealthIssueCollectionPage(@Nonnull final java.util.List<ServiceHealthIssue> pageContents, @Nullable final ServiceHealthIssueCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
