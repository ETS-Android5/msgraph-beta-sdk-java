// Template Source: IBaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyDefinitionValue;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyPresentationValueCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyPresentationValueRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.GroupPolicyDefinitionValue;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Policy Definition Value Reference Request.
 */
public interface IGroupPolicyDefinitionValueReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super GroupPolicyDefinitionValue> callback);

    GroupPolicyDefinitionValue delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IGroupPolicyDefinitionValueReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IGroupPolicyDefinitionValueReferenceRequest expand(final String value);

    /**
     * Puts the GroupPolicyDefinitionValue
     *
     * @param srcGroupPolicyDefinitionValue the GroupPolicyDefinitionValue to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(GroupPolicyDefinitionValue srcGroupPolicyDefinitionValue, final ICallback<? super GroupPolicyDefinitionValue> callback);

    /**
     * Puts the GroupPolicyDefinitionValue
     *
     * @param srcGroupPolicyDefinitionValue the GroupPolicyDefinitionValue to PUT
     * @return the GroupPolicyDefinitionValue
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    GroupPolicyDefinitionValue put(GroupPolicyDefinitionValue srcGroupPolicyDefinitionValue) throws ClientException;
}
