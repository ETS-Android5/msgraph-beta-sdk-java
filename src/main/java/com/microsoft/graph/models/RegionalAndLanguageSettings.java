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
import com.microsoft.graph.models.LocaleInfo;
import com.microsoft.graph.models.RegionalFormatOverrides;
import com.microsoft.graph.models.TranslationPreferences;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Regional And Language Settings.
 */
public class RegionalAndLanguageSettings extends Entity implements IJsonBackedObject {


    /**
     * The Authoring Languages.
     * 
     */
    @SerializedName(value = "authoringLanguages", alternate = {"AuthoringLanguages"})
    @Expose
	@Nullable
    public java.util.List<LocaleInfo> authoringLanguages;

    /**
     * The Default Display Language.
     * 
     */
    @SerializedName(value = "defaultDisplayLanguage", alternate = {"DefaultDisplayLanguage"})
    @Expose
	@Nullable
    public LocaleInfo defaultDisplayLanguage;

    /**
     * The Default Regional Format.
     * 
     */
    @SerializedName(value = "defaultRegionalFormat", alternate = {"DefaultRegionalFormat"})
    @Expose
	@Nullable
    public LocaleInfo defaultRegionalFormat;

    /**
     * The Default Speech Input Language.
     * 
     */
    @SerializedName(value = "defaultSpeechInputLanguage", alternate = {"DefaultSpeechInputLanguage"})
    @Expose
	@Nullable
    public LocaleInfo defaultSpeechInputLanguage;

    /**
     * The Default Translation Language.
     * 
     */
    @SerializedName(value = "defaultTranslationLanguage", alternate = {"DefaultTranslationLanguage"})
    @Expose
	@Nullable
    public LocaleInfo defaultTranslationLanguage;

    /**
     * The Regional Format Overrides.
     * 
     */
    @SerializedName(value = "regionalFormatOverrides", alternate = {"RegionalFormatOverrides"})
    @Expose
	@Nullable
    public RegionalFormatOverrides regionalFormatOverrides;

    /**
     * The Translation Preferences.
     * 
     */
    @SerializedName(value = "translationPreferences", alternate = {"TranslationPreferences"})
    @Expose
	@Nullable
    public TranslationPreferences translationPreferences;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
