// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.requests;
import com.microsoft.graph.managedtenants.models.CredentialUserRegistrationsSummary;
import com.microsoft.graph.managedtenants.requests.CredentialUserRegistrationsSummaryCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.managedtenants.requests.CredentialUserRegistrationsSummaryCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Credential User Registrations Summary Collection Page.
 */
public class CredentialUserRegistrationsSummaryCollectionPage extends BaseCollectionPage<CredentialUserRegistrationsSummary, CredentialUserRegistrationsSummaryCollectionRequestBuilder> {

    /**
     * A collection page for CredentialUserRegistrationsSummary
     *
     * @param response the serialized CredentialUserRegistrationsSummaryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public CredentialUserRegistrationsSummaryCollectionPage(@Nonnull final CredentialUserRegistrationsSummaryCollectionResponse response, @Nonnull final CredentialUserRegistrationsSummaryCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for CredentialUserRegistrationsSummary
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public CredentialUserRegistrationsSummaryCollectionPage(@Nonnull final java.util.List<CredentialUserRegistrationsSummary> pageContents, @Nullable final CredentialUserRegistrationsSummaryCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
