package cn.jxau.commontest.loadbalance.impl;

import cn.jxau.commontest.loadbalance.IpPort;
import cn.jxau.commontest.loadbalance.LoadBalance;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author l
 * @create 2020-10-04-23:16
 */
public abstract class AbstractLoadBalance implements LoadBalance {
    protected abstract IpPort doSelect(List<IpPort> ipPorts, String key);

    @Override
    public IpPort select(final List<IpPort> ipPorts, final String key) {
        if (CollectionUtils.isEmpty(ipPorts)) {
            return null;
        }
        if (ipPorts.size() == 1) {
            return ipPorts.get(0);
        }
        return doSelect(ipPorts, key);
    }
}
