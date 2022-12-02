package pl.piomin.services.employee.mapper;

import java.util.Collection;
import java.util.stream.Collectors;

public abstract class AbstractMapper<T, S> implements IMapper<T, S> {
    @Override
    public Collection<T> mapOutCollection(Collection<S> collection) {
        return collection.stream().map(this::mapOut).collect(Collectors.toList());
    }

    @Override
    public Collection<S> mapInCollection(Collection<T> collection) {
        return collection.stream().map(this::mapIn).collect(Collectors.toList());
    }
}
