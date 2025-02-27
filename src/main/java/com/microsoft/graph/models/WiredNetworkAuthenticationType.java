// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Wired Network Authentication Type.
*/
public enum WiredNetworkAuthenticationType
{
    /**
    * none
    */
    NONE,
    /**
    * user
    */
    USER,
    /**
    * machine
    */
    MACHINE,
    /**
    * machine Or User
    */
    MACHINE_OR_USER,
    /**
    * guest
    */
    GUEST,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For WiredNetworkAuthenticationType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
