// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.UserSettings;
import com.microsoft.graph.requests.UserInsightsSettingsRequestBuilder;
import com.microsoft.graph.requests.ContactMergeSuggestionsRequestBuilder;
import com.microsoft.graph.requests.RegionalAndLanguageSettingsRequestBuilder;
import com.microsoft.graph.requests.ShiftPreferencesRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Settings Request Builder.
 */
public class UserSettingsRequestBuilder extends BaseRequestBuilder<UserSettings> {

    /**
     * The request builder for the UserSettings
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserSettingsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the UserSettingsRequest instance
     */
    @Nonnull
    public UserSettingsRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the UserSettingsRequest instance
     */
    @Nonnull
    public UserSettingsRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.UserSettingsRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for UserInsightsSettings
     *
     * @return the UserInsightsSettingsRequestBuilder instance
     */
    @Nonnull
    public UserInsightsSettingsRequestBuilder itemInsights() {
        return new UserInsightsSettingsRequestBuilder(getRequestUrlWithAdditionalSegment("itemInsights"), getClient(), null);
    }

    /**
     * Gets the request builder for ContactMergeSuggestions
     *
     * @return the ContactMergeSuggestionsRequestBuilder instance
     */
    @Nonnull
    public ContactMergeSuggestionsRequestBuilder contactMergeSuggestions() {
        return new ContactMergeSuggestionsRequestBuilder(getRequestUrlWithAdditionalSegment("contactMergeSuggestions"), getClient(), null);
    }

    /**
     * Gets the request builder for RegionalAndLanguageSettings
     *
     * @return the RegionalAndLanguageSettingsRequestBuilder instance
     */
    @Nonnull
    public RegionalAndLanguageSettingsRequestBuilder regionalAndLanguageSettings() {
        return new RegionalAndLanguageSettingsRequestBuilder(getRequestUrlWithAdditionalSegment("regionalAndLanguageSettings"), getClient(), null);
    }

    /**
     * Gets the request builder for ShiftPreferences
     *
     * @return the ShiftPreferencesRequestBuilder instance
     */
    @Nonnull
    public ShiftPreferencesRequestBuilder shiftPreferences() {
        return new ShiftPreferencesRequestBuilder(getRequestUrlWithAdditionalSegment("shiftPreferences"), getClient(), null);
    }
}
