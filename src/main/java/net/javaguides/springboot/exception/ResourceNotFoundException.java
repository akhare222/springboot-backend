package net.javaguides.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    private String reseourceName;
    private String fieldName;
    private Object fieldValue;

    public ResourceNotFoundException(String reseourceName, String fieldName, Object fieldValue) {
        super(String.format("%s not found with %s : %s", reseourceName, fieldName, fieldValue));
        this.reseourceName = reseourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public String getReseourceName() {
        return reseourceName;
    }

    public void setReseourceName(String reseourceName) {
        this.reseourceName = reseourceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Object getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(Object fieldValue) {
        this.fieldValue = fieldValue;
    }
}
