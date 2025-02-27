// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;
import com.microsoft.graph.security.requests.SensitivityLabelExtractContentLabelRequest;
import com.microsoft.graph.security.models.SensitivityLabel;
import com.microsoft.graph.security.models.ContentInfo;
import com.microsoft.graph.security.models.ContentLabel;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.security.models.SensitivityLabelExtractContentLabelParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sensitivity Label Extract Content Label Request Builder.
 */
public class SensitivityLabelExtractContentLabelRequestBuilder extends BaseActionRequestBuilder<ContentLabel> {

    /**
     * The request builder for this SensitivityLabelExtractContentLabel
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SensitivityLabelExtractContentLabelRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private SensitivityLabelExtractContentLabelParameterSet body;
    /**
     * The request builder for this SensitivityLabelExtractContentLabel
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public SensitivityLabelExtractContentLabelRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final SensitivityLabelExtractContentLabelParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the SensitivityLabelExtractContentLabelRequest
     *
     * @param requestOptions the options for the request
     * @return the SensitivityLabelExtractContentLabelRequest instance
     */
    @Nonnull
    public SensitivityLabelExtractContentLabelRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the SensitivityLabelExtractContentLabelRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the SensitivityLabelExtractContentLabelRequest instance
     */
    @Nonnull
    public SensitivityLabelExtractContentLabelRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final SensitivityLabelExtractContentLabelRequest request = new SensitivityLabelExtractContentLabelRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
