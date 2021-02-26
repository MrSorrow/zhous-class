package si.qi.clazz.core.bo.convert;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import si.qi.clazz.core.bo.ClazzBO;
import si.qi.clazz.core.bo.NotifyBO;
import si.qi.clazz.domain.db.model.ClazzDO;
import si.qi.clazz.domain.db.model.NotifyDO;

import java.util.List;

/**
 * @author: guoping
 * @date: 2021/2/21
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface NotifyBoConverter {

    NotifyBoConverter INSTANCE = Mappers.getMapper(NotifyBoConverter.class);

    NotifyBO cvt2Bo(NotifyDO notifyDO);
    List<NotifyBO> cvt2BoList(List<NotifyDO> notifies);

    NotifyDO cvt2Do(NotifyBO clazzBO);
}
