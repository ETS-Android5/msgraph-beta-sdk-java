// Template Source: IBaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.DeviceEnrollmentConfiguration;
import com.microsoft.graph.models.extensions.EnrollmentConfigurationAssignment;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDeviceEnrollmentConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceEnrollmentConfigurationCollectionRequest;
import com.microsoft.graph.requests.extensions.IDeviceEnrollmentConfigurationHasPayloadLinksCollectionRequestBuilder;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Enrollment Configuration Collection Request Builder.
 */
public interface IDeviceEnrollmentConfigurationCollectionRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IDeviceEnrollmentConfigurationCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IDeviceEnrollmentConfigurationCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IDeviceEnrollmentConfigurationRequestBuilder byId(final String id);


    IDeviceEnrollmentConfigurationHasPayloadLinksCollectionRequestBuilder hasPayloadLinks(final java.util.List<String> payloadIds);
}
