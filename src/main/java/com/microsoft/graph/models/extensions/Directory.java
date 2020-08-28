// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.FeatureRolloutPolicy;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionResponse;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionPage;
import com.microsoft.graph.requests.extensions.FeatureRolloutPolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.FeatureRolloutPolicyCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory.
 */
public class Directory extends Entity implements IJsonBackedObject {


    /**
     * The Deleted Items.
     * Recently deleted items. Read-only. Nullable.
     */
    public DirectoryObjectCollectionPage deletedItems;

    /**
     * The Feature Rollout Policies.
     * 
     */
    public FeatureRolloutPolicyCollectionPage featureRolloutPolicies;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("deletedItems")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("deletedItems@odata.nextLink")) {
                response.nextLink = json.get("deletedItems@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deletedItems").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deletedItems = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("featureRolloutPolicies")) {
            final FeatureRolloutPolicyCollectionResponse response = new FeatureRolloutPolicyCollectionResponse();
            if (json.has("featureRolloutPolicies@odata.nextLink")) {
                response.nextLink = json.get("featureRolloutPolicies@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("featureRolloutPolicies").toString(), JsonObject[].class);
            final FeatureRolloutPolicy[] array = new FeatureRolloutPolicy[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), FeatureRolloutPolicy.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            featureRolloutPolicies = new FeatureRolloutPolicyCollectionPage(response, null);
        }
    }
}
