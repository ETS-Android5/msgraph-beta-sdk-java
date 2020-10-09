// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.EmailAuthenticationMethod;
import com.microsoft.graph.models.extensions.Fido2AuthenticationMethod;
import com.microsoft.graph.models.extensions.AuthenticationMethod;
import com.microsoft.graph.models.extensions.MicrosoftAuthenticatorAuthenticationMethod;
import com.microsoft.graph.models.extensions.SoftwareOathAuthenticationMethod;
import com.microsoft.graph.models.extensions.LongRunningOperation;
import com.microsoft.graph.models.extensions.PasswordlessMicrosoftAuthenticatorAuthenticationMethod;
import com.microsoft.graph.models.extensions.PasswordAuthenticationMethod;
import com.microsoft.graph.models.extensions.PhoneAuthenticationMethod;
import com.microsoft.graph.models.extensions.SecurityQuestionAuthenticationMethod;
import com.microsoft.graph.models.extensions.TemporaryAccessPassAuthenticationMethod;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.EmailAuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.extensions.Fido2AuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.extensions.AuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.extensions.MicrosoftAuthenticatorAuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.extensions.SoftwareOathAuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.extensions.LongRunningOperationCollectionPage;
import com.microsoft.graph.requests.extensions.PasswordlessMicrosoftAuthenticatorAuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.extensions.PasswordAuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.extensions.PhoneAuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.extensions.SecurityQuestionAuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.extensions.TemporaryAccessPassAuthenticationMethodCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

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
    public EmailAuthenticationMethodCollectionPage emailMethods;

    /**
     * The Fido2Methods.
     * 
     */
    @SerializedName(value = "fido2Methods", alternate = {"Fido2Methods"})
    @Expose
    public Fido2AuthenticationMethodCollectionPage fido2Methods;

    /**
     * The Methods.
     * 
     */
    @SerializedName(value = "methods", alternate = {"Methods"})
    @Expose
    public AuthenticationMethodCollectionPage methods;

    /**
     * The Microsoft Authenticator Methods.
     * 
     */
    @SerializedName(value = "microsoftAuthenticatorMethods", alternate = {"MicrosoftAuthenticatorMethods"})
    @Expose
    public MicrosoftAuthenticatorAuthenticationMethodCollectionPage microsoftAuthenticatorMethods;

    /**
     * The Oath Methods.
     * 
     */
    @SerializedName(value = "oathMethods", alternate = {"OathMethods"})
    @Expose
    public SoftwareOathAuthenticationMethodCollectionPage oathMethods;

    /**
     * The Operations.
     * 
     */
    @SerializedName(value = "operations", alternate = {"Operations"})
    @Expose
    public LongRunningOperationCollectionPage operations;

    /**
     * The Passwordless Microsoft Authenticator Methods.
     * 
     */
    @SerializedName(value = "passwordlessMicrosoftAuthenticatorMethods", alternate = {"PasswordlessMicrosoftAuthenticatorMethods"})
    @Expose
    public PasswordlessMicrosoftAuthenticatorAuthenticationMethodCollectionPage passwordlessMicrosoftAuthenticatorMethods;

    /**
     * The Password Methods.
     * 
     */
    @SerializedName(value = "passwordMethods", alternate = {"PasswordMethods"})
    @Expose
    public PasswordAuthenticationMethodCollectionPage passwordMethods;

    /**
     * The Phone Methods.
     * 
     */
    @SerializedName(value = "phoneMethods", alternate = {"PhoneMethods"})
    @Expose
    public PhoneAuthenticationMethodCollectionPage phoneMethods;

    /**
     * The Security Question Methods.
     * 
     */
    @SerializedName(value = "securityQuestionMethods", alternate = {"SecurityQuestionMethods"})
    @Expose
    public SecurityQuestionAuthenticationMethodCollectionPage securityQuestionMethods;

    /**
     * The Temporary Access Pass Methods.
     * 
     */
    @SerializedName(value = "temporaryAccessPassMethods", alternate = {"TemporaryAccessPassMethods"})
    @Expose
    public TemporaryAccessPassAuthenticationMethodCollectionPage temporaryAccessPassMethods;


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


        if (json.has("emailMethods")) {
            emailMethods = serializer.deserializeObject(json.get("emailMethods").toString(), EmailAuthenticationMethodCollectionPage.class);
        }

        if (json.has("fido2Methods")) {
            fido2Methods = serializer.deserializeObject(json.get("fido2Methods").toString(), Fido2AuthenticationMethodCollectionPage.class);
        }

        if (json.has("methods")) {
            methods = serializer.deserializeObject(json.get("methods").toString(), AuthenticationMethodCollectionPage.class);
        }

        if (json.has("microsoftAuthenticatorMethods")) {
            microsoftAuthenticatorMethods = serializer.deserializeObject(json.get("microsoftAuthenticatorMethods").toString(), MicrosoftAuthenticatorAuthenticationMethodCollectionPage.class);
        }

        if (json.has("oathMethods")) {
            oathMethods = serializer.deserializeObject(json.get("oathMethods").toString(), SoftwareOathAuthenticationMethodCollectionPage.class);
        }

        if (json.has("operations")) {
            operations = serializer.deserializeObject(json.get("operations").toString(), LongRunningOperationCollectionPage.class);
        }

        if (json.has("passwordlessMicrosoftAuthenticatorMethods")) {
            passwordlessMicrosoftAuthenticatorMethods = serializer.deserializeObject(json.get("passwordlessMicrosoftAuthenticatorMethods").toString(), PasswordlessMicrosoftAuthenticatorAuthenticationMethodCollectionPage.class);
        }

        if (json.has("passwordMethods")) {
            passwordMethods = serializer.deserializeObject(json.get("passwordMethods").toString(), PasswordAuthenticationMethodCollectionPage.class);
        }

        if (json.has("phoneMethods")) {
            phoneMethods = serializer.deserializeObject(json.get("phoneMethods").toString(), PhoneAuthenticationMethodCollectionPage.class);
        }

        if (json.has("securityQuestionMethods")) {
            securityQuestionMethods = serializer.deserializeObject(json.get("securityQuestionMethods").toString(), SecurityQuestionAuthenticationMethodCollectionPage.class);
        }

        if (json.has("temporaryAccessPassMethods")) {
            temporaryAccessPassMethods = serializer.deserializeObject(json.get("temporaryAccessPassMethods").toString(), TemporaryAccessPassAuthenticationMethodCollectionPage.class);
        }
    }
}
