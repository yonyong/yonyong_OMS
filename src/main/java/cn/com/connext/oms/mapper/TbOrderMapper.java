package cn.com.connext.oms.mapper;

import cn.com.connext.oms.entity.TbOrder;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.MyMapper;

import java.util.List;

@Repository
public interface TbOrderMapper extends MyMapper<TbOrder> {
    /**
    * @Author: caps
    * @Description:
    * @Param: []
    * @Return: java.util.List<cn.com.connext.oms.entity.TbOrder>
    * @Create: 2019/1/6 10:14
    */
    List<TbOrder> getAllOrder(@Param("orderState") String orderState);
    List<TbOrder> getAllOrder();

    /**
     * create by: yonyong
     * description: 根据订单id查询订单所有信息
     * create time: 2019/1/7 13:52
     *
     *  * @Param: id
     * @return cn.com.connext.oms.entity.TbOrder
     */
    List<TbOrder> getOrderByOrderId(@Param("id")int id);
}