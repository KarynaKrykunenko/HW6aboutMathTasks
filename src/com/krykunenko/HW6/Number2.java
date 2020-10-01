package com.krykunenko.HW6;

public class Number2 {
    public static void main(String[] args) {
        class Point {
            int x;
            int y;

            Point(int X, int Y) {
                x = X;
                y = Y;
            }

            public double getDistance() { // мы вычислили расстояние между двумя точками
                return Math.sqrt(x * x + y * y);
            }

            public void Move(int dx, int dy) {
                x += dx;
                y += dy;
            }

            public void main(String[] args) {
                Point p = new Point(2, 5);
                System.out.println("Начальные координаты точки");
                double len = p.getDistance(); // мы вычисляем расстояние от начала координат
                System.out.print("расстояние от начала координат= " + len);
                p.Move(5, 5); //перемещаем точку на dx= 5,dy =5
                System.out.println("Координаты после перемещения");
                len = p.getDistance();
                System.out.println("расстояние от начала координат= "+len);
            }


        }
        }
    }



