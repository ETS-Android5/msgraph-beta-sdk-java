// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AgreementFileLocalization;
import com.microsoft.graph.requests.AgreementFileVersionCollectionRequestBuilder;
import com.microsoft.graph.requests.AgreementFileVersionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Agreement File Localization Request Builder.
 */
public class AgreementFileLocalizationRequestBuilder extends BaseRequestBuilder<AgreementFileLocalization> {

    /**
     * The request builder for the AgreementFileLocalization
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AgreementFileLocalizationRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the AgreementFileLocalizationRequest instance
     */
    @Nonnull
    public AgreementFileLocalizationRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the AgreementFileLocalizationRequest instance
     */
    @Nonnull
    public AgreementFileLocalizationRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.AgreementFileLocalizationRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the AgreementFileVersion collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public AgreementFileVersionCollectionRequestBuilder versions() {
        return new AgreementFileVersionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("versions"), getClient(), null);
    }

    /**
     * Gets a request builder for the AgreementFileVersion item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public AgreementFileVersionRequestBuilder versions(@Nonnull final String id) {
        return new AgreementFileVersionRequestBuilder(getRequestUrlWithAdditionalSegment("versions") + "/" + id, getClient(), null);
    }
}
