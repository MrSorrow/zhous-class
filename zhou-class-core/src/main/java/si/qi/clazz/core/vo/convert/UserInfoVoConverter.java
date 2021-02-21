package si.qi.clazz.core.vo.convert;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import si.qi.clazz.core.bo.UserInfoBO;
import si.qi.clazz.core.vo.UserInfoVO;

import java.util.List;

/**
 * @description:
 * @author: guoping
 * @date: 2021/2/21
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserInfoVoConverter {

    UserInfoVoConverter INSTANCE = Mappers.getMapper(UserInfoVoConverter.class);

    UserInfoVO cvt2Vo(UserInfoBO userInfoBO);
    List<UserInfoVO> cvt2VoList(List<UserInfoBO> userInfos);
}
