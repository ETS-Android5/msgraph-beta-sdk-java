// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.DeviceShellScript;
import com.microsoft.graph.models.extensions.DeviceManagementScriptGroupAssignment;
import com.microsoft.graph.models.extensions.DeviceManagementScriptAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDeviceShellScriptRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceShellScriptCollectionRequest;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Shell Script Collection Request Builder.
 */
public interface IDeviceShellScriptCollectionRequestBuilder extends IRequestBuilder {

    IDeviceShellScriptCollectionRequest buildRequest();

    IDeviceShellScriptCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IDeviceShellScriptRequestBuilder byId(final String id);

}
