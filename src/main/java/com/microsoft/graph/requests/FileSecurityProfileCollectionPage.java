// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.FileSecurityProfile;
import com.microsoft.graph.requests.FileSecurityProfileCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.FileSecurityProfileCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the File Security Profile Collection Page.
 */
public class FileSecurityProfileCollectionPage extends BaseCollectionPage<FileSecurityProfile, FileSecurityProfileCollectionRequestBuilder> {

    /**
     * A collection page for FileSecurityProfile
     *
     * @param response the serialized FileSecurityProfileCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public FileSecurityProfileCollectionPage(@Nonnull final FileSecurityProfileCollectionResponse response, @Nonnull final FileSecurityProfileCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for FileSecurityProfile
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public FileSecurityProfileCollectionPage(@Nonnull final java.util.List<FileSecurityProfile> pageContents, @Nullable final FileSecurityProfileCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
