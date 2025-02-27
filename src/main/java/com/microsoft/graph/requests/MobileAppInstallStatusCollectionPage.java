// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.MobileAppInstallStatus;
import com.microsoft.graph.requests.MobileAppInstallStatusCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.MobileAppInstallStatusCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Install Status Collection Page.
 */
public class MobileAppInstallStatusCollectionPage extends BaseCollectionPage<MobileAppInstallStatus, MobileAppInstallStatusCollectionRequestBuilder> {

    /**
     * A collection page for MobileAppInstallStatus
     *
     * @param response the serialized MobileAppInstallStatusCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MobileAppInstallStatusCollectionPage(@Nonnull final MobileAppInstallStatusCollectionResponse response, @Nonnull final MobileAppInstallStatusCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for MobileAppInstallStatus
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public MobileAppInstallStatusCollectionPage(@Nonnull final java.util.List<MobileAppInstallStatus> pageContents, @Nullable final MobileAppInstallStatusCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
