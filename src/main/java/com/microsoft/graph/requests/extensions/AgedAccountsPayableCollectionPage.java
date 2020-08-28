// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AgedAccountsPayable;
import com.microsoft.graph.requests.extensions.IAgedAccountsPayableCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.AgedAccountsPayableCollectionPage;
import com.microsoft.graph.requests.extensions.AgedAccountsPayableCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Aged Accounts Payable Collection Page.
 */
public class AgedAccountsPayableCollectionPage extends BaseCollectionPage<AgedAccountsPayable, IAgedAccountsPayableCollectionRequestBuilder> implements IAgedAccountsPayableCollectionPage {

    /**
     * A collection page for AgedAccountsPayable
     *
     * @param response the serialized AgedAccountsPayableCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AgedAccountsPayableCollectionPage(final AgedAccountsPayableCollectionResponse response, final IAgedAccountsPayableCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
