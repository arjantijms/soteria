/*
 * Copyright (c) 2024 Contributors to the Eclipse Foundation.
 * Copyright (c) 2015, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package org.glassfish.soteria.cdi;


import jakarta.enterprise.util.AnnotationLiteral;
import jakarta.security.enterprise.authentication.mechanism.http.FormAuthenticationMechanismDefinition;
import jakarta.security.enterprise.authentication.mechanism.http.LoginToContinue;

/**
 * An annotation literal for <code>@FormAuthenticationMechanismDefinition</code>.
 *
 */
@SuppressWarnings("all")
public class FormAuthenticationMechanismDefinitionAnnotationLiteral extends AnnotationLiteral<FormAuthenticationMechanismDefinition> implements FormAuthenticationMechanismDefinition {
    private static final long serialVersionUID = 1L;

    private final LoginToContinue loginToContinue;
    private Class<?>[] qualifiers;

    public FormAuthenticationMechanismDefinitionAnnotationLiteral(LoginToContinue loginToContinue) {
        this.loginToContinue = loginToContinue;
    }

    @Override
    public LoginToContinue loginToContinue() {
        return loginToContinue;
    }

    @Override
    public Class<?>[] qualifiers() {
        return qualifiers;
    }
}
