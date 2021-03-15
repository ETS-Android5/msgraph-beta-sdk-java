// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.EducationSynchronizationProfile;
import com.microsoft.graph.requests.EducationSynchronizationProfileCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.EducationSynchronizationProfileCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Synchronization Profile Collection Page.
 */
public class EducationSynchronizationProfileCollectionPage extends BaseCollectionPage<EducationSynchronizationProfile, EducationSynchronizationProfileCollectionRequestBuilder> {

    /**
     * A collection page for EducationSynchronizationProfile
     *
     * @param response the serialized EducationSynchronizationProfileCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public EducationSynchronizationProfileCollectionPage(@Nonnull final EducationSynchronizationProfileCollectionResponse response, @Nonnull final EducationSynchronizationProfileCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for EducationSynchronizationProfile
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public EducationSynchronizationProfileCollectionPage(@Nonnull final java.util.List<EducationSynchronizationProfile> pageContents, @Nullable final EducationSynchronizationProfileCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
