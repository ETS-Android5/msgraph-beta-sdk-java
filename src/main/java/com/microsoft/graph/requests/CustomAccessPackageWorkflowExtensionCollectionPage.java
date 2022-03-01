// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.CustomAccessPackageWorkflowExtension;
import com.microsoft.graph.requests.CustomAccessPackageWorkflowExtensionCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.CustomAccessPackageWorkflowExtensionCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Custom Access Package Workflow Extension Collection Page.
 */
public class CustomAccessPackageWorkflowExtensionCollectionPage extends BaseCollectionPage<CustomAccessPackageWorkflowExtension, CustomAccessPackageWorkflowExtensionCollectionRequestBuilder> {

    /**
     * A collection page for CustomAccessPackageWorkflowExtension
     *
     * @param response the serialized CustomAccessPackageWorkflowExtensionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public CustomAccessPackageWorkflowExtensionCollectionPage(@Nonnull final CustomAccessPackageWorkflowExtensionCollectionResponse response, @Nonnull final CustomAccessPackageWorkflowExtensionCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for CustomAccessPackageWorkflowExtension
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public CustomAccessPackageWorkflowExtensionCollectionPage(@Nonnull final java.util.List<CustomAccessPackageWorkflowExtension> pageContents, @Nullable final CustomAccessPackageWorkflowExtensionCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
