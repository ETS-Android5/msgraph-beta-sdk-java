// Template Source: BaseEntityCollectionResponse.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.FeatureRolloutPolicy;

import com.microsoft.graph.http.BaseCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Feature Rollout Policy Collection Response.
 * @deprecated Feature Rollout Policies have been grouped with other policies under /policies. The existing /directory/featureRolloutPolicies is deprecated and will stop returning data on 06/30/2021. Please use /policies/featureRolloutPolicies.
 */
@Deprecated
public class FeatureRolloutPolicyCollectionResponse extends BaseCollectionResponse<FeatureRolloutPolicy> {

}
