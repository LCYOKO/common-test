package cn.jxau.commontest.loadbalance;

import lombok.Data;

/**
 * @author l
 * @create 2020-10-04-23:15
 */
@Data
public class IpPort {
    private String ip;
    private int port;
    private int weight;
}
