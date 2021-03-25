package si.qi.clazz.core.bo.convert;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
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

    @Mappings({
            @Mapping(target = "roles", expression = "java(cn.hutool.json.JSONUtil.toList(userInfoDO.getRoles(), Integer.TYPE))"),
            @Mapping(target = "classes", expression = "java(cn.hutool.json.JSONUtil.toList(userInfoDO.getClasses(), Integer.TYPE))"),
    })
    UserInfoBO cvt2Bo(UserInfoDO userInfoDO);
    List<UserInfoBO> cvt2BoList(List<UserInfoDO> userInfos);

    @Mappings({
            @Mapping(target = "roles", expression = "java(cn.hutool.json.JSONUtil.toJsonStr(userInfoBO.getRoles()))"),
            @Mapping(target = "classes", expression = "java(cn.hutool.json.JSONUtil.toJsonStr(userInfoBO.getClasses()))"),
    })
    UserInfoDO cvt2Do(UserInfoBO userInfoBO);
}
