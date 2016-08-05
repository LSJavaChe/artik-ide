/*******************************************************************************
 * Copyright (c) 2016 Samsung Electronics Co., Ltd.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - Initial implementation
 *   Samsung Electronics Co., Ltd. - Initial implementation
 *******************************************************************************/
package org.eclipse.che.plugin.artik.ide.profile;

/**
 * Factory for creating actions to switch Artik profile.
 *
 * @author Vitaliy Guliy
 */
public interface ArtikModeActionFactory {

    /**
     * Craetes TurnDevelopmentModeAction instance with a given Artik machine name.
     *
     * @param machineName
     *          name of the Artik machine
     * @return
     *          new instance of SetDevelopmentModeAction
     */
    TurnDevelopmentModeAction turnDevelopmentModeAction(String machineName);

    /**
     * Craetes TurnProductionModeAction instance with a given Artik machine name.
     *
     * @param machineName
     *          name of the Artik machine
     * @return
     *          new instance of SetProductionModeAction
     */
    TurnProductionModeAction turnProductionModeAction(String machineName);

}
