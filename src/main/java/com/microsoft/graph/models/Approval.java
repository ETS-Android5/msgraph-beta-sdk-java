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
import com.microsoft.graph.models.ApprovalStep;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.ApprovalStepCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Approval.
 */
public class Approval extends Entity implements IJsonBackedObject {


    /**
     * The Steps.
     * 
     */
    @SerializedName(value = "steps", alternate = {"Steps"})
    @Expose
	@Nullable
    public ApprovalStepCollectionPage steps;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("steps")) {
            steps = serializer.deserializeObject(json.get("steps"), ApprovalStepCollectionPage.class);
        }
    }
}
