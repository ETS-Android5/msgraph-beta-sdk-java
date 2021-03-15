// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ImportedDeviceIdentity;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.ImportedDeviceIdentitySearchExistingIdentitiesCollectionRequestBuilder;
import com.microsoft.graph.requests.ImportedDeviceIdentitySearchExistingIdentitiesCollectionRequest;
import com.microsoft.graph.requests.ImportedDeviceIdentitySearchExistingIdentitiesCollectionResponse;
import com.microsoft.graph.models.ImportedDeviceIdentitySearchExistingIdentitiesParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseActionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Imported Device Identity Search Existing Identities Collection Request Builder.
 */
public class ImportedDeviceIdentitySearchExistingIdentitiesCollectionRequestBuilder extends BaseActionCollectionRequestBuilder<ImportedDeviceIdentity, ImportedDeviceIdentitySearchExistingIdentitiesCollectionRequestBuilder, ImportedDeviceIdentitySearchExistingIdentitiesCollectionResponse, ImportedDeviceIdentitySearchExistingIdentitiesCollectionPage, ImportedDeviceIdentitySearchExistingIdentitiesCollectionRequest> {

    /**
     * The request builder for this collection of ImportedDeviceIdentity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ImportedDeviceIdentitySearchExistingIdentitiesCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ImportedDeviceIdentitySearchExistingIdentitiesCollectionRequestBuilder.class, ImportedDeviceIdentitySearchExistingIdentitiesCollectionRequest.class);
    }
    private ImportedDeviceIdentitySearchExistingIdentitiesParameterSet body;
    /**
     * The request builder for this collection of ImportedDeviceIdentity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ImportedDeviceIdentitySearchExistingIdentitiesCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ImportedDeviceIdentitySearchExistingIdentitiesParameterSet parameters) {
        super(requestUrl, client, requestOptions, ImportedDeviceIdentitySearchExistingIdentitiesCollectionRequestBuilder.class, ImportedDeviceIdentitySearchExistingIdentitiesCollectionRequest.class);
        this.body = parameters;
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ImportedDeviceIdentitySearchExistingIdentitiesCollectionRequest instance
     */
    @Override
    @Nonnull
    public ImportedDeviceIdentitySearchExistingIdentitiesCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ImportedDeviceIdentitySearchExistingIdentitiesCollectionRequest request = super.buildRequest(requestOptions);
            request.body = this.body;
            return request;
    }
}
