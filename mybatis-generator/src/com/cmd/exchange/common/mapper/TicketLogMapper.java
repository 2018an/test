package com.cmd.exchange.common.mapper;

import com.cmd.exchange.common.model.TicketLog;
import com.cmd.exchange.common.model.TicketLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TicketLogMapper {
    int countByExample(TicketLogExample example);

    int deleteByExample(TicketLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TicketLog record);

    int insertSelective(TicketLog record);

    List<TicketLog> selectByExample(TicketLogExample example);

    TicketLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TicketLog record, @Param("example") TicketLogExample example);

    int updateByExample(@Param("record") TicketLog record, @Param("example") TicketLogExample example);

    int updateByPrimaryKeySelective(TicketLog record);

    int updateByPrimaryKey(TicketLog record);
}