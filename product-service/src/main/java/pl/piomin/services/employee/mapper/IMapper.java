package pl.piomin.services.employee.mapper;

import java.util.Collection;

public interface IMapper<T, S> {
    T mapOut(S s);

    S mapIn(T t);

    Collection<T> mapOutCollection(Collection<S> t);

    Collection<S> mapInCollection(Collection<T> s);
}
