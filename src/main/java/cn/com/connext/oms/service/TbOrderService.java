package cn.com.connext.oms.service;

import cn.com.connext.oms.entity.TbOrder;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * <p>Title: TbOrderService</p>
 * <p>Description: </p>
 *
 * @author caps
 * @version 1.0.0
 * @Date 2019/1/6 10:15
 */
public interface TbOrderService {
    /**
     * @Author: caps
     * @Description:
     * @Param: []
     * @Return: java.util.List<cn.com.connext.oms.entity.TbOrder>
     * @Create: 2019/1/6 10:14
     */
    List<TbOrder> getAllOrder(String orderState);

    /**
     * create by: yonyong
     * description: 根据订单id查询订单所有信息
     * create time: 2019/1/7 13:52
     *
     *  * @Param: id
     * @return cn.com.connext.oms.entity.TbOrder
     */
    List<TbOrder> getOrderByOrderId(int id);
}
