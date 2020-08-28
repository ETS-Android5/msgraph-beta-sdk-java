// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IInformationProtectionEvaluateLabelsAndPoliciesRequest;
import com.microsoft.graph.requests.extensions.InformationProtectionEvaluateLabelsAndPoliciesRequest;
import com.microsoft.graph.models.extensions.EvaluateSensitivityLabelsRequest;
import com.microsoft.graph.models.extensions.DlpEvaluatePoliciesRequest;
import com.microsoft.graph.models.extensions.TextClassificationRequest;
import com.microsoft.graph.models.extensions.EvaluateLabelsAndPoliciesJobResponse;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Information Protection Evaluate Labels And Policies Request Builder.
 */
public class InformationProtectionEvaluateLabelsAndPoliciesRequestBuilder extends BaseActionRequestBuilder implements IInformationProtectionEvaluateLabelsAndPoliciesRequestBuilder {

    /**
     * The request builder for this InformationProtectionEvaluateLabelsAndPolicies
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param evaluateSensitivityLabels the evaluateSensitivityLabels
     * @param evaluateDataLossPreventionPolicies the evaluateDataLossPreventionPolicies
     * @param classifyText the classifyText
     */
    public InformationProtectionEvaluateLabelsAndPoliciesRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final EvaluateSensitivityLabelsRequest evaluateSensitivityLabels, final DlpEvaluatePoliciesRequest evaluateDataLossPreventionPolicies, final TextClassificationRequest classifyText) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("evaluateSensitivityLabels", evaluateSensitivityLabels);
        bodyParams.put("evaluateDataLossPreventionPolicies", evaluateDataLossPreventionPolicies);
        bodyParams.put("classifyText", classifyText);
    }

    /**
     * Creates the IInformationProtectionEvaluateLabelsAndPoliciesRequest
     *
     * @return the IInformationProtectionEvaluateLabelsAndPoliciesRequest instance
     */
    public IInformationProtectionEvaluateLabelsAndPoliciesRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IInformationProtectionEvaluateLabelsAndPoliciesRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IInformationProtectionEvaluateLabelsAndPoliciesRequest instance
     */
    public IInformationProtectionEvaluateLabelsAndPoliciesRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        InformationProtectionEvaluateLabelsAndPoliciesRequest request = new InformationProtectionEvaluateLabelsAndPoliciesRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("evaluateSensitivityLabels")) {
            request.body.evaluateSensitivityLabels = getParameter("evaluateSensitivityLabels");
        }

        if (hasParameter("evaluateDataLossPreventionPolicies")) {
            request.body.evaluateDataLossPreventionPolicies = getParameter("evaluateDataLossPreventionPolicies");
        }

        if (hasParameter("classifyText")) {
            request.body.classifyText = getParameter("classifyText");
        }

        return request;
    }
}
