// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Initiator Type.
*/
public enum InitiatorType
{
    /**
    * user
    */
    USER,
    /**
    * application
    */
    APPLICATION,
    /**
    * system
    */
    SYSTEM,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For InitiatorType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
