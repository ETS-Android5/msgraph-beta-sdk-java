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
 * The class for the Group Policy Presentation List Box.
 */
public class GroupPolicyPresentationListBox extends GroupPolicyPresentation implements IJsonBackedObject {


    /**
     * The Explicit Value.
     * If this option is specified true the user must specify the registry subkey value and the registry subkey name. The list box shows two columns, one for the name and one for the data. The default value is false.
     */
    @SerializedName(value = "explicitValue", alternate = {"ExplicitValue"})
    @Expose
	@Nullable
    public Boolean explicitValue;

    /**
     * The Value Prefix.
     * Not yet documented
     */
    @SerializedName(value = "valuePrefix", alternate = {"ValuePrefix"})
    @Expose
	@Nullable
    public String valuePrefix;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
