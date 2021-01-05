// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PaymentTerm;
import com.microsoft.graph.requests.extensions.IPaymentTermCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.PaymentTermCollectionPage;
import com.microsoft.graph.requests.extensions.PaymentTermCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Payment Term Collection Page.
 */
public class PaymentTermCollectionPage extends BaseCollectionPage<PaymentTerm, IPaymentTermCollectionRequestBuilder> implements IPaymentTermCollectionPage {

    /**
     * A collection page for PaymentTerm
     *
     * @param response the serialized PaymentTermCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PaymentTermCollectionPage(final PaymentTermCollectionResponse response, final IPaymentTermCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
