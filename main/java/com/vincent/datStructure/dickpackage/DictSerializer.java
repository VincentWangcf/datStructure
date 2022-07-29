package com.vincent.datStructure.dickpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.util.Objects;

public class DictSerializer extends StdSerializer<Object> implements ContextualSerializer {

    /** 字典注解 */
    private Dict dict;

    public DictSerializer() {
        super(Object.class);
    }
    public DictSerializer(Dict dict) {
        super(Object.class);
        this.dict = dict;
    }
    private String type;

    @Override
    public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        if (Objects.isNull(value)) {
            gen.writeObject(value);
            return;
        }
        if (Objects.nonNull(dict)){
            type = dict.type();
        }

        // 通过数据字典类型和value获取name
        String label = DictEnum.changeLabel(type, value.toString());

        gen.writeObject(value);
        gen.writeFieldName(gen.getOutputContext().getCurrentName()+"Name");
        gen.writeObject(label);
    }

    @Override
    public JsonSerializer<?> createContextual(SerializerProvider prov, BeanProperty beanProperty) throws JsonMappingException {
        if (Objects.isNull(beanProperty)){
            return prov.findValueSerializer(beanProperty.getType(), beanProperty);
        }
        Dict dict = beanProperty.getAnnotation(Dict.class);
        if (Objects.nonNull(dict)){
            type = dict.type();
            return this;
        }

        return prov.findNullValueSerializer(null);
    }
}




