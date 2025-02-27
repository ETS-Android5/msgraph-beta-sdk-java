// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.WindowsQualityUpdateProfile;
import com.microsoft.graph.requests.WindowsQualityUpdateProfileCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.WindowsQualityUpdateProfileCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Quality Update Profile Collection Page.
 */
public class WindowsQualityUpdateProfileCollectionPage extends BaseCollectionPage<WindowsQualityUpdateProfile, WindowsQualityUpdateProfileCollectionRequestBuilder> {

    /**
     * A collection page for WindowsQualityUpdateProfile
     *
     * @param response the serialized WindowsQualityUpdateProfileCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WindowsQualityUpdateProfileCollectionPage(@Nonnull final WindowsQualityUpdateProfileCollectionResponse response, @Nonnull final WindowsQualityUpdateProfileCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for WindowsQualityUpdateProfile
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public WindowsQualityUpdateProfileCollectionPage(@Nonnull final java.util.List<WindowsQualityUpdateProfile> pageContents, @Nullable final WindowsQualityUpdateProfileCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
