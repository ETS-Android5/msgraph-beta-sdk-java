// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.Vendor;
import com.microsoft.graph.requests.VendorCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.VendorCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Vendor Collection Page.
 */
public class VendorCollectionPage extends BaseCollectionPage<Vendor, VendorCollectionRequestBuilder> {

    /**
     * A collection page for Vendor
     *
     * @param response the serialized VendorCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public VendorCollectionPage(@Nonnull final VendorCollectionResponse response, @Nonnull final VendorCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Vendor
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public VendorCollectionPage(@Nonnull final java.util.List<Vendor> pageContents, @Nullable final VendorCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
