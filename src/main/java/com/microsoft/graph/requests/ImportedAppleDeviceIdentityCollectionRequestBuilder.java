// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DepOnboardingSetting;
import com.microsoft.graph.models.ImportedAppleDeviceIdentity;
import com.microsoft.graph.models.ImportedAppleDeviceIdentityResult;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.ImportedAppleDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.ImportedAppleDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.ImportedAppleDeviceIdentityCollectionRequest;
import com.microsoft.graph.requests.ImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.ImportedAppleDeviceIdentityImportAppleDeviceIdentityListParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Imported Apple Device Identity Collection Request Builder.
 */
public class ImportedAppleDeviceIdentityCollectionRequestBuilder extends BaseCollectionRequestBuilder<ImportedAppleDeviceIdentity, ImportedAppleDeviceIdentityRequestBuilder, ImportedAppleDeviceIdentityCollectionResponse, ImportedAppleDeviceIdentityCollectionPage, ImportedAppleDeviceIdentityCollectionRequest> {

    /**
     * The request builder for this collection of DepOnboardingSetting
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ImportedAppleDeviceIdentityCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ImportedAppleDeviceIdentityRequestBuilder.class, ImportedAppleDeviceIdentityCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionRequestBuilder importAppleDeviceIdentityList(@Nonnull final ImportedAppleDeviceIdentityImportAppleDeviceIdentityListParameterSet parameters) {
        return new ImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.importAppleDeviceIdentityList"), getClient(), null, parameters);
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
