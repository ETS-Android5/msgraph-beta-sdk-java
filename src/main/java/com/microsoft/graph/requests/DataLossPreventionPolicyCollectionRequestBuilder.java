// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.InformationProtection;
import com.microsoft.graph.models.DataLossPreventionPolicy;
import com.microsoft.graph.models.DlpEvaluationInput;
import com.microsoft.graph.models.DlpNotification;
import com.microsoft.graph.models.DlpEvaluatePoliciesJobResponse;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.DataLossPreventionPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.DataLossPreventionPolicyRequestBuilder;
import com.microsoft.graph.requests.DataLossPreventionPolicyCollectionRequest;
import com.microsoft.graph.requests.DataLossPreventionPolicyEvaluateRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.DataLossPreventionPolicyEvaluateParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Data Loss Prevention Policy Collection Request Builder.
 */
public class DataLossPreventionPolicyCollectionRequestBuilder extends BaseCollectionRequestBuilder<DataLossPreventionPolicy, DataLossPreventionPolicyRequestBuilder, DataLossPreventionPolicyCollectionResponse, DataLossPreventionPolicyCollectionPage, DataLossPreventionPolicyCollectionRequest> {

    /**
     * The request builder for this collection of InformationProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DataLossPreventionPolicyCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DataLossPreventionPolicyRequestBuilder.class, DataLossPreventionPolicyCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DataLossPreventionPolicyEvaluateRequestBuilder evaluate(@Nonnull final DataLossPreventionPolicyEvaluateParameterSet parameters) {
        return new DataLossPreventionPolicyEvaluateRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.evaluate"), getClient(), null, parameters);
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
