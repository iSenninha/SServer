package cn.senninha.sserver.lang.codec.impl;

import cn.senninha.sserver.lang.codec.ClassType;
import cn.senninha.sserver.lang.codec.Codec;
import cn.senninha.sserver.lang.codec.field.Field32Bytes;
import cn.senninha.sserver.lang.codec.field.ShortArray48;

import java.lang.reflect.Field;
import java.nio.ByteBuffer;

/**
 * 转为48个时间段弄的解码。。
 * Coded by senninha on 18-1-27
 */
@ClassType(clazz = ShortArray48.class)
public class ShortArray48Codec implements Codec{

    @Override
    public void decode(ByteBuffer buf, Object m, Field f) {
        try {
            ShortArray48 b = new ShortArray48();
            short[] s = new short[64];
            for(int i = 0 ; i < 48 ; i++) {
                s[i] = buf.getShort();
            }
            b.setContainer(s);
            f.setAccessible(true);
            f.set(m, b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void encode(ByteBuffer buf, Object m, Field f) {
        //TODO 编码就不用了吧。。
    }
}
