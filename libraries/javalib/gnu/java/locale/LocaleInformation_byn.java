/* LocaleInformation_byn.java --
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

public class LocaleInformation_byn extends ListResourceBundle
{
  private static final String currenciesDisplayNameKeys = "ERN";

  private static final String currenciesDisplayNameValues = "ERN";

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

  private static final String currenciesSymbolKeys = "ERN\u00A6USD";

  private static final String currenciesSymbolValues = "$\u00A6US$";

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
    "\u120d\u12f0\u1275",
    "\u12ab\u1265\u12bd",
    "\u12ad\u1265\u120b",
    "\u134b\u1305\u12ba",
    "\u12ad\u1262\u1245",
    "\u121d/\u1275",
    "\u12b0\u122d",
    "\u121b\u122d\u12eb",
    "\u12eb\u12b8\u1292",
    "\u1218\u1270\u1209",
    "\u121d/\u121d",
    "\u1270\u1215\u1233",
    null,
  };

  private static final String[] months = {
    "\u120d\u12f0\u1275\u122a",
    "\u12ab\u1265\u12bd\u1265\u1272",
    "\u12ad\u1265\u120b",
    "\u134b\u1305\u12ba\u122a",
    "\u12ad\u1262\u1245\u122a",
    "\u121d\u12aa\u12a4\u120d \u1275\u1313\u0305\u1292\u122a",
    "\u12b0\u122d\u12a9",
    "\u121b\u122d\u12eb\u121d \u1275\u122a",
    "\u12eb\u12b8\u1292 \u1218\u1233\u1245\u1208\u122a",
    "\u1218\u1270\u1209",
    "\u121d\u12aa\u12a4\u120d \u1218\u123d\u12c8\u122a",
    "\u1270\u1215\u1233\u1235\u122a",
    null,
  };

  private static final String[] shortWeekdays = {
    null,
    "\u1230/\u1245",
    "\u1230\u1291",
    "\u1230\u120a\u131d",
    "\u1208\u1313",
    "\u12a3\u121d\u12f5",
    "\u12a3\u122d\u1265",
    "\u1230/\u123d",
  };

  private static final String[] weekdays = {
    null,
    "\u1230\u1295\u1260\u122d \u1245\u12f3\u12c5",
    "\u1230\u1291",
    "\u1230\u120a\u131d",
    "\u1208\u1313 \u12c8\u122a \u1208\u1265\u12cb",
    "\u12a3\u121d\u12f5",
    "\u12a3\u122d\u1265",
    "\u1230\u1295\u1260\u122d \u123d\u1313\u12c5",
  };

  private static final String[] eras = {
    "\u12ed\u1305",
    "\u12a3\u12f5",
  };

  private static final String[] ampms = {
    "\u134b\u12f1\u1235 \u1303\u1265",
    "\u134b\u12f1\u1235 \u12f0\u121d\u1262",
  };

  private static final String territoriesKeys = "AU\u00A6TD\u00A6GY\u00A6AT\u00A6GW\u00A6AR\u00A6MY\u00A6MX\u00A6AN\u00A6GR\u00A6AM\u00A6ZA\u00A6GQ\u00A6AL\u00A6MU\u00A6SY\u00A6MT\u00A6GN\u00A6MR\u00A6GM\u00A6MO\u00A6AE\u00A6MN\u00A6AD\u00A6YU\u00A6SP\u00A6MK\u00A6GF\u00A6SO\u00A6GE\u00A6SN\u00A6GB\u00A6SK\u00A6SI\u00A6MD\u00A6SG\u00A6MA\u00A6SE\u00A6SD\u00A6SA\u00A6YE\u00A6LY\u00A6LV\u00A6LT\u00A6FM\u00A6RU\u00A6FJ\u00A6FI\u00A6RO\u00A6LB\u00A6ET\u00A6ES\u00A6KW\u00A6ER\u00A6KR\u00A6KP\u00A6KM\u00A6EH\u00A6EG\u00A6EE\u00A6KH\u00A6EC\u00A6DZ\u00A6DO\u00A6DM\u00A6JP\u00A6DK\u00A6JO\u00A6PR\u00A6JM\u00A6DE\u00A6PL\u00A6PG\u00A6PF\u00A6PE\u00A6CZ\u00A6VI\u00A6CY\u00A6VG\u00A6CV\u00A6VE\u00A6IT\u00A6CO\u00A6IS\u00A6CN\u00A6CM\u00A6IQ\u00A6CL\u00A6UZ\u00A6IN\u00A6CH\u00A6IL\u00A6CF\u00A6US\u00A6CD\u00A6IE\u00A6ID\u00A6BZ\u00A6BY\u00A6UG\u00A6BT\u00A6BR\u00A6NZ\u00A6HU\u00A6HT\u00A6BO\u00A6HR\u00A6BM\u00A6TZ\u00A6BH\u00A6BG\u00A6NP\u00A6HK\u00A6TT\u00A6NO\u00A6BE\u00A6TR\u00A6NL\u00A6BB\u00A6BA\u00A6TN\u00A6TL\u00A6NG\u00A6TJ\u00A6AZ\u00A6ZM\u00A6TH\u00A6NC\u00A6TF\u00A6NA";

  private static final String territoriesValues = "\u12a0\u12cd\u1235\u1275\u122c\u120a\u12eb\u00A6\u127b\u12f5\u00A6\u1309\u12eb\u1293\u00A6\u12a6\u1235\u1275\u122a\u12eb\u00A6\u1262\u1233\u12ce\u00A6\u12a0\u122d\u1300\u1295\u1272\u1293\u00A6\u121b\u120c\u12e2\u12eb\u00A6\u121c\u12ad\u1232\u12ae\u00A6\u1294\u12d8\u122d\u120b\u1295\u12f5\u1235 \u12a0\u1295\u1272\u120d\u1235\u00A6\u130d\u122a\u12ad\u00A6\u12a0\u122d\u121c\u1292\u12eb\u00A6\u12f0\u1261\u1265 \u12a0\u134d\u122a\u12ab\u00A6\u12a2\u12b3\u1276\u122a\u12eb\u120d \u130a\u1292\u00A6\u12a0\u120d\u1263\u1292\u12eb\u00A6\u121b\u1229\u1238\u1235\u00A6\u1232\u122a\u12eb\u00A6\u121b\u120d\u1273\u00A6\u130a\u1292\u00A6\u121e\u122a\u1274\u1292\u12eb\u00A6\u130b\u121d\u1262\u12eb\u00A6\u121b\u12ab\u12ce\u00A6\u12e8\u1270\u1263\u1260\u1229\u1275 \u12a0\u1228\u1265 \u12a4\u121d\u122c\u1275\u1235\u00A6\u121e\u1295\u130e\u120a\u12eb\u00A6\u12a0\u1295\u12f6\u122b\u00A6\u12e9\u130e\u12dd\u120b\u126a\u12eb\u00A6\u1230\u122d\u1262\u12eb\u00A6\u121b\u12a8\u12f6\u1292\u12eb\u00A6\u12e8\u1348\u1228\u1295\u1233\u12ed \u1309\u12ca\u12a0\u1293\u00A6\u1231\u121b\u120c\u00A6\u1306\u122d\u1302\u12eb\u00A6\u1234\u1294\u130b\u120d\u00A6\u12a5\u1295\u130d\u120a\u12dd\u00A6\u1235\u120e\u126b\u12aa\u12eb\u00A6\u1235\u120e\u126c\u1292\u12eb\u00A6\u121e\u120d\u12f6\u126b\u00A6\u1232\u1295\u130b\u1356\u122d\u00A6\u121e\u122e\u12ae\u00A6\u1235\u12ca\u12f5\u1295\u00A6\u1231\u12f3\u1295\u00A6\u1233\u12cd\u12f5\u12a0\u1228\u1262\u12eb\u00A6\u12e8\u1218\u1295\u00A6\u120a\u1262\u12eb\u00A6\u120b\u1275\u126a\u12eb\u00A6\u120a\u1271\u12cc\u1292\u12eb\u00A6\u121a\u12ad\u122e\u1294\u12e2\u12eb\u00A6\u122b\u123a\u12eb\u00A6\u134a\u1302\u00A6\u134a\u1295\u120b\u1295\u12f5\u00A6\u122e\u121c\u1292\u12eb\u00A6\u120a\u1263\u1296\u1235\u00A6\u12a2\u1275\u12ee\u1335\u12eb\u00A6\u1235\u1354\u1295\u00A6\u12ad\u12cc\u1275\u00A6\u12a4\u122d\u1275\u122b\u00A6\u1230\u121c\u1295 \u12ae\u122a\u12eb\u00A6\u12f0\u1261\u1265 \u12ae\u122a\u12eb\u00A6\u12ae\u121e\u122e\u1235\u00A6\u121d\u12d5\u122b\u1263\u12ca \u1233\u1205\u122b\u00A6\u130d\u1265\u133d\u00A6\u12a4\u1235\u1276\u1292\u12eb\u00A6\u12ab\u121d\u1266\u12f2\u12eb\u00A6\u12a2\u12b3\u12f6\u122d\u00A6\u12a0\u120d\u1304\u122a\u12eb\u00A6\u12f6\u121a\u1292\u12ad \u122a\u1351\u1265\u120a\u12ad\u00A6\u12f6\u121a\u1292\u12ab\u00A6\u1303\u1353\u1295\u00A6\u12f4\u1295\u121b\u122d\u12ad\u00A6\u1306\u122d\u12f3\u1295\u00A6\u1356\u122d\u1273 \u122a\u12ae\u00A6\u1303\u121b\u12ed\u12ab\u00A6\u1300\u122d\u1218\u1295\u00A6\u1356\u120b\u1295\u12f5\u00A6\u1353\u1351\u12cb \u1292\u12cd \u130a\u1292\u00A6\u12e8\u1348\u1228\u1295\u1233\u12ed \u1356\u120a\u1294\u12e2\u12eb\u00A6\u1354\u1229\u00A6\u127c\u12ad \u122a\u1351\u1265\u120a\u12ad\u00A6\u12e8\u12a0\u121c\u122a\u12ab \u1268\u122d\u1302\u1295 \u12f0\u1234\u1276\u127d\u00A6\u1233\u12ed\u1355\u1228\u1235\u00A6\u12e8\u12a5\u1295\u130d\u120a\u12dd \u12f5\u1295\u130d\u120d \u12f0\u1234\u1276\u127d\u00A6\u12ac\u1355 \u126c\u122d\u12f4\u00A6\u126c\u1295\u12d9\u12cc\u120b\u00A6\u1323\u120a\u12eb\u1295\u00A6\u12ae\u120e\u121d\u1262\u12eb\u00A6\u12a0\u12ed\u1235\u120b\u1295\u12f5\u00A6\u127b\u12ed\u1293\u00A6\u12ab\u121c\u1229\u1295\u00A6\u12a2\u122b\u1245\u00A6\u127a\u120a\u00A6\u12e9\u12dd\u1260\u12aa\u1235\u1273\u1295\u00A6\u1205\u1295\u12f5\u00A6\u1235\u12ca\u12d8\u122d\u120b\u1295\u12f5\u00A6\u12a5\u1235\u122b\u12a4\u120d\u00A6\u12e8\u1218\u12ab\u12a8\u1208\u129b\u12cd \u12a0\u134d\u122a\u12ab \u122a\u1350\u1265\u120a\u12ad\u00A6\u12a0\u121c\u122a\u12ab\u00A6\u12ae\u1295\u130e\u00A6\u12a0\u12e8\u122d\u120b\u1295\u12f5\u00A6\u12a2\u1295\u12f6\u1294\u12e2\u12eb\u00A6\u1264\u120a\u12d8\u00A6\u1264\u120b\u1229\u1235\u00A6\u12e9\u130b\u1295\u12f3\u00A6\u1261\u1205\u1273\u1295\u00A6\u1265\u122b\u12da\u120d\u00A6\u1292\u12cd \u12da\u120b\u1295\u12f5\u00A6\u1200\u1295\u130b\u122a\u00A6\u1200\u12ed\u1272\u00A6\u1266\u120a\u126a\u12eb\u00A6\u12ad\u122e\u12a4\u123d\u12eb\u00A6\u1264\u122d\u1219\u12f3\u00A6\u1273\u1295\u12db\u1292\u12eb\u00A6\u1263\u1205\u122c\u1295\u00A6\u1261\u120d\u130c\u122a\u12eb\u00A6\u1294\u1353\u120d\u00A6\u1206\u1295\u130d \u12ae\u1295\u130d\u00A6\u1275\u122a\u1292\u12f3\u12f5 \u12a5\u1293 \u1276\u1263\u130e\u00A6\u1296\u122d\u12cc\u00A6\u1264\u120d\u1304\u121d\u00A6\u1271\u122d\u12ad\u00A6\u1294\u12d8\u122d\u120b\u1295\u12f5\u00A6\u1263\u122d\u1264\u12f6\u1235\u00A6\u1266\u1235\u1292\u12eb \u12a5\u1293 \u1204\u122d\u12de\u130e\u126a\u1292\u12eb\u00A6\u1271\u1292\u12da\u12eb\u00A6\u121d\u1235\u122b\u1245 \u1272\u121e\u122d\u00A6\u1293\u12ed\u1304\u122a\u12eb\u00A6\u1273\u1303\u12aa\u1235\u1273\u1295\u00A6\u12a0\u12d8\u122d\u1263\u1303\u1295\u00A6\u12db\u121d\u1262\u12eb\u00A6\u1273\u12ed\u120b\u1295\u12f5\u00A6\u1292\u12cd \u12ab\u120c\u12f6\u1292\u12eb\u00A6\u12e8\u1348\u1228\u1295\u1233\u12ed \u12f0\u1261\u1263\u12ca \u130d\u12db\u1276\u127d\u00A6\u1293\u121a\u1262\u12eb";

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

  private static final String languagesKeys = "es\u00A6ku\u00A6eo\u00A6ks\u00A6en\u00A6el\u00A6qu\u00A6ko\u00A6kn\u00A6km\u00A6kl\u00A6kk\u00A6wo\u00A6ka\u00A6dz\u00A6jv\u00A6pt\u00A6ps\u00A6de\u00A6pl\u00A6da\u00A6vo\u00A6ja\u00A6vi\u00A6cy\u00A6pa\u00A6cs\u00A6iu\u00A6it\u00A6co\u00A6is\u00A6uz\u00A6or\u00A6ik\u00A6ur\u00A6om\u00A6ca\u00A6ie\u00A6id\u00A6uk\u00A6ia\u00A6oc\u00A6ug\u00A6hy\u00A6br\u00A6hu\u00A6bo\u00A6bn\u00A6hr\u00A6bi\u00A6tw\u00A6bh\u00A6bg\u00A6tt\u00A6no\u00A6be\u00A6ts\u00A6hi\u00A6tr\u00A6nl\u00A6zu\u00A6ba\u00A6to\u00A6he\u00A6tn\u00A6tl\u00A6tk\u00A6ha\u00A6ne\u00A6az\u00A6ti\u00A6ay\u00A6th\u00A6tg\u00A6na\u00A6te\u00A6zh\u00A6as\u00A6ar\u00A6ta\u00A6gu\u00A6my\u00A6am\u00A6za\u00A6mt\u00A6ms\u00A6byn\u00A6gn\u00A6sw\u00A6mr\u00A6sv\u00A6gl\u00A6su\u00A6af\u00A6st\u00A6mo\u00A6ss\u00A6mn\u00A6gez\u00A6sr\u00A6sq\u00A6ml\u00A6ab\u00A6mk\u00A6aa\u00A6so\u00A6sn\u00A6mi\u00A6gd\u00A6sm\u00A6sl\u00A6mg\u00A6tig\u00A6sk\u00A6ga\u00A6yo\u00A6si\u00A6sg\u00A6yi\u00A6sd\u00A6fy\u00A6sid\u00A6sa\u00A6fr\u00A6lv\u00A6lt\u00A6fo\u00A6rw\u00A6ru\u00A6lo\u00A6fj\u00A6ln\u00A6fi\u00A6ro\u00A6rn\u00A6rm\u00A6fa\u00A6la\u00A6xh\u00A6eu\u00A6ky\u00A6et";

  private static final String languagesValues = "\u1235\u1353\u1292\u123d\u00A6\u12a9\u122d\u12f5\u123d\u129b\u00A6\u12a4\u1235\u1350\u122b\u1295\u1276\u00A6\u12ab\u123d\u121a\u122d\u129b\u00A6\u12a5\u1295\u130d\u120a\u12dd\u129b\u00A6\u130d\u122a\u12ad\u129b\u00A6\u12b5\u127f\u129b\u00A6\u12ae\u122a\u12eb\u129b\u00A6\u12ab\u1293\u12f3\u129b\u00A6\u12ad\u1218\u122d\u129b\u00A6\u12ab\u120b\u120a\u1231\u1275\u129b\u00A6\u12ab\u12db\u12ad\u129b\u00A6\u12ce\u120e\u134d\u129b\u00A6\u130a\u12ee\u122d\u130a\u12eb\u1295\u00A6\u12f5\u12de\u1295\u130d\u12bb\u129b\u00A6\u1303\u126b\u1295\u129b\u00A6\u1356\u122d\u1271\u130b\u120a\u129b\u00A6\u1351\u123d\u1276\u129b\u00A6\u1300\u122d\u1218\u1295\u00A6\u1356\u120a\u123d\u00A6\u12f4\u1292\u123d\u00A6\u126e\u120b\u1351\u12ad\u129b\u00A6\u1303\u1353\u1295\u129b\u00A6\u126a\u1275\u1293\u121d\u129b\u00A6\u12c8\u120d\u123d\u00A6\u1353\u1295\u1303\u1262\u129b\u00A6\u127c\u12ad\u129b\u00A6\u12a5\u1291\u12ad\u1272\u1271\u1275\u129b\u00A6\u1323\u120a\u12eb\u1295\u129b\u00A6\u12ae\u122d\u1232\u12ab\u129b\u00A6\u12a0\u12ed\u1235\u120b\u1295\u12f5\u129b\u00A6\u12a1\u12dd\u1260\u12ad\u129b\u00A6\u12a6\u122a\u12eb\u129b\u00A6\u12a5\u1291\u1352\u12eb\u1245\u129b\u00A6\u12a1\u122d\u12f1\u129b\u00A6\u12a6\u122e\u121d\u129b\u00A6\u12ab\u1273\u120b\u1295\u129b\u00A6\u12a5\u1295\u1270\u122d\u120a\u1295\u130d\u12c8\u00A6\u12a5\u1295\u12f6\u1292\u1232\u129b\u00A6\u12e9\u12ad\u1228\u1292\u129b\u00A6\u12a2\u1295\u1274\u122d\u120a\u1295\u1313\u00A6\u12a6\u12aa\u1273\u1295\u129b\u00A6\u12a1\u12ca\u130d\u1201\u122d\u129b\u00A6\u12a0\u122d\u1218\u1293\u12ca\u00A6\u1265\u122c\u1276\u1295\u129b\u00A6\u1200\u1295\u130b\u122a\u129b\u00A6\u1275\u1260\u1275\u1295\u129b\u00A6\u1260\u1295\u130b\u120a\u129b\u00A6\u12ad\u122e\u123d\u12eb\u1295\u129b\u00A6\u1262\u1235\u120b\u121d\u129b\u00A6\u1275\u12ca\u129b\u00A6\u1262\u1203\u122a\u00A6\u1261\u120d\u130b\u122a\u129b\u00A6\u1273\u1273\u122d\u129b\u00A6\u1296\u122d\u12cc\u1302\u12eb\u1295\u00A6\u1264\u120b\u122b\u123b\u129b\u00A6\u133e\u1295\u130b\u129b\u00A6\u1210\u1295\u12f5\u129b\u00A6\u1271\u122d\u12ad\u129b\u00A6\u12f0\u127d\u00A6\u12d9\u1209\u129b\u00A6\u1263\u1235\u12aa\u122d\u129b\u00A6\u1276\u1295\u130b\u00A6\u12d5\u1265\u122b\u1235\u1325\u00A6\u133d\u12cb\u1293\u12ca\u129b\u00A6\u1273\u130b\u120e\u1308\u129b\u00A6\u1271\u122d\u12ad\u1218\u1295\u129b\u00A6\u1203\u12cd\u1233\u129b\u00A6\u1294\u1353\u120a\u129b\u00A6\u12a0\u12dc\u122d\u1263\u12ed\u1303\u1295\u129b\u00A6\u1275\u130d\u122d\u129b\u00A6\u12a0\u12eb\u121b\u122d\u129b\u00A6\u1273\u12ed\u129b\u00A6\u1273\u1302\u12aa\u129b\u00A6\u1293\u12a1\u1229\u00A6\u1270\u1209\u1309\u129b\u00A6\u127b\u12ed\u1295\u129b\u00A6\u12a0\u1233\u121c\u12db\u12ca\u00A6\u12d0\u122d\u1262\u129b\u00A6\u1273\u121a\u120d\u129b\u00A6\u1309\u1303\u122d\u1272\u129b\u00A6\u1261\u122d\u121b\u129b\u00A6\u12a0\u121b\u122d\u129b\u00A6\u12e1\u12cb\u1295\u130d\u129b\u00A6\u121b\u120d\u1272\u1235\u129b\u00A6\u121b\u120b\u12ed\u129b\u00A6\u1265\u120a\u1295\u00A6\u1313\u122b\u1292\u129b\u00A6\u1235\u12cb\u1202\u120a\u129b\u00A6\u121b\u122b\u12da\u129b\u00A6\u1235\u12ca\u12f5\u1295\u129b\u00A6\u130b\u1208\u130b\u129b\u00A6\u1231\u12f3\u1295\u129b\u00A6\u12a0\u134d\u122a\u1243\u1295\u1235\u129b\u00A6\u1236\u12de\u129b\u00A6\u121e\u120d\u12f3\u126b\u12ca\u1293\u00A6\u1235\u12cb\u1272\u129b\u00A6\u121e\u1295\u130e\u120b\u12ca\u129b\u00A6\u130d\u12d5\u12dd\u129b\u00A6\u1230\u122d\u1262\u129b\u00A6\u120d\u1264\u1292\u129b\u00A6\u121b\u120b\u12eb\u120b\u121d\u129b\u00A6\u12a0\u1265\u1210\u12da\u129b\u00A6\u121b\u12a8\u12f6\u1292\u129b\u00A6\u12a0\u134b\u122d\u129b\u00A6\u1231\u121b\u120d\u129b\u00A6\u123e\u1293\u129b\u00A6\u121b\u12ee\u122a\u129b\u00A6\u12a5\u1235\u12ae\u1275\u1235 \u130c\u120d\u12ad\u129b\u00A6\u1233\u121e\u12a0\u129b\u00A6\u1235\u120e\u126a\u129b\u00A6\u121b\u120b\u130b\u1235\u129b\u00A6\u1275\u130d\u1228\u00A6\u1235\u120e\u126b\u12ad\u129b\u00A6\u12a0\u12ed\u122a\u123d\u00A6\u12ee\u1229\u1263\u12ca\u129b\u00A6\u1235\u1295\u1203\u120d\u129b\u00A6\u1233\u1295\u130e\u129b\u00A6\u12ed\u12f2\u123b\u12ca\u129b\u00A6\u1232\u1295\u12f5\u1202\u129b\u00A6\u134d\u122a\u1235\u129b\u00A6\u1232\u12f3\u121d\u129b\u00A6\u1233\u1295\u1235\u12ad\u122a\u1275\u129b\u00A6\u1348\u1228\u1295\u1233\u12ed\u129b\u00A6\u120b\u1275\u126a\u12eb\u1295\u00A6\u120a\u1271\u12a0\u1292\u12eb\u1295\u00A6\u134b\u122e\u129b\u00A6\u12aa\u1295\u12eb\u122d\u12cb\u1295\u12f5\u129b\u00A6\u122b\u123d\u129b\u00A6\u120b\u12cd\u1235\u129b\u00A6\u134a\u1302\u129b\u00A6\u120a\u1295\u130b\u120b\u129b\u00A6\u134a\u1292\u123d\u00A6\u122e\u121b\u1292\u12eb\u1295\u00A6\u1229\u1295\u12f2\u129b\u00A6\u122e\u121b\u1295\u1235\u00A6\u1350\u122d\u1232\u12eb\u129b\u00A6\u120b\u1272\u1295\u129b\u00A6\u12de\u1233\u129b\u00A6\u1263\u1235\u12ad\u129b\u00A6\u12aa\u122d\u130a\u12dd\u129b\u00A6\u12a4\u1235\u1276\u1292\u12a0\u1295";

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
    { "currenciesDisplayName", currenciesDisplayName },
    { "currenciesSymbol", currenciesSymbol },
    { "shortMonths", shortMonths },
    { "months", months },
    { "shortWeekdays", shortWeekdays },
    { "weekdays", weekdays },
    { "eras", eras },
    { "ampms", ampms },
    { "territories", territories },
    { "languages", languages },
  };

  public Object[][] getContents() { return contents; }
}
