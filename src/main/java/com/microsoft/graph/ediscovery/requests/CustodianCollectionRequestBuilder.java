// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.ediscovery.models.Case;
import com.microsoft.graph.ediscovery.models.Custodian;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.ediscovery.requests.CustodianCollectionRequestBuilder;
import com.microsoft.graph.ediscovery.requests.CustodianRequestBuilder;
import com.microsoft.graph.ediscovery.requests.CustodianCollectionRequest;
import com.microsoft.graph.ediscovery.requests.CustodianApplyHoldRequestBuilder;
import com.microsoft.graph.ediscovery.requests.CustodianRemoveHoldRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.ediscovery.models.CustodianApplyHoldParameterSet;
import com.microsoft.graph.ediscovery.models.CustodianRemoveHoldParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Custodian Collection Request Builder.
 */
public class CustodianCollectionRequestBuilder extends BaseCollectionRequestBuilder<Custodian, CustodianRequestBuilder, CustodianCollectionResponse, CustodianCollectionPage, CustodianCollectionRequest> {

    /**
     * The request builder for this collection of Case
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CustodianCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CustodianRequestBuilder.class, CustodianCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public CustodianApplyHoldRequestBuilder applyHold(@Nonnull final CustodianApplyHoldParameterSet parameters) {
        return new CustodianApplyHoldRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.ediscovery.applyHold"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public CustodianRemoveHoldRequestBuilder removeHold(@Nonnull final CustodianRemoveHoldParameterSet parameters) {
        return new CustodianRemoveHoldRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.ediscovery.removeHold"), getClient(), null, parameters);
    }

    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}
