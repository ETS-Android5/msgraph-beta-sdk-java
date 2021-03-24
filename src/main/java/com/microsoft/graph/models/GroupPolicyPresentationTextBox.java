// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.GroupPolicyPresentation;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Presentation Text Box.
 */
public class GroupPolicyPresentationTextBox extends GroupPolicyPresentation implements IJsonBackedObject {


    /**
     * The Default Value.
     * Localized default string displayed in the text box. The default value is empty.
     */
    @SerializedName(value = "defaultValue", alternate = {"DefaultValue"})
    @Expose
	@Nullable
    public String defaultValue;

    /**
     * The Max Length.
     * An unsigned integer that specifies the maximum number of text characters. Default value is 1023.
     */
    @SerializedName(value = "maxLength", alternate = {"MaxLength"})
    @Expose
	@Nullable
    public Long maxLength;

    /**
     * The Required.
     * Requirement to enter a value in the text box. Default value is false.
     */
    @SerializedName(value = "required", alternate = {"Required"})
    @Expose
	@Nullable
    public Boolean required;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
