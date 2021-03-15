// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.CloudAppSecurityProfile;
import com.microsoft.graph.requests.CloudAppSecurityProfileCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.CloudAppSecurityProfileCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud App Security Profile Collection Page.
 */
public class CloudAppSecurityProfileCollectionPage extends BaseCollectionPage<CloudAppSecurityProfile, CloudAppSecurityProfileCollectionRequestBuilder> {

    /**
     * A collection page for CloudAppSecurityProfile
     *
     * @param response the serialized CloudAppSecurityProfileCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public CloudAppSecurityProfileCollectionPage(@Nonnull final CloudAppSecurityProfileCollectionResponse response, @Nonnull final CloudAppSecurityProfileCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for CloudAppSecurityProfile
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public CloudAppSecurityProfileCollectionPage(@Nonnull final java.util.List<CloudAppSecurityProfile> pageContents, @Nullable final CloudAppSecurityProfileCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
