package si.qi.clazz.core.bo.convert;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import si.qi.clazz.core.bo.UserInfoBO;
import si.qi.clazz.domain.db.model.UserInfoDO;

import java.util.List;

/**
 * @description:
 * @author: guoping
 * @date: 2021/2/21
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserInfoBoConverter {

    UserInfoBoConverter INSTANCE = Mappers.getMapper(UserInfoBoConverter.class);

    UserInfoBO cvt2Bo(UserInfoDO userInfoDO);
    List<UserInfoBO> cvt2BoList(List<UserInfoDO> userInfos);

    UserInfoDO cvt2Do(UserInfoBO userInfoBO);
}
