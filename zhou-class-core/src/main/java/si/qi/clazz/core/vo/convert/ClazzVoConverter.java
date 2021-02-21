package si.qi.clazz.core.vo.convert;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import si.qi.clazz.core.bo.ClazzBO;
import si.qi.clazz.core.bo.UserInfoBO;
import si.qi.clazz.core.vo.ClazzVO;
import si.qi.clazz.core.vo.UserInfoVO;

import java.util.List;

/**
 * @description:
 * @author: guoping
 * @date: 2021/2/21
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ClazzVoConverter {

    ClazzVoConverter INSTANCE = Mappers.getMapper(ClazzVoConverter.class);

    ClazzVO cvt2Vo(ClazzBO clazzBO);
    List<ClazzVO> cvt2VoList(List<ClazzBO> clazzBOList);
}
