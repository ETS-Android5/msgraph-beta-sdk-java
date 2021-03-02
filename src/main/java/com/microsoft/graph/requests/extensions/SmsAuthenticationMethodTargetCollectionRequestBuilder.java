// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SmsAuthenticationMethodConfiguration;
import com.microsoft.graph.models.extensions.SmsAuthenticationMethodTarget;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ISmsAuthenticationMethodTargetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISmsAuthenticationMethodTargetRequestBuilder;
import com.microsoft.graph.requests.extensions.ISmsAuthenticationMethodTargetCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sms Authentication Method Target Collection Request Builder.
 */
public class SmsAuthenticationMethodTargetCollectionRequestBuilder extends BaseRequestBuilder implements ISmsAuthenticationMethodTargetCollectionRequestBuilder {

    /**
     * The request builder for this collection of SmsAuthenticationMethodConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SmsAuthenticationMethodTargetCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ISmsAuthenticationMethodTargetCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ISmsAuthenticationMethodTargetCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new SmsAuthenticationMethodTargetCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ISmsAuthenticationMethodTargetRequestBuilder byId(final String id) {
        return new SmsAuthenticationMethodTargetRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
