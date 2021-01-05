// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDepOnboardingSettingGenerateEncryptionPublicKeyRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Dep Onboarding Setting Generate Encryption Public Key Request Builder.
 */
public interface IDepOnboardingSettingGenerateEncryptionPublicKeyRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IDepOnboardingSettingGenerateEncryptionPublicKeyRequest
     *
     * @param requestOptions the options for the request
     * @return the IDepOnboardingSettingGenerateEncryptionPublicKeyRequest instance
     */
    IDepOnboardingSettingGenerateEncryptionPublicKeyRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IDepOnboardingSettingGenerateEncryptionPublicKeyRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IDepOnboardingSettingGenerateEncryptionPublicKeyRequest instance
     */
    IDepOnboardingSettingGenerateEncryptionPublicKeyRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
