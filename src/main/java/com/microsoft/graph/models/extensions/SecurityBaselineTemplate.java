// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.SecurityBaselineStateSummary;
import com.microsoft.graph.models.extensions.SecurityBaselineDeviceState;
import com.microsoft.graph.models.extensions.SecurityBaselineCategoryStateSummary;
import com.microsoft.graph.models.extensions.DeviceManagementTemplate;
import com.microsoft.graph.requests.extensions.SecurityBaselineDeviceStateCollectionResponse;
import com.microsoft.graph.requests.extensions.SecurityBaselineDeviceStateCollectionPage;
import com.microsoft.graph.requests.extensions.SecurityBaselineCategoryStateSummaryCollectionResponse;
import com.microsoft.graph.requests.extensions.SecurityBaselineCategoryStateSummaryCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security Baseline Template.
 */
public class SecurityBaselineTemplate extends DeviceManagementTemplate implements IJsonBackedObject {


    /**
     * The Device State Summary.
     * The security baseline device state summary
     */
    @SerializedName("deviceStateSummary")
    @Expose
    public SecurityBaselineStateSummary deviceStateSummary;

    /**
     * The Device States.
     * The security baseline device states
     */
    public SecurityBaselineDeviceStateCollectionPage deviceStates;

    /**
     * The Category Device State Summaries.
     * The security baseline per category device state summary
     */
    public SecurityBaselineCategoryStateSummaryCollectionPage categoryDeviceStateSummaries;


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


        if (json.has("deviceStates")) {
            final SecurityBaselineDeviceStateCollectionResponse response = new SecurityBaselineDeviceStateCollectionResponse();
            if (json.has("deviceStates@odata.nextLink")) {
                response.nextLink = json.get("deviceStates@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceStates").toString(), JsonObject[].class);
            final SecurityBaselineDeviceState[] array = new SecurityBaselineDeviceState[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), SecurityBaselineDeviceState.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceStates = new SecurityBaselineDeviceStateCollectionPage(response, null);
        }

        if (json.has("categoryDeviceStateSummaries")) {
            final SecurityBaselineCategoryStateSummaryCollectionResponse response = new SecurityBaselineCategoryStateSummaryCollectionResponse();
            if (json.has("categoryDeviceStateSummaries@odata.nextLink")) {
                response.nextLink = json.get("categoryDeviceStateSummaries@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("categoryDeviceStateSummaries").toString(), JsonObject[].class);
            final SecurityBaselineCategoryStateSummary[] array = new SecurityBaselineCategoryStateSummary[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), SecurityBaselineCategoryStateSummary.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            categoryDeviceStateSummaries = new SecurityBaselineCategoryStateSummaryCollectionPage(response, null);
        }
    }
}
