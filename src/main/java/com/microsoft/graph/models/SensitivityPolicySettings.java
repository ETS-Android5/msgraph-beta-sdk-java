// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.SensitivityLabelTarget;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sensitivity Policy Settings.
 */
public class SensitivityPolicySettings extends Entity implements IJsonBackedObject {


    /**
     * The Applicable To.
     * 
     */
    @SerializedName(value = "applicableTo", alternate = {"ApplicableTo"})
    @Expose
	@Nullable
    public EnumSet<SensitivityLabelTarget> applicableTo;

    /**
     * The Downgrade Sensitivity Requires Justification.
     * 
     */
    @SerializedName(value = "downgradeSensitivityRequiresJustification", alternate = {"DowngradeSensitivityRequiresJustification"})
    @Expose
	@Nullable
    public Boolean downgradeSensitivityRequiresJustification;

    /**
     * The Help Web Url.
     * 
     */
    @SerializedName(value = "helpWebUrl", alternate = {"HelpWebUrl"})
    @Expose
	@Nullable
    public String helpWebUrl;

    /**
     * The Is Mandatory.
     * 
     */
    @SerializedName(value = "isMandatory", alternate = {"IsMandatory"})
    @Expose
	@Nullable
    public Boolean isMandatory;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
