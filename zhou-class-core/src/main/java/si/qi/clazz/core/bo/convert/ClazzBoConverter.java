package si.qi.clazz.core.bo.convert;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import si.qi.clazz.core.bo.ClazzBO;
import si.qi.clazz.domain.db.model.ClazzDO;

import java.util.List;

/**
 * @author: guoping
 * @date: 2021/2/21
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ClazzBoConverter {

    ClazzBoConverter INSTANCE = Mappers.getMapper(ClazzBoConverter.class);

    ClazzBO cvt2Bo(ClazzDO clazzDO);
    List<ClazzBO> cvt2BoList(List<ClazzDO> userInfos);

    ClazzDO cvt2Do(ClazzBO clazzBO);
}
