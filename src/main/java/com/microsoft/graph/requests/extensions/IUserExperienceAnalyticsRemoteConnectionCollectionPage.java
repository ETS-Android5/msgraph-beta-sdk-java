// Template Source: IBaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsRemoteConnection;
import com.microsoft.graph.models.generated.UserExperienceAnalyticsSummarizedBy;
import java.util.Arrays;
import java.util.EnumSet;

import com.google.gson.JsonObject;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsRemoteConnectionCollectionRequestBuilder;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Experience Analytics Remote Connection Collection Page.
 */
public interface IUserExperienceAnalyticsRemoteConnectionCollectionPage extends IBaseCollectionPage<UserExperienceAnalyticsRemoteConnection, IUserExperienceAnalyticsRemoteConnectionCollectionRequestBuilder> {
}
