// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsDomainJoinConfiguration;
import com.microsoft.graph.models.extensions.DeviceConfiguration;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import com.microsoft.graph.models.extensions.DeviceConfigurationTargetedUserAndDevice;
import com.microsoft.graph.models.extensions.DeviceConfigurationGroupAssignment;
import com.microsoft.graph.models.extensions.DeviceConfigurationAssignment;
import com.microsoft.graph.models.extensions.WindowsPrivacyDataAccessControlItem;
import com.microsoft.graph.models.extensions.WindowsAssignedAccessProfile;
import com.microsoft.graph.models.extensions.IosAvailableUpdateVersion;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.DeviceConfiguration;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Configuration Collection Reference Request.
 */
public interface IDeviceConfigurationCollectionReferenceRequest {

    void post(final DeviceConfiguration newDeviceConfiguration, final ICallback<DeviceConfiguration> callback);

    DeviceConfiguration post(final DeviceConfiguration newDeviceConfiguration) throws ClientException;

    IDeviceConfigurationCollectionReferenceRequest select(final String value);

    IDeviceConfigurationCollectionReferenceRequest top(final int value);

}
