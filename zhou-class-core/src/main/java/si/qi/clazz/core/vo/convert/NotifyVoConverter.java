package si.qi.clazz.core.vo.convert;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import si.qi.clazz.core.bo.ClazzBO;
import si.qi.clazz.core.bo.NotifyBO;
import si.qi.clazz.core.vo.ClazzVO;
import si.qi.clazz.core.vo.NotifyVO;

import java.util.List;

/**
 * @description:
 * @author: guoping
 * @date: 2021/2/21
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface NotifyVoConverter {

    NotifyVoConverter INSTANCE = Mappers.getMapper(NotifyVoConverter.class);

    NotifyVO cvt2Vo(NotifyBO notifyBO);
    List<NotifyVO> cvt2VoList(List<NotifyBO> notifyBOList);
}
