package cn.senninha.sserver.lang.message;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Message {
	public short cmd() default 0;
}
