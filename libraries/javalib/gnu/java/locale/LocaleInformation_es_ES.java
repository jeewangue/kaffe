/* LocaleInformation_es_ES.java --
   Copyright (C) 2004  Free Software Foundation, Inc.

This file is part of GNU Classpath.

GNU Classpath is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

GNU Classpath is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with GNU Classpath; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA
02111-1307 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */


// This file was automatically generated by gnu.localegen from LDML es_ES.xml

package gnu.java.locale;

import java.util.ListResourceBundle;

public class LocaleInformation_es_ES extends ListResourceBundle
{
  static final String decimalSeparator = ",";
  static final String groupingSeparator = "";
  static final String numberFormat = "#.###";
  static final String percentFormat = "#%";
  static final String[] weekdays = { null, "domingo", "lunes", "martes", "mi\u00E9rcoles", "jueves", "viernes", "s\u00E1bado" };

  static final String[] shortWeekdays = { null, "dom", "lun", "mar", "mi\u00E9", "jue", "vie", "s\u00E1b" };

  static final String[] shortMonths = { "ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic", null };

  static final String[] months = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre", null };

  static final String[] ampms = { "", "" };

  static final String shortDateFormat = "dd/MM/yy";
  static final String defaultTimeFormat = "";
  static final String currencySymbol = "Pts";
  static final String intlCurrencySymbol = "ESP";
  static final String currencyFormat = "$ #,###,##0.;-$ #,###,##0.";

  private static final Object[][] contents =
  {
    { "weekdays", weekdays },
    { "shortWeekdays", shortWeekdays },
    { "shortMonths", shortMonths },
    { "months", months },
    { "ampms", ampms },
    { "shortDateFormat", shortDateFormat },
    { "defaultTimeFormat", defaultTimeFormat },
    { "currencySymbol", currencySymbol },
    { "intlCurrencySymbol", intlCurrencySymbol },
    { "currencyFormat", currencyFormat },
    { "decimalSeparator", decimalSeparator },
    { "groupingSeparator", groupingSeparator },
    { "numberFormat", numberFormat },
    { "percentFormat", percentFormat },
  };

  public Object[][] getContents() { return contents; }
}
