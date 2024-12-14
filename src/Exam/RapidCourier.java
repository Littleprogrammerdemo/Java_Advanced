package Exam;

import java.util.*;
import java.util.stream.Collectors;
public class RapidCourier {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            List<Integer> packages = Arrays.stream(scanner.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            LinkedList<Integer> couriers = Arrays.stream(scanner.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toCollection(LinkedList::new));

            int totalDeliveredWeight = 0;

            while (!packages.isEmpty() && !couriers.isEmpty()) {
                int packageWeight = packages.get(packages.size() - 1);
                int courierCapacity = couriers.poll();

                if (courierCapacity >= packageWeight) {
                    totalDeliveredWeight += packageWeight;
                    packages.remove(packages.size() - 1);

                    int remainingCapacity = courierCapacity - 2 * packageWeight;
                    if (remainingCapacity > 0) {
                        couriers.add(remainingCapacity);
                    }
                } else {

                    totalDeliveredWeight += courierCapacity;
                    packageWeight -= courierCapacity;

                    packages.set(packages.size() - 1, packageWeight);
                }
            }

            System.out.println("Total weight: " + totalDeliveredWeight + " kg");

            if (packages.isEmpty() && couriers.isEmpty()) {
                System.out.println("Congratulations, all packages were delivered successfully by the couriers today.");
            } else if (!packages.isEmpty() && couriers.isEmpty()) {
                System.out.print("Unfortunately, there are no more available couriers to deliver the following packages: ");
                System.out.println(packages.stream().map(String::valueOf).collect(Collectors.joining(", ")));
            } else if (packages.isEmpty() && !couriers.isEmpty()) {
                System.out.print("Couriers are still on duty: ");
                System.out.println(couriers.stream().map(String::valueOf).collect(Collectors.joining(", ")) + " but there are no more packages to deliver.");
            }
        }
    }