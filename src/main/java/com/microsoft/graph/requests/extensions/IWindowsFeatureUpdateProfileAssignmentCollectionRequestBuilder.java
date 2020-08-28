// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsFeatureUpdateProfile;
import com.microsoft.graph.models.extensions.WindowsFeatureUpdateProfileAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IWindowsFeatureUpdateProfileAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsFeatureUpdateProfileAssignmentCollectionRequest;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Feature Update Profile Assignment Collection Request Builder.
 */
public interface IWindowsFeatureUpdateProfileAssignmentCollectionRequestBuilder extends IRequestBuilder {

    IWindowsFeatureUpdateProfileAssignmentCollectionRequest buildRequest();

    IWindowsFeatureUpdateProfileAssignmentCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IWindowsFeatureUpdateProfileAssignmentRequestBuilder byId(final String id);

}
