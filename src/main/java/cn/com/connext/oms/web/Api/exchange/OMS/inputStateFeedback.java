package cn.com.connext.oms.web.Api.exchange.OMS;

import cn.com.connext.oms.commons.dto.BaseResult;
import cn.com.connext.oms.commons.dto.exchange.OMS.InputFeedback;
import cn.com.connext.oms.service.TbExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @created with IDEA
 * @author: yonyong
 * @version: 1.0.0
 * @date: 2019/1/8
 * @time: 21:24
 **/

@RestController("/Api")
public class inputStateFeedback {
    @Autowired
    private TbExchangeService tbExchangeService;

    /**
     * create by: yonyong
     * description: TODO
     * create time: 2019/1/8 01:03
     *
     *  * @Param: inputFeedback
     * @return cn.com.connext.oms.commons.dto.BaseResult
     */
    @RequestMapping("/getExchangeInputFeedback")
    public BaseResult getExchangeInputFeedback(@RequestParam("inputFeedback")InputFeedback inputFeedback){

        int rs=tbExchangeService.generateOutput(inputFeedback);
        if (0 == rs){
            return BaseResult.success("操作成功！已生成新的出库单！");
        }
        else if (1 == rs){
            return BaseResult.fail("操作错误或服务器内部错误！");
        }
        else if (2 == rs){
            return BaseResult.success("收货失败!");
        }
        else {
            return BaseResult.success("超15天未收货!");
        }

    }
}
