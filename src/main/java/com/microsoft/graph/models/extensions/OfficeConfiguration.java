// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.OfficeClientCheckinStatus;
import com.microsoft.graph.models.extensions.OfficeUserCheckinSummary;
import com.microsoft.graph.models.extensions.OfficeClientConfiguration;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.OfficeClientConfigurationCollectionResponse;
import com.microsoft.graph.requests.extensions.OfficeClientConfigurationCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Office Configuration.
 */
public class OfficeConfiguration extends Entity implements IJsonBackedObject {


    /**
     * The Tenant Checkin Statuses.
     * 
     */
    @SerializedName("tenantCheckinStatuses")
    @Expose
    public java.util.List<OfficeClientCheckinStatus> tenantCheckinStatuses;

    /**
     * The Tenant User Checkin Summary.
     * 
     */
    @SerializedName("tenantUserCheckinSummary")
    @Expose
    public OfficeUserCheckinSummary tenantUserCheckinSummary;

    /**
     * The Client Configurations.
     * 
     */
    public OfficeClientConfigurationCollectionPage clientConfigurations;


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


        if (json.has("clientConfigurations")) {
            final OfficeClientConfigurationCollectionResponse response = new OfficeClientConfigurationCollectionResponse();
            if (json.has("clientConfigurations@odata.nextLink")) {
                response.nextLink = json.get("clientConfigurations@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("clientConfigurations").toString(), JsonObject[].class);
            final OfficeClientConfiguration[] array = new OfficeClientConfiguration[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), OfficeClientConfiguration.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            clientConfigurations = new OfficeClientConfigurationCollectionPage(response, null);
        }
    }
}
