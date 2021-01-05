// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.FileSecurityProfile;
import com.microsoft.graph.requests.extensions.IFileSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.FileSecurityProfileCollectionPage;
import com.microsoft.graph.requests.extensions.FileSecurityProfileCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the File Security Profile Collection Page.
 */
public class FileSecurityProfileCollectionPage extends BaseCollectionPage<FileSecurityProfile, IFileSecurityProfileCollectionRequestBuilder> implements IFileSecurityProfileCollectionPage {

    /**
     * A collection page for FileSecurityProfile
     *
     * @param response the serialized FileSecurityProfileCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public FileSecurityProfileCollectionPage(final FileSecurityProfileCollectionResponse response, final IFileSecurityProfileCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
