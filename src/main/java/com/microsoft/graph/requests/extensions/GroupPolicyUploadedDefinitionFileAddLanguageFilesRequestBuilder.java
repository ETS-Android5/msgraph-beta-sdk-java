// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IGroupPolicyUploadedDefinitionFileAddLanguageFilesRequest;
import com.microsoft.graph.requests.extensions.GroupPolicyUploadedDefinitionFileAddLanguageFilesRequest;
import com.microsoft.graph.models.extensions.GroupPolicyUploadedLanguageFile;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Uploaded Definition File Add Language Files Request Builder.
 */
public class GroupPolicyUploadedDefinitionFileAddLanguageFilesRequestBuilder extends BaseActionRequestBuilder implements IGroupPolicyUploadedDefinitionFileAddLanguageFilesRequestBuilder {

    /**
     * The request builder for this GroupPolicyUploadedDefinitionFileAddLanguageFiles
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param groupPolicyUploadedLanguageFiles the groupPolicyUploadedLanguageFiles
     */
    public GroupPolicyUploadedDefinitionFileAddLanguageFilesRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<GroupPolicyUploadedLanguageFile> groupPolicyUploadedLanguageFiles) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("groupPolicyUploadedLanguageFiles", groupPolicyUploadedLanguageFiles);
    }

    /**
     * Creates the IGroupPolicyUploadedDefinitionFileAddLanguageFilesRequest
     *
     * @return the IGroupPolicyUploadedDefinitionFileAddLanguageFilesRequest instance
     */
    public IGroupPolicyUploadedDefinitionFileAddLanguageFilesRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IGroupPolicyUploadedDefinitionFileAddLanguageFilesRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IGroupPolicyUploadedDefinitionFileAddLanguageFilesRequest instance
     */
    public IGroupPolicyUploadedDefinitionFileAddLanguageFilesRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        GroupPolicyUploadedDefinitionFileAddLanguageFilesRequest request = new GroupPolicyUploadedDefinitionFileAddLanguageFilesRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("groupPolicyUploadedLanguageFiles")) {
            request.body.groupPolicyUploadedLanguageFiles = getParameter("groupPolicyUploadedLanguageFiles");
        }

        return request;
    }
}
