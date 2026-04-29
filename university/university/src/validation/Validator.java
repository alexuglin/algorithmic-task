package validation;

import java.util.Set;

public interface Validator<T> {

    Set<ErrorDTO> validate(T entity);
}
