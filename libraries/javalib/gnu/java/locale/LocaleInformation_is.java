/* LocaleInformation_is.java --
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


// This file was automatically generated by gnu.localegen from LDML

package gnu.java.locale;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.ListResourceBundle;

public class LocaleInformation_is extends ListResourceBundle
{
  private static final String currenciesDisplayNameKeys = "YDD\u00A6GRN\u00A6TWD\u00A6LKR\u00A6TJS\u00A6RWF\u00A6TJR\u00A6SDP\u00A6GRD\u00A6IEP\u00A6CFF\u00A6ARS\u00A6ARP\u00A6SDD\u00A6ARM\u00A6FKP\u00A6EEK\u00A6TVD\u00A6HKD\u00A6IQD\u00A6ARA\u00A6SCR\u00A6XID\u00A6VUV\u00A6KPW\u00A6DKK\u00A6IDR\u00A6LVR\u00A6KPP\u00A6AED\u00A6LVL\u00A6RUR\u00A6FJP\u00A6MOP\u00A6FJD\u00A6ADP\u00A6DJF\u00A6SBD\u00A6ADD\u00A6TTO\u00A6ECS\u00A6THB\u00A6LUF\u00A6FIM\u00A6TTD\u00A6MNT\u00A6UAK\u00A6SAR\u00A6UAH\u00A6HUF\u00A6IBP\u00A6COP\u00A6LTT\u00A6VGD\u00A6PTE\u00A6AOS\u00A6GBP\u00A6INR\u00A6XFU\u00A6LTL\u00A6KZT\u00A6COF\u00A6KZR\u00A6COB\u00A6BUK\u00A6XFO\u00A6SYP\u00A6OMR\u00A6NGP\u00A6MZE\u00A6MMX\u00A6NGN\u00A6PSP\u00A6CNY\u00A6CNX\u00A6GNI\u00A6MAF\u00A6GNF\u00A6MAD\u00A6MMK\u00A6MYR\u00A6LSL\u00A6TRL\u00A6KMF\u00A6GAF\u00A6CZK\u00A6ANG\u00A6GMP\u00A6BGX\u00A6XEF\u00A6KYD\u00A6BGO\u00A6BGN\u00A6MXV\u00A6CAD\u00A6BGM\u00A6BGL\u00A6VEB\u00A6MLF\u00A6MXP\u00A6ILS\u00A6BSP\u00A6MXN\u00A6GYD\u00A6CMF\u00A6ILP\u00A6CYP\u00A6SKK\u00A6XDR\u00A6ILL\u00A6LRD\u00A6AMD\u00A6BSD\u00A6GLK\u00A6HRK\u00A6MKN\u00A6ALX\u00A6CLP\u00A6JEP\u00A6ALV\u00A6XPF\u00A6FRF\u00A6MWP\u00A6TDF\u00A6MKD\u00A6TPP\u00A6CLF\u00A6CLE\u00A6ALL\u00A6ALK\u00A6BRL\u00A6TPE\u00A6DES\u00A6XCF\u00A6DEM\u00A6XCD\u00A6KWD\u00A6YUM\u00A6SVC\u00A6GWM\u00A6SIT\u00A6JPY\u00A6XOF\u00A6TOS\u00A6BEF\u00A6GWE\u00A6TCC\u00A6CKD\u00A6SUR\u00A6ROL\u00A6DDM\u00A6NOK\u00A6XNF\u00A6SHP\u00A6ZAP\u00A6ZAL\u00A6KID\u00A6TZS\u00A6GIP\u00A6ZMP\u00A6CVE\u00A6ZMK\u00A6XAF\u00A6LBP\u00A6STE\u00A6STD\u00A6FOK\u00A6DOP\u00A6EUR\u00A6BOV\u00A6CUX\u00A6LNR\u00A6WSP\u00A6XMF\u00A6MTP\u00A6USS\u00A6MHD\u00A6BOP\u00A6NZP\u00A6CUP\u00A6MTL\u00A6TMM\u00A6USN\u00A6GHP\u00A6SSP\u00A6AUP\u00A6SGD\u00A6NZD\u00A6USD\u00A6HNL\u00A6ITL\u00A6PAB\u00A6GTQ\u00A6AUD\u00A6NAD\u00A6MGF\u00A6BBD\u00A6CHF\u00A6MGA\u00A6JMP\u00A6PLZ\u00A6PLX\u00A6YER\u00A6ATS\u00A6ETD\u00A6LYP\u00A6BND\u00A6YEI\u00A6EGP\u00A6JMD\u00A6ISK\u00A6SRG\u00A6BZH\u00A6LYD\u00A6BZD\u00A6ESP\u00A6KRW\u00A6NLG\u00A6MRO\u00A6BMP\u00A6ZWD\u00A6SEK\u00A6KRO\u00A6CSK\u00A6IRR\u00A6PKR\u00A6BMD\u00A6KRH\u00A6CSC";

  private static final String currenciesDisplayNameValues = "Jemenskur denari\u00A6Drakma, N\u00fd\u00A6Ta\u00edvanskur dalur\u00A6Sr\u00edl\u00f6nsk r\u00fap\u00eda\u00A6Tajikistan Somoni\u00A6Rwandan Franc\u00A6Tadsjiksk r\u00fabla\u00A6S\u00fadanskt pund\u00A6Drakma\u00A6\u00cdrskt pund\u00A6Mi\u00f0afr\u00edskur franki\u00A6Argent\u00edskur pesi\u00A6Argent\u00edskur pesi (1983-1985)\u00A6S\u00fadanskur denari\u00A6Argent\u00edskur pesi (1899-1970)\u00A6Falklenskt pund\u00A6Eistnesk kr\u00f3na\u00A6T\u00faval\u00faskur dalur\u00A6Hong Kong-dalur\u00A6\u00cdrakskur denari\u00A6Argentine Austral\u00A6Seychelles r\u00fap\u00eda\u00A6\u00cdslamskur denari\u00A6Vanuatu Vatu\u00A6Nor\u00f0urk\u00f3reskt vonn\u00A6D\u00f6nsk kr\u00f3na\u00A6Ind\u00f3nes\u00edsk r\u00fap\u00eda\u00A6Lettnesk r\u00fabla\u00A6Nor\u00f0urk\u00f3reskt vonn (1947-1959)\u00A6Arab\u00edskt d\u00edrham\u00A6Lat\u00A6R\u00fassnesk r\u00fabla\u00A6F\u00eddjeyskt pund\u00A6Macao Pataca\u00A6F\u00eddjeyskur dalur\u00A6Andorrskur peseti\u00A6Djibouti Franc\u00A6Sal\u00f3monseyskur dalur\u00A6Andorrskur denari\u00A6Tr\u00ednidad og T\u00f3bag\u00f3-dalur, eldri\u00A6Ecuador Sucre\u00A6Bat\u00A6L\u00faxemborgarfranki\u00A6Finnskt mark\u00A6Tr\u00ednidad og T\u00f3bag\u00f3-dalur\u00A6T\u00far\u00edkur\u00A6Ukrainian Karbovanetz\u00A6S\u00e1diarab\u00edskt r\u00edal\u00A6Hrinja\u00A6F\u00f3rinta\u00A6Nor\u00f0ur\u00edrskt pund\u00A6K\u00f3lumb\u00edskur pesi\u00A6Lithuanian Talonas\u00A6J\u00f3mfr\u00faaeyjadalur\u00A6Port\u00fagalskur sk\u00fati\u00A6Ang\u00f3lskur sk\u00fati\u00A6Sterlingspund\u00A6Indversk r\u00fap\u00eda\u00A6Franskur franki, UIC\u00A6L\u00edt\u00A6Kazakhstan Tenge\u00A6Mi\u00f0afr\u00edskur franki, Kong\u00f3\u00A6Kazakhstan Ruble\u00A6K\u00f3lumb\u00edskur papp\u00edrspesi\u00A6B\u00farmverskt kjat\u00A6Franskur gullfranki\u00A6S\u00fdrlenskt pund\u00A6\u00d3manskt r\u00edal\u00A6N\u00edger\u00edskt pund\u00A6M\u00f3samb\u00edskur sk\u00fati\u00A6Mjanmarskt gjaldeyrissk\u00edrteini \u00ed Bandar\u00edkjad\u00f6lum\u00A6Nigerian Naira\u00A6Palest\u00ednskt pund\u00A6J\u00faan\u00A6K\u00ednverskt gjaldeyrissk\u00edrteini \u00ed Bandar\u00edkjad\u00f6lum\u00A6G\u00edneufranki (1960-1972)\u00A6Marokk\u00f3skur franki\u00A6G\u00edneufranki\u00A6Marokk\u00f3skt d\u00edrham\u00A6Mjanmarskt kjat\u00A6Malaysian Ringgit\u00A6Lesotho Loti\u00A6Tyrknesk l\u00edra\u00A6K\u00f3moreyskur franki\u00A6Mi\u00f0afr\u00edskur franki, Gabon\u00A6T\u00e9kknesk kr\u00f3na\u00A6Hollenskt Antillugyllini\u00A6Gamb\u00edskt pund\u00A6B\u00falgarskt gjaldeyrissk\u00edrteini \u00ed lef\u00A6Mi\u00f0afr\u00edskur franki, BCEAEC\u00A6Caymaneyskur dalur\u00A6Lef (1879-1952)\u00A6Lef, n\u00fdtt\u00A6Mex\u00edk\u00f3skur pesi, UDI\u00A6Kanad\u00edskur dalur\u00A6Lef (1952-1962)\u00A6Lef\u00A6Venezuelan Bolivar\u00A6Mal\u00edskur franki\u00A6Mex\u00edk\u00f3skur silfurpesi  (1861-1992)\u00A6Sikill\u00A6Bahameyskt pund\u00A6Mex\u00edk\u00f3skur pesi\u00A6Gv\u00e6janskur dalur\u00A6Mi\u00f0afr\u00edskur franki, Kamer\u00fan\u00A6\u00cdsraelskt pund\u00A6K\u00fdpverskt pund\u00A6Sl\u00f3vak\u00edsk kr\u00f3na\u00A6S\u00e9rst\u00f6k dr\u00e1ttarr\u00e9ttindi\u00A6Israeli Sheqel\u00A6L\u00edber\u00edskur dalur\u00A6Dramm\u00A6Bahameyskur dalur\u00A6Gr\u00e6nlensk kr\u00f3na\u00A6K\u00fana\u00A6Maked\u00f3nskur denari (1992-1993)\u00A6Albanskt gjaldeyrissk\u00edrteini \u00ed Bandar\u00edkjad\u00f6lum\u00A6Chileskur pesi\u00A6Jerseyskt pund\u00A6Lek Valute (1992-1993)\u00A6P\u00f3lines\u00edskur franki\u00A6Franskur franki\u00A6Malav\u00edskt pund\u00A6Mi\u00f0afr\u00edskur franki, Tsjad\u00A6Maked\u00f3nskur denari\u00A6Timor Pataca\u00A6Chilean Unidades de Fomento\u00A6Chileskur sk\u00fati\u00A6Lek\u00A6Lek (1946-1961)\u00A6Brasil\u00edskt r\u00edal\u00A6T\u00edmorskur sk\u00fati\u00A6German Sperrmark\u00A6Mi\u00f0afr\u00edskur franki, n\u00fdr\u00A6\u00de\u00fdskt mark\u00A6Austur-Kar\u00edbahafsdalur\u00A6K\u00faveiskur denari\u00A6J\u00fag\u00f3slavneskur denari\u00A6El Salvador Colon\u00A6Portuguese Guinea Mil Reis\u00A6Sl\u00f3venskur dalur\u00A6Jen\u00A6Mi\u00f0afr\u00edskur franki, BCEAO\u00A6Tongverskt sterlingspund\u00A6Belg\u00edskur franki\u00A6Port\u00fagalskur, g\u00edneskur sk\u00fati\u00A6Turk- og Caicoseysk kr\u00f3na\u00A6Cookseyskur dalur\u00A6Soviet Rouble\u00A6R\u00famenskt lei\u00A6Austur\u00fe\u00fdskt mark\u00A6Norsk kr\u00f3na\u00A6Mi\u00f0afr\u00edskur franki, Antillur\u00A6Helenskt pund\u00A6Su\u00f0urafr\u00edskt pund\u00A6Rand (vi\u00f0skipta)\u00A6K\u00edribat\u00edskur dalur\u00A6Tanzanian Shilling\u00A6G\u00edbraltarspund\u00A6Samb\u00edskt pund\u00A6Gr\u00e6nh\u00f6f\u00f0eyskur sk\u00fati\u00A6Zambian Kwacha\u00A6Mi\u00f0afr\u00edskur franki, BEAC\u00A6L\u00edbanskt pund\u00A6Sa\u00f3 T\u00f3me og Prins\u00edpe sk\u00fati\u00A6Sao Tome and Principe Dobra\u00A6F\u00e6reysk kr\u00f3na\u00A6D\u00f3min\u00edskur pesi\u00A6Euro\u00A6Bolivian Mvdol\u00A6K\u00fabverskt gjaldeyrissk\u00edrteini\u00A6Ceylon Rupee\u00A6Sam\u00f3skt pund\u00A6K\u00f3moreyskur franki, CFA\u00A6Maltneskt pund\u00A6Bandar\u00edkjadalur (sama dag)\u00A6Marshalleyskur dalur\u00A6B\u00f3liv\u00edskur pesi\u00A6N\u00fdsj\u00e1lenskt pund\u00A6K\u00fabverskur pesi\u00A6Meltnesk l\u00edra\u00A6T\u00farkmenskt manat\u00A6Bandar\u00edkjadalur (n\u00e6sta dag)\u00A6Ganverskt pund\u00A6Skoskt pund\u00A6\u00c1stralskt pund\u00A6Singap\u00farskur dalur\u00A6N\u00fdsj\u00e1lenskur dalur\u00A6Bandar\u00edkjadalur\u00A6Hoduras Lempira\u00A6\u00cdt\u00f6lsk l\u00edra\u00A6Balb\u00f3i\u00A6Guatemala Quetzal\u00A6\u00c1stralskur dalur\u00A6Namib\u00edskur dalur\u00A6Madagaskur franki\u00A6Barbadoskur dalur\u00A6Svissneskur franki\u00A6Madagascar Ariary\u00A6Jama\u00edskt pund\u00A6Slot\u00A6P\u00f3lskt gjaldeyrissk\u00edrteini \u00ed Bandar\u00edkjad\u00f6lum\u00A6Jemenskt r\u00edal\u00A6Austurr\u00edskur skildingur\u00A6E\u00fe\u00ed\u00f3p\u00edskur dalur\u00A6L\u00edb\u00edskt pund\u00A6Br\u00faneiskur dalur\u00A6Jemenskt r\u00edal (1904-1964)\u00A6Egypskt pund\u00A6Jama\u00edskur dalur\u00A6\u00cdslensk kr\u00f3na\u00A6Suriname Guilder\u00A6Hond\u00farskur dalur\u00A6L\u00edb\u00edskur denari\u00A6Bel\u00edskur dalur\u00A6Sp\u00e6nskur peseti\u00A6Su\u00f0urk\u00f3reskt vonn\u00A6Hollenskt gyllini\u00A6Mauritania Ouguiya\u00A6Berm\u00fadeyskt pund\u00A6Simbabveskur dalur\u00A6S\u00e6nsk kr\u00f3na\u00A6Su\u00f0urk\u00f3reskt vonn (1947-1953)\u00A6T\u00e9kknesk kr\u00f3na, eldri\u00A6\u00cdranskt r\u00edal\u00A6Pakist\u00f6nsk r\u00fap\u00eda\u00A6Berm\u00fadeyskur dalur\u00A6South Korean Hwan\u00A6T\u00e9kknesk kr\u00f3na (1945-1953)";

  private static final Hashtable currenciesDisplayName;
  static
  {
    currenciesDisplayName = new Hashtable();
    Enumeration keys = new StringTokenizer(currenciesDisplayNameKeys, "\u00A6");
    Enumeration values = new StringTokenizer(currenciesDisplayNameValues, "\u00A6");
    while (keys.hasMoreElements())
      {
         String key = (String) keys.nextElement();
         String value = (String) values.nextElement();
         currenciesDisplayName.put(key, value);
      }
  }

  private static final String currenciesSymbolKeys = "YDD\u00A6GRN\u00A6TWD\u00A6LKR\u00A6TJS\u00A6RWF\u00A6TJR\u00A6SDP\u00A6GRD\u00A6IEP\u00A6CFF\u00A6ARS\u00A6ARP\u00A6SDD\u00A6ARM\u00A6FKP\u00A6EEK\u00A6TVD\u00A6HKD\u00A6IQD\u00A6ARA\u00A6SCR\u00A6XID\u00A6VUV\u00A6KPW\u00A6DKK\u00A6IDR\u00A6LVR\u00A6KPP\u00A6AED\u00A6LVL\u00A6RUR\u00A6FJP\u00A6MOP\u00A6FJD\u00A6ADP\u00A6DJF\u00A6SBD\u00A6ADD\u00A6TTO\u00A6ECS\u00A6THB\u00A6LUF\u00A6FIM\u00A6TTD\u00A6MNT\u00A6UAK\u00A6SAR\u00A6UAH\u00A6HUF\u00A6IBP\u00A6COP\u00A6LTT\u00A6VGD\u00A6PTE\u00A6AOS\u00A6INR\u00A6XFU\u00A6LTL\u00A6KZT\u00A6COF\u00A6KZR\u00A6COB\u00A6BUK\u00A6XFO\u00A6SYP\u00A6OMR\u00A6NGP\u00A6MZE\u00A6MMX\u00A6NGN\u00A6PSP\u00A6CNY\u00A6CNX\u00A6GNI\u00A6MAF\u00A6GNF\u00A6MAD\u00A6MMK\u00A6MYR\u00A6LSL\u00A6TRL\u00A6KMF\u00A6GAF\u00A6CZK\u00A6ANG\u00A6GMP\u00A6BGX\u00A6XEF\u00A6KYD\u00A6BGO\u00A6BGN\u00A6MXV\u00A6CAD\u00A6BGM\u00A6BGL\u00A6VEB\u00A6MLF\u00A6MXP\u00A6ILS\u00A6BSP\u00A6MXN\u00A6GYD\u00A6CMF\u00A6ILP\u00A6CYP\u00A6SKK\u00A6XDR\u00A6ILL\u00A6LRD\u00A6AMD\u00A6BSD\u00A6GLK\u00A6HRK\u00A6MKN\u00A6ALX\u00A6CLP\u00A6JEP\u00A6ALV\u00A6XPF\u00A6FRF\u00A6MWP\u00A6TDF\u00A6MKD\u00A6TPP\u00A6CLF\u00A6CLE\u00A6ALL\u00A6ALK\u00A6BRL\u00A6TPE\u00A6DES\u00A6XCF\u00A6DEM\u00A6XCD\u00A6KWD\u00A6YUM\u00A6SVC\u00A6GWM\u00A6SIT\u00A6XOF\u00A6TOS\u00A6BEF\u00A6GWE\u00A6TCC\u00A6CKD\u00A6SUR\u00A6ROL\u00A6DDM\u00A6NOK\u00A6XNF\u00A6SHP\u00A6ZAP\u00A6ZAL\u00A6KID\u00A6TZS\u00A6GIP\u00A6ZMP\u00A6CVE\u00A6ZMK\u00A6XAF\u00A6LBP\u00A6STE\u00A6STD\u00A6FOK\u00A6DOP\u00A6BOV\u00A6CUX\u00A6LNR\u00A6WSP\u00A6XMF\u00A6MTP\u00A6USS\u00A6MHD\u00A6BOP\u00A6NZP\u00A6CUP\u00A6MTL\u00A6TMM\u00A6USN\u00A6GHP\u00A6SSP\u00A6AUP\u00A6SGD\u00A6NZD\u00A6USD\u00A6HNL\u00A6PAB\u00A6GTQ\u00A6AUD\u00A6NAD\u00A6MGF\u00A6BBD\u00A6CHF\u00A6MGA\u00A6JMP\u00A6PLZ\u00A6PLX\u00A6YER\u00A6ATS\u00A6ETD\u00A6LYP\u00A6BND\u00A6YEI\u00A6EGP\u00A6JMD\u00A6ISK\u00A6SRG\u00A6BZH\u00A6LYD\u00A6BZD\u00A6ESP\u00A6KRW\u00A6NLG\u00A6MRO\u00A6BMP\u00A6ZWD\u00A6SEK\u00A6KRO\u00A6CSK\u00A6IRR\u00A6PKR\u00A6BMD\u00A6KRH\u00A6CSC";

  private static final String currenciesSymbolValues = "YDD\u00A6GRN\u00A6NT$\u00A6SL Re\u00A6TJS\u00A6RWF\u00A6TJR\u00A6SDP\u00A6GRD\u00A6IR\u00a3\u00A6CFF\u00A6Arg$\u00A6ARP\u00A6SDD\u00A6ARM\u00A6FKP\u00A6EEK\u00A6TVD\u00A6HK$\u00A6ID\u00A6ARA\u00A6SR\u00A6XID\u00A6VT\u00A6KPW\u00A6DKr\u00A6Rp\u00A6LVR\u00A6KPP\u00A6AED\u00A6LVL\u00A6RUR\u00A6FJP\u00A6MOP\u00A6F$\u00A6ADP\u00A6DF\u00A6SI$\u00A6ADD\u00A6TTO\u00A6ECS\u00A6THB\u00A6LUF\u00A6FIM\u00A6TT$\u00A6Tug\u00A6UAK\u00A6SRl\u00A6UAH\u00A6Ft\u00A6IBP\u00A6Col$\u00A6LTT\u00A6VGD\u00A6PTE\u00A6AOS\u00A6INR\u00A6XFU\u00A6LTL\u00A6T\u00A6COF\u00A6KZR\u00A6COB\u00A6BUK\u00A6XFO\u00A6LS\u00A6RO\u00A6NGP\u00A6MZE\u00A6MMX\u00A6NGN\u00A6PSP\u00A6Y\u00A6CNX\u00A6GNI\u00A6MAF\u00A6GF\u00A6MAD\u00A6MMK\u00A6RM\u00A6M\u00A6TL\u00A6CF\u00A6GAF\u00A6CZK\u00A6NA f.\u00A6GMP\u00A6BGX\u00A6XEF\u00A6KYD\u00A6BGO\u00A6BGN\u00A6MXV\u00A6Can$\u00A6BGM\u00A6lev\u00A6Be\u00A6MLF\u00A6MXP\u00A6ILS\u00A6BSP\u00A6MEX$\u00A6G$\u00A6CMF\u00A6ILP\u00A6\u00a3C\u00A6Sk\u00A6XDR\u00A6ILL\u00A6LRD\u00A6dram\u00A6BSD\u00A6GLK\u00A6HRK\u00A6MKN\u00A6ALX\u00A6Ch$\u00A6JEP\u00A6ALV\u00A6CFPF\u00A6FRF\u00A6MWP\u00A6TDF\u00A6MDen\u00A6TPP\u00A6CLF\u00A6CLE\u00A6lek\u00A6ALK\u00A6R$\u00A6TPE\u00A6DES\u00A6XCF\u00A6DEM\u00A6EC$\u00A6KD\u00A6YUM\u00A6SVC\u00A6GWM\u00A6SIT\u00A6XOF\u00A6TOS\u00A6BF\u00A6GWE\u00A6TCC\u00A6CKD\u00A6SUR\u00A6leu\u00A6DDM\u00A6NKr\u00A6XNF\u00A6SHP\u00A6ZAP\u00A6ZAL\u00A6KID\u00A6T Sh\u00A6GIP\u00A6ZMP\u00A6CVEsc\u00A6ZMK\u00A6XAF\u00A6LL\u00A6STE\u00A6Db\u00A6FOK\u00A6RD$\u00A6BOV\u00A6CUX\u00A6LNR\u00A6WSP\u00A6XMF\u00A6MTP\u00A6USS\u00A6MHD\u00A6BOP\u00A6NZP\u00A6CUP\u00A6Lm\u00A6TMM\u00A6USN\u00A6GHP\u00A6SSP\u00A6AUP\u00A6S$\u00A6$NZ\u00A6US$\u00A6L\u00A6PAB\u00A6Q\u00A6$A\u00A6N$\u00A6MGF\u00A6BDS$\u00A6SwF\u00A6MGA\u00A6JMP\u00A6PLZ\u00A6PLX\u00A6YRl\u00A6ATS\u00A6ETD\u00A6LYP\u00A6BND\u00A6YEI\u00A6EGP\u00A6J$\u00A6kr.\u00A6Sf\u00A6BZH\u00A6LD\u00A6BZ$\u00A6ESP\u00A6KRW\u00A6NLG\u00A6UM\u00A6BMP\u00A6Z$\u00A6SKr\u00A6KRO\u00A6CSK\u00A6RI\u00A6Pra\u00A6Ber$\u00A6KRH\u00A6CSC";

  private static final Hashtable currenciesSymbol;
  static
  {
    currenciesSymbol = new Hashtable();
    Enumeration keys = new StringTokenizer(currenciesSymbolKeys, "\u00A6");
    Enumeration values = new StringTokenizer(currenciesSymbolValues, "\u00A6");
    while (keys.hasMoreElements())
      {
         String key = (String) keys.nextElement();
         String value = (String) values.nextElement();
         currenciesSymbol.put(key, value);
      }
  }

  private static final String[] shortMonths = {
    "jan",
    "feb",
    "mar",
    "apr",
    "ma\u00ed",
    "j\u00fan",
    "j\u00fal",
    "\u00e1g\u00fa",
    "sep",
    "okt",
    "n\u00f3v",
    "des",
    null,
  };

  private static final String[] months = {
    "jan\u00faar",
    "febr\u00faar",
    "mars",
    "apr\u00edl",
    "ma\u00ed",
    "j\u00fan\u00ed",
    "j\u00fal\u00ed",
    "\u00e1g\u00fast",
    "september",
    "okt\u00f3ber",
    "n\u00f3vember",
    "desember",
    null,
  };

  private static final String[] shortWeekdays = {
    null,
    "sun",
    "m\u00e1n",
    "\u00feri",
    "mi\u00f0",
    "fim",
    "f\u00f6s",
    "lau",
  };

  private static final String[] weekdays = {
    null,
    "sunnudagur",
    "m\u00e1nudagur",
    "\u00feri\u00f0judagur",
    "mi\u00f0vikudagur",
    "fimmtudagur",
    "f\u00f6studagur",
    "laugardagur",
  };

  private static final String territoriesKeys = "TL\u00A6TK\u00A6TJ\u00A6TH\u00A6TG\u00A6TF\u00A6GY\u00A6TD\u00A6TC\u00A6GW\u00A6GU\u00A6GT\u00A6GS\u00A6GR\u00A6GQ\u00A6GP\u00A6SZ\u00A6SY\u00A6GN\u00A6GM\u00A6GL\u00A6SV\u00A6ST\u00A6GI\u00A6GH\u00A6SR\u00A6GF\u00A6SP\u00A6GE\u00A6SO\u00A6GD\u00A6SN\u00A6SM\u00A6GB\u00A6SL\u00A6GA\u00A6SK\u00A6SJ\u00A6SI\u00A6SH\u00A6SG\u00A6SE\u00A6SD\u00A6SC\u00A6SB\u00A6SA\u00A6FR\u00A6FO\u00A6FM\u00A6RW\u00A6FK\u00A6RU\u00A6FJ\u00A6FI\u00A6RO\u00A6RE\u00A6ET\u00A6ES\u00A6ER\u00A6EH\u00A6EG\u00A6EE\u00A6EC\u00A6DZ\u00A6QA\u00A6DO\u00A6PY\u00A6DM\u00A6PW\u00A6DK\u00A6DJ\u00A6PT\u00A6PS\u00A6PR\u00A6DE\u00A6PN\u00A6PM\u00A6PL\u00A6PK\u00A6PH\u00A6PG\u00A6PF\u00A6CZ\u00A6PE\u00A6CY\u00A6CX\u00A6CV\u00A6CU\u00A6CR\u00A6CO\u00A6CN\u00A6CM\u00A6CK\u00A6CI\u00A6CH\u00A6CG\u00A6CF\u00A6CD\u00A6CC\u00A6OM\u00A6CA\u00A6BZ\u00A6BY\u00A6BW\u00A6BV\u00A6BT\u00A6BS\u00A6BR\u00A6NZ\u00A6BO\u00A6BN\u00A6BM\u00A6NU\u00A6BJ\u00A6BI\u00A6BH\u00A6NR\u00A6BG\u00A6BF\u00A6NP\u00A6BE\u00A6NO\u00A6BD\u00A6BB\u00A6NL\u00A6BA\u00A6NI\u00A6NG\u00A6NF\u00A6AZ\u00A6NE\u00A6NC\u00A6AW\u00A6ZM\u00A6NA\u00A6AU\u00A6AT\u00A6AS\u00A6AR\u00A6AQ\u00A6MZ\u00A6AO\u00A6MY\u00A6AN\u00A6MX\u00A6AM\u00A6MW\u00A6AL\u00A6MV\u00A6ZA\u00A6MU\u00A6MT\u00A6AI\u00A6MS\u00A6MR\u00A6AG\u00A6MQ\u00A6AF\u00A6MP\u00A6AE\u00A6MO\u00A6AD\u00A6MN\u00A6MM\u00A6ML\u00A6MK\u00A6YU\u00A6YT\u00A6MH\u00A6MG\u00A6MD\u00A6MC\u00A6MA\u00A6YE\u00A6LY\u00A6LV\u00A6LU\u00A6LT\u00A6LS\u00A6LR\u00A6LK\u00A6LI\u00A6LC\u00A6LB\u00A6LA\u00A6KZ\u00A6KY\u00A6KW\u00A6KR\u00A6KP\u00A6KN\u00A6KM\u00A6KI\u00A6WS\u00A6KH\u00A6KG\u00A6KE\u00A6WF\u00A6JP\u00A6JO\u00A6JM\u00A6VU\u00A6VN\u00A6VI\u00A6VG\u00A6VE\u00A6VC\u00A6VA\u00A6IT\u00A6IS\u00A6IR\u00A6IQ\u00A6UZ\u00A6IO\u00A6UY\u00A6IN\u00A6IL\u00A6US\u00A6IE\u00A6ID\u00A6UM\u00A6UG\u00A6UA\u00A6HU\u00A6HT\u00A6HR\u00A6TZ\u00A6HN\u00A6HM\u00A6TW\u00A6TV\u00A6HK\u00A6TT\u00A6TR\u00A6TO\u00A6TN\u00A6TM";

  private static final String territoriesValues = "Austur-T\u00edmor\u00A6T\u00f3kel\u00e1\u00A6Tadsjikistan\u00A6Ta\u00edland\u00A6T\u00f3g\u00f3\u00A6Fr\u00f6nsku su\u00f0l\u00e6gu landsv\u00e6\u00f0in\u00A6Gv\u00e6jana\u00A6Tsjad\u00A6Turks- og Caicoseyjar\u00A6G\u00ednea-Biss\u00e1\u00A6Gvam\u00A6Gvatemala\u00A6Su\u00f0ur-Georg\u00eda og Su\u00f0ur-Sandv\u00edkureyjar\u00A6Grikkland\u00A6Mi\u00f0baugs-G\u00ednea\u00A6Gvadel\u00fapeyjar\u00A6Svas\u00edland\u00A6S\u00fdrland\u00A6G\u00ednea\u00A6Gamb\u00eda\u00A6Gr\u00e6nland\u00A6El Salvador\u00A6Sa\u00f3 T\u00f3me og Prins\u00edpe\u00A6G\u00edbraltar\u00A6Gana\u00A6S\u00far\u00ednam\u00A6Franska Gv\u00e6jana\u00A6Serb\u00eda\u00A6Georg\u00eda\u00A6S\u00f3mal\u00eda\u00A6Grenada\u00A6Senegal\u00A6San Mar\u00edn\u00f3\u00A6Bretland\u00A6S\u00ederra Le\u00f3ne\u00A6Gabon\u00A6Sl\u00f3vak\u00eda\u00A6Svalbar\u00f0i og Jan Mayen\u00A6Sl\u00f3ven\u00eda\u00A6Sankti Helena\u00A6Singap\u00far\u00A6Sv\u00ed\u00fej\u00f3\u00f0\u00A6S\u00fadan\u00A6Seychelleseyjar\u00A6Sal\u00f3monseyjar\u00A6S\u00e1di-Arab\u00eda\u00A6Frakkland\u00A6F\u00e6reyjar\u00A6Mikr\u00f3nes\u00eda\u00A6R\u00faanda\u00A6Falklandseyjar\u00A6R\u00fassland\u00A6F\u00eddjieyjar\u00A6Finnland\u00A6R\u00famen\u00eda\u00A6R\u00e9union\u00A6E\u00fe\u00ed\u00f3p\u00eda\u00A6Sp\u00e1nn\u00A6Er\u00edtrea\u00A6Vestur-Sahara\u00A6Egyptaland\u00A6Eistland\u00A6Ekvador\u00A6Als\u00edr\u00A6Katar\u00A6D\u00f3min\u00edska l\u00fd\u00f0veldi\u00f0\u00A6Paragv\u00e6\u00A6D\u00f3min\u00edka\u00A6Pal\u00e1\u00A6Danm\u00f6rk\u00A6Dj\u00edb\u00fat\u00ed\u00A6Port\u00fagal\u00A6Palest\u00edna\u00A6P\u00faert\u00f3 R\u00edk\u00f3\u00A6\u00de\u00fdskaland\u00A6Pitcairn\u00A6Sankti Pierre og Miquelon\u00A6P\u00f3lland\u00A6Pakistan\u00A6Filippseyjar\u00A6Pap\u00faa N\u00fdja-G\u00ednea\u00A6Franska P\u00f3l\u00fdnes\u00eda\u00A6T\u00e9kkland\u00A6Per\u00fa\u00A6K\u00fdpur\u00A6J\u00f3laey\u00A6Gr\u00e6nh\u00f6f\u00f0aeyjar\u00A6K\u00faba\u00A6Kostar\u00edka\u00A6K\u00f3lumb\u00eda\u00A6K\u00edna\u00A6Kamer\u00fan\u00A6Cookseyjar\u00A6F\u00edlabeinsstr\u00f6ndin\u00A6Sviss\u00A6Vestur-Kong\u00f3\u00A6Mi\u00f0-Afr\u00edkul\u00fd\u00f0veldi\u00f0\u00A6Austur-Kong\u00f3\u00A6K\u00f3koseyjar\u00A6\u00d3man\u00A6Kanada\u00A6Bel\u00eds\u00A6Hv\u00edta-R\u00fassland\u00A6Botsvana\u00A6Bouveteyja\u00A6B\u00fatan\u00A6Bahamaeyjar\u00A6Brasil\u00eda\u00A6N\u00fdja-Sj\u00e1land\u00A6B\u00f3liv\u00eda\u00A6Br\u00fanei\u00A6Berm\u00fadaeyjar\u00A6Niue\u00A6Ben\u00edn\u00A6B\u00far\u00fand\u00ed\u00A6Barein\u00A6N\u00e1r\u00fa\u00A6B\u00falgar\u00eda\u00A6B\u00fark\u00edna Fas\u00f3\u00A6Nepal\u00A6Belg\u00eda\u00A6Noregur\u00A6Bangladess\u00A6Barbados\u00A6Ni\u00f0url\u00f6nd\u00A6Bosn\u00eda og Herseg\u00f3v\u00edna\u00A6N\u00edkaragva\u00A6N\u00edger\u00eda\u00A6Norfolkeyja\u00A6Aserba\u00eddsjan\u00A6N\u00edger\u00A6N\u00fdja-Kaled\u00f3n\u00eda\u00A6Ar\u00faba\u00A6Samb\u00eda\u00A6Namib\u00eda\u00A6\u00c1stral\u00eda\u00A6Austurr\u00edki\u00A6Bandar\u00edska Sam\u00f3a\u00A6Argent\u00edna\u00A6Su\u00f0urskautslandi\u00f0\u00A6M\u00f3samb\u00edk\u00A6Ang\u00f3la\u00A6Malas\u00eda\u00A6Hollensku Antillur\u00A6Mex\u00edk\u00f3\u00A6Armen\u00eda\u00A6Malav\u00ed\u00A6Alban\u00eda\u00A6Mald\u00edveyjar\u00A6Su\u00f0ur-Afr\u00edka\u00A6M\u00e1rit\u00edus\u00A6Malta\u00A6Angvilla\u00A6Montserrat\u00A6M\u00e1ritan\u00eda\u00A6Ant\u00edgva og Barb\u00fada\u00A6Martin\u00edk\u00A6Afganistan\u00A6Nor\u00f0ur-Mar\u00edanaeyjar\u00A6Sameinu\u00f0u arab\u00edsku furstad\u00e6min\u00A6Maka\u00f3\u00A6Andorra\u00A6Mong\u00f3l\u00eda\u00A6Mjanmar\u00A6Mal\u00ed\u00A6Maked\u00f3n\u00eda\u00A6J\u00fag\u00f3slav\u00eda\u00A6Mayotte\u00A6Marshalleyjar\u00A6Madagaskar\u00A6Mold\u00f3va\u00A6M\u00f3nak\u00f3\u00A6Marokk\u00f3\u00A6Jemen\u00A6L\u00edb\u00eda\u00A6Lettland\u00A6L\u00faxemborg\u00A6Lith\u00e1en\u00A6Les\u00f3t\u00f3\u00A6L\u00edber\u00eda\u00A6Sr\u00ed Lanka\u00A6Liechtenstein\u00A6Sankti L\u00fas\u00eda\u00A6L\u00edbanon\u00A6Laos\u00A6Kasakstan\u00A6Caymaneyjar\u00A6K\u00faveit\u00A6Su\u00f0ur-K\u00f3rea\u00A6Nor\u00f0ur-K\u00f3rea\u00A6Sankti Krist\u00f3fer og Nevis\u00A6K\u00f3moreyjar\u00A6K\u00edribat\u00ed\u00A6Sam\u00f3a\u00A6Kamb\u00f3d\u00eda\u00A6Kirgisistan\u00A6Ken\u00eda\u00A6Wallis- og F\u00fat\u00fanaeyjar\u00A6Japan\u00A6J\u00f3rdan\u00eda\u00A6Jama\u00edka\u00A6Van\u00faat\u00fa\u00A6V\u00edetnam\u00A6J\u00f3mfr\u00faaeyjar (bandar\u00edsku)\u00A6J\u00f3mfr\u00faaeyjar (bresku)\u00A6Venes\u00faela\u00A6Sankti Vinsent og Grenad\u00edneyjar\u00A6P\u00e1fagar\u00f0ur\u00A6\u00cdtal\u00eda\u00A6\u00cdsland\u00A6\u00cdran\u00A6\u00cdrak\u00A6\u00dasbekistan\u00A6Bresku Indlandshafseyjar\u00A6\u00dar\u00fagv\u00e6\u00A6Indland\u00A6\u00cdsrael\u00A6Bandar\u00edkin\u00A6\u00cdrland\u00A6Ind\u00f3nes\u00eda\u00A6Sm\u00e1eyjar Bandar\u00edkjanna\u00A6\u00daganda\u00A6\u00dakra\u00edna\u00A6Ungverjaland\u00A6Ha\u00edt\u00ed\u00A6Kr\u00f3at\u00eda\u00A6Tansan\u00eda\u00A6Hond\u00faras\u00A6Heard og McDonaldseyjar\u00A6Ta\u00edvan\u00A6T\u00faval\u00fa\u00A6Hong Kong\u00A6Tr\u00ednidad og T\u00f3bag\u00f3\u00A6Tyrkland\u00A6Tonga\u00A6T\u00fanis\u00A6T\u00farkmenistan";

  private static final Hashtable territories;
  static
  {
    territories = new Hashtable();
    Enumeration keys = new StringTokenizer(territoriesKeys, "\u00A6");
    Enumeration values = new StringTokenizer(territoriesValues, "\u00A6");
    while (keys.hasMoreElements())
      {
         String key = (String) keys.nextElement();
         String value = (String) values.nextElement();
         territories.put(key, value);
      }
  }

  private static final String languagesKeys = "gwi\u00A6akk\u00A6eka\u00A6ijo\u00A6xh\u00A6sux\u00A6sus\u00A6mis\u00A6loz\u00A6tog\u00A6pon\u00A6min\u00A6suk\u00A6wo\u00A6lol\u00A6kut\u00A6mic\u00A6wa\u00A6kum\u00A6zap\u00A6cus\u00A6jbo\u00A6doi\u00A6vo\u00A6oto\u00A6vi\u00A6vai\u00A6rar\u00A6ve\u00A6rap\u00A6raj\u00A6ota\u00A6nzi\u00A6nap\u00A6uz\u00A6uga\u00A6tmh\u00A6nai\u00A6nah\u00A6ur\u00A6fat\u00A6uk\u00A6egy\u00A6ug\u00A6fan\u00A6ssa\u00A6mga\u00A6bat\u00A6nyo\u00A6bas\u00A6nyn\u00A6nym\u00A6hmn\u00A6ban\u00A6osa\u00A6bal\u00A6ty\u00A6bai\u00A6tw\u00A6srr\u00A6tli\u00A6tt\u00A6ts\u00A6bad\u00A6tr\u00A6to\u00A6tn\u00A6tl\u00A6tk\u00A6ti\u00A6th\u00A6kru\u00A6tg\u00A6byn\u00A6te\u00A6kro\u00A6csb\u00A6ta\u00A6tkl\u00A6efi\u00A6sw\u00A6sv\u00A6su\u00A6krc\u00A6st\u00A6ss\u00A6sr\u00A6sq\u00A6men\u00A6crp\u00A6so\u00A6afh\u00A6sn\u00A6sm\u00A6sl\u00A6grc\u00A6sk\u00A6grb\u00A6si\u00A6sh\u00A6crh\u00A6afa\u00A6sg\u00A6se\u00A6sd\u00A6udm\u00A6sc\u00A6sa\u00A6rw\u00A6ru\u00A6mdr\u00A6ro\u00A6rn\u00A6rm\u00A6mdf\u00A6tiv\u00A6ady\u00A6zun\u00A6kpe\u00A6qu\u00A6tig\u00A6son\u00A6cpp\u00A6sog\u00A6ada\u00A6kos\u00A6hit\u00A6cpf\u00A6cpe\u00A6him\u00A6kok\u00A6hil\u00A6got\u00A6gor\u00A6gon\u00A6din\u00A6nub\u00A6pt\u00A6ps\u00A6fur\u00A6phn\u00A6goh\u00A6snk\u00A6cop\u00A6yap\u00A6ach\u00A6yao\u00A6phi\u00A6pl\u00A6ace\u00A6pi\u00A6pa\u00A6bug\u00A6iba\u00A6sms\u00A6bua\u00A6mas\u00A6smn\u00A6os\u00A6map\u00A6or\u00A6man\u00A6smj\u00A6smi\u00A6mak\u00A6om\u00A6mai\u00A6oj\u00A6mag\u00A6mad\u00A6sma\u00A6oc\u00A6nso\u00A6btk\u00A6myv\u00A6dgr\u00A6ny\u00A6myn\u00A6nv\u00A6kmb\u00A6nr\u00A6gmh\u00A6no\u00A6nn\u00A6nl\u00A6ng\u00A6sla\u00A6ne\u00A6nd\u00A6cmc\u00A6tet\u00A6nb\u00A6na\u00A6ter\u00A6tem\u00A6my\u00A6lez\u00A6mt\u00A6peo\u00A6ms\u00A6mr\u00A6fro\u00A6mo\u00A6frm\u00A6mn\u00A6jrb\u00A6ml\u00A6mk\u00A6mi\u00A6mh\u00A6mg\u00A6mwr\u00A6bra\u00A6den\u00A6lv\u00A6lu\u00A6del\u00A6lt\u00A6lo\u00A6ln\u00A6li\u00A6ewo\u00A6lg\u00A6lb\u00A6la\u00A6jpr\u00A6vot\u00A6sit\u00A6ky\u00A6kw\u00A6kv\u00A6ku\u00A6sio\u00A6ks\u00A6kr\u00A6awa\u00A6ko\u00A6kn\u00A6km\u00A6kl\u00A6kk\u00A6rom\u00A6kj\u00A6sid\u00A6ki\u00A6kg\u00A6non\u00A6ka\u00A6mus\u00A6roa\u00A6nog\u00A6mun\u00A6mul\u00A6jv\u00A6gil\u00A6znd\u00A6shn\u00A6fon\u00A6xal\u00A6aus\u00A6kho\u00A6ja\u00A6khi\u00A6pau\u00A6chy\u00A6tai\u00A6iu\u00A6pap\u00A6it\u00A6sgn\u00A6is\u00A6kha\u00A6chr\u00A6pam\u00A6pal\u00A6chp\u00A6io\u00A6cho\u00A6chn\u00A6chm\u00A6tyv\u00A6bnt\u00A6pag\u00A6ik\u00A6chk\u00A6ii\u00A6haw\u00A6lam\u00A6ig\u00A6chg\u00A6sga\u00A6paa\u00A6ie\u00A6id\u00A6lah\u00A6day\u00A6chb\u00A6ia\u00A6lad\u00A6hz\u00A6hai\u00A6dar\u00A6hy\u00A6ath\u00A6hu\u00A6ht\u00A6dak\u00A6hr\u00A6ho\u00A6hi\u00A6dyu\u00A6he\u00A6ast\u00A6ha\u00A6wen\u00A6gv\u00A6gu\u00A6sem\u00A6sel\u00A6iro\u00A6gn\u00A6gl\u00A6arw\u00A6gez\u00A6art\u00A6gd\u00A6ira\u00A6ga\u00A6arp\u00A6arn\u00A6fy\u00A6bla\u00A6gem\u00A6ypk\u00A6arc\u00A6fr\u00A6fo\u00A6cel\u00A6fj\u00A6fi\u00A6ff\u00A6tvl\u00A6ceb\u00A6fa\u00A6eu\u00A6sco\u00A6et\u00A6es\u00A6eo\u00A6en\u00A6el\u00A6tut\u00A6niu\u00A6tup\u00A6ee\u00A6tum\u00A6mos\u00A6dz\u00A6nic\u00A6lus\u00A6fiu\u00A6dv\u00A6nia\u00A6moh\u00A6luo\u00A6lun\u00A6apa\u00A6lui\u00A6hup\u00A6bin\u00A6de\u00A6lua\u00A6bik\u00A6was\u00A6und\u00A6war\u00A6da\u00A6dum\u00A6wal\u00A6mno\u00A6wak\u00A6sat\u00A6cy\u00A6sas\u00A6kbd\u00A6cv\u00A6cu\u00A6mni\u00A6cs\u00A6sam\u00A6cr\u00A6sal\u00A6dua\u00A6co\u00A6sai\u00A6mnc\u00A6sah\u00A6kaw\u00A6inh\u00A6gba\u00A6sad\u00A6ch\u00A6ine\u00A6bho\u00A6enm\u00A6kar\u00A6inc\u00A6ce\u00A6gay\u00A6ca\u00A6umb\u00A6syr\u00A6kam\u00A6tsi\u00A6ang\u00A6kac\u00A6cau\u00A6kab\u00A6kaa\u00A6bs\u00A6car\u00A6br\u00A6bo\u00A6bn\u00A6bm\u00A6gaa\u00A6cai\u00A6bi\u00A6bh\u00A6bg\u00A6be\u00A6cad\u00A6ba\u00A6zu\u00A6zen\u00A6pro\u00A6hsb\u00A6az\u00A6ay\u00A6av\u00A6as\u00A6dsb\u00A6ar\u00A6ilo\u00A6elx\u00A6zh\u00A6an\u00A6pra\u00A6am\u00A6new\u00A6ak\u00A6za\u00A6af\u00A6ae\u00A6ab\u00A6yo\u00A6alg\u00A6ale\u00A6mkh\u00A6yi\u00A6dra\u00A6ber\u00A6nds\u00A6bem\u00A6bej\u00A6tpi";

  private static final String languagesValues = "Gv\u00eds\u00edn\u00A6Akkad\u00edska\u00A6Ekaj\u00fak\u00A6\u00cdj\u00f3\u00A6S\u00f3sa\u00A6S\u00famerska\u00A6S\u00fas\u00fa\u00A6\u00ddmis m\u00e1l\u00A6Los\u00ed\u00A6Tongverska\u00A6Ponpeiska\u00A6M\u00ednangkab\u00e1\u00A6S\u00fak\u00fama\u00A6Volof\u00A6Mong\u00f3\u00A6K\u00fatena\u00ed\u00A6Mikmak\u00A6Vall\u00f3nska\u00A6K\u00fam\u00edk\u00A6Sap\u00f3tek\u00A6K\u00fasit\u00edsk m\u00e1l (\u00f6nnur)\u00A6Lojban\u00A6Dogr\u00ed\u00A6Volap\u00fck\u00A6\u00d3tomm\u00e1l\u00A6V\u00edetnamska\u00A6Va\u00ed\u00A6Rar\u00f3tongska\u00A6Venda\u00A6Rapan\u00fa\u00ed\u00A6Rajastan\u00ed\u00A6Tyrkneska, ott\u00f3man (1500-1928)\u00A6Ns\u00edma\u00A6Nap\u00f3l\u00edska\u00A6\u00dasbekska\u00A6\u00dagar\u00edt\u00edska\u00A6Tamasjek\u00A6Ind\u00ed\u00e1nam\u00e1l Nor\u00f0ur-Amer\u00edku (\u00f6nnur)\u00A6Nah\u00faatl\u00A6\u00dard\u00fa\u00A6Fant\u00ed\u00A6\u00dakra\u00ednska\u00A6Fornegypska\u00A6\u00da\u00edg\u00far\u00A6Fang\u00A6N\u00edl\u00f3saharam\u00e1l (\u00f6nnur)\u00A6Mi\u00f0\u00edrska (900-1200)\u00A6Baltnesk m\u00e1l (\u00f6nnur)\u00A6Nj\u00f3r\u00f3\u00A6Basa\u00A6Njank\u00f3le\u00A6Njamves\u00ed\u00A6Hmong\u00A6Bal\u00edska\u00A6\u00d3sage\u00A6Bal\u00fak\u00ed\u00A6Tah\u00edt\u00edska\u00A6Bam\u00edlekem\u00e1l\u00A6Tv\u00ed\u00A6Serer\u00A6Tlingit\u00A6Tatarska\u00A6Tsonga\u00A6Banda\u00A6Tyrkneska\u00A6Tongverska\u00A6Ts\u00faana\u00A6Tagalog\u00A6T\u00farkmenska\u00A6T\u00edgrinja\u00A6Ta\u00edlenska\u00A6K\u00far\u00fak\u00A6Tadsjikska\u00A6Bl\u00edn\u00A6Tel\u00fag\u00fa\u00A6Kr\u00fa\u00A6Kas\u00fab\u00edska\u00A6Tam\u00edlska\u00A6T\u00f3kel\u00e1ska\u00A6Ef\u00edk\u00A6Svah\u00edl\u00ed\u00A6S\u00e6nska\u00A6S\u00fandanska\u00A6Karasa\u00edbalkar\u00A6Su\u00f0urs\u00f3t\u00f3\u00A6Svat\u00ed\u00A6Serbneska\u00A6Albanska\u00A6Mende\u00A6Kre\u00f3l- og pidginm\u00e1l (\u00f6nnur)\u00A6S\u00f3malska\u00A6Afr\u00edh\u00edl\u00ed\u00A6S\u00edn\u00f3t\u00edbesk m\u00e1l (\u00f6nnur)\u00A6Sam\u00f3ska\u00A6Sl\u00f3venska\u00A6Forngr\u00edska (til 1453)\u00A6Sl\u00f3vak\u00edska\u00A6Gerb\u00f3\u00A6Singales\u00edska\u00A6Serb\u00f3kr\u00f3at\u00edska\u00A6Kr\u00edmtyrkneska\u00A6Afr\u00f3as\u00edsk m\u00e1l (\u00f6nnur)\u00A6Sang\u00f3\u00A6Nor\u00f0ursam\u00edska\u00A6Sind\u00ed\u00A6\u00dadm\u00fart\u00A6Sard\u00ednska\u00A6Sanskr\u00edt\u00A6K\u00ednjarvanda\u00A6R\u00fassneska\u00A6Mandar\u00A6R\u00famenska\u00A6R\u00fand\u00ed\u00A6Ret\u00f3r\u00f3manska\u00A6Moksa\u00A6T\u00edv\u00A6Ad\u00fdge\u00A6S\u00fan\u00ed\u00A6Kpelle\u00A6Kvesj\u00faa\u00A6T\u00edgre\u00A6Songha\u00ed\u00A6Kre\u00f3l- og pidginm\u00e1l \u00e1 port\u00fag\u00f6lskum grunni\u00A6Sogd\u00eden\u00A6Adangme\u00A6Kosraska\u00A6Hettit\u00edska\u00A6Kre\u00f3l- og pidginm\u00e1l \u00e1 fr\u00f6nskum grunni\u00A6Kre\u00f3l- og pidginm\u00e1l \u00e1 enskum grunni\u00A6H\u00edmasjal\u00ed\u00A6Konkan\u00ed\u00A6H\u00edliga\u00ednon\u00A6Gotneska\u00A6Gorontal\u00f3\u00A6Gond\u00ed\u00A6Dinka\u00A6N\u00fab\u00edsk m\u00e1l\u00A6Port\u00fagalska\u00A6Past\u00fa\u00A6Fr\u00ed\u00falska\u00A6F\u00f6nik\u00edska\u00A6Fornh\u00e1\u00fe\u00fdska (um 750-1050)\u00A6S\u00f3ninke\u00A6Kopt\u00edska\u00A6Jap\u00edska\u00A6Ak\u00f3l\u00ed\u00A6Ja\u00f3\u00A6Filippseysk m\u00e1l (\u00f6nnur)\u00A6P\u00f3lska\u00A6Akk\u00edska\u00A6Pal\u00ed\u00A6P\u00fanjab\u00ed\u00A6B\u00fag\u00edska\u00A6\u00cdban\u00A6Skoltesam\u00edska\u00A6B\u00far\u00edat\u00A6Masa\u00ed\u00A6Enaresam\u00edska\u00A6Osset\u00edska\u00A6\u00c1str\u00f3nes\u00edska\u00A6\u00d3r\u00eda\u00A6Manding\u00f3\u00A6L\u00falesam\u00edska\u00A6Sam\u00edsk m\u00e1l (\u00f6nnur)\u00A6Makasar\u00A6\u00d3r\u00f3m\u00f3\u00A6Ma\u00edt\u00edl\u00ed\u00A6Ojibva\u00A6Magah\u00ed\u00A6Mad\u00farska\u00A6Su\u00f0ursam\u00edska\u00A6Okkit\u00edska (eftir 1500); Pr\u00f3vensalska\u00A6Nor\u00f0urs\u00f3t\u00f3\u00A6Batak\u00A6Ersja\u00A6Dogr\u00edb\u00A6Njanja; S\u00edsjeva; Sjeva\u00A6Majam\u00e1l\u00A6Navah\u00f3\u00A6Kimb\u00fand\u00fa\u00A6Su\u00f0urndebele\u00A6Mi\u00f0h\u00e1\u00fe\u00fdska (um 1050-1500\u00A6Norska\u00A6N\u00fdnorska\u00A6Hollenska\u00A6Ndonga\u00A6Slavnesk m\u00e1l (\u00f6nnur)\u00A6Nepalska\u00A6Nor\u00f0urndebele\u00A6Kam\u00edsk m\u00e1l\u00A6Tet\u00fam\u00A6Norskt b\u00f3km\u00e1l\u00A6N\u00e1r\u00faska\u00A6Teren\u00f3\u00A6T\u00edmne\u00A6Burmneska\u00A6Lesg\u00edska\u00A6Maltneska\u00A6Fornpersneska\u00A6Mala\u00edska\u00A6Marat\u00ed\u00A6Fornfranska (842 - um 1400)\u00A6Mold\u00f3vska\u00A6Mi\u00f0franska (um 1400-1600)\u00A6Mong\u00f3lska\u00A6Gy\u00f0ingaarab\u00edska\u00A6Malajalam\u00A6Maked\u00f3nska\u00A6Ma\u00f3r\u00ed\u00A6Marshallska\u00A6Malagas\u00edska\u00A6Marvar\u00ed\u00A6Bra\u00ed\u00A6Slav\u00A6Lettneska\u00A6L\u00fabakatanga\u00A6Delaver\u00A6Lith\u00e1\u00edska\u00A6La\u00f3\u00A6Lingala\u00A6Limb\u00farg\u00edska\u00A6Evond\u00f3\u00A6Ganda\u00A6L\u00faxemborg\u00edska\u00A6Lat\u00edna\u00A6Gy\u00f0ingapersneska\u00A6Vot\u00edska\u00A6S\u00edn\u00f3t\u00edbesk m\u00e1l (\u00f6nnur)\u00A6Kirgiska\u00A6Korn\u00edska\u00A6Kom\u00edska\u00A6K\u00fardneska\u00A6S\u00ed\u00fam\u00e1l\u00A6Kasm\u00edrska\u00A6Kan\u00far\u00ed\u00A6Avad\u00ed\u00A6K\u00f3reska\u00A6Kannada\u00A6Kmer\u00A6Gr\u00e6nlenska\u00A6Kasakska\u00A6Roman\u00ed\u00A6K\u00faanjama\u00A6S\u00eddam\u00f3\u00A6K\u00edk\u00faj\u00fa\u00A6Kong\u00f3\u00A6Norr\u00e6na\u00A6Georg\u00edska\u00A6Kr\u00edk\u00A6R\u00f3m\u00f6nsk m\u00e1l (\u00f6nnur)\u00A6N\u00f3ga\u00ed\u00A6M\u00fandam\u00e1l\u00A6Margv\u00edsleg m\u00e1l\u00A6Javanska\u00A6Gilberska\u00A6Sande\u00A6Sjan\u00A6F\u00f3n\u00A6Kalm\u00fakska\u00A6\u00c1str\u00f6lsk m\u00e1l\u00A6Kotaska\u00A6Japanska\u00A6Ko\u00edm\u00e1l (\u00f6nnur)\u00A6Pal\u00e1ska\u00A6Sjeyen\u00A6Ta\u00edm\u00e1l (\u00f6nnur)\u00A6In\u00faktit\u00fat\u00A6Pap\u00edament\u00f3\u00A6\u00cdtalska\u00A6T\u00e1knm\u00e1l\u00A6\u00cdslenska\u00A6Kas\u00ed\u00A6Sjer\u00f3k\u00ed\u00A6Pampanga\u00A6Palav\u00ed\u00A6S\u00edpev\u00edska\u00A6\u00cdd\u00f3\u00A6Sjokt\u00e1\u00A6S\u00edn\u00fak\u00A6Mar\u00ed\u00A6T\u00fav\u00ednska\u00A6Bant\u00fam\u00e1l\u00A6Pangas\u00ednm\u00e1l\u00A6\u00cdn\u00fap\u00edak\u00A6Sj\u00fak\u00edska\u00A6S\u00eds\u00faanj\u00ed\u00A6Hava\u00edska\u00A6Lamba\u00A6\u00cdgb\u00f3\u00A6Sjagata\u00ed\u00A6Forn\u00edrska (til 900)\u00A6Pap\u00fask m\u00e1l (\u00f6nnur)\u00A6Interlingva\u00A6Ind\u00f3nes\u00edska\u00A6Landa\u00A6Dajak\u00A6S\u00edbsja\u00A6Interlingva\u00A6Lad\u00ednska\u00A6Herer\u00f3\u00A6Ha\u00edda\u00A6Dargva\u00A6Armenska\u00A6Atapask\u00edsk m\u00e1l\u00A6Ungverska\u00A6Ha\u00edt\u00edska\u00A6Dak\u00f3ta\u00A6Kr\u00f3at\u00edska\u00A6H\u00edr\u00edm\u00f3t\u00fa\u00A6Hind\u00ed\u00A6Dj\u00fala\u00A6Hebreska\u00A6Ast\u00far\u00edska\u00A6H\u00e1sa\u00A6Sorbnesk m\u00e1l\u00A6Manx\u00A6G\u00fajarat\u00ed\u00A6Sem\u00edsk m\u00e1l (\u00f6nnur)\u00A6Selk\u00fap\u00A6\u00cdr\u00f3kesk m\u00e1l\u00A6Gvaran\u00ed\u00A6Gallegska\u00A6Aravakska\u00A6G\u00eds\u00A6Al\u00fej\u00f3\u00f0am\u00e1l (\u00f6nnur)\u00A6Skosk gel\u00edska\u00A6\u00cdranska\u00A6\u00cdrska\u00A6Arapah\u00f3\u00A6Ar\u00e1kan\u00edska\u00A6Fr\u00edsneska\u00A6Siksika\u00A6Germ\u00f6nsk m\u00e1l (\u00f6nnur)\u00A6J\u00fap\u00edsk m\u00e1l\u00A6Arame\u00edska\u00A6Franska\u00A6F\u00e6reyska\u00A6Keltnesk (\u00f6nnur)\u00A6F\u00eddjeyska\u00A6Finnska\u00A6F\u00fala\u00A6T\u00faval\u00faska\u00A6Keb\u00faan\u00f3\u00A6Persneska\u00A6Baskneska\u00A6Skoska\u00A6Eistneska\u00A6Sp\u00e6nska\u00A6Esperant\u00f3\u00A6Enska\u00A6N\u00fdgr\u00edska (1453-)\u00A6Alta\u00edsk m\u00e1l (\u00f6nnur)\u00A6N\u00edveska\u00A6T\u00fap\u00edm\u00e1l\u00A6Eve\u00A6T\u00famb\u00faka\u00A6Moss\u00ed\u00A6Dsongka\u00A6N\u00edgerkord\u00f3fanm\u00e1l (\u00f6nnur)\u00A6L\u00fasa\u00ed\u00A6Finnsk\u00fagr\u00edsk m\u00e1l (\u00f6nnur)\u00A6D\u00edveh\u00ed\u00A6N\u00edas\u00A6M\u00f3h\u00edska\u00A6L\u00fa\u00f3\u00A6L\u00fanda\u00A6Apatsjam\u00e1l\u00A6L\u00faisen\u00f3\u00A6H\u00fapa\u00A6B\u00edn\u00ed\u00A6\u00de\u00fdska\u00A6L\u00fabal\u00fal\u00faa\u00A6B\u00edkol\u00A6Vasj\u00f3\u00A6\u00d3lj\u00f3st\u00A6Vara\u00ed\u00A6Danska\u00A6Mi\u00f0hollenska (um 1050-1350)\u00A6Valam\u00f3\u00A6Man\u00f3b\u00f3m\u00e1l\u00A6Vakasm\u00e1l\u00A6Santal\u00ed\u00A6Velska\u00A6Sasak\u00A6Kabard\u00edska\u00A6Sj\u00favas\u00A6Kirkjuslavneska\u00A6Man\u00edp\u00far\u00ed\u00A6T\u00e9kkneska\u00A6Samversk arame\u00edska\u00A6Kr\u00ed\u00A6Sal\u00edsm\u00e1l\u00A6D\u00faala\u00A6Kors\u00edska\u00A6Ind\u00ed\u00e1nam\u00e1l Su\u00f0ur-Amer\u00edku (\u00f6nnur)\u00A6Mansj\u00fa\u00A6Jak\u00fat\u00A6Kav\u00ed\u00A6Ing\u00fas\u00A6Gbaja\u00A6Sandave\u00A6Kamorr\u00f3\u00A6Ind\u00f3evr\u00f3psk m\u00e1l (\u00f6nnur)\u00A6Bojp\u00far\u00ed\u00A6Mi\u00f0enska (1100-1500)\u00A6Karen\u00A6Indversk m\u00e1l (\u00f6nnur)\u00A6Tsjetsjenska\u00A6Gaj\u00f3\u00A6Katal\u00f3nska\u00A6\u00damb\u00fand\u00fa\u00A6S\u00fdrlenska\u00A6Kamba\u00A6Tsims\u00edska\u00A6Fornenska (um 450-1100)\u00A6Kas\u00edn\u00A6K\u00e1kasusm\u00e1l (\u00f6nnur)\u00A6Kab\u00edle\u00A6Karakalpak\u00A6Bosn\u00edska\u00A6Kar\u00edbam\u00e1l\u00A6Bret\u00f3nska\u00A6T\u00edbeska\u00A6Bengalska\u00A6Bambara\u00A6Ga\u00A6Ind\u00ed\u00e1nam\u00e1l Mi\u00f0-Amer\u00edku (\u00f6nnur)\u00A6B\u00edslama\u00A6B\u00edhar\u00ed\u00A6B\u00falgarska\u00A6Hv\u00edtr\u00fassneska\u00A6Kadd\u00f3\u00A6Bask\u00edr\u00A6S\u00fal\u00fa\u00A6Senaga\u00A6Fornpr\u00f3vensalska (til 1500)\u00A6H\u00e1sorbneska\u00A6Aserska\u00A6A\u00edmara\u00A6Avar\u00edska\u00A6Assamska\u00A6L\u00e1gsorbneska\u00A6Arab\u00edska\u00A6\u00cdlok\u00f3\u00A6Elam\u00edt\u00A6K\u00ednverska\u00A6Aragonska\u00A6Prakr\u00edtm\u00e1l\u00A6Amhar\u00edska\u00A6Nevar\u00ed\u00A6Akan\u00A6S\u00faang\u00A6Afr\u00edkanska\u00A6Avest\u00edska\u00A6Abkas\u00edska\u00A6J\u00f3r\u00faba\u00A6Algonkv\u00ednsk m\u00e1l\u00A6Ale\u00faska\u00A6Monkmerm\u00e1l (\u00f6nnur)\u00A6Jidd\u00edska\u00A6Dravid\u00edsk m\u00e1l (\u00f6nnur)\u00A6Berbam\u00e1l\u00A6L\u00e1g\u00fe\u00fdska; L\u00e1gsaxneska\u00A6Bemba\u00A6Beja\u00A6Tokpisin";

  private static final Hashtable languages;
  static
  {
    languages = new Hashtable();
    Enumeration keys = new StringTokenizer(languagesKeys, "\u00A6");
    Enumeration values = new StringTokenizer(languagesValues, "\u00A6");
    while (keys.hasMoreElements())
      {
         String key = (String) keys.nextElement();
         String value = (String) values.nextElement();
         languages.put(key, value);
      }
  }

  private static final Object[][] contents =
  {
    { "decimalSeparator", "," },
    { "groupingSeparator", "." },
    { "currenciesDisplayName", currenciesDisplayName },
    { "currenciesSymbol", currenciesSymbol },
    { "shortMonths", shortMonths },
    { "months", months },
    { "shortWeekdays", shortWeekdays },
    { "weekdays", weekdays },
    { "shortDateFormat", "d.M.yyyy" },
    { "mediumDateFormat", "d.M.yyyy" },
    { "longDateFormat", "d. MMMM yyyy" },
    { "fullDateFormat", "EEEE, d. MMMM yyyy" },
    { "territories", territories },
    { "languages", languages },
  };

  public Object[][] getContents() { return contents; }
}
