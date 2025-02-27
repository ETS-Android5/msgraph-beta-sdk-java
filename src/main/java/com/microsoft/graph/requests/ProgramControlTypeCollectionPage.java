// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.ProgramControlType;
import com.microsoft.graph.requests.ProgramControlTypeCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.ProgramControlTypeCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Program Control Type Collection Page.
 */
public class ProgramControlTypeCollectionPage extends BaseCollectionPage<ProgramControlType, ProgramControlTypeCollectionRequestBuilder> {

    /**
     * A collection page for ProgramControlType
     *
     * @param response the serialized ProgramControlTypeCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ProgramControlTypeCollectionPage(@Nonnull final ProgramControlTypeCollectionResponse response, @Nonnull final ProgramControlTypeCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for ProgramControlType
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ProgramControlTypeCollectionPage(@Nonnull final java.util.List<ProgramControlType> pageContents, @Nullable final ProgramControlTypeCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
