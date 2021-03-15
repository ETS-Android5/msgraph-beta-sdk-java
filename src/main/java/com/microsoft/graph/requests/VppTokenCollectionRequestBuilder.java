// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceAppManagement;
import com.microsoft.graph.models.VppToken;
import com.microsoft.graph.models.VppTokenLicenseSummary;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.VppTokenCollectionRequestBuilder;
import com.microsoft.graph.requests.VppTokenRequestBuilder;
import com.microsoft.graph.requests.VppTokenCollectionRequest;
import com.microsoft.graph.requests.VppTokenSyncLicenseCountsRequestBuilder;
import com.microsoft.graph.requests.VppTokenGetLicensesForAppCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.VppTokenRevokeLicensesParameterSet;
import com.microsoft.graph.models.VppTokenGetLicensesForAppParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Vpp Token Collection Request Builder.
 */
public class VppTokenCollectionRequestBuilder extends BaseCollectionRequestBuilder<VppToken, VppTokenRequestBuilder, VppTokenCollectionResponse, VppTokenCollectionPage, VppTokenCollectionRequest> {

    /**
     * The request builder for this collection of DeviceAppManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public VppTokenCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, VppTokenRequestBuilder.class, VppTokenCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public VppTokenSyncLicenseCountsRequestBuilder syncLicenseCounts() {
        return new VppTokenSyncLicenseCountsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.syncLicenseCounts"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public VppTokenGetLicensesForAppCollectionRequestBuilder getLicensesForApp(@Nonnull final VppTokenGetLicensesForAppParameterSet parameters) {
        return new VppTokenGetLicensesForAppCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getLicensesForApp"), getClient(), null, parameters);
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
