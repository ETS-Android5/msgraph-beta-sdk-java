// Template Source: IBaseEntityWithReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsCategory;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsMetricCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsMetricRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.UserExperienceAnalyticsCategory;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Experience Analytics Category With Reference Request.
 */
public interface IUserExperienceAnalyticsCategoryWithReferenceRequest extends IHttpRequest {

    void post(final UserExperienceAnalyticsCategory newUserExperienceAnalyticsCategory, final IJsonBackedObject payload, final ICallback<? super UserExperienceAnalyticsCategory> callback);

    UserExperienceAnalyticsCategory post(final UserExperienceAnalyticsCategory newUserExperienceAnalyticsCategory, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super UserExperienceAnalyticsCategory> callback);

    UserExperienceAnalyticsCategory get() throws ClientException;

	void delete(final ICallback<? super UserExperienceAnalyticsCategory> callback);

	void delete() throws ClientException;

	void patch(final UserExperienceAnalyticsCategory sourceUserExperienceAnalyticsCategory, final ICallback<? super UserExperienceAnalyticsCategory> callback);

	UserExperienceAnalyticsCategory patch(final UserExperienceAnalyticsCategory sourceUserExperienceAnalyticsCategory) throws ClientException;

    IUserExperienceAnalyticsCategoryWithReferenceRequest select(final String value);

    IUserExperienceAnalyticsCategoryWithReferenceRequest expand(final String value);

}
