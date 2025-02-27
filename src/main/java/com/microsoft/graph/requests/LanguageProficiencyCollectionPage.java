// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.LanguageProficiency;
import com.microsoft.graph.requests.LanguageProficiencyCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.LanguageProficiencyCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Language Proficiency Collection Page.
 */
public class LanguageProficiencyCollectionPage extends BaseCollectionPage<LanguageProficiency, LanguageProficiencyCollectionRequestBuilder> {

    /**
     * A collection page for LanguageProficiency
     *
     * @param response the serialized LanguageProficiencyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public LanguageProficiencyCollectionPage(@Nonnull final LanguageProficiencyCollectionResponse response, @Nonnull final LanguageProficiencyCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for LanguageProficiency
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public LanguageProficiencyCollectionPage(@Nonnull final java.util.List<LanguageProficiency> pageContents, @Nullable final LanguageProficiencyCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
