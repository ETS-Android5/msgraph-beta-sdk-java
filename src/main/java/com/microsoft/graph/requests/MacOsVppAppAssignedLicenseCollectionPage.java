// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.MacOsVppAppAssignedLicense;
import com.microsoft.graph.requests.MacOsVppAppAssignedLicenseCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.MacOsVppAppAssignedLicenseCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac Os Vpp App Assigned License Collection Page.
 */
public class MacOsVppAppAssignedLicenseCollectionPage extends BaseCollectionPage<MacOsVppAppAssignedLicense, MacOsVppAppAssignedLicenseCollectionRequestBuilder> {

    /**
     * A collection page for MacOsVppAppAssignedLicense
     *
     * @param response the serialized MacOsVppAppAssignedLicenseCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MacOsVppAppAssignedLicenseCollectionPage(@Nonnull final MacOsVppAppAssignedLicenseCollectionResponse response, @Nonnull final MacOsVppAppAssignedLicenseCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for MacOsVppAppAssignedLicense
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public MacOsVppAppAssignedLicenseCollectionPage(@Nonnull final java.util.List<MacOsVppAppAssignedLicense> pageContents, @Nullable final MacOsVppAppAssignedLicenseCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
