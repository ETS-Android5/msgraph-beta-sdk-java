// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.AdvancedThreatProtectionOnboardingDeviceSettingState;
import com.microsoft.graph.requests.AdvancedThreatProtectionOnboardingDeviceSettingStateCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.AdvancedThreatProtectionOnboardingDeviceSettingStateCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Advanced Threat Protection Onboarding Device Setting State Collection Page.
 */
public class AdvancedThreatProtectionOnboardingDeviceSettingStateCollectionPage extends BaseCollectionPage<AdvancedThreatProtectionOnboardingDeviceSettingState, AdvancedThreatProtectionOnboardingDeviceSettingStateCollectionRequestBuilder> {

    /**
     * A collection page for AdvancedThreatProtectionOnboardingDeviceSettingState
     *
     * @param response the serialized AdvancedThreatProtectionOnboardingDeviceSettingStateCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AdvancedThreatProtectionOnboardingDeviceSettingStateCollectionPage(@Nonnull final AdvancedThreatProtectionOnboardingDeviceSettingStateCollectionResponse response, @Nonnull final AdvancedThreatProtectionOnboardingDeviceSettingStateCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for AdvancedThreatProtectionOnboardingDeviceSettingState
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public AdvancedThreatProtectionOnboardingDeviceSettingStateCollectionPage(@Nonnull final java.util.List<AdvancedThreatProtectionOnboardingDeviceSettingState> pageContents, @Nullable final AdvancedThreatProtectionOnboardingDeviceSettingStateCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
