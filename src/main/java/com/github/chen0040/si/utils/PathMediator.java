package com.github.chen0040.si.utils;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by xschen on 12/6/2017.
 */
@Getter
@Setter
public class PathMediator implements Serializable {

   private static final long serialVersionUID = -5639247782783775456L;
   private PathCostFunction costFunction;
   private RandomGenerator randomGenerator = new RandomGeneratorImpl();
   public double evaluate(List<Integer> path) {
      return costFunction.evaluate(path);
   }


   public double nextDouble() {
      return randomGenerator.nextDouble();
   }


   public double heuristicValue(int state1, int state2) {
      return costFunction.stateTransitionWeight(state1, state2);
   }


   public List<Integer> getCandidateNextStates(List<Integer> path) {
      return new ArrayList<>();
   }


   public double getReward(List<Integer> path, double cost) {
      return costFunction.getReward(path, cost);
   }
}
