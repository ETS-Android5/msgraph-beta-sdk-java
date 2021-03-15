// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ImportedAppleDeviceIdentity;
import com.microsoft.graph.models.ImportedAppleDeviceIdentityResult;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.ImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionRequestBuilder;
import com.microsoft.graph.requests.ImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionPage;
import com.microsoft.graph.requests.ImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Imported Apple Device Identity Import Apple Device Identity List Collection Page.
 */
public class ImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionPage extends BaseCollectionPage<ImportedAppleDeviceIdentityResult, ImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionRequestBuilder> {

    /**
     * A collection page for ImportedAppleDeviceIdentityResult.
     *
     * @param response The serialized ImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionPage(@Nonnull final ImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionResponse response, @Nonnull final ImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for ImportedAppleDeviceIdentityImportAppleDeviceIdentityList
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionPage(@Nonnull final java.util.List<ImportedAppleDeviceIdentityResult> pageContents, @Nullable final ImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
