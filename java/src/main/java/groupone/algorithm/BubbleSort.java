package groupone.algorithm;

import java.util.List;

import groupone.algorithm.inter.AbstractSort;

@SuppressWarnings("rawtypes")
public class BubbleSort<T extends Comparable> extends AbstractSort<T>{

	@SuppressWarnings("unchecked")
	@Override
	public List<T> sort(List<T> param) {
		// TODO Auto-generated method stub
		int flag;
		T temp;
		for(int i=0;i<param.size()-1;i++){
			flag=0;
			for(int j=0;j<param.size()-2;j++){
				if(param.get(j).compareTo(param.get(j+1))>0){
					temp=param.get(j);
					param.set(j, param.get(j+1));
					param.set(j+1, temp);
					flag=1;
				}
			}
			if(flag==0) break;
		}
		return param;
	}

	
	
}
