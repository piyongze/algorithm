package groupone.algorithm.inter;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import groupone.algorithm.BubbleSort;

import org.junit.Before;
import org.junit.Test;
@SuppressWarnings("rawtypes")
public class AbstractSortTest {

	
	private AbstractSort abstractSort;
	private List<Integer> param;
	private List<Integer> resu;
	@Before
	public void setUp() throws Exception {
		abstractSort=new BubbleSort<Integer>();
		param=new ArrayList<Integer>();
		param.add(1);
		param.add(5);
		param.add(2);
		param.add(3);
		param.add(6);
		resu=new ArrayList<Integer>();
		resu.add(1);
		resu.add(2);
		resu.add(3);
		resu.add(5);
		resu.add(6);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void test() {
		List<Integer> res=abstractSort.sort(param);
		assertArrayEquals(resu.toArray(), res.toArray());
	}

}
