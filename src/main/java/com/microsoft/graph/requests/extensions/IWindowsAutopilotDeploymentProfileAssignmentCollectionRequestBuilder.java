// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsAutopilotDeploymentProfile;
import com.microsoft.graph.models.extensions.WindowsAutopilotDeploymentProfileAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeploymentProfileAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeploymentProfileAssignmentCollectionRequest;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Autopilot Deployment Profile Assignment Collection Request Builder.
 */
public interface IWindowsAutopilotDeploymentProfileAssignmentCollectionRequestBuilder extends IRequestBuilder {

    IWindowsAutopilotDeploymentProfileAssignmentCollectionRequest buildRequest();

    IWindowsAutopilotDeploymentProfileAssignmentCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IWindowsAutopilotDeploymentProfileAssignmentRequestBuilder byId(final String id);

}
