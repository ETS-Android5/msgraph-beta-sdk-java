// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.AuthenticationContextClassReference;
import com.microsoft.graph.models.NamedLocation;
import com.microsoft.graph.models.ConditionalAccessPolicy;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.AuthenticationContextClassReferenceCollectionPage;
import com.microsoft.graph.requests.NamedLocationCollectionPage;
import com.microsoft.graph.requests.ConditionalAccessPolicyCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conditional Access Root.
 */
public class ConditionalAccessRoot extends Entity implements IJsonBackedObject {


    /**
     * The Authentication Context Class References.
     * 
     */
    @SerializedName(value = "authenticationContextClassReferences", alternate = {"AuthenticationContextClassReferences"})
    @Expose
	@Nullable
    public AuthenticationContextClassReferenceCollectionPage authenticationContextClassReferences;

    /**
     * The Named Locations.
     * 
     */
    @SerializedName(value = "namedLocations", alternate = {"NamedLocations"})
    @Expose
	@Nullable
    public NamedLocationCollectionPage namedLocations;

    /**
     * The Policies.
     * 
     */
    @SerializedName(value = "policies", alternate = {"Policies"})
    @Expose
	@Nullable
    public ConditionalAccessPolicyCollectionPage policies;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("authenticationContextClassReferences")) {
            authenticationContextClassReferences = serializer.deserializeObject(json.get("authenticationContextClassReferences"), AuthenticationContextClassReferenceCollectionPage.class);
        }

        if (json.has("namedLocations")) {
            namedLocations = serializer.deserializeObject(json.get("namedLocations"), NamedLocationCollectionPage.class);
        }

        if (json.has("policies")) {
            policies = serializer.deserializeObject(json.get("policies"), ConditionalAccessPolicyCollectionPage.class);
        }
    }
}
