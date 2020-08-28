// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Directory;
import com.microsoft.graph.models.extensions.FeatureRolloutPolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IFeatureRolloutPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IFeatureRolloutPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IFeatureRolloutPolicyCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Feature Rollout Policy Collection Request Builder.
 */
public class FeatureRolloutPolicyCollectionRequestBuilder extends BaseRequestBuilder implements IFeatureRolloutPolicyCollectionRequestBuilder {

    /**
     * The request builder for this collection of Directory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public FeatureRolloutPolicyCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IFeatureRolloutPolicyCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IFeatureRolloutPolicyCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new FeatureRolloutPolicyCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IFeatureRolloutPolicyRequestBuilder byId(final String id) {
        return new FeatureRolloutPolicyRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
