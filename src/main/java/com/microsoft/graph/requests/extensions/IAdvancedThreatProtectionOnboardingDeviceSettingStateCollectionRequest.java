// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AdvancedThreatProtectionOnboardingStateSummary;
import com.microsoft.graph.models.extensions.AdvancedThreatProtectionOnboardingDeviceSettingState;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Advanced Threat Protection Onboarding Device Setting State Collection Request.
 */
public interface IAdvancedThreatProtectionOnboardingDeviceSettingStateCollectionRequest {

    void get(final ICallback<IAdvancedThreatProtectionOnboardingDeviceSettingStateCollectionPage> callback);

    IAdvancedThreatProtectionOnboardingDeviceSettingStateCollectionPage get() throws ClientException;

    void post(final AdvancedThreatProtectionOnboardingDeviceSettingState newAdvancedThreatProtectionOnboardingDeviceSettingState, final ICallback<AdvancedThreatProtectionOnboardingDeviceSettingState> callback);

    AdvancedThreatProtectionOnboardingDeviceSettingState post(final AdvancedThreatProtectionOnboardingDeviceSettingState newAdvancedThreatProtectionOnboardingDeviceSettingState) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAdvancedThreatProtectionOnboardingDeviceSettingStateCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAdvancedThreatProtectionOnboardingDeviceSettingStateCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IAdvancedThreatProtectionOnboardingDeviceSettingStateCollectionRequest top(final int value);

}
