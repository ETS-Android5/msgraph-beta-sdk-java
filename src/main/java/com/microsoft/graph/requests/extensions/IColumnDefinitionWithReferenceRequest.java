// Template Source: IBaseEntityWithReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ColumnDefinition;
import com.microsoft.graph.requests.extensions.IColumnDefinitionWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.ColumnDefinition;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Column Definition With Reference Request.
 */
public interface IColumnDefinitionWithReferenceRequest extends IHttpRequest {

    void post(final ColumnDefinition newColumnDefinition, final IJsonBackedObject payload, final ICallback<? super ColumnDefinition> callback);

    ColumnDefinition post(final ColumnDefinition newColumnDefinition, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super ColumnDefinition> callback);

    ColumnDefinition get() throws ClientException;

	void delete(final ICallback<? super ColumnDefinition> callback);

	void delete() throws ClientException;

	void patch(final ColumnDefinition sourceColumnDefinition, final ICallback<? super ColumnDefinition> callback);

	ColumnDefinition patch(final ColumnDefinition sourceColumnDefinition) throws ClientException;

    IColumnDefinitionWithReferenceRequest select(final String value);

    IColumnDefinitionWithReferenceRequest expand(final String value);

}
