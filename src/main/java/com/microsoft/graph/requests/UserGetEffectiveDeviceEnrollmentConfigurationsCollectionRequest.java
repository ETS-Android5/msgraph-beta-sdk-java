// Template Source: BaseMethodCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceEnrollmentConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.UserGetEffectiveDeviceEnrollmentConfigurationsCollectionRequestBuilder;
import com.microsoft.graph.requests.UserGetEffectiveDeviceEnrollmentConfigurationsCollectionResponse;
import com.microsoft.graph.models.DeviceEnrollmentConfiguration;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Get Effective Device Enrollment Configurations Collection Request.
 */
public class UserGetEffectiveDeviceEnrollmentConfigurationsCollectionRequest extends BaseFunctionCollectionRequest<DeviceEnrollmentConfiguration, UserGetEffectiveDeviceEnrollmentConfigurationsCollectionResponse, UserGetEffectiveDeviceEnrollmentConfigurationsCollectionPage> {


    /**
     * The request for this UserGetEffectiveDeviceEnrollmentConfigurations
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserGetEffectiveDeviceEnrollmentConfigurationsCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserGetEffectiveDeviceEnrollmentConfigurationsCollectionResponse.class, UserGetEffectiveDeviceEnrollmentConfigurationsCollectionPage.class, UserGetEffectiveDeviceEnrollmentConfigurationsCollectionRequestBuilder.class);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public UserGetEffectiveDeviceEnrollmentConfigurationsCollectionRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public UserGetEffectiveDeviceEnrollmentConfigurationsCollectionRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public UserGetEffectiveDeviceEnrollmentConfigurationsCollectionRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public UserGetEffectiveDeviceEnrollmentConfigurationsCollectionRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public UserGetEffectiveDeviceEnrollmentConfigurationsCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public UserGetEffectiveDeviceEnrollmentConfigurationsCollectionRequest count() {
        addCountOption(true);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public UserGetEffectiveDeviceEnrollmentConfigurationsCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }
    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    @Nonnull
    public UserGetEffectiveDeviceEnrollmentConfigurationsCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }
    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public UserGetEffectiveDeviceEnrollmentConfigurationsCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }

}
