import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Point> points = new ArrayList<Point>();

        System.out.println("Hello World!");
        points = initPoints(points);
        int sum=0;

        //inside
//        Point testPoint = new Point(41.902480, 12.449343);
        //inside
//        Point testPoint = points.get(10);
        //out
//        Point testPoint = new Point(41.903351, 12.447359);
        //inside
        Point testPoint = new Point(41.902065, 12.446532);
        for(int i=0;i<points.size();i++){

            //Point b
            Point outsidePoint = new Point(0,0);
            //Point c
            Point point1 = points.get(i);
            //Point d
            Point point2 = (i+1==points.size()?points.get(0):points.get(i+1));
            if(intersect(testPoint, outsidePoint, point1, point2)){
                sum=sum+1;
            }
            }
        if ((sum % 2) == 0)
        {
            System.out.println("Sum is: "+sum+" - The point is outside");
        }
        else
        {
            System.out.println("Sum is: "+sum+" - The point is Inside");
        }

    }

    public static int orientation(Point p, Point q, Point r) {
        double val = (q.getY() - p.getY()) * (r.getX() - q.getX())
                - (q.getX() - p.getX()) * (r.getY() - q.getY());

        if (val == 0.0)
            return 0; // colinear
        return (val > 0) ? 1 : 2; // clock or counterclock wise
    }

    public static boolean intersect(Point p1, Point q1, Point p2, Point q2) {

        int o1 = orientation(p1, q1, p2);
        int o2 = orientation(p1, q1, q2);
        int o3 = orientation(p2, q2, p1);
        int o4 = orientation(p2, q2, q1);

        if (o1 != o2 && o3 != o4)
            return true;

        return false;
    }
    
    public static List<Point> initPoints(List<Point> points){
        points.add(new Point(41.9075508117676,12.4555501937867));
        points.add(new Point(41.9063911437988,12.4558086395264));
        points.add(new Point(41.9059219360352,12.4577512741089));
        points.add(new Point(41.9049911499024,12.4577398300171));
        points.add(new Point(41.9044418334962,12.4576902389526));
        points.add(new Point(41.9035606384278,12.457639694214));
        points.add(new Point(41.9033088684082,12.4576511383057));
        points.add(new Point(41.9032211303711,12.4578523635864));
        points.add(new Point(41.9030799865724,12.4580287933351));
        points.add(new Point(41.9029006958008,12.4582300186158));
        points.add(new Point(41.9027786254884,12.4583187103271));
        points.add(new Point(41.902500152588,12.4584188461304));
        points.add(new Point(41.9021911621095,12.4584512710572));
        points.add(new Point(41.902099609375,12.4584455490112));
        points.add(new Point(41.9020118713379,12.4584417343141));
        points.add(new Point(41.9018402099611,12.4584007263183));
        points.add(new Point(41.9015998840332,12.4582481384277));
        points.add(new Point(41.9013404846193,12.4579381942749));
        points.add(new Point(41.901222229004,12.4576511383057));
        points.add(new Point(41.9011802673341,12.4574909210206));
        points.add(new Point(41.9011688232422,12.4572324752807));
        points.add(new Point(41.901222229004,12.4569292068481));
        points.add(new Point(41.9013099670411,12.4566688537599));
        points.add(new Point(41.9014015197754,12.4565496444703));
        points.add(new Point(41.9014816284179,12.456428527832));
        points.add(new Point(41.9014091491699,12.4561014175415));
        points.add(new Point(41.901294708252,12.455701828003));
        points.add(new Point(41.9011001586913,12.455020904541));
        points.add(new Point(41.9009895324708,12.4543685913086));
        points.add(new Point(41.90092086792,12.4541301727295));
        points.add(new Point(41.9008407592774,12.4540586471558));
        points.add(new Point(41.9007301330567,12.4540662765503));
        points.add(new Point(41.9005012512208,12.4540796279908));
        points.add(new Point(41.9004020690919,12.4542102813721));
        points.add(new Point(41.9002799987793,12.4542207717897));
        points.add(new Point(41.9001617431641,12.4541587829591));
        points.add(new Point(41.9001121520996,12.4540586471558));
        points.add(new Point(41.9002113342286,12.4538593292237));
        points.add(new Point(41.900489807129,12.4528903961182));
        points.add(new Point(41.9003219604493,12.4528808593751));
        points.add(new Point(41.9003295898437,12.4527511596681));
        points.add(new Point(41.9005012512208,12.4512100219728));
        points.add(new Point(41.9005699157716,12.4506702423096));
        points.add(new Point(41.9007301330567,12.4505605697632));
        points.add(new Point(41.9008102416993,12.4502992630005));
        points.add(new Point(41.9008522033691,12.4498195648194));
        points.add(new Point(41.90092086792,12.4496307373047));
        points.add(new Point(41.9009590148927,12.4493799209594));
        points.add(new Point(41.9009895324708,12.4490909576417));
        points.add(new Point(41.9009819030763,12.4487600326538));
        points.add(new Point(41.9007987976075,12.44877243042));
        points.add(new Point(41.9007186889648,12.4482593536376));
        points.add(new Point(41.900691986084,12.4479007720947));
        points.add(new Point(41.9007606506349,12.4478101730347));
        points.add(new Point(41.9008789062501,12.4476804733278));
        points.add(new Point(41.9009590148927,12.4477891921997));
        points.add(new Point(41.9010391235353,12.4479103088378));
        points.add(new Point(41.9012603759767,12.4475908279419));
        points.add(new Point(41.9014701843262,12.4472494125366));
        points.add(new Point(41.9015998840332,12.4470100402832));
        points.add(new Point(41.9018402099611,12.4466285705566));
        points.add(new Point(41.901668548584,12.4464597702027));
        points.add(new Point(41.9018821716309,12.445969581604));
        points.add(new Point(41.9019889831543,12.4456081390381));
        points.add(new Point(41.9025115966797,12.4467697143555));
        points.add(new Point(41.9027252197266,12.4471940994263));
        points.add(new Point(41.9027709960939,12.4472808837891));
        points.add(new Point(41.9029502868652,12.4474201202393));
        points.add(new Point(41.9032211303711,12.4475288391113));
        points.add(new Point(41.9033699035645,12.4476108551026));
        points.add(new Point(41.9035110473633,12.447759628296));
        points.add(new Point(41.9036407470703,12.4479694366456));
        points.add(new Point(41.9038314819336,12.4482107162476));
        points.add(new Point(41.9039611816406,12.4484300613404));
        points.add(new Point(41.904109954834,12.4485616683959));
        points.add(new Point(41.9043121337892,12.4486484527588));
        points.add(new Point(41.9047698974609,12.4487485885621));
        points.add(new Point(41.9051399230958,12.4488401412963));
        points.add(new Point(41.9052200317383,12.4489898681641));
        points.add(new Point(41.905288696289,12.4492092132569));
        points.add(new Point(41.9053802490235,12.4494714736939));
        points.add(new Point(41.9056091308594,12.4497900009156));
        points.add(new Point(41.9058990478516,12.4500589370728));
        points.add(new Point(41.9062805175781,12.4502506256104));
        points.add(new Point(41.9065704345704,12.4503898620605));
        points.add(new Point(41.9066619873047,12.4513492584229));
        points.add(new Point(41.9066390991211,12.4518690109254));
        points.add(new Point(41.9066619873047,12.4520282745362));
        points.add(new Point(41.9068603515625,12.4527387619019));
        points.add(new Point(41.9069290161133,12.4530305862427));
        points.add(new Point(41.9067420959473,12.453179359436));
        points.add(new Point(41.9068794250489,12.4537992477416));
        points.add(new Point(41.9071121215821,12.4537696838379));
        points.add(new Point(41.9072113037109,12.4541912078858));
        points.add(new Point(41.9075508117676,12.4555501937867));
        return points;
    }
































































































}
