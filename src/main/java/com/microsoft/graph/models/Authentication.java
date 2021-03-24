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
import com.microsoft.graph.models.EmailAuthenticationMethod;
import com.microsoft.graph.models.Fido2AuthenticationMethod;
import com.microsoft.graph.models.AuthenticationMethod;
import com.microsoft.graph.models.MicrosoftAuthenticatorAuthenticationMethod;
import com.microsoft.graph.models.LongRunningOperation;
import com.microsoft.graph.models.PasswordlessMicrosoftAuthenticatorAuthenticationMethod;
import com.microsoft.graph.models.PasswordAuthenticationMethod;
import com.microsoft.graph.models.PhoneAuthenticationMethod;
import com.microsoft.graph.models.TemporaryAccessPassAuthenticationMethod;
import com.microsoft.graph.models.WindowsHelloForBusinessAuthenticationMethod;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.EmailAuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.Fido2AuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.AuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.MicrosoftAuthenticatorAuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.LongRunningOperationCollectionPage;
import com.microsoft.graph.requests.PasswordlessMicrosoftAuthenticatorAuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.PasswordAuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.PhoneAuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.TemporaryAccessPassAuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.WindowsHelloForBusinessAuthenticationMethodCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authentication.
 */
public class Authentication extends Entity implements IJsonBackedObject {


    /**
     * The Email Methods.
     * 
     */
    @SerializedName(value = "emailMethods", alternate = {"EmailMethods"})
    @Expose
	@Nullable
    public EmailAuthenticationMethodCollectionPage emailMethods;

    /**
     * The Fido2Methods.
     * 
     */
    @SerializedName(value = "fido2Methods", alternate = {"Fido2Methods"})
    @Expose
	@Nullable
    public Fido2AuthenticationMethodCollectionPage fido2Methods;

    /**
     * The Methods.
     * 
     */
    @SerializedName(value = "methods", alternate = {"Methods"})
    @Expose
	@Nullable
    public AuthenticationMethodCollectionPage methods;

    /**
     * The Microsoft Authenticator Methods.
     * 
     */
    @SerializedName(value = "microsoftAuthenticatorMethods", alternate = {"MicrosoftAuthenticatorMethods"})
    @Expose
	@Nullable
    public MicrosoftAuthenticatorAuthenticationMethodCollectionPage microsoftAuthenticatorMethods;

    /**
     * The Operations.
     * 
     */
    @SerializedName(value = "operations", alternate = {"Operations"})
    @Expose
	@Nullable
    public LongRunningOperationCollectionPage operations;

    /**
     * The Passwordless Microsoft Authenticator Methods.
     * 
     */
    @SerializedName(value = "passwordlessMicrosoftAuthenticatorMethods", alternate = {"PasswordlessMicrosoftAuthenticatorMethods"})
    @Expose
	@Nullable
    public PasswordlessMicrosoftAuthenticatorAuthenticationMethodCollectionPage passwordlessMicrosoftAuthenticatorMethods;

    /**
     * The Password Methods.
     * 
     */
    @SerializedName(value = "passwordMethods", alternate = {"PasswordMethods"})
    @Expose
	@Nullable
    public PasswordAuthenticationMethodCollectionPage passwordMethods;

    /**
     * The Phone Methods.
     * 
     */
    @SerializedName(value = "phoneMethods", alternate = {"PhoneMethods"})
    @Expose
	@Nullable
    public PhoneAuthenticationMethodCollectionPage phoneMethods;

    /**
     * The Temporary Access Pass Methods.
     * 
     */
    @SerializedName(value = "temporaryAccessPassMethods", alternate = {"TemporaryAccessPassMethods"})
    @Expose
	@Nullable
    public TemporaryAccessPassAuthenticationMethodCollectionPage temporaryAccessPassMethods;

    /**
     * The Windows Hello For Business Methods.
     * 
     */
    @SerializedName(value = "windowsHelloForBusinessMethods", alternate = {"WindowsHelloForBusinessMethods"})
    @Expose
	@Nullable
    public WindowsHelloForBusinessAuthenticationMethodCollectionPage windowsHelloForBusinessMethods;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("emailMethods")) {
            emailMethods = serializer.deserializeObject(json.get("emailMethods"), EmailAuthenticationMethodCollectionPage.class);
        }

        if (json.has("fido2Methods")) {
            fido2Methods = serializer.deserializeObject(json.get("fido2Methods"), Fido2AuthenticationMethodCollectionPage.class);
        }

        if (json.has("methods")) {
            methods = serializer.deserializeObject(json.get("methods"), AuthenticationMethodCollectionPage.class);
        }

        if (json.has("microsoftAuthenticatorMethods")) {
            microsoftAuthenticatorMethods = serializer.deserializeObject(json.get("microsoftAuthenticatorMethods"), MicrosoftAuthenticatorAuthenticationMethodCollectionPage.class);
        }

        if (json.has("operations")) {
            operations = serializer.deserializeObject(json.get("operations"), LongRunningOperationCollectionPage.class);
        }

        if (json.has("passwordlessMicrosoftAuthenticatorMethods")) {
            passwordlessMicrosoftAuthenticatorMethods = serializer.deserializeObject(json.get("passwordlessMicrosoftAuthenticatorMethods"), PasswordlessMicrosoftAuthenticatorAuthenticationMethodCollectionPage.class);
        }

        if (json.has("passwordMethods")) {
            passwordMethods = serializer.deserializeObject(json.get("passwordMethods"), PasswordAuthenticationMethodCollectionPage.class);
        }

        if (json.has("phoneMethods")) {
            phoneMethods = serializer.deserializeObject(json.get("phoneMethods"), PhoneAuthenticationMethodCollectionPage.class);
        }

        if (json.has("temporaryAccessPassMethods")) {
            temporaryAccessPassMethods = serializer.deserializeObject(json.get("temporaryAccessPassMethods"), TemporaryAccessPassAuthenticationMethodCollectionPage.class);
        }

        if (json.has("windowsHelloForBusinessMethods")) {
            windowsHelloForBusinessMethods = serializer.deserializeObject(json.get("windowsHelloForBusinessMethods"), WindowsHelloForBusinessAuthenticationMethodCollectionPage.class);
        }
    }
}
