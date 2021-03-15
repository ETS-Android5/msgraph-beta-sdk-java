// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.DomainDnsRecord;
import com.microsoft.graph.requests.DomainDnsRecordCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.DomainDnsRecordCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Domain Dns Record Collection Page.
 */
public class DomainDnsRecordCollectionPage extends BaseCollectionPage<DomainDnsRecord, DomainDnsRecordCollectionRequestBuilder> {

    /**
     * A collection page for DomainDnsRecord
     *
     * @param response the serialized DomainDnsRecordCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DomainDnsRecordCollectionPage(@Nonnull final DomainDnsRecordCollectionResponse response, @Nonnull final DomainDnsRecordCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for DomainDnsRecord
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DomainDnsRecordCollectionPage(@Nonnull final java.util.List<DomainDnsRecord> pageContents, @Nullable final DomainDnsRecordCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
