// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.AndroidManagedStoreAccountEnterpriseSettingsRequestSignupUrlRequest;
import com.microsoft.graph.models.AndroidManagedStoreAccountEnterpriseSettings;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.AndroidManagedStoreAccountEnterpriseSettingsRequestSignupUrlParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Managed Store Account Enterprise Settings Request Signup Url Request Builder.
 */
public class AndroidManagedStoreAccountEnterpriseSettingsRequestSignupUrlRequestBuilder extends BaseActionRequestBuilder<String> {

    /**
     * The request builder for this AndroidManagedStoreAccountEnterpriseSettingsRequestSignupUrl
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidManagedStoreAccountEnterpriseSettingsRequestSignupUrlRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private AndroidManagedStoreAccountEnterpriseSettingsRequestSignupUrlParameterSet body;
    /**
     * The request builder for this AndroidManagedStoreAccountEnterpriseSettingsRequestSignupUrl
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public AndroidManagedStoreAccountEnterpriseSettingsRequestSignupUrlRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final AndroidManagedStoreAccountEnterpriseSettingsRequestSignupUrlParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the AndroidManagedStoreAccountEnterpriseSettingsRequestSignupUrlRequest
     *
     * @param requestOptions the options for the request
     * @return the AndroidManagedStoreAccountEnterpriseSettingsRequestSignupUrlRequest instance
     */
    @Nonnull
    public AndroidManagedStoreAccountEnterpriseSettingsRequestSignupUrlRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the AndroidManagedStoreAccountEnterpriseSettingsRequestSignupUrlRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the AndroidManagedStoreAccountEnterpriseSettingsRequestSignupUrlRequest instance
     */
    @Nonnull
    public AndroidManagedStoreAccountEnterpriseSettingsRequestSignupUrlRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final AndroidManagedStoreAccountEnterpriseSettingsRequestSignupUrlRequest request = new AndroidManagedStoreAccountEnterpriseSettingsRequestSignupUrlRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
