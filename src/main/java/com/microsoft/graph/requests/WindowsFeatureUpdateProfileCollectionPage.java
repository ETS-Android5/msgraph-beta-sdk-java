// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.WindowsFeatureUpdateProfile;
import com.microsoft.graph.requests.WindowsFeatureUpdateProfileCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.WindowsFeatureUpdateProfileCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Feature Update Profile Collection Page.
 */
public class WindowsFeatureUpdateProfileCollectionPage extends BaseCollectionPage<WindowsFeatureUpdateProfile, WindowsFeatureUpdateProfileCollectionRequestBuilder> {

    /**
     * A collection page for WindowsFeatureUpdateProfile
     *
     * @param response the serialized WindowsFeatureUpdateProfileCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WindowsFeatureUpdateProfileCollectionPage(@Nonnull final WindowsFeatureUpdateProfileCollectionResponse response, @Nonnull final WindowsFeatureUpdateProfileCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for WindowsFeatureUpdateProfile
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public WindowsFeatureUpdateProfileCollectionPage(@Nonnull final java.util.List<WindowsFeatureUpdateProfile> pageContents, @Nullable final WindowsFeatureUpdateProfileCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
