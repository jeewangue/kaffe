/*
 * $Id: SaslCallbackHandler.java,v 1.6 2004/10/30 12:14:18 robilad Exp $
 * Copyright (C) 2002 The Free Software Foundation
 * 
 * This file is part of GNU inetlib, a library.
 * 
 * GNU inetlib is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * GNU inetlib is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * Linking this library statically or dynamically with other modules is
 * making a combined work based on this library.  Thus, the terms and
 * conditions of the GNU General Public License cover the whole
 * combination.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obliged to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package gnu.inet.util;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;

/**
 * A callback handler that can manage username and password callbacks.
 *
 * @author <a href="mailto:dog@gnu.org">Chris Burdess</a>
 * @version $Revision: 1.6 $ $Date: 2004/10/30 12:14:18 $
 */
public final class SaslCallbackHandler implements CallbackHandler
{

  /*
   * The username.
   */
  private final String username;

  /*
   * The password.
   */
  private final String password;

  /**
   * Constructor.
   * @param username the value to respond to Name callbacks with
   * @param password the value to respond to Password callbacks with
   */
  public SaslCallbackHandler (String username, String password)
    {
      this.username = username;
      this.password = password;
    }

  /**
   * Handle callbacks.
   */
  public void handle (Callback[] callbacks)
    throws IOException, UnsupportedCallbackException
    {
      for (int i = 0; i < callbacks.length; i++)
        {
          if (callbacks[i] instanceof NameCallback)
            {
              NameCallback nc = (NameCallback) callbacks[i];
              nc.setName (username);
            }
          else if (callbacks[i] instanceof PasswordCallback)
            {
              PasswordCallback pc = (PasswordCallback) callbacks[i];
              pc.setPassword (password.toCharArray ());
            }
          else
            throw new UnsupportedCallbackException (callbacks[i]);
        }
    }
  
}
