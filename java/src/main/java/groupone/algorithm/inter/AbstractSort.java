package groupone.algorithm.inter;

import java.util.List;

/**
 * 泛型排序抽象类
 * @author yongze
 *
 * @param <T>
 */
public abstract class AbstractSort<T> {

	public abstract List<T> sort(List<T> param);
}
