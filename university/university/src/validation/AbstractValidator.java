package validation;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

public abstract class AbstractValidator<T> implements Validator<T> {

    @Override
    public Set<ErrorDTO> validate(T entity) {
        Set<ErrorDTO> errors = new HashSet<>();
        if (entity != null) {
            Field[] fields = entity.getClass().getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                if (isAnnotationPresent(field) && isTypeObject(field)) {
                    try {
                        errors.addAll(validateEntity(entity, field));
                    } catch (IllegalAccessException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
        return errors;
    }

    protected abstract boolean isAnnotationPresent(Field field);

    protected abstract boolean isTypeObject(Field field);

    public abstract Set<ErrorDTO> validateEntity(T entity, Field field) throws IllegalAccessException;
}
