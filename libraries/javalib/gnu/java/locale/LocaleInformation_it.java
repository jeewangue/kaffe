/* LocaleInformation_it.java --
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


// This file was automatically generated by gnu.localegen from LDML it.xml

package gnu.java.locale;

import java.util.ListResourceBundle;

public class LocaleInformation_it extends ListResourceBundle
{
  private static final String[] shortMonths = {
    "gen",
    "feb",
    "mar",
    "apr",
    "mag",
    "giu",
    "lug",
    "ago",
    "set",
    "ott",
    "nov",
    "dic",
    null,
  };

  private static final String[] months = {
    "gennaio",
    "febbraio",
    "marzo",
    "aprile",
    "maggio",
    "giugno",
    "luglio",
    "agosto",
    "settembre",
    "ottobre",
    "novembre",
    "dicembre",
    null,
  };

  private static final String[] shortWeekdays = {
    null,
    "dom",
    "lun",
    "mar",
    "mer",
    "gio",
    "ven",
    "sab",
  };

  private static final String[] weekdays = {
    null,
    "domenica",
    "luned\u00ec",
    "marted\u00ec",
    "mercoled\u00ec",
    "gioved\u00ec",
    "venerd\u00ec",
    "sabato",
  };

  private static final String[] eras = {
    "aC",
    "dC",
  };

  private static final String[] ampms = {
    "m.",
    "p.",
  };

  private static final String[][] zoneStrings =
  {
    { "America/Los_Angeles", "Ora Standard Pacifico", "PST", "Ora Legale Pacifico", "PDT" },
    { "Africa/Casablanca", "Ora Meridiano Greenwich", "GMT", "Ora Meridiano Greenwich", "GMT" },
    { "America/New_York", "Ora Standard Orientale", "EST", "Ora Legale Orientale", "EDT" },
    { "America/Anchorage", "Ora Standard Alaska", "AST", "Ora Legale Alaska", "ADT" },
    { "Etc/GMT", "Ora Meridiano Greenwich", "GMT", "Ora Meridiano Greenwich", "GMT" },
    { "Asia/Shanghai", "Ora Standard Cina", "CTT", "Ora Standard Cina", "CDT" },
    { "America/Halifax", "Ora Standard Atlantico", "AST", "Ora Legale Atlantico", "ADT" },
    { "Europe/Paris", "Ora Standard Centrale Europeo", "CET", "Ora Legale Centrale Europeo", "CEST" },
    { "America/Denver", "Ora Standard Mountain", "MST", "Ora Legale Mountain", "MDT" },
    { "Asia/Jerusalem", "Ora Standard Israele", "IST", "Ora Legale Israele", "IDT" },
    { "America/St_Johns", "Ora Standard Newfoundland", "CNT", "Ora Legale Newfoundland", "CDT" },
    { "Pacific/Honolulu", "Ora Standard Hawaii", "HST", "Ora Standard Hawaii", "HST" },
    { "America/Indianapolis", "Ora Standard Orientale", "EST", "Ora Standard Orientale", "EST" },
    { "America/Chicago", "Ora Standard Centrale", "CST", "Ora Legale Centrale", "CDT" },
    { "Europe/Bucharest", "Ora Standard Europa Orientale", "EET", "Ora Legale Europa Orientale", "EEST" },
    { "Asia/Tokyo", "Ora Standard Giappone", "JST", "Ora Standard Giappone", "JST" },
    { "America/Phoenix", "Ora Standard Mountain", "MST", "Ora Standard Mountain", "MST" },
  };

  private static final class Hashtableterritories extends java.util.Hashtable
  {
    public Hashtableterritories()
      {
        super();
        put("TL", "Timor Est");
        put("TK", "Tokelau");
        put("TJ", "Tagikistan");
        put("TH", "Tailandia");
        put("TG", "Togo");
        put("TF", "Territori australi francesi");
        put("GY", "Guyana");
        put("TD", "Ciad");
        put("TC", "Isole Turks e Caicos");
        put("GW", "Guinea-Bissau");
        put("GU", "Guam");
        put("GT", "Guatemala");
        put("GS", "Georgia del Sud e Isole Sandwich del Sud");
        put("GR", "Grecia");
        put("GQ", "Guinea Equatoriale");
        put("GP", "Guadalupa");
        put("SZ", "Swaziland");
        put("SY", "Siria");
        put("GN", "Guinea");
        put("GM", "Gambia");
        put("GL", "Groenlandia");
        put("SV", "El Salvador");
        put("ST", "S\u00e3o Tom\u00e9 e Pr\u00edncipe");
        put("GI", "Gibilterra");
        put("GH", "Ghana");
        put("SR", "Suriname");
        put("GF", "Guiana Francese");
        put("SP", "Serbia");
        put("GE", "Georgia");
        put("SO", "Somalia");
        put("GD", "Grenada");
        put("SN", "Senegal");
        put("SM", "San Marino");
        put("GB", "Regno Unito");
        put("SL", "Sierra Leone");
        put("GA", "Gabon");
        put("SK", "Slovacchia");
        put("SJ", "Svalbard e Jan Mayen");
        put("SI", "Slovenia");
        put("SH", "Sant\u2019Elena");
        put("SG", "Singapore");
        put("SE", "Svezia");
        put("SD", "Sudan");
        put("SC", "Seychelles");
        put("SB", "Isole Solomon");
        put("SA", "Arabia Saudita");
        put("FR", "Francia");
        put("FO", "Isole Faroe");
        put("FM", "Micronesia");
        put("RW", "Ruanda");
        put("FK", "Isole Falkland");
        put("RU", "Federazione Russa");
        put("FJ", "Fiji");
        put("FI", "Finlandia");
        put("RO", "Romania");
        put("RE", "R\u00e9union");
        put("ET", "Etiopia");
        put("ES", "Spagna");
        put("ER", "Eritrea");
        put("EH", "Sahara Occidentale");
        put("EG", "Egitto");
        put("EE", "Estonia");
        put("EC", "Ecuador");
        put("DZ", "Algeria");
        put("QA", "Qatar");
        put("DO", "Repubblica Dominicana");
        put("PY", "Paraguay");
        put("DM", "Dominica");
        put("PW", "Palau");
        put("DK", "Danimarca");
        put("DJ", "Gibuti");
        put("PT", "Portogallo");
        put("PS", "Palestina");
        put("PR", "Portorico");
        put("DE", "Germania");
        put("PN", "Pitcairn");
        put("PM", "Saint Pierre e Miquelon");
        put("PL", "Polonia");
        put("PK", "Pakistan");
        put("PH", "Filippine");
        put("PG", "Papua Nuova Guinea");
        put("PF", "Polinesia Francese");
        put("CZ", "Repubblica Ceca");
        put("PE", "Per\u00f9");
        put("CY", "Cipro");
        put("CX", "Isola Christmas");
        put("CV", "Capo Verde");
        put("PA", "Panama");
        put("CU", "Cuba");
        put("CR", "Costa Rica");
        put("CO", "Colombia");
        put("CN", "Cina");
        put("CM", "Camerun");
        put("CL", "Cile");
        put("CK", "Isole Cook");
        put("CI", "Costa d\u2019Avorio");
        put("CH", "Svizzera");
        put("CG", "Congo");
        put("CF", "Repubblica Centrafricana");
        put("CD", "Repubblica Democratica del Congo");
        put("CC", "Isole Cocos (Keeling)");
        put("OM", "Oman");
        put("CA", "Canada");
        put("BZ", "Belize");
        put("BY", "Bielorussia");
        put("BW", "Botswana");
        put("BV", "Isola Bouvet");
        put("BT", "Bhutan");
        put("BS", "Bahamas");
        put("BR", "Brasile");
        put("NZ", "Nuova Zelanda");
        put("BO", "Bolivia");
        put("BN", "Brunei");
        put("BM", "Bermuda");
        put("NU", "Niue");
        put("BJ", "Benin");
        put("BI", "Burundi");
        put("BH", "Bahrein");
        put("NR", "Nauru");
        put("BG", "Bulgaria");
        put("BF", "Burkina Faso");
        put("NP", "Nepal");
        put("BE", "Belgio");
        put("NO", "Norvegia");
        put("BD", "Bangladesh");
        put("BB", "Barbados");
        put("ZW", "Zimbabwe");
        put("NL", "Paesi Bassi");
        put("BA", "Bosnia Erzegovina");
        put("NI", "Nicaragua");
        put("NG", "Nigeria");
        put("NF", "Isola Norfolk");
        put("AZ", "Azerbaigian");
        put("NE", "Niger");
        put("NC", "Nuova Caledonia");
        put("AW", "Aruba");
        put("ZM", "Zambia");
        put("NA", "Namibia");
        put("AU", "Australia");
        put("AT", "Austria");
        put("AS", "Samoa Americane");
        put("AR", "Argentina");
        put("AQ", "Antartide");
        put("MZ", "Mozambico");
        put("AO", "Angola");
        put("MY", "Malesia");
        put("AN", "Antille Olandesi");
        put("MX", "Messico");
        put("AM", "Armenia");
        put("MW", "Malawi");
        put("AL", "Albania");
        put("MV", "Maldive");
        put("ZA", "Sud Africa");
        put("MU", "Mauritius");
        put("MT", "Malta");
        put("AI", "Anguilla");
        put("MS", "Montserrat");
        put("MR", "Mauritania");
        put("AG", "Antigua e Barbuda");
        put("MQ", "Martinica");
        put("AF", "Afghanistan");
        put("MP", "Isole Marianne Settentrionali");
        put("AE", "Emirati Arabi Uniti");
        put("MO", "Regione Amministrativa Speciale di Macao, Cina");
        put("AD", "Andorra");
        put("MN", "Mongolia");
        put("MM", "Myanmar");
        put("ML", "Mali");
        put("MK", "Macedonia, Repubblica");
        put("YU", "Yugoslavia");
        put("YT", "Mayotte");
        put("MH", "Isole Marshall");
        put("MG", "Madagascar");
        put("MD", "Moldavia");
        put("MC", "Monaco");
        put("MA", "Marocco");
        put("YE", "Yemen");
        put("LY", "Libia");
        put("LV", "Lettonia");
        put("LU", "Lussemburgo");
        put("LT", "Lituania");
        put("LS", "Lesotho");
        put("LR", "Liberia");
        put("LK", "Sri Lanka");
        put("LI", "Liechtenstein");
        put("LC", "Saint Lucia");
        put("LB", "Libano");
        put("LA", "Laos");
        put("KZ", "Kazakistan");
        put("KY", "Isole Cayman");
        put("KW", "Kuwait");
        put("KR", "Corea del Sud");
        put("KP", "Corea del Nord");
        put("KN", "Saint Kitts e Nevis");
        put("KM", "Comore");
        put("KI", "Kiribati");
        put("WS", "Samoa");
        put("KH", "Cambogia");
        put("KG", "Kirghizistan");
        put("KE", "Kenya");
        put("WF", "Wallis e Futuna");
        put("JP", "Giappone");
        put("JO", "Giordania");
        put("JM", "Giamaica");
        put("VU", "Vanuatu");
        put("VN", "Vietnam");
        put("VI", "Isole Vergini Americane");
        put("VG", "Isole Vergini Britanniche");
        put("VE", "Venezuela");
        put("VC", "Saint Vincent e Grenadines");
        put("VA", "Vaticano");
        put("IT", "Italia");
        put("IS", "Islanda");
        put("IR", "Iran");
        put("IQ", "Iraq");
        put("UZ", "Uzbekistan");
        put("IO", "Territorio Britannico dell\u2019Oceano Indiano");
        put("UY", "Uruguay");
        put("IN", "India");
        put("IL", "Israele");
        put("US", "Stati Uniti");
        put("IE", "Irlanda");
        put("ID", "Indonesia");
        put("UM", "Isole Minori lontane dagli Stati Uniti");
        put("UG", "Uganda");
        put("UA", "Ucraina");
        put("HU", "Ungheria");
        put("HT", "Haiti");
        put("HR", "Croazia");
        put("TZ", "Tanzania");
        put("HN", "Honduras");
        put("HM", "Isole Heard ed Isole McDonald");
        put("TW", "Taiwan");
        put("TV", "Tuvalu");
        put("HK", "Regione Amministrativa Speciale di Hong Kong, Cina");
        put("TT", "Trinidad e Tobago");
        put("TR", "Turchia");
        put("TO", "Tonga");
        put("TN", "Tunisia");
        put("TM", "Turkmenistan");
      }
  }

  private static final Object territories = new Hashtableterritories();

  private static final Object[][] contents =
  {
    { "decimalSeparator", "," },
    { "groupingSeparator", "." },
    { "shortMonths", shortMonths },
    { "months", months },
    { "shortWeekdays", shortWeekdays },
    { "weekdays", weekdays },
    { "eras", eras },
    { "ampms", ampms },
    { "shortDateFormat", "dd/MM/yy" },
    { "mediumDateFormat", "dd/MMM/yy" },
    { "longDateFormat", "dd MMMM yyyy" },
    { "fullDateFormat", "EEEE d MMMM yyyy" },
    { "zoneStrings", zoneStrings },
    { "territories", territories },
  };

  public Object[][] getContents() { return contents; }
}