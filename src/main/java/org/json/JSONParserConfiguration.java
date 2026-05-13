/*
 * Decompiled with CFR 0.152.
 */
package org.json;

import org.json.ParserConfiguration;

public class JSONParserConfiguration
extends ParserConfiguration {
    @Override
    protected JSONParserConfiguration clone() {
        return new JSONParserConfiguration();
    }

    public JSONParserConfiguration withMaxNestingDepth(int n) {
        return (JSONParserConfiguration)super.withMaxNestingDepth(n);
    }
}

