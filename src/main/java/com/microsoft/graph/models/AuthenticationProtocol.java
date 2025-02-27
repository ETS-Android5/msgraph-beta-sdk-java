// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Authentication Protocol.
*/
public enum AuthenticationProtocol
{
    /**
    * ws Fed
    */
    WS_FED,
    /**
    * saml
    */
    SAML,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AuthenticationProtocol values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
