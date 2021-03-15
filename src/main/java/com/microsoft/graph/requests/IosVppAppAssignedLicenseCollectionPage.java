// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.IosVppAppAssignedLicense;
import com.microsoft.graph.requests.IosVppAppAssignedLicenseCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.IosVppAppAssignedLicenseCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Vpp App Assigned License Collection Page.
 */
public class IosVppAppAssignedLicenseCollectionPage extends BaseCollectionPage<IosVppAppAssignedLicense, IosVppAppAssignedLicenseCollectionRequestBuilder> {

    /**
     * A collection page for IosVppAppAssignedLicense
     *
     * @param response the serialized IosVppAppAssignedLicenseCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public IosVppAppAssignedLicenseCollectionPage(@Nonnull final IosVppAppAssignedLicenseCollectionResponse response, @Nonnull final IosVppAppAssignedLicenseCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for IosVppAppAssignedLicense
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public IosVppAppAssignedLicenseCollectionPage(@Nonnull final java.util.List<IosVppAppAssignedLicense> pageContents, @Nullable final IosVppAppAssignedLicenseCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
