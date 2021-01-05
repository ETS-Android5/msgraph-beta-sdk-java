// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TaxGroup;
import com.microsoft.graph.requests.extensions.ITaxGroupCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.TaxGroupCollectionPage;
import com.microsoft.graph.requests.extensions.TaxGroupCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Tax Group Collection Page.
 */
public class TaxGroupCollectionPage extends BaseCollectionPage<TaxGroup, ITaxGroupCollectionRequestBuilder> implements ITaxGroupCollectionPage {

    /**
     * A collection page for TaxGroup
     *
     * @param response the serialized TaxGroupCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TaxGroupCollectionPage(final TaxGroupCollectionResponse response, final ITaxGroupCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
