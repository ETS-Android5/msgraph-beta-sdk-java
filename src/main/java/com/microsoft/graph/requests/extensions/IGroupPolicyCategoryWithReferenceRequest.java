// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyCategory;
import com.microsoft.graph.requests.extensions.IGroupPolicyCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionFileRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.GroupPolicyCategory;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Policy Category With Reference Request.
 */
public interface IGroupPolicyCategoryWithReferenceRequest extends IHttpRequest {

    void post(final GroupPolicyCategory newGroupPolicyCategory, final IJsonBackedObject payload, final ICallback<GroupPolicyCategory> callback);

    GroupPolicyCategory post(final GroupPolicyCategory newGroupPolicyCategory, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<GroupPolicyCategory> callback);

    GroupPolicyCategory get() throws ClientException;

	void delete(final ICallback<GroupPolicyCategory> callback);

	void delete() throws ClientException;

	void patch(final GroupPolicyCategory sourceGroupPolicyCategory, final ICallback<GroupPolicyCategory> callback);

	GroupPolicyCategory patch(final GroupPolicyCategory sourceGroupPolicyCategory) throws ClientException;

    IGroupPolicyCategoryWithReferenceRequest select(final String value);

    IGroupPolicyCategoryWithReferenceRequest expand(final String value);

}
