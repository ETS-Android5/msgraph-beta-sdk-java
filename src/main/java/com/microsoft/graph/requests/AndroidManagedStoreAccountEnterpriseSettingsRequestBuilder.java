// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AndroidManagedStoreAccountEnterpriseSettings;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.AndroidManagedStoreAccountEnterpriseSettingsApproveAppsParameterSet;
import com.microsoft.graph.models.AndroidManagedStoreAccountEnterpriseSettingsCompleteSignupParameterSet;
import com.microsoft.graph.models.AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenParameterSet;
import com.microsoft.graph.models.AndroidManagedStoreAccountEnterpriseSettingsRequestSignupUrlParameterSet;
import com.microsoft.graph.models.AndroidManagedStoreAccountEnterpriseSettingsSetAndroidDeviceOwnerFullyManagedEnrollmentStateParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Managed Store Account Enterprise Settings Request Builder.
 */
public class AndroidManagedStoreAccountEnterpriseSettingsRequestBuilder extends BaseRequestBuilder<AndroidManagedStoreAccountEnterpriseSettings> {

    /**
     * The request builder for the AndroidManagedStoreAccountEnterpriseSettings
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidManagedStoreAccountEnterpriseSettingsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the AndroidManagedStoreAccountEnterpriseSettingsRequest instance
     */
    @Nonnull
    public AndroidManagedStoreAccountEnterpriseSettingsRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the AndroidManagedStoreAccountEnterpriseSettingsRequest instance
     */
    @Nonnull
    public AndroidManagedStoreAccountEnterpriseSettingsRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.AndroidManagedStoreAccountEnterpriseSettingsRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public AndroidManagedStoreAccountEnterpriseSettingsApproveAppsRequestBuilder approveApps(@Nonnull final AndroidManagedStoreAccountEnterpriseSettingsApproveAppsParameterSet parameters) {
        return new AndroidManagedStoreAccountEnterpriseSettingsApproveAppsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.approveApps"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public AndroidManagedStoreAccountEnterpriseSettingsCompleteSignupRequestBuilder completeSignup(@Nonnull final AndroidManagedStoreAccountEnterpriseSettingsCompleteSignupParameterSet parameters) {
        return new AndroidManagedStoreAccountEnterpriseSettingsCompleteSignupRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.completeSignup"), getClient(), null, parameters);
    }

    /**
     * Generates a web token that is used in an embeddable component.
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequestBuilder createGooglePlayWebToken(@Nonnull final AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenParameterSet parameters) {
        return new AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.createGooglePlayWebToken"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public AndroidManagedStoreAccountEnterpriseSettingsRequestSignupUrlRequestBuilder requestSignupUrl(@Nonnull final AndroidManagedStoreAccountEnterpriseSettingsRequestSignupUrlParameterSet parameters) {
        return new AndroidManagedStoreAccountEnterpriseSettingsRequestSignupUrlRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.requestSignupUrl"), getClient(), null, parameters);
    }

    /**
     * Sets the AndroidManagedStoreAccountEnterpriseSettings AndroidDeviceOwnerFullyManagedEnrollmentEnabled to the given value.
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public AndroidManagedStoreAccountEnterpriseSettingsSetAndroidDeviceOwnerFullyManagedEnrollmentStateRequestBuilder setAndroidDeviceOwnerFullyManagedEnrollmentState(@Nonnull final AndroidManagedStoreAccountEnterpriseSettingsSetAndroidDeviceOwnerFullyManagedEnrollmentStateParameterSet parameters) {
        return new AndroidManagedStoreAccountEnterpriseSettingsSetAndroidDeviceOwnerFullyManagedEnrollmentStateRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.setAndroidDeviceOwnerFullyManagedEnrollmentState"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public AndroidManagedStoreAccountEnterpriseSettingsSyncAppsRequestBuilder syncApps() {
        return new AndroidManagedStoreAccountEnterpriseSettingsSyncAppsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.syncApps"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public AndroidManagedStoreAccountEnterpriseSettingsUnbindRequestBuilder unbind() {
        return new AndroidManagedStoreAccountEnterpriseSettingsUnbindRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.unbind"), getClient(), null);
    }
}
