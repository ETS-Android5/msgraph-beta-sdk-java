// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.ContentAlignment;
import com.microsoft.graph.models.InformationProtectionAction;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Add Content Header Action.
 */
public class AddContentHeaderAction extends InformationProtectionAction implements IJsonBackedObject {


    /**
     * The Alignment.
     * Possible values are: left, right, center.
     */
    @SerializedName(value = "alignment", alternate = {"Alignment"})
    @Expose
	@Nullable
    public ContentAlignment alignment;

    /**
     * The Font Color.
     * Color of the font to use for the header.
     */
    @SerializedName(value = "fontColor", alternate = {"FontColor"})
    @Expose
	@Nullable
    public String fontColor;

    /**
     * The Font Name.
     * Name of the font to use for the header.
     */
    @SerializedName(value = "fontName", alternate = {"FontName"})
    @Expose
	@Nullable
    public String fontName;

    /**
     * The Font Size.
     * Font size to use for the header.
     */
    @SerializedName(value = "fontSize", alternate = {"FontSize"})
    @Expose
	@Nullable
    public Integer fontSize;

    /**
     * The Margin.
     * The margin of the header from the top of the document.
     */
    @SerializedName(value = "margin", alternate = {"Margin"})
    @Expose
	@Nullable
    public Integer margin;

    /**
     * The Text.
     * The contents of the header itself.
     */
    @SerializedName(value = "text", alternate = {"Text"})
    @Expose
	@Nullable
    public String text;

    /**
     * The Ui Element Name.
     * The name of the UI element where the header should be placed.
     */
    @SerializedName(value = "uiElementName", alternate = {"UiElementName"})
    @Expose
	@Nullable
    public String uiElementName;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
