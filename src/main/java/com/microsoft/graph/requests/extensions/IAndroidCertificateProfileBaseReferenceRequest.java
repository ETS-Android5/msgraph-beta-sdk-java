// Template Source: IBaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidCertificateProfileBase;
import com.microsoft.graph.requests.extensions.IAndroidTrustedRootCertificateWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.AndroidCertificateProfileBase;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Certificate Profile Base Reference Request.
 */
public interface IAndroidCertificateProfileBaseReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super AndroidCertificateProfileBase> callback);

    AndroidCertificateProfileBase delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidCertificateProfileBaseReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidCertificateProfileBaseReferenceRequest expand(final String value);

    /**
     * Puts the AndroidCertificateProfileBase
     *
     * @param srcAndroidCertificateProfileBase the AndroidCertificateProfileBase to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(AndroidCertificateProfileBase srcAndroidCertificateProfileBase, final ICallback<? super AndroidCertificateProfileBase> callback);

    /**
     * Puts the AndroidCertificateProfileBase
     *
     * @param srcAndroidCertificateProfileBase the AndroidCertificateProfileBase to PUT
     * @return the AndroidCertificateProfileBase
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    AndroidCertificateProfileBase put(AndroidCertificateProfileBase srcAndroidCertificateProfileBase) throws ClientException;
}
