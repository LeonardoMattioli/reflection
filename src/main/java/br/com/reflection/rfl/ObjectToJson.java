package br.com.reflection.rfl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ObjectToJson {

    public String transform(Object obj) {
        String result = null;
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        Map<String, Object> mapper = new HashMap<>();
        Class<?>  classToBeTransformed = obj.getClass();

        Arrays.stream(classToBeTransformed.getDeclaredFields()).toList()
                .forEach(field -> {
                    field.setAccessible(true);
                    String key = field.getName();
                    Object value = null;
                    try {
                       value = field.get(obj);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                    mapper.put(key, value);
                });
        try {
            result = objectMapper.writeValueAsString(mapper);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
