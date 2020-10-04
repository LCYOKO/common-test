package cn.jxau.commontest.loadbalance;

import java.util.List;

/**
 * @author l
 * @create 2020-10-04-23:12
 */
public interface LoadBalance {

    IpPort select(List<IpPort> upstreamList, String ip);
}
