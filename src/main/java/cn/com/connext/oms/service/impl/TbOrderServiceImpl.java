package cn.com.connext.oms.service.impl;

import cn.com.connext.oms.commons.utils.CodeGenerateUtils;
import cn.com.connext.oms.entity.TbGoods;
import cn.com.connext.oms.entity.TbOrder;
import cn.com.connext.oms.entity.TbReturn;
import cn.com.connext.oms.mapper.TbOrderMapper;
import cn.com.connext.oms.service.TbOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * <p>Title: TbOrderService</p>
 * <p>Description: </p>
 *
 * @author caps
 * @version 1.0.0
 * @Date 2019/1/6 10:15
 */
@Transactional(readOnly = true)
@Service
public class TbOrderServiceImpl implements TbOrderService {

    @Autowired
    private TbOrderMapper tbOrderMapper;
    /**
    * @Author: caps
    * @Description: 获取所有订单
    * @Param: []
    * @Return: java.util.List<cn.com.connext.oms.entity.TbOrder>
    * @Create: 2019/1/6 10:16
    */
    @Override
    public List<TbOrder> getAllOrder(String orderState) {
        return tbOrderMapper.getAllOrder(orderState);
    }

    /**
     * create by: yonyong
     * description: TODO
     * create time: 2019/1/7 13:53
     *
     *  * @Param: id
     * @return cn.com.connext.oms.entity.TbOrder
     */
    @Override
    public List<TbOrder> getOrderByOrderId(int id) {

//        TbOrder tbOrder = tbOrderMapper.selectByPrimaryKey(id);
        List<TbOrder> tbOrders=tbOrderMapper.getOrderByOrderId(id);
        if (tbOrders.get(0).getOrderState().equals("已完成")){
            return tbOrderMapper.getOrderByOrderId(id);
        }
        else {
            return null;
        }
    }

}
