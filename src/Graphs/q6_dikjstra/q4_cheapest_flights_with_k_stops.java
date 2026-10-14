package Graphs.q6_dikjstra;

import java.util.*;

//https://leetcode.com/problems/cheapest-flights-within-k-stops/

public class q4_cheapest_flights_with_k_stops {
    class Solution1 {
        class Pair{
            int to, price;
            Pair(int to, int price){
                this.to=to;
                this.price=price;
            }
        }
        class Triplet implements Comparable<Triplet>{
            int node;
            int price;
            int stops;
            Triplet(int node, int price, int stops){
                this.node=node;
                this.price=price;
                this.stops=stops;
            }
            public int compareTo(Triplet t){  // sorting the heap on the basis of stops not cost see the notes
                return Integer.compare(this.stops, t.stops);
            }
        }
        public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

            // adjacency list
            List<List<Pair>> adj=new ArrayList<>();
            for(int i=0;i<n;i++)adj.add(new ArrayList<>());
            for(int i=0;i<flights.length;i++){
                int from=flights[i][0];
                int to=flights[i][1];
                int price=flights[i][2];
                adj.get(from).add(new Pair(to, price));
            }

            // dikjstra's algorithm
            PriorityQueue<Triplet> pq=new PriorityQueue<>();
            int[] ans=new int[n];
            Arrays.fill(ans,Integer.MAX_VALUE);
            ans[src]=0;
            pq.add(new Triplet(src,0,0));
            while(pq.size()>0){
                Triplet front=pq.remove();
                int node=front.node;
                int price=front.price;
                int stops=front.stops;

                if (stops > k) continue;
                for(Pair p:adj.get(node)){
                    int to=p.to;
                    int to_price=p.price;
                    int total_price=price+to_price;
                    if(ans[to]>total_price){
                        ans[to]=total_price;
                        pq.add(new Triplet(to,total_price,stops+1));
                    }
                }

            }
            return ans[dst] == Integer.MAX_VALUE ? -1 : ans[dst];
        }
    }


    //or directly you can use queue here 1st in 1st out
    class Solution2 {
        class Pair{
            int to, price;
            Pair(int to, int price){
                this.to=to;
                this.price=price;
            }
        }
        class Triplet{
            int node;
            int price;
            int stops;
            Triplet(int node, int price, int stops){
                this.node=node;
                this.price=price;
                this.stops=stops;
            }
        }
        public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

            // adjacency list
            List<List<Pair>> adj=new ArrayList<>();
            for(int i=0;i<n;i++)adj.add(new ArrayList<>());
            for(int i=0;i<flights.length;i++){
                int from=flights[i][0];
                int to=flights[i][1];
                int price=flights[i][2];
                adj.get(from).add(new Pair(to, price));
            }

            // dikjstra's algorithm
            Queue<Triplet> pq=new ArrayDeque<>();
            int[] ans=new int[n];
            Arrays.fill(ans,Integer.MAX_VALUE);
            ans[src]=0;
            pq.add(new Triplet(src,0,0));
            while(pq.size()>0){
                Triplet front=pq.remove();
                int node=front.node;
                int price=front.price;
                int stops=front.stops;

                if (stops > k) continue;
                for(Pair p:adj.get(node)){
                    int to=p.to;
                    int to_price=p.price;
                    int total_price=price+to_price;
                    if(ans[to]>total_price){
                        ans[to]=total_price;
                        pq.add(new Triplet(to,total_price,stops+1));
                    }
                }

            }
            return ans[dst] == Integer.MAX_VALUE ? -1 : ans[dst];
        }
    }
}
