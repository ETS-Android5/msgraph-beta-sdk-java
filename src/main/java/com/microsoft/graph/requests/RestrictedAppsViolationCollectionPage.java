// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.RestrictedAppsViolation;
import com.microsoft.graph.requests.RestrictedAppsViolationCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.RestrictedAppsViolationCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Restricted Apps Violation Collection Page.
 */
public class RestrictedAppsViolationCollectionPage extends BaseCollectionPage<RestrictedAppsViolation, RestrictedAppsViolationCollectionRequestBuilder> {

    /**
     * A collection page for RestrictedAppsViolation
     *
     * @param response the serialized RestrictedAppsViolationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public RestrictedAppsViolationCollectionPage(@Nonnull final RestrictedAppsViolationCollectionResponse response, @Nonnull final RestrictedAppsViolationCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for RestrictedAppsViolation
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public RestrictedAppsViolationCollectionPage(@Nonnull final java.util.List<RestrictedAppsViolation> pageContents, @Nullable final RestrictedAppsViolationCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
