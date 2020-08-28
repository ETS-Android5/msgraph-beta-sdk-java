// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.SecurityBaselineSettingState;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.SecurityBaselineSettingStateCollectionResponse;
import com.microsoft.graph.requests.extensions.SecurityBaselineSettingStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security Baseline State.
 */
public class SecurityBaselineState extends Entity implements IJsonBackedObject {


    /**
     * The Security Baseline Template Id.
     * The security baseline template id
     */
    @SerializedName("securityBaselineTemplateId")
    @Expose
    public String securityBaselineTemplateId;

    /**
     * The Display Name.
     * The display name of the security baseline
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Setting States.
     * The security baseline state for different settings for a device
     */
    public SecurityBaselineSettingStateCollectionPage settingStates;


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


        if (json.has("settingStates")) {
            final SecurityBaselineSettingStateCollectionResponse response = new SecurityBaselineSettingStateCollectionResponse();
            if (json.has("settingStates@odata.nextLink")) {
                response.nextLink = json.get("settingStates@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("settingStates").toString(), JsonObject[].class);
            final SecurityBaselineSettingState[] array = new SecurityBaselineSettingState[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), SecurityBaselineSettingState.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            settingStates = new SecurityBaselineSettingStateCollectionPage(response, null);
        }
    }
}
