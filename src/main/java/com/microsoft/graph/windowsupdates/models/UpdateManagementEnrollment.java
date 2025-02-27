// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.windowsupdates.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.windowsupdates.models.UpdateCategory;
import com.microsoft.graph.windowsupdates.models.UpdatableAssetEnrollment;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Update Management Enrollment.
 */
public class UpdateManagementEnrollment extends UpdatableAssetEnrollment implements IJsonBackedObject {


    /**
     * The Update Category.
     * The category of updates that the service manages. Supports a subset of the values for updateCategory. Possible values are: feature, unknownFutureValue.
     */
    @SerializedName(value = "updateCategory", alternate = {"UpdateCategory"})
    @Expose
	@Nullable
    public UpdateCategory updateCategory;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
