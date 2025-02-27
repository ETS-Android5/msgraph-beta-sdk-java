// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.OrgContact;
import com.microsoft.graph.requests.OrgContactCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.OrgContactCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Org Contact Collection Page.
 */
public class OrgContactCollectionPage extends BaseCollectionPage<OrgContact, OrgContactCollectionRequestBuilder> {

    /**
     * A collection page for OrgContact
     *
     * @param response the serialized OrgContactCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public OrgContactCollectionPage(@Nonnull final OrgContactCollectionResponse response, @Nonnull final OrgContactCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for OrgContact
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public OrgContactCollectionPage(@Nonnull final java.util.List<OrgContact> pageContents, @Nullable final OrgContactCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
