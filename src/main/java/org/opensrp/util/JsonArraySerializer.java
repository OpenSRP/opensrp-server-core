package org.opensrp.util;

import java.io.IOException;

import org.json.JSONArray;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;

public class JsonArraySerializer extends StdScalarSerializer<JSONArray>  {
	
	private static final long serialVersionUID = -7318048190335430630L;

	public JsonArraySerializer() {
        super(JSONArray.class);
    }

    @Override
    public void serialize(JSONArray value, JsonGenerator gen, SerializerProvider provider) throws IOException, JsonGenerationException {
        gen.writeRawValue(value.toString());
    }
}
