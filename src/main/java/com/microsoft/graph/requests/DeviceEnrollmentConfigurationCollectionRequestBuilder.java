// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceManagement;
import com.microsoft.graph.models.DeviceEnrollmentConfiguration;
import com.microsoft.graph.models.EnrollmentConfigurationAssignment;
import com.microsoft.graph.models.HasPayloadLinkResultItem;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.DeviceEnrollmentConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceEnrollmentConfigurationRequestBuilder;
import com.microsoft.graph.requests.DeviceEnrollmentConfigurationCollectionRequest;
import com.microsoft.graph.requests.DeviceEnrollmentConfigurationHasPayloadLinksCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.DeviceEnrollmentConfigurationAssignParameterSet;
import com.microsoft.graph.models.DeviceEnrollmentConfigurationHasPayloadLinksParameterSet;
import com.microsoft.graph.models.DeviceEnrollmentConfigurationSetPriorityParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Enrollment Configuration Collection Request Builder.
 */
public class DeviceEnrollmentConfigurationCollectionRequestBuilder extends BaseCollectionRequestBuilder<DeviceEnrollmentConfiguration, DeviceEnrollmentConfigurationRequestBuilder, DeviceEnrollmentConfigurationCollectionResponse, DeviceEnrollmentConfigurationCollectionPage, DeviceEnrollmentConfigurationCollectionRequest> {

    /**
     * The request builder for this collection of DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceEnrollmentConfigurationCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceEnrollmentConfigurationRequestBuilder.class, DeviceEnrollmentConfigurationCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceEnrollmentConfigurationHasPayloadLinksCollectionRequestBuilder hasPayloadLinks(@Nonnull final DeviceEnrollmentConfigurationHasPayloadLinksParameterSet parameters) {
        return new DeviceEnrollmentConfigurationHasPayloadLinksCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.hasPayloadLinks"), getClient(), null, parameters);
    }

    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}
