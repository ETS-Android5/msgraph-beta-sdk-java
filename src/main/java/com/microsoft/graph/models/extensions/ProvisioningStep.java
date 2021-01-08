// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DetailsInfo;
import com.microsoft.graph.models.generated.ProvisioningStepType;
import com.microsoft.graph.models.generated.ProvisioningResult;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Provisioning Step.
 */
public class ProvisioningStep implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Description.
     * Summary of what occurred during the step.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Details.
     * Details of what occurred during the step.
     */
    @SerializedName(value = "details", alternate = {"Details"})
    @Expose
    public DetailsInfo details;

    /**
     * The Name.
     * Name of the step.
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
    public String name;

    /**
     * The Provisioning Step Type.
     * Type of step. Possible values are: import, scoping, matching, processing, referenceResolution, export, unknownFutureValue.
     */
    @SerializedName(value = "provisioningStepType", alternate = {"ProvisioningStepType"})
    @Expose
    public ProvisioningStepType provisioningStepType;

    /**
     * The Status.
     * Status of the step. Possible values are: success, warning,  failure, skipped, unknownFutureValue.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
    public ProvisioningResult status;


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

    }
}
