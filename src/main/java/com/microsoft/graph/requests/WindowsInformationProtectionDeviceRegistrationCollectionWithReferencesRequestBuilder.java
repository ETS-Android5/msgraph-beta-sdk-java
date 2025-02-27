// Template Source: BaseEntityCollectionWithReferencesRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.User;
import com.microsoft.graph.models.WindowsInformationProtectionDeviceRegistration;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Information Protection Device Registration Collection With References Request Builder.
 */
public class WindowsInformationProtectionDeviceRegistrationCollectionWithReferencesRequestBuilder extends BaseCollectionWithReferencesRequestBuilder<WindowsInformationProtectionDeviceRegistration, WindowsInformationProtectionDeviceRegistrationWithReferenceRequest, WindowsInformationProtectionDeviceRegistrationReferenceRequestBuilder, WindowsInformationProtectionDeviceRegistrationWithReferenceRequestBuilder, WindowsInformationProtectionDeviceRegistrationCollectionResponse, WindowsInformationProtectionDeviceRegistrationCollectionWithReferencesPage, WindowsInformationProtectionDeviceRegistrationCollectionReferenceRequest, WindowsInformationProtectionDeviceRegistrationCollectionReferenceRequestBuilder> {

    /**
     * The request builder for this collection of User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsInformationProtectionDeviceRegistrationCollectionWithReferencesRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsInformationProtectionDeviceRegistrationReferenceRequestBuilder.class, WindowsInformationProtectionDeviceRegistrationCollectionReferenceRequest.class, WindowsInformationProtectionDeviceRegistrationCollectionReferenceRequestBuilder.class);
    }
}
