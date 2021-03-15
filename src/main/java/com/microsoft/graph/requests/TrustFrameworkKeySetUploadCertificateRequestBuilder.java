// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.TrustFrameworkKeySetUploadCertificateRequest;
import com.microsoft.graph.models.TrustFrameworkKeySet;
import com.microsoft.graph.models.TrustFrameworkKey;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.TrustFrameworkKeySetUploadCertificateParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Trust Framework Key Set Upload Certificate Request Builder.
 */
public class TrustFrameworkKeySetUploadCertificateRequestBuilder extends BaseActionRequestBuilder<TrustFrameworkKey> {

    /**
     * The request builder for this TrustFrameworkKeySetUploadCertificate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TrustFrameworkKeySetUploadCertificateRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private TrustFrameworkKeySetUploadCertificateParameterSet body;
    /**
     * The request builder for this TrustFrameworkKeySetUploadCertificate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public TrustFrameworkKeySetUploadCertificateRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final TrustFrameworkKeySetUploadCertificateParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the TrustFrameworkKeySetUploadCertificateRequest
     *
     * @param requestOptions the options for the request
     * @return the TrustFrameworkKeySetUploadCertificateRequest instance
     */
    @Nonnull
    public TrustFrameworkKeySetUploadCertificateRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the TrustFrameworkKeySetUploadCertificateRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the TrustFrameworkKeySetUploadCertificateRequest instance
     */
    @Nonnull
    public TrustFrameworkKeySetUploadCertificateRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final TrustFrameworkKeySetUploadCertificateRequest request = new TrustFrameworkKeySetUploadCertificateRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
