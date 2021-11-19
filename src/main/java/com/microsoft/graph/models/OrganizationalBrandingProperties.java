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
import com.microsoft.graph.models.LoginPageTextVisibilitySettings;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Organizational Branding Properties.
 */
public class OrganizationalBrandingProperties extends Entity implements IJsonBackedObject {


    /**
     * The Background Color.
     * 
     */
    @SerializedName(value = "backgroundColor", alternate = {"BackgroundColor"})
    @Expose
	@Nullable
    public String backgroundColor;

    /**
     * The Background Image Relative Url.
     * 
     */
    @SerializedName(value = "backgroundImageRelativeUrl", alternate = {"BackgroundImageRelativeUrl"})
    @Expose
	@Nullable
    public String backgroundImageRelativeUrl;

    /**
     * The Banner Logo Relative Url.
     * 
     */
    @SerializedName(value = "bannerLogoRelativeUrl", alternate = {"BannerLogoRelativeUrl"})
    @Expose
	@Nullable
    public String bannerLogoRelativeUrl;

    /**
     * The Cdn List.
     * 
     */
    @SerializedName(value = "cdnList", alternate = {"CdnList"})
    @Expose
	@Nullable
    public java.util.List<String> cdnList;

    /**
     * The Custom Account Reset Credentials Url.
     * 
     */
    @SerializedName(value = "customAccountResetCredentialsUrl", alternate = {"CustomAccountResetCredentialsUrl"})
    @Expose
	@Nullable
    public String customAccountResetCredentialsUrl;

    /**
     * The Custom Cannot Access Your Account Text.
     * 
     */
    @SerializedName(value = "customCannotAccessYourAccountText", alternate = {"CustomCannotAccessYourAccountText"})
    @Expose
	@Nullable
    public String customCannotAccessYourAccountText;

    /**
     * The Custom Cannot Access Your Account Url.
     * 
     */
    @SerializedName(value = "customCannotAccessYourAccountUrl", alternate = {"CustomCannotAccessYourAccountUrl"})
    @Expose
	@Nullable
    public String customCannotAccessYourAccountUrl;

    /**
     * The Custom Forgot My Password Text.
     * 
     */
    @SerializedName(value = "customForgotMyPasswordText", alternate = {"CustomForgotMyPasswordText"})
    @Expose
	@Nullable
    public String customForgotMyPasswordText;

    /**
     * The Custom Privacy And Cookies Text.
     * 
     */
    @SerializedName(value = "customPrivacyAndCookiesText", alternate = {"CustomPrivacyAndCookiesText"})
    @Expose
	@Nullable
    public String customPrivacyAndCookiesText;

    /**
     * The Custom Privacy And Cookies Url.
     * 
     */
    @SerializedName(value = "customPrivacyAndCookiesUrl", alternate = {"CustomPrivacyAndCookiesUrl"})
    @Expose
	@Nullable
    public String customPrivacyAndCookiesUrl;

    /**
     * The Custom Reset It Now Text.
     * 
     */
    @SerializedName(value = "customResetItNowText", alternate = {"CustomResetItNowText"})
    @Expose
	@Nullable
    public String customResetItNowText;

    /**
     * The Custom Terms Of Use Text.
     * 
     */
    @SerializedName(value = "customTermsOfUseText", alternate = {"CustomTermsOfUseText"})
    @Expose
	@Nullable
    public String customTermsOfUseText;

    /**
     * The Custom Terms Of Use Url.
     * 
     */
    @SerializedName(value = "customTermsOfUseUrl", alternate = {"CustomTermsOfUseUrl"})
    @Expose
	@Nullable
    public String customTermsOfUseUrl;

    /**
     * The Favicon Relative Url.
     * 
     */
    @SerializedName(value = "faviconRelativeUrl", alternate = {"FaviconRelativeUrl"})
    @Expose
	@Nullable
    public String faviconRelativeUrl;

    /**
     * The Header Background Color.
     * 
     */
    @SerializedName(value = "headerBackgroundColor", alternate = {"HeaderBackgroundColor"})
    @Expose
	@Nullable
    public String headerBackgroundColor;

    /**
     * The Login Page Text Visibility Settings.
     * 
     */
    @SerializedName(value = "loginPageTextVisibilitySettings", alternate = {"LoginPageTextVisibilitySettings"})
    @Expose
	@Nullable
    public LoginPageTextVisibilitySettings loginPageTextVisibilitySettings;

    /**
     * The Sign In Page Text.
     * 
     */
    @SerializedName(value = "signInPageText", alternate = {"SignInPageText"})
    @Expose
	@Nullable
    public String signInPageText;

    /**
     * The Square Logo Relative Url.
     * 
     */
    @SerializedName(value = "squareLogoRelativeUrl", alternate = {"SquareLogoRelativeUrl"})
    @Expose
	@Nullable
    public String squareLogoRelativeUrl;

    /**
     * The Username Hint Text.
     * 
     */
    @SerializedName(value = "usernameHintText", alternate = {"UsernameHintText"})
    @Expose
	@Nullable
    public String usernameHintText;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
