// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyDefinitionFile;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.GroupPolicyDefinitionFile;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Policy Definition File With Reference Request.
 */
public interface IGroupPolicyDefinitionFileWithReferenceRequest extends IHttpRequest {

    void post(final GroupPolicyDefinitionFile newGroupPolicyDefinitionFile, final IJsonBackedObject payload, final ICallback<GroupPolicyDefinitionFile> callback);

    GroupPolicyDefinitionFile post(final GroupPolicyDefinitionFile newGroupPolicyDefinitionFile, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<GroupPolicyDefinitionFile> callback);

    GroupPolicyDefinitionFile get() throws ClientException;

	void delete(final ICallback<GroupPolicyDefinitionFile> callback);

	void delete() throws ClientException;

	void patch(final GroupPolicyDefinitionFile sourceGroupPolicyDefinitionFile, final ICallback<GroupPolicyDefinitionFile> callback);

	GroupPolicyDefinitionFile patch(final GroupPolicyDefinitionFile sourceGroupPolicyDefinitionFile) throws ClientException;

    IGroupPolicyDefinitionFileWithReferenceRequest select(final String value);

    IGroupPolicyDefinitionFileWithReferenceRequest expand(final String value);

}
