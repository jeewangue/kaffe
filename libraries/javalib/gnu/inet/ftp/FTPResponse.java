/*
 * $Id: FTPResponse.java,v 1.5 2004/10/30 12:14:12 robilad Exp $
 * Copyright (C) 2003 The Free Software Foundation
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

package gnu.inet.ftp;

/**
 * An FTP control response.
 *
 * @author <a href='mailto:dog@gnu.org'>Chris Burdess</a>
 * @version $Revision: 1.5 $ $Date: 2004/10/30 12:14:12 $
 */
public final class FTPResponse
{

        /**
	 * The 3-digit status code.
	 */
  protected final int code;

        /**
	 * The human-readable message.
	 */
  protected final String message;

        /**
	 * Multiline data, if present.
	 */
  protected final String data;

        /**
	 * Constructs a new FTP response.
	 * @param code the status code
	 * @param message the message
	 */
  public FTPResponse(int code, String message)
  {
    this(code, message, null);
  }

        /**
	 * Constructs a new multiline FTP response.
	 * @param code the status code
	 * @param message the message
	 * @param data multiline data
	 */
  public FTPResponse(int code, String message, String data)
  {
    this.code = code;
    this.message = message;
    this.data = data;
  }

        /**
	 * Returns the 3-digit status code.
	 */
  public int getCode()
  {
    return code;
  }

        /**
	 * Returns the human-readable message.
	 */
  public String getMessage()
  {
    return message;
  }

        /**
	 * Returns the multiline data, or null if there was no such data.
	 */
  public String getData()
  {
    return data;
  }

}
