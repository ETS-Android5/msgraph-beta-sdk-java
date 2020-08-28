// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ImportedWindowsAutopilotDeviceIdentityUpload;
import com.microsoft.graph.models.extensions.ImportedWindowsAutopilotDeviceIdentity;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IImportedWindowsAutopilotDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.IImportedWindowsAutopilotDeviceIdentityCollectionRequest;
import com.microsoft.graph.requests.extensions.IImportedWindowsAutopilotDeviceIdentityImportCollectionRequestBuilder;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Imported Windows Autopilot Device Identity Collection Request Builder.
 */
public interface IImportedWindowsAutopilotDeviceIdentityCollectionRequestBuilder extends IRequestBuilder {

    IImportedWindowsAutopilotDeviceIdentityCollectionRequest buildRequest();

    IImportedWindowsAutopilotDeviceIdentityCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IImportedWindowsAutopilotDeviceIdentityRequestBuilder byId(final String id);


    IImportedWindowsAutopilotDeviceIdentityImportCollectionRequestBuilder msgraphImport(final java.util.List<ImportedWindowsAutopilotDeviceIdentity> importedWindowsAutopilotDeviceIdentities);
}
