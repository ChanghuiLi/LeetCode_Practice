package 大数据处理;

import static java.lang.annotation.RetentionPolicy.SOURCE;

import java.lang.annotation.Retention;

@Retention(SOURCE)

public @interface 两G内存在20亿整数找到最多 {
/*			int 是4字节。
 * 			4X20亿大于两G。HashMap《key，value》
 * 			Hash函数处理。Hash到16个桶里面，每个桶分别计算数量。最后求最大值。
 * 
 * 
 * 
 * 
 */

}
