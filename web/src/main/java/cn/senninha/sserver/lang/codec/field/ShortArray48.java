package cn.senninha.sserver.lang.codec.field;

import java.util.Arrays;

/**
 * 为48个时间段准备的
 * Coded by senninha on 18-1-27
 */
public class ShortArray48{
    private short[] container;

    public short[] getContainer() {
        return container;
    }

    public void setContainer(short[] container) {
        this.container = container;
    }

    @Override
    public String toString() {
        return "ShortArray48{" +
                "container=" + Arrays.toString(container) +
                '}';
    }
}
