package validation;

import annotation.Size;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

public class SizeValidator<T> extends AbstractValidator<T>{
    @Override
    protected boolean isAnnotationPresent(Field field) {
        return field.isAnnotationPresent(Size.class);
    }

    @Override
    protected boolean isTypeObject(Field field) {
        return field.getType().equals(String.class);
    }

    @Override
    public Set<ErrorDTO> validateEntity(T entity,Field field) throws IllegalAccessException {
        String value = (String) field.get(entity);
        Set<ErrorDTO> errors = new HashSet<>();
        if (value == null
                || (value.length() < field.getAnnotation(Size.class).min())
                || value.length() > field.getAnnotation(Size.class).max()) {
            errors.add(new ErrorDTO(String.format("Поле %s имеет недопустимый размер", field.getName())));
        }
        return errors;
    }
}
