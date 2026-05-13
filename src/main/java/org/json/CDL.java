/*
 * Decompiled with CFR 0.152.
 */
package org.json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class CDL {
    private static String getValue(JSONTokener jSONTokener, char c) throws JSONException {
        char c2;
        while ((c2 = jSONTokener.next()) == ' ' || c2 == '\t') {
        }
        if (c2 == '\u0000') {
            return null;
        }
        if (c2 == '\"' || c2 == '\'') {
            char c3 = c2;
            StringBuilder stringBuilder = new StringBuilder();
            while (true) {
                char c4;
                if ((c2 = jSONTokener.next()) == c3 && (c4 = jSONTokener.next()) != '\"') {
                    if (c4 <= '\u0000') break;
                    jSONTokener.back();
                    break;
                }
                if (c2 == '\u0000' || c2 == '\n' || c2 == '\r') {
                    throw jSONTokener.syntaxError("Missing close quote '" + c3 + "'.");
                }
                stringBuilder.append(c2);
            }
            return stringBuilder.toString();
        }
        if (c2 == c) {
            jSONTokener.back();
            return "";
        }
        jSONTokener.back();
        return jSONTokener.nextTo(c);
    }

    public static JSONArray rowToJSONArray(JSONTokener jSONTokener) throws JSONException {
        return CDL.rowToJSONArray(jSONTokener, ',');
    }

    public static JSONArray rowToJSONArray(JSONTokener jSONTokener, char c) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        block0: while (true) {
            String string = CDL.getValue(jSONTokener, c);
            char c2 = jSONTokener.next();
            if (string == null || jSONArray.length() == 0 && string.length() == 0 && c2 != c) {
                return null;
            }
            jSONArray.put(string);
            while (true) {
                if (c2 == c) continue block0;
                if (c2 != ' ') {
                    if (c2 == '\n' || c2 == '\r' || c2 == '\u0000') {
                        return jSONArray;
                    }
                    throw jSONTokener.syntaxError("Bad character '" + c2 + "' (" + c2 + ").");
                }
                c2 = jSONTokener.next();
            }
            break;
        }
    }

    public static JSONObject rowToJSONObject(JSONArray jSONArray, JSONTokener jSONTokener) throws JSONException {
        return CDL.rowToJSONObject(jSONArray, jSONTokener, ',');
    }

    public static JSONObject rowToJSONObject(JSONArray jSONArray, JSONTokener jSONTokener, char c) throws JSONException {
        JSONArray jSONArray2 = CDL.rowToJSONArray(jSONTokener, c);
        return jSONArray2 != null ? jSONArray2.toJSONObject(jSONArray) : null;
    }

    public static String rowToString(JSONArray jSONArray) {
        return CDL.rowToString(jSONArray, ',');
    }

    public static String rowToString(JSONArray jSONArray, char c) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < jSONArray.length(); ++i) {
            Object object;
            if (i > 0) {
                stringBuilder.append(c);
            }
            if ((object = jSONArray.opt(i)) == null) continue;
            String string = object.toString();
            if (string.length() > 0 && (string.indexOf(c) >= 0 || string.indexOf(10) >= 0 || string.indexOf(13) >= 0 || string.indexOf(0) >= 0 || string.charAt(0) == '\"')) {
                stringBuilder.append('\"');
                int n = string.length();
                for (int j = 0; j < n; ++j) {
                    char c2 = string.charAt(j);
                    if (c2 < ' ' || c2 == '\"') continue;
                    stringBuilder.append(c2);
                }
                stringBuilder.append('\"');
                continue;
            }
            stringBuilder.append(string);
        }
        stringBuilder.append('\n');
        return stringBuilder.toString();
    }

    public static JSONArray toJSONArray(String string) throws JSONException {
        return CDL.toJSONArray(string, ',');
    }

    public static JSONArray toJSONArray(String string, char c) throws JSONException {
        return CDL.toJSONArray(new JSONTokener(string), c);
    }

    public static JSONArray toJSONArray(JSONTokener jSONTokener) throws JSONException {
        return CDL.toJSONArray(jSONTokener, ',');
    }

    public static JSONArray toJSONArray(JSONTokener jSONTokener, char c) throws JSONException {
        return CDL.toJSONArray(CDL.rowToJSONArray(jSONTokener, c), jSONTokener, c);
    }

    public static JSONArray toJSONArray(JSONArray jSONArray, String string) throws JSONException {
        return CDL.toJSONArray(jSONArray, string, ',');
    }

    public static JSONArray toJSONArray(JSONArray jSONArray, String string, char c) throws JSONException {
        return CDL.toJSONArray(jSONArray, new JSONTokener(string), c);
    }

    public static JSONArray toJSONArray(JSONArray jSONArray, JSONTokener jSONTokener) throws JSONException {
        return CDL.toJSONArray(jSONArray, jSONTokener, ',');
    }

    public static JSONArray toJSONArray(JSONArray jSONArray, JSONTokener jSONTokener, char c) throws JSONException {
        JSONObject jSONObject;
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        while ((jSONObject = CDL.rowToJSONObject(jSONArray, jSONTokener, c)) != null) {
            jSONArray2.put(jSONObject);
        }
        if (jSONArray2.length() == 0) {
            return null;
        }
        return jSONArray2;
    }

    public static String toString(JSONArray jSONArray) throws JSONException {
        return CDL.toString(jSONArray, ',');
    }

    public static String toString(JSONArray jSONArray, char c) throws JSONException {
        JSONArray jSONArray2;
        JSONObject jSONObject = jSONArray.optJSONObject(0);
        if (jSONObject != null && (jSONArray2 = jSONObject.names()) != null) {
            return CDL.rowToString(jSONArray2, c) + CDL.toString(jSONArray2, jSONArray, c);
        }
        return null;
    }

    public static String toString(JSONArray jSONArray, JSONArray jSONArray2) throws JSONException {
        return CDL.toString(jSONArray, jSONArray2, ',');
    }

    public static String toString(JSONArray jSONArray, JSONArray jSONArray2, char c) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < jSONArray2.length(); ++i) {
            JSONObject jSONObject = jSONArray2.optJSONObject(i);
            if (jSONObject == null) continue;
            stringBuilder.append(CDL.rowToString(jSONObject.toJSONArray(jSONArray), c));
        }
        return stringBuilder.toString();
    }
}

