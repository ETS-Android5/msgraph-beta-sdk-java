// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationSchool;
import com.microsoft.graph.requests.extensions.IEducationClassCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationClassRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationClassCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationClassRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationUserRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationUserRequestBuilder;
import com.microsoft.graph.requests.extensions.IAdministrativeUnitRequestBuilder;
import com.microsoft.graph.requests.extensions.AdministrativeUnitRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education School Reference Request.
 */
public class EducationSchoolReferenceRequest extends BaseRequest implements IEducationSchoolReferenceRequest {

    /**
     * The request for the EducationSchool
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationSchoolReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationSchool.class);
    }

    public void delete(final ICallback<EducationSchool> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public EducationSchool delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IEducationSchoolReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (EducationSchoolReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IEducationSchoolReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (EducationSchoolReferenceRequest)this;
    }
    /**
     * Puts the EducationSchool
     *
     * @param srcEducationSchool the EducationSchool reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(EducationSchool srcEducationSchool, final ICallback<EducationSchool> callback) {
        send(HttpMethod.PUT, callback, srcEducationSchool);
    }

    /**
     * Puts the EducationSchool
     *
     * @param srcEducationSchool the EducationSchool reference to PUT
     * @return the EducationSchool
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public EducationSchool put(EducationSchool srcEducationSchool) throws ClientException {
        return send(HttpMethod.PUT, srcEducationSchool);
    }
}
