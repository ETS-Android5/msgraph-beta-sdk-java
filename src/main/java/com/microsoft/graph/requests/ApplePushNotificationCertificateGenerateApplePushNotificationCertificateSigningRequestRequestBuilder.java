// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.ApplePushNotificationCertificateGenerateApplePushNotificationCertificateSigningRequestRequest;
import com.microsoft.graph.models.ApplePushNotificationCertificate;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Apple Push Notification Certificate Generate Apple Push Notification Certificate Signing Request Request Builder.
 */
public class ApplePushNotificationCertificateGenerateApplePushNotificationCertificateSigningRequestRequestBuilder extends BaseActionRequestBuilder<String> {

    /**
     * The request builder for this ApplePushNotificationCertificateGenerateApplePushNotificationCertificateSigningRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ApplePushNotificationCertificateGenerateApplePushNotificationCertificateSigningRequestRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the ApplePushNotificationCertificateGenerateApplePushNotificationCertificateSigningRequestRequest
     *
     * @param requestOptions the options for the request
     * @return the ApplePushNotificationCertificateGenerateApplePushNotificationCertificateSigningRequestRequest instance
     */
    @Nonnull
    public ApplePushNotificationCertificateGenerateApplePushNotificationCertificateSigningRequestRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ApplePushNotificationCertificateGenerateApplePushNotificationCertificateSigningRequestRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ApplePushNotificationCertificateGenerateApplePushNotificationCertificateSigningRequestRequest instance
     */
    @Nonnull
    public ApplePushNotificationCertificateGenerateApplePushNotificationCertificateSigningRequestRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ApplePushNotificationCertificateGenerateApplePushNotificationCertificateSigningRequestRequest request = new ApplePushNotificationCertificateGenerateApplePushNotificationCertificateSigningRequestRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        return request;
    }
}
