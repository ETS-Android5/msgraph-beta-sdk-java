// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.IntuneBrandingProfile;
import com.microsoft.graph.models.extensions.IntuneBrandingProfileAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IIntuneBrandingProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IIntuneBrandingProfileCollectionRequest;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Intune Branding Profile Collection Request Builder.
 */
public interface IIntuneBrandingProfileCollectionRequestBuilder extends IRequestBuilder {

    IIntuneBrandingProfileCollectionRequest buildRequest();

    IIntuneBrandingProfileCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IIntuneBrandingProfileRequestBuilder byId(final String id);

}
