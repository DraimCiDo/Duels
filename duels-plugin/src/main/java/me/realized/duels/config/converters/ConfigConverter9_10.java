package me.realized.duels.config.converters;

import me.realized.duels.util.config.convert.Converter;

import java.util.HashMap;
import java.util.Map;

public class ConfigConverter9_10 implements Converter {

    @Override
    public Map<String, String> renamedKeys() {
        final Map<String, String> keys = new HashMap<>();
        keys.put("duel.use-own-inventory.enabled", "request.use-own-inventory.enabled");
        return keys;
    }
}
