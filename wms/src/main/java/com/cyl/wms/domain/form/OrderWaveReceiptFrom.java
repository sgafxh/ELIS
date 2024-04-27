package com.cyl.wms.domain.form;

import com.cyl.wms.domain.vo.ItemVO;
import com.cyl.wms.domain.vo.ReceiptOrderDetailVO;
import com.cyl.wms.domain.vo.WaveVO;
import lombok.Data;

import java.util.List;

/**
 * 波次 数据视图对象
 *
 * @author zhangcheng
 */
@Data
public class OrderWaveReceiptFrom extends WaveVO {
  // 出库单详情
  private List<ReceiptOrderDetailVO> details;
  private List<ReceiptOrderDetailVO> allocationDetails;
  // 所有商品
  private List<ItemVO> items;
}
