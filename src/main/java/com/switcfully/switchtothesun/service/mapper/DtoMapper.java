package com.switcfully.switchtothesun.service.mapper;

import java.sql.SQLException;

public interface DtoMapper <T1, T2>{
    T2 map(T1 entity) throws SQLException;
}
